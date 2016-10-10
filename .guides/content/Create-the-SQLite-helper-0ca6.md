You create a SQLite helper by writing a class that extends the `SQLiteOpenHelper` class. When you do this, you **must** override the `onCreate()` and `onUpgrade()` methods. These methods are mandatory.

![](.guides/img/6.png)


The `onCreate()` method gets called when the database first gets created on the device. The method should include all the code needed to create the tables you need for your app.

The `onUpgrade()` method gets called when the database needs to be upgraded. As an example, if you need to make table changes to your database after it’s been released, this is the method to do it in.
