package com.zcbspay.platform.business.commons.exception;

import java.util.ResourceBundle;

public abstract class AbstractOrderDescException extends AbstractDescribeException{
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 8484664176033605192L;
	private static final  ResourceBundle RESOURCE = ResourceBundle.getBundle("business_exception");
	@Override
	public ResourceBundle getResourceBundle() {
		return RESOURCE;
	}
}
