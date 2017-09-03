package com.it18zhang.mybigdata.service.Impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.it18zhang.mybigdata.dao.BaseDao;
import com.it18zhang.mybigdata.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Resource
@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    private BaseDao<T> dao;

    private Class clazz;
    public BaseServiceImpl() {
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class) type.getActualTypeArguments()[0];
    }

    @Resource
    public void setDao(BaseDao dao){
        this.dao=dao;
    }
    @Override
    public void saveEntity(T t) {
        // TODO Auto-generated method stub
        dao.saveEntity(t);
    }

    @Override
    public void updateEntity(T t) {
        // TODO Auto-generated method stub
        dao.updateEntity(t);
    }

    @Override
    public void deleteEntity(T t) {
        // TODO Auto-generated method stub
        dao.deleteEntity(t);
    }

    @Override
    public void executeByHQL(String hql, Object... objects) {
        // TODO Auto-generated method stub
        dao.executeByHQL(hql, objects);
    }

    @Override
    public T getEntity(Integer id) {
        // TODO Auto-generated method stub
        return dao.getEntity(id);
    }

    @Override
    public List<T> findByHQL(String hql, Object... objects) {
        // TODO Auto-generated method stub
        return dao.findByHQL(hql, objects);
    }

    @Override
    public List<T> findAll() {

        return findByHQL("from"+" "+clazz.getName());
    }

    @Override
    public void deleteById(Integer id) {
        String hql = "delete from "+clazz.getName()+" t where t.id = ?";
        this.executeByHQL(hql,id);
    }
}

