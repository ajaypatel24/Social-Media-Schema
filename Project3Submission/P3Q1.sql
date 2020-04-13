CREATE TYPE soh AS (first_name varchar(30), page_id integer, date_string varchar(39));

CREATE OR REPLACE FUNCTION getquery(name varchar(30), id integer, date_before varchar(30)) RETURNS SETOF soh AS $$

DECLARE
  query_cursor CURSOR FOR SELECT first_name, page_id, date_string FROM interaction NATURAL JOIN accountuser NATURAL JOIN user_like WHERE first_name = name AND page_id = id AND date_string < date_before ORDER BY first_name;
  rec soh;
BEGIN
  OPEN query_cursor;
  FETCH query_cursor INTO rec.first_name, rec.page_id, rec.date_string;    -- Read a row from the cursor
  WHILE FOUND LOOP
    RETURN NEXT rec;                                 -- Return the data to the caller
    FETCH query_cursor INTO rec.first_name, rec.page_id, rec.date_string;  -- Keep on reading rows
  END LOOP;
  CLOSE query_cursor;
  RETURN;
END;
$$ LANGUAGE plpgsql;