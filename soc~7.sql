CREATE TABLE TABLE_UNIQUE2(
    LOGIN_ID VARCHAR2(20) CONSTRAINT TBLNN2_LENID_NNQ NOT NULL,
    LOGIN_PWD  VARCHAR2(20) CONSTRAINT TBLNN2_LENPW_NN NOT NULL,
    TEL VARCHAR(20)
    );
    
SELECT OWNER, CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
    FROM USER_CONSTRAINTS
    WHERE TABLE_NAME LIKE 'TABLE_UNIQUE$';
    
ALTER TABLE 
    
    
