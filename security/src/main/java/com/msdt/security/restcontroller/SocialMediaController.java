package com.msdt.security.restcontroller;

import com.msdt.security.domain.SocialMedia;
import com.msdt.security.service.SocialMediaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SocialMediaController {

    private final SocialMediaService socialMediaService;


    public SocialMediaController(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    @GetMapping("/api/socials")
    public ResponseEntity getSocialMedias() {
        List<SocialMedia> socialMedias = socialMediaService.getAllSocialMedia();
        return new ResponseEntity(socialMedias, HttpStatus.OK);
    }

    @GetMapping(value = "/api/socials/{id}")
    public ResponseEntity getSocialMedia(@PathVariable int id) {
        SocialMedia socialMedia = socialMediaService.getSocialMediaById(id);
        return new ResponseEntity(socialMedia, HttpStatus.OK);
    }
}
