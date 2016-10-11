**User 1 runs the app for the first time**
Code A.
The user doesn't have the database, so the `onCreate()` method runs.

**User 2 has database version 1.**
Code B then D. The database needs to be upgraded with `oldVersion == 1`.

**User 3 has database version 2.**
Code D. The database needs to be upgraded with `oldVersion == 2`.

**User 4 has database version 3.**
Code C then D. The database needs to be upgraded with `oldVersion == 3`.

**User 5 has database version 4.**
None. The user has the correct version of the database.

**User 6 has database version 5.**
Code F. The database needs to be downgraded with `oldVersion == 5`.