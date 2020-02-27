--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.19
-- Dumped by pg_dump version 12.0

-- Started on 2020-02-27 16:53:31

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
-- TOC entry 8476 (class 0 OID 1158228)
-- Dependencies: 2328
-- Data for Name: is_friend_with; Type: TABLE DATA; Schema: cs421g38; Owner: cs421g38
--

INSERT INTO cs421g38.is_friend_with (email, friend_email) VALUES ('Storey5@gmail.com', 'Anish1994@gmail.com');
INSERT INTO cs421g38.is_friend_with (email, friend_email) VALUES ('Storey5@gmail.com', 'myfirstemail@hotmail.com');
INSERT INTO cs421g38.is_friend_with (email, friend_email) VALUES ('Storey5@gmail.com', 'RFox@live.com');
INSERT INTO cs421g38.is_friend_with (email, friend_email) VALUES ('Storey5@gmail.com', 'Storey5@gmail.com');
INSERT INTO cs421g38.is_friend_with (email, friend_email) VALUES ('RFox@live.com', 'Storey5@gmail.com');
INSERT INTO cs421g38.is_friend_with (email, friend_email) VALUES ('RFox@live.com', 'JLG@live.com');
INSERT INTO cs421g38.is_friend_with (email, friend_email) VALUES ('RFox@live.com', 'GordonHaywardBrother@gmail.com');


-- Completed on 2020-02-27 16:53:32

--
-- PostgreSQL database dump complete
--

