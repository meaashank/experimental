package com.bytedance.sdk.openadsdk.to;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private final Context NOt;
    private SharedPreferences ZRu;
    private final String mZ;

    public NOt(Context context, String str) {
        this.NOt = context;
        this.mZ = str;
    }

    private SharedPreferences NOt() {
        Context context;
        SharedPreferences sharedPreferences = this.ZRu;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.mZ) || (context = this.NOt) == null) {
            return null;
        }
        try {
            this.ZRu = context.getSharedPreferences(this.mZ, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.ZRu;
    }

    public void ZRu(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferencesNOt = NOt();
            if (sharedPreferencesNOt != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesNOt.edit();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                editorEdit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                editorEdit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                editorEdit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                editorEdit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                Double d10 = (Double) obj;
                                d10.doubleValue();
                                editorEdit.putFloat(next, d10.floatValue());
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                editorEdit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public long NOt(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesNOt = NOt();
            if (sharedPreferencesNOt != null && sharedPreferencesNOt.contains(str)) {
                return sharedPreferencesNOt.getLong(str, j10);
            }
            return j10;
        } catch (Throwable th) {
            Log.i("SPUnit", this.mZ + th.getMessage());
            return j10;
        }
    }

    public void ZRu(String str, long j10) {
        try {
            SharedPreferences sharedPreferencesNOt = NOt();
            if (sharedPreferencesNOt != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesNOt.edit();
                editorEdit.putLong(str, j10);
                editorEdit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int ZRu(String str, int i10) {
        try {
            SharedPreferences sharedPreferencesNOt = NOt();
            if (sharedPreferencesNOt != null && sharedPreferencesNOt.contains(str)) {
                return sharedPreferencesNOt.getInt(str, i10);
            }
            return i10;
        } catch (Throwable th) {
            Log.i("SPUnit", this.mZ + th.getMessage());
            return i10;
        }
    }

    public String ZRu(String str, String str2) {
        try {
            SharedPreferences sharedPreferencesNOt = NOt();
            if (sharedPreferencesNOt != null && sharedPreferencesNOt.contains(str)) {
                return sharedPreferencesNOt.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.mZ + th.getMessage());
            return str2;
        }
    }

    public boolean ZRu(String str, boolean z10) {
        try {
            SharedPreferences sharedPreferencesNOt = NOt();
            if (sharedPreferencesNOt != null && sharedPreferencesNOt.contains(str)) {
                return sharedPreferencesNOt.getBoolean(str, z10);
            }
            return z10;
        } catch (Throwable th) {
            Log.i("SPUnit", this.mZ + th.getMessage());
            return z10;
        }
    }

    public void ZRu() {
        SharedPreferences sharedPreferencesNOt = NOt();
        if (sharedPreferencesNOt != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesNOt.edit();
            editorEdit.clear();
            editorEdit.commit();
        }
    }
}
