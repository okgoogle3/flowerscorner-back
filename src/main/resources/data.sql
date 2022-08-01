INSERT INTO articles (content, likes, title, category_id) VALUES ('content', 1, 'title', 1);
INSERT INTO categories (name) VALUES ('nauka');
INSERT INTO roles(role) VALUES('ROLE_USER');
INSERT INTO roles(role) VALUES('ROLE_MODERATOR');
INSERT INTO roles(role) VALUES('ROLE_ADMIN');
INSERT INTO users (username, email, password)
VALUES ('username', 'email', 'password');
INSERT INTO user_roles(user_id, role_id) values (1,3);
INSERT INTO user_liked_articles (user_id, article_id) VALUES (1, 1);