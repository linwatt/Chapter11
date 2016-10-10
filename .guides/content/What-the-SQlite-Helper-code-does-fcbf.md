**1) The user installs the app and launches it.**
When the app needs to access the database, the SQLite helper checks to see if the database already exists.

![](.guides/img/28.png)

**2) If the database doesn’t exist, it gets created.**
It’s given the name and version number specified in the SQLite helper.

![](.guides/img/29.png)

***3) When the database is created, the onCreate() method in the SQLite helper is called.**
It adds a DRINK table to the database, and populates it with records.

![](.guides/img/30.png)