package com.example.rest.controler;


import com.example.rest.Service.RestService;
import com.example.rest.model.BlogModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestControl {

    @Autowired
    private RestService restService;

    //add&updateBlog
    @PostMapping("/add")
    public BlogModel addBlog(@RequestBody BlogModel blogModel){
        return restService.addBgMethod(blogModel);
    }


    //finfBlog
    @GetMapping("/all")
    public Iterable<BlogModel> findBlog(){
        return restService.findAllBgMethod();
    }


    //findByIdBlog
    @GetMapping("/find/{id}")
    public BlogModel findByIdBlog(@PathVariable Integer id){
        return restService.findByIdMethod(id);
    }


    //deleteBlog
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBlog(@PathVariable Integer id){
        BlogModel bgm = restService.findByIdMethod(id);
        restService.delete(bgm);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
        


    }







}
