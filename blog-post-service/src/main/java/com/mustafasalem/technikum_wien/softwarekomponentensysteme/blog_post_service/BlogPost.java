package com.mustafasalem.technikum_wien.softwarekomponentensysteme.blog_post_service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {

    private Integer id;
    private Integer authorID;
    private Integer landmarkID;
    private String title;
    private String content;
    private String creationDate;
    private Integer requestsTotal;
    private Integer requestsMonth;
}
