-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 09-Jan-2019 às 11:31
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `icmbio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `embarcacao`
--

CREATE TABLE `embarcacao` (
  `codigo_embarcacao` int(11) NOT NULL,
  `nome_embarcacao` varchar(100) NOT NULL,
  `TIE` varchar(100) NOT NULL,
  `nome_proprietario` varchar(100) NOT NULL,
  `numero_passageiros` varchar(15) NOT NULL,
  `Tamanho_embarcacao` varchar(15) NOT NULL,
  `capacidade_passageiros` int(15) NOT NULL,
  `local` varchar(50) NOT NULL,
  `OBS` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `codigo_modalidade` int(11) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `embarcacao`
--

INSERT INTO `embarcacao` (`codigo_embarcacao`, `nome_embarcacao`, `TIE`, `nome_proprietario`, `numero_passageiros`, `Tamanho_embarcacao`, `capacidade_passageiros`, `local`, `OBS`, `codigo_modalidade`, `est`) VALUES
(1, 'MONTE SINAI', '3840082862', 'RAFAEL GUIMARAES DE ALMEIDA GOUVEIA', '24', '9,6', 0, '', '', 3, 0),
(2, 'Galapagos ', '3840165261', 'Sebastião Duarte de Souza', '55', '13,84', 0, '', '', 3, 0),
(3, 'Cristiane I', '3840163412', 'Phelipe Alcantara Correa de Souza', '20', '8,85', 0, '', '', 3, 0),
(4, 'Baruch', '3840165270', 'Cristiano Rosa Teixeira', '24', '9,9', 0, '', '', 3, 0),
(5, 'Biosfera', '384-002401/2016', 'Adalberto Ramices de Aquino Batista', '50', '14,7', 0, '', '', 3, 0),
(6, 'Maria da Toca I', '3870046635', 'Adelino Ferreira Junior', '24', '9', 0, '', '', 3, 0),
(8, 'Filho do Vento', '3840166632', 'Ruy de Macedo Teixeira', '24', '7,85', 0, '', '', 3, 0),
(9, 'DAVI E JULIA', '3840157722', 'Ibanês Calista da Silva', '22', '9', 0, '', '', 3, 0),
(10, 'Mr Diver', '3840159971', 'Marinilda Pinheiro Guimarães', '77', '14,95', 0, '', '', 3, 0),
(11, 'Maramutá', '3840166624', 'Alfredo Neves Vianna Junior', '24', '9,96', 0, '', '', 3, 0),
(12, 'Bigutur I', '3840163668', 'Jadilso Martins Barreto', '24', '9', 0, '', '', 3, 0),
(13, 'La Barca I', '384003550/2016', 'Fernando Nasser Abrahim de Mello Martins', '24', '9,89', 0, '', '', 3, 0),
(14, 'GUIGUI', '3840160537', 'Elias Duarte Beco', '24', '9,4', 0, '', '', 3, 0),
(15, 'Sol Nascente', '3840171717', 'Alexandro da Silva Ferreira', '24', '9,9', 0, '', '', 3, 0),
(16, 'Piratas do Caribe I', '3840161291', 'Carlos Leonardo Silva de Carvalho', '70', '16,62', 0, '', '', 3, 0),
(17, 'Shangrilá Tur', '3840160677', 'Damião Teixeira Neto', '80', '13,5', 0, '', '', 3, 0),
(18, 'Catavento I', '3840166233', 'Lenicio da Silva Souza', '80', '14,5', 0, '', '', 3, 0),
(19, 'Topázio', '2210116945', 'Carlos Alberto do Valle Santos', '30', '10', 0, '', '', 3, 0),
(20, 'OCTOPUS', '2810216011', 'PATRICK HENRI REBIERE ME', '50', '13,5', 0, '', '', 3, 0),
(21, 'Iceberg Tour', '3840157609', 'Marcelo Setta Guimarães Alhadas', '22', '9,4', 0, '', '', 3, 0),
(22, 'IBIZA TOUR', '3840163129', 'Deise de Miranda Santos', '45', '11,8', 0, '', '', 3, 0),
(23, 'Cristiane', '3840164729', 'Luiz Carlos Fernanes Smapaio', '24', '9,3', 0, '', '', 3, 0),
(24, 'Bunito I', '3840167761', 'Carlos Hnrique Pimentel de Barros', '24', '9,9', 0, '', '', 3, 0),
(25, 'ARRAIAL VIP', '3870050381', 'NORMA VIRGINIA CORREA DE OLIVEIRA', '24', '9,3', 0, '', '', 3, 0),
(26, 'Tournee', '3840160651', 'Fabio Renato Borges Pacheco', '70', '19,23', 0, '', '', 3, 0),
(27, 'PRIMEIRA CLASSE', '2818914566', 'Leonis Pessoa Lima', '30', '11,28', 0, '', '', 3, 0),
(28, 'BAHAMAS', '3840165482', 'WESKLEI RANGEL BORGES', '24', '8,5', 0, '', '', 3, 0),
(29, 'DOIS AMIGOS', '3870034556', 'CELSO FELIX DA COSTA', '9', '7,23', 0, '', '', 3, 0),
(30, 'Tubarão Rio', '38770060883', 'Ricardo Coelho Golçalves', '56', '13,5', 0, '', '', 3, 0),
(31, 'Bonança', '384002840/2015', 'Bruno Teixeira Moreno', '24', '9,85', 0, '', '', 3, 0),
(32, 'White Shark I', '3840086655', 'Jonilson Viana Saldanha', '18', '8,5', 0, '', '', 3, 0),
(33, 'Betina II', '3840171156', 'Fabricio Elias Canela', '80', '25,22', 0, '', '', 3, 0),
(34, 'Herbalife I', '2810275653', 'Heros Canellas Junior', '67', '12,22', 0, '', '', 3, 0),
(35, 'ALEXANDRE', '384000108/2017', 'Ana Paula Ramos Franco', '24', '', 0, '', '', 3, 0),
(36, 'Cavalo Marinho I', '3840168422', 'Eduardo Custodio Teixeira', '48', '12,93', 0, '', '', 3, 0),
(37, 'FLOR DAS CANDEIAS VI', '28188920802', 'Jeferson Melo dos Santos', '69', '15,38', 0, '', '', 3, 0),
(38, 'Xarelete II', '3840166926', 'Floriano Barreto de Mendonça Fillho', '24', '9,9', 0, '', '', 3, 0),
(39, 'Don Juan ', '3840164133', 'Ruan Manhães Simas', '57', '14,27', 0, '', '', 3, 0),
(40, 'Garota do Cabo II', '3840161771', 'Sergio Francisco Soares Filho', '80', '20,96', 0, '', '', 3, 0),
(41, 'Chrismay I', '3410238298', 'Catharino Jose da Silva Filho', '24', '9,8', 0, '', '', 3, 0),
(42, 'SENNINHA', '3840165423', 'Phelipe Gustavo dos Santos Queiroz', '24', '9,9', 0, '', '', 3, 0),
(43, 'Deusa Marcia I', '3840166641', 'Marcia Andrea Pereira Campoa', '54', '11,73', 0, '', '', 3, 0),
(44, 'ELOIN TOUR', '384003365/2016', 'Lenilva Fialho Pereira', '70', '16,88', 0, '', '', 3, 0),
(45, 'ATUAL DO CABO II', '3840163331', 'Valci Navarro Costa', '24', '11,3', 0, '', '', 3, 0),
(46, 'Arraial Tur IV', '3840165229', 'Eloi Soares Arruda', '116', '21,76', 0, '', '', 3, 0),
(47, 'Saint Tropez I', '384000461/2017', 'Pedro Ernesto do Amaral Guatemozim Pinto', '45', '', 0, '', '', 3, 0),
(48, 'Pelicano III', '3840169143', 'Paulo Luis Barreto Ribeiro', '80', '16,05', 0, '', '', 3, 0),
(49, 'Havana', '3870054204', 'Sergio Fernando de Azevedo Ribeiro', '18', '9', 0, '', '', 3, 0),
(50, 'Maran I', '3850010970', 'Luis Otavio Macedo da Silva', '23', '9,9', 0, '', '', 3, 0),
(51, 'Elem', '3840158079', 'Elem Carla Pinto Florentino', '20', '9', 0, '', '', 3, 0),
(52, 'Atual do Cabo', '3840160065', ' Renato Gonçalves de Souza', '30', '10,55', 0, '', '', 3, 0),
(53, 'Naeti', '3840169534', 'Rondynelli Machado de Macedo', '24', '9,8', 0, '', '', 3, 0),
(54, 'TORTUGA TUR I', '3840170834', 'Bernardo Simas Cardoso', '80', '18,5', 0, '', '', 3, 0),
(55, 'ATCHEZA II', '38401655199', 'JOÃO MÁRCIO DE CARVALHO E MARCELO CARVALHO DE MELLO', '70', '17,75', 0, '', '', 3, 0),
(56, 'Dom Virgilio', '3840083451', 'Virgílio Marcio dos Santos', '40', '11,83', 0, '', '', 3, 0),
(57, 'Summer Tour', '3840164095', 'Tairony Rodrigues Neves', '24', '9,6', 0, '', '', 3, 0),
(58, 'DE VITÓRIA', '384003677/2016', 'Paola Vitória de Lana Melo de Carvalho', '22', '10', 0, '', '', 3, 0),
(59, 'FILHO DA FORÇA', '3840169011', 'Francisco Carlos Martins', '28', '9,9', 0, '', '', 3, 0),
(60, 'BACK DOOR', '3850012379', 'Raphael Melo de Andrade', '50', '11,15', 0, '', '', 3, 0),
(61, 'Netuno', '3870059753', 'Souza Marins Const. Incorp.', '30', '10,6', 0, '', '', 3, 0),
(62, 'ALEXANDRE´S', '3840160162', 'Emilene Carvalho Felix', '80', '18,5', 0, '', '', 3, 0),
(63, 'Piratas do Caribe II', '3840169607', 'Roberto José  Barreto Barcelos Junnior ', '80', '18,5', 0, '', '', 3, 0),
(64, 'Betina ', '3840168295', 'FABRÍCIO ELIAS CANELA', '60', '15,94', 0, '', '', 3, 0),
(65, 'Calypso', '3840088356', 'Leandro Martins Develly de Castro', '17', '9', 0, '', '', 3, 0),
(66, 'DIVER ECOLOGICO', '3840158753', 'Sergio Duarte de Souza', '30', '11,65', 0, '', '', 3, 0),
(67, 'Jequitibá', '3813873587', 'Max Golçalves Arrais', '24', '9,6', 0, '', '', 3, 0),
(68, 'Mar do Mar I', '3840171822', 'Manoel Viana Netto', '32', '9,95', 0, '', '', 3, 0),
(69, 'Paraiso do Atlantico', '3822937771', 'Welington Melo de Araujo', '67', '15,7', 0, '', '', 3, 0),
(70, 'PEDRO ARTHUR', '3840163871', 'Sergio Luiz Serafim Lopes', '56', '11,64', 0, '', '', 3, 0),
(71, 'Ericka Barreto', '3840169437', 'Gilmar Fernando da Costa Bravo', '64', '15,68', 0, '', '', 3, 0),
(72, 'Pharaoh', '3840164320', 'Celia Regina Tavares Oliveira', '30', '11,5', 0, '', '', 3, 0),
(73, 'FE E FORCA', '384000459/2016', 'Jovanor Soares', '24', '9,73', 0, '', '', 3, 0),
(74, 'MARIA TOUR', '3840157234', '', '30', '10,34', 0, '', '', 3, 0),
(75, 'EL ELYON', '3840094038', '', '19', '9,1', 0, '', '', 3, 0),
(76, 'GALICIA I', '3850004589', 'Lucia Martins Ribeiro Novas', '22', '9', 0, '', '', 3, 0),
(77, 'SOU Cabista', '3840162939', 'Allan de Souza dos Anjos', '18', '10,3', 0, '', '', 3, 0),
(78, 'Patrulha do Xoli', '3840163404', 'Marco Antonio Felix Barreto', '30', '10', 0, '', '', 3, 0),
(79, 'BELMONTE', '3840077176', 'Rua Martin Afonso 96 A Boa Vista', '18', '8', 0, '', '', 3, 0),
(80, 'MARINA TOUR', '3840077672', '', '19', '9,8', 0, '', '', 3, 0),
(81, 'EFRAIM', '2818891329', 'GILMAR ROCHA DA SILVA', '35', '11,5', 0, '', '', 3, 0),
(82, 'FLÁVIA I', '3840169062', 'ROGÉRIO ADRIANO SILVA BARBOZA ', '38', '11', 0, '', '', 3, 0),
(83, 'PAPA LEGUAS', '3840094364', 'Altamir Elias Canela', '18', '9', 0, '', '', 3, 0),
(84, 'Dona Inara', '3840165181', 'Erick Barreto da Costa Bravo', '26', '9,5', 0, '', '', 3, 0),
(85, 'Xodó Tour III', '3840158940', 'Janizete Pereira Duarte', '90', '14,6', 0, '', '', 3, 0),
(86, 'Costa Nobre II', '3840165539', 'Juan Angel Lauro Lago', '130', '23,55', 0, '', '', 3, 0),
(87, 'ADELPHOS', '3850001300', 'Douglas Prudência da Silva', '20', '9', 0, '', '', 3, 0),
(88, 'AGNUS DEI', '3840165873', 'Gustavo Neves Vianna', '24', '9,5', 0, '', '', 3, 0),
(89, 'BEM AVENTURADO', '3840170826', 'Jó Rezende Alves', '16', '7,41', 0, '', '', 3, 0),
(90, 'FLOR DO CABO', '384002255', 'RAFAEL RICHARD SIQUEIRA BARRETO', '22', '9,3', 0, '', '', 3, 0),
(91, 'GIOVANNINI', '3840030277', 'Helio Giovannini da Costa', '14', '7,7', 0, '', '', 3, 0),
(92, 'BIGUTUR', '3840090008', 'Jadilso Martins Barreto', '20', '9', 0, '', '', 3, 0),
(93, 'DUDAMAR TUR', '3840159695', 'EDUARDO ANDRADE ROCHA', '30', '10', 0, '', '', 3, 0),
(94, 'Super Flor I', '3840159873', 'Monica Modesto Marinho', '56', '12,5', 0, '', '', 3, 0),
(95, 'SETE MARES', '3840159199', 'Leonardo de Oliveira Gonçalves', '59', '13', 0, '', '', 3, 0),
(96, 'FILHO DO SOL', '384000445/2017', 'Idimar Segreto Augusto', '30', '?', 0, '', '', 3, 0),
(97, 'CARISMA', '3840086124', 'Altair lemos de Paula', '19', '8', 0, '', '', 3, 0),
(98, 'FAROL DOS NAVEGANTES I ', '3850012102', 'Welington Melo de Araujo', '30', '10,59', 0, '', '', 3, 0),
(99, 'FLOR DO CARIBE', 'PROTOCOLO 281', 'Igor Porto de Mendonça', '80', '17', 0, '', '', 3, 0),
(100, 'DOM BARCELOS', '3840159415', 'Marcelo Silva Barcelos', '65', '14,4', 0, '', '', 3, 0),
(101, 'Os Escolhidos ', '384065407', 'Viviane Ambrósio Durão Pereira', '30', '', 0, '', '', 3, 0),
(102, 'XARELETE IV', '2818915407', 'Igor Porto de Mendonça', '30', '', 0, '', '', 3, 0),
(103, 'GUERRIERE', '384000109/2016', 'Paulo Roberto Ferreira', '50', '13', 0, '', '', 3, 0),
(104, 'Holiday Sea I', '384004120/2016', 'Rogerio Barreto dos Santos/Edilcea Barreto Teixeira', '50', '14,97', 0, '', '', 3, 0),
(105, 'PARADISE I', '384-003525/2016', 'Fabio Mrendonça Fialho', '50', '17,25', 0, '', '', 3, 0),
(106, 'JC.COM', '3840157234', 'José Carlos da Silva', '24', '9,5', 0, '', '', 3, 0),
(107, 'BELEZA NATIVA', '', '', '', '', 0, '', '', 3, 0),
(108, 'ACONCHEGO IX', '3868893601', 'Josenilda Gomes de Lima', '71', '20,2', 0, '', '', 3, 0),
(109, 'Pelicano II', '3840169593', 'Carla Daiane P. Souza e Paulo Luiz B. Ribeiro', '71', '15,8', 0, '', '', 3, 0),
(110, 'Xarelete III', '3840167710', 'Rodrigo Porto de Mendonça', '56', '12,3', 0, '', '', 3, 0),
(111, 'Holiday Sea', '3810483214', 'Ezio Mendonça de Mello', '44', '11,9', 0, '', '', 3, 0),
(112, 'PRIMOS TOUR', '384003027/2016', 'ALDIZIO SILVEIRA DE BRITO', '45', '15,5', 0, '', '', 3, 0),
(113, 'MR DIVER II', '3840159687', 'Paulo Henrique Rodrigues Cardozo', '50', '12,9', 0, '', '', 3, 0),
(114, 'HOLANDES VOADOR', '384000211-17', 'Jean Barros da Rocha', '30', '9,9', 0, '', '', 3, 0),
(115, 'TATUI REI', '3410388567', 'Manoel Adilso Vianna Alves', '45', '12,93', 0, '', '', 3, 0),
(116, 'SHANGRI-LA', '3840089733', 'Cleyton da Costa Barreto', '45', '19,93', 0, '', '', 3, 0),
(117, 'VO FELICIO', '3840159351', 'Rogerio Paes de Carvalho Netto', '45', '13,62', 0, '', '', 3, 0),
(118, 'SILIARES', '384017018-4', 'Carmelio Fabiano da Silva', '18', '9,4', 0, '', '', 3, 0),
(119, 'PARADISO', '3830629851', 'RENATO Mendonça Barreto', '45', '13,63', 0, '', '', 3, 0),
(120, 'DJ BOAT', '384004138/2016', 'Cristiano da Silva Pimentel', '24', '10', 0, '', '', 3, 0),
(121, 'HOLANDES VOADOR I', '3840159768', 'Carlos Roberto Rocha Mansur', '45', '12.30', 0, '', '', 3, 0),
(122, 'OCEANNE', '3840159415', 'Carlos Manoel da Trindade Barreto', '45', '16', 0, '', '', 3, 0),
(123, 'ELITE TOUR', '38401171121', 'Marcos Eduardo Barreto Ferreira', '45', '15,79', 0, '', '', 3, 0),
(124, 'JERUSALEM', '3840165334', 'Diogo Martins de Andrade', '15', '7,6', 0, '', '', 3, 0),
(125, 'O BOQUEIRÃO', '3840170974', 'MARCELO MONTEIRO NEVES', '19', '9,17', 0, '', '', 3, 0),
(126, 'BONANSA', '384000387', 'Anderson Luis Regis', '40', '', 0, '', '', 3, 0),
(127, 'CARAVELA TUR', '384004211/2015', 'Guilhermino Correa Barreto', '45', '17', 0, '', '', 3, 0),
(128, 'VITOR  MOURA', '3840170681', 'Marcos Vinicius de Almeida', '24', '10', 0, '', '', 3, 0),
(129, 'TOA TOA ', '384001062/2017', 'Albertino Carvalho', '30', '', 0, '', '', 3, 0),
(130, 'VIDA MARINHA', '031.274.187-10', 'Robson Porto da Silva', '45', '16,8', 0, '', '', 3, 0),
(131, 'SUMMER LOVE', '384003695/2016', 'Ricardo Leite Barbosa', '30', '9,9', 0, '', '', 3, 0),
(132, 'Alexandre\'s', '3840160162', 'Alexandre Francisco/Emilene Carvalho', '88', '9', 0, '', '', 3, 0),
(133, 'Arraial Tur III', '3840162653', 'Eloi Soares Arruda', '118', '9', 0, '', '', 3, 0),
(134, 'Ave e Jhoe', '3840084644', 'Marcio Freire de Motta ', '16', '12,3', 0, '', '', 3, 0),
(135, 'INFINITO', '3840162912', 'Carlos Henrique Pimentel de Barros', '24', '8', 0, '', '', 3, 0),
(136, 'CALIFORNIA I', '3840166730', 'Fábio Renato Borges Pacheco', '50', '12,05', 0, '', '', 3, 0),
(137, 'Carisma', '3840086124', 'Altair Lemos de Paula', '19', '9,9', 0, '', '', 3, 0),
(138, 'Encantos de Arraial', '3877040942', 'Igor Rocha Matias de Souza', '26', '16,3', 0, '', '', 3, 0),
(139, 'Familia Porto', '3840166535', 'Jorge Bernardino da Conceição', '24', '10,38', 0, '', '', 3, 0),
(140, 'Fror do Amor Comte Goiaba', '3840160740', 'Keila Rachel da Costa Ramos de Azevedo', '84', '6,2', 0, '', '', 3, 0),
(141, 'FROR DO AMOR LETIE SOMAR', '3840170125', 'Augusto Cesar Menezes Ramos de Azevedo', '24', '9', 0, '', '', 3, 0),
(142, 'Interceptor', '3810480665', 'Diego Silvestre Ferreira', '14', '11,3', 0, '', '', 3, 0),
(143, 'Israel e CIA', '3840157595', 'ISRAEL NEVES DA SILVA PAIVA', '20', '9', 0, '', '', 3, 0),
(144, 'Jacques Ives Cousteau', '3840159709', 'Gilmar Fernando da Costa Bravo', '33', '7,8', 0, '', '', 3, 0),
(145, 'SENNINHA', '3840165423', 'Phelipe Gustavo dos S. Queiroz dos Santos', '24', '19,5', 0, '', '', 3, 0),
(146, 'Meu bom Mestre', '3840080061', 'Henock Pessoa de Melo', '11', '15,8', 0, '', '', 3, 0),
(147, 'Miss Julia', '3825415147', 'Marcelo Santos', '90', '19,85', 0, '', '', 3, 0),
(148, 'Pelicano II', '384003634', 'Paulo Luis Barreto Ribeiro', '77', '9,5', 0, '', '', 3, 0),
(149, 'PITARAS DO CARIBE I', '3840161291', 'ROBERTO JOSÉ BARRETO BARCELOS', '119', '9,1', 0, '', '', 3, 0),
(150, 'Porto Mar I', '3840164001', 'Gladis Marli Goulart Salbego', '25', '9', 0, '', '', 3, 0),
(151, 'Sidônio', '3410235302', 'Luis Otavio Macedo da Silva', '16', '12,5', 0, '', '', 3, 0),
(152, 'Skiper do Cabo (DEEP TRIP II)', '3850004350', 'Eliane Pires de Souza', '24', '11,8', 0, '', '', 3, 0),
(153, 'Super Flor I', '3840159873', 'João  Antonio de Alencar', '56', '11,3', 0, '', '', 3, 0),
(154, 'Trovão Azul', '3850011291', 'Heidi Dias de Oliveira', '28', '9,9', 0, '', '', 3, 0),
(155, 'Vitor Tour', '3870060859', 'Vitor Henrique Jediroba Cruz Correa', '30', '', 0, '', '', 3, 0),
(156, 'Xarelete IV', '2818915406', 'Floriano Barreto de Mendonça Fillho', '24', '', 0, '', '', 3, 0),
(157, 'Mestre dos Mestres', '3877050492', 'Aldeir Coutinho Oreles', '18', '9.62', 0, '', '', 2, 0),
(158, 'Futuro I', '385002331', 'Ubirajara José da Silva', '20', '9', 0, '', '', 2, 0),
(159, 'Beleza Nativa ', '3840159202', 'Claudio Elir Moreira de Souza', '80', '13', 0, '', '', 2, 0),
(160, 'Poeta I', '3840163684', 'Amador Trigo Lage', '50', '11,8', 0, '', '', 2, 0),
(161, 'Pedro Lucas', '384001830/2015', 'Leandro Nascimento Margarido', '24', '9,5', 0, '', '', 2, 0),
(162, 'Perola Negra', '3840170508', 'Rodrigo Leite Barbosa', '65', '13,83', 0, '', '', 2, 0),
(163, 'BRYAN TOUR', '3840170401', 'José dos Santos Pereira', '30', '10', 0, '', '', 2, 0),
(164, 'vLindo Olhar', '384018457', 'Oswaldo Lopes de Aguiar Filho', '48', '12,93', 0, '', '', 2, 0),
(165, 'Mais 1 Guerreiro', '3420042302', 'Antunes Gomes Barbosa', '22', '9,23', 0, '', '', 2, 0),
(166, 'Japão', '3840170516', 'JORGE Alberto da Silva Junior', '22', '8,7', 0, '', '', 2, 0),
(167, 'Sunshine I', '3877041141', 'Luiz Carlos Antunes Rodrigues', '16', '9', 0, '', '', 2, 0),
(168, 'ESTRELA DE DAVI', '3840082811', 'Amarildo Godinho Gonlçalves', '20', '8,5', 0, '', '', 2, 0),
(169, 'California III', '3870058820', 'Mauricio Renato Lopes', '50', '10,6', 0, '', '', 2, 0),
(170, 'Kami Sama I', '3840165474', 'Gilberto Maia Ohoishi', '24', '10,6', 0, '', '', 2, 0),
(171, 'CAVALO MARINHO', '3840164877', 'Edezio de souza Teixeira', '24', '9,2', 0, '', '', 2, 0),
(172, 'Tarantella I', '3840163102', 'Alexandre Estevan da Silva', '50', '11,6', 0, '', '', 2, 0),
(173, 'Tom Azul', '3870060026', 'Leonardo Rocha Neto', '30', '11', 0, '', '', 2, 0),
(174, 'Farol Velho', '3840163111', 'Closvis Eduardo Barreto', '20', '8,8', 0, '', '', 2, 0),
(175, 'TOA TOA SEA', '3850011496', 'Marcia Andrea Pereira Campos', '23', '9', 0, '', '', 2, 0),
(176, 'BARCELONA', '384004233/2016', 'Carlos Alberto Pimentel Junior', '24', '9', 0, '', '', 2, 0),
(177, 'Capitão Pelicano II', '3810480215', 'Nelson Mauro Pinto Santiago', '30', '10', 0, '', '', 2, 0),
(178, 'CARISMA II', '3870053984', 'Altair Lemos de Paula', '18', '9,22', 0, '', '', 2, 0),
(179, 'W.MARES I', '3840159911', 'Weskley Rodrigues Costa de Macedo', '70', '13,5', 0, '', '', 2, 0),
(180, 'FANUEL', '3840164826', 'Celso Soares de Souza', '45', '11,2', 0, '', '', 2, 0),
(181, 'MESTRE EURICO', '3877041094', 'Inacio Ferreira Fialho', '32', '10,6', 0, '', '', 2, 0),
(182, 'W Mares', '3840162980', 'Luis Eduardo Frederico de Mattos', '42', '12', 0, '', '', 2, 0),
(183, 'FEDERAL II', '3870060603', 'Cleber Victorino Barreto', '34', '11', 0, '', '', 2, 0),
(184, 'MÃE AMOR ETERNO', '3840166721', 'Antônio Marcos Maciel Neves', '48', '11,7', 0, '', '', 2, 0),
(186, 'SOBERANO DA COSTA', '3840094046', 'Lucineide Oliveira Valdiviro', '68', '24', 0, '', '', 2, 0),
(187, 'KOME KETO', '3850011348', 'Marco Antonio Gonçalves Dias', '38', '11', 0, '', '', 2, 0),
(188, 'DEEP TRIP', '3840159601', 'Reinaldo Cesar Serra da Cunha', '50', '11,8', 0, '', '', 2, 0),
(189, 'Jagau II', '3840159270', 'Marco Antonio Macedo da Silva', '43', '11,5', 0, '', '', 2, 0),
(190, 'Cristal I', '3870049219', 'Tahinan dos Santos', '24', '9,8', 0, '', '', 2, 0),
(191, 'MAR EM FÚRIA', '3840170168', 'Jares Luiz Borges Pacheco', '48', '12', 0, '', '', 2, 0),
(192, 'Mustang', '3810369926', 'Jeferson Matos de Azevedo', '7', '6,95', 0, '', '', 2, 0),
(193, 'BIG BROTHER', '3840170800', 'Elan de Macedo Porto', '24', '9,5', 0, '', '', 2, 0),
(194, 'Bingo I', '3410237151', 'Willson Alcantara Gago', '24', '9,72', 0, '', '', 2, 0),
(195, 'INFINITO', '3840162912', 'Viviane Rocha Rego', '24', '9', 0, '', '', 2, 0),
(196, 'PIRILAMPO', '3850002241', 'Almir Pereira de Fonseca', '24', '9,85', 0, '', '', 2, 0),
(197, 'BOM DE MAR', '3870044861', 'Cesar Aquiles de  Souza Teixeira', '18', '8,5', 0, '', '', 2, 0),
(198, 'Anjo do Mar II', '3840165245', 'Angélica de Souza Corado', '26', '9,7', 0, '', '', 2, 0),
(199, 'AURORA BOREAL', '3840171407', 'Paulo Cristiano Pessoa de Mello', '20', '9,5', 0, '', '', 2, 0),
(200, 'Saint Tropez', '3850004091', 'Edson Rodrigues Malvolti', '18', '9', 0, '', '', 2, 0),
(201, 'VALENTYNA TOUR', '384001099/2017', 'Magno Freitas Dias', '10', '9,4', 0, '', '', 2, 0),
(202, 'HERBALIFE', '2818910731', 'Heros Canellas Junior', '30', '12,22', 0, '', '', 2, 0),
(203, 'Mestre Arino', '3870051418', 'Iraty Alves Filho', '11', '8,5', 0, '', '', 2, 0),
(204, 'Velho Garajal', '3870058731', 'Emmanoel Oliveira da Cunha Neto', '24', '10', 0, '', '', 2, 0),
(205, 'W. Mares II', '3840165954', 'Weskley Rodrigues Costa de Macedo', '30', '12,06', 0, '', '', 2, 0),
(206, 'BUDICO S TOUR ', '3840167795', 'WALBER RODRIGUES ', '45', '10,5', 0, '', '', 2, 0),
(207, 'GUILHERME', '3870057874', 'JOSÉ Francisco de Assis C. Jardim', '20', '9', 0, '', '', 2, 0),
(209, 'Teimoso', '3840080746', 'Paulo Cesar Oliveira Santiago', '20', '10,0', 0, '', '', 4, 0),
(210, 'AKI KI NOIS PESCA', '3870050411', '', '20', '9,0', 0, '', '', 4, 0),
(211, 'RUMO NORTE I', '3840165458', 'JAIR MEIRELLES DA SILVA FILHO', '10', '7,5', 0, '', '', 4, 0),
(212, 'ICEBERG', '3840082145', 'LAIS ROGERIO DE OLIVEIRA', '11', '9,0', 0, '', '', 4, 0),
(213, 'RAYRA', '3840170176', 'JOSÉ CARLOS GAGO', '11', '6,8', 0, '', '', 4, 0),
(214, 'ana vitoria tur', '3840080584', 'Anderson Ribeiro dos Anjos', '24', '9', 0, '', '', 4, 0),
(215, 'ANEQUIM TUR', '3840171750', 'LEANDRO BARREIRA DA SILVA ', '24', '9,9', 0, '', '', 4, 0),
(216, 'LIBERDADE', '3840076846', 'GILBERTO SOUZA DA SILVA', '11', '7,5', 0, '', '', 4, 0),
(217, 'BOM SUCESSO', '3840157706', 'ALEXANDRE MELO DE ARAÚJO', '20', '9,0', 0, '', '', 4, 0),
(218, 'ANJO DO MAR', '3840081980', 'GILMAR ALCANTARA PACHECO', '24', '9,3', 0, '', '', 4, 0),
(219, 'MARJEANN', '3810256323', 'PAULO HENRIQUE DO ROSARIO CORREA ', '10', '7,0', 0, '', '', 4, 0),
(220, 'JC I ', '3840165415', 'JORGE ALBERTO DA SILVA JUNIOR', '16', '8,2', 0, '', '', 4, 0),
(221, 'Guarani', '3870022752', 'Edmilson de Braga Fialho', '11', '8,2', 0, '', '', 4, 0),
(222, 'Novo Horizonte I', '3840024480', 'Clovis de Aguiar', '10', '6,5', 0, '', '', 4, 0),
(223, 'CMTE NIL', '3870048794', 'Erenil Gomes Rangel', '20', '9,0', 0, '', '', 4, 0),
(224, 'JANAINA', '3840078865', 'MECLIDES FERREIRA DE MACEDO JUNIOR', '14', '8,7', 0, '', '', 4, 0),
(225, 'ISABELA', '3877040985', 'Rafael Pereira Teixeira', '18', '8,5', 0, '', '', 4, 0),
(226, 'LUA E MAR', '3840171784', 'Mauricio Jardim Ribeiro', '18', '9,2', 0, '', '', 4, 0),
(227, 'YGARA OCA', 'PROTOCOLO 384-001227-2016', 'GILMAR INDIO BARBOSA', '12', '', 0, '', '', 4, 0),
(228, 'Dez de Maio', '3870049481', 'Paulo Henrique Sodré Cordeiro', '16', '9', 0, '', '', 4, 0),
(229, 'O MERGULHAO', '3870052864', 'Eduardo Mello de Araujo', '20', '9,00', 0, '', '', 4, 0),
(230, 'MICHEL DIVERS', '3870056207', 'GILSON SOARES RANGEL', '13', '8,0', 0, '', '', 4, 0),
(231, 'MESTRE VADI', '3840066646', '', '10', '7,0', 0, '', '', 4, 0),
(232, 'FERA DO MAR', '384003901/2016', 'DIEGO FERNANDES BARRETO', '16', '8,0', 0, '', '', 4, 0),
(233, 'O SHAN', '384008844 5', 'LEOPOLDINA CUNHA DA SILVA', '11', '9,9', 0, '', '', 4, 0),
(234, 'FUTURO', '3840061318', 'PAULO FERNANDO VIEIRA DE MENDONÇA', '11', '7,5', 0, '', '', 4, 0),
(235, 'SOL E MAR', '3870052643', 'JOSE CARLOS ROSA TEIXEIRA', '15', '9,8', 0, '', '', 4, 0),
(236, 'THOR', '3840171768', 'ANTONIO CARLOS PEREIRA DIAS', '16', '9,0', 0, '', '', 4, 0),
(237, 'REBELDE', '3840081947', 'DEVALDO DA SILVA DIAS', '10', '', 0, '', '', 4, 0),
(238, 'TARTARUGAS', '3840168775', 'GABRIEL ALEXANDRE V. CARPENTER', '12', '8,4', 0, '', '', 4, 0),
(239, 'MAR DO MAR', '3850002349', 'MARIO VICTOR TORRES BRAGA JR', '18', '9,0', 0, '', '', 4, 0),
(240, 'FAROL BEACH', '3840158028', 'JEAN BARROS DA ROCHA ', '18', '9,0', 0, '', '', 4, 0),
(241, 'EMANUEL', 'PROTOCOLO 384-001035/2017', 'LEANDRO BAPTISTA MARINS', '10', '7,2', 0, '', '', 4, 0),
(242, 'ARRAIAL DO MAR', '384-001699/2016', 'MARCELO AMARAL DA SILVA', '22', '9', 0, '', '', 4, 0),
(243, 'ANAMAR', '', '', '', '', 0, '', '', 4, 0),
(244, 'LA BARCA', '', '', '', '', 0, '', '', 4, 0),
(245, 'IMPERIUM', '384002382/2017', 'NIRINEY DOS SANTOS NEVES', '18', '9,9', 0, '', '', 4, 0),
(246, 'NSA SENHORA DAS GRAÇAS', '3840166799', 'FRANCISCO CARLOS BARRETO FELIX', '11', '8', 0, '', '', 4, 0),
(247, 'COMENDADOR I', '3840170397', 'Enildo Faria Benevides', '20', '9', 0, '', '', 4, 0),
(248, 'CAPTAIN', '384000242/2017', '', '20', '9,5', 0, '', '', 4, 0),
(249, 'BOM SUCESSO', '', '', '', '', 0, '', '', 4, 0),
(250, 'velho shan', '', '', '', '', 0, '', '', 4, 0),
(251, 'meu devaneio', '', '', '', '', 0, '', '', 4, 0),
(252, 'MAANAIM', '384003242/2016', 'ALBERTO DA CONCEIÇÃO PINHEIRO NETO', '20', '9,0', 0, '', '', 4, 0),
(253, 'Sidonio', '', '', '', '', 0, '', '', 4, 0),
(254, 'BRANDÃO', '3840075831', 'Matheus Henrique Mendonça dos Passos', '11', '8.75', 0, '', '', 4, 0),
(255, 'MULATO', '3840085136', 'Juliano viana de Mendonça', '19', '9,0', 0, '', '', 4, 0),
(256, 'AGUAS CLARAS II', '3840172748', 'GEILSON SOARES RANGEL', '11', '7,5', 0, '', '', 4, 0),
(257, 'Lua Nova', '3840171431', 'Lucas Valente da Silva', '12', '9,6', 0, '', '', 4, 0),
(258, 'Mestre amado ', '', '', '', '', 0, '', '', 4, 0),
(259, 'NAMASTE', '3870033240', 'Danielle Ferraiuoli Vieira Fernandes', '10', '7,5', 0, '', '', 4, 0),
(260, 'TATALU', '3870045965', 'ERICK BARRETO DA COSTA BRAVO', '20', '8,5', 0, '', '', 4, 0),
(261, 'BRANDAO', '3840075831', 'carlos de souza Lima', '11', '8,75', 0, '', '', 4, 0),
(262, 'GUIA ME DEUS', '384000557/2017', '', '', '', 0, '', '', 4, 0),
(263, 'NAMASTE', '3870033240', 'Danielle Ferraiuoli Vieira Fernandes', '10', '7,5', 0, '', '', 4, 0),
(264, 'TATALU', '3870045965', 'ERICK BARRETO DA COSTA BRAVO', '20', '8,5', 0, '', '', 4, 0),
(265, 'BRANDAO', '3840075831', 'carlos de souza Lima', '11', '8,75', 0, '', '', 4, 0),
(266, 'GUIA-ME DEUS', '384000557/2017', '', '', '', 0, '', '', 4, 0),
(267, 'SANTA TEREZINHA', '3840077275', 'HISSAO MIYAMOTO', '7,5', '10,0', 0, '', '', 4, 0),
(268, 'ANGELA MAR', '3840166578', 'Sergio Luiz Serafim Lopes', '9', '6,8', 0, '', '', 4, 0),
(269, 'PEDRO ARTHUR I', '384003595/2015', 'Angela Regina Lima Lopes', '34', '9,8', 0, '', '', 4, 0),
(270, 'AGUAS CLARAS II', 'PROTOCOLO 384-000385/2017', 'ANDRE LUIZ NUNES DE OLIVEIRA', '10', '', 0, '', '', 4, 0),
(271, 'Vovo Betão', '3840170133', '', '10', '7', 0, '', '', 4, 0),
(272, 'FILHO DO VENTO I', '384001181/2016', 'RUI MACEDO SOARES', '10', '7,3', 0, '', '', 4, 0),
(273, 'VITOR', '3840170621', 'Reginaldo Carolina Domingues Junior', '24', '9,7', 0, '', '', 4, 0),
(274, 'PESCADOR DO MAR', '3870052643', 'JOSÉ CARLOS ROZA TEIXEIRA', '11', '8,5', 0, '', '', 4, 0),
(275, 'ANEQUIM I', '3840163854', '', '', '', 0, '', '', 4, 0),
(276, 'SEM RUMO', '384M2014001335', 'Alexandre Gago de Carvalho', '6', '5,8', 0, '', '', 4, 0),
(277, 'SANTA FÉ ', '3840075955', 'Luiz Carlos Fernanes Smapaio', '11', '7,6', 0, '', '', 4, 0),
(278, 'ELL SHADAI', '3870032839', '', '', '', 0, '', '', 4, 0),
(279, 'Al Camar', '3820081445', 'Sanderson Barros', '36', '12', 0, '', '', 2, 0),
(280, 'Mister M', '3840159920', 'SETE MARES COM.E ATIV. SUB LTDA ME', '64', '14,74', 0, '', '', 1, 0),
(281, 'Queiroz Diver', '3840158974', 'Queiroz Diver Atividade de Mergulho LTDA', '42', '12', 0, '', '', 1, 0),
(282, 'Anequim', '386888993', 'Marcia Expósito', '37', '15,5', 0, '', '', 1, 0),
(283, 'PL Divers', '3840159849', 'Paulo Loes de Oliveira', '50', '13,8', 0, '', '', 1, 0),
(284, 'Freedom I', '3810486311', 'Roberto de Jesus Fonseca', '34', '10,6', 0, '', '', 1, 0),
(285, 'ZEFIRO', '3840159326', 'ALEXANDRE MUNIZ JOVITA', '45', '12,5', 0, '', '', 1, 0),
(286, 'OVER SEA', '3820085882', 'Monique barreto martins', '35', '12,5', 0, '', '', 1, 0),
(287, 'Diverstec', '38500011402', 'Leonardo Arrigoni', '35', '10,05', 0, '', '', 1, 0),
(288, 'KANALOA', '3840171067', 'Vagner Alexandre Amstalden', '32', '12,8', 0, '', '', 1, 0),
(289, 'Milhafre I', '3840165679', 'Gustavo Assad Baptista', '107', '14,86', 0, '', '', 1, 0),
(290, 'Tora Tora', '3840078199', 'Gustavo Assad Baptista', '40', '13,3', 0, '', '', 1, 0),
(291, 'MIDINIGHT I', '381M2001001881', 'SEDECIAS VIANNA SIMAS', '7', '4,4', 0, 'PR', '', 5, 0),
(292, 'Mergulhao', '384M2001001424', 'GETULIO PORTO', '5', '', 0, 'PR', '', 5, 0),
(293, 'Sophia', '384M2014000894', 'ALMIR PEREIRA DA FONSECA', '6', '4,4', 0, 'PR', '', 5, 0),
(294, 'Jurgel', '381M2003001954', 'MIGUEL ANGELO RODRIGUES', '4', '4,96', 0, 'PA', '', 5, 0),
(295, 'MIDINIGHT ', '3840167779', 'MÔNICA MODESTO MARINHO (ESPOSA)', '4', '4,96', 0, 'PA', '', 5, 0),
(296, 'TOA TOA', '384M2006000517', 'AILTON ANGLO RODRIGUES', '4', '5,25', 0, 'PPA', '', 5, 0),
(299, 'Jurgui', '3840163072', 'AILTON ANGLO RODRIGUES ', '18', '', 0, 'PF', 'EM MUDANÇA DE PROP', 5, 0),
(301, 'Marcos', '', '', '0', '', 0, '', '', 1, 0),
(302, 'teste', '', '', '0', '', 0, '', '', 2, 0),
(303, 'teste2', '', '', '0', '', 0, '', '', 2, 0),
(304, 'teste3', '', '', '0', '', 0, '', '', 2, 0),
(305, 'aaaa', '', '', '0', '', 0, '', '', 2, 0),
(306, 'www', '', '', '0', '', 0, '', '', 2, 0),
(307, 'qqqqq', '', '', '0', '', 0, '', '', 3, 0),
(308, 'wwwwww', '', '', '0', '', 0, '', '', 4, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `modalidade`
--

CREATE TABLE `modalidade` (
  `nome_modalidade` varchar(100) NOT NULL,
  `codigo_modalidade` int(11) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `modalidade`
--

INSERT INTO `modalidade` (`nome_modalidade`, `codigo_modalidade`, `est`) VALUES
('brinquedo', 1, 0),
('passeio', 2, 0),
('pesca', 3, 0),
('mergulho', 4, 0),
('taxixx', 5, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `saida`
--

CREATE TABLE `saida` (
  `codigo_saida` int(11) NOT NULL,
  `codigo_solicitacao` int(11) NOT NULL,
  `numero_saidas` int(11) NOT NULL,
  `numero_visitantes` int(11) NOT NULL,
  `mes` varchar(30) NOT NULL,
  `ano` varchar(30) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `saida`
--

INSERT INTO `saida` (`codigo_saida`, `codigo_solicitacao`, `numero_saidas`, `numero_visitantes`, `mes`, `ano`, `est`) VALUES
(1, 2, 20, 15, '10', '2018', 0),
(2, 2, 5, 4, '10', '2019', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `solicitacao`
--

CREATE TABLE `solicitacao` (
  `codigo_solicitacao` int(11) NOT NULL,
  `numero_processo` varchar(100) NOT NULL,
  `sequencia_anual` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `motivo` varchar(200) NOT NULL,
  `codigo_solicitante` int(11) NOT NULL,
  `codigo_embarcacao` int(11) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `solicitacao`
--

INSERT INTO `solicitacao` (`codigo_solicitacao`, `numero_processo`, `sequencia_anual`, `status`, `motivo`, `codigo_solicitante`, `codigo_embarcacao`, `est`) VALUES
(1, '123', '12', 'teste', 'etste', 251, 16, 0),
(2, '1124', '124', '124', '124	', 19, 136, 0),
(3, '12345', '1', 'pronto', 'pq sim', 6, 270, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `solicitante`
--

CREATE TABLE `solicitante` (
  `codigo_solicitante` int(11) NOT NULL,
  `nome` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `beneficiario` varchar(10) NOT NULL,
  `CPF_CNPJ` varchar(100) NOT NULL,
  `telefone` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `bairro` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cidade` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cep` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `razao_social` varchar(100) NOT NULL,
  `nome_fantasia` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `responsavel` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `operadora` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `solicitante`
--

INSERT INTO `solicitante` (`codigo_solicitante`, `nome`, `beneficiario`, `CPF_CNPJ`, `telefone`, `endereco`, `bairro`, `cidade`, `cep`, `email`, `razao_social`, `nome_fantasia`, `responsavel`, `operadora`, `est`) VALUES
(1, 'RAFAEL GUIMARAES DE ALMEIDA GOUVEIA', 'B', '118.904.927-95', '(22)997922248', 'Rua Vera Cruz n°12 ', 'Praia dos anjos', 'Arraial do Cabo', '28930000', '', '', '', '', '', 0),
(2, 'Sebastião Duarte de Souza', 'C', '999.662.717-91', '(22)26226531/999455574', 'Rua Kioto 302 P. Anjos AC', '', '', '', '', '', '', '', '', 0),
(3, 'Phelipe Alcantara Correa de Souza', 'C', '101.367.857-51', '(22)998712224', 'Rua Mchal. Deodoro da Fonseca 53', '', '', '', '', '', '', '', '', 0),
(4, 'Cristiano Rosa Teixeira', 'B', '075.655.597-33', '(22) 7815-3537/ 999147000', 'RUA ANTONIO DE SOUZA TEIXEIRA N 26 PRAIA GRANDE', '', '', '', '', '', '', '', '', 0),
(5, 'Adalberto Ramices de Aquino Batista', 'C', '098.411.027-57', '(  )         ', 'Dom Pedro II 6 Praia dos Anjos', 'asdasdasd', 'asdasdasd', '     -   ', '', '', '', '', '', 1),
(6, 'Adelino Ferreira Junior', 'C', '081.564.837-58', '(22) 99708-3611/ 99901-6644', 'Rua Marcilio Dias 103 fundos Baleia  ', '', '', '', 'adelino_tst@hotmail.co', '', '', '', '', 0),
(7, 'Robson Sebastião de Moura', 'B', '022.383.977-95', '(22) 99823-3639', 'RUA DOM MANOEL 13 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(8, 'Ruy de Macedo Teixeira', 'B', '015.701.977-25', '(21) 99610-0495', 'Rua Vera Cruz n 27  P.Anjos', '', '', '', '', '', '', '', '', 0),
(9, 'Ibanês Calista da Silva', 'A', '413.812.037-87', '(22) 99902-6464/ 98100-9047', 'RUA RUI BARBOSA N 05 FUNDOS  PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(10, 'Marinilda Pinheiro Guimarães', 'OK', '041.155.177-94', '(22) 99982-7636', 'RUA GETÚLIO VARGAS 211B PRAIA GRANDE', '', '', '', '', '', '', '', '', 0),
(11, 'Alfredo Neves Vianna Junior', 'B', '069.299.107-75', '(22) 99823-45622622-6646', 'AV PRUDENTE DE MORAES 09 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(12, 'Jadilso Martins Barreto', 'C', '366.394.007-15', '(22)2622-6646', 'RUA GONÇALVES DIAS 26', '', '', '', '', '', '', '', '', 0),
(13, 'Fernando Nasser Abrahim de Mello Martins', 'C', '070.097.967-00', '(22) 997860381', 'PRAÇA DANIEL BARRETO 88 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(14, 'Elias Duarte Beco', 'C', '503.113.367-87', '(22) 998445432', 'TRAVESSA MANOEL FERREIRA DE SOUZA N 63 PRAINHA', '', '', '', '', '', '', '', '', 0),
(15, 'Alexandro da Silva Ferreira', 'C', '053.202.187-88', '(22) 998726311', 'Rua Rui Barbosa  n30  Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(16, 'Carlos Leonardo Silva de Carvalho', 'C', '020.822.487-47', '999992525', 'Rua Joaquim de Deus  71', '', '', '', '', '', '', '', '', 0),
(17, 'Damião Teixeira Neto', 'C', '090.444.847-96', '(22) 2622-1785', 'Rua Santos Dumont  n 22  Praia dos Anjos ', '', '', '', 'shangrilatur@yahoo.com.br', '', '', '', '', 0),
(18, 'Lenicio da Silva Souza', 'C', '029.403.927-90', '(22)999322112', 'Rua Casimiro de Abreu', '', '', '', '', '', '', '', '', 0),
(19, 'Carlos Alberto do Valle Santos', 'C', '848.857.145-15', '(22) 2622-6796 e 999204646', 'RUA JOAQUIM NABUCO  31  PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(20, 'PATRICK HENRI REBIERE ME', 'A', '676.601.937-91', '(22) 98842-2218', 'Travessa Castelo Branco n 8 BALEIA  ', '', '', '', 'patrickhrrebiere@gmail.com', '', '', '', '', 0),
(21, 'Marcelo Setta Guimarães Alhadas', 'C', '546.597.997-53', '26221046', 'Rua 7 Casa 112  Cond. Village do PontalVila Industrial', '', '', '', '', '', '', '', '', 0),
(22, 'Flavio Alessandro Barreto Tinoco', 'B', '068.615.827-00', '(22) 2622-7236', 'Rua Rebeste  n 17  Praia Grande ', '', '', '', 'ball_ball900@hotmail.com / deise.lets@outlook.com', '', '', '', '', 0),
(23, 'Luiz Carlos Fernandes Sampaio', 'A', '830.847.627-91', '(22) 2622-1773', 'RUA CAMPOS SALES  144  CENTRO', '', '', '', '', '', '', '', '', 0),
(24, 'Carlos Hnrique Pimentel de Barros', 'C', '022.381.517-96', '(22) 99767-8520', 'RUA RODRIGUES ALVES  07  PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(25, 'NORMA VIRGINIA CORREA DE OLIVEIRA', 'OK', '093.951.357-94', '(22)998198183', 'Rua Dom Manoel  235. Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(26, 'Fabio Renato Borges Pacheco', 'C', '033.745.007-22', '(22) 9740-11306', 'RUA HOLANDA 01  NOVO ARRAIAL FIGUEIRA', '', '', '', '', '', '', '', '', 0),
(27, 'Leonis Pessoa Lima', 'C', '126.190.707-83', '(22) 99800-7643', 'RUA ANTONIO DE SOUZA TEIXEIRA  N 20  PRAIA GRANDE', '', '', '', '', '', '', '', '', 0),
(28, 'WESKLEI RANGEL BORGES', 'C', '057.470.437-06', '(22) 2622-7662', 'Rua 5 N 354 Vila Industrial', '', '', '', '', '', '', '', '', 0),
(29, 'R.C Golçalves', 'C', '02.208.538/0001-11', '(22) 26226854', 'Rua D. Pedro II  11 B ', '', '', '', ' tubarãorio@tubaraorio.com.br', '', '', '', '', 0),
(30, 'Bruno Teixeira Moreno', 'C', '120.224.617-62', '(22) 99862-1138', 'LADEIRA D N 06 COMPLEMENTO C MORRO DA COCA COLA', '', '', '', '', '', '', '', '', 0),
(31, 'Jonilson Viana Saldanha', 'C', '099.143.677-63', '998261034/998261934', 'Rua Joaquim Nabuco  3 P. dos Anjos', '', '', '', '', '', '', '', '', 0),
(32, 'Fabricio Elias Canela', 'C', '073.121.637-77', '(22)999797434', 'Rua Bernardino Vianna  n 100  P. Grande', '', '', '', '', '', '', '', '', 0),
(33, 'Heros Canellas Junior', 'A', '070.111.687-02', '(22) 99852-5261', 'RUA PEDRO ISAAC DE BOMFIM CASA 11A  PRAIA GRANDE', '', '', '', '', '', '', '', '', 0),
(34, 'Ana Paula Ramos Franco', 'B-DEP', '082.872.697-33', '999586346', 'Praça Olivia Coelho Vidal 25  P. Grande ', '', '', '', 'anaparrana@gmail.com', '', '', '', '', 0),
(35, 'Eduardo Custodio Teixeira 07322726707', 'C', '12.643.487/0001-00', '(22)2622-3064', 'Rua Carlos Calixto  n 41 Baleia  ', '', '', '', 'contato@cavalomarinhoarraial.com.br', '', '', '', '', 0),
(36, 'Jeferson Melo dos Santos', 'C', '118.214.307-51', '(22)996024746', 'Rua Tres cs 65 Vila Industrial ', '', '', '', 'jefersonmelo@autlook.com', '', '', '', '', 0),
(37, 'Floriano Barreto de Mendonça Fillho', 'A', '571.866.937-68', '(22)26226733', 'Rua Joaquim Nabuco 6 P. Anjos', '', '', '', '', '', '', '', '', 0),
(38, 'Ruan Manhães Simas', 'OK', '086.764.417-66', '(22) 974001342', 'Rua Gonçalves Dias  02  P. Anjos  ', '', '', '', 'saveirodonjuan@gmail.com', '', '', '', '', 0),
(39, 'Sergio Francisco Soares Filho', 'C', '961.201.347-00', '(22) 26224153', 'Rua Reno  94 Baleia P.Anjos', '', '', '', '', '', '', '', '', 0),
(40, 'Catharino Jose da Silva Filho', 'B', '842.282.887-15', '(22) 2622-2503', 'RUA JOAQUIM NABUCO 13 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(41, 'Phelipe Gustavo dos Santos Queiroz', 'B', '124.763.957-65', '99941-2646', 'Rua Prudente de Moraes  n 11', '', '', '', '', '', '', '', '', 0),
(42, 'Marcia Andrea Pereira Campos', 'B-dep', '020.957.227-28', '992132878/998462611/26226469 /997390034', 'Rua Joaquim Nabuco 21 P. Anjos', '', '', '', '', '', '', '', '', 0),
(43, 'Lenilva Fialho Pereira', 'C-dep', '977.639.3347-00', '(22) 78343809/998877835', 'R. Marechal Deodoro da Fonseca n3', '', '', '', '', '', '', '', '', 0),
(44, 'Valci Navarro Costa', 'B', '826.167.877-68', '(22) 999177758', 'Laadeira 23 Morro da Coca Cola ', '', '', '', '', '', '', '', '', 0),
(45, 'Arraial Tur Empreendimentos Turistico LTDA ME', 'C', '07245031/0001-51', '(22)26221340/1960', 'Rua Dom Pedro II 2A  Praia  dos Anjos', '', '', '', '', '', '', '', '', 0),
(46, 'Pedro Ernesto do Amaral Guatemozim Pinto', 'A', '088.016.507-36', '(22)998533863', 'Rua Damião teixeira n 17  p. anjos   ', '', '', '', 'pedro.amaral.pinto@hotmail.com', '', '', '', '', 0),
(47, 'Paulo Luis Barreto Ribeiro', 'B', '010.135.967-57', '(22)998944949', 'r Julio de Macedo 185 Canaa Arraial do Cabo', '', '', '', '', '', '', '', '', 0),
(48, 'Sergio Fernando de Azevedo Ribeiro', 'C', '248.881.687-68', '(22)998197564/26621033/998197564', 'Rua Costa do Sal n 128 Figueira', '', '', '', '', '', '', '', '', 0),
(49, 'Luis Otavio Macedo da Silva', 'C', '776.163.407-68', '(22)999539855', 'Trv. Manoel Duarte 211  Morro Coca cola', '', '', '', '', '', '', '', '', 0),
(50, 'Elem Carla Pinto Florentino', 'OK', '100.323.977-39', '(22) 26223936/999033776', 'Rua Nilo Peçanha 19/307  Praia Anjos', '', '', '', '', '', '', '', '', 0),
(51, 'Charles Martins Gonçalves', 'OK', '306.444.967-20', '2622-2268', 'Rua Rui Barbosa n 13  Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(52, 'Rondynelli Machado de Macedo', 'OK', '076.791.507-02', '(22)998229367', 'Av. Getulio Vargas  102 Praia Grande ', '', '', '', '', '', '', '', '', 0),
(53, 'Laerte Pessoa Cardoso', 'C', '517.039.477-20', '(22) 7835-4769/998225511', 'RUA NILO PEÇANHA  4  PRAIA DOS ANJOS ', '', '', '', '', '', '', '', '', 0),
(54, 'DANIEL SIMAS VIANNA DE MENDONÇA', 'OK', '099.704.567-17', '(22) 99885-9943 / 98101-1115', 'RUA AMÉRICO VESPÚCIO  N 08', '', '', '', '  svmendoncadaniel@yahoo.com.br', '', '', '', '', 0),
(55, 'DANIEL SIMAS VIANNA DE MENDONÇA', 'OK', '099.704.567-17', '(22) 99885-9943 / 98101-1115', 'RUA AMÉRICO VESPÚCIO  N 08', '', '', '', '  svmendoncadaniel@yahoo.com.br', '', '', '', '', 0),
(56, 'Virgílio Marcio dos Santos', 'C', '516.483.507-04', '(22)26221173/997390729', 'Rua Padre Anchieta  80  Bairro Macedônia', '', '', '', '', '', '', '', '', 0),
(57, 'Tairony Rodrigues Neves', 'OK', '075.630.427-09', '998196683', 'Rua José Francisco 70', '', '', '', '', '', '', '', '', 0),
(58, 'Paola Vitória de Lana Melo de Carvalho', 'B-DEP', '143.680.697-65', '(22)998692508/26226348/999969178', 'Rua Almirante Tamandaré 326A Macedonia', '', '', '', '', '', '', '', '', 0),
(59, 'Francisco Carlos Martins/Luiz Felipe Cruz Moraes procurador', 'C', '094.161.897-15/046.297.747-18', '(22)999161882', 'Rua Restinga  n 1277  P. do Foguete Cabo Frio/ R. Jocob Mureb 21 Recanto das Dunas Cabo Frio', '', '', '', '', '', '', '', '', 0),
(60, 'Raphael Melo de Andrade', 'OK', '776.164.997-91', '(22)998784336', 'Rua Marechal Hermes da Fonseca n104  P. Grande', '', '', '', '', '', '', '', '', 0),
(61, 'Oscar Victorino Barreto Neto', 'C', '041.162.227-71', '997256585', 'Rua Joaquim Martins Fialho  11  P. Anjos  ', '', '', '', 'oscar.kaka.victorino@hotmail.com', '', '', '', '', 0),
(62, 'Emilene Carvalho Felix', 'A - DEP', '072.923.407-09', '998149872', 'Rua Wenceslau Braz  n 224 ', '', '', '', '', '', '', '', '', 0),
(63, 'Roberto José  Barreto Barcelos Junnior ', 'C', '022.383.547-19', '(22) 999729972', 'Rua José Francisco 182 P. Grande', '', '', '', '', '', '', '', '', 0),
(64, 'Raimundo Nonato Rocha Sobrinho', 'A', '783.905.247-91', '(24)998913174', 'R Arthur Bernardes n 3640  P. Grande Boa Vista ', '', '', '', '', '', '', '', '', 0),
(65, 'Walcy Soares Netto', 'A', '212.868.847-72', '(22) 999182102', 'RUA GONÇALVES DIAS  2  PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(66, 'Sergio Duarte de Souza', 'OK', '831.019.187-15', '988328313/26223073', 'Rua Toquio  247  Baleia', '', '', '', '', '', '', '', '', 0),
(67, 'Max Golçalves Arrais', 'C', '069.270.987-80', '(22)998084284', 'Rua Carlos Gomes  n23  P. Grande', '', '', '', '', '', '', '', '', 0),
(68, 'Manoel Viana Netto', 'B', '212.847.177-04', '26221823', 'R. Goncalves Dias  29  P. dos Anjos', '', '', '', '', '', '', '', '', 0),
(69, 'Welington Melo de Araujo', 'B', '070.526.077-19', '(22)999614241', 'Rua Vera Cruz Trav. Merlusa  n 39', '', '', '', '', '', '', '', '', 0),
(70, 'Sergio Luiz Serafim Lopes', 'B', '814.531.407-00', '(22) 2622-6546', 'Rua Manoel Duarte  38  Sítio ', '', '', '', '', '', '', '', '', 0),
(71, 'Gilmar Fernando da Costa Bravo', 'C', '007.525.378-06', '(22)999449988', 'Av. Liberdade  501  P. Anjos   ', '', '', '', 'limpama@hotmail.com', '', '', '', '', 0),
(72, 'Fabiano Rodrigues Cardozo', 'C', '075.510.097-28', '26227496', 'Rua Marechal Hermes da Fonseca  187  cs 8', '', '', '', '', '', '', '', '', 0),
(73, 'Jovanor Soares', 'A', '785.318.534-00', '2622-2704', 'Alameda Pio XII n 11', '', '', '', '', '', '', '', '', 0),
(74, 'Antonio Carlos de Oliveira', 'C', '837.121.277-15', '', '', '', '', '', '', '', '', '', '', 0),
(75, 'Claudio dos Anjos Praxedes', '', '006.369.607-06', '', '', '', '', '', '', '', '', '', '', 0),
(76, 'Lucia Martins Ribeiro Novas', 'C', '087.645.357-46', '(22)26226680', 'Rua José Pinto de Macedo  270 lt 08', '', '', '', '', '', '', '', '', 0),
(77, 'Allan de Souza dos Anjos', 'B', '115.778.307-41', '(22)99864-8766', 'Rua Marechal Floriano Peixoto n  05 P. Anjos', '', '', '', '', '', '', '', '', 0),
(78, 'Marco Antonio Felix Barreto', 'A', '006.367.397-59', '(22)999048881', 'Rua Joaquim Nabuco  n9', '', '', '', '', '', '', '', '', 0),
(79, 'AIDA BARROS PESSOA', 'A', '041.161.477-02', '99870-2081', '', '', '', '', '', '', '', '', '', 0),
(80, 'Mauro Cesár G. da Silva', 'A', '', '', '', '', '', '', '', '', '', '', '', 0),
(81, 'GILMAR ROCHA DA SILVA', 'A', '903.252.067-91', '996021948', 'Rua RodRIGUES ALVES  13 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(82, 'Altamir Elias Canela', '', '213.208.107-72', '(22) 26221508', 'rR. Americo Vespúcio  109  Praia  Grande', '', '', '', '', '', '', '', '', 0),
(83, 'Erick Barreto da Costa Bravo', '', '055.383.417-71', '(22) 78355965', 'Rua Vera Cruz  n 07  Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(84, 'Janizete Pereira Duarte', 'C', '041.166.487-52', '(22)998181459-26222216', 'Rua São Francisco de Assis  270 Macedonia', '', '', '', '', '', '', '', '', 0),
(85, 'Costa Nobre Turismo Nautico LTDA ME', 'C', '08.605.708/0001-88', '(22) 99830-2838/26450776', 'RUA AMÉRICO VESPÚCIO N 18', '', '', '', '', '', '', '', '', 0),
(86, 'Douglas Prudência da Silva', '', '092.008.877-59', '999276017', 'Tr. Arthur Bernardes  21  P. Grande', '', '', '', '', '', '', '', '', 0),
(87, 'Gustavo Neves Vianna', '', '127.709.477-29', '997149054', 'Rua Joaquim Nabuco  4', '', '', '', '', '', '', '', '', 0),
(88, 'Jó Rezende Alves', '', '079.397.277-96', '998971006', 'Rua Nazareth  n259  Fundos', '', '', '', '', '', '', '', '', 0),
(89, 'RAFAEL RICHARD SIQUEIRA BARRETO', '', '134.256.557-60', '997432482', 'Rua Joaquim Nabuco  n9   Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(90, 'Helio Giovannini da Costa', 'C', '016.836.147-71', '(22) 998287763/981477780', 'Rua Irmã Josefina da Veiga  s/n Palmeiras  Cabo Frio', '', '', '', '', '', '', '', '', 0),
(91, 'Wilian Netto Mendonça', 'B', '090.883.967-79', '999183950', 'Rua ana nery  12  Sitio', '', '', '', '', '', '', '', '', 0),
(92, 'EDUARDO ANDRADE ROCHA', 'B', '783.854.237-53', '999721575', 'Rua Duque de Caxias  38', '', '', '', '', '', '', '', '', 0),
(93, 'Monica Modesto Marinho', 'A', '319.977.325-72', '999287908/26222543', 'Rua Epitácio Pessoa  Praia Grande n  08', '', '', '', '', '', '', '', '', 0),
(94, 'Joceley de Oliveira Gonçalves', 'C', '010.133.177-00', '22 992654660', 'Rua Venancio Mello  n 10', '', '', '', '', '', '', '', '', 0),
(95, 'Idimar Segreto Augusto', 'B', '702217667-15', '26227007', 'Rua Americo Vespucio  n 30', '', '', '', '', '', '', '', '', 0),
(96, 'Rodrigo da Costa Souza de Paula', 'C', '126.341.687-05', '99813-3168', 'Avenida Dom Pedro I  n 101   Centro', '', '', '', '', '', '', '', '', 0),
(97, 'EDMILSON VIEIRA DE ARAUJO', 'B', '088.592.777-01', '', 'Rua Nilo Peçanha  n 35  P. dos Anjos', '', '', '', '', '', '', '', '', 0),
(98, 'Igor Porto de Mendonça', 'B', '085.399.147-17', '26226733', 'Rua Joaquim Nabuco  n 6 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(99, 'Marcelo Silva Barcelos', 'C', '103.387.787-56', '(22)997059378', 'Rua Santa Luzia  n9  Monte Alto', '', '', '', '', '', '', '', '', 0),
(100, 'Viviane Ambrósio Durão Pereira', 'C', '091.225.017-89', '(22) 992514420', 'Trav. Tubarão 03 Bairro Sitio', '', '', '', '', '', '', '', '', 0),
(101, 'Diego Porto de Mendonça', 'B', '102.695.517-35', '22 999160706', 'Rua Francisco pires de mendonça n 13', '', '', '', '', '', '', '', '', 0),
(102, 'Paulo Roberto Ferreira', 'A', '999.641.127-34', '999067655', 'Rua Pedro Alvares Cabral n 10 fundos', '', '', '', '', '', '', '', '', 0),
(103, 'Edilcea Barreto Teixeira', 'B', '015.517.747-99', '26225522', 'Rua Goncalves Dias 36', '', '', '', '', '', '', '', '', 0),
(104, 'Fabio Mendonça Fialho', 'C', '095.815.897-59', '(22) 974028882', 'Rua Epitácio Pessoa Praia Grande  n 61', '', '', '', '', '', '', '', '', 0),
(105, 'José Carlos da Silva', 'B', '068.847.607-45', '(22)26225522', 'Rua Gonçalves Dias n36', '', '', '', '', '', '', '', '', 0),
(106, 'ARTHUR BARRETO DOS SANTOS', 'A', '088.280.187-20', '22 99765-3592', 'Rua Damião Teixeira  n 27  p. anjos   ', '', '', '', '', '', '', '', '', 0),
(107, 'Luis Carlos Barreto Ribeiro', 'B', '869.246.307-82', '_____', 'Rua Pastor Paulo Manhard  15  P Grande', '', '', '', '', '', '', '', '', 0),
(108, 'Rodrigo Porto de Mendonça', 'B', '111.554.787-97', '26226733', 'R Joaquim nabuco  06 ', '', '', '', '', '', '', '', '', 0),
(109, 'Ezio Mendonça de Mello', 'C', '031.258.807-00', '26223036/999532038', 'Rua Gonçalves Dias n  24  Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(110, 'ALDIZIO SILVEIRA DE BRITO', 'C', '708.316.617-04', '981396049', 'Rua Delfim Moreira  n 16', '', '', '', '', '', '', '', '', 0),
(111, 'Paulo Henrique Rodrigues Cardozo', 'B', '001.948.647-23', '999299904', 'Av. Gov. Leonel Brizola  46  Centro', '', '', '', '', '', '', '', '', 0),
(112, 'Jean Barros da Rocha', 'C', '015.139.427-00', '997284696', 'Rua Duque de Caxias  n 42  P Anjos', '', '', '', '', '', '', '', '', 0),
(113, 'Manoel Adilso Vianna Alves', 'B', '194.508.427-87', '26221528', 'Rua Duque de Caxias  n 49  P Anjos', '', '', '', '', '', '', '', '', 0),
(114, 'Cleyton da Costa Barreto', 'B', '095.411.307-12', '26226840-996095849', 'Rua Manoel Duarte, n° 3 -Sitio ', '', '', '', '', '', '', '', '', 0),
(115, 'ERALDO TEIXEIRA DA CUNHA', 'A', '503.146.537-91', '999006305', 'Rua Vera Cruz  n 15  P. Anjos', '', '', '', '', '', '', '', '', 0),
(116, 'BRUNO FABIANO AZEVEDO DA SILVA', 'C', '129.033.987-20', '997047260', 'Rua Ana Neris  19A Fundos ', '', '', '', '', '', '', '', '', 0),
(117, 'RENATO Mendonça Barreto', 'C', '078.247.597-33', '26226646', 'Rua Fernando Mello  75  P. Anjos', '', '', '', '', '', '', '', '', 0),
(118, 'Cristiano da Silva Pimentel', '', '076.699.357-40', '998125589', 'Rua Nilo Peçanha  16  Sobrado  P. Anjos', '', '', '', '', '', '', '', '', 0),
(119, 'Carlos Roberto Rocha Mansur', '', '006.820.317-98', '26224717', 'Rua Arthur Bernardes  49  P. Grande', '', '', '', '', '', '', '', '', 0),
(120, 'Carlos Manoel da Trindade Barreto', '', '055.645.387-57', '26225886-78354637', 'Rua Jose Francisco  31  P grande', '', '', '', '', '', '', '', '', 0),
(121, 'Marcos Eduardo Barreto Ferreira', '', '752.733.907-10', '988226710/998063118', 'Rua Joaquim Nabuco  25  P. Anjos', '', '', '', '', '', '', '', '', 0),
(122, 'Diogo Martins de Andrade', '', '133.271.957-06', '997580141', 'Rua Benjamim Constant  28A Fundos', '', '', '', '', '', '', '', '', 0),
(123, 'MARCELO MONTEIRO NEVES', '', '023.693.077-06', '26227195', 'Rua Dom Manoel  n 03 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(124, 'Luiz Carlos Gomes de Souza', '', '031.296.807-80', '26226408', 'rua Arthur Bernardes  42  P. Grande', '', '', '', '', '', '', '', '', 0),
(125, 'Guilhermino Correa Barreto', '', '519.544.197-91', '999585875', 'Rua Wenceslau Bras  98  P Granda', '', '', '', '', '', '', '', '', 0),
(126, 'Marcos Vinicius de Almeida', '', '053.652.477-79', '996108644', 'Rua Aprigio Martins  54  P. Anjos', '', '', '', '', '', '', '', '', 0),
(127, 'Albertino Carvalho', '', '640.924.537-87', '', 'Alameda Boa Vista  13', '', '', '', '', '', '', '', '', 0),
(128, 'Robson Porto da Silva', '', '031.274.197-10', '992620851', 'Rua Jose Francisco  670  Canaa', '', '', '', '', '', '', '', '', 0),
(129, 'Ricardo Leite Barbosa', '', '079.067.597-88', '974025835 - 997952532', 'Rua Manoel Duarte  n 96  Sitio', '', '', '', '', '', '', '', '', 0),
(130, 'Alexandre Francisco e Emilene Carvalho', 'OK', '072.923.407-09 EMILENE e 006.516.897-67 ALEXANDRE', '(22) 99814-9872 E (22) 99863-4780', 'RUA CAPITÃO AUGUSTO LOURENÇO  128 PASSAGEM CABO FRIO', '', '', '', '', '', '', '', '', 0),
(131, 'Arraial Tur Empreendimentos Turistico LTDA ME', 'ok', '07245031/0001-51', '(22)26221340/1960', 'Rua Dom Pedro II 2/A  Praia  dos Anjos', '', '', '', '', '', '', '', '', 0),
(132, 'Marcio Freire de Motta ', 'ok', '028.202.907-95', '(22) 99816-8578', 'RUA JOSÉ CYRO MARQUES CASA 08  PRAIA DOS ANJOS ', '', '', '', '', '', '', '', '', 0),
(133, 'Carlos Henrique Pimentel de Barros', 'ok', '022.381.517-96', '997678520', 'Rua Rodrigues Alves  n7  Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(134, 'Fábio Renato Borges Pacheco', 'OK', '033.745.007-22', '(22) 9740-11306', 'RUA HOLANDA  01  NOVO ARRAIAL FIGUEIRA', '', '', '', '', '', '', '', '', 0),
(135, 'Altair Lemos de Paula', 'OK', '774.472.207-87', '(22)   2622-3144 e 99901-2942 ', 'RUA DOM PEDRO I  N 101  PRAIA GRANDE  ARRAIAL DO CABO', '', '', '', '', '', '', '', '', 0),
(136, 'Igor Rocha Matias de Souza', 'OK', '052.810.067-03', '(21) 78677036', 'RUA 1 S/N PRAIA DO PONTAL', '', '', '', '', '', '', '', '', 0),
(137, 'Jorge Bernardino da Conceição', 'ok', '106.753.047-92', '(22)26222451', 'Rua Nazareth  109  Canaã', '', '', '', '', '', '', '', '', 0),
(138, 'Keila Rachel da Costa Ramos de Azevedo', 'ok', '857.571.007-78', '(22)26222720', 'Rua Santa Cruz  07. P. Anjos', '', '', '', '', '', '', '', '', 0),
(139, 'Augusto Cesar Menezes Ramos de Azevedo', 'OK', '858.162.247-00', '(22)2622-2720', 'Rua Santa Cruz  07. P. Anjos', '', '', '', '', '', '', '', '', 0),
(140, 'Diego Silvestre Ferreira', 'ok', '132.369.417-07', '(22) 99703-7867', 'RUA MARCÍLIO DIAS  725  ARRAIAL DO CABO', '', '', '', '', '', '', '', '', 0),
(141, 'Israel Neves da Silva Paiva', 'OK', '133.245.167-57', '(22)996766232', 'Rua Ceará  n 3', '', '', '', '', '', '', '', '', 0),
(142, 'Gilmar Fernando da Costa Bravo', 'ok', '007.525.378-06', '(22) 999449988', 'Av. Liberdade 501  P Anjos', '', '', '', '', '', '', '', '', 0),
(143, 'Clovis Eduardo Barreto', 'ok', '015.138.647-18', '(22)26226637/999098668', 'r. Gonçalves Dias  52  Frente ', '', '', '', '', '', '', '', '', 0),
(144, 'Henock Pessoa de Melo', 'OK', '413.804.527-91', '(22)26224417/ 99497332', 'Rua Frei Caneca  n112  Macedônia', '', '', '', '', '', '', '', '', 0),
(145, 'Marcel Tour Transportadora Turística LTDA ME', 'ok', '04.755.828/0003-72', '(22) 26225929', 'Rua Carlos Aguiar  14 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(146, 'Carla Daiane Pessanha de Souza', 'ok', '010.135.967-57', '(22)998944949', 'r Julio de Macedo 185 Canaa Arraial do Cabo', '', '', '', '', '', '', '', '', 0),
(147, 'Roberto José  Barreto Barcelos Junnior ', '', '022.383.547-19', '(22) 99972-9972', 'RUA JOSÉ FRANCISCO  182  PRAIA GRANDE', '', '', '', '', '', '', '', '', 0),
(148, 'Gladis Marli Goulart Salbego', 'ok', '283.096.690-20', '(22)26225735', 'Rua Miguel Angelo, 52', '', '', '', '', '', '', '', '', 0),
(149, 'Luis Otavio Macedo da Silva', 'ok', '776.163.407-68', '(22)999539855', 'Trv. Manoel Duarrte  211/Morro coca cola', '', '', '', '', '', '', '', '', 0),
(150, 'Eliane Pires de Souza', 'OK', '955.296.327-34', '(22) 99845-3207', 'RUA VERA CRUZ, 18, ARRAIAL DO CABO', '', '', '', '', '', '', '', '', 0),
(151, 'João  Antonio de Alencar', 'OK', '3840159873', '(22) 2622-2554', 'RUA CASTRO ALVES  150  PRAIA GRANDE', '', '', '', '', '', '', '', '', 0),
(152, 'Ivan Sérgio Ferreira Conceição', 'OK', '503.114.257-04', '2622-4506/ 99928-6660', 'Rua Aprígio Martins  n 05  Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(153, 'Vitor Henrique Jediroba Cruz Correa', '', '056.220.837-29', '(22) 99977-6757', 'RUA PROF. ISMAR GOMES DE AZEVEDO  442 102 B CABO FRIO', '', '', '', '', '', '', '', '', 0),
(154, 'Floriano Barreto de Mendonça Fillho', 'ok', '571.866.937-68', '(22)26226733', 'Rua Joaquim Nabuco  6  P. Anjos', '', '', '', '', '', '', '', '', 0),
(155, 'Aldeir Coutinho Oreles', 'B', '005.763.777-67', '(22)26228075/998585903', 'Rua Vilas Boas 454 Canãa', '', '', '', '', '', '', '', '', 0),
(156, 'Ubirajara José da Silva', 'A', '488.548.407-34', '(22) 999428253', 'Rua Gonçalves Dias 09 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(157, 'Claudio Elir Moreira de Souza', 'A', '905.883.557-04', '(22)998123464', 'Av. Getulio Vargas n56  P. Grande', '', '', '', '', '', '', '', '', 0),
(158, 'Amador Trigo Lage', 'C', '701189737-20', '(22) 78117234/26226729', 'RUA RUI BARBOSA N 15 CASA 08 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(159, 'Leandro Nascimento Margarido', '', '073.656.727-57', '(22) 26223934', 'Rua Tomé de Souza n 76 Morro da Coca Cola', '', '', '', '', '', '', '', '', 0),
(160, 'Rodrigo Leite Barbosa', 'C', '097.563.747-99', '(22) 99822-5318', 'Rua Almirante Tamandaré n 326B Praia Grande', '', '', '', '', '', '', '', '', 0),
(161, 'José dos Santos Pereira', 'C', '081.105.277-01', '(22) 99828-4035', 'Rua Tomé de Souza Travessa C  casa 01 Morro da Coca  ', '', '', '', 'jeanangelo1@hotmail.com', '', '', '', '', 0),
(162, 'Oswaldo Lopes de Aguiar Filho', '', '194.502.577-87', '(22) 2647-4493 / 99903-7327', 'RUA DA AMIZADE N 15  CAJUEIRO  CABO FRIO ', '', '', '', '', '', '', '', '', 0),
(163, 'Antunes Gomes Barbosa', 'B', '110.693.857-78', '(22) 99957-3852 E (22) 7834-3211', 'TRAVESSA MANOEL F. DE SOUZA N 05 A  PRAINHA', '', '', '', '', '', '', '', '', 0),
(164, 'JORGE Alberto da Silva Junior', 'A', '282.722.958-73', '(22) 999318098', 'Rua Antonio Teixera de Souza n 7 AC', '', '', '', '', '', '', '', '', 0),
(165, 'Luiz Carlos Antunes Rodrigues', 'A', '519.643.857-34', '(22) 999481693', 'Trv. Brinco de Ouro n 72', '', '', '', '', '', '', '', '', 0),
(166, 'Amarildo Godinho Gonlçalves', 'B', '007.057.227-59', '(22) 99815-7771', 'TRAVESSA MANOEL DE SOUZA 32 MORRO DA COCA', '', '', '', '', '', '', '', '', 0),
(167, 'Mauricio Renato Lopes', 'C', '399.356.127-91', '(22)999053968', 'Rua 1 n 23 Praia Pontal', '', '', '', '', '', '', '', '', 0),
(168, 'Gilberto Maia Ohoishi', 'B', '899.394.767-87', '(22)998396442', 'Rua Vilas boas 203 fundos Canaã', '', '', '', '', '', '', '', '', 0),
(169, 'Edezio de souza Teixeira', '', '081.670.957-20', '26222306', 'Rua Carlos Calixto 41 Baleia', '', '', '', '', '', '', '', '', 0),
(170, 'Alexandre Estevan da Silva ME', 'C', '088.067.067-30', '999073404', 'Rua Dom Manoel Duarte 85 Sitio', '', '', '', 'barcotarantella@gmail.com', '', '', '', '', 0),
(171, 'Leonardo Rocha Neto', 'B', '022.350.927-21', '(22)999712739', 'Rua Marechal  Floriano Peixoto 44', '', '', '', '', '', '', '', '', 0),
(172, 'Closvis Eduardo Barreto', 'C', '015.138.647-18', '26226637/999098668', '', '', '', '', 'OCAPITAOVEMAI@HOTMAIL.COM', '', '', '', '', 0),
(173, 'Mariana Fialho Simões', 'C', '124.791.177-23', '(22) 97401-2366', 'Av. Pedro Francisco Sanches n 17 Antiga Estrada da Figueira. Monte Alto  A. Cabo/RJ ', '', '', '', 'mancofialho76@gmail.com ', '', '', '', '', 0),
(174, 'Carlos Alberto Pimentel Junior', 'A', '133.485.807-14', '999737703', 'Rua Nilo Peçanha 46 P. Anjos', '', '', '', '', '', '', '', '', 0),
(175, 'Carmelio Fabiano da Silva', 'B', '961.843.887-20', '(22) 998199967', 'Rua Ana Neris 19 Bairro Sitio', '', '', '', '', '', '', '', '', 0),
(176, 'Altair Lemos de Paula', '', '774.472.207-87', '(22)   2622-3144 e 99901-2942 ', 'RUA DOM PEDRO I N 101 PRAIA GRANDE ', '', '', '', '', '', '', '', '', 0),
(177, 'Weskley Rodrigues Costa de Macedo', '', '099.925.167-80', '(22)988112262/998439893', 'Rua Nazareth  317 Canaa', '', '', '', '', '', '', '', '', 0),
(178, 'Celso Soares de Souza', '', '412.701.937-91', '(22)992692684', 'Trav. Tomé de Souza n23', '', '', '', '', '', '', '', '', 0),
(179, 'Inacio Ferreira Fialho', '?', '006.523.327-14', '(22) 997315832', 'Tvs. Manoel Duarte 13 B Morro Coca-cola', '', '', '', '', '', '', '', '', 0),
(180, 'Luis Eduardo Frederico de Mattos', 'B', '462.771.297-91', '(22) 99992-0845', 'Rua Marechal Hermes da Fonseca n 53 Praia Grande ', '', '', '', '', '', '', '', '', 0),
(181, 'Cleber Victorino Barreto', '???', '046.810.688-02', '(22)99942-5719', 'RUA 2 293 VILA INDUSTRIAL ', '', '', '', '', '', '', '', '', 0),
(182, 'Antônio Marcos Maciel Neves', '????', '022.351.157-99', '(22) 26222428', 'Rua Marcilio Dias 725', '', '', '', '', '', '', '', '', 0),
(183, 'Ronaldo Carneiro Alvarenga', 'A', '076.657.357-54', '(2299872-9161', 'Rua Sao Francisco de Assis n87 Macedonia ', '', '', '', '', '', '', '', '', 0),
(184, 'Lucineide Oliveira Valdiviro', 'A -DEP', '106.038.017-06', '(22)999099414', 'RUA Vilas Boas 370', '', '', '', '', '', '', '', '', 0),
(185, 'Marco Antonio Gonçalves Dias', 'C', '399.743.917-68', '(22)999882484', 'Rua Miguel Angelo 20 P. Grande', '', '', '', '', '', '', '', '', 0),
(186, 'CARLOS ROBERTO Serra da Cunha', 'C', '611.823.707-72', '(22) 997537954', 'Rua Tamandaré 37', '', '', '', '', '', '', '', '', 0),
(187, 'Eliane Maria Fonseca da Silva', 'OK', '739.115.267-68', '(22) 99936-7676', 'AV. DA LIBERDADE 39 PRAIA DOS ANJOS ', '', '', '', '', '', '', '', '', 0),
(188, 'Tahinan dos Santos Pereira', 'OK', '132.836.397-01', '(22) 974017453/78115900', 'Rua George Washington n 226 Macedonia', '', '', '', '', '', '', '', '', 0),
(189, 'Jares Luiz Borges Pacheco', 'OK', '025.286.197-31', '(22)974012912', 'Rua 1 n 23 Praia Pontal', '', '', '', '', '', '', '', '', 0),
(190, 'Jeferson Matos de Azevedo', 'C', '281.546.928-64', '(22) 98118-4984', 'RUA 03 N 245 PRAIA DO PONTAL  COND VILLAGE DO PONTAL  ', '', '', '', 'jeftuba@hotmail.com', '', '', '', '', 0),
(191, 'Elan de Macedo Porto', 'C', '041.163.377-57', '998551293', 'Rua Vera Cruz n 17 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(192, 'Willson Alcantara Gago', '', '516.488.817-34', '(22)999961774', 'Rua Vera Cruz n 68  P. Anjos', '', '', '', '', '', '', '', '', 0),
(193, 'Josè Luciano dos Santos', '', '092.917.567-09', '999430712', 'Rua Antonio Alves n43 Monte Alto', '', '', '', '', '', '', '', '', 0),
(194, 'Almir Pereira de Fonseca', '', '906.256.097-00', '(22)998391625', 'Rua Venancio Melo 30, Centro Arraial do Cabo', '', '', '', '', '', '', '', '', 0),
(195, 'Cesar Aquiles de  Souza Teixeira', 'B', '006.352.657-37', '26221547/999226783', 'Av Litoranea Av Hermes Barcelos n430 Praia Grande ', '', '', '', '', '', '', '', '', 0),
(196, 'Angélica de Souza Corado', 'B', '088.535.037-50', '(22)997702002', 'Rua Maria dos Remedios 50 Fundos  Prainha', '', '', '', '', '', '', '', '', 0),
(197, 'Paulo Cristiano Pessoa de Mello', 'B', '620.008.107-72', '(22)99949-7332', 'Rua Luiz Correa 04 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(198, 'Edson Rodrigues Malvolti', 'C', '104.075.327-22', '(22) 998561708', 'RUA ANNA NERY N 19 B segundo PISO SÍTIO', '', '', '', '', '', '', '', '', 0),
(199, 'Magno Freitas Dias', 'B', '130.235.227-07', '22 999291350', 'Morro Boa Vista n 5', '', '', '', '', '', '', '', '', 0),
(200, 'CESAR WILLIAMS FONSECA DOS SANTOS', 'A', '403.971.737-68', '22 99902-3528', 'Rua Vera Cruz 24 P. Anjos', '', '', '', '', '', '', '', '', 0),
(201, 'Iraty Alves Filho', 'C', '760.834.037-15', '(22)985725612', 'Praça Tiradentes 49 casa 03 Centro /Arraial do Cabo', '', '', '', '', '', '', '', '', 0),
(202, 'Emmanoel Oliveira da Cunha Neto', '', '097.250.237-81', '999075849', 'tv. Jose Praxedes 12 ', '', '', '', '', '', '', '', '', 0),
(203, 'Anisio Ferreira', '', '638.807.417-00', '99843-9893', 'Rua Nazareth n 317 canaa', '', '', '', '', '', '', '', '', 0),
(204, 'WALBER RODRIGUES COUTINHO', '', '906.600.997-72', '(22) 998745212', 'TRAVESSA ANTONIO BORGES PINHEIRO 10A PRAINHA', '', '', '', '', '', '', '', '', 0),
(205, 'José Francisco de Assis Coutinho Jardim', '', '965.418.577-68', '998636356', 'Rua Vilas Boas n 360 Cs 4 Canaã', '', '', '', '', '', '', '', '', 0),
(206, 'Joceley de Oliveira Gonçalves', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(207, 'Jean Barros da Rocha', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(208, 'Paulo Cesar Oliveira Santiago', '', '039.035.927-06', '(22) 999536009', 'Rua Francisco Pires. Mendonça 41 Praia Grande ', '', '', '', '', '', '', '', '', 0),
(209, 'ALCILEIA RODRIGUES MARTINS', '', '358.106.617-34', '(22) 2662-9408/ 996035140', 'RUA ANTONIO ROCHA 36  MONTE ALTO', '', '', '', '', '', '', '', '', 0),
(210, 'JAIR MEIRELLES DA SILVA FILHO', '', '458.217.987-87', '99986-7650', 'Rua Jose Francisco n 690', '', '', '', '', '', '', '', '', 0),
(211, 'LAIS ROGERIO DE OLIVEIRA', '', '147.185.647-00', '997930588', 'Rua Tomé de Souza 220 Morro Cabocla', '', '', '', '', '', '', '', '', 0),
(212, 'JOSÉ CARLOS GAGO', '', '688.861.367-49', '(22) 99845-4912', 'RUA VERA CRUZ N 08', '', '', '', '', '', '', '', '', 0),
(213, 'Anderson Ribeiro dos Anjos', '', '(22)999543812', '055.748.417-03', 'Rua Tomé de Souza , 99-Morro Coca Cola', '', '', '', '', '', '', '', '', 0),
(214, 'LEANDRO BARREIRA DA SILVA ', '', '083.996.177-41', '(22)26227588/ 999915754', 'RUA MARCILIOS DIAS 739 CANAA ', '', '', '', 'leandrotjvdocabo@hotmail.com', '', '', '', '', 0),
(215, 'GILBERTO SOUZA DA SILVA', '', '077.215.437-62', '(22) 99846-4095', 'TRAVESSA ARCENIO PESSOA N 5 PRAIA GRANDE', '', '', '', '', '', '', '', '', 0),
(216, 'ALEXANDRE MELO DE ARAÚJO', '', '031.297.007-22', '2622-7415', 'RUA NILO PEÇANHA 35 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(217, 'GILMAR ALCANTARA PACHECO', '', '977.325.756-68', '2622-725899744-0325', 'Praça Ana Maria dos Remedios n35  Prainha', '', '', '', '', '', '', '', '', 0),
(218, 'BERNARDO SIMAS PORTO', '', '965.418.227-00', '2622-6725/ 99848-1069', 'ALAMEDA BOA VISTA N 4 MORRO DA BOA VISTA', '', '', '', '', '', '', '', '', 0),
(219, 'EROÍNA GOMES DA SILVA', '', '127.350.967-64', '99810-5156', 'TRAVESSA TOMÉ DE SOUZA N 88  MORRO DA COCA COLA', '', '', '', '', '', '', '', '', 0),
(220, 'Edmilson de Braga Fialho', '', '799.929.867-00', '(22) 26224286/999771702', 'Rua Prudente de Morais n 22 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(221, 'Clovis de Aguiar', '', '516.947.787-20', '(22)997890432', 'Rua Delfim Moreira 4A P. Grande', '', '', '', '', '', '', '', '', 0),
(222, 'Erenil Gomes Rangel', '', '999.643.257-20', '(22) 998174364', 'R. Vera Cruz 20C 03', '', '', '', '', '', '', '', '', 0),
(223, 'MECLIDES FERREIRA DE MACEDO JUNIOR', '', '028.719.257-12', '98803-3053', 'Rua Julio de Macedo 13 Vila Canaã ', '', '', '', '', '', '', '', '', 0),
(224, 'Rafael Pereira Teixeira', '', '126.166.257-17', '99856-4428', 'Rua Antonio de Souza Teixeira n 15', '', '', '', '', '', '', '', '', 0),
(225, 'MAURICIO JARDIM RIBEIRO', '', '107.364.627-08', '99919-4481', 'Rua Vilas Boas n370', '', '', '', '', '', '', '', '', 0),
(226, 'JOSE CARLOS DE CARVALHO', '', '408.335.187-04', '99891-6268', 'Rua manoel Duarte n 99 A', '', '', '', '', '', '', '', '', 0),
(227, 'Paulo Henrique Sodré Cordeiro', '', '', '(22)999971003', 'Rua Nilo Peçanha 33 P. Anjos', '', '', '', '', '', '', '', '', 0),
(228, 'EDUARDO MELLO DE ARAUJO', '', '086.146.027-82', '(22) 999463418', 'RUA MANOEL Duarte 29 Sítio  COCA COLA. ', '', '', '', '', '', '', '', '', 0),
(229, 'GILSON SOARES RANGEL', '', '929.693.807-49', '99925-6490', 'Rua manoel Duarte n°39', '', '', '', '', '', '', '', '', 0),
(230, 'REGINALDO AZEVEDO RIBEIRO', '', '022.351.147-17', '99991-8588', 'Rua Dom Manoel n213', '', '', '', '', '', '', '', '', 0),
(231, 'DIEGO FERNANDES BARRETO', '', '086.448.737-17', '99956-8603', 'Rua Aprigio Mantins n 48', '', '', '', '', '', '', '', '', 0),
(232, 'LEOPOLDINA CUNHA DA SILVA', '', '783.893.567-91', '99748-4948', 'PRACA DA BANDEIRA 24', '', '', '', '', '', '', '', '', 0),
(233, 'PAULO FERNANDO VIEIRA MENDONÇA', '', '006.527.487-32', '', 'Rua Duque de Caxias 42 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(234, 'CHRISTIAN SOUZA BATISTA', '', '134.009.257-40', '99736-1566', 'AV. Liberdade n20', '', '', '', '', '', '', '', '', 0),
(235, 'ANTONIO CARLOS PEREIRA DIAS', '', '514.696.007-06', '99770-6297', 'Rua Goncalves Dias 68 B', '', '', '', '', '', '', '', '', 0),
(236, 'DEVALDO DA SILVA DIAS', '', '616.873.087-72', '99884-4022', 'Alameda BOA VISTA n5 MORRO DA BOA VISTA', '', '', '', '', '', '', '', '', 0),
(237, 'GABRIEL ALEXANDRE V. CARPENTER', '', '129.438.747-28', '99788-6299', 'Rua Prudente de Morais n 09 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(238, 'MARIO VICTOR TORRES BRAGA JR', '', '072.899.917-02', '99991-5576', 'Rua Nilo Peçanha n° 28 Praia dos Anjos', '', '', '', '', '', '', '', '', 0),
(239, 'GENEILSON BENEVIDES FERREIRA', '', '950.970.747-34', '99905-9577', 'Rua Rebeche 300 casa 113  Praia Grande', '', '', '', '', '', '', '', '', 0),
(240, 'GELBER SERAFIM PROTHES', '', '104.167.357-46', '99735-8342', 'Rua Vera Cruz  Beco de Buzios 14 C', '', '', '', '', '', '', '', '', 0),
(241, 'MARCELO AMARAL DA SILVA', '', '098.553.207-60', '99975-9116', 'Rua Marechal Deodoro da Fonseca n 53', '', '', '', '', '', '', '', '', 0),
(242, 'MACIEL FELIX BARRETO', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(243, 'MARCIO FIGUEIREDO MOREIRA', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(244, 'PAULO FERNANDO DIAS GONÇALVES', '', '015.739.407-71', '99773-6243', 'ALMIRANTE TAMANDARE 23  MACEDONIA', '', '', '', '', '', '', '', '', 0),
(245, 'FRANCISCO CARLOS BARRETO FELIX', '', '', '101.380.627-14', 'Rua Nilo Peçanha 28', '', '', '', '', '', '', '', '', 0),
(246, 'Enildo Faria Benevides', '', '(22)996084804', '037.185.517-99', 'rua Arthur Bernardes 42  P. Grande', '', '', '', '', '', '', '', '', 0),
(247, 'Fernando augusto pessoa de mello', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(248, 'ALEXANDRE MELO DE ARAÚJO', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(249, 'Euniceia', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(250, 'george francisco', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(251, 'ALBERTO DA CONCEIÇÃO PINHEIRO NETO', '', '003.497.517-90', '99822-9389', 'Rua adeodato Macedo n 13  Praia Grande', '', '', '', '', '', '', '', '', 0),
(252, 'Cleusa remedio', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(253, 'Alex Macedo Mansur', '', '099726857-30', '999193574', 'Trav. José Praxedes n 15 Fundos', '', '', '', '', '', '', '', '', 0),
(254, 'Flavio da Costa Barreto', '', '090.003.247-26', '(22)999572309', 'Rua Nilo Peçanha n° 53 P. dos Anjos', '', '', '', '', '', '', '', '', 0),
(255, 'GEILSON SOARES RANGEL', '', '006.522.057-98', '998772720', 'Rua Manoel Duarte n43 Sitio', '', '', '', '', '', '', '', '', 0),
(256, 'Samuel Gonçalves Barbosa', '', '015.115.097-40', '998229077', 'Rua Vera Cruz, n°110', '', '', '', '', '', '', '', '', 0),
(257, 'Elizaguir Alves do Nascimento', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(258, 'Danielle Ferraiuoli Vieira Fernandes', '', '053.497.357-48', '99838-9593', 'Rua Pedro Alvares Praia Grande Cabral 10 casa 02', '', '', '', '', '', '', '', '', 0),
(259, 'ROBERTO FELIX BARRETO', '', '115.374.967-00', '99865-8611', 'Rua Vera Cruz  Beco de Buzios s/n', '', '', '', '', '', '', '', '', 0),
(260, 'ALEX MACEDO MUSAER', '', '099.726.857-30', '99919-3574', 'Travessa Jose Praxedes n15  Fundos', '', '', '', '', '', '', '', '', 0),
(261, 'REJAN MARTINS DE FREITAS', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(262, 'CLAUDIO FERREIRA DA SILVA/SAMUCA- Viviane esteve aqui mas o documento do barco não está no nome de S', '', '950.631.617-15', '99887-3279', 'Morra da Boa Vista 4', '', '', '', '', '', '', '', '', 0),
(263, 'DANIEL ALBERTO DA SILVA', '', '331.002.728-70', '99749-1882', 'Rua Antonio Teixeira de Souza n72  Praia Grande', '', '', '', '', '', '', '', '', 0),
(264, 'LEANDRO SILVA DOS SANTOS', '', '099.035.377-00', '2622-7891', 'Rua Tome de Souza n32', '', '', '', '', '', '', '', '', 0),
(265, 'Sergio Luiz Serafim Lopes', '', '814.531.407-00', '999212564/26226546', 'Rua Manoel Duarte 38 Sitio Arraial do Cabo', '', '', '', '', '', '', '', '', 0),
(266, 'Angela Regina Lima Lopes', '', '002.777.147-45', '(22)26226546/999212564', 'Rua Manoel Duarte 38 Sitio', '', '', '', '', '', '', '', '', 0),
(267, 'ANDRE LUIZ NUNES DE OLIVEIRA', '', '783.759.247-68', '99644-1011', 'Rua Getulio Vargas 103 casa 10', '', '', '', '', '', '', '', '', 0),
(268, 'Alberto Pinheiro', '', '', '999714262', '', '', '', '', '', '', '', '', '', 0),
(269, 'RUI MACEDO SOARES', '', '015.701.977-23', '999230086', 'Tv. Manoel Duarte 32 P. Anjos', '', '', '', '', '', '', '', '', 0),
(270, 'CARLOS EDUARDO ALIPIO GOMES', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(271, 'Leonardo goncalves prado', '', '158.823.287-56', '(22) 99876-1006', 'Trav. Arthur Bernardes n 124 Praia Grande', '', '', '', '', '', '', '', '', 0),
(272, 'Reginaldo Carolina Domingues Junior', '', '099.638.847-84', '999932230', 'Beco 06 Rua Ipanema 40 Sitio', '', '', '', '', '', '', '', '', 0),
(273, 'JOSÉ CARLOS ROZA TEIXEIRA', '', '', '(22) 2622-5361', 'RUA JOSÉ BONIFACIO N 15 CENTRO', '', '', '', '', '', '', '', '', 0),
(274, 'CARLOS ALEXANDRE FELIX NUNES', '', '', '', '', '', '', '', '', '', '', '', '', 0),
(275, 'Alexandre Gago de Carvalho', '', '110.778.687-82', '(22)997628293', 'Rua Manoel Duarte 131 Cs A Sitio', '', '', '', '', '', '', '', '', 0),
(276, 'LUIZ CARLOS FERNANDES SAMPAIO', '', '830.847.627-91', '(22) 2622-1773', 'RUA CAMPOS SALES 144 CENTRO ARRAIAL DO CABO', '', '', '', '', '', '', '', '', 0),
(277, 'Sandmar Nautica Atividades Subaqueticas LTDA ME', '', '00285.034/0001-70', '(22)26225703', ' Rua Epitácio 21 L02 ', '', '', '', 'sandmar@sandmar.com.br', '', '', '', '', 0),
(278, 'Sete Mares Comercio e Ativ. Syb. LTDA', '', '12.295.427/0001-43', '(22)26222565', '', '', '', '', 'atendimento@masterdive.com.br', '', '', '', '', 0),
(279, 'Queiroz Diver Atividade de Mergulho LTDA', '', '07.481.751/002-05', '(22) 26226423', 'Av. Gov. Leonel de Moura Brizola 74Lj 03 Centro ', '', '', '', ' marcelo@queirozdiver.com.br', '', '', '', '', 0),
(280, 'M.C.M Diver  Atv. Subaquaticas', '', '07.965.672/0001-80', '26224642/999085970', '', '', '', '', 'atendimento@oceansub.com.br', '', '', '', '', 0),
(281, 'Brazil Dive  Experience Em. Nauticos', '', '08537471/0001-45', '(21)991630799', 'Rua Julio de Macedo 28 B  Canaa', '', '', '', '', '', '', '', '', 0),
(282, 'Paulo Lopes de Oliveira ME', '', '04.075.395/0001-42', '(22) 26221033', 'Rua Rodrigues Alves n 08 Praia dos Anjos ', '', '', '', ' pldivers@pldivers.com.br', '', '', '', '', 0),
(283, 'Carvalho Fonseca S. N  LTDA', '', '09212410/0001-70', '(21)96429-0895', 'Rua Miguel Angelo 3 P. Grande  ', '', '', '', 'divepoint@divepoint.com.br ', '', '', '', '', 0),
(285, 'ARRAIAL SUB EMP. NAUTICOS LTDA ME', '', '01.329.941/0001-36', '(22) 26221945', 'Rua Antonio de Souza Teixeira n10', '', '', '', '', '', '', '', '', 0),
(286, 'Diverstec 2006 Serviços de Atv. Sub. ESP. LTDA ME', '', '07.929.109/0001-57', '2622-1045', 'Av. Nilo Peçanha 24 loja A  Praia dos Anjos  ', '', '', '', 'esportes@divers.com.br', '', '', '', '', 0),
(287, 'Deep Trio Empreendimentos Náuticos LTDA', '', '03.066.184/0001-80', '(21)999361290', 'Rua Venancio Melo  09  ', '', '', '', 'DEEPTRIP@.COM.BR', '', '', '', '', 0),
(288, 'Sea Quest SuB Operadora de Mergulho LTDA ME', '', '03.067.752/0001-68', '(22)26227300', 'Av. Gov. Leonel Moura Brizola 61 Centro  ', '', '', '', 'contato@seaquestsub.com.br ', '', '', '', '', 0),
(289, 'B E C Serviços subaquaticos LTDA ME', '', '14.692.118/0001-32', '(22)26221164', 'Av. Gov. Leonel Moura Brizola 46A. Centro/AC  ', '', '', '', 'MRDIVER@MRDIVER.COM.BR', '', '', '', '', 0),
(290, 'Sea Quest SuB Operadora de Mergulho LTDA ME', '', '03.067.752/0001-68', '(22)26220744', 'Av. Gov. Leonel Moura Brizola 61 Centro  ', '', '', '', 'contato@seaquestsub.com.br ', '', '', '', '', 0),
(291, 'M.C.M Diver  Atv. Subaquaticas', '', '07.965.672/0001-80', '26224642/999085970', '', '', '', '', 'atendimento@oceansub.com.br', '', '', '', '', 0),
(292, 'JORGE CRUZ ERNANDES FILHO', '', '010.145.727-89', ' (22) 99896-0080', 'RUA VENÂNCIO MELLO N 4 CASA B ', '', '', '', '', '', '', '', '', 0),
(293, 'CLEUSA DOS REMÉDIOS ROCHA', '', '018.939.087-55', '(22) 99932-6024', 'SUBIDA DA MARINA DO CABO MORRO DA CABOCLA N 09 PRAINHA  ', '', '', '', ' maganativa@hotmail.com', '', '', '', '', 0),
(294, 'Carlos Alberto Nogueira Vasconcelos', '', '172.378.907-00', '(22) 99918-6019', 'Rua Belgica n 111 Novo Arraial do Cabo/Figueira', '', '', '', '', '', '', '', '', 0),
(295, 'SEDECIAS VIANNA SIMAS', '', '771.076.917-91', '(22) 2622-2543(22) 999938588', 'Rua Epitácio Pessoa n 8 Praia Grande', '', '', '', '', '', '', '', '', 0),
(296, 'GETULIO PORTO', '', '306.436.437-53', '(22) 99996-8688', 'RUA PRUDENTE DE MORAES N 32 ', '', '', '', '', '', '', '', '', 0),
(297, 'ALMIR PEREIRA DA FONSECA', '', '906.256.097-00', '(22) 99839-1625', 'RUA VENANCIO MELO N 30', '', '', '', '', '', '', '', '', 0),
(298, 'RENAN BARCEL DE MELO 05917208760 (RBM MEGULHO)', '', 'CNPJ  18.915.218/0001-31 ', '(22) 98802-4498', 'TV. C 13 PRAINHA', '', '', '', '', '', '', '', '', 0),
(299, 'JORGE LUIZ MARTINS DE LIMA', '', '864.277.417-72', '(22) 99732-687326224851', 'Rua Damião Teixeira n 10 ', '', '', '', '', '', '', '', '', 0),
(300, 'PAULO SILAS BARROSO NEVES', '', '001.979.897-05', '(22) 999138140', 'RUA NILO PEÇANHA N 01', '', '', '', '', '', '', '', '', 0),
(301, 'GUSTAVO RAMOS ARÃO', '', '151.263.127-23', '(22) 99611-5272', 'Rua VERA CRUZ n 06 Praia dos Anjos ', '', '', '', '', '', '', '', '', 0),
(302, 'GUSTAVO FERNANDO CHIAPPOLINI', '', '008.437.499-38', '(22) 2622-1970', 'RUA VERA CRUZ 27 PRAIA DOS ANJOS ', '', '', '', 'guschiappo@hotmail.com', '', '', '', '', 0),
(303, 'MARCELO RAMOS DA SILVA', '', '028.175.497-75', '(22) 98817-3706', 'Rua Damião Teixeira 26B Praia dos Anjos ', '', '', '', '', '', '', '', '', 0),
(304, 'ANA BEATRIZ GOMES PEREIRA', '', '037.184.597-10', '(22) 99967-4620', 'ALAMEDA TOMÉ DE SOUZA CASA 06A N 40 MORRO DA COCA COLA ARRAIAL DO CABO ', '', '', '', 'rapmar33@yahoo.com.br', '', '', '', '', 0),
(305, 'ANGELO E RODRIGUES DIVERSÕES NÁUTICAS LTDA', '', '04.675.992/0001-08 (CPF 733.849.927-68)', '', 'RUA GONÇALVES DIAS 16 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(306, 'SEDECIAS VIANNA SIMAS', '', '771.076.917-91', '(22) 2622-2543 e cel (22) 999938588', 'Rua Epitácio Pessoa n 8 Praia Grande', '', '', '', '', '', '', '', '', 0),
(307, 'BANANA SKI ATIVIDADES NÁUTICAS LTDA', '', '39.848.338/0001-33', '(21) 7892-9178/ 99651-9296', 'AV. ALMIRANTE PAULO DE CASTRO 391 AP. 101  PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(308, 'BANANA SPLIT DIVERSÕES NÁUTICAS LTDA', '', '39.844.345/0001-67', '(21) 77009185', 'RUA MANOEL FELIX 120 PRAIA DOS ANJOS', '', '', '', '', '', '', '', '', 0),
(310, 'ggggg', '', '', '(  )         ', '', '', '', '     -   ', '', '', '', '', '', 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `codigo_usuario` int(11) NOT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codigo_usuario`, `login`, `senha`, `est`) VALUES
(3, 'admin', '123', 0),
(4, 'Teste', '123', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `embarcacao`
--
ALTER TABLE `embarcacao`
  ADD PRIMARY KEY (`codigo_embarcacao`),
  ADD KEY `codigo_modalidade_fk` (`codigo_modalidade`);

--
-- Indexes for table `modalidade`
--
ALTER TABLE `modalidade`
  ADD PRIMARY KEY (`codigo_modalidade`);

--
-- Indexes for table `saida`
--
ALTER TABLE `saida`
  ADD PRIMARY KEY (`codigo_saida`);

--
-- Indexes for table `solicitacao`
--
ALTER TABLE `solicitacao`
  ADD PRIMARY KEY (`codigo_solicitacao`),
  ADD KEY `codigo_solicitante_fk` (`codigo_solicitante`),
  ADD KEY `codigo_embarcacao_fk` (`codigo_embarcacao`);

--
-- Indexes for table `solicitante`
--
ALTER TABLE `solicitante`
  ADD PRIMARY KEY (`codigo_solicitante`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo_usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `embarcacao`
--
ALTER TABLE `embarcacao`
  MODIFY `codigo_embarcacao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=309;

--
-- AUTO_INCREMENT for table `modalidade`
--
ALTER TABLE `modalidade`
  MODIFY `codigo_modalidade` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `saida`
--
ALTER TABLE `saida`
  MODIFY `codigo_saida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `solicitacao`
--
ALTER TABLE `solicitacao`
  MODIFY `codigo_solicitacao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `solicitante`
--
ALTER TABLE `solicitante`
  MODIFY `codigo_solicitante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=311;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `embarcacao`
--
ALTER TABLE `embarcacao`
  ADD CONSTRAINT `embarcacao_ibfk_1` FOREIGN KEY (`codigo_modalidade`) REFERENCES `modalidade` (`codigo_modalidade`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `solicitacao`
--
ALTER TABLE `solicitacao`
  ADD CONSTRAINT `codigo_embarcacao_fk` FOREIGN KEY (`codigo_embarcacao`) REFERENCES `embarcacao` (`codigo_embarcacao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `codigo_solicitante_fk` FOREIGN KEY (`codigo_solicitante`) REFERENCES `solicitante` (`codigo_solicitante`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
