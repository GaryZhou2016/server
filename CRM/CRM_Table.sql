CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(60) NOT NULL,
  `lastname` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `office` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `address` varchar(240) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `office_customer` (
  `cid` int(11) NOT NULL,
  `oid` int(11) NOT NULL,
  KEY `office_customer_ibfk_1` (`cid`),
  KEY `office_customer_ibfk_2` (`oid`),
  CONSTRAINT `office_customer_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `customer` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `office_customer_ibfk_2` FOREIGN KEY (`oid`) REFERENCES `office` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;