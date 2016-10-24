package org.mnr.actionforms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {
	
	

	public LoginForm() {
//		System.out.println(new SimpleDateFormat("hh:mm:ss.SSS").format(new Date()));
//		System.out.println("RegisterForm created");
	}
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginForm [userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request) {
		System.out.println("Login validate called");
		ActionErrors errors =	new ActionErrors();
		if(("".equals(userName)||userName==null)){
				/*logical name to be used on jsp*/  /*logical name of properties entry*/
//			errors.add("userName.err", new ActionMessage("login.userName.err"/*,"userName"*/));
			errors.add("userName.err", new ActionMessage("errors.required","User Name"));
		}
		if(("".equals(password)||password==null)){
//			errors.add("password.err", new ActionMessage("login.password.err"/*,"password"*/));
			errors.add("password.err", new ActionMessage("errors.required","Password"));
		}
				return errors;
		
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginForm other = (LoginForm) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	
}
