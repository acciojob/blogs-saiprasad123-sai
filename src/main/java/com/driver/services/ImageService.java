package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Autowired
    ImageRepository imageRepository2;

    public Image createAndReturn(Blog blog, String description, String dimensions){
        //create an image based on given parameters and add it to the imageList of given blog
        Image image = new Image(blog,description,dimensions);
       image.setBlog(blog);
       imageRepository2.save(image);
       return image;
    }

    public void deleteImage(Image image){
        imageRepository2.delete(image);

    }

    public Image findById(int id) {
        return imageRepository2.findById(id).get();

    }

    public int countImagesInScreen(Image image, String screenDimensions) {
        //Find the number of images of given dimensions that can fit in a screen having `screenDimensions`
        //In case the image is null, return 0

        String[] arr1 = screenDimensions.split("X");
        if(image==null || arr1.length!=2)
            return 0;
        String[] arr2 = image.getDimensions().split("X");
        int imgDim = Integer.valueOf(arr1[0])/Integer.valueOf(arr2[0]);
        int screenDim = Integer.valueOf(arr1[1])/Integer.valueOf(arr2[1]);

        return (imgDim*screenDim);


    }
}
