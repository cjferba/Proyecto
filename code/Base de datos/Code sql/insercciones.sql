INSERT INTO usuario (nombre, primerapellido, segundoapellido, dni, user, clave)
VALUES ("paco", "fernandez" , "fernandez2", "77777777q", "paco","clave");
INSERT INTO usuario (nombre, primerapellido, segundoapellido, dni, user, clave, entrenador)
VALUES ("reinaldo", "fernandez" , "fernandez2", "77777777q", "trainerman", "clave", true);
INSERT INTO usuario (nombre, primerapellido, segundoapellido, dni, user, clave, entrenador)
VALUES ("mourinho", "fernandez" , "fernandez2", "77777777q","mourino","clave", true);

INSERT INTO temporada ( curso, inicio, fin) values ('2012/2013', null, null);
INSERT INTO temporada ( curso, inicio, fin) values ('2013/2014', null, null);

INSERT INTO categoria (tipo,descripcion) VALUES ("alevin", "");
INSERT INTO categoria (tipo,descripcion) VALUES ("benjamin", "");
INSERT INTO categoria (tipo,descripcion) VALUES ("cadete", "");
INSERT INTO categoria (tipo,descripcion) VALUES ("infantil", "");
INSERT INTO categoria (tipo,descripcion) VALUES ("junior", "");


INSERT INTO `alumno` (`idAlumno`,`talla`,`nombre`,`primerApellido`,`segundoApellido`,`nombrePadre`,`nombreMadre`,`numeroCuenta`,
`telMovil`,`telFijo`,`observaciones`,`provincia`,`localidad`,`codigoPostal`,`colegio`,`domicilio`,`email`,`fechaNacimiento`,
`Alumnocol`) VALUES (1,'XL','Antonio','Ruiz','Carvajal','Juan','Juana',NULL,657847765,958154741,NULL,NULL,NULL,NULL,NULL,NULL,
'sucorreo','1990-12-07',NULL);
INSERT INTO `alumno` (`idAlumno`,`talla`,`nombre`,`primerApellido`,`segundoApellido`,`nombrePadre`,`nombreMadre`,`numeroCuenta`,
`telMovil`,`telFijo`,`observaciones`,`provincia`,`localidad`,`codigoPostal`,`colegio`,`domicilio`,`email`,`fechaNacimiento`,
`Alumnocol`) VALUES (2,'XL','Antonio','Ruiz','Carvajal','Juan','Juana',NULL,657847765,958154741,NULL,NULL,NULL,NULL,NULL,NULL,
'sucorreo','1990-12-07',NULL);
INSERT INTO `alumno` (`idAlumno`,`talla`,`nombre`,`primerApellido`,`segundoApellido`,`nombrePadre`,`nombreMadre`,`numeroCuenta`,
`telMovil`,`telFijo`,`observaciones`,`provincia`,`localidad`,`codigoPostal`,`colegio`,`domicilio`,`email`,`fechaNacimiento`,
`Alumnocol`) VALUES (3,'XL','Antonio','Ruiz','Carvajal','Juan','Juana',NULL,657847765,958154741,NULL,NULL,NULL,NULL,NULL,NULL,
'sucorreo','1990-12-07',NULL);
INSERT INTO `alumno` (`idAlumno`,`talla`,`nombre`,`primerApellido`,`segundoApellido`,`nombrePadre`,`nombreMadre`,`numeroCuenta`,
`telMovil`,`telFijo`,`observaciones`,`provincia`,`localidad`,`codigoPostal`,`colegio`,`domicilio`,`email`,`fechaNacimiento`,
`Alumnocol`) VALUES (4,'XL','Antonio','Ruiz','Carvajal','Juan','Juana',NULL,657847765,958154741,NULL,NULL,NULL,NULL,NULL,NULL,
'sucorreo','1990-12-07',NULL);
INSERT INTO `alumno` (`idAlumno`,`talla`,`nombre`,`primerApellido`,`segundoApellido`,`nombrePadre`,`nombreMadre`,`numeroCuenta`,
`telMovil`,`telFijo`,`observaciones`,`provincia`,`localidad`,`codigoPostal`,`colegio`,`domicilio`,`email`,`fechaNacimiento`,
`Alumnocol`) VALUES (5,'XL','Antonio','Ruiz','Carvajal','Juan','Juana',NULL,657847765,958154741,NULL,NULL,NULL,NULL,NULL,NULL,
'sucorreo','1990-12-07',NULL);
INSERT INTO `alumno` (`idAlumno`,`talla`,`nombre`,`primerApellido`,`segundoApellido`,`nombrePadre`,`nombreMadre`,`numeroCuenta`,
`telMovil`,`telFijo`,`observaciones`,`provincia`,`localidad`,`codigoPostal`,`colegio`,`domicilio`,`email`,`fechaNacimiento`,
`Alumnocol`) VALUES (6,'XL','Antonio','Ruiz','Carvajal','Juan','Juana',NULL,657847765,958154741,NULL,NULL,NULL,NULL,NULL,NULL,
'sucorreo','1990-12-07',NULL);

insert into liga values (1);

insert into fundacion (nombre,cp,ccc,email) values ('lafundacion' , 12, 'no se que es ccc pero hay lo llevas', 'correo@fundacion');

insert into equipo (Fundacion_idFundacion,Categoria_idCategoria, Temporada_idTemporada, nombre, fundacion, liga_idLiga) 
values (1, 1, 1, 'Granada A',true,1);
insert into equipo (Fundacion_idFundacion,Categoria_idCategoria, Temporada_idTemporada, nombre, fundacion, liga_idLiga) 
values (1, 1, 1, 'Alevines de alfacar',true,1);
insert into equipo (Fundacion_idFundacion,Categoria_idCategoria, Temporada_idTemporada, nombre, fundacion, liga_idLiga) 
values (1, 1, 1, 'Alevines de alfacar',false,1);

insert into instalacion (nombre,capacidadEquipos, localizacion) values ('la xana ', 2, 'retirao de grana');

insert into horario (Instalacion_idInstalacion,dia1,dia2,hora1,hora2) values (1, 'lunes', 'martes', 12.00, 13.00);

INSERT INTO grupo (n_alumnos,Categoria_idCategoria,Usuario_idUsuario, Temporada_idTemporada, Horario_idHorario,
Horario_Instalacion_idInstalacion) VALUES (20, 1,1, 1,1,1);
INSERT INTO grupo (n_alumnos,Categoria_idCategoria,Usuario_idUsuario, Temporada_idTemporada, Horario_idHorario,
Horario_Instalacion_idInstalacion) VALUES (20, 2,2, 1,1,1);
INSERT INTO grupo (n_alumnos,Categoria_idCategoria,Usuario_idUsuario, Temporada_idTemporada, Horario_idHorario,
Horario_Instalacion_idInstalacion) VALUES (20, 1,3, 1,1,1);

INSERT INTO alumnogrupo (Alumno_idAlumno, Grupo_idGrupo, Grupo_Categoria_idCategoria, 
Grupo_Usuario_idUsuario, Grupo_Temporada_idTemporada) VALUES (1, 1, 1, 2, 1);
INSERT INTO alumnogrupo (Alumno_idAlumno, Grupo_idGrupo, Grupo_Categoria_idCategoria, 
Grupo_Usuario_idUsuario, Grupo_Temporada_idTemporada) VALUES (2, 1, 1, 2, 1);
INSERT INTO alumnogrupo (Alumno_idAlumno, Grupo_idGrupo, Grupo_Categoria_idCategoria, 
Grupo_Usuario_idUsuario, Grupo_Temporada_idTemporada) VALUES (3, 2, 1, 2, 1);
INSERT INTO alumnogrupo (Alumno_idAlumno, Grupo_idGrupo, Grupo_Categoria_idCategoria, 
Grupo_Usuario_idUsuario, Grupo_Temporada_idTemporada) VALUES (4, 2, 1, 2, 1);
INSERT INTO alumnogrupo (Alumno_idAlumno, Grupo_idGrupo, Grupo_Categoria_idCategoria, 
Grupo_Usuario_idUsuario, Grupo_Temporada_idTemporada) VALUES (5, 2, 1, 2, 1);
INSERT INTO alumnogrupo (Alumno_idAlumno, Grupo_idGrupo, Grupo_Categoria_idCategoria, 
Grupo_Usuario_idUsuario, Grupo_Temporada_idTemporada) VALUES (6, 3, 1, 2, 1);

insert into alumnoequipo (Alumno_idAlumno, Equipo_idEquipo, Equipo_Fundacion_idFundacion, Equipo_Categoria_idCategoria) 
values (1, 1, 1, 1);
update alumno set 
fechaNacimiento='1990-07-12'
where alumno.idalumno<1000;
insert into rango (Usuario_idUsuario, Equipo_idEquipo, Equipo_Fundacion_idFundacion, Equipo_Categoria_idCategoria, 
					Equipo_Temporada_idTemporada, tipo)
values (2, 1, 1, 1, 1, 'primer entrenador');




/*
insert into alumnoequipo (Alumno_idAlumno, Equipo_idEquipo, Equipo_Fundacion_idFundacion, Equipo_Categoria_idCategoria) 
values (1, 1, 1, 1);
update alumno set 
fechaNacimiento='1990-07-12'
where alumno.idalumno<1000;
insert into rango (Usuario_idUsuario, Equipo_idEquipo, Equipo_Fundacion_idFundacion, Equipo_Categoria_idCategoria, 
					Equipo_Temporada_idTemporada, tipo)
values (2, 1, 1, 1, 1, 'primer entrenador');*/
