# ssm_shiro
ssm的shiro的demo
drop table if exists t_user_shiro;  
 CREATE TABLE `t_user_shiro` (  
  `id` int(11) primary key auto_increment,  
  `name` varchar(20)  NOT NULL,  
  `age` int(11) DEFAULT NULL,  
  `birthday` date DEFAULT NULL,  
  `password` varchar(20)  NOT NULL  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;  
  
 insert into t_user_shiro values(1,'shang',10,'2013-12-01','123456');  
 insert into t_user_shiro values(2,'apple',34,'1999-12-01','123456');  
 insert into t_user_shiro values(3,'taz372436',23,'2017-12-01','123456');  
