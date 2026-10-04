package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import e.InterfaceC4326A;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.room.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nAutoCloser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoCloser.kt\nandroidx/room/AutoCloser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,228:1\n1#2:229\n*E\n"})
public final class C2656d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f117197m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f117198n = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SupportSQLiteOpenHelper f117199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Handler f117200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Runnable f117201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Object f117202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f117203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Executor f117204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4326A("lock")
    public int f117205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @InterfaceC4326A("lock")
    public long f117206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InterfaceC4326A("lock")
    @Nullable
    public v2.d f117207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f117208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Runnable f117209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Runnable f117210l;

    /* JADX INFO: renamed from: androidx.room.d$a */
    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public C2656d(long j10, @NotNull TimeUnit autoCloseTimeUnit, @NotNull Executor autoCloseExecutor) {
        kotlin.jvm.internal.G.p(autoCloseTimeUnit, "autoCloseTimeUnit");
        kotlin.jvm.internal.G.p(autoCloseExecutor, "autoCloseExecutor");
        this.f117200b = new Handler(Looper.getMainLooper());
        this.f117202d = new Object();
        this.f117203e = autoCloseTimeUnit.toMillis(j10);
        this.f117204f = autoCloseExecutor;
        this.f117206h = SystemClock.uptimeMillis();
        this.f117209k = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                C2656d.f(this.f117191a);
            }
        };
        this.f117210l = new Runnable() { // from class: androidx.room.c
            @Override // java.lang.Runnable
            public final void run() {
                C2656d.c(this.f117193a);
            }
        };
    }

    public static final void c(C2656d this$0) {
        kotlin.L0 l02;
        kotlin.jvm.internal.G.p(this$0, "this$0");
        synchronized (this$0.f117202d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f117206h < this$0.f117203e) {
                    return;
                }
                if (this$0.f117205g != 0) {
                    return;
                }
                Runnable runnable = this$0.f117201c;
                if (runnable != null) {
                    runnable.run();
                    l02 = kotlin.L0.f217464a;
                } else {
                    l02 = null;
                }
                if (l02 == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                v2.d dVar = this$0.f117207i;
                if (dVar != null && dVar.isOpen()) {
                    dVar.close();
                }
                this$0.f117207i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void f(C2656d this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.f117204f.execute(this$0.f117210l);
    }

    public final void d() throws IOException {
        synchronized (this.f117202d) {
            try {
                this.f117208j = true;
                v2.d dVar = this.f117207i;
                if (dVar != null) {
                    dVar.close();
                }
                this.f117207i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f117202d) {
            int i10 = this.f117205g;
            if (i10 <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            }
            int i11 = i10 - 1;
            this.f117205g = i11;
            if (i11 == 0) {
                if (this.f117207i == null) {
                } else {
                    this.f117200b.postDelayed(this.f117209k, this.f117203e);
                }
            }
        }
    }

    public final <V> V g(@NotNull ed.l<? super v2.d, ? extends V> block) {
        kotlin.jvm.internal.G.p(block, "block");
        try {
            return block.invoke(n());
        } finally {
            e();
        }
    }

    @Nullable
    public final v2.d h() {
        return this.f117207i;
    }

    @NotNull
    public final SupportSQLiteOpenHelper i() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f117199a;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        kotlin.jvm.internal.G.S("delegateOpenHelper");
        throw null;
    }

    public final long j() {
        return this.f117206h;
    }

    @Nullable
    public final Runnable k() {
        return this.f117201c;
    }

    public final int l() {
        return this.f117205g;
    }

    @e.f0
    public final int m() {
        int i10;
        synchronized (this.f117202d) {
            i10 = this.f117205g;
        }
        return i10;
    }

    @NotNull
    public final v2.d n() {
        synchronized (this.f117202d) {
            this.f117200b.removeCallbacks(this.f117209k);
            this.f117205g++;
            if (this.f117208j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            v2.d dVar = this.f117207i;
            if (dVar != null && dVar.isOpen()) {
                return dVar;
            }
            v2.d writableDatabase = i().getWritableDatabase();
            this.f117207i = writableDatabase;
            return writableDatabase;
        }
    }

    public final void o(@NotNull SupportSQLiteOpenHelper delegateOpenHelper) {
        kotlin.jvm.internal.G.p(delegateOpenHelper, "delegateOpenHelper");
        this.f117199a = delegateOpenHelper;
    }

    public final boolean p() {
        return !this.f117208j;
    }

    public final void q(@NotNull Runnable onAutoClose) {
        kotlin.jvm.internal.G.p(onAutoClose, "onAutoClose");
        this.f117201c = onAutoClose;
    }

    public final void r(@Nullable v2.d dVar) {
        this.f117207i = dVar;
    }

    public final void s(@NotNull SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        kotlin.jvm.internal.G.p(supportSQLiteOpenHelper, "<set-?>");
        this.f117199a = supportSQLiteOpenHelper;
    }

    public final void t(long j10) {
        this.f117206h = j10;
    }

    public final void u(@Nullable Runnable runnable) {
        this.f117201c = runnable;
    }

    public final void v(int i10) {
        this.f117205g = i10;
    }
}
