package com.amrit.primepastel;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Lincoln on 05/05/16.
 */
public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "androidhive-welcome";
    private static final String NAME = "name";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

    public String getNAME() {
        return pref.getString(NAME,"");
    }

    public String getPASSWORD() {
        return pref.getString(PASSWORD,"");
    }

    public String getEMAIL() {
        return pref.getString(EMAIL,"");
    }

    public void setEMAIL(String EMAILL) {
        editor.putString(EMAIL, EMAILL);
        editor.commit();
    }

    public  void setNAME(String NAMEE) {
        editor.putString(NAME, NAMEE);
        editor.commit();
    }

    public void setPASSWORD(String PASSWORDD) {
        editor.putString(PASSWORD, PASSWORDD);
        editor.commit();     }
}
