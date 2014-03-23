package makeup.action.admin;

import makeup.model.User;
import makeup.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * sc
	 */
	private static final long serialVersionUID = -3242524408902652461L;
	private String username;
	private String password;
	private UserService userService = new UserService();

	public String execute() throws Exception {
		if(username.equals("")||password.equals(""))
			return "failure";
		User user = new User();
		user = userService.getUser(username);
		if (user.getPassword().equals(password)) {
			ActionContext.getContext().getSession().put("user", username);
			return "success";
		} else {
			return "failure";
		}
	}
	
	public String logout() throws Exception {
			ActionContext.getContext().getSession().clear();
			return "index";
	}

	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
