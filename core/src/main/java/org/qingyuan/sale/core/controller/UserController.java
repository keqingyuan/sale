/**
* <p>
* @className:UserController.java
* @classDescription:
* <p>
* @createTime：2016年8月31日
* @author：Qingyuan
*/

package org.qingyuan.sale.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* <p>
* @className:UserController.java
* @classDescription:
* <p>
* @createTime:2016年8月31日
* @author:Qingyuan
*/

@Controller
@RequestMapping("/u")
public class UserController {

//	@Inject
//	private UsersService userService;
//
//	@RequestMapping(value = "/{uid}", method = RequestMethod.POST)
//	@ResponseStatus(HttpStatus.CREATED)
//	public @ResponseBody Users add(@PathVariable long uid, @RequestBody Users user) {
//		user.setUid(uid);
//		return userService.add(user);
//	}
//
//	@RequestMapping(value = "/{mid}", method = RequestMethod.GET)
//	@ResponseStatus(HttpStatus.OK)
//	public @ResponseBody Users get(@PathVariable long uid, @PathVariable long mid) {
//		return userService.getUser(uid, mid);
//	}
//
//	@RequestMapping(value = "/{mid}", method = RequestMethod.DELETE)
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void delete(@PathVariable long uid, @PathVariable long mid) {
//		userService.deleteAllByUidAndMid(uid, mid);
//	}
//
//	@RequestMapping(value = "/{mid}/gender", method = RequestMethod.GET)
//	@ResponseStatus(HttpStatus.OK)
//	public @ResponseBody int queryGenderByUid(@PathVariable long uid, @PathVariable long mid) {
//		return userService.queryGenderByUid(uid, mid);
//	}
	
}
