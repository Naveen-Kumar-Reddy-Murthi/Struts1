package org.mnr.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.MessageResources;
import org.mnr.actionforms.LoginForm;

public class LoginAction extends Action {
	
	public LoginAction() {
		System.out.println(new SimpleDateFormat("hh:mm:ss.SSS").format(new Date()));
		System.out.println("LoginAction created");
	}
	
	@Override
	public ActionForward execute(
	        ActionMapping mapping,
	        ActionForm form,
	        HttpServletRequest request,
	        HttpServletResponse response){
			
		System.out.println("Register Action execute method called");
		
		   MessageResources messages= this.getResources(request,"app");
		   System.out.println("Your Age is:"+messages.getMessage("age"));
		   System.out.println("Your sex is:"+messages.getMessage("sex"));
			
		
			LoginForm loginForm=(LoginForm) form;
			/*if(getErrors(request)==null || getErrors(request).size()==0 ){
				System.out.println("action error check");
				return mapping.getInputForward();
			}
			else */if ("naveen".equals(loginForm.getUserName())&& "naveen".equals(loginForm.getPassword())){
				request.setAttribute("requestAttribute", "success-request");
				request.getSession(false).setAttribute("sessionAttribute", "success-session");
				
				return mapping.findForward("success");
			}
			else{
				request.setAttribute("requestAttribute", "failure-request");
				request.getSession(false).setAttribute("sessionAttribute", "failure-session");
				return mapping.findForward("failure");
			}
	}
	

}
