package makeup.action.admin;

import java.sql.Date;
import java.util.List;

import makeup.model.Method;
import makeup.service.MethodService;
import makeup.vo.MethodPage;

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private Method method;
	private List<Method> list;
	private MethodService methodService = new MethodService();
	private MethodPage page=new MethodPage(15);
	
	private int id;
	private String title;//检测设备名称
	private String content;//检测设备具体内容
	private Date createtime;//检测设备创建时间
	private String author;//创建人
	private int clazz;//二级分类
	private int overhead;//是否置顶
	public Method getMethod() {
		return method;
	}
	public void setMethod(Method method) {
		this.method = method;
	}
	public List<Method> getList() {
		return list;
	}
	public void setList(List<Method> list) {
		this.list = list;
	}

	public MethodService getMethodService() {
		return methodService;
	}
	public void setMethodService(MethodService methodService) {
		this.methodService = methodService;
	}
	public MethodPage getPage() {
		return page;
	}
	public void setPage(MethodPage page) {
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
