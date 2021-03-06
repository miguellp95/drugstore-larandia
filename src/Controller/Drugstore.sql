-- MySQL Script generated by MySQL Workbench
-- Fri Sep 17 01:52:58 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Drugstore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Drugstore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Drugstore` DEFAULT CHARACTER SET UTF8MB4 ;
USE `Drugstore` ;

-- -----------------------------------------------------
-- Table `Drugstore`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Users` (
  `userId` SMALLINT NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(50) NOT NULL,
  `userOwner` VARCHAR(100) NOT NULL,
  `userPassword` VARCHAR(255) NOT NULL,
  `userState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  `userCreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `userUpdatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`userId`),
  UNIQUE INDEX `userName_UNIQUE` (`userName` ASC) VISIBLE,
  UNIQUE INDEX `userOwner_UNIQUE` (`userOwner` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Company`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Company` (
  `id` VARCHAR(12) NOT NULL,
  `name` VARCHAR(120) NOT NULL,
  `fullNameOwner` VARCHAR(100) NOT NULL,
  `numberPhone` VARCHAR(10) NOT NULL,
  `address` VARCHAR(50) NOT NULL,
  `email` VARCHAR(30) NOT NULL,
  `logo` BLOB NULL DEFAULT NULL,
  `createdAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Semaforo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Semaforo` (
  `semaforoId` SMALLINT NOT NULL AUTO_INCREMENT,
  `semaforoColor` VARCHAR(20) NOT NULL,
  `semaforoNumberDays` INT NOT NULL,
  `semaforoState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`semaforoId`),
  UNIQUE INDEX `colorSemaforo_UNIQUE` (`semaforoColor` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Contact`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Contact` (
  `contactId` VARCHAR(12) NOT NULL,
  `contactName` VARCHAR(45) NOT NULL,
  `contactIsEnterprise` TINYINT NOT NULL DEFAULT 1,
  `contactNumberPhone` VARCHAR(12) NULL,
  `contactAddress` VARCHAR(50) NULL,
  `contactEmail` VARCHAR(30) NULL,
  `contactState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  `contactCreatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `contactUpdatedAt` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`contactId`),
  UNIQUE INDEX `providerName_UNIQUE` (`contactName` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Categories` (
  `categoryId` SMALLINT NOT NULL AUTO_INCREMENT,
  `categoryName` VARCHAR(20) NOT NULL,
  `categoryDescription` VARCHAR(100) NULL,
  `categoryState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`categoryId`),
  UNIQUE INDEX `categoryName_UNIQUE` (`categoryName` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Package`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Package` (
  `packageId` SMALLINT NOT NULL AUTO_INCREMENT,
  `packageName` VARCHAR(30) NOT NULL,
  `packageDesciption` VARCHAR(100) NULL,
  `packageState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`packageId`),
  UNIQUE INDEX `packageName_UNIQUE` (`packageName` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Units`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Units` (
  `unitId` SMALLINT NOT NULL AUTO_INCREMENT,
  `unitName` VARCHAR(45) NOT NULL,
  `unitPackageId` SMALLINT NOT NULL,
  `unitPieces` MEDIUMINT UNSIGNED NOT NULL,
  `unitState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`unitId`),
  UNIQUE INDEX `unitName_UNIQUE` (`unitName` ASC) VISIBLE,
  INDEX `fk_package_idx` (`unitPackageId` ASC) VISIBLE,
  CONSTRAINT `fkUnits_package`
    FOREIGN KEY (`unitPackageId`)
    REFERENCES `Drugstore`.`Package` (`packageId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Labs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Labs` (
  `labId` SMALLINT NOT NULL AUTO_INCREMENT,
  `labName` VARCHAR(70) NOT NULL,
  `labDescription` VARCHAR(150) NULL,
  `labState` SET('Active', 'Inactive') NULL DEFAULT 'Active',
  PRIMARY KEY (`labId`),
  UNIQUE INDEX `labName_UNIQUE` (`labName` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Meds`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Meds` (
  `medId` INT NOT NULL AUTO_INCREMENT,
  `medName` VARCHAR(50) NOT NULL,
  `medReference` VARCHAR(30) NULL,
  `medCategoryId` SMALLINT NULL,
  `medDescription` VARCHAR(150) NULL,
  `medPieces` INT NOT NULL DEFAULT 0,
  `medState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`medId`),
  UNIQUE INDEX `medName_UNIQUE` (`medName` ASC) VISIBLE,
  UNIQUE INDEX `medReference_UNIQUE` (`medReference` ASC) VISIBLE,
  INDEX `fk_categoryId_idx` (`medCategoryId` ASC) VISIBLE,
  CONSTRAINT `fkMeds_categoryId`
    FOREIGN KEY (`medCategoryId`)
    REFERENCES `Drugstore`.`Categories` (`categoryId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Lots`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Lots` (
  `lotId` VARCHAR(50) NOT NULL,
  `lotMedId` INT NOT NULL,
  `lotPieces` INT NOT NULL,
  `lotLabId` SMALLINT NOT NULL,
  `lotUnitId` SMALLINT NOT NULL,
  `lotInvima` VARCHAR(30) NOT NULL,
  `lotCodebar` VARCHAR(20) NOT NULL,
  `lotExpireDate` TIMESTAMP NOT NULL,
  PRIMARY KEY (`lotId`),
  INDEX `fk_medId_idx` (`lotMedId` ASC) VISIBLE,
  INDEX `fk_labId_idx` (`lotLabId` ASC) VISIBLE,
  INDEX `fk_unitId_idx` (`lotUnitId` ASC) VISIBLE,
  CONSTRAINT `fkLots_medId`
    FOREIGN KEY (`lotMedId`)
    REFERENCES `Drugstore`.`Meds` (`medId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkLots_labId`
    FOREIGN KEY (`lotLabId`)
    REFERENCES `Drugstore`.`Labs` (`labId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkLots_unitId`
    FOREIGN KEY (`lotUnitId`)
    REFERENCES `Drugstore`.`Units` (`unitId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`SemaforoLots`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`SemaforoLots` (
  `semaforo_fk` SMALLINT NOT NULL,
  `lots_fk` VARCHAR(50) NOT NULL,
  `dateSemafored` TIMESTAMP NOT NULL,
  PRIMARY KEY (`semaforo_fk`, `lots_fk`),
  INDEX `fk_Semaforo_has_Lots_Lots1_idx` (`lots_fk` ASC) VISIBLE,
  INDEX `fk_Semaforo_has_Lots_Semaforo1_idx` (`semaforo_fk` ASC) VISIBLE,
  CONSTRAINT `fk_Semaforo_has_Lots_Semaforo1`
    FOREIGN KEY (`semaforo_fk`)
    REFERENCES `Drugstore`.`Semaforo` (`semaforoId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Semaforo_has_Lots_Lots1`
    FOREIGN KEY (`lots_fk`)
    REFERENCES `Drugstore`.`Lots` (`lotId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`warehouse`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`warehouse` (
  `warehouseId` SMALLINT NOT NULL AUTO_INCREMENT,
  `warehouseName` VARCHAR(45) NOT NULL,
  `warehouseDescription` VARCHAR(255) NOT NULL,
  `warehouseState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  `warehouseCreatedAt` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `warehouseUpdatedAt` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`warehouseId`),
  UNIQUE INDEX `warehouseName_UNIQUE` (`warehouseName` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Products` (
  `productId` INT NOT NULL AUTO_INCREMENT,
  `productName` VARCHAR(70) NOT NULL,
  `productReference` VARCHAR(50) NULL,
  `productMedId` INT NULL,
  `productCategoryId` SMALLINT NOT NULL,
  `productUnitId` SMALLINT NOT NULL,
  `productCodebar` VARCHAR(20) NULL,
  `warehouseId` SMALLINT NOT NULL,
  `productState` SET('Active', 'Inactive') NOT NULL DEFAULT 'Active',
  PRIMARY KEY (`productId`),
  UNIQUE INDEX `productName_UNIQUE` (`productName` ASC) VISIBLE,
  UNIQUE INDEX `productReference_UNIQUE` (`productReference` ASC) VISIBLE,
  INDEX `fk_medId_idx` (`productMedId` ASC) VISIBLE,
  INDEX `fk_categoryId_idx` (`productCategoryId` ASC) VISIBLE,
  INDEX `fk_unitId_idx` (`productUnitId` ASC) VISIBLE,
  INDEX `fkProducts_warehouseId_idx` (`warehouseId` ASC) VISIBLE,
  CONSTRAINT `fkProducts_medId`
    FOREIGN KEY (`productMedId`)
    REFERENCES `Drugstore`.`Meds` (`medId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkProducts_categoryId`
    FOREIGN KEY (`productCategoryId`)
    REFERENCES `Drugstore`.`Categories` (`categoryId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkProducts_unitId`
    FOREIGN KEY (`productUnitId`)
    REFERENCES `Drugstore`.`Units` (`unitId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkProducts_warehouseId`
    FOREIGN KEY (`warehouseId`)
    REFERENCES `Drugstore`.`warehouse` (`warehouseId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Buys`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Buys` (
  `buyId` INT NOT NULL AUTO_INCREMENT,
  `buyContactId` VARCHAR(12) NOT NULL,
  `buyBillNumber` VARCHAR(20) NOT NULL,
  `buyDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `buyTotal` INT NOT NULL DEFAULT 0,
  `buyState` SET('Active', 'Inactive') NULL DEFAULT 'Active',
  PRIMARY KEY (`buyId`),
  INDEX `fk_contactId_idx` (`buyContactId` ASC) VISIBLE,
  CONSTRAINT `fkBuys_contactId`
    FOREIGN KEY (`buyContactId`)
    REFERENCES `Drugstore`.`Contact` (`contactId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`Sells`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`Sells` (
  `sellId` INT NOT NULL AUTO_INCREMENT,
  `sellContactId` VARCHAR(12) NOT NULL,
  `sellUserId` SMALLINT NULL,
  `sellTotal` INT NOT NULL DEFAULT 0,
  `sellDate` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `sellState` SET('0', '1', '2') NOT NULL DEFAULT 0,
  PRIMARY KEY (`sellId`),
  INDEX `fk_contactId_idx` (`sellContactId` ASC) VISIBLE,
  INDEX `fkSells_userId_idx` (`sellUserId` ASC) VISIBLE,
  CONSTRAINT `fkSells_contactId`
    FOREIGN KEY (`sellContactId`)
    REFERENCES `Drugstore`.`Contact` (`contactId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkSells_userId`
    FOREIGN KEY (`sellUserId`)
    REFERENCES `Drugstore`.`Users` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`BuyDetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`BuyDetail` (
  `buyDetailId` INT NOT NULL AUTO_INCREMENT,
  `buyDetailBuyId` INT NOT NULL,
  `buyDetailProductId` INT NULL,
  `buyDetailLotId` VARCHAR(50) NULL,
  `buyDetailPieces` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`buyDetailId`),
  INDEX `fk_buyId_idx` (`buyDetailBuyId` ASC) VISIBLE,
  INDEX `fk_productId_idx` (`buyDetailProductId` ASC) VISIBLE,
  INDEX `fk_lotId_idx` (`buyDetailLotId` ASC) VISIBLE,
  CONSTRAINT `fkBuyDetail_buyId`
    FOREIGN KEY (`buyDetailBuyId`)
    REFERENCES `Drugstore`.`Buys` (`buyId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkBuyDetail_productId`
    FOREIGN KEY (`buyDetailProductId`)
    REFERENCES `Drugstore`.`Products` (`productId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkBuyDetail_lotId`
    FOREIGN KEY (`buyDetailLotId`)
    REFERENCES `Drugstore`.`Lots` (`lotId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`SellDetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`SellDetail` (
  `sellDetailId` INT NOT NULL AUTO_INCREMENT,
  `sellDetaildSellId` INT NOT NULL,
  `sellDetailProductId` INT NULL,
  `selldetailLotId` VARCHAR(50) NULL,
  `sellDetailPieces` SMALLINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`sellDetailId`),
  INDEX `fk_sellId_idx` (`sellDetaildSellId` ASC) VISIBLE,
  INDEX `fk_productId_idx` (`sellDetailProductId` ASC) VISIBLE,
  INDEX `fk_medId_idx` (`selldetailLotId` ASC) VISIBLE,
  CONSTRAINT `fkSellDetail_sellId`
    FOREIGN KEY (`sellDetaildSellId`)
    REFERENCES `Drugstore`.`Sells` (`sellId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkSellDetail_productId`
    FOREIGN KEY (`sellDetailProductId`)
    REFERENCES `Drugstore`.`Products` (`productId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkSellDetail_medId`
    FOREIGN KEY (`selldetailLotId`)
    REFERENCES `Drugstore`.`Lots` (`lotId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Drugstore`.`inventory`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Drugstore`.`inventory` (
  `inventoryId` INT NOT NULL AUTO_INCREMENT,
  `inventoryProductId` INT NULL,
  `inventoryInitial` INT NULL,
  `inventoryMin` INT NULL,
  `inventoryMax` INT NULL,
  `inventoryMeanCost` DECIMAL NULL,
  `inventoryCurrentCount` INT NULL,
  PRIMARY KEY (`inventoryId`),
  INDEX `fkInventory_productId_idx` (`inventoryProductId` ASC) VISIBLE,
  CONSTRAINT `fkInventory_productId`
    FOREIGN KEY (`inventoryProductId`)
    REFERENCES `Drugstore`.`Products` (`productId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
