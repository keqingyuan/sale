/*
Navicat MariaDB Data Transfer

Source Server         : 192.168.36.28
Source Server Version : 100022
Source Host           : 192.168.36.28:3306
Source Database       : onion

Target Server Type    : MariaDB
Target Server Version : 100022
File Encoding         : 65001

Date: 2016-08-31 20:20:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for p_category
-- ----------------------------
DROP TABLE IF EXISTS `p_category`;
CREATE TABLE `p_category` (
  `sn` int(11) NOT NULL COMMENT '序号',
  `cid` varchar(50) NOT NULL COMMENT 'category ID',
  `cname` varchar(255) NOT NULL COMMENT '类别名称',
  `status` int(2) unsigned zerofill NOT NULL COMMENT '状态',
  `ctime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `utime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for p_production
-- ----------------------------
DROP TABLE IF EXISTS `p_production`;
CREATE TABLE `p_production` (
  `sn` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `pid` varchar(50) NOT NULL DEFAULT '' COMMENT '商品编号',
  `pname` varchar(255) NOT NULL DEFAULT '' COMMENT '商品名称',
  `cost` decimal(10,2) unsigned zerofill NOT NULL COMMENT '商品进货价',
  `price` decimal(10,2) unsigned zerofill NOT NULL COMMENT '售价',
  `cid` varchar(50) NOT NULL COMMENT '类别ID',
  `sid` varchar(50) NOT NULL COMMENT '种类ID',
  `status` int(2) unsigned zerofill NOT NULL COMMENT '状态',
  `ctime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '商品创建时间',
  `utime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`sn`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for p_sort
-- ----------------------------
DROP TABLE IF EXISTS `p_sort`;
CREATE TABLE `p_sort` (
  `sn` int(11) NOT NULL COMMENT '序号',
  `sid` varchar(50) NOT NULL COMMENT '种类ID',
  `sname` varchar(255) NOT NULL COMMENT '种类名',
  `status` int(2) unsigned zerofill NOT NULL COMMENT '状态',
  `ctime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `utime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`sn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for p_storage
-- ----------------------------
DROP TABLE IF EXISTS `p_storage`;
CREATE TABLE `p_storage` (
  `sn` int(11) NOT NULL COMMENT '序号',
  `pid` varchar(50) NOT NULL COMMENT '商品ID',
  `qty` int(11) NOT NULL,
  `status` int(2) unsigned zerofill NOT NULL COMMENT '状态',
  `ctime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '入库时间',
  `utime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`sn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sale_receiption
-- ----------------------------
DROP TABLE IF EXISTS `sale_receiption`;
CREATE TABLE `sale_receiption` (
  `sn` int(11) NOT NULL,
  `sid` varchar(100) NOT NULL,
  `pid` varchar(50) NOT NULL,
  `qty` int(11) DEFAULT NULL,
  `discount` double(3,2) DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL,
  `receipt` decimal(10,2) DEFAULT NULL,
  `change` decimal(10,2) DEFAULT NULL,
  `status` int(2) unsigned zerofill NOT NULL,
  `ctime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `utime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`sn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
SET FOREIGN_KEY_CHECKS=1;
