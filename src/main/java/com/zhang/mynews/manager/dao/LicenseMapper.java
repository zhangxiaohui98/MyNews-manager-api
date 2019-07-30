package com.zhang.mynews.manager.dao;

import java.util.List;

import com.zhang.mynews.bean.License;

public interface LicenseMapper {
	
	int deleteByPrimaryKey(Integer id);

    int insert(License record);

    License selectByPrimaryKey(Integer id);

    List<License> selectAll();

    int updateByPrimaryKey(License record);

}
