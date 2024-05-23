create table user_profiles(
	user_id int(10) unsigned not null auto_increment comment 'user id',
    user_name varchar(255) not null default '' comment 'User Name',
    user_email varchar(255) not null default '' comment 'User Email',
    user_password varchar(255) not null default '' comment 'User Password',
    primary key(user_id));

select * from user_profiles;

create table user_profiles_modified like user_profiles;

alter table user_profiles_modified
add column created_on datetime default current_timestamp not null comment 'Modified On after user_id',
add column modified_on datetime default current_timestamp not null comment 'Modified On after created_on',
add column deleted_on datetime default current_timestamp not null comment 'deleted On after modified_on';

select * from user_profiles_modified;

alter table `user_profiles_modified` change `user_id` `user_id` int(10) unsigned not null default 0 comment 'User id', drop primary key;
alter table `user_profiles_modified` add column `id` int(10) unsigned not null auto_increment comment 'Runner id' first, add primary key(`id`);
    
desc user_profiles_modified;
desc user_profiles;

use coforgedata;

-- Procedure-1 --
DELIMITER $$
CREATE TRIGGER before_user_profiles_modified
BEFORE UPDATE ON `user_profiles`
FOR EACH ROW
BEGIN
    INSERT INTO user_profiles_modified (
        modified_on, 
        user_id, 
        user_name, 
        user_email, 
        user_password
    ) 
    VALUES (
        NOW(), 
        OLD.user_id, 
        OLD.user_name, 
        OLD.user_email, 
        OLD.user_password
    );
END $$
DELIMITER ;

select * from user_profiles;
select * from user_profiles_modified;
update user_profiles set user_name="Sam" where user_id=1;
drop trigger before_user_profiles_modified;
TRUNCATE TABLE user_profiles_modified;
insert into user_profiles values(1, 'Sam', 'sam@gmail.com', '1234');

--  Procedure-2(Blog & Audit) --
CREATE TABLE `blog` (
	`id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`title` text,
	`content` text,
	`deleted` tinyint(1) unsigned NOT NULL DEFAULT '0',
	PRIMARY KEY (`id`),
	KEY `ix_deleted` (`deleted`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='Blog posts';

CREATE TABLE `audit` (
	`id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`blog_id` mediumint(8) unsigned NOT NULL,
	`changetype` enum('NEW','EDIT','DELETE') NOT NULL,
	`changetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	PRIMARY KEY (`id`),
	KEY `ix_blog_id` (`blog_id`),
	KEY `ix_changetype` (`changetype`),
	KEY `ix_changetime` (`changetime`),
	CONSTRAINT `FK_audit_blog_id` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DELIMITER $$
CREATE
	TRIGGER `blog_after_insert` AFTER INSERT 
	ON `blog` 
	FOR EACH ROW BEGIN
		IF NEW.deleted THEN
			SET @changetype = 'DELETE';
		ELSE
			SET @changetype = 'NEW';
		END IF;
		INSERT INTO audit (blog_id, changetype) VALUES (NEW.id, @changetype);
END$$

DELIMITER $$
CREATE
	TRIGGER `blog_after_update` AFTER UPDATE 
	ON `blog` 
	FOR EACH ROW BEGIN
		IF NEW.deleted THEN
			SET @changetype = 'DELETE';
		ELSE
			SET @changetype = 'EDIT';
		END IF;
		INSERT INTO audit (blog_id, changetype) VALUES (NEW.id, @changetype);
    END$$
DELIMITER;

select * from blog;
select * from audit;
insert into blog(title, content) values('Article One', 'Initial Text');
update blog set content="Edited Text" where id=1;

-- Procedure-3 --
drop table if exists user_info;
drop table if exists user_avatar;
drop table if exists user_wallet;

create table user_info (
  user_id int unsigned not null auto_increment,
  name varchar(32) default null,
  status int unsigned not null default 0,
  primary key (user_id)
);

create table user_avatar (
  user_id int unsigned not null,
  dress_coordinate_id int unsigned not null default 123,
  makeup_coordinate_id int unsigned not null default 456
);

create table user_wallet (
  user_id int unsigned not null,
  coin int unsigned not null default 100,
  coin_free int unsigned not null default 0
)

delimiter #
create trigger user_info_after_ins_trig after insert on user_info
for each row
begin
  insert into user_avatar (user_id) values (new.user_id);
  insert into user_wallet (user_id) values (new.user_id);
end#
delimiter ;

select * from user_info;
insert into user_info values(1, 'Sam', 0);
select * from user_avatar;
select * from user_wallet;
