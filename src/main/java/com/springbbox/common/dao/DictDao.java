package com.springbbox.common.dao;

import com.springbbox.common.domain.DictDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 字典表
 */
@Mapper
public interface DictDao {

	DictDO get(Long id);

	List<DictDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(DictDO dict);

	int update(DictDO dict);

	int remove(Long id);

	int batchRemove(Long[] ids);

	List<DictDO> listType();
}
