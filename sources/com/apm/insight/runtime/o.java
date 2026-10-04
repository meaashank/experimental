package com.apm.insight.runtime;

import android.system.Os;
import android.system.OsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f137521a = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f137522a = -1;

        public static long a() {
            if (o.f137521a == -1) {
                long jSysconf = f137522a;
                if (jSysconf <= 0) {
                    jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                    if (jSysconf <= 0) {
                        jSysconf = 100;
                    }
                    f137522a = jSysconf;
                }
                long unused = o.f137521a = 1000 / jSysconf;
            }
            return o.f137521a;
        }

        private static long a(String str) {
            try {
                int i10 = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(cls.getField("os").get(null), Integer.valueOf(i10))).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return 100L;
            }
        }
    }
}
