As you now know you can execute SQL commands using the `SQLiteDatabase execSQL()` method:
```
SQLiteDatabase.execSQL(String sql);
```


And here’s how you’d execute SQL to add a new FAVORITE column to the DRINK table:
```
db.execSQL("ALTER TABLE DRINK ADD COLUMN FAVORITE NUMERIC;");
```

You can use the `execSQL()` method any time you need to execute SQL on the database.