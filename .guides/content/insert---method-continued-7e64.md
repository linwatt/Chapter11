Finally, we’ll use the `SQLiteDatabase insert()` method to insert the values into the DRINK table:
```
db.insert("DRINK", null, drinkValues);
```

Running these lines of code will insert the Latte record into the DRINK table:

![](.guides/img/19.png)

The `insert()` method takes the following general form:

![](.guides/img/20.png)

The `nullColumnHack` `String` value is optional and most of the time you’ll want to set it to null like we did in the code above. It’s there in case the `ContentValues` object is empty and you want to insert an empty row into your table. SQLite won’t let you insert an empty row without you specifying the name of at least one column; the `nullColumnHack` parameter allows you to specify one of the columns.
