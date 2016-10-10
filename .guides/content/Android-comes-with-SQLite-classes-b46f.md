Android uses a set of classes that allows you to manage a SQLite database. 
There are three types of object that do the bulk of this work.


**1) THE SQLite Helper**
You create a SQLite helper by extending the `SQLiteOpenHelper` class. This enables you to create and manage databases.

**2) Cursors**
A `Cursor` lets you read from and write to the database. It’s like a `ResultSet` in JDBC.

**3) The SQLite Database**
The `SQLiteDatabase` class gives you access to the database. It’s like a `SQLConnection` in JDBC.
