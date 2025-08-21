package com.emp.submapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper {
	List<String> search(String search);
}
