- Android uses SQLite as its backend database to persist data.

- The `SQLiteDatabase` class gives you access to the SQLite database.

- A SQLite helper lets you create and manage SQLite databases. You create a SQLite helper by extending the `SQLiteOpenHelper` class.

- You must implement the `SQLiteOpenHelper onCreate()` and `onUpgrade()` methods.

- The database gets created the first time it needs to be accessed. You need to give the database a name and version number, starting at 1. If you don’t give the database a name, it will just get created in memory.

- The `onCreate()` method gets called when the database first gets created.

- The `onUpgrade()` method gets called when the database needs to be upgraded.

- Execute SQL using the `SQLiteDatabase execSQL(String)` method.

- Add records to tables using the `insert()` method.

- Update records using the `update()` method.

- Remove records from tables using the `delete()` method.
