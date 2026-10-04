package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C2507z0;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.C5637a;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n55#2,6:349\n55#2,6:355\n1855#3,2:361\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:349,6\n135#1:355,6\n221#1:361,2\n*E\n"})
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<View> f113551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<View> f113552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View.OnApplyWindowInsetsListener f113553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f113554d;

    @e.T(20)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f113555a = new a();

        @NotNull
        public final WindowInsets a(@NotNull View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @NotNull View v10, @NotNull WindowInsets insets) {
            kotlin.jvm.internal.G.p(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.jvm.internal.G.p(v10, "v");
            kotlin.jvm.internal.G.p(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v10, insets);
            kotlin.jvm.internal.G.o(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @dd.k
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.G.p(context, "context");
    }

    public final void a(View view) {
        if (this.f113552b.contains(view)) {
            this.f113551a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.G.p(child, "child");
        if (FragmentManager.R0(child) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    public final <F extends Fragment> F b() {
        return (F) FragmentManager.u0(this).r0(getId());
    }

    @dd.j(name = "setDrawDisappearingViewsLast")
    public final void c(boolean z10) {
        this.f113554d = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    @e.T(20)
    @NotNull
    public WindowInsets dispatchApplyWindowInsets(@NotNull WindowInsets insets) {
        WindowInsetsCompat windowInsetsCompatJ1;
        kotlin.jvm.internal.G.p(insets, "insets");
        WindowInsetsCompat windowInsetsCompatK = WindowInsetsCompat.K(insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f113553c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f113555a;
            kotlin.jvm.internal.G.m(onApplyWindowInsetsListener);
            windowInsetsCompatJ1 = WindowInsetsCompat.L(aVar.a(onApplyWindowInsetsListener, this, insets), null);
        } else {
            windowInsetsCompatJ1 = C2507z0.j1(this, windowInsetsCompatK);
        }
        kotlin.jvm.internal.G.o(windowInsetsCompatJ1, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!windowInsetsCompatJ1.A()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C2507z0.p(getChildAt(i10), windowInsetsCompatJ1);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        kotlin.jvm.internal.G.p(canvas, "canvas");
        if (this.f113554d) {
            Iterator<T> it = this.f113551a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long j10) {
        kotlin.jvm.internal.G.p(canvas, "canvas");
        kotlin.jvm.internal.G.p(child, "child");
        if (this.f113554d && !this.f113551a.isEmpty() && this.f113551a.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        kotlin.jvm.internal.G.p(view, "view");
        this.f113552b.remove(view);
        if (this.f113551a.remove(view)) {
            this.f113554d = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    @e.T(20)
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets insets) {
        kotlin.jvm.internal.G.p(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.G.o(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View view) {
        kotlin.jvm.internal.G.p(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View view = getChildAt(i10);
        kotlin.jvm.internal.G.o(view, "view");
        a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@NotNull View view) {
        kotlin.jvm.internal.G.p(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.G.o(view, "view");
            a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            kotlin.jvm.internal.G.o(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@NotNull View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.G.p(listener, "listener");
        this.f113553c = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@NotNull View view) {
        kotlin.jvm.internal.G.p(view, "view");
        if (view.getParent() == this) {
            this.f113552b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context) {
        super(context);
        kotlin.jvm.internal.G.p(context, "context");
        this.f113551a = new ArrayList();
        this.f113552b = new ArrayList();
        this.f113554d = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, C4969v c4969v) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dd.k
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        kotlin.jvm.internal.G.p(context, "context");
        this.f113551a = new ArrayList();
        this.f113552b = new ArrayList();
        this.f113554d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = C5637a.d.f239351e;
            kotlin.jvm.internal.G.o(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(C5637a.d.f239352f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @NotNull AttributeSet attrs, @NotNull FragmentManager fm) {
        super(context, attrs);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(attrs, "attrs");
        kotlin.jvm.internal.G.p(fm, "fm");
        this.f113551a = new ArrayList();
        this.f113552b = new ArrayList();
        this.f113554d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = C5637a.d.f239351e;
        kotlin.jvm.internal.G.o(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(C5637a.d.f239352f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(C5637a.d.f239353g);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment fragmentR0 = fm.r0(id2);
        if (classAttribute != null && fragmentR0 == null) {
            if (id2 == -1) {
                throw new IllegalStateException(android.support.v4.media.i.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            Fragment fragmentA = fm.H0().a(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.G.o(fragmentA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentA.onInflate(context, attrs, (Bundle) null);
            U u10 = fm.u();
            u10.f113769r = true;
            fragmentA.mContainer = this;
            u10.c(getId(), fragmentA, string);
            u10.p();
        }
        fm.k1(this);
    }
}
