package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,289:1\n4553#2,7:290\n4553#2,7:297\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:290,7\n286#1:297,7\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Q0<N> implements InterfaceC1908f<N> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99199d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC1908f<N> f99200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99202c;

    public Q0(@NotNull InterfaceC1908f<N> interfaceC1908f, int i10) {
        this.f99200a = interfaceC1908f;
        this.f99201b = i10;
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void a(int i10, int i11) {
        this.f99200a.a(i10 + (this.f99202c == 0 ? this.f99201b : 0), i11);
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public N b() {
        return this.f99200a.b();
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public /* synthetic */ void c() {
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void clear() {
        C1968u.v("Clear is not valid on OffsetApplier");
        throw null;
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public /* synthetic */ void d() {
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void e(int i10, int i11, int i12) {
        int i13 = this.f99202c == 0 ? this.f99201b : 0;
        this.f99200a.e(i10 + i13, i11 + i13, i12);
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void f(int i10, N n10) {
        this.f99200a.f(i10 + (this.f99202c == 0 ? this.f99201b : 0), n10);
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void g(int i10, N n10) {
        this.f99200a.g(i10 + (this.f99202c == 0 ? this.f99201b : 0), n10);
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void h(N n10) {
        this.f99202c++;
        this.f99200a.h(n10);
    }

    @Override // androidx.compose.runtime.InterfaceC1908f
    public void i() {
        int i10 = this.f99202c;
        if (!(i10 > 0)) {
            C1968u.v("OffsetApplier up called with no corresponding down");
            throw null;
        }
        this.f99202c = i10 - 1;
        this.f99200a.i();
    }
}
