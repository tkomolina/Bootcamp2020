create schema db;

CREATE TABLE Teacher(
Id Int AUTO_INCREMENT,
firstName varchar (100) NOT NULL,
lastName varchar(100) NOT NULL,
age Int NOT NULL,
PRIMARY KEY(Id)
);

ALTER TABLE Teacher MODIFY COLUMN age Int;

SELECT * FROM Teacher;
INSERT INTO Teacher(firstName,lastName,age)
VALUES ('John','Doe',36);
INSERT INTO Teacher(firstName,lastName,age)
VALUES ('Jane','Doe',32);

INSERT INTO Teacher(Id,firstName,lastName,age)
VALUES (900,'Mary','Boo',67);
INSERT INTO Teacher(Id,firstName,lastName,age)
VALUES (901,'Steve','Wallace',54);

UPDATE Teacher
SET lastName='Parker'
WHERE iD=900;	

UPDATE Teacher
SET firstName='Steven'
WHERE iD=901;	

ALTER TABLE Teacher  DROP COLUMN age;

SELECT * FROM Teacher;

