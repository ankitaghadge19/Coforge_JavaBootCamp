create database coforgedata;
use coforgedata;

CREATE TABLE EMPLOYEES (
                          EMP_ID CHAR(9) NOT NULL,
                          F_NAME VARCHAR(15) NOT NULL,
                          L_NAME VARCHAR(15) NOT NULL,
                          SSN CHAR(9),
                          B_DATE DATE,
                          SEX CHAR,
                          ADDRESS VARCHAR(30),
                          JOB_ID CHAR(9),
                          SALARY DECIMAL(10,2),
                          MANAGER_ID CHAR(9),
                          DEP_ID CHAR(9) NOT NULL,
                          PRIMARY KEY (EMP_ID)
                        );
                        
CREATE TABLE JOB_HISTORY (
                            EMPL_ID CHAR(9) NOT NULL,
                            START_DATE DATE,
                            JOBS_ID CHAR(9) NOT NULL,
                            DEPT_ID CHAR(9),
                            PRIMARY KEY (EMPL_ID,JOBS_ID)
                          );
                          
CREATE TABLE JOBS (
                    JOB_IDENT CHAR(9) NOT NULL,
                    JOB_TITLE VARCHAR(30) ,
                    MIN_SALARY DECIMAL(10,2),
                    MAX_SALARY DECIMAL(10,2),
                    PRIMARY KEY (JOB_IDENT)
                  );
                  
CREATE TABLE DEPARTMENTS (
                            DEPT_ID_DEP CHAR(9) NOT NULL,
                            DEP_NAME VARCHAR(15) ,
                            MANAGER_ID CHAR(9),
                            LOC_ID CHAR(9),
                            PRIMARY KEY (DEPT_ID_DEP)
                          );

CREATE TABLE LOCATIONS (
                          LOCT_ID CHAR(9) NOT NULL,
                          DEP_ID_LOC CHAR(9) NOT NULL,
                          PRIMARY KEY (LOCT_ID,DEP_ID_LOC)
                        );

select * from EMPLOYEES;

DESC EMPLOYEES;

ALTER TABLE EMPLOYEES RENAME COLUMN SEX TO GENDER;

DROP TABLE IF EXISTS EMPLOYEES;

insert into JOB_HISTORY values ( 'A101','2022-02-01-','AC_222','EA01');

insert into JOB_HISTORY values ( 'A102','2023-03-01-','AC_223','EA02'), ( 'A103','2024-04-01-','AC_224','EA03');

select * from JOB_HISTORY;

insert into JOB_HISTORY(EMPL_ID, JOBS_ID) values ( 'A104', 'AC_225'), ( 'A105', 'AC_226');

UPDATE JOB_HISTORY SET START_DATE = '2023-05-01', DEPT_ID = 'EA04'            
WHERE EMPL_ID = 'A104' AND JOBS_ID = 'AC_225';

UPDATE JOB_HISTORY SET START_DATE = '2024-06-01', DEPT_ID = 'EA05'            
WHERE EMPL_ID = 'A105' AND JOBS_ID = 'AC_226';

UPDATE JOB_HISTORY SET START_DATE = '2022-06-01', DEPT_ID = 'EA05'            
WHERE EMPL_ID = 'A105' AND JOBS_ID = 'AC_226';


