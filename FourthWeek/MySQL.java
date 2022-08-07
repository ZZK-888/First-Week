
/*第一题*/
CREATE TABLE employees (
        emp_no INT  PRIMARY KEY AUTO_INCREMENT,
        birth_data VARCHAR(20),
        first_name VARCHAR(20),
        last_name VARCHAR(20),
        gender VARCHAR(1),
        hire_date VARCHAR(20)
        );
        SELECT * FROM employees WHERE hire_date IN (SELECT MIN(hire_date) FROM employees);

        /*第二题*/
        SELECT *FROM film WHERE film.`film_id`NOT IN (SELECT film.`film_id`FROM film RIGHT JOIN film_category ON film.`film_id`= film_category.`film_id`);

        /*第三题*/
        SELECT *FROM employees LIMIT 5,5;

        /*第四题*/
        ALTER TABLE actor ADD UNIQUE uniq_idx_firstname(first_name);
        ALTER TABLE actor ADD INDEX  idx_lastname(last_name);

        /*第五题*/
        CREATE TABLE passing_number(
        id INT,
        number INT
        );
        INSERT  passing_number VALUES(2,3);
        ALTER TABLE passing_number ADD t_rank INT;
        SELECT * FROM passing_number;
        SET @rank:=0;

        SET @preScore:=0;

        UPDATE passing_number, (SELECT id,( IF( @preScore<>number,@rank:=@rank+1,@rank ) ) t_rank,@preScore:=number

        FROM passing_number

        ORDER BY number DESC) temp_tb_rank

        SET passing_number.t_rank=temp_tb_rank.t_rank

        WHERE passing_number.id=temp_tb_rank.id;