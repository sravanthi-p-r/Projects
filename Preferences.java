import android.app.Activity;
import android.content.SharedPreferences;


public class Calc extends Activity {
public static final String PREFS_NAME = "MyPrefsFile";
  

    @Override
    protected void onCreate(Bundle state){         
       super.onCreate(state);
    
       // Restore preferences
       SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
       boolean silent = settings.getBoolean("silentMode", false);
       setSilent(silent);
    }
    
    @Override
    protected void onStop(){
       super.onStop();
    
      // Save user preferences. We need an Editor object to
      // make changes. All objects are from android.context.Context
      SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
      SharedPreferences.Editor editor = settings.edit();
      editor.putBoolean("silentMode", mSilentMode);

      // Don't forget to commit your edits!!!
      editor.commit();
    }
}
