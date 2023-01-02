package com.Avatar.user.about;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AboutController {

    @Autowired
    AboutService aboutService;

    @GetMapping("/about")
    public List<About> getAll() {
        return aboutService.getAboutList();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/about/{title}")
    public About getAboutByTitle(@PathVariable String title) {
        return aboutService.getAnAboutByTitle(title);
    }

    @PostMapping("/about")
    public void addAbout(@RequestBody About about) {
        aboutService.saveAboutData(about);
    }

}
