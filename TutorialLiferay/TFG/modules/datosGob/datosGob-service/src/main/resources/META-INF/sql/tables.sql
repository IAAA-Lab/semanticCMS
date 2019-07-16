create table DB_Coleccion (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	homepage VARCHAR(75) not null primary key,
	titulo VARCHAR(75) null
);

create table DB_Dataset (
	uuid_ VARCHAR(75) null,
	datasetId VARCHAR(500) not null primary key,
	groupId LONG,
	homepage VARCHAR(75) null
);

create table DB_Descripcion (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	descripcionId LONG not null primary key,
	descripcion TEXT null,
	datasetId VARCHAR(500) null
);

create table DB_Distribution (
	uuid_ VARCHAR(75) null,
	distributionId LONG not null primary key,
	url VARCHAR(1500) null,
	groupId LONG,
	tipo VARCHAR(75) null,
	datasetId VARCHAR(500) null
);

create table DB_Titulo (
	uuid_ VARCHAR(75) null,
	groupId LONG,
	tituloId LONG not null primary key,
	titulo VARCHAR(500) null,
	datasetId VARCHAR(500) null
);