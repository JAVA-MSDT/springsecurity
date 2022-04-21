package com.msdt.security.service;

import com.msdt.security.domain.SocialMedia;
import com.msdt.security.repository.SocialMediaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialMediaService {

    private final SocialMediaRepository socialMediaRepository;


    public SocialMediaService(SocialMediaRepository socialMediaRepository) {
        this.socialMediaRepository = socialMediaRepository;
    }

    public SocialMedia getSocialMediaById(int id) {
        return socialMediaRepository.getById(id);
    }

    public List<SocialMedia> getAllSocialMedia() {
        return socialMediaRepository.findAll();
    }

    public void saveSocialMedia(SocialMedia socialMedia) {
        socialMediaRepository.save(socialMedia);
    }


}
