/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云MySQL
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : 39.106.204.166:3306
 Source Schema         : liwy_oscafe_cms

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 05/06/2019 21:11:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cms_channel
-- ----------------------------
DROP TABLE IF EXISTS `cms_channel`;
CREATE TABLE `cms_channel` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '栏目ID',
  `pid` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '父栏目ID',
  `name` varchar(8) NOT NULL COMMENT '名称',
  `orders` int(11) NOT NULL DEFAULT '1' COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COMMENT='栏目表';

-- ----------------------------
-- Table structure for cms_comment
-- ----------------------------
DROP TABLE IF EXISTS `cms_comment`;
CREATE TABLE `cms_comment` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `pid` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '父评论ID',
  `content_id` int(11) unsigned NOT NULL COMMENT '内容ID',
  `txt` longtext NOT NULL COMMENT '评论内容',
  `create_user_id` int(11) unsigned NOT NULL COMMENT '评论人ID',
  `create_ip` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '评论人IP',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COMMENT='评论表';

-- ----------------------------
-- Table structure for cms_content
-- ----------------------------
DROP TABLE IF EXISTS `cms_content`;
CREATE TABLE `cms_content` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '内容ID',
  `channel_id` int(11) unsigned NOT NULL COMMENT '栏目ID',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `cover_img` varchar(255) NOT NULL COMMENT '封面图',
  `description` varchar(255) NOT NULL COMMENT '描述',
  `txt` longtext NOT NULL COMMENT '内容正文',
  `create_user_id` int(11) unsigned NOT NULL COMMENT '创建人ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COMMENT='内容表';

-- ----------------------------
-- Table structure for cms_content_tag_rel
-- ----------------------------
DROP TABLE IF EXISTS `cms_content_tag_rel`;
CREATE TABLE `cms_content_tag_rel` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `content_id` int(11) unsigned NOT NULL COMMENT '内容ID',
  `tag_id` int(11) unsigned NOT NULL COMMENT '标签ID',
  `orders` int(11) NOT NULL DEFAULT '1' COMMENT '排序',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='内容标签关系表';

-- ----------------------------
-- Table structure for cms_content_topic_rel
-- ----------------------------
DROP TABLE IF EXISTS `cms_content_topic_rel`;
CREATE TABLE `cms_content_topic_rel` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `content_id` int(11) unsigned NOT NULL COMMENT '内容ID',
  `topic_id` int(11) unsigned NOT NULL COMMENT '标签ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='内容专题关系表';

-- ----------------------------
-- Table structure for cms_tag
-- ----------------------------
DROP TABLE IF EXISTS `cms_tag`;
CREATE TABLE `cms_tag` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '标签ID',
  `name` varchar(20) NOT NULL COMMENT '标签名称',
  `description` varchar(255) NOT NULL DEFAULT '' COMMENT '描述',
  `icon` varchar(255) NOT NULL DEFAULT '' COMMENT '图标',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_delete` tinyint(1) NOT NULL COMMENT '是否删除',
  PRIMARY KEY (`id`),
  KEY `cms_tag_orders` (`is_delete`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='标签表';

-- ----------------------------
-- Table structure for cms_template
-- ----------------------------
DROP TABLE IF EXISTS `cms_template`;
CREATE TABLE `cms_template` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '模板名称',
  `txt` longtext NOT NULL COMMENT '内容',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='模板表';

-- ----------------------------
-- Table structure for cms_topic
-- ----------------------------
DROP TABLE IF EXISTS `cms_topic`;
CREATE TABLE `cms_topic` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '专题ID',
  `channel_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '栏目ID',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `description` varchar(255) NOT NULL COMMENT '描述',
  `cover_img` varchar(255) NOT NULL COMMENT '封面图',
  `create_user_id` int(11) NOT NULL COMMENT '创建人ID',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='专题表';

SET FOREIGN_KEY_CHECKS = 1;
