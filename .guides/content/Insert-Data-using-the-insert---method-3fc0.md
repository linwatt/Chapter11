The `SQLiteDatabase` class contains several methods that enable you to insert, update, and delete data. 

![](.guides/img/16.png)

If you need to prepopulate a SQLite table with data, you can use the `SQLiteDatabase insert()` method. 

This method allows you to insert data into the database, and returns the ID of the record once it’s been inserted. 

To use the `insert()` method, you need to specify the table you want to insert into, and the values you’re inserting. You say what values you want to insert by creating a **ContentValues** object. A `ContentValues` object is used to hold name/value pairs of data:
```
ContentValues drinkValues = new ContentValues();
```

You add name/value pairs of data to the `ContentValues` object using its `put()` method. We want to use it to insert a row of data into the DRINK table, so we’ll populate it with the name of each column in the DRINK table, and the value we want to go in each field:

![](.guides/img/18.png)



