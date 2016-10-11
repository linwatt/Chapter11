Suppose we need to upgrade our database to add a new column to the DRINK table. As we want all new and existing users to get this change, we need to make sure that it’s included in both the `onCreate()` and `onUpgrade()` methods. The `onCreate()` method will make sure that all new users get the new column, and the `onUpgrade()` method will make sure that all existing users get it too.


Rather than put similar code in both the `onCreate()` and `onUpgrade()` methods, we’re going to create a separate `updateMyDatabase()` method, called by both the `onCreate()` and `onUpgrade()` methods. We’ll move the code that’s currently in the `onCreate()` method to this new `updateMyDatabase()` method, and we’ll add extra code to create the extra column. Using this approach means that you can put all of your database code in one place, and more easily keep track of what changes you’ve made each time you’ve updated the database:


![](.guides/img/44.png)