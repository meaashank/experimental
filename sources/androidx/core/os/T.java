package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f111271a = "TraceCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f111272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f111273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f111274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f111275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f111276f;

    @e.T(29)
    public static class a {
        public static void a(String str, int i10) {
            Trace.beginAsyncSection(str, i10);
        }

        public static void b(String str, int i10) {
            Trace.endAsyncSection(str, i10);
        }

        public static boolean c() {
            return Trace.isEnabled();
        }

        public static void d(String str, long j10) {
            Trace.setCounter(str, j10);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f111272b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f111273c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f111274d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f111275e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f111276f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i(f111271a, "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(str, i10);
            return;
        }
        try {
            f111274d.invoke(null, Long.valueOf(f111272b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f111271a, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void b(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void c(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(str, i10);
            return;
        }
        try {
            f111275e.invoke(null, Long.valueOf(f111272b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f111271a, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void d() {
        Trace.endSection();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.c();
        }
        try {
            return ((Boolean) f111273c.invoke(null, Long.valueOf(f111272b))).booleanValue();
        } catch (Exception unused) {
            Log.v(f111271a, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void f(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(str, i10);
            return;
        }
        try {
            f111276f.invoke(null, Long.valueOf(f111272b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f111271a, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
