Android automatically creates a folder for each app where the app's database can be stored. When we create a database for the Starbuzz app, it will be stored in the following folder: 
```
/data/data/com.hfad.starbuzz/databases
```
An app can store several databases in this folder. Each database consists of 2 files. 

![](.guides/img/2.png)

The first file is the **database file** and has the same name as your database—for example, “starbuzz”. This is the main SQLite database file. All of your data is stored in this file.

The second file is the **journal file**. It has the same name as your database, with a suffix of “-journal”—for example, “starbuzz-journal”. The journal file contains all of the changes made to your database. If there’s a problem, Android will use the journal to undo (or rollback) your latest changes.



