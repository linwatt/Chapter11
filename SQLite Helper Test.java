
class my Helper extends SQLiteOpenHelper {
    
  StarbuzzDatabaseHelper(Context context){
    super(context, "fred", null, 4);
  }
  
  @Override
  public void onCreate(SQLiteDatabase db){
    // Run code A
    // ...
  }
  
  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
    if (oldVersion < 2){
      // Run code B
      // ...
    }
    if (oldVersion == 3){
      //Run code C
      // ...
    }
    // Run code D
    // ...
  } 
  
  @Override
  public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion){
    if (oldVersion == 3){
      // Run code E
      // ...
    }
    if (oldVersion < 6){
      // Run code F
      // ...
    }
  }
}
