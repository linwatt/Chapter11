We’ll use a SQLite helper to create a SQLite database we can use with our Starbuzz app. We’re going to replace our `Drink` Java class with a database, so we need our SQLite helper to do the following:

**1) Create the database.**
Before we can do anything else, we need to get the SQLite helper to create version 1 (the first version) of our Starbuzz database.

**2) Create the Drink table and populate it with drinks.**
Once we have a database, we can create a table in it. The table structure needs to reflect the attributes in the current `Drink` class, so it needs to be able to store the name, description, and image resource ID of each drink. We’ll then add three drinks to it.

The app has the same structure as before except that we’re replacing the file *Drink.java* with a SQLite helper and a SQLite Starbuzz database. The SQLite helper will maintain the Starbuzz database, and provide access to it for the other activities. We’ll change the activities to use the database in the next chapter.


![](.guides/img/4.png)