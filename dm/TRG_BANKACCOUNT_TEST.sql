INSERT INTO BANKACCOUNT VALUES(1, 'Fritz', sysdate, 500, 1000);
INSERT INTO BANKACCOUNT VALUES(2, 'Franz', sysdate, -1500, 1000);
INSERT INTO BANKACCOUNT VALUES(3, 'Max',   sysdate, 500, 1000);

UPDATE BANKACCOUNT
SET    OPENINGDATE = '02-NOV-17'
WHERE  ACCOUNTNUMBER = 3;

SELECT *
FROM   BANKACCOUNT
WHERE  ACCOUNTNUMBER = 3;


UPDATE BANKACCOUNT
SET    ACCOUNTNUMBER = 20
WHERE  ACCOUNTNUMBER = 3;

SELECT *
FROM   BANKACCOUNT
WHERE  ACCOUNTNUMBER = 3;


UPDATE BANKACCOUNT
SET    AMOUNT = -1500
WHERE  ACCOUNTNUMBER = 3;

SELECT *
FROM   BANKACCOUNT
WHERE  ACCOUNTNUMBER = 3;