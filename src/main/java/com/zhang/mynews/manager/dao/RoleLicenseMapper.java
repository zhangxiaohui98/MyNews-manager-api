package com.zhang.mynews.manager.dao;

import java.util.List;

import com.zhang.mynews.bean.RoleLicense;

public interface RoleLicenseMapper {
	
	int deleteByPrimaryKey(Integer id);

    int insert(RoleLicense record);

    RoleLicense selectByPrimaryKey(Integer id);

    List<RoleLicense> selectAll();

    int updateByPrimaryKey(RoleLicense record);

}
