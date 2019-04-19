DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS category;


CREATE TABLE IF NOT EXISTS category(id varchar(32) unsigned not null primary key,name varchar(32));



CREATE TABLE IF NOT EXISTS product(id varchar(32) unsigned not null primary key,name varchar(32),price int,stock int , description varchar (128) , category_type varchar (32));

INSERT INTO category(id, name) VALUES ('1', '水果'),
('2', '电子产品');



INSERT INTO product(id, name, price,category_type) VALUES ('1', '苹果', 20,'1'),
('2', '梨', 10,'1'),
('3', '桃子', 123,'1'),
('4', '香蕉', 11,'1'),
('5', '猕猴桃', 50,'1'),
('6', '桔子', 33,'1'),
('7', '菠萝', 90,'1'),
('8', '芒果', 766,'1'),
('9', '红枣', 29,'1'),
('10', '榴莲', 990,'1'),
('11', '柚子', 291,'1'),
('12', '小番茄', 200,'1');