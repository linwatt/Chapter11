The `onUpgrade()` method has three parameters—the SQLite database, the version number of the database itself, and the new version of the database that’s passed to the `SQLiteOpenHelper` superclass:

![](.guides/img/39.png)

The version numbers are important, as you can use them to say what database changes should be made depending on which version of the database the user already has. As an example, suppose you needed to run code when the database is currently at version 1. Your code would look like this:

![](.guides/img/40.png)

You can also use the version numbers to apply successive updates like this:

![](.guides/img/41.png)