package androidx.compose.material.ripple;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.i;
import androidx.compose.runtime.internal.r;
import ed.InterfaceC4376a;
import jd.C4806d;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class k extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f98886g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f98887h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f98888i = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public o f98891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Boolean f98892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Long f98893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Runnable f98894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<L0> f98895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f98885f = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final int[] f98889j = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final int[] f98890k = new int[0];

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public k(@NotNull Context context) {
        super(context);
    }

    public static final void h(k kVar) {
        o oVar = kVar.f98891a;
        if (oVar != null) {
            oVar.setState(f98890k);
        }
        kVar.f98894d = null;
    }

    public final void b(@NotNull i.b bVar, boolean z10, long j10, int i10, long j11, float f10, @NotNull InterfaceC4376a<L0> interfaceC4376a) {
        if (this.f98891a == null || !Boolean.valueOf(z10).equals(this.f98892b)) {
            c(z10);
            this.f98892b = Boolean.valueOf(z10);
        }
        o oVar = this.f98891a;
        G.m(oVar);
        this.f98895e = interfaceC4376a;
        oVar.c(i10);
        f(j10, j11, f10);
        if (z10) {
            oVar.setHotspot(P.g.p(bVar.f90157a), P.g.r(bVar.f90157a));
        } else {
            oVar.setHotspot(oVar.getBounds().centerX(), oVar.getBounds().centerY());
        }
        g(true);
    }

    public final void c(boolean z10) {
        o oVar = new o(z10);
        setBackground(oVar);
        this.f98891a = oVar;
    }

    public final void d() {
        this.f98895e = null;
        Runnable runnable = this.f98894d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f98894d;
            G.m(runnable2);
            runnable2.run();
        } else {
            o oVar = this.f98891a;
            if (oVar != null) {
                oVar.setState(f98890k);
            }
        }
        o oVar2 = this.f98891a;
        if (oVar2 == null) {
            return;
        }
        oVar2.setVisible(false, false);
        unscheduleDrawable(oVar2);
    }

    public final void e() {
        g(false);
    }

    public final void f(long j10, long j11, float f10) {
        o oVar = this.f98891a;
        if (oVar == null) {
            return;
        }
        oVar.b(j11, f10);
        Rect rect = new Rect(0, 0, C4806d.L0(P.n.t(j10)), C4806d.L0(P.n.m(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        oVar.setBounds(rect);
    }

    public final void g(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f98894d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f98893c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f98889j : f98890k;
            o oVar = this.f98891a;
            if (oVar != null) {
                oVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: androidx.compose.material.ripple.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.h(this.f98884a);
                }
            };
            this.f98894d = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f98893c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable drawable) {
        InterfaceC4376a<L0> interfaceC4376a = this.f98895e;
        if (interfaceC4376a != null) {
            interfaceC4376a.invoke();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
