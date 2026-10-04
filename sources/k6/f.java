package K6;

import android.content.Context;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes6.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58418a = com.prism.fusionadsdkbase.b.j(f.class.getSimpleName());

    public static String a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return (String) telephonyManager.getClass().getMethod("getImei", null).invoke(telephonyManager, null);
        } catch (Exception unused) {
            return "";
        }
    }
}
