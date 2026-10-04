package androidx.compose.ui.draganddrop;

import P.n;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.C0;
import androidx.compose.ui.graphics.G;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.unit.LayoutDirection;
import ed.l;
import k0.InterfaceC4814e;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nComposeDragShadowBuilder.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,63:1\n546#2,17:64\n*S KotlinDebug\n*F\n+ 1 ComposeDragShadowBuilder.android.kt\nandroidx/compose/ui/draganddrop/ComposeDragShadowBuilder\n*L\n54#1:64,17\n*E\n"})
@r(parameters = 1)
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100456d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4814e f100457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l<androidx.compose.ui.graphics.drawscope.h, L0> f100459c;

    public /* synthetic */ a(InterfaceC4814e interfaceC4814e, long j10, l lVar, C4969v c4969v) {
        this(interfaceC4814e, j10, lVar);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(@NotNull Canvas canvas) {
        androidx.compose.ui.graphics.drawscope.a aVar = new androidx.compose.ui.graphics.drawscope.a();
        InterfaceC4814e interfaceC4814e = this.f100457a;
        long j10 = this.f100458b;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        C0 c0B = H.b(canvas);
        l<androidx.compose.ui.graphics.drawscope.h, L0> lVar = this.f100459c;
        a.C0251a c0251a = aVar.f101067a;
        InterfaceC4814e interfaceC4814e2 = c0251a.f101071a;
        LayoutDirection layoutDirection2 = c0251a.f101072b;
        C0 c02 = c0251a.f101073c;
        long j11 = c0251a.f101074d;
        c0251a.f101071a = interfaceC4814e;
        c0251a.f101072b = layoutDirection;
        c0251a.f101073c = c0B;
        c0251a.f101074d = j10;
        G g10 = (G) c0B;
        g10.A();
        lVar.invoke(aVar);
        g10.r();
        a.C0251a c0251a2 = aVar.f101067a;
        c0251a2.f101071a = interfaceC4814e2;
        c0251a2.f101072b = layoutDirection2;
        c0251a2.f101073c = c02;
        c0251a2.f101074d = j11;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(@NotNull Point point, @NotNull Point point2) {
        InterfaceC4814e interfaceC4814e = this.f100457a;
        point.set(interfaceC4814e.I1(interfaceC4814e.W(n.t(this.f100458b))), interfaceC4814e.I1(interfaceC4814e.W(n.m(this.f100458b))));
        point2.set(point.x / 2, point.y / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(InterfaceC4814e interfaceC4814e, long j10, l<? super androidx.compose.ui.graphics.drawscope.h, L0> lVar) {
        this.f100457a = interfaceC4814e;
        this.f100458b = j10;
        this.f100459c = lVar;
    }
}
