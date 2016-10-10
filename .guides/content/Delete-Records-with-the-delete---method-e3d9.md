The `SQLiteDatabase delete()` method works in a similar way to the `update()` method you’ve just seen. 

It takes the following form:

![](.guides/img/25.png)

As an example, here’s how you’d delete all records from the database where the name of the drink is “Latte”:

![](.guides/img/26.png)

The first parameter is the name of the table you want to delete records from (in this case, DRINK). The second and third arguments allow you to describe conditions to specify exactly which records you wish to delete (in this case, where NAME = “Latte”).

Now that you’ve seen the kinds of operations you can do to manipulate data in a SQLite table, you have everything that you need to create a SQLite database and create tables and prepoplute them with data. On the next page, we’ll put this into practice in our SQLite helper code.

