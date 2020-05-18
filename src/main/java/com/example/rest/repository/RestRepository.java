package com.example.rest.repository;

import com.example.rest.model.BlogModel;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<BlogModel,Integer> {

    //public BlogModel findByIdMethod
     BlogModel getById(Integer id);
}
