package com.yqbing.servicebing.repository.database.dao;

import com.yqbing.servicebing.repository.database.abstracts.ZanclickLogBeanExample;
import com.yqbing.servicebing.repository.database.bean.ZanclickLogBean;

import java.util.List;

public interface ZanclickLogBeanMapper {
    int countByExample(ZanclickLogBeanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZanclickLogBean record);

    int insertSelective(ZanclickLogBean record);

    List<ZanclickLogBean> selectByExample(ZanclickLogBeanExample example);

    ZanclickLogBean selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZanclickLogBean record);

    int updateByPrimaryKey(ZanclickLogBean record);

	List<ZanclickLogBean> queryStatistics();
}