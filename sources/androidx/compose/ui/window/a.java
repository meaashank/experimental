package androidx.compose.ui.window;

import androidx.compose.runtime.internal.r;
import androidx.compose.ui.unit.LayoutDirection;
import k0.t;
import k0.u;
import k0.v;
import k0.x;
import kotlin.jvm.internal.C4969v;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class a implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f105736c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.c f105737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f105738b;

    public /* synthetic */ a(androidx.compose.ui.c cVar, long j10, C4969v c4969v) {
        this(cVar, j10);
    }

    @Override // androidx.compose.ui.window.j
    public long a(@NotNull v vVar, long j10, @NotNull LayoutDirection layoutDirection, long j11) {
        androidx.compose.ui.c cVar = this.f105737a;
        x.a aVar = x.f214338b;
        aVar.getClass();
        long j12 = x.f214339c;
        long jA = cVar.a(j12, vVar.z(), layoutDirection);
        androidx.compose.ui.c cVar2 = this.f105737a;
        aVar.getClass();
        long jV = t.v(cVar2.a(j12, j11, layoutDirection));
        long j13 = this.f105738b;
        return t.r(t.r(t.r(vVar.E(), jA), jV), u.a(((int) (j13 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), (int) (j13 & ZipKt.f225990j)));
    }

    @NotNull
    public final androidx.compose.ui.c b() {
        return this.f105737a;
    }

    public final long c() {
        return this.f105738b;
    }

    public a(androidx.compose.ui.c cVar, long j10) {
        this.f105737a = cVar;
        this.f105738b = j10;
    }
}
