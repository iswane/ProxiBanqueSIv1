-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 28 Décembre 2017 à 19:00
-- Version du serveur :  5.6.21
-- Version de PHP :  5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `v1proxibanquesi`
--

-- --------------------------------------------------------

--
-- Structure de la table `agence`
--

CREATE TABLE IF NOT EXISTS `agence` (
`idAgence` bigint(20) NOT NULL,
  `numIdentAgence` varchar(5) NOT NULL DEFAULT '0',
  `dateCreateAgence` date NOT NULL DEFAULT '0000-00-00',
  `idLocalite` bigint(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `agence`
--

INSERT INTO `agence` (`idAgence`, `numIdentAgence`, `dateCreateAgence`, `idLocalite`) VALUES
(1, 'OBJ01', '2017-12-14', 1),
(2, 'CBP02', '2017-12-14', 2),
(3, 'HLM03', '2017-12-14', 3),
(4, 'GDY04', '2017-12-19', 4),
(5, 'TOU05', '2017-12-19', 5),
(6, 'TIV06', '2017-12-19', 6),
(7, 'MED07', '2017-12-19', 7),
(8, 'MEC08', '2017-12-19', 8),
(9, 'MBO09', '2017-12-19', 9),
(10, 'AIDB1', '2017-12-19', 10),
(11, 'ROM11', '2017-12-19', 11);

-- --------------------------------------------------------

--
-- Structure de la table `carteBancaire`
--

CREATE TABLE IF NOT EXISTS `carteBancaire` (
`idCarte` bigint(20) NOT NULL,
  `numCarte` bigint(20) NOT NULL DEFAULT '0',
  `descriptionCarte` varchar(50) NOT NULL DEFAULT '0',
  `idClient` bigint(20) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
`idClient` bigint(20) NOT NULL,
  `codeClient` varchar(50) NOT NULL DEFAULT '0',
  `nomClient` varchar(50) NOT NULL DEFAULT '0',
  `prenomClient` varchar(50) NOT NULL DEFAULT '0',
  `telClient` varchar(50) NOT NULL DEFAULT '0',
  `emailClient` varchar(50) NOT NULL DEFAULT '0',
  `adresseClient` varchar(50) NOT NULL DEFAULT '0',
  `codePostClient` varchar(50) NOT NULL DEFAULT '0',
  `villeClient` varchar(50) NOT NULL DEFAULT '0',
  `professionClient` varchar(50) NOT NULL DEFAULT '0',
  `idEmploye` bigint(20) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE IF NOT EXISTS `compte` (
`idCompte` bigint(20) NOT NULL,
  `numCompte` bigint(20) NOT NULL DEFAULT '0',
  `dateOuvertCompte` date NOT NULL DEFAULT '0000-00-00',
  `soldeCompte` double NOT NULL DEFAULT '0',
  `decouvert` double NOT NULL,
  `taux` double NOT NULL,
  `codeCEpargne` varchar(50) NOT NULL,
  `codeCCourant` varchar(50) NOT NULL,
  `idClient` bigint(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `compteUser`
--

CREATE TABLE IF NOT EXISTS `compteUser` (
`idCompteUser` int(11) NOT NULL,
  `dateCreateCompteUser` date NOT NULL DEFAULT '0000-00-00',
  `etatCompteUser` tinyint(4) NOT NULL DEFAULT '0',
  `loginUser` varchar(50) NOT NULL DEFAULT '0',
  `passwdUser` varchar(300) NOT NULL DEFAULT '0',
  `idEmploye` bigint(20) NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `compteUser`
--

INSERT INTO `compteUser` (`idCompteUser`, `dateCreateCompteUser`, `etatCompteUser`, `loginUser`, `passwdUser`, `idEmploye`) VALUES
(20, '2017-12-22', 1, 'admin', '8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918', 32),
(21, '2017-12-22', 1, 'isWane', 'b94980a3de72ebcdb4f4fe330a109bbda3b4399fbd934701e96a3d3c5d5d5484', 33),
(22, '2017-12-22', 1, 'objis', 'b94980a3de72ebcdb4f4fe330a109bbda3b4399fbd934701e96a3d3c5d5d5484', 34);

-- --------------------------------------------------------

--
-- Structure de la table `compte_transaction`
--

CREATE TABLE IF NOT EXISTS `compte_transaction` (
  `idCompte` bigint(20) DEFAULT NULL,
  `idTransaction` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `Employe`
--

CREATE TABLE IF NOT EXISTS `Employe` (
`idEmploye` bigint(20) NOT NULL,
  `codeEmploye` varchar(50) DEFAULT NULL,
  `nomEmploye` varchar(50) NOT NULL DEFAULT '0',
  `prenomEmploye` varchar(50) NOT NULL DEFAULT '0',
  `telEmploye` varchar(50) NOT NULL DEFAULT '0',
  `emailEmploye` varchar(50) NOT NULL DEFAULT '0',
  `adresseEmploye` varchar(50) NOT NULL DEFAULT '0',
  `idAgence` bigint(20) DEFAULT '0',
  `idRole` bigint(20)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `Employe`
--

INSERT INTO `Employe` (`idEmploye`, `codeEmploye`, `nomEmploye`, `prenomEmploye`, `telEmploye`, `emailEmploye`, `adresseEmploye`, `idAgence`, `idRole`) VALUES
(32, 'AAAAA', 'Kossoré', 'Awa', '77 962 97 06', 'admin@proxibanque.sn', 'Firdawsi', 1, 3),
(33, 'BBBBB', 'WANE', 'Abdoulaye', '771877187', 'laye@proxibanque.sn', 'Grand Yoff', 2, 1),
(34, 'CCCCC', 'Mbiandou', 'Douglas', '77 777 77 77', 'objis@proxibanque.sn', 'Centre BOPP', 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `localite`
--

CREATE TABLE IF NOT EXISTS `localite` (
`idLocalite` bigint(20) NOT NULL,
  `nomLocalite` varchar(50) NOT NULL DEFAULT '0',
  `logitudeLocalite` varchar(50) NOT NULL DEFAULT '0',
  `latitudeLocalite` varchar(50) NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `localite`
--

INSERT INTO `localite` (`idLocalite`, `nomLocalite`, `logitudeLocalite`, `latitudeLocalite`) VALUES
(1, 'Objis', '14''''12"35', '25"66"65'),
(2, 'Centre BOPP', '16"25"61', '26"46"63'),
(3, 'HLM', '12"64"69', '52"56"97'),
(4, 'Grand Yoff', '11''''75''''02', '62''''35''''34'),
(5, 'Touba', '62''''85''''26', '06''''25''''55'),
(6, 'Tivaoune', '13''''65''''25', '96''''36''''25'),
(7, 'Médine', '79''''56''''26', '99''''25''''99'),
(8, 'Mecque', '99''''99''''99', '99''''99''''99'),
(9, 'Mbour', '12''''25''''35', '44''''55''''66'),
(10, 'AIDB', '25"15"11', '15"51"55'),
(11, 'Rome', '26"21"51', '51"55"52');

-- --------------------------------------------------------

--
-- Structure de la table `Role`
--

CREATE TABLE IF NOT EXISTS `Role` (
`idRole` bigint(20) NOT NULL,
  `codeRole` varchar(50) NOT NULL DEFAULT '0',
  `nomRole` varchar(50) NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Contenu de la table `Role`
--

INSERT INTO `Role` (`idRole`, `codeRole`, `nomRole`) VALUES
(1, '26BGH25', 'Gérant'),
(2, '65dfv98', 'Conseiller'),
(3, '25JHD2', 'Admin');

-- --------------------------------------------------------

--
-- Structure de la table `Transaction`
--

CREATE TABLE IF NOT EXISTS `Transaction` (
`idTransaction` bigint(20) NOT NULL,
  `numTransaction` bigint(20) NOT NULL DEFAULT '0',
  `dateTransaction` date NOT NULL DEFAULT '0000-00-00',
  `montantTransaction` double NOT NULL DEFAULT '0',
  `idEmploye` bigint(20) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `TypeCarte`
--

CREATE TABLE IF NOT EXISTS `TypeCarte` (
`idTypeCarte` bigint(20) NOT NULL,
  `libelleTypeCarte` varchar(50) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `agence`
--
ALTER TABLE `agence`
 ADD PRIMARY KEY (`idAgence`), ADD KEY `FK_agence_localite` (`idLocalite`);

--
-- Index pour la table `carteBancaire`
--
ALTER TABLE `carteBancaire`
 ADD PRIMARY KEY (`idCarte`), ADD KEY `FK_carteBancaire_client` (`idClient`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
 ADD PRIMARY KEY (`idClient`), ADD KEY `FK_client_Employe` (`idEmploye`);

--
-- Index pour la table `compte`
--
ALTER TABLE `compte`
 ADD PRIMARY KEY (`idCompte`), ADD KEY `FK_compte_client` (`idClient`);

--
-- Index pour la table `compteUser`
--
ALTER TABLE `compteUser`
 ADD PRIMARY KEY (`idCompteUser`), ADD KEY `FK_compteUser_Employe` (`idEmploye`);

--
-- Index pour la table `compte_transaction`
--
ALTER TABLE `compte_transaction`
 ADD KEY `FK_compte_transaction_compte` (`idCompte`), ADD KEY `FK_compte_transaction_Transaction` (`idTransaction`);

--
-- Index pour la table `Employe`
--
ALTER TABLE `Employe`
 ADD PRIMARY KEY (`idEmploye`), ADD KEY `FK_Employe_agence` (`idAgence`), ADD KEY `FK_Employe_Role` (`idRole`);

--
-- Index pour la table `localite`
--
ALTER TABLE `localite`
 ADD PRIMARY KEY (`idLocalite`);

--
-- Index pour la table `Role`
--
ALTER TABLE `Role`
 ADD PRIMARY KEY (`idRole`);

--
-- Index pour la table `Transaction`
--
ALTER TABLE `Transaction`
 ADD PRIMARY KEY (`idTransaction`), ADD KEY `FK_Transaction_Employe` (`idEmploye`);

--
-- Index pour la table `TypeCarte`
--
ALTER TABLE `TypeCarte`
 ADD PRIMARY KEY (`idTypeCarte`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `agence`
--
ALTER TABLE `agence`
MODIFY `idAgence` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT pour la table `carteBancaire`
--
ALTER TABLE `carteBancaire`
MODIFY `idCarte` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
MODIFY `idClient` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `compte`
--
ALTER TABLE `compte`
MODIFY `idCompte` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `compteUser`
--
ALTER TABLE `compteUser`
MODIFY `idCompteUser` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT pour la table `Employe`
--
ALTER TABLE `Employe`
MODIFY `idEmploye` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=35;
--
-- AUTO_INCREMENT pour la table `localite`
--
ALTER TABLE `localite`
MODIFY `idLocalite` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT pour la table `Role`
--
ALTER TABLE `Role`
MODIFY `idRole` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `Transaction`
--
ALTER TABLE `Transaction`
MODIFY `idTransaction` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `TypeCarte`
--
ALTER TABLE `TypeCarte`
MODIFY `idTypeCarte` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `agence`
--
ALTER TABLE `agence`
ADD CONSTRAINT `FK_agence_localite` FOREIGN KEY (`idLocalite`) REFERENCES `localite` (`idLocalite`);

--
-- Contraintes pour la table `carteBancaire`
--
ALTER TABLE `carteBancaire`
ADD CONSTRAINT `FK_carteBancaire_client` FOREIGN KEY (`idClient`) REFERENCES `client` (`idClient`);

--
-- Contraintes pour la table `client`
--
ALTER TABLE `client`
ADD CONSTRAINT `FK_client_Employe` FOREIGN KEY (`idEmploye`) REFERENCES `employe` (`idEmploye`);

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
ADD CONSTRAINT `FK_compte_client` FOREIGN KEY (`idClient`) REFERENCES `client` (`idClient`);

--
-- Contraintes pour la table `compteUser`
--
ALTER TABLE `compteUser`
ADD CONSTRAINT `FK_compteUser_Employe` FOREIGN KEY (`idEmploye`) REFERENCES `employe` (`idEmploye`);

--
-- Contraintes pour la table `compte_transaction`
--
ALTER TABLE `compte_transaction`
ADD CONSTRAINT `FK_compte_transaction_Transaction` FOREIGN KEY (`idTransaction`) REFERENCES `transaction` (`idTransaction`),
ADD CONSTRAINT `FK_compte_transaction_compte` FOREIGN KEY (`idCompte`) REFERENCES `compte` (`idCompte`);

--
-- Contraintes pour la table `Employe`
--
ALTER TABLE `Employe`
ADD CONSTRAINT `FK_Employe_Role` FOREIGN KEY (`idRole`) REFERENCES `role` (`idRole`),
ADD CONSTRAINT `FK_Employe_agence` FOREIGN KEY (`idAgence`) REFERENCES `agence` (`idAgence`);

--
-- Contraintes pour la table `Transaction`
--
ALTER TABLE `Transaction`
ADD CONSTRAINT `FK_Transaction_Employe` FOREIGN KEY (`idEmploye`) REFERENCES `employe` (`idEmploye`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
