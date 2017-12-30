CREATE TABLE profile_status (
  profileStatusId BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  profilePicturePath VARCHAR(45),
  pictureName VARCHAR(15),
  header VARCHAR(200)
);


CREATE TABLE user_info (
  userId BIGINT UNIQUE NOT NULL AUTO_INCREMENT PRIMARY KEY,
  userName VARCHAR(15) UNIQUE NOT NULL,
  firstName VARCHAR(10) NOT NULL,
  lastName VARCHAR(10) NOT NULL,
  profileStatusId BIGINT NOT NULL,
  FOREIGN KEY(profileStatusId)
  REFERENCES profile_status(profileStatusId)
);

CREATE TABLE portfolio (
  portfolioId BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  userId BIGINT NOT NULL,
  heading VARCHAR(200),
  FOREIGN KEY (userId)
  REFERENCES user_info(userId)
);

CREATE TABLE file (
  fileId BIGINT NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT,
  fileName VARCHAR (15) NOT NULL,
  fileSize VARCHAR (7),
  filePath VARCHAR (45) NOT NULL,
);

CREATE TABLE portfolio_associated_file (
  portfolioId BIGINT NOT NULL,
  fileId BIGINT NOT NULL,
  FOREIGN KEY (portfolioId)
  REFERENCES portfolio(portfolioId),
  FOREIGN KEY (fileId)
  REFERENCES file(fileId)
);

CREATE TABLE post (
  postId BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  postDate DATETIME NOT NULL,
  userId BIGINT NOT NULL,
  postMessage VARCHAR(235),
  FOREIGN KEY (userId)
  REFERENCES user_info(userId)
);

CREATE TABLE post_file (
  postFileId BIGINT UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  postId BIGINT NOT NULL,
  fileId BIGINT NOT NULL,
  FOREIGN KEY (postId)
  REFERENCES post(postId),
  FOREIGN KEY (fileId)
  REFERENCES file(fileId)
);

CREATE TABLE comment (
  commentId BIGINT NOT NULL UNIQUE PRIMARY KEY AUTO_INCREMENT,
  commentMessage VARCHAR (235),
  postId BIGINT NOT NULL,
  FOREIGN KEY (postId)
  REFERENCES post(postId)
);

CREATE TABLE comment_file (
  commentFileId UNIQUE NOT NULL PRIMARY KEY AUTO_INCREMENT,
  commentId BIGINT NOT NULL,
  FOREIGN KEY (commentId)
  REFERENCES comment(commentId)
);