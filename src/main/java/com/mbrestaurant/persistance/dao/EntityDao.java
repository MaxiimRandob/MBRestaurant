package com.mbrestaurant.persistance.dao;

import java.util.List;

public interface EntityDao<T> {

	T getById(int id);

	List<T> getAll();

	boolean create(T entity);

	boolean update(T entity);

	boolean remove(T entity);
}
