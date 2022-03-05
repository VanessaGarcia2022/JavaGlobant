# syntax=docker/dockerfile:1
# base image
FROM mysql:8.0
# es una mala practica pero necesito probar si asi funciona.
ENV MYSQL_ROOT_PASSWORD root
# Add all scripts
COPY ./image_db.sql /docker-entrypoint-initdb.d/