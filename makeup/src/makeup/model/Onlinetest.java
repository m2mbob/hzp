package makeup.model;

import java.sql.Date;

public class Onlinetest extends BaseModel{
	private int id;
	
	private int sample_amount;//样品数量
	private String sample_number;//样品编号
	private String sample_name;//样品名称
	private String sample_producer;//样品生产产家
	private String sample_unit;//样品数量单位
	private String sample_batchNo;//样品生产批次
	private String sample_type;//样品类别
	
	
	private Date sample_produce_date;//样品生产日期
	private Date createtime;//检测设备创建时间
	private Date test_time;//样品检测时间
	
	private String test_number;//样品检测编号
	private String tester;//检测人员
	private String test_method;//检测方法
	private String test_standard;//检测标准
	private String test_remark;//检测备注
	
	private String user_contact;//联系人
	private String user_phone;//手机号
	private String user_telephone;//电话
	private String user_postway;//邮寄方式
	private String user_email;//邮箱
	private String user_address;//寄送地址
	private String user_remark;//送检者备注
	private String user_company;//送检者单位
	
	private String author;//创建人

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSample_amount() {
		return sample_amount;
	}
	public void setSample_amount(int sample_amount) {
		this.sample_amount = sample_amount;
	}
	public String getSample_number() {
		return sample_number;
	}
	public void setSample_number(String sample_number) {
		this.sample_number = sample_number;
	}
	public String getSample_name() {
		return sample_name;
	}
	public void setSample_name(String sample_name) {
		this.sample_name = sample_name;
	}
	public String getSample_producer() {
		return sample_producer;
	}
	public void setSample_producer(String sample_producer) {
		this.sample_producer = sample_producer;
	}
	public String getSample_unit() {
		return sample_unit;
	}
	public void setSample_unit(String sample_unit) {
		this.sample_unit = sample_unit;
	}
	public String getSample_batchNo() {
		return sample_batchNo;
	}
	public void setSample_batchNo(String sample_batchNo) {
		this.sample_batchNo = sample_batchNo;
	}
	public String getSample_type() {
		return sample_type;
	}
	public void setSample_type(String sample_type) {
		this.sample_type = sample_type;
	}
	public Date getSample_produce_date() {
		return sample_produce_date;
	}
	public void setSample_produce_date(Date sample_produce_date) {
		this.sample_produce_date = sample_produce_date;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getTest_time() {
		return test_time;
	}
	public void setTest_time(Date test_time) {
		this.test_time = test_time;
	}
	public String getTest_number() {
		return test_number;
	}
	public void setTest_number(String test_number) {
		this.test_number = test_number;
	}
	public String getTester() {
		return tester;
	}
	public void setTester(String tester) {
		this.tester = tester;
	}
	public String getTest_method() {
		return test_method;
	}
	public void setTest_method(String test_method) {
		this.test_method = test_method;
	}
	public String getTest_standard() {
		return test_standard;
	}
	public void setTest_standard(String test_standard) {
		this.test_standard = test_standard;
	}
	public String getTest_remark() {
		return test_remark;
	}
	public void setTest_remark(String test_remark) {
		this.test_remark = test_remark;
	}
	public String getUser_contact() {
		return user_contact;
	}
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_telephone() {
		return user_telephone;
	}
	public void setUser_telephone(String user_telephone) {
		this.user_telephone = user_telephone;
	}
	public String getUser_postway() {
		return user_postway;
	}
	public void setUser_postway(String user_postway) {
		this.user_postway = user_postway;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_remark() {
		return user_remark;
	}
	public void setUser_remark(String user_remark) {
		this.user_remark = user_remark;
	}
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
