package com.crm.dao.impl;




import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.crm.dao.ICommonDao;

public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T> {
	
	@Resource(name="sessionFactory")
	public void setSessionFac(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	@Override
	public void save(T t) {
		this.getHibernateTemplate().save(t);
	}
	
	
}
