package z2;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f241200a = "Trace";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f241201b = 127;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f241202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f241203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f241204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f241205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f241206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f241207h;

    public static void a(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.a(m(str), i10);
        } else {
            b(m(str), i10);
        }
    }

    public static void b(@NonNull String str, int i10) {
        try {
            if (f241204e == null) {
                f241204e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f241204e.invoke(null, Long.valueOf(f241202c), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            h("asyncTraceBegin", e10);
        }
    }

    public static void c(@NonNull String str) {
        Trace.beginSection(m(str));
    }

    public static void d(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.b(m(str), i10);
        } else {
            e(m(str), i10);
        }
    }

    public static void e(@NonNull String str, int i10) {
        try {
            if (f241205f == null) {
                f241205f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f241205f.invoke(null, Long.valueOf(f241202c), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            h("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        Trace.endSection();
    }

    public static void g() {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                if (f241207h) {
                    return;
                }
                f241207h = true;
                Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            } catch (Exception e10) {
                h("setAppTracingAllowed", e10);
            }
        }
    }

    public static void h(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v(f241200a, "Unable to call " + str + " via reflection", exc);
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29 ? d.c() : j();
    }

    public static boolean j() {
        try {
            if (f241203d == null) {
                f241202c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f241203d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f241203d.invoke(null, Long.valueOf(f241202c))).booleanValue();
        } catch (Exception e10) {
            h("isTagEnabled", e10);
            return false;
        }
    }

    public static void k(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.d(m(str), i10);
        } else {
            l(m(str), i10);
        }
    }

    public static void l(@NonNull String str, int i10) {
        try {
            if (f241206g == null) {
                f241206g = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f241206g.invoke(null, Long.valueOf(f241202c), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            h("traceCounter", e10);
        }
    }

    @NonNull
    public static String m(@NonNull String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
