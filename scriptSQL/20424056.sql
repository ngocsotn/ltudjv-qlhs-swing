/*
 Navicat Premium Data Transfer

 Source Server         : xampp_mysql_local
 Source Server Type    : MySQL
 Source Server Version : 100414
 Source Host           : localhost:3306
 Source Schema         : quanly_hocsinh

 Target Server Type    : MySQL
 Target Server Version : 100414
 File Encoding         : 65001

 Date: 03/05/2021 19:05:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hocsinh
-- ----------------------------
DROP TABLE IF EXISTS `hocsinh`;
CREATE TABLE `hocsinh`  (
  `mhs` int(11) NOT NULL,
  `tenhs` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `diem` double NOT NULL,
  `hinhanh` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `diachi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ghichu` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  PRIMARY KEY (`mhs`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_vietnamese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hocsinh
-- ----------------------------
INSERT INTO `hocsinh` VALUES (1, 'Nguyễn Văn A', 6.5, 'C:\\Users\\NGOC\\Pictures\\p\\12887.jpg', 'VN', 'Không có');
INSERT INTO `hocsinh` VALUES (2, 'Trần Văn B', 9.9, 'C:\\Users\\NGOC\\Pictures\\p\\12887.jpg', 'Việt Nam; HCM', 'Học sinh giỏi');
INSERT INTO `hocsinh` VALUES (3, 'Lê Thị C', 7.8, 'null', 'Việt Nam; HCM; Q5', 'Học sinh Khá');
INSERT INTO `hocsinh` VALUES (4, 'Hứa Văn D', 4.5, 'null', 'Việt Nam; HCM; Q5', 'Học sinh Yếu');
INSERT INTO `hocsinh` VALUES (5, 'hs mới', 7.1, '', 'VN', 'chuyển trường');
INSERT INTO `hocsinh` VALUES (6, 'HS lạ', 6.9, '', 'Mỹ', 'HS nước ngoài');
INSERT INTO `hocsinh` VALUES (7, 'hs7', 6, '', '2342342343124', '324234');
INSERT INTO `hocsinh` VALUES (8, 'HS số 88888', 8, '8', '8', '8');
INSERT INTO `hocsinh` VALUES (9, 'hs 9', 5, 'C:\\Users\\NGOC\\Pictures\\p\\candles-minimalism-pic.jpg', 'dsads4235345345435', 'ssasdsasa');

SET FOREIGN_KEY_CHECKS = 1;
