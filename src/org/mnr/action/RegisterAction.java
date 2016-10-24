package org.mnr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.mnr.actionforms.RegisterForm;

public class RegisterAction extends Action{
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request,
	        HttpServletResponse response) throws Exception {
		
		RegisterForm registerForm	=	(RegisterForm) form;
		System.out.println("Form Data:"+registerForm);
		if(registerForm!=null)
		return mapping.findForward("success");
		else
			return mapping.findForward("failure");
	}

}
