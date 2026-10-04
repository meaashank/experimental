package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C4969v;
import n.C5232c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC2595h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Executor f114333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final K<T> f114334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final K<T> f114335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f114336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f114337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dd.g
    @NotNull
    public final Runnable f114338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dd.g
    @NotNull
    public final Runnable f114339g;

    /* JADX INFO: renamed from: androidx.lifecycle.h$a */
    public static final class a extends K<T> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC2595h<T> f114340m;

        public a(AbstractC2595h<T> abstractC2595h) {
            this.f114340m = abstractC2595h;
        }

        @Override // androidx.lifecycle.K
        public void m() {
            AbstractC2595h<T> abstractC2595h = this.f114340m;
            abstractC2595h.f114333a.execute(abstractC2595h.f114338f);
        }
    }

    @dd.k
    public AbstractC2595h() {
        this(null, 1, null);
    }

    @e.f0
    public static /* synthetic */ void g() {
    }

    @e.f0
    public static /* synthetic */ void i() {
    }

    public static final void k(AbstractC2595h this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        boolean zH = this$0.h().h();
        if (this$0.f114336d.compareAndSet(false, true) && zH) {
            this$0.f114333a.execute(this$0.f114338f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(AbstractC2595h this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        do {
            boolean z10 = false;
            if (this$0.f114337e.compareAndSet(false, true)) {
                Object objC = null;
                boolean z11 = false;
                while (this$0.f114336d.compareAndSet(true, false)) {
                    try {
                        objC = this$0.c();
                        z11 = true;
                    } catch (Throwable th) {
                        this$0.f114337e.set(false);
                        throw th;
                    }
                }
                if (z11) {
                    this$0.h().o(objC);
                }
                this$0.f114337e.set(false);
                z10 = z11;
            }
            if (!z10) {
                return;
            }
        } while (this$0.f114336d.get());
    }

    @e.g0
    public abstract T c();

    @NotNull
    public final AtomicBoolean d() {
        return this.f114337e;
    }

    @NotNull
    public final Executor e() {
        return this.f114333a;
    }

    @NotNull
    public final AtomicBoolean f() {
        return this.f114336d;
    }

    @NotNull
    public K<T> h() {
        return this.f114335c;
    }

    public void j() {
        C5232c.h().b(this.f114339g);
    }

    @dd.k
    public AbstractC2595h(@NotNull Executor executor) {
        kotlin.jvm.internal.G.p(executor, "executor");
        this.f114333a = executor;
        a aVar = new a(this);
        this.f114334b = aVar;
        this.f114335c = aVar;
        this.f114336d = new AtomicBoolean(true);
        this.f114337e = new AtomicBoolean(false);
        this.f114338f = new Runnable() { // from class: androidx.lifecycle.f
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2595h.l(this.f114324a);
            }
        };
        this.f114339g = new Runnable() { // from class: androidx.lifecycle.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2595h.k(this.f114330a);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC2595h(Executor executor, int i10, C4969v c4969v) {
        if ((i10 & 1) != 0) {
            executor = C5232c.f221200e;
            kotlin.jvm.internal.G.o(executor, "getIOThreadExecutor()");
        }
        this(executor);
    }
}
