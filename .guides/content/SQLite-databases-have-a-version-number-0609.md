The SQLite helper can tell whether the SQLite database needs updating by looking at its version number. You specify the version of the database in the SQLite helper by passing it to the `SQLiteOpenHelper` superclass in its constructor. 

Earlier on, we specified the version number of the database like this:
![](.guides/img/31.png)

When the database gets created, its version number gets set to the version number in the SQLite helper, and the SQLite helper `onCreate()` method gets called.

When you want to update the database, you change the version number in the SQLite helper code. To **upgrade** the database, specify a number that’s larger than you had before, and to **downgrade** your database, specify a number that’s lower:

![](.guides/img/32.png)

Most of the time, you’ll want to upgrade the database, so specify a number that’s larger. This is because you usually only downgrade your database when you want to pull changes you made in a previous upgrade.

When the user installs the latest version of the app on her device, the first time the app needs to use the database, the SQLite helper checks its version number against that of the database on the device.

If the version number in the SQLite helper code is **higher** than that of the database, it calls the SQLite helper **onUpgrade()** method. If the version number in the SQLite helper code is **lower** than that of the database, it calls the **onDowngrade()** method instead.

Once it’s called either of these methods, it changes the version number of the database to match the version number in the SQLite helper.
