package com.example.demo.cmm.service;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T> {
    public abstract Optional<T> findOne();
	    public abstract List<T> findAll();
	    public abstract Optional<T> findById(long id);
	    public abstract List<T> findAllById(Iterable<T> ids);


	    public abstract long count();
	    
	    public abstract void deleteById(long id);
	   

	    public abstract T getOne(long id);

	    public abstract boolean existsById(long id);

	    public abstract List<T> saveAll(Iterable<T> entities);
	    public abstract T save(T entity);
}