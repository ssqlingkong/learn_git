package com.crm.dao;
/**
 * 公共的持久层接口
 * */
public interface ICommonDao<T> {
	public void save(T t);
}
