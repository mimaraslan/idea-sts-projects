CREATE SCHEMA `companydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
-- =======================
CREATE TABLE `companydb`.`customers` (
  `customer_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NULL,
  `phone` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  PRIMARY KEY (`customer_id`))
ENGINE = InnoDB;
-- =======================
INSERT INTO `companydb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Burak', 'Delice', '55555', 'TR');
INSERT INTO `companydb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Mehmet', 'Caner', '66666', 'UK');
-- =======================
SELECT * FROM companydb.customers;