package com.jeecg.bsbudetails.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.util.List;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Transient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 核算
 * @author onlineGenerator
 * @date 2019-11-06 14:57:31
 * @version V1.0   
 *
 */
@Entity
@Table(name = "bs_bu_details", schema = "")
@SuppressWarnings("serial")
public class BsBuDetailsEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建人登录名称*/
	private java.lang.String createBy;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新人登录名称*/
	private java.lang.String updateBy;
	/**更新日期*/
	private java.util.Date updateDate;
	/**所属部门*/
	private java.lang.String sysOrgCode;
	/**所属公司*/
	private java.lang.String sysCompanyCode;
	/**流程状态*/
	private java.lang.String bpmStatus;
	/**分类id*/
	private java.lang.String changclassid;
	/**金额*/
	private java.lang.String money;
	/**摘要_核算内容*/
	private java.lang.String abstracts;
	/**科目编码_核算内容*/
	private java.lang.String acountno;
	/**科目名称_核算内容*/
	private java.lang.String acountname;
	/**币别_核算内容*/
	private java.lang.String currency;
	/**原币金额_核算内容*/
	private java.lang.String ybamt;
	/**金额_核算内容*/
	private java.lang.String amt;
	/**凭证id_核算内容*/
	private java.lang.String fbillid;
	/**凭证分录id_核算内容*/
	private java.lang.String fentryid;
	/**借贷方向_核算内容*/
	private java.lang.String fentrydc;
	/**扩展节点3_核算内容*/
	private java.lang.String ext3;
	/**扩展节点4_核算内容*/
	private java.lang.String ext4;
	/**扩展节点5_核算内容*/
	private java.lang.String ext5;
	/**文件状态_核算内容*/
	private java.lang.String fileState;
	/**数据逻辑删除标识符_核算内容*/
	private java.lang.String drHenr;
	/**时间戳_核算内容*/
	private java.util.Date tsHenr;
	/**文件名_核算内容*/
	private java.lang.String fileId;
	/**扩展节点2_核算内容*/
	private java.lang.String ext2;
	/**客户_核算辅助*/
	private java.lang.String customer;
	/**供应商_核算辅助*/
	private java.lang.String supplier;
	/**预算承担部门_核算辅助*/
	private java.lang.String assumingdepart;
	/**划小单元_核算辅助*/
	private java.lang.String smallunit;
	/**职员_核算辅助*/
	private java.lang.String staffmember;
	/**金融机构_核算辅助*/
	private java.lang.String financialinst;
	/**银行账号_核算辅助*/
	private java.lang.String bankaccount;
	/**项目_核算辅助*/
	private java.lang.String project;
	/**产品线_核算辅助*/
	private java.lang.String productline;
	/**网元_核算辅助*/
	private java.lang.String networkelement;
	/**费用类型_核算辅助*/
	private java.lang.String costtype;
	/**款项名称_核算辅助*/
	private java.lang.String payments;
	/**关联交易_核算辅助*/
	private java.lang.String relation;
	/**客户群_核算辅助*/
	private java.lang.String customergroup;
	/**合同号_核算辅助*/
	private java.lang.String contractno;
	/**活动项目_核算辅助*/
	private java.lang.String eventitems;
	/**扩展节点1_核算辅助*/
	private java.lang.String ext1Hefz;
	/**扩展节点2_核算辅助*/
	private java.lang.String ext2Hefz;
	/**扩展节点3_核算辅助*/
	private java.lang.String ext3Hefz;
	/**扩展节点4_核算辅助*/
	private java.lang.String ext4Hefz;
	/**扩展节点5_核算辅助*/
	private java.lang.String ext5Hefz;
	/**文件状态_核算辅助*/
	private java.lang.String fileStateHefz;
	/**数据逻辑删除标识符_核算辅助*/
	private java.lang.String drHefz;
	/**时间戳_核算辅助*/
	private java.util.Date tsHefz;
	/**文件名_核算辅助*/
	private java.lang.String fileIdHefz;
	/**报帐单主键_核算辅助*/
	private java.lang.String billid;
	/**凭证分录id_核算辅助*/
	private java.lang.String fentryidHefz;
	/**辅助记录id_核算辅助*/
	private java.lang.String fid;
	/**凭证id_核算辅助*/
	private java.lang.String fbillidHefz;
	/**数据逻辑删除标识符*/
	private java.lang.String dr;
	/**时间戳*/
	private java.util.Date ts;
	/**档案1id*/
	private java.lang.String doc1;
	/**档案1编码*/
	private java.lang.String doc1code;
	/**档案1名称*/
	@Excel(name="档案1名称",width=15,dicCode="doc1")
	private java.lang.String doc1name;
	/**档案2id*/
	private java.lang.String doc2;
	/**档案2编码*/
	private java.lang.String doc2code;
	/**档案2名称*/
	private java.lang.String doc2name;
	/**档案3id*/
	private java.lang.String doc3;
	/**档案3编码*/
	private java.lang.String doc3code;
	/**档案3名称*/
	private java.lang.String doc3name;
	/**档案4id*/
	private java.lang.String doc4;
	/**档案4编码*/
	private java.lang.String doc4code;
	/**档案4名称*/
	private java.lang.String doc4name;
	/**档案5id*/
	private java.lang.String doc5;
	/**档案5编码*/
	private java.lang.String doc5code;
	/**档案5名称*/
	private java.lang.String doc5name;
	/**标识*/
	@Excel(name="标识",width=15)
	private java.lang.String flag;
	/**公司*/
	@Excel(name="公司",width=15)
	private java.lang.String company;
	/**期间*/
	@Excel(name="期间",width=15)
	private java.lang.String period;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")

	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */

	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人登录名称
	 */

	@Column(name ="CREATE_BY",nullable=true,length=50)
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人登录名称
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */

	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */

	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人登录名称
	 */

	@Column(name ="UPDATE_BY",nullable=true,length=50)
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人登录名称
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */

	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属部门
	 */

	@Column(name ="SYS_ORG_CODE",nullable=true,length=50)
	public java.lang.String getSysOrgCode(){
		return this.sysOrgCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属部门
	 */
	public void setSysOrgCode(java.lang.String sysOrgCode){
		this.sysOrgCode = sysOrgCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属公司
	 */

	@Column(name ="SYS_COMPANY_CODE",nullable=true,length=50)
	public java.lang.String getSysCompanyCode(){
		return this.sysCompanyCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属公司
	 */
	public void setSysCompanyCode(java.lang.String sysCompanyCode){
		this.sysCompanyCode = sysCompanyCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */

	@Column(name ="BPM_STATUS",nullable=true,length=32)
	public java.lang.String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(java.lang.String bpmStatus){
		this.bpmStatus = bpmStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  分类id
	 */

	@Column(name ="CHANGCLASSID",nullable=true,length=32)
	public java.lang.String getChangclassid(){
		return this.changclassid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  分类id
	 */
	public void setChangclassid(java.lang.String changclassid){
		this.changclassid = changclassid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金额
	 */

	@Column(name ="MONEY",nullable=true,length=32)
	public java.lang.String getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金额
	 */
	public void setMoney(java.lang.String money){
		this.money = money;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  摘要_核算内容
	 */

	@Column(name ="ABSTRACTS",nullable=true,length=32)
	public java.lang.String getAbstracts(){
		return this.abstracts;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  摘要_核算内容
	 */
	public void setAbstracts(java.lang.String abstracts){
		this.abstracts = abstracts;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  科目编码_核算内容
	 */

	@Column(name ="ACOUNTNO",nullable=true,length=32)
	public java.lang.String getAcountno(){
		return this.acountno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  科目编码_核算内容
	 */
	public void setAcountno(java.lang.String acountno){
		this.acountno = acountno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  科目名称_核算内容
	 */

	@Column(name ="ACOUNTNAME",nullable=true,length=32)
	public java.lang.String getAcountname(){
		return this.acountname;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  科目名称_核算内容
	 */
	public void setAcountname(java.lang.String acountname){
		this.acountname = acountname;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  币别_核算内容
	 */

	@Column(name ="CURRENCY",nullable=true,length=32)
	public java.lang.String getCurrency(){
		return this.currency;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  币别_核算内容
	 */
	public void setCurrency(java.lang.String currency){
		this.currency = currency;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  原币金额_核算内容
	 */

	@Column(name ="YBAMT",nullable=true,length=32)
	public java.lang.String getYbamt(){
		return this.ybamt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  原币金额_核算内容
	 */
	public void setYbamt(java.lang.String ybamt){
		this.ybamt = ybamt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金额_核算内容
	 */

	@Column(name ="AMT",nullable=true,length=32)
	public java.lang.String getAmt(){
		return this.amt;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金额_核算内容
	 */
	public void setAmt(java.lang.String amt){
		this.amt = amt;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凭证id_核算内容
	 */

	@Column(name ="FBILLID",nullable=true,length=32)
	public java.lang.String getFbillid(){
		return this.fbillid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凭证id_核算内容
	 */
	public void setFbillid(java.lang.String fbillid){
		this.fbillid = fbillid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凭证分录id_核算内容
	 */

	@Column(name ="FENTRYID",nullable=true,length=32)
	public java.lang.String getFentryid(){
		return this.fentryid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凭证分录id_核算内容
	 */
	public void setFentryid(java.lang.String fentryid){
		this.fentryid = fentryid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  借贷方向_核算内容
	 */

	@Column(name ="FENTRYDC",nullable=true,length=32)
	public java.lang.String getFentrydc(){
		return this.fentrydc;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  借贷方向_核算内容
	 */
	public void setFentrydc(java.lang.String fentrydc){
		this.fentrydc = fentrydc;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点3_核算内容
	 */

	@Column(name ="EXT3",nullable=true,length=32)
	public java.lang.String getExt3(){
		return this.ext3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点3_核算内容
	 */
	public void setExt3(java.lang.String ext3){
		this.ext3 = ext3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点4_核算内容
	 */

	@Column(name ="EXT4",nullable=true,length=32)
	public java.lang.String getExt4(){
		return this.ext4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点4_核算内容
	 */
	public void setExt4(java.lang.String ext4){
		this.ext4 = ext4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点5_核算内容
	 */

	@Column(name ="EXT5",nullable=true,length=32)
	public java.lang.String getExt5(){
		return this.ext5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点5_核算内容
	 */
	public void setExt5(java.lang.String ext5){
		this.ext5 = ext5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件状态_核算内容
	 */

	@Column(name ="FILE_STATE",nullable=true,length=32)
	public java.lang.String getFileState(){
		return this.fileState;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件状态_核算内容
	 */
	public void setFileState(java.lang.String fileState){
		this.fileState = fileState;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数据逻辑删除标识符_核算内容
	 */

	@Column(name ="DR_HENR",nullable=true,length=10)
	public java.lang.String getDrHenr(){
		return this.drHenr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数据逻辑删除标识符_核算内容
	 */
	public void setDrHenr(java.lang.String drHenr){
		this.drHenr = drHenr;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  时间戳_核算内容
	 */

	@Column(name ="TS_HENR",nullable=true,length=20)
	public java.util.Date getTsHenr(){
		return this.tsHenr;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  时间戳_核算内容
	 */
	public void setTsHenr(java.util.Date tsHenr){
		this.tsHenr = tsHenr;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件名_核算内容
	 */

	@Column(name ="FILE_ID",nullable=true,length=50)
	public java.lang.String getFileId(){
		return this.fileId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件名_核算内容
	 */
	public void setFileId(java.lang.String fileId){
		this.fileId = fileId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点2_核算内容
	 */

	@Column(name ="EXT2",nullable=true,length=32)
	public java.lang.String getExt2(){
		return this.ext2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点2_核算内容
	 */
	public void setExt2(java.lang.String ext2){
		this.ext2 = ext2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户_核算辅助
	 */

	@Column(name ="CUSTOMER",nullable=true,length=32)
	public java.lang.String getCustomer(){
		return this.customer;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户_核算辅助
	 */
	public void setCustomer(java.lang.String customer){
		this.customer = customer;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  供应商_核算辅助
	 */

	@Column(name ="SUPPLIER",nullable=true,length=32)
	public java.lang.String getSupplier(){
		return this.supplier;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  供应商_核算辅助
	 */
	public void setSupplier(java.lang.String supplier){
		this.supplier = supplier;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预算承担部门_核算辅助
	 */

	@Column(name ="ASSUMINGDEPART",nullable=true,length=32)
	public java.lang.String getAssumingdepart(){
		return this.assumingdepart;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预算承担部门_核算辅助
	 */
	public void setAssumingdepart(java.lang.String assumingdepart){
		this.assumingdepart = assumingdepart;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  划小单元_核算辅助
	 */

	@Column(name ="SMALLUNIT",nullable=true,length=32)
	public java.lang.String getSmallunit(){
		return this.smallunit;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  划小单元_核算辅助
	 */
	public void setSmallunit(java.lang.String smallunit){
		this.smallunit = smallunit;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  职员_核算辅助
	 */

	@Column(name ="STAFFMEMBER",nullable=true,length=32)
	public java.lang.String getStaffmember(){
		return this.staffmember;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  职员_核算辅助
	 */
	public void setStaffmember(java.lang.String staffmember){
		this.staffmember = staffmember;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  金融机构_核算辅助
	 */

	@Column(name ="FINANCIALINST",nullable=true,length=32)
	public java.lang.String getFinancialinst(){
		return this.financialinst;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  金融机构_核算辅助
	 */
	public void setFinancialinst(java.lang.String financialinst){
		this.financialinst = financialinst;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行账号_核算辅助
	 */

	@Column(name ="BANKACCOUNT",nullable=true,length=32)
	public java.lang.String getBankaccount(){
		return this.bankaccount;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行账号_核算辅助
	 */
	public void setBankaccount(java.lang.String bankaccount){
		this.bankaccount = bankaccount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  项目_核算辅助
	 */

	@Column(name ="PROJECT",nullable=true,length=32)
	public java.lang.String getProject(){
		return this.project;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  项目_核算辅助
	 */
	public void setProject(java.lang.String project){
		this.project = project;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品线_核算辅助
	 */

	@Column(name ="PRODUCTLINE",nullable=true,length=32)
	public java.lang.String getProductline(){
		return this.productline;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品线_核算辅助
	 */
	public void setProductline(java.lang.String productline){
		this.productline = productline;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  网元_核算辅助
	 */

	@Column(name ="NETWORKELEMENT",nullable=true,length=32)
	public java.lang.String getNetworkelement(){
		return this.networkelement;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  网元_核算辅助
	 */
	public void setNetworkelement(java.lang.String networkelement){
		this.networkelement = networkelement;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  费用类型_核算辅助
	 */

	@Column(name ="COSTTYPE",nullable=true,length=32)
	public java.lang.String getCosttype(){
		return this.costtype;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  费用类型_核算辅助
	 */
	public void setCosttype(java.lang.String costtype){
		this.costtype = costtype;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  款项名称_核算辅助
	 */

	@Column(name ="PAYMENTS",nullable=true,length=32)
	public java.lang.String getPayments(){
		return this.payments;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  款项名称_核算辅助
	 */
	public void setPayments(java.lang.String payments){
		this.payments = payments;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  关联交易_核算辅助
	 */

	@Column(name ="RELATION",nullable=true,length=32)
	public java.lang.String getRelation(){
		return this.relation;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  关联交易_核算辅助
	 */
	public void setRelation(java.lang.String relation){
		this.relation = relation;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  客户群_核算辅助
	 */

	@Column(name ="CUSTOMERGROUP",nullable=true,length=32)
	public java.lang.String getCustomergroup(){
		return this.customergroup;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  客户群_核算辅助
	 */
	public void setCustomergroup(java.lang.String customergroup){
		this.customergroup = customergroup;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  合同号_核算辅助
	 */

	@Column(name ="CONTRACTNO",nullable=true,length=32)
	public java.lang.String getContractno(){
		return this.contractno;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  合同号_核算辅助
	 */
	public void setContractno(java.lang.String contractno){
		this.contractno = contractno;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  活动项目_核算辅助
	 */

	@Column(name ="EVENTITEMS",nullable=true,length=32)
	public java.lang.String getEventitems(){
		return this.eventitems;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  活动项目_核算辅助
	 */
	public void setEventitems(java.lang.String eventitems){
		this.eventitems = eventitems;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点1_核算辅助
	 */

	@Column(name ="EXT1_HEFZ",nullable=true,length=32)
	public java.lang.String getExt1Hefz(){
		return this.ext1Hefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点1_核算辅助
	 */
	public void setExt1Hefz(java.lang.String ext1Hefz){
		this.ext1Hefz = ext1Hefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点2_核算辅助
	 */

	@Column(name ="EXT2_HEFZ",nullable=true,length=32)
	public java.lang.String getExt2Hefz(){
		return this.ext2Hefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点2_核算辅助
	 */
	public void setExt2Hefz(java.lang.String ext2Hefz){
		this.ext2Hefz = ext2Hefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点3_核算辅助
	 */

	@Column(name ="EXT3_HEFZ",nullable=true,length=32)
	public java.lang.String getExt3Hefz(){
		return this.ext3Hefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点3_核算辅助
	 */
	public void setExt3Hefz(java.lang.String ext3Hefz){
		this.ext3Hefz = ext3Hefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点4_核算辅助
	 */

	@Column(name ="EXT4_HEFZ",nullable=true,length=32)
	public java.lang.String getExt4Hefz(){
		return this.ext4Hefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点4_核算辅助
	 */
	public void setExt4Hefz(java.lang.String ext4Hefz){
		this.ext4Hefz = ext4Hefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  扩展节点5_核算辅助
	 */

	@Column(name ="EXT5_HEFZ",nullable=true,length=32)
	public java.lang.String getExt5Hefz(){
		return this.ext5Hefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  扩展节点5_核算辅助
	 */
	public void setExt5Hefz(java.lang.String ext5Hefz){
		this.ext5Hefz = ext5Hefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件状态_核算辅助
	 */

	@Column(name ="FILE_STATE_HEFZ",nullable=true,length=32)
	public java.lang.String getFileStateHefz(){
		return this.fileStateHefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件状态_核算辅助
	 */
	public void setFileStateHefz(java.lang.String fileStateHefz){
		this.fileStateHefz = fileStateHefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数据逻辑删除标识符_核算辅助
	 */

	@Column(name ="DR_HEFZ",nullable=true,length=10)
	public java.lang.String getDrHefz(){
		return this.drHefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数据逻辑删除标识符_核算辅助
	 */
	public void setDrHefz(java.lang.String drHefz){
		this.drHefz = drHefz;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  时间戳_核算辅助
	 */

	@Column(name ="TS_HEFZ",nullable=true,length=20)
	public java.util.Date getTsHefz(){
		return this.tsHefz;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  时间戳_核算辅助
	 */
	public void setTsHefz(java.util.Date tsHefz){
		this.tsHefz = tsHefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  文件名_核算辅助
	 */

	@Column(name ="FILE_ID_HEFZ",nullable=true,length=50)
	public java.lang.String getFileIdHefz(){
		return this.fileIdHefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  文件名_核算辅助
	 */
	public void setFileIdHefz(java.lang.String fileIdHefz){
		this.fileIdHefz = fileIdHefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报帐单主键_核算辅助
	 */

	@Column(name ="BILLID",nullable=true,length=32)
	public java.lang.String getBillid(){
		return this.billid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报帐单主键_核算辅助
	 */
	public void setBillid(java.lang.String billid){
		this.billid = billid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凭证分录id_核算辅助
	 */

	@Column(name ="FENTRYID_HEFZ",nullable=true,length=32)
	public java.lang.String getFentryidHefz(){
		return this.fentryidHefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凭证分录id_核算辅助
	 */
	public void setFentryidHefz(java.lang.String fentryidHefz){
		this.fentryidHefz = fentryidHefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  辅助记录id_核算辅助
	 */

	@Column(name ="FID",nullable=true,length=32)
	public java.lang.String getFid(){
		return this.fid;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  辅助记录id_核算辅助
	 */
	public void setFid(java.lang.String fid){
		this.fid = fid;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凭证id_核算辅助
	 */

	@Column(name ="FBILLID_HEFZ",nullable=true,length=32)
	public java.lang.String getFbillidHefz(){
		return this.fbillidHefz;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凭证id_核算辅助
	 */
	public void setFbillidHefz(java.lang.String fbillidHefz){
		this.fbillidHefz = fbillidHefz;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数据逻辑删除标识符
	 */

	@Column(name ="DR",nullable=true,length=10)
	public java.lang.String getDr(){
		return this.dr;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数据逻辑删除标识符
	 */
	public void setDr(java.lang.String dr){
		this.dr = dr;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  时间戳
	 */

	@Column(name ="TS",nullable=true,length=20)
	public java.util.Date getTs(){
		return this.ts;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  时间戳
	 */
	public void setTs(java.util.Date ts){
		this.ts = ts;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案1id
	 */

	@Column(name ="DOC1",nullable=true,length=32)
	public java.lang.String getDoc1(){
		return this.doc1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案1id
	 */
	public void setDoc1(java.lang.String doc1){
		this.doc1 = doc1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案1编码
	 */

	@Column(name ="DOC1CODE",nullable=true,length=32)
	public java.lang.String getDoc1code(){
		return this.doc1code;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案1编码
	 */
	public void setDoc1code(java.lang.String doc1code){
		this.doc1code = doc1code;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案1名称
	 */

	@Column(name ="DOC1NAME",nullable=true,length=32)
	public java.lang.String getDoc1name(){
		return this.doc1name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案1名称
	 */
	public void setDoc1name(java.lang.String doc1name){
		this.doc1name = doc1name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案2id
	 */

	@Column(name ="DOC2",nullable=true,length=32)
	public java.lang.String getDoc2(){
		return this.doc2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案2id
	 */
	public void setDoc2(java.lang.String doc2){
		this.doc2 = doc2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案2编码
	 */

	@Column(name ="DOC2CODE",nullable=true,length=32)
	public java.lang.String getDoc2code(){
		return this.doc2code;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案2编码
	 */
	public void setDoc2code(java.lang.String doc2code){
		this.doc2code = doc2code;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案2名称
	 */

	@Column(name ="DOC2NAME",nullable=true,length=32)
	public java.lang.String getDoc2name(){
		return this.doc2name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案2名称
	 */
	public void setDoc2name(java.lang.String doc2name){
		this.doc2name = doc2name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案3id
	 */

	@Column(name ="DOC3",nullable=true,length=32)
	public java.lang.String getDoc3(){
		return this.doc3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案3id
	 */
	public void setDoc3(java.lang.String doc3){
		this.doc3 = doc3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案3编码
	 */

	@Column(name ="DOC3CODE",nullable=true,length=32)
	public java.lang.String getDoc3code(){
		return this.doc3code;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案3编码
	 */
	public void setDoc3code(java.lang.String doc3code){
		this.doc3code = doc3code;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案3名称
	 */

	@Column(name ="DOC3NAME",nullable=true,length=32)
	public java.lang.String getDoc3name(){
		return this.doc3name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案3名称
	 */
	public void setDoc3name(java.lang.String doc3name){
		this.doc3name = doc3name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案4id
	 */

	@Column(name ="DOC4",nullable=true,length=32)
	public java.lang.String getDoc4(){
		return this.doc4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案4id
	 */
	public void setDoc4(java.lang.String doc4){
		this.doc4 = doc4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案4编码
	 */

	@Column(name ="DOC4CODE",nullable=true,length=32)
	public java.lang.String getDoc4code(){
		return this.doc4code;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案4编码
	 */
	public void setDoc4code(java.lang.String doc4code){
		this.doc4code = doc4code;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案4名称
	 */

	@Column(name ="DOC4NAME",nullable=true,length=32)
	public java.lang.String getDoc4name(){
		return this.doc4name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案4名称
	 */
	public void setDoc4name(java.lang.String doc4name){
		this.doc4name = doc4name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案5id
	 */

	@Column(name ="DOC5",nullable=true,length=32)
	public java.lang.String getDoc5(){
		return this.doc5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案5id
	 */
	public void setDoc5(java.lang.String doc5){
		this.doc5 = doc5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案5编码
	 */

	@Column(name ="DOC5CODE",nullable=true,length=32)
	public java.lang.String getDoc5code(){
		return this.doc5code;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案5编码
	 */
	public void setDoc5code(java.lang.String doc5code){
		this.doc5code = doc5code;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  档案5名称
	 */

	@Column(name ="DOC5NAME",nullable=true,length=32)
	public java.lang.String getDoc5name(){
		return this.doc5name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  档案5名称
	 */
	public void setDoc5name(java.lang.String doc5name){
		this.doc5name = doc5name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  标识
	 */

	@Column(name ="FLAG",nullable=true,length=32)
	public java.lang.String getFlag(){
		return this.flag;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  标识
	 */
	public void setFlag(java.lang.String flag){
		this.flag = flag;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  公司
	 */

	@Column(name ="COMPANY",nullable=true,length=32)
	public java.lang.String getCompany(){
		return this.company;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  公司
	 */
	public void setCompany(java.lang.String company){
		this.company = company;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  期间
	 */

	@Column(name ="PERIOD",nullable=true,length=32)
	public java.lang.String getPeriod(){
		return this.period;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  期间
	 */
	public void setPeriod(java.lang.String period){
		this.period = period;
	}
	
	
    private List<BsBuDetailsEntity> bsBuDetailsList ;
	
    @Transient
	public List<BsBuDetailsEntity> getBsBuDetailsList() {
		return bsBuDetailsList;
	}

	public void setBsBuDetailsList(List<BsBuDetailsEntity> bsBuDetailsList) {
		this.bsBuDetailsList = bsBuDetailsList;
	}
}
