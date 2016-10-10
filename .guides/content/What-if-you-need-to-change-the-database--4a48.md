So far, you've seen how to create a SQLite database that your app will be able to use to persist data. But what if you need to make changes to the database at a future stage?

As an example, suppose you have lots of users that have already installed your Starbuzz app, and you want to add a new FAVORITE column to the DRINK table. How do you distribute this change to new and existing users?

**When you need to change an app's database, there are 2 key scenarios you have to deal with**

The first scenario is if a user has never installed your app before. In this case, the SQLite helper creates the database the first time the database needs to be accessed, and runs its `onCreate()` method.

The second scenario is where the user installs a new version of the app which includes a different version of the database. If the SQLite helper spots that the database is out of date, it will call either the `onUpgrade()` or `onDowngrade()` method.

But how can the SQLite helper tell if the database is out of date?