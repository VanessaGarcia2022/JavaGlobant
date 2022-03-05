CREATE DATABASE docker_challenge;
USE docker_challenge;

CREATE TABLE USER(
    username varchar(255) NOT NULL,
    name varchar(255),
    last_name varchar(255),
    identification_number int NOT NULL PRIMARY KEY,
    address varchar(255),
    zip_code_city int,
    state varchar(255),
    country varchar(255)
);


INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("VAGAVA","Vanessa", "Garcia", 123456, "calle 14 - Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("ANFORI","Angelica", "Fornaris", 234567, "carrera 12 - Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("LALOMO","Laura", "Lopez", 345678, "calle 72 - Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("ANMOMO","Ana", "Mora", 678912, "Transversal 32 - Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("JUJOGA","Juan", "Garcia", 789123, "Carrera 2- Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("CAVAQU","Carolina", "Vargas", 891234, "calle 63 - Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("NAMOMO","Natalia", "Montoya", 912345, "Carrera 25 - Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("MIAGSE","Mishy", "Agata", 098745, "calle 8 - Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("TRANQU","Tranqui", "lino", 025874, "calle 8 - Medellin", 050001, "Antioquia", "Colombia" );

INSERT INTO USER (username , name, last_name, identification_number, address, zip_code_city, state, country)
VALUES ("BESESE","Beni", "Senor", 854210, "Carrera 106 - Medellin", 050001, "Antioquia", "Colombia" );


