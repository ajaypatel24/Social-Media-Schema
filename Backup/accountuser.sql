--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.19
-- Dumped by pg_dump version 12.0

-- Started on 2020-02-27 16:48:37

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 8533 (class 0 OID 1115167)
-- Dependencies: 1693
-- Data for Name: accountuser; Type: TABLE DATA; Schema: cs421g38; Owner: cs421g38
--

INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('a@a.com', 'Bob', 'Johnson', 'bob123');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('ab@sympatico.ca', 'Tex', 'Johnson', '5f4dcc3b5aa765d61d8327deb882cf99');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('thekid@hotmail.com', 'Joseph', 'Marquez', '2b95d1f09b8b66c5c43622a4d9ec9a04');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('myfirstemail@hotmail.com', 'Timmy', 'Johnson', '6f387ed7a2b22627363214b149f0220f');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Steffa@yahoo.com', 'Stefania', 'Maccaffrey', 'fb8ac6726f97c6c5e47eb8ab6088c90b');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('NetsFan21@yahoo.com', 'Carley', 'Mata', '9a56583230549e5235307810b1b642eb');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('RaheelG55@live.com', 'Raheel', 'Greig', '81d9aeb3bdeca8511e4665a6ccab0c0d');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Marleeelove@live.com', 'Marlie', 'Parkes', '08a70d30070bf624dacbd4f94ab11490');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Storey5@gmail.com', 'Milli', 'Storey', '4d929de130b59358dd27cea01a3cff10');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('BigA@gmail.com', 'Azaan', 'Reyes', '1a388cd5d832becba66e20509a776d48');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('RFox@live.com', 'Rory', 'Fox', '08a70d30070bf624dacbd4f94ab11490');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Anish1994@gmail.com', 'Anisha', 'Albert', '88c3032ad4facb36f01072478cbdd582');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('CNieves@gmail.com', 'Carolina', 'Nieves', 'ac7a86d11547a14a2785d23c458c2568');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Chickensalad@gmail.com', 'Lily-Mae', 'Morris', 'de41afcd513ea0ddef239c8a3c00ec4b');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Shellder@sympatico.ca', 'Shelley', 'Rodrigues', '0399a6e9342f29d94553fd313e7ad117');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Stanson90@sympatico.ca', 'Asa', 'Stanson', '333da2b27339523834d99ba48df26271');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('AyushEvans01@sympatico.ca', 'Ayush', 'Evans', '51aa369716fa9496c042a666ac4ece51');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('GordonHaywardBrother@gmail.com', 'Clarence', 'Hayward', '13b3a1c6f0ffc99d6339dbbd63ac37cc');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Ray23@gmail.com', 'Rayyan', 'Alcock', '1e0f21874b9c49fa3d2bc808573ff7ad');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('KRiggs24@live.com', 'Kyle', 'Riggs', '1e0f21874b9c49fa3d2bc808573ff7ad');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('JLG@live.com', 'Jamie-Lee', 'Gallegos', '64705341e2b19bf96dcd1725c3d11298');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('GabrielLovell@gmail.com', 'Gabriel', 'Lovell', '7d3e83fbbec5a8962b43e170be26bd63');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('FirstAidKid@zoho.com', 'Kit', 'Beech', '7d3e83fbbec5a8962b43e170be26bd63');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('AnthonyH@zoho.com', 'Huzaifa', 'Anthony', '7469e007d7bc6e97777d205815101632');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Sherry33@zoho.com', 'Sheridan', 'Mueller', '3002259795305c114702df66f2fc7d77');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('TheCoby@zoho.com', 'Coby', 'Watt', 'd3dfbdd619769130480303f4adb412d4');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('tman@zoho.com', 'Troy', 'Harding', '3bf10c7ef7d7d2f884dbdbb5f9eb49d6');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('JeanMcphee@zoho.com', 'Jean', 'Mcphee', 'b0c27cd28021ebd467639e9f14ffb011');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('devon@zoho.com', 'Devon', 'Hays', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('CleoM45@aol.com', 'Cleo', 'Mclaughlin', '97f244866495b07abd498a50c9088bda');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Harp@zoho.com', 'Harpreet', 'Cottrell', 'b4bd58512e136704620baa2ccfde8081');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('BigHoff@gmx.com', 'Kaiden', 'Hoffman', 'e2d2bf7498db16ec73fc234cac126abf');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('TrevySpa@gmx.com', 'Kaia', 'Trevino', '694b32a9a2f5189c490b80c0337bb246');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('KirbyPuff@aol.com', 'Kirby', 'Mercado', 'abb3e60f89842cb1cc7b0dabe4125351');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('KingMaddox@aol.com', 'Kinga', 'Maddox', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Mamba24@zoho.com', 'Kobie', 'Calderon', '8f66d42c90b40543b40c9f7c760b9169');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('MarthMainZane@gmx.com', 'Zane', 'Humphries', '9442b44e03891fecd4e249b9fb2be7eb');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('LorenaSheridan11@gmx.com', 'Lorena', 'Sheridan', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('KiyaK@live.com', 'Kiya', 'Grimes', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('LemarreCarroll@hotmail.com', 'Lemar', 'Brennan', 'eb65c914f6c982d9c2332b0f25841e5d');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Ashauber90@gmail.com', 'Asha', 'Huber', 'f3315dc3c64843a8e84de298f8ab87d2');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('CobyBax8@gmail.com', 'Coby', 'Baxter', '7c232372f33852365fd3dbd8cee99314');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('GovChristie@gmail.com', 'Christie', 'Hodson', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Tobee@gmail.com', 'Toby', 'Rooney', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('MarshallShannon@gmail.com', 'Shannon', 'Marshall', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Sultan.Dotson@mail.mcgill.ca', 'Sultan', 'Dotson', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Harpreet.Harvey@mail.mcgill.ca', 'Harpreet', 'Harvey', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Che.Blankenship@mail.mcgill.ca', 'Che', 'Blankenship', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Levi.Oconnell@mail.mcgill.ca', 'Levi', 'Oconnell', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Cobie.Yu@mail.mcgill.ca', 'Cobie', 'Yu', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Sheridan.Montgomery@mail.mcgill.ca', 'Sheridan', 'Montgomery', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Kristi.Kelly@mail.mcgill.ca', 'Kristi', 'Kelly', '12dba2a38aa70e3b9c843309b3ff1fea');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Clay.Gross@mail.mcgill.ca', 'Clay', 'Gross', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Mylee.Malone@mail.mcgill.ca', 'Mylee', 'Malone', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Parker.Hagan@mail.mcgill.ca', 'Parker', 'Hagan', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Celyn.Green@mail.mcgill.ca', 'Celyn', 'Green', '7170c7fd1e6c8430ebd94ac5767b0aa3');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Libby.Rowland@mail.mcgill.ca', 'Libby', 'Rowland', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Corey.Huff@mail.mcgill.ca', 'Corey', 'Huff', '83b53a15912fff073c11c79ee0d4c696');
INSERT INTO cs421g38.accountuser (email, first_name, last_name, password) VALUES ('Kiara.Ramsey@mail.mcgill.ca', 'Kiara', 'Ramsey', '83b53a15912fff073c11c79ee0d4c696');


-- Completed on 2020-02-27 16:48:39

--
-- PostgreSQL database dump complete
--

