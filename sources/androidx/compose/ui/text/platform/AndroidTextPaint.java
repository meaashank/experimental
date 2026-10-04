package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.X1;
import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.C2113u2;
import androidx.compose.ui.graphics.InterfaceC2105s2;
import androidx.compose.ui.graphics.M0;
import androidx.compose.ui.graphics.X;
import androidx.compose.ui.graphics.a3;
import androidx.compose.ui.graphics.drawscope.h;
import androidx.compose.ui.text.style.j;
import e.f0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,203:1\n1#2:204\n696#3:205\n198#4:206\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n105#1:205\n131#1:206\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class AndroidTextPaint extends TextPaint {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f104892i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC2105s2 f104893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public androidx.compose.ui.text.style.j f104894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public a3 f104896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AbstractC2131z0 f104897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public X1<? extends Shader> f104898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public P.n f104899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public androidx.compose.ui.graphics.drawscope.k f104900h;

    public AndroidTextPaint(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        androidx.compose.ui.text.style.j.f105017b.getClass();
        this.f104894b = androidx.compose.ui.text.style.j.f105019d;
        androidx.compose.ui.graphics.drawscope.h.f101080P2.getClass();
        this.f104895c = h.a.f101082b;
        a3.f100930d.getClass();
        this.f104896d = a3.f100931e;
    }

    @f0
    public static /* synthetic */ void d() {
    }

    @f0
    public static /* synthetic */ void f() {
    }

    @f0
    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void n(AndroidTextPaint androidTextPaint, AbstractC2131z0 abstractC2131z0, long j10, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = Float.NaN;
        }
        androidTextPaint.m(abstractC2131z0, j10, f10);
    }

    public final void a() {
        this.f104898f = null;
        this.f104897e = null;
        this.f104899g = null;
        setShader(null);
    }

    public final int b() {
        return this.f104895c;
    }

    @Nullable
    public final AbstractC2131z0 c() {
        return this.f104897e;
    }

    @Nullable
    public final P.n e() {
        return this.f104899g;
    }

    public final InterfaceC2105s2 g() {
        InterfaceC2105s2 interfaceC2105s2 = this.f104893a;
        if (interfaceC2105s2 != null) {
            return interfaceC2105s2;
        }
        X x10 = new X(this);
        this.f104893a = x10;
        return x10;
    }

    @Nullable
    public final X1<Shader> h() {
        return this.f104898f;
    }

    @NotNull
    public final a3 i() {
        return this.f104896d;
    }

    public final void k(int i10) {
        if (i10 == this.f104895c) {
            return;
        }
        g().b(i10);
        this.f104895c = i10;
    }

    public final void l(@Nullable AbstractC2131z0 abstractC2131z0) {
        this.f104897e = abstractC2131z0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(@org.jetbrains.annotations.Nullable final androidx.compose.ui.graphics.AbstractC2131z0 r5, final long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.a()
            return
        L6:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.d3
            if (r0 == 0) goto L16
            androidx.compose.ui.graphics.d3 r5 = (androidx.compose.ui.graphics.d3) r5
            long r5 = r5.f101064c
            long r5 = androidx.compose.ui.text.style.l.c(r5, r8)
            r4.p(r5)
            return
        L16:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.Y2
            if (r0 == 0) goto L67
            androidx.compose.ui.graphics.z0 r0 = r4.f104897e
            boolean r0 = kotlin.jvm.internal.G.g(r0, r5)
            r1 = 0
            if (r0 == 0) goto L31
            P.n r0 = r4.f104899g
            if (r0 != 0) goto L29
            r0 = r1
            goto L2f
        L29:
            long r2 = r0.f65530a
            boolean r0 = P.n.k(r2, r6)
        L2f:
            if (r0 != 0) goto L51
        L31:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            r1 = 1
        L3b:
            if (r1 == 0) goto L51
            r4.f104897e = r5
            P.n r0 = new P.n
            r0.<init>(r6)
            r4.f104899g = r0
            androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1 r0 = new androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
            r0.<init>()
            androidx.compose.runtime.X1 r5 = androidx.compose.runtime.K1.d(r0)
            r4.f104898f = r5
        L51:
            androidx.compose.ui.graphics.s2 r5 = r4.g()
            androidx.compose.runtime.X1<? extends android.graphics.Shader> r6 = r4.f104898f
            if (r6 == 0) goto L60
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L61
        L60:
            r6 = 0
        L61:
            r5.L(r6)
            androidx.compose.ui.text.platform.l.a(r4, r8)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidTextPaint.m(androidx.compose.ui.graphics.z0, long, float):void");
    }

    public final void o(@Nullable P.n nVar) {
        this.f104899g = nVar;
    }

    public final void p(long j10) {
        if (j10 != 16) {
            setColor(M0.t(j10));
            a();
        }
    }

    public final void q(@Nullable androidx.compose.ui.graphics.drawscope.k kVar) {
        if (kVar == null || G.g(this.f104900h, kVar)) {
            return;
        }
        this.f104900h = kVar;
        if (kVar.equals(androidx.compose.ui.graphics.drawscope.p.f101084a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (kVar instanceof androidx.compose.ui.graphics.drawscope.q) {
            InterfaceC2105s2 interfaceC2105s2G = g();
            C2113u2.f101431b.getClass();
            interfaceC2105s2G.F(C2113u2.f101433d);
            androidx.compose.ui.graphics.drawscope.q qVar = (androidx.compose.ui.graphics.drawscope.q) kVar;
            g().G(qVar.f101090a);
            g().D(qVar.f101091b);
            g().x(qVar.f101093d);
            g().u(qVar.f101092c);
            g().J(qVar.f101094e);
        }
    }

    public final void r(@Nullable X1<? extends Shader> x12) {
        this.f104898f = x12;
    }

    public final void s(@Nullable a3 a3Var) {
        if (a3Var == null || G.g(this.f104896d, a3Var)) {
            return;
        }
        this.f104896d = a3Var;
        a3.f100930d.getClass();
        if (G.g(a3Var, a3.f100931e)) {
            clearShadowLayer();
        } else {
            setShadowLayer(androidx.compose.ui.text.platform.extensions.e.c(this.f104896d.f100934c), P.g.p(this.f104896d.f100933b), P.g.r(this.f104896d.f100933b), M0.t(this.f104896d.f100932a));
        }
    }

    public final void t(@NotNull a3 a3Var) {
        this.f104896d = a3Var;
    }

    public final void u(@Nullable androidx.compose.ui.text.style.j jVar) {
        if (jVar == null || G.g(this.f104894b, jVar)) {
            return;
        }
        this.f104894b = jVar;
        j.a aVar = androidx.compose.ui.text.style.j.f105017b;
        aVar.getClass();
        setUnderlineText(jVar.d(androidx.compose.ui.text.style.j.f105020e));
        androidx.compose.ui.text.style.j jVar2 = this.f104894b;
        aVar.getClass();
        setStrikeThruText(jVar2.d(androidx.compose.ui.text.style.j.f105021f));
    }
}
