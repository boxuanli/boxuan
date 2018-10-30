package com.springbbox.common.controller;

import com.springbbox.system.domain.UserToken;
import org.springframework.stereotype.Controller;
import com.springbbox.common.utils.ShiroUtils;
import com.springbbox.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}