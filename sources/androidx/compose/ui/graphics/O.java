package androidx.compose.ui.graphics;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.graphics.layer.C2058e;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import e.InterfaceC4345t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidGraphicsContext.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsContext.android.kt\nandroidx/compose/ui/graphics/AndroidGraphicsContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
public final class O implements X1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final c f100771h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f100772i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f100773j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ViewGroup f100774a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public R.a f100777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f100778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f100779f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Object f100775b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.graphics.layer.H f100776c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ComponentCallbacks2 f100780g = null;

    public static final class a implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: androidx.compose.ui.graphics.O$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0248a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ O f100782a;

            public ViewTreeObserverOnPreDrawListenerC0248a(O o10) {
                this.f100782a = o10;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                this.f100782a.f100776c.l();
                this.f100782a.f100774a.getViewTreeObserver().removeOnPreDrawListener(this);
                this.f100782a.f100779f = false;
                return true;
            }
        }

        public a() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 >= 40) {
                O o10 = O.this;
                if (o10.f100779f) {
                    return;
                }
                o10.f100776c.d();
                O.this.f100774a.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0248a(O.this));
                O.this.f100779f = true;
            }
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            O.this.n(view.getContext());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            O.this.o(view.getContext());
            O.this.f100776c.d();
        }
    }

    public static final class c {
        public c() {
        }

        public final boolean a() {
            return O.f100772i;
        }

        public final void b(boolean z10) {
            O.f100772i = z10;
        }

        public c(C4969v c4969v) {
        }
    }

    @e.T(29)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f100784a = new d();

        @dd.o
        @InterfaceC4345t
        public static final long a(@NotNull View view) {
            return view.getUniqueDrawingId();
        }
    }

    public O(@NotNull ViewGroup viewGroup) {
        this.f100774a = viewGroup;
    }

    @Override // androidx.compose.ui.graphics.X1
    @NotNull
    public GraphicsLayer a() {
        GraphicsLayerImpl e10;
        GraphicsLayer graphicsLayer;
        synchronized (this.f100775b) {
            try {
                long jK = k(this.f100774a);
                if (Build.VERSION.SDK_INT >= 29) {
                    e10 = new androidx.compose.ui.graphics.layer.D(jK, null, null, 6, null);
                } else if (f100772i) {
                    try {
                        e10 = new C2058e(this.f100774a, jK, null, null, 12, null);
                    } catch (Throwable unused) {
                        f100772i = false;
                        e10 = new androidx.compose.ui.graphics.layer.E(m(this.f100774a), jK, null, null, 12, null);
                    }
                } else {
                    e10 = new androidx.compose.ui.graphics.layer.E(m(this.f100774a), jK, null, null, 12, null);
                }
                graphicsLayer = new GraphicsLayer(e10, this.f100776c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return graphicsLayer;
    }

    @Override // androidx.compose.ui.graphics.X1
    public void b(@NotNull GraphicsLayer graphicsLayer) {
        synchronized (this.f100775b) {
            graphicsLayer.R();
        }
    }

    public final long k(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(view);
        }
        return -1L;
    }

    public final boolean l() {
        androidx.compose.ui.graphics.layer.H h10 = this.f100776c;
        if (h10 != null) {
            return h10.g();
        }
        return false;
    }

    public final R.a m(ViewGroup viewGroup) {
        R.a aVar = this.f100777d;
        if (aVar != null) {
            return aVar;
        }
        R.c cVar = new R.c(viewGroup.getContext());
        viewGroup.addView(cVar);
        this.f100777d = cVar;
        return cVar;
    }

    public final void n(Context context) {
        if (this.f100778e) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.f100780g);
        this.f100778e = true;
    }

    public final void o(Context context) {
        if (this.f100778e) {
            context.getApplicationContext().unregisterComponentCallbacks(this.f100780g);
            this.f100778e = false;
        }
    }
}
