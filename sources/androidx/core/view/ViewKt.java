package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ed.InterfaceC4376a;
import kotlin.sequences.C5004q;
import kotlin.sequences.InterfaceC5000m;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,415:1\n37#1,2:416\n55#1:418\n327#1,4:422\n42#2,3:419\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n70#1:416,2\n70#1:418\n311#1:422,4\n233#1:419,3\n*E\n"})
public final class ViewKt {

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f111697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<View, kotlin.L0> f111698b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(View view, ed.l<? super View, kotlin.L0> lVar) {
            this.f111697a = view;
            this.f111698b = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f111697a.removeOnAttachStateChangeListener(this);
            this.f111698b.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f111703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<View, kotlin.L0> f111704b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view, ed.l<? super View, kotlin.L0> lVar) {
            this.f111703a = view;
            this.f111704b = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f111703a.removeOnAttachStateChangeListener(this);
            this.f111704b.invoke(view);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,52:1\n70#2:53\n*E\n"})
    public static final class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l f111705a;

        public c(ed.l lVar) {
            this.f111705a = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f111705a.invoke(view);
        }
    }

    public static final class d implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l<View, kotlin.L0> f111706a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(ed.l<? super View, kotlin.L0> lVar) {
            this.f111706a = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f111706a.invoke(view);
        }
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l<View, kotlin.L0> f111707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f111708b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(ed.l<? super View, kotlin.L0> lVar, View view) {
            this.f111707a = lVar;
            this.f111708b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f111707a.invoke(this.f111708b);
        }
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<kotlin.L0> f111709a;

        public f(InterfaceC4376a<kotlin.L0> interfaceC4376a) {
            this.f111709a = interfaceC4376a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f111709a.invoke();
        }
    }

    public static final void A(@NotNull View view, @NotNull ed.l<? super ViewGroup.LayoutParams, kotlin.L0> lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @dd.j(name = "updateLayoutParamsTyped")
    public static final <T extends ViewGroup.LayoutParams> void B(View view, ed.l<? super T, kotlin.L0> lVar) {
        view.getLayoutParams();
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public static final void C(@NotNull View view, @e.P int i10, @e.P int i11, @e.P int i12, @e.P int i13) {
        view.setPadding(i10, i11, i12, i13);
    }

    public static /* synthetic */ void D(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingLeft();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingRight();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        view.setPadding(i10, i11, i12, i13);
    }

    public static final void E(@NotNull View view, @e.P int i10, @e.P int i11, @e.P int i12, @e.P int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static /* synthetic */ void F(View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = view.getPaddingStart();
        }
        if ((i14 & 2) != 0) {
            i11 = view.getPaddingTop();
        }
        if ((i14 & 4) != 0) {
            i12 = view.getPaddingEnd();
        }
        if ((i14 & 8) != 0) {
            i13 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static void a(InterfaceC4376a interfaceC4376a) {
        interfaceC4376a.invoke();
    }

    public static final void b(@NotNull View view, @NotNull ed.l<? super View, kotlin.L0> lVar) {
        if (view.isAttachedToWindow()) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new a(view, lVar));
        }
    }

    public static final void c(@NotNull View view, @NotNull ed.l<? super View, kotlin.L0> lVar) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new b(view, lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void d(@NotNull View view, @NotNull ed.l<? super View, kotlin.L0> lVar) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new c(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void e(@NotNull View view, @NotNull ed.l<? super View, kotlin.L0> lVar) {
        view.addOnLayoutChangeListener(new d(lVar));
    }

    @NotNull
    public static final ViewTreeObserverOnPreDrawListenerC2459h0 f(@NotNull View view, @NotNull ed.l<? super View, kotlin.L0> lVar) {
        return ViewTreeObserverOnPreDrawListenerC2459h0.a(view, new e(lVar, view));
    }

    @NotNull
    public static final Bitmap g(@NotNull View view, @NotNull Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap h(View view, Bitmap.Config config, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return g(view, config);
    }

    @NotNull
    public static final InterfaceC5000m<View> i(@NotNull View view) {
        return C5004q.b(new ViewKt$allViews$1(view, null));
    }

    @NotNull
    public static final InterfaceC5000m<ViewParent> j(@NotNull View view) {
        return SequencesKt__SequencesKt.v(view.getParent(), ViewKt$ancestors$1.f111702a);
    }

    public static final int k(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int l(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int m(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int n(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int o(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int p(@NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean q(@NotNull View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean r(@NotNull View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean s(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    @NotNull
    public static final Runnable t(@NotNull View view, long j10, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        f fVar = new f(interfaceC4376a);
        view.postDelayed(fVar, j10);
        return fVar;
    }

    @NotNull
    public static final Runnable u(@NotNull View view, long j10, @NotNull final InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.F0
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC4376a.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j10);
        return runnable;
    }

    public static final void v(InterfaceC4376a interfaceC4376a) {
        interfaceC4376a.invoke();
    }

    public static final void w(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 8 : 0);
    }

    public static final void x(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 4 : 0);
    }

    public static final void y(@NotNull View view, @e.P int i10) {
        view.setPadding(i10, i10, i10, i10);
    }

    public static final void z(@NotNull View view, boolean z10) {
        view.setVisibility(z10 ? 0 : 8);
    }
}
