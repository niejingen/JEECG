package com.jeecg.bsbudetails.service;
import com.jeecg.bsbudetails.entity.BsBuDetailsEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface BsBuDetailsServiceI extends CommonService{
	
 	public void delete(BsBuDetailsEntity entity) throws Exception;
 	
 	public Serializable save(BsBuDetailsEntity entity) throws Exception;
 	
 	public void saveOrUpdate(BsBuDetailsEntity entity) throws Exception;
 	
}
