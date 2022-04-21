package com.msdt.security.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "social_media")
@Data
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "social_title")
    private String socialTitle;

    @Column(name = "social_url")
    private String socialUrl;

}