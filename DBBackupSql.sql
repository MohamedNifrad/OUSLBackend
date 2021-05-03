PGDMP                         y            LibraryManagementSystem    10.13    10.13 -                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            !           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            "           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            #           1262    52550    LibraryManagementSystem    DATABASE     �   CREATE DATABASE "LibraryManagementSystem" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_United States.1252' LC_CTYPE = 'English_United States.1252';
 )   DROP DATABASE "LibraryManagementSystem";
             dc123    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            $           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false            %           0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            �            1259    52553 	   materials    TABLE     �   CREATE TABLE public.materials (
    id bigint NOT NULL,
    author character varying(255),
    category character varying(255),
    name character varying(255),
    qty integer NOT NULL
);
    DROP TABLE public.materials;
       public         postgres    false    3            �            1259    52551    materials_id_seq    SEQUENCE     y   CREATE SEQUENCE public.materials_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.materials_id_seq;
       public       postgres    false    197    3            &           0    0    materials_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.materials_id_seq OWNED BY public.materials.id;
            public       postgres    false    196            �            1259    52564    roles    TABLE     W   CREATE TABLE public.roles (
    id integer NOT NULL,
    name character varying(20)
);
    DROP TABLE public.roles;
       public         postgres    false    3            �            1259    52562    roles_id_seq    SEQUENCE     �   CREATE SEQUENCE public.roles_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.roles_id_seq;
       public       postgres    false    3    199            '           0    0    roles_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.roles_id_seq OWNED BY public.roles.id;
            public       postgres    false    198            �            1259    52577    user_materials    TABLE     k   CREATE TABLE public.user_materials (
    id bigint NOT NULL,
    material_id bigint,
    user_id bigint
);
 "   DROP TABLE public.user_materials;
       public         postgres    false    3            �            1259    52575    user_materials_id_seq    SEQUENCE     ~   CREATE SEQUENCE public.user_materials_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.user_materials_id_seq;
       public       postgres    false    202    3            (           0    0    user_materials_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.user_materials_id_seq OWNED BY public.user_materials.id;
            public       postgres    false    201            �            1259    52570 
   user_roles    TABLE     ^   CREATE TABLE public.user_roles (
    user_id bigint NOT NULL,
    role_id integer NOT NULL
);
    DROP TABLE public.user_roles;
       public         postgres    false    3            �            1259    52585    users    TABLE     �   CREATE TABLE public.users (
    id bigint NOT NULL,
    email character varying(255),
    mobile character varying(255),
    password character varying(255),
    username character varying(255)
);
    DROP TABLE public.users;
       public         postgres    false    3            �            1259    52583    users_id_seq    SEQUENCE     u   CREATE SEQUENCE public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.users_id_seq;
       public       postgres    false    204    3            )           0    0    users_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.users_id_seq OWNED BY public.users.id;
            public       postgres    false    203            �
           2604    52556    materials id    DEFAULT     l   ALTER TABLE ONLY public.materials ALTER COLUMN id SET DEFAULT nextval('public.materials_id_seq'::regclass);
 ;   ALTER TABLE public.materials ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    196    197    197            �
           2604    52567    roles id    DEFAULT     d   ALTER TABLE ONLY public.roles ALTER COLUMN id SET DEFAULT nextval('public.roles_id_seq'::regclass);
 7   ALTER TABLE public.roles ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    199    198    199            �
           2604    52580    user_materials id    DEFAULT     v   ALTER TABLE ONLY public.user_materials ALTER COLUMN id SET DEFAULT nextval('public.user_materials_id_seq'::regclass);
 @   ALTER TABLE public.user_materials ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    201    202    202            �
           2604    52588    users id    DEFAULT     d   ALTER TABLE ONLY public.users ALTER COLUMN id SET DEFAULT nextval('public.users_id_seq'::regclass);
 7   ALTER TABLE public.users ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    203    204    204                      0    52553 	   materials 
   TABLE DATA               D   COPY public.materials (id, author, category, name, qty) FROM stdin;
    public       postgres    false    197   E/                 0    52564    roles 
   TABLE DATA               )   COPY public.roles (id, name) FROM stdin;
    public       postgres    false    199   y/                 0    52577    user_materials 
   TABLE DATA               B   COPY public.user_materials (id, material_id, user_id) FROM stdin;
    public       postgres    false    202   �/                 0    52570 
   user_roles 
   TABLE DATA               6   COPY public.user_roles (user_id, role_id) FROM stdin;
    public       postgres    false    200   �/                 0    52585    users 
   TABLE DATA               F   COPY public.users (id, email, mobile, password, username) FROM stdin;
    public       postgres    false    204   �/       *           0    0    materials_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.materials_id_seq', 1, true);
            public       postgres    false    196            +           0    0    roles_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.roles_id_seq', 1, false);
            public       postgres    false    198            ,           0    0    user_materials_id_seq    SEQUENCE SET     D   SELECT pg_catalog.setval('public.user_materials_id_seq', 1, false);
            public       postgres    false    201            -           0    0    users_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.users_id_seq', 3, true);
            public       postgres    false    203            �
           2606    52561    materials materials_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.materials
    ADD CONSTRAINT materials_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.materials DROP CONSTRAINT materials_pkey;
       public         postgres    false    197            �
           2606    52569    roles roles_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.roles DROP CONSTRAINT roles_pkey;
       public         postgres    false    199            �
           2606    52597 !   users uk6dotkott2kjsp8vw4d0m25fb7 
   CONSTRAINT     ]   ALTER TABLE ONLY public.users
    ADD CONSTRAINT uk6dotkott2kjsp8vw4d0m25fb7 UNIQUE (email);
 K   ALTER TABLE ONLY public.users DROP CONSTRAINT uk6dotkott2kjsp8vw4d0m25fb7;
       public         postgres    false    204            �
           2606    52595 !   users ukr43af9ap4edm43mmtq01oddj6 
   CONSTRAINT     `   ALTER TABLE ONLY public.users
    ADD CONSTRAINT ukr43af9ap4edm43mmtq01oddj6 UNIQUE (username);
 K   ALTER TABLE ONLY public.users DROP CONSTRAINT ukr43af9ap4edm43mmtq01oddj6;
       public         postgres    false    204            �
           2606    52582 "   user_materials user_materials_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.user_materials
    ADD CONSTRAINT user_materials_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.user_materials DROP CONSTRAINT user_materials_pkey;
       public         postgres    false    202            �
           2606    52574    user_roles user_roles_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.user_roles
    ADD CONSTRAINT user_roles_pkey PRIMARY KEY (user_id, role_id);
 D   ALTER TABLE ONLY public.user_roles DROP CONSTRAINT user_roles_pkey;
       public         postgres    false    200    200            �
           2606    52593    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public         postgres    false    204            �
           2606    52608 *   user_materials fk1vfrdjgg269muj93u54js4npf    FK CONSTRAINT     �   ALTER TABLE ONLY public.user_materials
    ADD CONSTRAINT fk1vfrdjgg269muj93u54js4npf FOREIGN KEY (material_id) REFERENCES public.materials(id);
 T   ALTER TABLE ONLY public.user_materials DROP CONSTRAINT fk1vfrdjgg269muj93u54js4npf;
       public       postgres    false    2699    197    202            �
           2606    52598 &   user_roles fkh8ciramu9cc9q3qcqiv4ue8a6    FK CONSTRAINT     �   ALTER TABLE ONLY public.user_roles
    ADD CONSTRAINT fkh8ciramu9cc9q3qcqiv4ue8a6 FOREIGN KEY (role_id) REFERENCES public.roles(id);
 P   ALTER TABLE ONLY public.user_roles DROP CONSTRAINT fkh8ciramu9cc9q3qcqiv4ue8a6;
       public       postgres    false    2701    200    199            �
           2606    52603 &   user_roles fkhfh9dx7w3ubf1co1vdev94g3f    FK CONSTRAINT     �   ALTER TABLE ONLY public.user_roles
    ADD CONSTRAINT fkhfh9dx7w3ubf1co1vdev94g3f FOREIGN KEY (user_id) REFERENCES public.users(id);
 P   ALTER TABLE ONLY public.user_roles DROP CONSTRAINT fkhfh9dx7w3ubf1co1vdev94g3f;
       public       postgres    false    2711    204    200            �
           2606    52613 *   user_materials fkn8ehjhcrm245goy46o40jcfhs    FK CONSTRAINT     �   ALTER TABLE ONLY public.user_materials
    ADD CONSTRAINT fkn8ehjhcrm245goy46o40jcfhs FOREIGN KEY (user_id) REFERENCES public.users(id);
 T   ALTER TABLE ONLY public.user_materials DROP CONSTRAINT fkn8ehjhcrm245goy46o40jcfhs;
       public       postgres    false    202    204    2711               $   x�3���L+JL�L�����M,�(�44������ }��         !   x�3���q�v�2��]|=��b���� t��            x������ � �            x�3�4�2�4�2�=... 7         �   x�M���   г|�gCjiG%˕�lպ�$e�h�_ߡպ�ӳ�4�sa\���Rӆ&w���K��v?���ס""��8�^����8;ܲ��S�X�����>g����Q&���yl�@%�8/�df����R�U/t�j�A�|J����Be���E�ץ%>�xP15c�Lĩ�7��]�k���*�=�_. �}�O     