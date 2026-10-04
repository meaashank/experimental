package com.mbridge.msdk.config.component.pipeline.util;

import android.text.TextUtils;
import com.android.launcher3.IconCache;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static long a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return str.contains(IconCache.EMPTY_CLASS_NAME) ? Math.round(Float.parseFloat(str) * 1000.0f) : ((long) Integer.parseInt(str)) * 1000;
        } catch (Throwable unused) {
            q0.b("PipelineUtil", "Pipeline convert delay time error, will use 0");
            return 0L;
        }
    }

    public static String a() {
        int iLastIndexOf;
        Package r02 = com.mbridge.msdk.config.component.pipeline.a.class.getPackage();
        if (r02 != null) {
            String name = r02.getName();
            if (!TextUtils.isEmpty(name) && (iLastIndexOf = name.lastIndexOf(IconCache.EMPTY_CLASS_NAME)) != 0) {
                String strSubstring = name.substring(0, iLastIndexOf);
                return !TextUtils.isEmpty(strSubstring) ? strSubstring : "com.mbridge.msdk.config.component";
            }
            return "com.mbridge.msdk.config.component";
        }
        return "com.mbridge.msdk.config.component";
    }
}
