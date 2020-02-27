CREATE TABLE "like" (
	iid integer NOT NULL,
	PRIMARY KEY (iid)
);


CREATE TABLE admin (
	employee_id integer NOT NULL UNIQUE,
	access_rights varchar(15),
	PRIMARY KEY(employee_id)
);

CREATE TABLE comment (
	iid integer NOT NULL UNIQUE,
	text varchar(500),	
	PRIMARY KEY(iid)
);

CREATE TABLE accountuser (
	email varchar(320) NOT NULL UNIQUE,
	first_name varchar(20),
	last_name varchar(20),
	password varchar(320),
	PRIMARY KEY(email)
);


CREATE TABLE page (
	page_id integer,
	page_name varchar(30),
    PRIMARY KEY(page_id)
);

CREATE TABLE event (
	eid integer NOT NULL UNIQUE,
	date date NOT NULL,
	time TIMESTAMP WITHOUT TIME ZONE NOT NULL,
	location varchar(30),
	organizer varchar(320) ,
	page_id integer ,
	PRIMARY KEY(eid),
    FOREIGN KEY (page_id) REFERENCES page(page_id),
    FOREIGN KEY (organizer) REFERENCES accountuser(email)
);

CREATE TABLE interaction (
	iid integer NOT NULL UNIQUE, 
	PRIMARY KEY(iid)
);

CREATE TABLE post (
	pid integer NOT NULL,
	date date NOT NULL,
	time TIMESTAMP WITHOUT TIME ZONE NOT NULL,
	text varchar(200),
	image varchar(20),
	email varchar(320),
	page_id integer,
    PRIMARY KEY(pid),
    FOREIGN KEY (email) REFERENCES accountuser(email),
    FOREIGN KEY (page_id) REFERENCES page(page_id)
);


CREATE TABLE interacts ( --change this
	pid integer NOT NULL UNIQUE,
	email varchar(320) NOT NULL UNIQUE,
	PRIMARY KEY (pid,email),
    FOREIGN KEY (pid) REFERENCES post(pid),
    FOREIGN KEY (email) REFERENCES accountuser(email)
    
);


CREATE TABLE is_friend_with ( 
	email varchar(320) NOT NULL UNIQUE,
	friend_email varchar(320) NOT NULL,
	FOREIGN KEY (email) REFERENCES accountuser(email);
	FOREIGN KEY (friend_email) REFERENCES accountuser(email);
);

CREATE TABLE makes ( --change this
	
);

CREATE TABLE manages (
	page_id integer NOT NULL , 
	email varchar(320) NOT NULL ,
	PRIMARY KEY(page_id, email),
    FOREIGN KEY (page_id) REFERENCES Page(page_id),
    FOREIGN KEY (email) REFERENCES accountuser(email)
);

CREATE TABLE monitors (
	employee_id integer NOT NULL ,
	pid integer NOT NULL ,
	PRIMARY KEY(employee_id,pid),
    FOREIGN KEY (employee_id) REFERENCES admin(employee_id),
    FOREIGN KEY (pid) REFERENCES post(pid)
);

CREATE TABLE notification (
	date date NOT NULL,
	time TIMESTAMP WITHOUT TIME ZONE NOT NULL,
	type varchar(20),
	iid integer,
	PRIMARY KEY (date,time)
);


CREATE TABLE partakes (
	page_id integer NOT NULL ,
	email varchar(320) NOT NULL ,
	PRIMARY KEY (page_id, email),
    FOREIGN KEY (page_id) REFERENCES Page(page_id),
    FOREIGN KEY (email) REFERENCES accountuser(email)
);


CREATE TABLE participates (
	eid integer NOT NULL ,
	email varchar(320) NOT NULL ,
	PRIMARY KEY (eid,email),
    FOREIGN KEY (eid) REFERENCES event(eid),
    FOREIGN KEY (email) REFERENCES accountuser(email)
);


CREATE TABLE share (
	iid integer NOT NULL UNIQUE,
    PRIMARY KEY (iid)
);
