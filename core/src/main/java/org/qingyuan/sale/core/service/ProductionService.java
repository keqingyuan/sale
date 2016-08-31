/**
* <p>
* @className:ProductionService.java
* @classDescription:
* <p>
* @createTime：2016年8月31日
* @author：Qingyuan
*/

package org.qingyuan.sale.core.service;

import org.qingyuan.sale.core.model.Production;

/**
* <p>
* @className:ProductionService.java
* @classDescription:
* <p>
* @createTime:2016年8月31日
* @author:Qingyuan
*/

public interface ProductionService {

	public Production add(Production prod);
	
	public Production getProduction(String productionID);
}
