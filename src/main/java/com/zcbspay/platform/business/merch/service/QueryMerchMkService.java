package com.zcbspay.platform.business.merch.service;

import com.zcbspay.platform.business.exception.BusinessMerchException;
import com.zcbspay.platform.business.merch.bean.MerchMkBean;

public interface QueryMerchMkService {
	 /**
    *查询商户密钥
    * @param memberId
    * @return
    */
   public MerchMkBean queryMerchMkByMemberId(String memberId) throws BusinessMerchException;
   
   /***
    *  根据商户类型查询秘钥
    * @param memberId
    * @param merchType 01:查询父商户 
    * @return
    */
   public MerchMkBean getByMerchType(String memberId,String merchType)throws BusinessMerchException;
}
