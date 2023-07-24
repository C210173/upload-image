package com.example.demo.repository;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Image;

@Repository
public interface ImageRepository {

    @Insert("INSERT INTO images (image_data) VALUES (#{imageData})")
    void insertImage(Image image);

}
