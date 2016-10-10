Every application that talks to SQLite needs to use a standard database language called **Structured Query Language (SQL)**. SQL is used by almost every type of database. Ifyou want to create the DRINK table, you will need to do it in SQL.

This is the SQL command to create the table:

![](.guides/img/13.png)

The CREATE TABLE command says what columns you want in the table, and what the data type is of each column. The _id column is the primary key of the table, and the special keyword AUTOINCREMENT means that when we store a new row in the table, SQLite will automatically generate a unique integer for it.
