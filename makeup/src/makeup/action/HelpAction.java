package makeup.action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import makeup.model.Help;
import makeup.service.HelpService;

public class HelpAction extends ActionSupport{
	

	private static final long serialVersionUID = 9021657869226847989L;

	private HelpService helpService = new HelpService();
	private Help help;
	private List<Help> list;
	private String content;//帮助中心
	private String savepath;//照片
	
	
	public HelpService getHelpService() {
		return helpService;
	}
	public void setHelpService(HelpService helpService) {
		this.helpService = helpService;
	}
	public Help getHelp() {
		return help;
	}
	public void setHelp(Help help) {
		this.help = help;
	}
	public List<Help> getList() {
		return list;
	}
	public void setList(List<Help> list) {
		this.list = list;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getSavepath() {
		return savepath;
	}
	public void setSavepath(String savepath) {
		this.savepath = savepath;
	}

	
	
}
