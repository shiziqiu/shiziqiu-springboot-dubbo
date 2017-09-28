CREATE TABLE `nc_goods` (
  `goods_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `goods_uuid` varchar(35) NOT NULL COMMENT '商品随机ID',
  `goods_name` varchar(50) NOT NULL COMMENT '商品名称',
  `goods_num` int(11) NOT NULL COMMENT '商品数量',
  `goods_price` double(9,2) NOT NULL COMMENT '商品售价',
  `goods_purch_price` double(9,2) NOT NULL COMMENT '商品采购价',
  `goods_concess_rate` double(9,2) NOT NULL DEFAULT '1.00' COMMENT '商品优惠价',
  `goods_label` varchar(20) NOT NULL COMMENT '商品标签',
  `goods_cover` varchar(150) NOT NULL COMMENT '商品封面图',
  `goods_desc` varchar(200) DEFAULT NULL COMMENT '商户描述',
  `goods_status` tinyint(6) NOT NULL DEFAULT '1' COMMENT '1,下架，2补货，3卖完等',
  `create_time` datetime NOT NULL COMMENT '添加时间',
  `update_time` datetime DEFAULT NULL COMMENT '添加时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='商品表';


CREATE TABLE `nc_goods_details` (
  `goods_detail_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `goods_id` int(20) NOT NULL COMMENT '商品ID',
  `describe` varchar(550) NOT NULL COMMENT '描述',
  `goods_images` varchar(500) NOT NULL COMMENT '商品展示图片集',
  `goods_video` varchar(200) NOT NULL COMMENT '商品展示视频',
  `goods_selling_point` varchar(200) NOT NULL COMMENT '商品卖点',
  `goods_specific` varchar(100) NOT NULL COMMENT '商品规格',
  `goods_size` varchar(100) NOT NULL DEFAULT '1.00' COMMENT '商品大小',
  `create_time` datetime NOT NULL COMMENT '添加时间',
  `update_time` datetime DEFAULT NULL COMMENT '添加时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`goods_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品详情';

CREATE TABLE `nc_goods_evaluate` (
  `evaluate_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '评价ID',
  `goods_id` int(20) NOT NULL COMMENT '商品ID',
  `goods_star` tinyint(2) NOT NULL COMMENT '1,2,3,4,5',
  `evaluate_status` tinyint(2) DEFAULT NULL COMMENT '状态',
  `evaluate_desc` varchar(500) NOT NULL COMMENT '评价内容',
  `account_id` bigint(20) NOT NULL COMMENT '用户ID',
  `account_avtar` varchar(200) NOT NULL COMMENT '用户头像',
  `account_nick_name` varchar(100) NOT NULL COMMENT '用户昵称',
  `evaluate_images` varchar(500) DEFAULT NULL COMMENT '评价图片集合',
  `create_time` datetime NOT NULL COMMENT '添加时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`evaluate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品评价';

CREATE TABLE `nc_goods_express` (
  `express_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '快递ID',
  `goods_id` int(20) NOT NULL COMMENT '商品ID',
  `account_id` bigint(20) NOT NULL COMMENT '用户ID',
  `consign_name` varchar(20) NOT NULL COMMENT '收货人',
  `mobile` varchar(20) NOT NULL COMMENT '手机',
  `express_status` tinyint(2) DEFAULT NULL COMMENT '1，配送中，2已收货，3失效，4已退款',
  `address` varchar(200) NOT NULL COMMENT '用户地址',
  `describe` varchar(200) NOT NULL COMMENT '描述',
  `province` varchar(100) NOT NULL COMMENT '省',
  `province_id` int(20) DEFAULT NULL COMMENT '省份ID',
  `city` varchar(20) NOT NULL COMMENT '城市',
  `city_id` int(20) DEFAULT NULL COMMENT '城市ID',
  `area` varchar(20) NOT NULL COMMENT '地区',
  `area_id` int(20) DEFAULT NULL COMMENT '地区id',
  `create_time` datetime NOT NULL COMMENT '添加时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`express_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品快递';


CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;