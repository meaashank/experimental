package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.InterfaceC1730d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f92196b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC1730d<f> f92197a;

    public y(@NotNull InterfaceC1730d<f> interfaceC1730d) {
        this.f92197a = interfaceC1730d;
    }

    @NotNull
    public final InterfaceC1730d<f> a() {
        return this.f92197a;
    }

    public final boolean b(int i10) {
        if (i10 < 0 || i10 >= this.f92197a.getSize()) {
            return false;
        }
        InterfaceC1730d.a<f> aVar = this.f92197a.get(i10);
        ed.l<Integer, B> lVar = aVar.f91817c.f92105c;
        int i11 = i10 - aVar.f91815a;
        if (lVar == null) {
            return false;
        }
        B bInvoke = lVar.invoke(Integer.valueOf(i11));
        B.f91915b.getClass();
        return bInvoke == B.f91917d;
    }
}
