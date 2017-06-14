/*
Navicat MySQL Data Transfer

Source Server         : myDatabase
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : mydata

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-06-14 11:57:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(100) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL DEFAULT '123' COMMENT '密码',
  `age` int(100) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '性别',
  `address` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '住址',
  PRIMARY KEY (`id`),
  KEY `user_index` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'liuzhuang', '123', '22', '男', '安徽阜阳');
