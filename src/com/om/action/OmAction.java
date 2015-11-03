package com.om.action;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.om.model.Om;
import com.om.model.OmDAO;
import com.om.service.IOmService;

public class OmAction  extends ActionSupport {
	IOmService omService;
	public IOmService getOmService() {
		return omService;
	}
	public void setOmService(IOmService omService) {
		this.omService = omService;
	}
	public String test() throws Exception {
		// TODO Auto-generated method stub
		if (omService.test())
			return SUCCESS;
		else
			return ERROR;
	}
}
