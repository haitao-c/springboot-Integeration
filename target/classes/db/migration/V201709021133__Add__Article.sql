DROP TABLE IF EXISTS article;
CREATE TABLE `article` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `creator` varchar(255) NOT NULL,
  `text` longtext NOT NULL,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `article` (`id`,`creator`,`text`,`title`)
VALUES
(1,'/temp/img','main-text','title1'),
(2,'/temp/img','main-text','title2');