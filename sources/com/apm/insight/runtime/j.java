package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f137498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f137499b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Printer> f137500c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Printer> f137501d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f137502e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.j.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    j.a().a(str);
                } else if (str.charAt(0) == '<') {
                    j.a().b(str);
                }
                j.c();
            }
        };
    }

    private j() {
    }

    public static j a() {
        if (f137498a == null) {
            synchronized (j.class) {
                try {
                    if (f137498a == null) {
                        f137498a = new j();
                    }
                } finally {
                }
            }
        }
        return f137498a;
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.f137499b != -1 && SystemClock.uptimeMillis() - this.f137499b > 5000;
    }

    public final void b(String str) {
        this.f137499b = SystemClock.uptimeMillis();
        try {
            a(this.f137501d, str);
        } catch (Exception e10) {
            com.apm.insight.a.b((Throwable) e10);
        }
    }

    public final void a(String str) {
        this.f137499b = -1L;
        try {
            a(this.f137500c, str);
        } catch (Exception e10) {
            com.apm.insight.a.a((Throwable) e10);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Printer printer = list.get(i10);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
        }
    }
}
