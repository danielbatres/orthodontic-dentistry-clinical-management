CREATE DATABASE BDOrthodonticDentistry;

USE BDOrthodonticDentistry;

CREATE TABLE FechaHoraCreacion (
	idFechaHoraCreacion INT PRIMARY KEY IDENTITY(1, 1),
	dia INT,
	mes INT,
	annio INT,
	hora VARCHAR(25)
);

CREATE TABLE FechaHoraActualizacion (
	idFechaHoraActualizacion INT PRIMARY KEY IDENTITY(1, 1),
	dia INT,
	mes INT,
	annio INT,
	hora VARCHAR(25)
);

CREATE TABLE Telefonos (
	idTelefono INT PRIMARY KEY IDENTITY(1, 1),
	casa VARCHAR(15),
	celular VARCHAR(15)
);

CREATE TABLE FechasNacimientos (
	idFechaNacimiento INT PRIMARY KEY IDENTITY(1, 1),
	dia INT,
	mes INT,
	annio INT
);

CREATE TABLE Pacientes (
	idPaciente INT PRIMARY KEY IDENTITY(1, 1),
	nombres VARCHAR(50),
	apellidos VARCHAR(50)
);

CREATE TABLE Doctores (
	idDoctor INT PRIMARY KEY IDENTITY(1, 1),
	nombres VARCHAR(50),
	apellidos VARCHAR(50)
);

CREATE TABLE Asistentes (
	idAsistente INT PRIMARY KEY IDENTITY(1, 1),
	nombres VARCHAR(50),
	apellidos VARCHAR(50)
);

CREATE TABLE DatosDireccion (
	idDatosDireccion INT PRIMARY KEY IDENTITY(1, 1),
	departamento VARCHAR(50),
	municipio VARCHAR(50),
	direccion VARCHAR(200)
);

CREATE TABLE Preferencias (
	idPreferencia INT PRIMARY KEY IDENTITY(1, 1),
	paletaPreferencia VARCHAR(30)
);

CREATE TABLE AgendaPaciente (
	idAgendaPaciente INT PRIMARY KEY IDENTITY(1, 1),
	idPaciente INT FOREIGN KEY (IdPaciente) 
	REFERENCES Pacientes(IdPaciente) ON UPDATE CASCADE ON DELETE CASCADE,
);

CREATE TABLE Consultas (
	idConsulta INT PRIMARY KEY IDENTITY(1, 1),
	dia INT,
	mes INT, 
	annio INT,
	hora VARCHAR(25),
	realizado VARCHAR(10),
	idAgendaPaciente INT FOREIGN KEY (idAgendaPaciente)
	REFERENCES AgendaPaciente(idAgendaPaciente) ON UPDATE CASCADE ON DELETE CASCADE,
	tratamiento VARCHAR(25),
	idFechaHoraCreacion INT FOREIGN KEY (idFechaHoraCreacion)
	REFERENCES FechaHoraCreacion(idFechaHoraCreacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idFechaHoraActualizacion INT FOREIGN KEY (idFechaHoraActualizacion)
	REFERENCES FechaHoraActualizacion(idFechaHoraActualizacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
);

CREATE TABLE Facturas (
	idFactura INT PRIMARY KEY IDENTITY(1, 1),
	idConsulta INT FOREIGN KEY (idConsulta)
	REFERENCES Consultas(idConsulta) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	saldo FLOAT,
	totales FLOAT
);

CREATE TABLE MontosFacturas (
	idMontosFacturas INT PRIMARY KEY IDENTITY(1, 1),
	idFactura INT FOREIGN KEY (idFactura)
	REFERENCES Facturas(idFactura) ON UPDATE CASCADE ON DELETE CASCADE,
	monto FLOAT,
	anotaciones VARCHAR(1000)
);

CREATE TABLE ControlMensual (
	idControlMensual INT PRIMARY KEY IDENTITY(1, 1),
	idPaciente INT FOREIGN KEY (idPaciente)
	REFERENCES Pacientes(idPaciente) ON UPDATE CASCADE ON DELETE CASCADE,
	MX VARCHAR(50),
	cadenas VARCHAR(55),
	MD VARCHAR(55),
	Observaciones VARCHAR(250),
	hules VARCHAR(50),
	idFechaHoraCreacion INT FOREIGN KEY (idFechaHoraCreacion)
	REFERENCES FechaHoraCreacion(idFechaHoraCreacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idFechaHoraActualizacion INT FOREIGN KEY (idFechaHoraActualizacion)
	REFERENCES FechaHoraActualizacion(idFechaHoraActualizacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
);

CREATE TABLE TratamientoPacientes (
	idTratamientoPaciente INT PRIMARY KEY IDENTITY(1, 1),
	idPaciente INT FOREIGN KEY (idPaciente) 
	REFERENCES Pacientes(idPaciente) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	Ortodoncia VARCHAR(10),
	Odontologia VARCHAR(10)
);

CREATE TABLE Registros (
	idRegistro INT PRIMARY KEY IDENTITY(1, 1),
	correoElectronico VARCHAR(75),
	contrasena VARCHAR(50),
	idFechaHoraCreacion INT FOREIGN KEY (idFechaHoraCreacion)
	REFERENCES FechaHoraCreacion(idFechaHoraCreacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idFechaHoraActualizacion INT FOREIGN KEY (idFechaHoraActualizacion)
	REFERENCES FechaHoraActualizacion(idFechaHoraActualizacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
);

CREATE TABLE RegistroDoctor (
	idRegistroDoctor INT PRIMARY KEY IDENTITY(1, 1),
	idDoctor INT FOREIGN KEY (idDoctor)
	REFERENCES Doctores(idDoctor) ON UPDATE CASCADE ON DELETE CASCADE,
	idRegistro INT FOREIGN KEY (idRegistro) 
	REFERENCES Registros(idRegistro) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE RegistroAsistentes (
	idRegistroAsistente INT PRIMARY KEY IDENTITY(1, 1),
	idAsistente INT FOREIGN KEY (idAsistente)
	REFERENCES Asistentes(idAsistente) ON UPDATE CASCADE ON DELETE CASCADE,
	idRegistro INT FOREIGN KEY (idRegistro)
	REFERENCES Registros(idRegistro) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE DatosGenerales (
	idDatosGenerales INT PRIMARY KEY IDENTITY(1, 1),
	edad INT, 
	idTelefono INT NOT NULL,
	genero VARCHAR(25),
	idDatosDireccion INT FOREIGN KEY (idDatosDireccion) 
	REFERENCES DatosDireccion(idDatosDireccion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idFechaNacimiento INT FOREIGN KEY (idFechaNacimiento)
	REFERENCES FechasNacimientos(idFechaNacimiento) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idFechaHoraCreacion INT FOREIGN KEY (idFechaHoraCreacion)
	REFERENCES FechaHoraCreacion(idFechaHoraCreacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idFechaHoraActualizacion INT FOREIGN KEY (idFechaHoraActualizacion)
	REFERENCES FechaHoraActualizacion(idFechaHoraActualizacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
);

ALTER TABLE DatosGenerales ADD CONSTRAINT FK_Telefonos_DatosGenerales FOREIGN KEY (idTelefono)
REFERENCES Telefonos(idTelefono) ON UPDATE CASCADE ON DELETE CASCADE;

CREATE TABLE DetallesPacientes (
	idDetallesPaciente INT PRIMARY KEY IDENTITY(1, 1) NOT NULL,
	idPaciente INT FOREIGN KEY (idPaciente)
	REFERENCES Pacientes(idPaciente) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idDatosGenerales INT NOT NULL,
	parentesco VARCHAR(25),
	responsables VARCHAR(25),
	estadoDeActividad VARCHAR(10),
);

ALTER TABLE DetallesPacientes ADD CONSTRAINT FK_DatosGenerales_DetallesPacientes FOREIGN KEY (idDatosGenerales)
REFERENCES DatosGenerales(idDatosGenerales) ON UPDATE CASCADE ON DELETE CASCADE;

CREATE TABLE DetallesDoctor (
	idDetallesDoctor INT PRIMARY KEY IDENTITY(1, 1),
	idDoctor INT FOREIGN KEY (idDoctor) 
	REFERENCES Doctores(idDoctor) ON UPDATE CASCADE ON DELETE CASCADE,
	idDatosGenerales INT FOREIGN KEY (idDatosGenerales)
	REFERENCES DatosGenerales(idDatosGenerales) ON UPDATE CASCADE ON DELETE CASCADE,
	idPreferencia INT FOREIGN KEY (idPreferencia)
	REFERENCES Preferencias(idPreferencia) ON UPDATE CASCADE ON DELETE CASCADE,
	especialidad VARCHAR(30),
);

CREATE TABLE DetallesAsistentes (
	idDetallesAsistentes INT PRIMARY KEY IDENTITY(1, 1),
	idAsistente INT FOREIGN KEY (idAsistente)
	REFERENCES Asistentes(idAsistente) ON UPDATE CASCADE ON DELETE CASCADE,
	idDatosGenerales INT FOREIGN KEY (idDatosGenerales)
	REFERENCES DatosGenerales(idDatosGenerales) ON UPDATE CASCADE ON DELETE CASCADE,
	idPreferencia INT FOREIGN KEY (idPreferencia)
	REFERENCES Preferencias(idPreferencia) ON UPDATE CASCADE ON DELETE CASCADE,
	especialidad VARCHAR(30),
	actividad VARCHAR(30)
);

CREATE TABLE Actividad (
	idActividad INT PRIMARY KEY IDENTITY(1, 1),
	nombres VARCHAR(50),
	apellidos VARCHAR(50),
	mensajeActividad VARCHAR(100),
	descripcionActividad VARCHAR(1000),
	dia INT,
	mes INT,
	annio INT,
	hora VARCHAR(25)
);

CREATE TABLE FichaOrtodoncia (
	idFichaOrtodoncia INT PRIMARY KEY IDENTITY(1, 1),
	idPaciente INT FOREIGN KEY (idPaciente)
	REFERENCES Pacientes(idPaciente) ON UPDATE CASCADE ON DELETE CASCADE,
	idFechaHoraCreacion INT FOREIGN KEY (idFechaHoraCreacion)
	REFERENCES FechaHoraCreacion(idFechaHoraCreacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idFechaHoraActualizacion INT FOREIGN KEY (idFechaHoraActualizacion)
	REFERENCES FechaHoraActualizacion(idFechaHoraActualizacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
);

CREATE TABLE DatosDiagnosticoOrtodontico (
	idDatosDiagnosticoOrtodontico INT PRIMARY KEY IDENTITY(1, 1),
	idFichaOrtodoncia INT FOREIGN KEY (idFichaOrtodoncia)
	REFERENCES FichaOrtodoncia(idFichaOrtodoncia) ON UPDATE CASCADE ON DELETE CASCADE,
	RMD VARCHAR(50),
	RMI VARCHAR(50),
	RCD VARCHAR(50),
	RCI VARCHAR(50),
	SMH VARCHAR(50),
	SMV VARCHAR(50),
	tipoDenticion VARCHAR(100),
	lineasMedias VARCHAR(100),
	extracciones VARCHAR(100),
	observaciones VARCHAR(200)
);

CREATE TABLE DatosDiagnosticoOrtodoncia(
	idDatosDiagnosticoOrtodoncia INT PRIMARY KEY IDENTITY(1, 1),
	idFichaOrtodoncia INT FOREIGN KEY (idFichaOrtodoncia)
	REFERENCES FichaOrtodoncia(idFichaOrtodoncia) ON UPDATE CASCADE ON DELETE CASCADE,
	HO VARCHAR(50),
	HM VARCHAR(50),
	PerfilTotal VARCHAR(100),
	PerfilTercioinf VARCHAR(100),
	AnguloNasolabial VARCHAR(100),
	AnguloCuelloMenton VARCHAR(100),
	Encias VARCHAR(100),
	Frenillos VARCHAR(100)
);

CREATE TABLE RadiografiasOrtodoncia (
    idRadiografiaOrtodoncia INT PRIMARY KEY IDENTITY(1, 1),
	idFichaOrtodoncia INT FOREIGN KEY (idFichaOrtodoncia)
	REFERENCES FichaOrtodoncia(idFichaOrtodoncia) ON UPDATE CASCADE ON DELETE CASCADE,
	fechaDeCreacion VARCHAR(100),
	imagen VARBINARY(MAX),
	tipoImagen VARCHAR(25),
	nombreRoot VARCHAR(5000)
);

CREATE TABLE FichaOdontologia(
	idFichaOdontologia INT PRIMARY KEY IDENTITY(1, 1),
	idPaciente INT FOREIGN KEY (idPaciente)
	REFERENCES Pacientes(idPaciente) ON UPDATE CASCADE ON DELETE CASCADE,
	idFechaHoraCreacion INT FOREIGN KEY (idFechaHoraCreacion)
	REFERENCES FechaHoraCreacion(idFechaHoraCreacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	idFechaHoraActualizacion INT FOREIGN KEY (idFechaHoraActualizacion)
	REFERENCES FechaHoraActualizacion(idFechaHoraActualizacion) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
);

CREATE TABLE RadiografiasOdontologia (
	idRadiografiaOdontologia INT PRIMARY KEY IDENTITY(1, 1),
	idFichaOdontologia INT FOREIGN KEY (idFichaOdontologia)
	REFERENCES FichaOdontologia(idFichaOdontologia) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL,
	fechaDeCreacion VARCHAR(100),
	imagen VARBINARY(MAX),
	tipoImagen VARCHAR(25),
	nombreRoot VARCHAR(5000)
);

CREATE TABLE Odontograma (
	idOdontograma INT PRIMARY KEY IDENTITY(1, 1),
	idFichaOdontologia INT FOREIGN KEY (idFichaOdontologia)
	REFERENCES FichaOdontologia(idFichaOdontologia) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE DatosDiagnosticoOdontologia (
	idDatosDiagnosticoOdontologia INT PRIMARY KEY IDENTITY(1, 1),
	idFichaOdontologia INT FOREIGN KEY (idFichaOdontologia)
	REFERENCES FichaOdontologia(idFichaOdontologia) ON UPDATE CASCADE ON DELETE CASCADE,
	HM VARCHAR(100),
	Medicamentos VARCHAR(100),
	HO VARCHAR(100),
	TipoAnestesico VARCHAR(100),
	TipoOdontograma VARCHAR(50)
);

CREATE TABLE DatosDiagnosticoOdontologico (
	idDatosDiagnosticoOdontologico INT PRIMARY KEY IDENTITY(1, 1),
	idFichaOdontologia INT FOREIGN KEY (idFichaOdontologia)
	REFERENCES FichaOdontologia(idFichaOdontologia) ON UPDATE CASCADE ON DELETE CASCADE,
	Anotaciones VARCHAR(200),
	Protesis VARCHAR(100),
	AnotacionesProtesis VARCHAR(500)
);

CREATE TABLE OdontogramaDientes (
	IdOdontogramaDiente INT PRIMARY KEY IDENTITY(1, 1),
	idOdontograma INT FOREIGN KEY (idOdontograma)
	REFERENCES Odontograma(idOdontograma) ON UPDATE CASCADE ON DELETE CASCADE,
	Diagnostico VARCHAR(100),
	DescripcionDiagnostico VARCHAR(500),
	Procedimiento VARCHAR(500),
	Pieza VARCHAR(30),
	NumeroPieza INT,
	Cara VARCHAR(30),
	Seleccion VARCHAR(60),
	Side VARCHAR(20)
);

-- Execute this to have an administrator user

INSERT INTO FechaHoraCreacion (dia, mes, annio, hora) VALUES (00, 0, 0000, '00:00.00 x.m');
INSERT INTO FechaHoraActualizacion (dia, mes, annio, hora) VALUES (00, 0, 0000, '00:00.00 x.m');
INSERT INTO FechasNacimientos (dia, mes, annio) VALUES (00, 00, 0000);
INSERT INTO Telefonos (celular, casa) VALUES ('No agregado', 'No agregado');
INSERT INTO DatosDireccion (departamento, municipio, direccion) VALUES ('No agregado', 'No agregado', 'No agregado');
INSERT INTO Preferencias (paletaPreferencia) VALUES ('light');
INSERT INTO Doctores (nombres, apellidos) VALUES ('Daniel', 'García Batres');
INSERT INTO DatosGenerales (idTelefono, idFechaNacimiento, idFechaHoraCreacion, idFechaHoraActualizacion, idDatosDireccion, genero, edad) VALUES (
(SELECT MAX(idTelefono) From Telefonos),
(SELECT MAX(idFechaNacimiento) FROM FechasNacimientos),
(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion),
(SELECT MAX(idFechaHoraActualizacion) FROM FechaHoraActualizacion),
(SELECT MAX(idDatosDireccion) FROM DatosDireccion),
'M', 00);
INSERT INTO DetallesDoctor (idDoctor, idDatosGenerales, especialidad, idPreferencia) VALUES (
(SELECT MAX(idDoctor) FROM Doctores),
(SELECT MAX(idDatosGenerales) FROM DatosGenerales), 'Doctor', (SELECT MAX(idPreferencia) FROM Preferencias));
INSERT INTO Registros (correoElectronico, contrasena, idFechaHoraCreacion, idFechaHoraActualizacion) VALUES ('admin@mail.com', 'admin123', 
(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion),
(SELECT MAX(idFechaHoraCreacion) FROM FechaHoraCreacion));
INSERT INTO RegistroDoctor (idDoctor, idRegistro) VALUES (
(SELECT MAX(idDoctor) FROM Doctores),
(SELECT MAX(idRegistro) FROM Registros));

-- Check your new record

SELECT * FROM Doctores;
SELECT * FROM Registros;
SELECT * FROM RegistroDoctor;
