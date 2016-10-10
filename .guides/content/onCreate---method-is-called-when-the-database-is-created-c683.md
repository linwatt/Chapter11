The SQLite helper is in charge of creating the SQLite database the first time it needs to be used. First, an empty database is created on the device, and then the SQLite helper `onCreate()` method is called.

The `onCreate()` method is passed a `SQLiteDatabase` object as a parameter. The `SQLiteDatabase` class gives you access to the database.

We can use this to run our SQL command with the method:

![](.guides/img/14.png)

This method has one parameter, the SQL you want to execute.

Here’s the full code for the `onCreate()` method:
![](.guides/img/15.png)

This gives us an empty DRINK table, but what if we want to prepopulate it with data?
