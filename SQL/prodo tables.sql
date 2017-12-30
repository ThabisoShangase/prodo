CREATE TABLE profile_status (
  profile_status_id BIGINT UNIQUE NOT NULL AUTO_INCREMENT,
  profile_picture_path VARCHAR(45),
  picture_name VARCHAR(15),
  header VARCHAR(200),
  PRIMARY KEY(profile_status_id)
);

CREATE TABLE file_info (
  file_id BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  file_name VARCHAR (15) NOT NULL,
  file_nize VARCHAR (7),
  file_path VARCHAR (45) NOT NULL
);

CREATE TABLE user_info (
  user_id BIGINT UNIQUE NOT NULL AUTO_INCREMENT,
  user_name VARCHAR(15) UNIQUE NOT NULL,
  first_name VARCHAR(10) NOT NULL,
  last_name VARCHAR(10) NOT NULL,
  profile_status_id BIGINT NOT NULL,
  PRIMARY KEY(user_id),
  FOREIGN KEY(profile_status_id)
  REFERENCES profile_status(profile_status_id)
);

CREATE TABLE portfolio (
  portfolio_id BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  user_id BIGINT NOT NULL,
  heading VARCHAR(200),
  FOREIGN KEY (user_id)
  REFERENCES user_info(user_id)
);

CREATE TABLE portfolio_associated_file (
  asscociated_file_id BIGINT NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT,
  portfolio_id BIGINT NOT NULL,
  file_id BIGINT NOT NULL,
  FOREIGN KEY (portfolio_id)
  REFERENCES portfolio(portfolio_id),
  FOREIGN KEY (file_id)
  REFERENCES file_info(file_id)
);

CREATE TABLE post (
  post_id BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  post_date DATETIME NOT NULL,
  user_id BIGINT NOT NULL,
  post_message VARCHAR(235),
  FOREIGN KEY (user_id)
  REFERENCES user_info(user_id)
);

CREATE TABLE post_file (
  post_file_id BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  post_id BIGINT NOT NULL,
  file_id BIGINT NOT NULL,
  FOREIGN KEY (post_id)
  REFERENCES post(post_id),
  FOREIGN KEY (file_id)
  REFERENCES file_info(file_id)
);

CREATE TABLE comment_info (
  comment_id BIGINT NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT,
  comment_message VARCHAR (235),
  post_id BIGINT NOT NULL,
  FOREIGN KEY (post_id)
  REFERENCES post(post_id)
);

CREATE TABLE comment_file (
  comment_file_id BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  comment_id BIGINT NOT NULL,
  file_id BIGINT NOT NULL,
  FOREIGN KEY (comment_id)
  REFERENCES comment_info(comment_id),
  FOREIGN KEY (file_id)
  REFERENCES file_info(file_id)
);