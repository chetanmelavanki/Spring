use praveen;

CREATE TABLE doctor (
    doc_id INT PRIMARY KEY,
    doc_name VARCHAR(100),
    doc_spec VARCHAR(100),
    doc_num BIGINT(100)
);

CREATE TABLE patient (
    pat_id INT PRIMARY KEY,
    pat_name VARCHAR(100),
    pat_decease VARCHAR(100),
    pat_num BIGINT(100),
    doc_id INT,
    FOREIGN KEY (doc_id)
        REFERENCES doctor (doc_id)
);

insert into doctor values(1,'pitti','eye',9035679479);
insert into doctor values(2,'gunda','heart',9686147948);
insert into doctor values(3,'appu','ear',9035679470);

select * from doctor;

insert into patient values(101,'gani','ear problem',1234567890,1);
insert into patient values(102,'gini','heart probnlem',1234567890,2);

select * from patient;
