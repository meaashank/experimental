package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.runtime.InterfaceC1934n1;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
@V({"SMAP\nPrefetchScheduler.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,235:1\n1208#2:236\n1187#2,2:237\n523#3:239\n1#4:240\n*S KotlinDebug\n*F\n+ 1 PrefetchScheduler.android.kt\nandroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler\n*L\n106#1:236\n106#1:237,2\n136#1:239\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class RunnableC1727a implements O, InterfaceC1934n1, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final C0202a f91802g = new C0202a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f91803h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static long f91804i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f91805a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91807c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f91809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f91810f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<M> f91806b = new androidx.compose.runtime.collection.c<>(new M[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Choreographer f91808d = Choreographer.getInstance();

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a$a, reason: collision with other inner class name */
    public static final class C0202a {
        public C0202a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = androidx.compose.foundation.lazy.layout.RunnableC1727a.f91804i
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L29
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L1f
                if (r0 == 0) goto L1f
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L1f
                goto L21
            L1f:
                r5 = 1114636288(0x42700000, float:60.0)
            L21:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                androidx.compose.foundation.lazy.layout.RunnableC1727a.f91804i = r0
            L29:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.RunnableC1727a.C0202a.b(android.view.View):void");
        }

        public C0202a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.a$b */
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class b implements N {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f91811b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f91812a;

        public b(long j10) {
            this.f91812a = j10;
        }

        @Override // androidx.compose.foundation.lazy.layout.N
        public long a() {
            return Math.max(0L, this.f91812a - System.nanoTime());
        }
    }

    public RunnableC1727a(@NotNull View view) {
        this.f91805a = view;
        f91802g.b(view);
    }

    @Override // androidx.compose.foundation.lazy.layout.O
    public void a(@NotNull M m10) {
        this.f91806b.b(m10);
        if (this.f91807c) {
            return;
        }
        this.f91807c = true;
        this.f91805a.post(this);
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void b() {
        this.f91809e = true;
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void c() {
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void d() {
        this.f91809e = false;
        this.f91805a.removeCallbacks(this);
        this.f91808d.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f91809e) {
            this.f91810f = j10;
            this.f91805a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f91806b.U() || !this.f91807c || !this.f91809e || this.f91805a.getWindowVisibility() != 0) {
            this.f91807c = false;
            return;
        }
        b bVar = new b(this.f91810f + f91804i);
        boolean z10 = false;
        while (this.f91806b.V() && !z10) {
            if (bVar.a() <= 0 || this.f91806b.f99564a[0].b(bVar)) {
                z10 = true;
            } else {
                this.f91806b.l0(0);
            }
        }
        if (z10) {
            this.f91808d.postFrameCallback(this);
        } else {
            this.f91807c = false;
        }
    }
}
