create index IX_653B2D22 on DB_Coleccion (groupId);
create unique index IX_A85B45FE on DB_Coleccion (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_708650CF on DB_Dataset (groupId, homepage[$COLUMN_LENGTH:75$]);
create unique index IX_A345B313 on DB_Dataset (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F80BE479 on DB_Descripcion (datasetId[$COLUMN_LENGTH:500$], groupId);
create unique index IX_B99BFD88 on DB_Descripcion (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_946A7784 on DB_Distribution (groupId, datasetId[$COLUMN_LENGTH:500$]);
create unique index IX_B3D526C1 on DB_Distribution (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_13D3B567 on DB_Titulo (datasetId[$COLUMN_LENGTH:500$], groupId);
create unique index IX_43DD7576 on DB_Titulo (uuid_[$COLUMN_LENGTH:75$], groupId);