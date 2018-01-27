package com.crm.dao.impl;

import org.springframework.stereotype.Repository;

import com.crm.dao.ISysUserGroupDao;
import com.crm.pojo.SysUserGroup;
@Repository(ISysUserGroupDao.SYS_USER_GROUP_SERVICE)
public class SysUserGroupDaoImpl extends CommonDaoImpl<SysUserGroup> implements ISysUserGroupDao {
	
}
