package X0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: X0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1346b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f76709A = 64;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f76710B = 128;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f76711C = 256;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f76712D = 512;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f76713E = 1024;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f76714F = 2048;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f76715G = 4096;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f76716H = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f76717a = 128;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f76718b = 256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f76719c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f76720d = 1024;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f76721e = 2048;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f76722f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f76723g = 8192;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f76724h = 16384;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f76725i = 32768;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f76726j = 65536;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f76727k = 131072;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f76728l = 262144;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f76729m = 524288;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f76730n = 1048576;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f76731o = 2097152;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f76732p = 4194304;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f76733q = 8388608;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f76734r = 16777216;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f76735s = 67108864;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f76736t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f76737u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f76738v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f76739w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f76740x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f76741y = 16;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f76742z = 32;

    /* JADX INFO: renamed from: X0.b$a */
    @e.T(34)
    public static class a {
        public static boolean a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        public static void b(AccessibilityEvent accessibilityEvent, boolean z10) {
            accessibilityEvent.setAccessibilityDataSensitive(z10);
        }
    }

    /* JADX INFO: renamed from: X0.b$b, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0136b {
    }

    @e.S(expression = "event.appendRecord(record)")
    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, T t10) {
        accessibilityEvent.appendRecord((AccessibilityRecord) t10.g());
    }

    @Deprecated
    public static T b(AccessibilityEvent accessibilityEvent) {
        return new T(accessibilityEvent);
    }

    @e.S(expression = "event.getAction()")
    @Deprecated
    public static int c(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    @SuppressLint({"WrongConstant"})
    @e.S(expression = "event.getContentChangeTypes()")
    @Deprecated
    public static int d(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @e.S(expression = "event.getMovementGranularity()")
    @Deprecated
    public static int e(@NonNull AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static T f(AccessibilityEvent accessibilityEvent, int i10) {
        return new T(accessibilityEvent.getRecord(i10));
    }

    @e.S(expression = "event.getRecordCount()")
    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static boolean h(@NonNull AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(accessibilityEvent);
        }
        return false;
    }

    public static void i(@NonNull AccessibilityEvent accessibilityEvent, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.b(accessibilityEvent, z10);
        }
    }

    @e.S(expression = "event.setAction(action)")
    @Deprecated
    public static void j(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setAction(i10);
    }

    @e.S(expression = "event.setContentChangeTypes(changeTypes)")
    @Deprecated
    public static void k(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }

    @e.S(expression = "event.setMovementGranularity(granularity)")
    @Deprecated
    public static void l(@NonNull AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setMovementGranularity(i10);
    }
}
