package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC1974w;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1926l;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.InterfaceC1971v;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import ed.InterfaceC4376a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeView.android.kt\nandroidx/compose/ui/platform/AbstractComposeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,461:1\n1#2:462\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class AbstractComposeView extends ViewGroup {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f103132i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public WeakReference<AbstractC1974w> f103133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public IBinder f103134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC1971v f103135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public AbstractC1974w f103136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC4376a<kotlin.L0> f103137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f103138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f103139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f103140h;

    @dd.k
    public AbstractComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ void i() {
    }

    @androidx.compose.ui.j
    public static /* synthetic */ void m() {
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view) {
        e();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        e();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    @androidx.compose.ui.v
    @InterfaceC1917i
    public abstract void c(@Nullable InterfaceC1946s interfaceC1946s, int i10);

    public final AbstractC1974w d(AbstractC1974w abstractC1974w) {
        AbstractC1974w abstractC1974w2 = p(abstractC1974w) ? abstractC1974w : null;
        if (abstractC1974w2 != null) {
            this.f103133a = new WeakReference<>(abstractC1974w2);
        }
        return abstractC1974w;
    }

    public final void e() {
        if (this.f103139g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void f() {
        if (this.f103136d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        h();
    }

    public final void g() {
        InterfaceC1971v interfaceC1971v = this.f103135c;
        if (interfaceC1971v != null) {
            interfaceC1971v.dispose();
        }
        this.f103135c = null;
        requestLayout();
    }

    public final void h() {
        if (this.f103135c == null) {
            try {
                this.f103139g = true;
                this.f103135c = V1.c(this, q(), new ComposableLambdaImpl(-656146368, true, new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @InterfaceC1917i
                    @InterfaceC1926l(applier = "androidx.compose.ui.UiComposable")
                    public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
                        if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                            interfaceC1946s.o();
                            return;
                        }
                        if (C1968u.c0()) {
                            C1968u.p0(-656146368, i10, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)");
                        }
                        this.f103141d.c(interfaceC1946s, 0);
                        if (C1968u.c0()) {
                            C1968u.o0();
                        }
                    }

                    @Override // ed.p
                    public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC1946s interfaceC1946s, Integer num) {
                        e(interfaceC1946s, num.intValue());
                        return kotlin.L0.f217464a;
                    }
                }));
            } finally {
                this.f103139g = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f103140h || super.isTransitionGroup();
    }

    public final boolean j() {
        return this.f103135c != null;
    }

    public boolean k() {
        return true;
    }

    public final boolean l() {
        return this.f103138f;
    }

    public void n(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void o(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(getWindowToken());
        if (k()) {
            h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        h();
        o(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final boolean p(AbstractC1974w abstractC1974w) {
        return !(abstractC1974w instanceof Recomposer) || ((Recomposer) abstractC1974w).f99248v.getValue().compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    public final AbstractC1974w q() {
        AbstractC1974w abstractC1974w;
        AbstractC1974w abstractC1974wD = this.f103136d;
        if (abstractC1974wD == null) {
            abstractC1974wD = WindowRecomposer_androidKt.d(this);
            AbstractC1974w abstractC1974w2 = null;
            if (abstractC1974wD != null) {
                d(abstractC1974wD);
            } else {
                abstractC1974wD = null;
            }
            if (abstractC1974wD == null) {
                WeakReference<AbstractC1974w> weakReference = this.f103133a;
                if (weakReference != null && (abstractC1974w = weakReference.get()) != null && p(abstractC1974w)) {
                    abstractC1974w2 = abstractC1974w;
                }
                if (abstractC1974w2 != null) {
                    return abstractC1974w2;
                }
                Recomposer recomposerH = WindowRecomposer_androidKt.h(this);
                d(recomposerH);
                return recomposerH;
            }
        }
        return abstractC1974wD;
    }

    public final void r(@Nullable AbstractC1974w abstractC1974w) {
        s(abstractC1974w);
    }

    public final void s(AbstractC1974w abstractC1974w) {
        if (this.f103136d != abstractC1974w) {
            this.f103136d = abstractC1974w;
            if (abstractC1974w != null) {
                this.f103133a = null;
            }
            InterfaceC1971v interfaceC1971v = this.f103135c;
            if (interfaceC1971v != null) {
                interfaceC1971v.dispose();
                this.f103135c = null;
                if (isAttachedToWindow()) {
                    h();
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f103140h = true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(IBinder iBinder) {
        if (this.f103134b != iBinder) {
            this.f103134b = iBinder;
            this.f103133a = null;
        }
    }

    public final void u(boolean z10) {
        this.f103138f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.l0) childAt).N(z10);
        }
    }

    public final void v(@NotNull ViewCompositionStrategy viewCompositionStrategy) {
        InterfaceC4376a<kotlin.L0> interfaceC4376a = this.f103137e;
        if (interfaceC4376a != null) {
            interfaceC4376a.invoke();
        }
        this.f103137e = viewCompositionStrategy.a(this);
    }

    @dd.k
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i10, int i11, C4969v c4969v) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10) {
        e();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams, boolean z10) {
        e();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @dd.k
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setClipChildren(false);
        setClipToPadding(false);
        ViewCompositionStrategy.f103659a.getClass();
        this.f103137e = ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f103665b.a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10, int i11) {
        e();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, i10, layoutParams);
    }
}
