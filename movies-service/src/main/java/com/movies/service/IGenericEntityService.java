package com.movies.service;

import java.util.List;

public interface IGenericEntityService<T, ID> {

    public List<T> findAll();

    public void save(T entity);

    public T findOne(ID id);

    public void delete(ID id);

    public List<T> findByTitle(String name);

}
