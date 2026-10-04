package P;

import androidx.compose.runtime.T1;
import n0.C5238e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    @T1
    @NotNull
    public static final j a(long j10, long j11) {
        return new j(g.p(j10), g.r(j10), g.p(j11), g.r(j11));
    }

    @T1
    @NotNull
    public static final j b(long j10, float f10) {
        return new j(g.p(j10) - f10, g.r(j10) - f10, g.p(j10) + f10, g.r(j10) + f10);
    }

    @T1
    @NotNull
    public static final j c(long j10, long j11) {
        return new j(g.p(j10), g.r(j10), n.t(j11) + g.p(j10), n.m(j11) + g.r(j10));
    }

    @T1
    @NotNull
    public static final j d(@NotNull j jVar, @NotNull j jVar2, float f10) {
        return new j(C5238e.j(jVar.f65511a, jVar2.f65511a, f10), C5238e.j(jVar.f65512b, jVar2.f65512b, f10), C5238e.j(jVar.f65513c, jVar2.f65513c, f10), C5238e.j(jVar.f65514d, jVar2.f65514d, f10));
    }
}
