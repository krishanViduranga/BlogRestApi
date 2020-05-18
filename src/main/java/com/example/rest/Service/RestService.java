package com.example.rest.Service;

import com.example.rest.model.BlogModel;
import com.example.rest.repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestService {

    @Autowired
    private RestRepository restRepository;

    public BlogModel addBgMethod(BlogModel blogModel){
         return restRepository.save(blogModel);
    }


    public Iterable<BlogModel> findAllBgMethod(){
         return restRepository.findAll();
    }


    public BlogModel findByIdMethod(Integer id){
        return restRepository.getById(id);
    }

    public void delete(BlogModel blogModel){
        restRepository.delete(blogModel);
    }



}
