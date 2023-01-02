package com.Avatar.user.about;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {

    @Autowired
    AboutRepository aboutRepository;

    public List<About> getAboutList(){
        return aboutRepository.findAll();
    }

    public About getAnAboutByTitle(String title){
        return aboutRepository.findByTitle(title);
    }

    public void saveAboutData(About about){
        aboutRepository.save(about);
    }

}
