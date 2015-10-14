package jp.designforlife.template.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.designforlife.template.dto.MyBatisSampleDto;
import jp.designforlife.template.entity.Test;
import jp.designforlife.template.mapper.MyBatisSampleMapper;

@Service
public class MyBatisSampleService {

	@Autowired
	private MyBatisSampleMapper myBatisSampleMapper;

	public MyBatisSampleDto getTest(Integer id) {
		MyBatisSampleDto dto = new MyBatisSampleDto();
		Test entity = myBatisSampleMapper.getTest(id);
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}