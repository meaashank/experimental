package com.prism.gaia.utils;

import android.content.Context;
import android.os.Environment;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.helper.io.GFile;
import r6.k;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static boolean a(Context context) {
        GFile gFile;
        try {
            gFile = new GFile(Environment.getExternalStorageDirectory(), "virtual/Android/data");
        } catch (Throwable unused) {
            gFile = null;
        }
        return gFile != null && gFile.exists();
    }

    public static boolean b(Context context) {
        return (!C3841e.D() || U6.c.f() < 33) && ((Integer) ((k) GaiaPreferenceUtils.f167738f.a(context)).o()).intValue() == 0 && a(context);
    }
}
