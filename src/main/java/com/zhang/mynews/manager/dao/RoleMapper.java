package com.zhang.mynews.manager.dao;

import java.util.List;

import com.zhang.mynews.bean.Role;

public interface RoleMapper {
	
	int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);

}
