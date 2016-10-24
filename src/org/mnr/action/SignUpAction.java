package org.mnr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.mnr.actionforms.SignUpForm;

public class SignUpAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		     SignUpForm signUpForm =(SignUpForm) form;
		     	System.out.println("signUpForm data:"+signUpForm);
		     if(signUpForm!=null)
		    	 return mapping.findForward("success");
		     else
		    	 return mapping.findForward("failure");
	}

}
