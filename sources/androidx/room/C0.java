package androidx.room;

import android.annotation.SuppressLint;
import androidx.room.G;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n.C5232c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
public final class C0<T> extends androidx.lifecycle.K<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f117020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final D f117021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f117022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Callable<T> f117023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final G.c f117024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f117025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f117026s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f117027t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Runnable f117028u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Runnable f117029v;

    public static final class a extends G.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0<T> f117030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String[] strArr, C0<T> c02) {
            super(strArr);
            this.f117030b = c02;
        }

        @Override // androidx.room.G.c
        public void c(@NotNull Set<String> tables) {
            kotlin.jvm.internal.G.p(tables, "tables");
            C5232c.h().b(this.f117030b.f117029v);
        }
    }

    public C0(@NotNull RoomDatabase database, @NotNull D container, boolean z10, @NotNull Callable<T> computeFunction, @NotNull String[] tableNames) {
        kotlin.jvm.internal.G.p(database, "database");
        kotlin.jvm.internal.G.p(container, "container");
        kotlin.jvm.internal.G.p(computeFunction, "computeFunction");
        kotlin.jvm.internal.G.p(tableNames, "tableNames");
        this.f117020m = database;
        this.f117021n = container;
        this.f117022o = z10;
        this.f117023p = computeFunction;
        this.f117024q = new a(tableNames, this);
        this.f117025r = new AtomicBoolean(true);
        this.f117026s = new AtomicBoolean(false);
        this.f117027t = new AtomicBoolean(false);
        this.f117028u = new Runnable() { // from class: androidx.room.A0
            @Override // java.lang.Runnable
            public final void run() {
                C0.F(this.f116952a);
            }
        };
        this.f117029v = new Runnable() { // from class: androidx.room.B0
            @Override // java.lang.Runnable
            public final void run() {
                C0.E(this.f117019a);
            }
        };
    }

    public static final void E(C0 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        boolean zH = this$0.h();
        if (this$0.f117025r.compareAndSet(false, true) && zH) {
            this$0.B().execute(this$0.f117028u);
        }
    }

    public static final void F(C0 this$0) {
        boolean z10;
        kotlin.jvm.internal.G.p(this$0, "this$0");
        if (this$0.f117027t.compareAndSet(false, true)) {
            this$0.f117020m.p().d(this$0.f117024q);
        }
        do {
            if (this$0.f117026s.compareAndSet(false, true)) {
                T tCall = null;
                z10 = false;
                while (this$0.f117025r.compareAndSet(true, false)) {
                    try {
                        try {
                            tCall = this$0.f117023p.call();
                            z10 = true;
                        } catch (Exception e10) {
                            throw new RuntimeException("Exception while computing database live data.", e10);
                        }
                    } finally {
                        this$0.f117026s.set(false);
                    }
                }
                if (z10) {
                    this$0.o(tCall);
                }
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        } while (this$0.f117025r.get());
    }

    @NotNull
    public final G.c A() {
        return this.f117024q;
    }

    @NotNull
    public final Executor B() {
        return this.f117022o ? this.f117020m.x() : this.f117020m.t();
    }

    @NotNull
    public final Runnable C() {
        return this.f117028u;
    }

    @NotNull
    public final AtomicBoolean D() {
        return this.f117027t;
    }

    @Override // androidx.lifecycle.K
    public void m() {
        this.f117021n.c(this);
        B().execute(this.f117028u);
    }

    @Override // androidx.lifecycle.K
    public void n() {
        this.f117021n.d(this);
    }

    @NotNull
    public final Callable<T> u() {
        return this.f117023p;
    }

    @NotNull
    public final AtomicBoolean v() {
        return this.f117026s;
    }

    @NotNull
    public final RoomDatabase w() {
        return this.f117020m;
    }

    public final boolean x() {
        return this.f117022o;
    }

    @NotNull
    public final AtomicBoolean y() {
        return this.f117025r;
    }

    @NotNull
    public final Runnable z() {
        return this.f117029v;
    }
}
