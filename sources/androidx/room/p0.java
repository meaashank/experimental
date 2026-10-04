package androidx.room;

import androidx.room.RoomDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements v2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final v2.h f117283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f117284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Executor f117285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final RoomDatabase.e f117286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Object> f117287e;

    public p0(@NotNull v2.h delegate, @NotNull String sqlStatement, @NotNull Executor queryCallbackExecutor, @NotNull RoomDatabase.e queryCallback) {
        kotlin.jvm.internal.G.p(delegate, "delegate");
        kotlin.jvm.internal.G.p(sqlStatement, "sqlStatement");
        kotlin.jvm.internal.G.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.G.p(queryCallback, "queryCallback");
        this.f117283a = delegate;
        this.f117284b = sqlStatement;
        this.f117285c = queryCallbackExecutor;
        this.f117286d = queryCallback;
        this.f117287e = new ArrayList();
    }

    public static final void f(p0 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f117286d.a(this$0.f117284b, this$0.f117287e);
    }

    public static final void g(p0 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f117286d.a(this$0.f117284b, this$0.f117287e);
    }

    public static final void k(p0 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f117286d.a(this$0.f117284b, this$0.f117287e);
    }

    private final void l(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f117287e.size()) {
            int size = (i11 - this.f117287e.size()) + 1;
            for (int i12 = 0; i12 < size; i12++) {
                this.f117287e.add(null);
            }
        }
        this.f117287e.set(i11, obj);
    }

    public static final void m(p0 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f117286d.a(this$0.f117284b, this$0.f117287e);
    }

    public static final void n(p0 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f117286d.a(this$0.f117284b, this$0.f117287e);
    }

    @Override // v2.e
    public void E1(int i10, long j10) {
        l(i10, Long.valueOf(j10));
        this.f117283a.E1(i10, j10);
    }

    @Override // v2.e
    public void J1(int i10, @NotNull byte[] value) {
        kotlin.jvm.internal.G.p(value, "value");
        l(i10, value);
        this.f117283a.J1(i10, value);
    }

    @Override // v2.h
    @Nullable
    public String L2() {
        this.f117285c.execute(new Runnable() { // from class: androidx.room.m0
            @Override // java.lang.Runnable
            public final void run() {
                p0.n(this.f117280a);
            }
        });
        return this.f117283a.L2();
    }

    @Override // v2.e
    public void T3() {
        this.f117287e.clear();
        this.f117283a.T3();
    }

    @Override // v2.e
    public void X1(int i10) {
        l(i10, null);
        this.f117283a.X1(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f117283a.close();
    }

    @Override // v2.h
    public void execute() {
        this.f117285c.execute(new Runnable() { // from class: androidx.room.n0
            @Override // java.lang.Runnable
            public final void run() {
                p0.f(this.f117281a);
            }
        });
        this.f117283a.execute();
    }

    @Override // v2.h
    public long j3() {
        this.f117285c.execute(new Runnable() { // from class: androidx.room.l0
            @Override // java.lang.Runnable
            public final void run() {
                p0.g(this.f117279a);
            }
        });
        return this.f117283a.j3();
    }

    @Override // v2.h
    public long p1() {
        this.f117285c.execute(new Runnable() { // from class: androidx.room.k0
            @Override // java.lang.Runnable
            public final void run() {
                p0.m(this.f117278a);
            }
        });
        return this.f117283a.p1();
    }

    @Override // v2.e
    public void t1(int i10, @NotNull String value) {
        kotlin.jvm.internal.G.p(value, "value");
        l(i10, value);
        this.f117283a.t1(i10, value);
    }

    @Override // v2.e
    public void t2(int i10, double d10) {
        l(i10, Double.valueOf(d10));
        this.f117283a.t2(i10, d10);
    }

    @Override // v2.h
    public int y0() {
        this.f117285c.execute(new Runnable() { // from class: androidx.room.o0
            @Override // java.lang.Runnable
            public final void run() {
                p0.k(this.f117282a);
            }
        });
        return this.f117283a.y0();
    }
}
