
CREATE TABLE Sales
(
    ID       serial PRIMARY KEY,
    Product  varchar,
    Quantity integer,
    Price    decimal
);

INSERT INTO Sales (Product, Quantity, Price)
VALUES ('Product A', 10, 15.50),
       ('Product B', 20, 20.75),
       ('Product A', 15, 18.25),
       ('Product C', 12, 25.30),
       ('Product B', 8, 22.00);

SELECT Product,
       SUM(Quantity) AS TotalQuantity,
       AVG(Price)    AS AveragePrice
FROM Sales
GROUP BY Product;


SELECT Product,
       sum(Quantity),
       AVG(Price),
       min(Price),
       max(Price),
       count(Price)
FROM Sales
GROUP BY Product;

SELECT *
FROM Sales;


CREATE TABLE Expenses
(
    ID       serial PRIMARY KEY,
    Category varchar,
    Amount   decimal
);

INSERT INTO Expenses (Category, Amount)
VALUES ('Groceries', 100.50),
       ('Utilities', 200.75),
       ('Transportation', 50.25),
       ('Entertainment', 75.30),
       ('Utilities', 150.00),
       ('Groceries', 80.20),
       ('Entertainment', 120.45),
       ('Transportation', 60.75);


SELECT Category,
       SUM(Amount) AS TotalAmount,
       AVG(Amount) AS AverageAmount
FROM Expenses
GROUP BY Category;


SELECT *
FROM Expenses;


CREATE TABLE Productss
(
    ID    serial PRIMARY KEY,
    Name  varchar,
    Price decimal
);
INSERT INTO Productss (Name, Price)
VALUES ('Product A', 10.50),
       ('Product B', 20.75),
       ('Product C', 15.25),
       ('Product D', 30.30);

SELECT MIN(Name)  AS ProductWithMinPrice,
       MIN(Price) AS MinPrice,
       MAX(Name)  AS ProductWithMaxPrice,
       MAX(Price) AS MaxPrice
FROM Productss;

SELECT *
FROM Productss;



CREATE TABLE Students
(
    ID   serial PRIMARY KEY,
    Name varchar
);
SELECT * FROM Students;

INSERT INTO Students (Name)
VALUES ('Guler'),
       ('Ali'),
       ('Jasmin'),
       ('Nergiz');

CREATE TABLE Grades
(
    ID        serial PRIMARY KEY,
    StudentID integer,
    Grade     decimal
);


INSERT INTO Grades (StudentID, Grade)
VALUES (1, 80),
       (2, 90),
       (3, 85),
       (4, 95);


SELECT Name
FROM Students
WHERE (SELECT AVG(Grade) FROM Grades) < (SELECT AVG(Grade)
                                         FROM Grades WHERE StudentID = Students.ID);

SELECT *FROM Grades;


CREATE TABLE MaleStudents (
                              ID serial PRIMARY KEY,
                              Name varchar
);

INSERT INTO MaleStudents (Name) VALUES
                                    ('John'),
                                    ('David'),
                                    ('Michael');

CREATE TABLE FemaleStudents (
                                ID serial PRIMARY KEY,
                                Name varchar
);

INSERT INTO FemaleStudents (Name) VALUES
                                      ('Emily'),
                                      ('Sophia'),
                                      ('Emma');

SELECT Name FROM MaleStudents
UNION //hamisini getirir amma eyni olanmlardan  sadece birini getiri
SELECT Name FROM FemaleStudents;


SELECT Name FROM MaleStudents
INTERSECT //kesiwenleri getirir
SELECT Name FROM FemaleStudents;

SELECT Name FROM MaleStudents
EXCEPT //ortaq olmayanlari getirir
SELECT Name FROM FemaleStudents;