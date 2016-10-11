![](.guides/img/38.png)

**1) If the database doesn't already exist, the SQLite helper creates the database, and the helper runs the `onCreate()` method.**

**2) If the database already exists, the SQLite helper checks the version number held on the database with the version number in the helper.** 

**3) If the version number in the SQLite helper is larger than the version number held on the database, the `onUpgrade` method is called.** The SQLite helper then updates the database version number.

**4) If the version number in the SQLite helper is smaller than the version number held on the database, the `onDowngrade()` method is called.** The SQLite helper then updates the database version number.

**5) If the version number in the SQLite helper is the same as the version number held on the database, neither method is called.** The database is already up to date. 