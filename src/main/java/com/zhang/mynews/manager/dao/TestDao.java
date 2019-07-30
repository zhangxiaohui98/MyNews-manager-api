package com.zhang.mynews.manager.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface TestDao {

	@Select("SELECT id FROM t_user WHERE name=#{name} and pwd=#{pwd}")
	int login(@Param(value ="name")String name,@Param(value ="pwd")String pwd);
	
}
