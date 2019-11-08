package com.jeecg.bsbudetails.controller;
import com.jeecg.bsbudetails.entity.BsBuDetailsEntity;
import com.jeecg.bsbudetails.service.BsBuDetailsServiceI;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.apache.commons.collections.CollectionUtils;
import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.common.TreeChildCount;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.superquery.util.SuperQueryUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.hibernate.criterion.Restrictions;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.core.util.ExceptionUtil;

/**   
 * @Title: Controller  
 * @Description: 核算
 * @author onlineGenerator
 * @date 2019-11-06 14:57:31
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/bsBuDetailsController")
public class BsBuDetailsController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(BsBuDetailsController.class);

	@Autowired
	private BsBuDetailsServiceI bsBuDetailsService;
	@Autowired
	private SystemService systemService;
	


	/**
	 * 核算列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/bsbudetails/bsBuDetailsList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(BsBuDetailsEntity bsBuDetails,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(BsBuDetailsEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, bsBuDetails, request.getParameterMap());
		try{
		//自定义追加查询条件
			String sql = SuperQueryUtil.getComplxSuperQuerySQL(request);
            if(oConvertUtils.isNotEmpty(sql)) {
                cq.add(Restrictions.sqlRestriction(" id in ("+sql+")"));
            }
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.bsBuDetailsService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除核算
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(BsBuDetailsEntity bsBuDetails, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		bsBuDetails = systemService.getEntity(BsBuDetailsEntity.class, bsBuDetails.getId());
		message = "核算删除成功";
		try{
			bsBuDetailsService.delete(bsBuDetails);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "核算删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除核算
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "核算删除成功";
		try{
			for(String id:ids.split(",")){
				BsBuDetailsEntity bsBuDetails = systemService.getEntity(BsBuDetailsEntity.class, 
				id
				);
				bsBuDetailsService.delete(bsBuDetails);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "核算删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加核算
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(BsBuDetailsEntity bsBuDetails, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "核算添加成功";
		try{
			bsBuDetailsService.save(bsBuDetails);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "核算添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 保存新增/更新的行数据
	 * @param page
	 * @return
	 */
	@RequestMapping(params = "saveRows")
	@ResponseBody
	public AjaxJson saveRows(BsBuDetailsEntity page){
		String message = null;
		List<BsBuDetailsEntity> bsBuDetailsList=page.getBsBuDetailsList();
		AjaxJson j = new AjaxJson();
		if(CollectionUtils.isNotEmpty(bsBuDetailsList)){
			for(BsBuDetailsEntity bsBuDetails:bsBuDetailsList){
				if (StringUtil.isNotEmpty(bsBuDetails.getId())) {
					BsBuDetailsEntity t =bsBuDetailsService.get(BsBuDetailsEntity.class, bsBuDetails.getId());
					try {
						message = "BsBuDetails例子更新成功";
						MyBeanUtils.copyBeanNotNull2Bean(bsBuDetails, t);
						bsBuDetailsService.saveOrUpdate(t);
						systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					try {
						message = "BsBuDetails例子添加成功";
						//jeecgDemo.setStatus("0");
						bsBuDetailsService.save(bsBuDetails);
						systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		}
		return j;
	}
	
	/**
	 * 更新核算
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(BsBuDetailsEntity bsBuDetails, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "核算更新成功";
		BsBuDetailsEntity t = bsBuDetailsService.get(BsBuDetailsEntity.class, bsBuDetails.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(bsBuDetails, t);
			bsBuDetailsService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "核算更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 核算新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(BsBuDetailsEntity bsBuDetails, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(bsBuDetails.getId())) {
			bsBuDetails = bsBuDetailsService.getEntity(BsBuDetailsEntity.class, bsBuDetails.getId());
			req.setAttribute("bsBuDetailsPage", bsBuDetails);
		}
		return new ModelAndView("com/jeecg/bsbudetails/bsBuDetails-add");
	}
	/**
	 * 核算编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(BsBuDetailsEntity bsBuDetails, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(bsBuDetails.getId())) {
			bsBuDetails = bsBuDetailsService.getEntity(BsBuDetailsEntity.class, bsBuDetails.getId());
			req.setAttribute("bsBuDetailsPage", bsBuDetails);
		}
		return new ModelAndView("com/jeecg/bsbudetails/bsBuDetails-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","bsBuDetailsController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(BsBuDetailsEntity bsBuDetails,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(BsBuDetailsEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, bsBuDetails, request.getParameterMap());
		List<BsBuDetailsEntity> bsBuDetailss = this.bsBuDetailsService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"核算");
		modelMap.put(NormalExcelConstants.CLASS,BsBuDetailsEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("核算列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,bsBuDetailss);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(BsBuDetailsEntity bsBuDetails,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"核算");
    	modelMap.put(NormalExcelConstants.CLASS,BsBuDetailsEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("核算列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<BsBuDetailsEntity> listBsBuDetailsEntitys = ExcelImportUtil.importExcel(file.getInputStream(),BsBuDetailsEntity.class,params);
				for (BsBuDetailsEntity bsBuDetails : listBsBuDetailsEntitys) {
					bsBuDetailsService.save(bsBuDetails);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(e.getMessage());
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	
}
