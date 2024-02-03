create table MY_USERS
(
    ID           NUMBER not null
        primary key,
    NAME         VARCHAR2(45) default 'karbar eziz',
    FNAME        VARCHAR2(45),
    EMAIL        VARCHAR2(45)
        unique,
    PHONE_NUMBER VARCHAR2(45)
        unique
)
/

INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (3052, null, null, 'ali@gamil.com', null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (3053, null, null, 'al2i@gamil.com', null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (3102, null, null, 'mamadi@gamil.com', null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (3152, null, null, 'vvv@gamil.com', null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (4052, 'cc', 'ss', 'alidashtb2ozorg@gmail.com', null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (3252, 'happy user', null, '"danial@gamil.com"', null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (4002, 'hii', 'no', 'alidashtbozorg@gmail.com', null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (2002, null, null, null, null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (3952, 'happy user', null, 'alidahtbozorg@gmail.com', null);
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (1, 'test', 'at', 'test', '134');
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (12, 'mad', 'ast', 'made', 'kr');
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (2952, 'make', 'ast', 'ff1', 'kr2');
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (3002, 'vv', 'ast', 'ff2', 'kr3');
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (5003, 'happy user', null, null, '9109030222');
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (4952, 'happy user', null, null, '{contact}');
INSERT INTO DB_PROJ.MY_USERS (ID, NAME, FNAME, EMAIL, PHONE_NUMBER) VALUES (5002, 'happy user', null, null, '9109030443');
