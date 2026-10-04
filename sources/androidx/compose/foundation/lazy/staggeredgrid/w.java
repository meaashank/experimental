package androidx.compose.foundation.lazy.staggeredgrid;

import k0.C4811b;
import k0.C4812c;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC1745a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.p<InterfaceC4814e, C4811b, x> f92189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f92190b = C4812c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f92191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public x f92192d;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull ed.p<? super InterfaceC4814e, ? super C4811b, x> pVar) {
        this.f92189a = pVar;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.InterfaceC1745a
    @NotNull
    public x a(@NotNull InterfaceC4814e interfaceC4814e, long j10) {
        if (this.f92192d != null && C4811b.f(this.f92190b, j10) && this.f92191c == interfaceC4814e.a()) {
            x xVar = this.f92192d;
            G.m(xVar);
            return xVar;
        }
        this.f92190b = j10;
        this.f92191c = interfaceC4814e.a();
        x xVarInvoke = this.f92189a.invoke(interfaceC4814e, new C4811b(j10));
        this.f92192d = xVarInvoke;
        return xVarInvoke;
    }
}
