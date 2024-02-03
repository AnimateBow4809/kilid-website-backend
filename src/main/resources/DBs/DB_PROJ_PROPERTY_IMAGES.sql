create table PROPERTY_IMAGES
(
    PROPERTY_ID NUMBER              not null,
    PICTURE_ID  NUMBER              not null,
    IS_PRIMARY  NUMBER(1) default 0 not null,
    PHOTO       VARCHAR2(250)       not null,
    constraint PROPERTY_IMAGES_PK
        primary key (PROPERTY_ID, PICTURE_ID)
)
/

INSERT INTO DB_PROJ.PROPERTY_IMAGES (PROPERTY_ID, PICTURE_ID, IS_PRIMARY, PHOTO) VALUES (5, 5, 1, 'https://cdn.kilid.com/photos/small/listing_ae0c0414-fad4-482b-8764-ef20f6e40384_vrt.jpg');
