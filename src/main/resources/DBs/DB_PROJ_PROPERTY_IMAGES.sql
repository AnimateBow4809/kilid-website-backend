create table PROPERTY_IMAGES
(
    PROPERTY_ID NUMBER              not null,
    PHOTO       BLOB                not null,
    PICTURE_ID  NUMBER              not null,
    IS_PRIMARY  NUMBER(1) default 0 not null,
    constraint PROPERTY_IMAGES_PK
        primary key (PROPERTY_ID, PICTURE_ID)
)
/

