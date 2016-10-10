![](.guides/img/11.png)

The data inside a SQLite database is stored in tables. A table contains several rows, and each row is split into columns. 
A column contains a single piece of data, like a number of a piece of text.


In the Starbuzz app, for example, we’ll need to create a table for the drink data. It will look something like this:

![](.guides/img/12.png)

Some columns can be specified as primary keys. A primary key uniquely identifies a single row. If you say that a column is a primary key, then the database won’t allow you to store rows with duplicate keys.

We recommend that your tables have a single integer primary key column called _id. This is because Android code is hardwired to expect a numeric _id column, so not having one can cause you problems later on.

**It’s an Android convention to call your primary key columns _id. Android code expects there to be an _id column on your data. Ignoring this convention will make it harder to get the data out of your database and into your user interface.**
