CREATE OR REPLACE PROCEDURE PROC_CT_BANKACCOUNT IS
    V_CNT NUMBER;
BEGIN
    SELECT count(*) INTO V_CNT
    FROM   ALL_TABLES
    WHERE  OWNER = 'DEMO' AND
           TABLE_NAME = 'BANKACCOUNT';
    
    IF V_CNT = 0 THEN
        EXECUTE IMMEDIATE 'CREATE TABLE BANKACCOUNT
                           (
                                ACCOUNTNUMBER   INTEGER,
                                FIRSTNAME       VARCHAR(20),
                                OPENINGDATE     DATE,
                                AMOUNT          DECIMAL(10,2),
                                CREDITLIMIT     DECIMAL(10,2)
                           )';
        COMMIT;
    END IF;
    
    SELECT count(*) INTO V_CNT
    FROM   ALL_SEQUENCES
    WHERE  SEQUENCE_OWNER = 'DEMO' AND
           SEQUENCE_NAME =  'SEQ_ACCOUNTNUMBER';
           
    IF V_CNT = 0 THEN
        EXECUTE IMMEDIATE 'CREATE SEQUENCE SEQ_ACCOUNTNUMBER
                           START WITH    100000
                           INCREMENT BY  1
                           CACHE         20';
        COMMIT;
    END IF;
END PROC_CT_BANKACCOUNT;