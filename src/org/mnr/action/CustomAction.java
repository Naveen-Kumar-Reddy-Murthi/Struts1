package org.mnr.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.validator.DynaValidatorForm;

public class CustomAction extends DispatchAction{
	
	
	public ActionForward add(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DynaActionForm dynaForm = (DynaActionForm) form;
		System.out.println(dynaForm.getClass());
		System.out.println("dynaFormData123:"+dynaForm);
		System.out.println("id:"+dynaForm.get("id"));
		System.out.println("id:"+dynaForm.get("value"));
		System.out.println("id:"+dynaForm.get("function"));
		if(dynaForm.get("id")!=null)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DynaActionForm dynaForm = (DynaActionForm) form;
		System.out.println("dynaFormData:"+dynaForm);
		System.out.println("id:"+dynaForm.get("id"));
		System.out.println("id:"+dynaForm.get("value"));
		System.out.println("id:"+dynaForm.get("function"));
		if(dynaForm.get("id")!=null)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}
	public ActionForward delete(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DynaActionForm dynaForm = (DynaActionForm) form;
		System.out.println("dynaFormData:"+dynaForm);
		System.out.println("id:"+dynaForm.get("id"));
		System.out.println("id:"+dynaForm.get("value"));
		System.out.println("id:"+dynaForm.get("function"));
		if(dynaForm.get("id")!=null)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}
	public ActionForward show(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		DynaValidatorForm dynaForm = (DynaValidatorForm) form;
		System.out.println("dynaFormData:"+dynaForm);
		System.out.println("id:"+dynaForm.get("id"));
		System.out.println("id:"+dynaForm.get("value"));
		System.out.println("id:"+dynaForm.get("function"));
		if(dynaForm.get("id")!=null)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		
	}

}
