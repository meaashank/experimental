package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import kotlin.collections.AbstractC4864f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1078:1\n1855#2,2:1079\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n1069#1:1079,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class R0<V extends AbstractC1603p> implements Q0<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87779e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final r f87780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f87781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f87782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f87783d;

    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ W f87784a;

        public a(W w10) {
            this.f87784a = w10;
        }

        @Override // androidx.compose.animation.core.r
        @NotNull
        public W get(int i10) {
            return this.f87784a;
        }
    }

    public R0(@NotNull r rVar) {
        this.f87780a = rVar;
    }

    @Override // androidx.compose.animation.core.Q0, androidx.compose.animation.core.K0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // androidx.compose.animation.core.K0
    public long b(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        AbstractC4864f0 abstractC4864f0T = md.u.Y1(0, v10.b()).iterator();
        long jMax = 0;
        while (((md.k) abstractC4864f0T).f221144c) {
            int iNextInt = abstractC4864f0T.nextInt();
            jMax = Math.max(jMax, this.f87780a.get(iNextInt).c(v10.a(iNextInt), v11.a(iNextInt), v12.a(iNextInt)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V c(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        if (this.f87783d == null) {
            this.f87783d = (V) v12.c();
        }
        V v13 = this.f87783d;
        if (v13 == null) {
            kotlin.jvm.internal.G.S("endVelocityVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f87783d;
            if (v14 == null) {
                kotlin.jvm.internal.G.S("endVelocityVector");
                throw null;
            }
            v14.e(i10, this.f87780a.get(i10).d(v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f87783d;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.G.S("endVelocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V d(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        if (this.f87782c == null) {
            this.f87782c = (V) v12.c();
        }
        V v13 = this.f87782c;
        if (v13 == null) {
            kotlin.jvm.internal.G.S("velocityVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f87782c;
            if (v14 == null) {
                kotlin.jvm.internal.G.S("velocityVector");
                throw null;
            }
            v14.e(i10, this.f87780a.get(i10).b(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f87782c;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.G.S("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.K0
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        if (this.f87781b == null) {
            this.f87781b = (V) v10.c();
        }
        V v13 = this.f87781b;
        if (v13 == null) {
            kotlin.jvm.internal.G.S("valueVector");
            throw null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f87781b;
            if (v14 == null) {
                kotlin.jvm.internal.G.S("valueVector");
                throw null;
            }
            v14.e(i10, this.f87780a.get(i10).e(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f87781b;
        if (v15 != null) {
            return v15;
        }
        kotlin.jvm.internal.G.S("valueVector");
        throw null;
    }

    public R0(@NotNull W w10) {
        this(new a(w10));
    }
}
