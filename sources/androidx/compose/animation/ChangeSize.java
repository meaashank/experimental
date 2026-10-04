package androidx.compose.animation;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class ChangeSize {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87229e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.c f87230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<k0.x, k0.x> f87231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.animation.core.U<k0.x> f87232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f87233d;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(@NotNull androidx.compose.ui.c cVar, @NotNull ed.l<? super k0.x, k0.x> lVar, @NotNull androidx.compose.animation.core.U<k0.x> u10, boolean z10) {
        this.f87230a = cVar;
        this.f87231b = lVar;
        this.f87232c = u10;
        this.f87233d = z10;
    }

    public static ChangeSize f(ChangeSize changeSize, androidx.compose.ui.c cVar, ed.l lVar, androidx.compose.animation.core.U u10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = changeSize.f87230a;
        }
        if ((i10 & 2) != 0) {
            lVar = changeSize.f87231b;
        }
        if ((i10 & 4) != 0) {
            u10 = changeSize.f87232c;
        }
        if ((i10 & 8) != 0) {
            z10 = changeSize.f87233d;
        }
        changeSize.getClass();
        return new ChangeSize(cVar, lVar, u10, z10);
    }

    @NotNull
    public final androidx.compose.ui.c a() {
        return this.f87230a;
    }

    @NotNull
    public final ed.l<k0.x, k0.x> b() {
        return this.f87231b;
    }

    @NotNull
    public final androidx.compose.animation.core.U<k0.x> c() {
        return this.f87232c;
    }

    public final boolean d() {
        return this.f87233d;
    }

    @NotNull
    public final ChangeSize e(@NotNull androidx.compose.ui.c cVar, @NotNull ed.l<? super k0.x, k0.x> lVar, @NotNull androidx.compose.animation.core.U<k0.x> u10, boolean z10) {
        return new ChangeSize(cVar, lVar, u10, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) obj;
        return kotlin.jvm.internal.G.g(this.f87230a, changeSize.f87230a) && kotlin.jvm.internal.G.g(this.f87231b, changeSize.f87231b) && kotlin.jvm.internal.G.g(this.f87232c, changeSize.f87232c) && this.f87233d == changeSize.f87233d;
    }

    @NotNull
    public final androidx.compose.ui.c g() {
        return this.f87230a;
    }

    @NotNull
    public final androidx.compose.animation.core.U<k0.x> h() {
        return this.f87232c;
    }

    public int hashCode() {
        return C1635o.a(this.f87233d) + ((this.f87232c.hashCode() + ((this.f87231b.hashCode() + (this.f87230a.hashCode() * 31)) * 31)) * 31);
    }

    public final boolean i() {
        return this.f87233d;
    }

    @NotNull
    public final ed.l<k0.x, k0.x> j() {
        return this.f87231b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeSize(alignment=");
        sb2.append(this.f87230a);
        sb2.append(", size=");
        sb2.append(this.f87231b);
        sb2.append(", animationSpec=");
        sb2.append(this.f87232c);
        sb2.append(", clip=");
        return C1636p.a(sb2, this.f87233d, ')');
    }

    public /* synthetic */ ChangeSize(androidx.compose.ui.c cVar, ed.l lVar, androidx.compose.animation.core.U u10, boolean z10, int i10, C4969v c4969v) {
        this(cVar, (i10 & 2) != 0 ? new ed.l<k0.x, k0.x>() { // from class: androidx.compose.animation.ChangeSize.1
            public final long e(long j10) {
                return k0.y.a(0, 0);
            }

            @Override // ed.l
            public k0.x invoke(k0.x xVar) {
                long j10 = xVar.f214340a;
                return new k0.x(k0.y.a(0, 0));
            }
        } : lVar, u10, (i10 & 8) != 0 ? true : z10);
    }
}
