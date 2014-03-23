package makeup.action;

import java.sql.Date;
import java.util.List;

import makeup.model.Organization;
import makeup.service.OrganizationService;
import makeup.vo.OrganizationPage;

import com.opensymphony.xwork2.ActionSupport;

public class OrganizationAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private Organization organization;
	private List<Organization> list;
	private OrganizationService organizationService = new OrganizationService();
	private OrganizationPage page=new OrganizationPage(15);
	
	private int id;
	private String title;//检测设备名称
	private String content;//检测设备具体内容
	private Date createtime;//检测设备创建时间
	private String author;//创建人
	private int clazz;//二级分类
	private int overhead;//是否置顶
	
	
	
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public List<Organization> getList() {
		return list;
	}
	public void setList(List<Organization> list) {
		this.list = list;
	}
	public OrganizationService getOrganizationService() {
		return organizationService;
	}
	public void setOrganizationService(OrganizationService organizationService) {
		this.organizationService = organizationService;
	}
	public OrganizationPage getPage() {
		return page;
	}
	public void setPage(OrganizationPage page) {
		this.page = page;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getClazz() {
		return clazz;
	}
	public void setClazz(int clazz) {
		this.clazz = clazz;
	}
	public int getOverhead() {
		return overhead;
	}
	public void setOverhead(int overhead) {
		this.overhead = overhead;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
