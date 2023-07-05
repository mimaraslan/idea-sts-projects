CREATE TABLE public.musteriler
(
    id serial NOT NULL,
    adi character varying(50) NOT NULL,
    soyadi character varying(60) NOT NULL,
    telefon character varying(40) DEFAULT 0,
    adres character varying(125),
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.musteriler
    OWNER to postgres;