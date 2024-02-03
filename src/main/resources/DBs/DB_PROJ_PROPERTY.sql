create table PROPERTY
(
    PROPERTY_ID    NUMBER        not null
        constraint PROPERTY_PK
            primary key,
    TITLE          VARCHAR2(250) not null,
    CITY           VARCHAR2(250) not null,
    ZONE           VARCHAR2(250) not null,
    AREA           NUMBER        not null,
    USAGE          VARCHAR2(250) not null,
    NUMBER_OF_ROOM NUMBER        not null,
    AGE            NUMBER,
    REAL_ESTATE_ID NUMBER        not null
        constraint PROPERTY_REAL_ESTATE_AGENCY_AGENCY_ID_FK
            references REAL_ESTATE_AGENCY,
    DESCRIPTION    VARCHAR2(300),
    PROPERTY_TYPE  NUMBER,
    MORTGAGE_COST  NUMBER,
    SELL_COST      NUMBER,
    PRE_COST       NUMBER,
    MONTHLY_RENT   NUMBER
)
/

INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (952, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', 1, null, 1000, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (955, 'یوسف آباد 200 متر پبش فروش', 'تهران', 'یوسف آباد', 200, 'اداری', 4, 0, 508, 'فروش یوسف آباد', 1, null, 2000000000, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (203, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', -928497163, null, null, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (252, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', -928497163, null, null, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (202, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', -928497163, null, null, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (302, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', -928497163, null, null, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (303, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', -928497163, null, null, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (304, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', -928497163, null, null, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (352, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', -928497163, null, null, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (402, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', 1, null, 1000, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (403, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', 2, 40000, null, null, null);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (404, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', 3, null, null, 40000, 1999);
INSERT INTO DB_PROJ.PROPERTY (PROPERTY_ID, TITLE, CITY, ZONE, AREA, USAGE, NUMBER_OF_ROOM, AGE, REAL_ESTATE_ID, DESCRIPTION, PROPERTY_TYPE, MORTGAGE_COST, SELL_COST, PRE_COST, MONTHLY_RENT) VALUES (452, 'Property Title 1', 'City 1', 'Zone 1', 138, 'industrial', 0, 2, 302, 'Description for Property 1. Lorem ipsum dolor sit amet, consectetur adipiscing elit.', 1, null, 1000, null, null);
