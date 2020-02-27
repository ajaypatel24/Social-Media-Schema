--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.19
-- Dumped by pg_dump version 12.0

-- Started on 2020-02-27 16:49:31

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
-- TOC entry 8533 (class 0 OID 1115334)
-- Dependencies: 1704
-- Data for Name: admin; Type: TABLE DATA; Schema: cs421g38; Owner: cs421g38
--

INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (1, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (2, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (3, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (4, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (5, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (6, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (7, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (8, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (9, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (10, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (11, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (12, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (13, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (14, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (15, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (16, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (17, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (18, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (19, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (20, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (21, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (22, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (23, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (24, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (25, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (26, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (27, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (28, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (29, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (30, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (31, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (32, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (33, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (34, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (35, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (36, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (37, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (38, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (39, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (40, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (41, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (42, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (43, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (44, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (45, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (46, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (47, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (48, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (49, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (50, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (51, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (52, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (53, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (54, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (55, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (56, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (57, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (58, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (59, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (60, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (61, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (62, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (63, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (64, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (65, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (66, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (67, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (68, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (69, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (70, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (71, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (72, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (73, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (74, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (75, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (76, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (77, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (78, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (79, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (80, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (81, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (82, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (83, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (84, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (85, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (86, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (87, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (88, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (89, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (90, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (91, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (92, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (93, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (94, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (95, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (96, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (97, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (98, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (99, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (100, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (101, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (102, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (103, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (104, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (105, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (106, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (107, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (108, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (109, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (110, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (111, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (112, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (113, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (114, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (115, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (116, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (117, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (118, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (119, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (120, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (121, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (122, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (123, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (124, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (125, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (126, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (127, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (128, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (129, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (130, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (131, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (132, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (133, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (134, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (135, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (136, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (137, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (138, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (139, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (140, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (141, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (142, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (143, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (144, 'private');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (145, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (146, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (147, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (148, 'all');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (149, 'public');
INSERT INTO cs421g38.admin (employee_id, access_rights) VALUES (150, 'public');


-- Completed on 2020-02-27 16:49:32

--
-- PostgreSQL database dump complete
--

