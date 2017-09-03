package com.it18zhang.mybigdata.service;

import java.util.List;
/**
 * Created by xiebi on 5/17/2017.
 */

public interface BaseService<T> {

    public void saveEntity(T t);
    public void updateEntity(T t);
    public void deleteEntity(T t);
    public void executeByHQL(String hql, Object...objects);
    public void deleteById(Integer id);

    public T getEntity(Integer id);
    public List<T> findByHQL(String hql,Object...objects);
    public List<T> findAll();
}
