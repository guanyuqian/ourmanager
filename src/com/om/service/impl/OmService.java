package com.om.service.impl;

import com.om.dao.IOmDAO;
import com.om.model.Om;
import com.om.model.OmDAO;
import com.om.service.IOmService;

public class OmService implements IOmService{

	private  IOmDAO omdao;
	public IOmDAO getOmdao() {
		return omdao;
	}
	public void setOmdao(IOmDAO omdao) {
		this.omdao = omdao;
	}
	@Override
	public  boolean test() {
		// TODO Auto-generated method stub
		try{omdao.save(new Om("test",100));
		}
		catch(Exception ex){
		return false;
		}
		return true;
	}
	
}
