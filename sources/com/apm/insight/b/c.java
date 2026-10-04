package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f137048b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f137049a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f137050c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f137051d;

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f137050c) {
                    return;
                }
                c.this.f137049a.d();
                long unused = c.f137048b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.j.a().b()) {
                    n.a().a(c.this.f137051d, 500L);
                } else {
                    n.a().a(c.this.f137051d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f137048b);
            }
        };
        this.f137051d = runnable;
        this.f137049a = bVar;
        n.a().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - f137048b <= 15000;
    }

    public final void b() {
        this.f137050c = true;
    }

    public final void a() {
        if (this.f137050c) {
            return;
        }
        n.a().a(this.f137051d, 5000L);
    }
}
