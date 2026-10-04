package com.prism.commons.utils;

import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<a> f162116a = new ThreadLocal<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f162117a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f162118b = false;
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Thread f162119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Thread f162120b;

        public class a extends Thread {

            /* JADX INFO: renamed from: com.prism.commons.utils.n0$b$a$a, reason: collision with other inner class name */
            public class C0662a extends Thread {
                public C0662a() {
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    b.this.g();
                }
            }

            public a() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                b.this.f162119a = new C0662a();
                b.this.f162119a.start();
                b.this.f();
            }
        }

        public Thread d() {
            return this.f162120b;
        }

        public Thread e() {
            return this.f162119a;
        }

        public abstract void f();

        public abstract void g();

        public final void h() {
            a aVar = new a();
            this.f162120b = aVar;
            aVar.start();
        }
    }

    public static void a(boolean z10) {
        d().f162118b = z10;
    }

    public static void b(boolean z10) {
        d().f162117a = z10;
    }

    public static ThreadGroup c() {
        ThreadGroup threadGroup = null;
        for (ThreadGroup threadGroup2 = Thread.currentThread().getThreadGroup(); threadGroup2 != null; threadGroup2 = threadGroup2.getParent()) {
            threadGroup = threadGroup2;
        }
        return threadGroup;
    }

    @NonNull
    public static a d() {
        ThreadLocal<a> threadLocal = f162116a;
        a aVar = threadLocal.get();
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        threadLocal.set(aVar2);
        return aVar2;
    }

    public static boolean e() {
        return d().f162118b;
    }

    public static boolean f() {
        return d().f162117a;
    }

    public static boolean g() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void h(b bVar) {
        bVar.h();
    }
}
