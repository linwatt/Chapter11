Here’s what happens when you release a new version of the app where you’ve changed the SQLite helper version number from 1 to 2:


**1) The user installs the new release of the app and runs it.**
![](.guides/img/33.png)


**2) If this is the first time the user has installed the app, the database doesn’t exist, so the SQLite helper creates it.**
The SQLite helper gives the database the name and version number specified in the SQLite helper code.

![](.guides/img/34.png)

**3) When the database is created, the onCreate() method in the SQLite helper is called.**
The `onCreate()` method includes code to populate the database.

![](.guides/img/35.png)

**4) If the user installed a previous version of the app and accessed the database, the database already exists.**
If the database already exists, the SQLite helper doesn’t re-create it.

![](.guides/img/36.png)

**5) The SQLite helper checks the version number of the database against the version number in the SQLite helper code.**
If the SQLite helper version number is higher than the database version, it calls the `onUpgrade()` method. If the SQLite helper version number is lower than the database version, it calls the `onDowngrade()` method. It then changes the database version number to reflect the version number in the SQLite helper code.

![](.guides/img/37.png)
