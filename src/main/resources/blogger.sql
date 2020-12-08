/*
Navicat MySQL Data Transfer

Source Server         : mylocal
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : blogger

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2020-12-08 22:04:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `comment_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `post_id` bigint(20) NOT NULL,
  `status` varchar(16) NOT NULL,
  `author` varchar(50) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `url` varchar(100) NOT NULL,
  `content` text NOT NULL,
  `ip` varchar(15) NOT NULL,
  `useragent` varchar(255) NOT NULL,
  `created` int(10) NOT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for meta
-- ----------------------------
DROP TABLE IF EXISTS `meta`;
CREATE TABLE `meta` (
  `meta_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `slug` varchar(200) NOT NULL,
  `type` varchar(32) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `count` bigint(20) NOT NULL,
  PRIMARY KEY (`meta_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of meta
-- ----------------------------
INSERT INTO `meta` VALUES ('1', '分类1', 'category-1', 'category', '分类1', '2');
INSERT INTO `meta` VALUES ('2', '分类2', 'category-2', 'category', '分类2', '2');
INSERT INTO `meta` VALUES ('3', '标签1', 'tag-1', 'tag', '标签1', '4');
INSERT INTO `meta` VALUES ('4', '标签2', 'tag-2', 'tag', '标签2', '4');

-- ----------------------------
-- Table structure for option
-- ----------------------------
DROP TABLE IF EXISTS `option`;
CREATE TABLE `option` (
  `key` varchar(50) NOT NULL,
  `value` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of option
-- ----------------------------
INSERT INTO `option` VALUES ('title', 'XPress');
INSERT INTO `option` VALUES ('keywords', '');
INSERT INTO `option` VALUES ('description', '');
INSERT INTO `option` VALUES ('navbar', '<a href=\"/\" class=\"site-nav\">\n    首页\n</a>\n<a href=\"/categories\" class=\"site-nav\">\n    分类\n</a>\n<a href=\"/tags\" class=\"site-nav\">\n    标签\n</a>\n<a href=\"/about\" class=\"site-nav\">\n    关于\n</a>');
INSERT INTO `option` VALUES ('siteURL', '');
INSERT INTO `option` VALUES ('logo', 'http://www.gravatar.com/avatar/4b2f5068ab4a9ba3ced4cc50acb43721');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `post_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `status` varchar(16) NOT NULL,
  `type` varchar(16) NOT NULL,
  `author_id` bigint(20) NOT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  `title` varchar(200) NOT NULL,
  `content` text NOT NULL,
  `slug` varchar(200) DEFAULT NULL,
  `comments_count` int(10) NOT NULL,
  `is_allow_comments` tinyint(4) NOT NULL,
  `created` int(10) NOT NULL,
  `modified` int(10) NOT NULL,
  PRIMARY KEY (`post_id`),
  KEY `slug` (`slug`(191))
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', 'publish', 'post', '1', '1', '测试文章1', '测试文章1', 'test-post-1', '0', '1', '1570676878', '1570676878');
INSERT INTO `post` VALUES ('2', 'publish', 'post', '1', '1', '测试文章2', '测试文章2', 'test-post-2', '0', '1', '1570676910', '1570676910');
INSERT INTO `post` VALUES ('3', 'publish', 'post', '1', '2', '测试文章3', '测试文章3', 'test-post-3', '0', '1', '1570676939', '1570676939');
INSERT INTO `post` VALUES ('4', 'publish', 'post', '1', '2', '测试文章4', '测试文章4', 'test-post-4', '0', '1', '1570676965', '1570676965');
INSERT INTO `post` VALUES ('5', 'publish', 'page', '1', null, '关于我', '关于我', 'about', '0', '1', '1570676991', '1570676991');

-- ----------------------------
-- Table structure for relationship
-- ----------------------------
DROP TABLE IF EXISTS `relationship`;
CREATE TABLE `relationship` (
  `post_id` bigint(20) NOT NULL,
  `meta_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of relationship
-- ----------------------------
INSERT INTO `relationship` VALUES ('1', '3');
INSERT INTO `relationship` VALUES ('1', '4');
INSERT INTO `relationship` VALUES ('2', '3');
INSERT INTO `relationship` VALUES ('2', '4');
INSERT INTO `relationship` VALUES ('3', '3');
INSERT INTO `relationship` VALUES ('3', '4');
INSERT INTO `relationship` VALUES ('4', '3');
INSERT INTO `relationship` VALUES ('4', '4');

-- ----------------------------
-- Table structure for upload
-- ----------------------------
DROP TABLE IF EXISTS `upload`;
CREATE TABLE `upload` (
  `upload_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `author_id` bigint(20) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `mimetype` varchar(50) NOT NULL,
  `size` bigint(20) NOT NULL,
  `created` int(10) NOT NULL,
  PRIMARY KEY (`upload_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of upload
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `mail` varchar(100) NOT NULL,
  `url` varchar(100) NOT NULL,
  `nickname` varchar(50) NOT NULL,
  `created` int(10) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '7fef6171469e80d32c0559f88b377245', 'admin@admin.com', 'https://www.domain.com/', 'XPress', '1562746093');
