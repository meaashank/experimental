package androidx.activity;

import androidx.annotation.RestrictTo;
import e.InterfaceC4326A;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Executor f85076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<L0> f85077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f85078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC4326A("lock")
    public int f85079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC4326A("lock")
    public boolean f85080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC4326A("lock")
    public boolean f85081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4326A("lock")
    @NotNull
    public final List<InterfaceC4376a<L0>> f85082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Runnable f85083h;

    public z(@NotNull Executor executor, @NotNull InterfaceC4376a<L0> reportFullyDrawn) {
        kotlin.jvm.internal.G.p(executor, "executor");
        kotlin.jvm.internal.G.p(reportFullyDrawn, "reportFullyDrawn");
        this.f85076a = executor;
        this.f85077b = reportFullyDrawn;
        this.f85078c = new Object();
        this.f85082g = new ArrayList();
        this.f85083h = new Runnable() { // from class: androidx.activity.y
            @Override // java.lang.Runnable
            public final void run() {
                z.i(this.f85075a);
            }
        };
    }

    public static final void i(z this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        synchronized (this$0.f85078c) {
            this$0.f85080e = false;
            if (this$0.f85079d == 0 && !this$0.f85081f) {
                this$0.f85077b.invoke();
                this$0.d();
            }
        }
    }

    public final void b(@NotNull InterfaceC4376a<L0> callback) {
        boolean z10;
        kotlin.jvm.internal.G.p(callback, "callback");
        synchronized (this.f85078c) {
            if (this.f85081f) {
                z10 = true;
            } else {
                this.f85082g.add(callback);
                z10 = false;
            }
        }
        if (z10) {
            callback.invoke();
        }
    }

    public final void c() {
        synchronized (this.f85078c) {
            if (!this.f85081f) {
                this.f85079d++;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void d() {
        synchronized (this.f85078c) {
            try {
                this.f85081f = true;
                Iterator<T> it = this.f85082g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4376a) it.next()).invoke();
                }
                this.f85082g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f85078c) {
            z10 = this.f85081f;
        }
        return z10;
    }

    public final void f() {
        if (this.f85080e || this.f85079d != 0) {
            return;
        }
        this.f85080e = true;
        this.f85076a.execute(this.f85083h);
    }

    public final void g(@NotNull InterfaceC4376a<L0> callback) {
        kotlin.jvm.internal.G.p(callback, "callback");
        synchronized (this.f85078c) {
            this.f85082g.remove(callback);
        }
    }

    public final void h() {
        int i10;
        synchronized (this.f85078c) {
            if (!this.f85081f && (i10 = this.f85079d) > 0) {
                this.f85079d = i10 - 1;
                f();
            }
        }
    }
}
