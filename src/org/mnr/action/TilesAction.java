package org.mnr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.validator.DynaValidatorActionForm;

public class TilesAction extends DispatchAction{
	
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DynaValidatorActionForm dynaForm = (DynaValidatorActionForm) form;
		System.out.println(dynaForm.getClass());
		System.out.println("DynaValidatorForm:"+dynaForm);
		System.out.println("name:"+dynaForm.get("name"));
		System.out.println("password:"+dynaForm.get("password"));
		System.out.println("function:"+dynaForm.get("function"));
		if(dynaForm.get("name")!=null)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DynaValidatorActionForm dynaForm = (DynaValidatorActionForm) form;
		System.out.println(dynaForm.getClass());
		System.out.println("DynaValidatorForm:"+dynaForm);
		System.out.println("name:"+dynaForm.get("name"));
		System.out.println("password:"+dynaForm.get("password"));
		System.out.println("function:"+dynaForm.get("function"));
		if(dynaForm.get("name")!=null)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DynaValidatorActionForm dynaForm = (DynaValidatorActionForm) form;
		System.out.println(dynaForm.getClass());
		System.out.println("DynaValidatorForm:"+dynaForm);
		System.out.println("name:"+dynaForm.get("name"));
		System.out.println("password:"+dynaForm.get("password"));
		System.out.println("function:"+dynaForm.get("function"));
		if(dynaForm.get("name")!=null)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}
	public ActionForward show(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DynaValidatorActionForm dynaForm = (DynaValidatorActionForm) form;
		System.out.println(dynaForm.getClass());
		System.out.println("DynaValidatorForm:"+dynaForm);
		System.out.println("name:"+dynaForm.get("name"));
		System.out.println("password:"+dynaForm.get("password"));
		System.out.println("function:"+dynaForm.get("function"));
		if(dynaForm.get("name")!=null)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}

}
