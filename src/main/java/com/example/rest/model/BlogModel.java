package com.example.rest.model;


import javax.persistence.*;


@Entity
@Table(name= "blog_details")
public class BlogModel {

    //blog_id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //topic
    @Column(name = "blog_topic")
    private String topic;
    //content
    @Column(name="blog_content")
    private String content;
    //author
    private String auther;

    public BlogModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
}
