DROP DATABASE IF EXISTS drugstoreDB;

CREATE DATABASE IF NOT EXISTS drugstoreDB;

USE drugstoreDB;

--
-- Table structure for table 'users'
--
CREATE TABLE IF NOT EXISTS drugstoreDB.users (
	userId SMALLINT UNSIGNED AUTO_INCREMENT,
	userName VARCHAR(50) NOT NULL,
        userOwner VARCHAR(100) NOT NULL,
	userPassword VARCHAR(255) NOT NULL,
        userState SET('Active','Inactive') DEFAULT 'Active',
        userCreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        userUpdatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
        PRIMARY KEY(userId),
        CONSTRAINT minLengthUserName CHECK(CHAR_LENGTH(userName) >= 6),
        CONSTRAINT minLengthPassword CHECK(CHAR_LENGTH(userPassword) >= 6),
        CONSTRAINT userNameUnique UNIQUE(userName)
);

--
-- inserting a default user --
--
INSERT INTO drugstoreDB.users (users.userName, users.userOwner, users.userPassword) VALUES('ricochi','JUAN RICARDO CORREA CHIMBACO','123456');