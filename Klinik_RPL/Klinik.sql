-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.4.11-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for klinik_rpl
CREATE DATABASE IF NOT EXISTS `klinik_rpl` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `klinik_rpl`;

-- Dumping structure for table klinik_rpl.admin
CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(50) NOT NULL,
  `passowrd` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table klinik_rpl.admin: ~0 rows (approximately)
DELETE FROM `admin`;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;

-- Dumping structure for table klinik_rpl.dokter
CREATE TABLE IF NOT EXISTS `dokter` (
  `id_dokter` int(11) NOT NULL DEFAULT 0,
  `nama` varchar(50) NOT NULL,
  `tanggallahir` varchar(50) DEFAULT NULL,
  `spesialis` varchar(50) NOT NULL,
  PRIMARY KEY (`id_dokter`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table klinik_rpl.dokter: ~0 rows (approximately)
DELETE FROM `dokter`;
/*!40000 ALTER TABLE `dokter` DISABLE KEYS */;
/*!40000 ALTER TABLE `dokter` ENABLE KEYS */;

-- Dumping structure for table klinik_rpl.jadwal
CREATE TABLE IF NOT EXISTS `jadwal` (
  `id_jadwal` int(11) NOT NULL,
  `id_dokter` int(11) NOT NULL,
  `tanggal_cekup` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_jadwal`),
  KEY `FK__dokter` (`id_dokter`),
  CONSTRAINT `FK__dokter` FOREIGN KEY (`id_dokter`) REFERENCES `dokter` (`id_dokter`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table klinik_rpl.jadwal: ~0 rows (approximately)
DELETE FROM `jadwal`;
/*!40000 ALTER TABLE `jadwal` DISABLE KEYS */;
/*!40000 ALTER TABLE `jadwal` ENABLE KEYS */;

-- Dumping structure for table klinik_rpl.obat
CREATE TABLE IF NOT EXISTS `obat` (
  `id_obat` int(11) NOT NULL,
  `nama_obat` varchar(50) DEFAULT NULL,
  `jenis_obat` enum('Kapsul','Sirup') DEFAULT NULL,
  `harga` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table klinik_rpl.obat: ~0 rows (approximately)
DELETE FROM `obat`;
/*!40000 ALTER TABLE `obat` DISABLE KEYS */;
/*!40000 ALTER TABLE `obat` ENABLE KEYS */;

-- Dumping structure for table klinik_rpl.pasien
CREATE TABLE IF NOT EXISTS `pasien` (
  `id_pasien` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL DEFAULT '',
  `alamat` varchar(30) NOT NULL DEFAULT '',
  `gender` enum('Pria','Wanita') NOT NULL,
  `no_hp` varchar(50) NOT NULL DEFAULT '',
  `pekerjaan` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_pasien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table klinik_rpl.pasien: ~0 rows (approximately)
DELETE FROM `pasien`;
/*!40000 ALTER TABLE `pasien` DISABLE KEYS */;
/*!40000 ALTER TABLE `pasien` ENABLE KEYS */;

-- Dumping structure for table klinik_rpl.transaksipasien
CREATE TABLE IF NOT EXISTS `transaksipasien` (
  `id_transaksipasien` int(11) NOT NULL,
  `id_dokter` int(11) NOT NULL,
  `id_pasien` int(11) DEFAULT NULL,
  `id_obat` int(11) DEFAULT NULL,
  `harga_cekup` int(11) NOT NULL,
  `harga_obat` int(11) NOT NULL,
  `total_harga` int(11) NOT NULL,
  PRIMARY KEY (`id_transaksipasien`),
  KEY `FK_transaksipasien_dokter` (`id_dokter`),
  KEY `FK_transaksipasien_pasien` (`id_pasien`),
  KEY `FK_transaksipasien_obat` (`id_obat`),
  CONSTRAINT `FK_transaksipasien_dokter` FOREIGN KEY (`id_dokter`) REFERENCES `dokter` (`id_dokter`),
  CONSTRAINT `FK_transaksipasien_obat` FOREIGN KEY (`id_obat`) REFERENCES `obat` (`id_obat`),
  CONSTRAINT `FK_transaksipasien_pasien` FOREIGN KEY (`id_pasien`) REFERENCES `pasien` (`id_pasien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table klinik_rpl.transaksipasien: ~0 rows (approximately)
DELETE FROM `transaksipasien`;
/*!40000 ALTER TABLE `transaksipasien` DISABLE KEYS */;
/*!40000 ALTER TABLE `transaksipasien` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
