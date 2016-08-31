/**
* <p>
* @className:PublicController.java
* @classDescription:
* <p>
* @createTime：2016年8月31日
* @author：Qingyuan
*/

package org.qingyuan.sale.core.controller;

import org.qingyuan.sale.core.model.Production;
import org.qingyuan.sale.core.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
* <p>
* @className:PublicController.java
* @classDescription:
* <p>
* @createTime:2016年8月31日
* @author:Qingyuan
*/

@Controller
@RequestMapping("/p")
public class PublicController {

	@Autowired private ProductionService productionService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Production add(@RequestBody Production production) {
		return productionService.add(production);
	}
}
