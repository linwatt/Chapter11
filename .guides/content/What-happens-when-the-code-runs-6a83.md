

**1) When the database first needs to be accessed, the SQLite helper checks whether the database already exists.**

![](.guides/img/51.png)


**2) If the database doesn’t exist, the SQLite helper creates it and runs its onCreate() method.**
Our `onCreate()` method code calls the `updateMyDatabase()` method. This creates the DRINK table (including the extra column) and populates the table with records.

![](.guides/img/52.png)


**3) If the database already exists, the SQLite helper checks the version number of the database against the version number in the SQLite helper code.**
If the SQLite helper version number is higher than the database version, it calls the `onUpgrade()` method. If the SQLite helper version number is lower than the database version, it calls the `onDowngrade()` method. Our SQLite helper version number is higher than that of the database, so the `onUpgrade()` method is called. It calls the `updateMyDatabase()` method, and this adds an extra column called FAVORITE to the DRINK table.

![](.guides/img/53.png)