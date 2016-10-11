The `onDowngrade()` method isn’t used as often as the `onUpgrade()` method, as it’s used to revert your database to a previous version. This can be useful if you release a version of your app that includes database changes, but you then discover that there are bugs. The `onDowngrade()` method allows you to pull the changes and set the database back to its previous version.

Just like the `onUpgrade()` method, the `onDowngrade()` method has three parameters—the SQLite database you want to downgrade, the version number of the database itself, and the new version of the database that’s passed to the `SQLiteOpenHelper` superclass:


![](.guides/img/42.png)


Just like the `onUpgrade()` method, you can use the version numbers to revert changes specific to a particular version. As an example, if you needed to make changes to the database when the database version is 3, you'd use code like the following: 

![](.guides/img/43.png)