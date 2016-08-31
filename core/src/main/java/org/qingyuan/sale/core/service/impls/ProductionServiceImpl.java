/**
* <p>
* @className:ProductionServiceImpl.java
* @classDescription:
* <p>
* @createTime：2016年8月31日
* @author：Qingyuan
*/

package org.qingyuan.sale.core.service.impls;

import java.sql.Date;

import org.qingyuan.sale.core.dao.ProductionMapper;
import org.qingyuan.sale.core.model.Production;
import org.qingyuan.sale.core.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* <p>
* @className:ProductionServiceImpl.java
* @classDescription:
* <p>
* @createTime:2016年8月31日
* @author:Qingyuan
*/
@Service("productionService")
public class ProductionServiceImpl implements ProductionService {

	@Autowired private ProductionMapper productionMapper;
	
	/**
	 *<p>
	 * 功能描述：
	 *</p>
	 * @param prod
	 * @return   
	 */
	@Override
	public Production add(Production prod) {
		Date now = new Date(System.currentTimeMillis());
		prod.setStatus(0);
		prod.setCtime(now);
		prod.setUtime(now);
		productionMapper.insert(prod);
		return getProduction(prod.getPid());
	}

	/**
	 *<p>
	 * 功能描述：
	 *</p>
	 * @param productionID
	 * @return   
	 */
	@Override
	public Production getProduction(String productionID) {
		Production prod = productionMapper.get(productionID);
		if (prod != null)
			return prod;
		return null;
	}

}
