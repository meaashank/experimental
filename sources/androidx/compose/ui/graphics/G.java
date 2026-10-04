package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.graphics.L2;
import java.util.List;
import kotlin.InterfaceC4850b0;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,435:1\n38#2,5:436\n38#2,5:441\n33#3,6:446\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:436,5\n242#1:441,5\n319#1:446,6\n*E\n"})
@InterfaceC4850b0
public final class G implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Canvas f100692a = H.f100712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Rect f100693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Rect f100694c;

    @InterfaceC4850b0
    public static /* synthetic */ void J() {
    }

    @Override // androidx.compose.ui.graphics.C0
    public void A() {
        this.f100692a.save();
    }

    @Override // androidx.compose.ui.graphics.C0
    public void B(@NotNull float[] fArr) {
        if (C2090o2.c(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        W.a(matrix, fArr);
        this.f100692a.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void C(@NotNull Path path, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        Canvas canvas = this.f100692a;
        if (!(path instanceof Z)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((Z) path).f100925b, interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public void D(long j10, float f10, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        this.f100692a.drawCircle(P.g.p(j10), P.g.r(j10), f10, interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public void E(float f10, float f11, float f12, float f13, float f14, float f15, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        this.f100692a.drawRoundRect(f10, f11, f12, f13, f14, f15, interfaceC2105s2.B());
    }

    public final void F(List<P.g> list, InterfaceC2105s2 interfaceC2105s2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            long j10 = list.get(i10).f65507a;
            this.f100692a.drawPoint(P.g.p(j10), P.g.r(j10), interfaceC2105s2.B());
        }
    }

    public final void G(float[] fArr, InterfaceC2105s2 interfaceC2105s2, int i10) {
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        Paint paintB = interfaceC2105s2.B();
        int i11 = 0;
        while (i11 < fArr.length - 3) {
            this.f100692a.drawLine(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], paintB);
            i11 += i10 * 2;
        }
    }

    public final void H(float[] fArr, InterfaceC2105s2 interfaceC2105s2, int i10) {
        if (fArr.length % 2 == 0) {
            Paint paintB = interfaceC2105s2.B();
            int i11 = 0;
            while (i11 < fArr.length - 1) {
                this.f100692a.drawPoint(fArr[i11], fArr[i11 + 1], paintB);
                i11 += i10;
            }
        }
    }

    @NotNull
    public final Canvas I() {
        return this.f100692a;
    }

    public final void K(@NotNull Canvas canvas) {
        this.f100692a = canvas;
    }

    @NotNull
    public final Region.Op L(int i10) {
        J0.f100729b.getClass();
        return i10 == J0.f100730c ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    public final void a(List<P.g> list, InterfaceC2105s2 interfaceC2105s2, int i10) {
        if (list.size() >= 2) {
            Paint paintB = interfaceC2105s2.B();
            int i11 = 0;
            while (i11 < list.size() - 1) {
                long j10 = list.get(i11).f65507a;
                long j11 = list.get(i11 + 1).f65507a;
                this.f100692a.drawLine(P.g.p(j10), P.g.r(j10), P.g.p(j11), P.g.r(j11), paintB);
                i11 += i10;
            }
        }
    }

    @Override // androidx.compose.ui.graphics.C0
    public void b(float f10, float f11, float f12, float f13, int i10) {
        this.f100692a.clipRect(f10, f11, f12, f13, L(i10));
    }

    @Override // androidx.compose.ui.graphics.C0
    public void c(float f10, float f11) {
        this.f100692a.translate(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void d(@NotNull Path path, int i10) {
        Canvas canvas = this.f100692a;
        if (!(path instanceof Z)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((Z) path).f100925b, L(i10));
    }

    @Override // androidx.compose.ui.graphics.C0
    public void e(int i10, @NotNull List<P.g> list, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        L2.a aVar = L2.f100756b;
        aVar.getClass();
        if (i10 == L2.f100758d) {
            a(list, interfaceC2105s2, 2);
            return;
        }
        aVar.getClass();
        if (i10 == L2.f100759e) {
            a(list, interfaceC2105s2, 1);
            return;
        }
        aVar.getClass();
        if (i10 == L2.f100757c) {
            F(list, interfaceC2105s2);
        }
    }

    @Override // androidx.compose.ui.graphics.C0
    public void f(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        if (this.f100693b == null) {
            this.f100693b = new Rect();
            this.f100694c = new Rect();
        }
        Canvas canvas = this.f100692a;
        Bitmap bitmapB = V.b(interfaceC2025e2);
        Rect rect = this.f100693b;
        kotlin.jvm.internal.G.m(rect);
        int i10 = (int) (j10 >> 32);
        rect.left = i10;
        int i11 = (int) (j10 & ZipKt.f225990j);
        rect.top = i11;
        rect.right = i10 + ((int) (j11 >> 32));
        rect.bottom = i11 + ((int) (j11 & ZipKt.f225990j));
        Rect rect2 = this.f100694c;
        kotlin.jvm.internal.G.m(rect2);
        int i12 = (int) (j12 >> 32);
        rect2.left = i12;
        int i13 = (int) (j12 & ZipKt.f225990j);
        rect2.top = i13;
        rect2.right = i12 + ((int) (j13 >> 32));
        rect2.bottom = i13 + ((int) (j13 & ZipKt.f225990j));
        canvas.drawBitmap(bitmapB, rect, rect2, interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public void g(int i10, @NotNull float[] fArr, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        if (fArr.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        L2.a aVar = L2.f100756b;
        aVar.getClass();
        if (i10 == L2.f100758d) {
            G(fArr, interfaceC2105s2, 2);
            return;
        }
        aVar.getClass();
        if (i10 == L2.f100759e) {
            G(fArr, interfaceC2105s2, 1);
            return;
        }
        aVar.getClass();
        if (i10 == L2.f100757c) {
            H(fArr, interfaceC2105s2, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.C0
    public void h(@NotNull Vertices vertices, int i10, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        Canvas canvas = this.f100692a;
        Canvas.VertexMode vertexModeA = C2080m0.a(vertices.f100865a);
        float[] fArr = vertices.f100866b;
        int length = fArr.length;
        float[] fArr2 = vertices.f100867c;
        int[] iArr = vertices.f100868d;
        short[] sArr = vertices.f100869e;
        canvas.drawVertices(vertexModeA, length, fArr, 0, fArr2, 0, iArr, 0, sArr, 0, sArr.length, interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public void i(@NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        this.f100692a.saveLayer(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d, interfaceC2105s2.B(), 31);
    }

    @Override // androidx.compose.ui.graphics.C0
    public /* synthetic */ void j(P.j jVar, float f10, float f11, boolean z10, InterfaceC2105s2 interfaceC2105s2) {
        B0.b(this, jVar, f10, f11, z10, interfaceC2105s2);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void k(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        this.f100692a.drawArc(f10, f11, f12, f13, f14, f15, z10, interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public /* synthetic */ void l(P.j jVar, int i10) {
        B0.a(this, jVar, i10);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void m() {
        F0.f100681a.a(this.f100692a, false);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void n(float f10, float f11) {
        this.f100692a.scale(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void o(float f10, float f11, float f12, float f13, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        this.f100692a.drawRect(f10, f11, f12, f13, interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public void p(float f10, float f11, float f12, float f13, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        this.f100692a.drawOval(f10, f11, f12, f13, interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public void q(@NotNull InterfaceC2025e2 interfaceC2025e2, long j10, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        this.f100692a.drawBitmap(V.b(interfaceC2025e2), P.g.p(j10), P.g.r(j10), interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public void r() {
        this.f100692a.restore();
    }

    @Override // androidx.compose.ui.graphics.C0
    public /* synthetic */ void s(P.j jVar, InterfaceC2105s2 interfaceC2105s2) {
        B0.e(this, jVar, interfaceC2105s2);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void t() {
        F0.f100681a.a(this.f100692a, true);
    }

    @Override // androidx.compose.ui.graphics.C0
    public /* synthetic */ void u(P.j jVar, float f10, float f11, boolean z10, InterfaceC2105s2 interfaceC2105s2) {
        B0.c(this, jVar, f10, f11, z10, interfaceC2105s2);
    }

    @Override // androidx.compose.ui.graphics.C0
    public /* synthetic */ void v(P.j jVar, InterfaceC2105s2 interfaceC2105s2) {
        B0.d(this, jVar, interfaceC2105s2);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void w(long j10, long j11, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        this.f100692a.drawLine(P.g.p(j10), P.g.r(j10), P.g.p(j11), P.g.r(j11), interfaceC2105s2.B());
    }

    @Override // androidx.compose.ui.graphics.C0
    public /* synthetic */ void x(float f10, float f11) {
        B0.f(this, f10, f11);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void y(float f10) {
        this.f100692a.rotate(f10);
    }

    @Override // androidx.compose.ui.graphics.C0
    public void z(float f10, float f11) {
        this.f100692a.skew(f10, f11);
    }
}
