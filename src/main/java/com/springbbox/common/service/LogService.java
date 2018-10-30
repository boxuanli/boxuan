package com.springbbox.common.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbbox.common.domain.LogDO;
import com.springbbox.common.domain.PageDO;
import com.springbbox.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
