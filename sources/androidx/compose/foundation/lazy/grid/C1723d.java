package androidx.compose.foundation.lazy.grid;

import k0.C4811b;
import k0.C4812c;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1723d implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.p<InterfaceC4814e, C4811b, D> f91428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f91429b = C4812c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f91430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public D f91431d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1723d(@NotNull ed.p<? super InterfaceC4814e, ? super C4811b, D> pVar) {
        this.f91428a = pVar;
    }

    @Override // androidx.compose.foundation.lazy.grid.E
    @NotNull
    public D a(@NotNull InterfaceC4814e interfaceC4814e, long j10) {
        if (this.f91431d != null && C4811b.f(this.f91429b, j10) && this.f91430c == interfaceC4814e.a()) {
            D d10 = this.f91431d;
            kotlin.jvm.internal.G.m(d10);
            return d10;
        }
        this.f91429b = j10;
        this.f91430c = interfaceC4814e.a();
        D dInvoke = this.f91428a.invoke(interfaceC4814e, new C4811b(j10));
        this.f91431d = dInvoke;
        return dInvoke;
    }
}
