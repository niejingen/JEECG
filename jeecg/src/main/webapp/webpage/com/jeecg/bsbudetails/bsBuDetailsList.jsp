<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker,autocomplete"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="bsBuDetailsrowList" checkbox="true" complexSuperQuery="compose"  pagination="true" fitColumns="true" sortName="createDate"  title="核算" actionUrl="bsBuDetailsController.do?datagrid" idField="id"  queryMode="group">
    <t:dgCol title="主键"  field="id"  hidden="true" ></t:dgCol>
    <t:dgCol title="创建人名称"  field="createName"  hidden="true" ></t:dgCol>
    <t:dgCol title="创建人登录名称"  field="createBy"  hidden="true" ></t:dgCol>
    <t:dgCol title="创建日期"  field="createDate"  hidden="true" ></t:dgCol>
    <t:dgCol title="更新人名称"  field="updateName"  hidden="true" ></t:dgCol>
    <t:dgCol title="更新人登录名称"  field="updateBy"  hidden="true" ></t:dgCol>
    <t:dgCol title="更新日期"  field="updateDate"  hidden="true" ></t:dgCol>
    <t:dgCol title="所属部门"  field="sysOrgCode"  hidden="true" ></t:dgCol>
    <t:dgCol title="所属公司"  field="sysCompanyCode"  hidden="true" ></t:dgCol>
    <t:dgCol title="流程状态"  field="bpmStatus"  hidden="true" ></t:dgCol>
    <t:dgCol title="分类id"  field="changclassid"  hidden="true" ></t:dgCol>
    <t:dgCol title="金额"  field="money"  hidden="true" ></t:dgCol>
    <t:dgCol title="摘要_核算内容"  field="abstracts" queryMode="single"  extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="科目编码_核算内容"  field="acountno" queryMode="single"  extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="科目名称_核算内容"  field="acountname" queryMode="single"  dictionary="bs_bu_acount,acountname,name" popup="true" extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="币别_核算内容"  field="currency"  hidden="true" ></t:dgCol>
    <t:dgCol title="原币金额_核算内容"  field="ybamt"  hidden="true" ></t:dgCol>
    <t:dgCol title="金额_核算内容"  field="amt"  hidden="true" ></t:dgCol>
    <t:dgCol title="凭证id_核算内容"  field="fbillid"  hidden="true" ></t:dgCol>
    <t:dgCol title="凭证分录id_核算内容"  field="fentryid"  hidden="true" ></t:dgCol>
    <t:dgCol title="借贷方向_核算内容"  field="fentrydc"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点3_核算内容"  field="ext3"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点4_核算内容"  field="ext4"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点5_核算内容"  field="ext5"  hidden="true" ></t:dgCol>
    <t:dgCol title="文件状态_核算内容"  field="fileState"  hidden="true" ></t:dgCol>
    <t:dgCol title="数据逻辑删除标识符_核算内容"  field="drHenr"  hidden="true" ></t:dgCol>
    <t:dgCol title="时间戳_核算内容"  field="tsHenr"  hidden="true" ></t:dgCol>
    <t:dgCol title="文件名_核算内容"  field="fileId"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点2_核算内容"  field="ext2"  hidden="true" ></t:dgCol>
    <t:dgCol title="客户_核算辅助"  field="customer"  hidden="true" ></t:dgCol>
    <t:dgCol title="供应商_核算辅助"  field="supplier"  hidden="true" ></t:dgCol>
    <t:dgCol title="预算承担部门_核算辅助"  field="assumingdepart"  hidden="true" ></t:dgCol>
    <t:dgCol title="划小单元_核算辅助"  field="smallunit"  hidden="true" ></t:dgCol>
    <t:dgCol title="职员_核算辅助"  field="staffmember"  hidden="true" ></t:dgCol>
    <t:dgCol title="金融机构_核算辅助"  field="financialinst"  hidden="true" ></t:dgCol>
    <t:dgCol title="银行账号_核算辅助"  field="bankaccount"  hidden="true" ></t:dgCol>
    <t:dgCol title="项目_核算辅助"  field="project"  hidden="true" ></t:dgCol>
    <t:dgCol title="产品线_核算辅助"  field="productline"  hidden="true" ></t:dgCol>
    <t:dgCol title="网元_核算辅助"  field="networkelement"  hidden="true" ></t:dgCol>
    <t:dgCol title="费用类型_核算辅助"  field="costtype"  hidden="true" ></t:dgCol>
    <t:dgCol title="款项名称_核算辅助"  field="payments"  hidden="true" ></t:dgCol>
    <t:dgCol title="关联交易_核算辅助"  field="relation"  hidden="true" ></t:dgCol>
    <t:dgCol title="客户群_核算辅助"  field="customergroup"  hidden="true" ></t:dgCol>
    <t:dgCol title="合同号_核算辅助"  field="contractno"  hidden="true" ></t:dgCol>
    <t:dgCol title="活动项目_核算辅助"  field="eventitems"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点1_核算辅助"  field="ext1Hefz"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点2_核算辅助"  field="ext2Hefz"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点3_核算辅助"  field="ext3Hefz"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点4_核算辅助"  field="ext4Hefz"  hidden="true" ></t:dgCol>
    <t:dgCol title="扩展节点5_核算辅助"  field="ext5Hefz"  hidden="true" ></t:dgCol>
    <t:dgCol title="文件状态_核算辅助"  field="fileStateHefz"  hidden="true" ></t:dgCol>
    <t:dgCol title="数据逻辑删除标识符_核算辅助"  field="drHefz"  hidden="true" ></t:dgCol>
    <t:dgCol title="时间戳_核算辅助"  field="tsHefz"  hidden="true" ></t:dgCol>
    <t:dgCol title="文件名_核算辅助"  field="fileIdHefz" queryMode="single"  extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="报帐单主键_核算辅助"  field="billid" queryMode="single"  extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="凭证分录id_核算辅助"  field="fentryidHefz" queryMode="single"  extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="辅助记录id_核算辅助"  field="fid" queryMode="single"  extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="凭证id_核算辅助"  field="fbillidHefz" queryMode="single"  extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="数据逻辑删除标识符"  field="dr"  hidden="true" ></t:dgCol>
    <t:dgCol title="时间戳"  field="ts"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案1id"  field="doc1"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案1编码"  field="doc1code"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案1名称"  field="doc1name" queryMode="single"  dictionary="doc1" extendParams="editor:'combobox'" width="100"></t:dgCol>
    <t:dgCol title="档案2id"  field="doc2"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案2编码"  field="doc2code"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案2名称"  field="doc2name"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案3id"  field="doc3"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案3编码"  field="doc3code"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案3名称"  field="doc3name"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案4id"  field="doc4"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案4编码"  field="doc4code"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案4名称"  field="doc4name"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案5id"  field="doc5"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案5编码"  field="doc5code"  hidden="true" ></t:dgCol>
    <t:dgCol title="档案5名称"  field="doc5name"  hidden="true" ></t:dgCol>
    <t:dgCol title="标识"  field="flag" queryMode="single"  extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="公司"  field="company" queryMode="single" query="true" dictionary="bs_bu_company,company,name" popup="true" extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgCol title="期间"  field="period" queryMode="single"  dictionary="bs_bu_period,period,name" popup="true" extendParams="editor:'text'" width="100"></t:dgCol>
    <t:dgToolBar operationCode="add" title="录入" icon="icon-add"  funname="addRow"></t:dgToolBar>
    <t:dgToolBar operationCode="edit" title="编辑" icon="icon-edit"  funname="editRow"></t:dgToolBar>
    <t:dgToolBar operationCode="save" title="保存" icon="icon-save" url="bsBuDetailsController.do?saveRows" funname="saveData"></t:dgToolBar>
    <t:dgToolBar operationCode="undo" title="取消编辑" icon="icon-undo" funname="reject"></t:dgToolBar>
    <t:dgToolBar title="批量删除"  icon="icon-remove" url="bsBuDetailsController.do?doBatchDel" funname="deleteALLSelect"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
    //添加行
	function addRow(title,addurl,gname){
		$('#'+gname).datagrid('appendRow',{});
		var editIndex = $('#'+gname).datagrid('getRows').length-1;
		$('#'+gname).datagrid('selectRow', editIndex)
				.datagrid('beginEdit', editIndex);
	}
	//保存数据
	function saveData(title,addurl,gname){
		if(!endEdit(gname))
			return false;
		var rows=$('#'+gname).datagrid("getChanges","inserted");
		var uprows=$('#'+gname).datagrid("getChanges","updated");
		rows=rows.concat(uprows);
		if(rows.length<=0){
			tip("没有需要保存的数据！")
			return false;
		}
		var result={};
		for(var i=0;i<rows.length;i++){
			for(var d in rows[i]){
				result["bsBuDetailsList["+i+"]."+d]=rows[i][d];
			}
		}
		$.ajax({
			url:"<%=basePath%>/"+addurl,
			type:"post",
			data:result,
			dataType:"json",
			success:function(data){
				tip(data.msg);
				if(data.success){
					reloadTable();
				}
			}
		})
	}
	//结束编辑
	function endEdit(gname){
		var  editIndex = $('#'+gname).datagrid('getRows').length-1;
		for(var i=0;i<=editIndex;i++){
			if($('#'+gname).datagrid('validateRow', i))
				$('#'+gname).datagrid('endEdit', i);
			else
				return false;
		}
		return true;
	}
	//编辑行
	function editRow(title,addurl,gname){
		var rows=$('#'+gname).datagrid("getChecked");
		if(rows.length==0){
			tip("请选择条目");
			return false;
		}
		for(var i=0;i<rows.length;i++){
			var index= $('#'+gname).datagrid('getRowIndex', rows[i]);
			$('#'+gname).datagrid('beginEdit', index);
		}
	}
	//取消编辑
	function reject(title,addurl,gname){
		$('#'+gname).datagrid('clearChecked');
		$('#'+gname).datagrid('rejectChanges');
	}
 </script>
