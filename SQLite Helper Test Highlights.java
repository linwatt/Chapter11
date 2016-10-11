
class my Helper extends SQLiteOpenHelper {
    
  StarbuzzDatabaseHelper(Context context){
    super(context, "fred", null, 4); //The new version of the database is 4.
  }
  
  @Override
  public void onCreate(SQLiteDatabase db){
    // Run code A 
    // ... The onCreate() method will only run if the user doesn't have the database. 
  }
  
  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
    if (oldVersion < 2){
      // Run code B 
      // ... This will run if the user has version 1.
    }
    if (oldVersion == 3){
      //Run code C 
      // ... This will run if the user has version 3.
    }
    // Run code D 
    // ... This will run if the user has version 1, 2 or 3. 
  } 
  
  @Override
  public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion){
    if (oldVersion == 3){
      // Run code E
      // ... This will never run. If the user has version 3, 
      // their database needs to be upgraded, not downgraded. 
    }
    if (oldVersion < 6){
      // Run code F
      // ... This will run if the user has version 5. 
      // For onDowngrade() to run, the user must have a version greater than 4, 
      // as that's the current version number of the helper. 
    }
  }
}
