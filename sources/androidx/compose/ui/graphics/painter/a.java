package androidx.compose.ui.graphics.painter;

import P.n;
import androidx.collection.C1550p;
import androidx.compose.ui.graphics.InterfaceC2025e2;
import androidx.compose.ui.graphics.L0;
import androidx.compose.ui.graphics.U1;
import androidx.compose.ui.graphics.drawscope.DrawScope$CC;
import androidx.compose.ui.graphics.drawscope.h;
import k0.t;
import k0.x;
import k0.y;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,159:1\n26#2:160\n26#2:161\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n*L\n98#1:160\n99#1:161\n*E\n"})
public final class a extends Painter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final InterfaceC2025e2 f101375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f101376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f101377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f101378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f101379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f101380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public L0 f101381m;

    public /* synthetic */ a(InterfaceC2025e2 interfaceC2025e2, long j10, long j11, C4969v c4969v) {
        this(interfaceC2025e2, j10, j11);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean a(float f10) {
        this.f101380l = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean b(@Nullable L0 l02) {
        this.f101381m = l02;
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f101375g, aVar.f101375g) && t.j(this.f101376h, aVar.f101376h) && x.h(this.f101377i, aVar.f101377i) && this.f101378j == aVar.f101378j;
    }

    public int hashCode() {
        return ((C1550p.a(this.f101377i) + ((C1550p.a(this.f101376h) + (this.f101375g.hashCode() * 31)) * 31)) * 31) + this.f101378j;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long i() {
        return y.h(this.f101379k);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void k(@NotNull h hVar) {
        DrawScope$CC.B(hVar, this.f101375g, this.f101376h, this.f101377i, 0L, y.a(Math.round(n.t(hVar.e())), Math.round(n.m(hVar.e()))), this.f101380l, null, this.f101381m, 0, this.f101378j, 328, null);
    }

    public final int l() {
        return this.f101378j;
    }

    public final void m(int i10) {
        this.f101378j = i10;
    }

    public final long n(long j10, long j11) {
        int i10;
        int i11;
        if (((int) (j10 >> 32)) < 0 || ((int) (j10 & ZipKt.f225990j)) < 0 || (i10 = (int) (j11 >> 32)) < 0 || (i11 = (int) (ZipKt.f225990j & j11)) < 0 || i10 > this.f101375g.getWidth() || i11 > this.f101375g.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j11;
    }

    @NotNull
    public String toString() {
        return "BitmapPainter(image=" + this.f101375g + ", srcOffset=" + ((Object) t.u(this.f101376h)) + ", srcSize=" + ((Object) x.p(this.f101377i)) + ", filterQuality=" + ((Object) U1.k(this.f101378j)) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(InterfaceC2025e2 interfaceC2025e2, long j10, long j11, int i10, C4969v c4969v) {
        if ((i10 & 2) != 0) {
            t.f214328b.getClass();
            j10 = t.f214329c;
        }
        this(interfaceC2025e2, j10, (i10 & 4) != 0 ? y.a(interfaceC2025e2.getWidth(), interfaceC2025e2.getHeight()) : j11);
    }

    public a(InterfaceC2025e2 interfaceC2025e2, long j10, long j11) {
        this.f101375g = interfaceC2025e2;
        this.f101376h = j10;
        this.f101377i = j11;
        U1.f100844b.getClass();
        this.f101378j = U1.f100846d;
        n(j10, j11);
        this.f101379k = j11;
        this.f101380l = 1.0f;
    }
}
