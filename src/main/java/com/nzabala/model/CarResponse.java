package com.nzabala.model;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

public class CarResponse  {

	public CarResponse(){
		
	}
	
	protected Response buildResponse(Object entity){		
		
		ResponseBuilder res = Response.status(200);
		
		if (entity != null){
			res.entity(entity);	
		}
		
		return res.build();
	}

	protected Response buildRightResponse(){	
		
		return buildResponse(null);
	}
}
