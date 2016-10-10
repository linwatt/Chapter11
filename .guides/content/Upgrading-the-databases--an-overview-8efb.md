Here’s what happens when you release a new version of the app where you’ve changed the SQLite helper version number from 1 to 2:

The user installs the new release of the app and runs it.
If this is the first time the user has installed the app, the database doesn’t exist, so the SQLite helper creates it.
The SQLite helper gives the database the name and version number specified in the SQLite helper code.
When the database is created, the onCreate() method in the SQLite helper is called.
The onCreate() method includes code to populate the database.
