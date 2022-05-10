INSERT INTO articles (content, likes, title, category_id) VALUES ('content', 1, 'title', 1);
INSERT INTO categories (name) VALUES ('nauka');
INSERT INTO users (email, hash_pass, phone_number, photo_link, role, username) 
VALUES ('email', 'hash_pass', 'phone_number', 'photo_link', 1, 'username');
INSERT INTO user_liked_articles (user_id, article_id) VALUES (1, 1);