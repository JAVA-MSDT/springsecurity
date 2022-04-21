CREATE TABLE social_media(
  id BIGSERIAL PRIMARY KEY,
  social_title VARCHAR DEFAULT NULL,
  social_url VARCHAR DEFAULT NULL
);

INSERT INTO social_media (social_title, social_url) VALUES ('title One', 'url One');
INSERT INTO social_media (social_title, social_url) VALUES ('title Two', 'url Two');
INSERT INTO social_media (social_title, social_url) VALUES ('title Three', 'url Three');
INSERT INTO social_media (social_title, social_url) VALUES ('title Four', 'url Four');
