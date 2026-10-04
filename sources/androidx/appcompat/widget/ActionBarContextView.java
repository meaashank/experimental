package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import androidx.core.view.I0;
import g.C4426a;
import l.AbstractC5126b;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends AbstractC1495a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f85728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f85729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f85730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f85731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f85732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f85733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f85734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f85735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f85736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f85737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f85738t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f85739u;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC5126b f85740a;

        public a(AbstractC5126b abstractC5126b) {
            this.f85740a = abstractC5126b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f85740a.a();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    public void A(CharSequence charSequence) {
        this.f85729k = charSequence;
        w();
    }

    public void B(CharSequence charSequence) {
        this.f85728j = charSequence;
        w();
        C2507z0.J1(this, charSequence);
    }

    public void C(boolean z10) {
        if (z10 != this.f85738t) {
            requestLayout();
        }
        this.f85738t = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public /* bridge */ /* synthetic */ void c(int i10) {
        super.c(i10);
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public /* bridge */ /* synthetic */ int f() {
        return super.f();
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public int g() {
        return this.f86259e;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f86258d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.t();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public boolean j() {
        ActionMenuPresenter actionMenuPresenter = this.f86258d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.w();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f86258d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.t();
            this.f86258d.u();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1495a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = h0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f85730l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f85730l.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM = AbstractC1495a.m(paddingRight, i14, zB);
            paddingRight = AbstractC1495a.m(iM + n(this.f85730l, iM, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iN = paddingRight;
        LinearLayout linearLayout = this.f85733o;
        if (linearLayout != null && this.f85732n == null && linearLayout.getVisibility() != 8) {
            iN += n(this.f85733o, iN, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f85732n;
        if (view2 != null) {
            n(view2, iN, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f86257c;
        if (actionMenuView != null) {
            n(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f86259e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f85730l;
        if (view != null) {
            int iL = l(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f85730l.getLayoutParams();
            paddingLeft = iL - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f86257c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = l(this.f86257c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f85733o;
        if (linearLayout != null && this.f85732n == null) {
            if (this.f85738t) {
                this.f85733o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f85733o.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f85733o.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = l(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f85732n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f85732n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f86259e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC1495a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public void p(int i10) {
        this.f86259e = i10;
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public /* bridge */ /* synthetic */ I0 q(int i10, long j10) {
        return super.q(i10, j10);
    }

    @Override // androidx.appcompat.widget.AbstractC1495a
    public boolean r() {
        ActionMenuPresenter actionMenuPresenter = this.f86258d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.F();
        }
        return false;
    }

    public void s() {
        if (this.f85730l == null) {
            y();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1495a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CharSequence t() {
        return this.f85729k;
    }

    public CharSequence u() {
        return this.f85728j;
    }

    public void v(AbstractC5126b abstractC5126b) {
        View view = this.f85730l;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f85739u, (ViewGroup) this, false);
            this.f85730l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f85730l);
        }
        View viewFindViewById = this.f85730l.findViewById(C4426a.g.f201300m);
        this.f85731m = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(abstractC5126b));
        androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) abstractC5126b.c();
        ActionMenuPresenter actionMenuPresenter = this.f86258d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.q();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f86258d = actionMenuPresenter2;
        actionMenuPresenter2.D(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVar.addMenuPresenter(this.f86258d, this.f86256b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f86258d.getMenuView(this);
        this.f86257c = actionMenuView;
        C2507z0.O1(actionMenuView, null);
        addView(this.f86257c, layoutParams);
    }

    public final void w() {
        if (this.f85733o == null) {
            LayoutInflater.from(getContext()).inflate(C4426a.j.f201345a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f85733o = linearLayout;
            this.f85734p = (TextView) linearLayout.findViewById(C4426a.g.f201288g);
            this.f85735q = (TextView) this.f85733o.findViewById(C4426a.g.f201286f);
            if (this.f85736r != 0) {
                this.f85734p.setTextAppearance(getContext(), this.f85736r);
            }
            if (this.f85737s != 0) {
                this.f85735q.setTextAppearance(getContext(), this.f85737s);
            }
        }
        this.f85734p.setText(this.f85728j);
        this.f85735q.setText(this.f85729k);
        boolean zIsEmpty = TextUtils.isEmpty(this.f85728j);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f85729k);
        this.f85735q.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f85733o.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f85733o.getParent() == null) {
            addView(this.f85733o);
        }
    }

    public boolean x() {
        return this.f85738t;
    }

    public void y() {
        removeAllViews();
        this.f85732n = null;
        this.f86257c = null;
        this.f86258d = null;
        View view = this.f85731m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public void z(View view) {
        LinearLayout linearLayout;
        View view2 = this.f85732n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f85732n = view;
        if (view != null && (linearLayout = this.f85733o) != null) {
            removeView(linearLayout);
            this.f85733o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C4426a.b.f200715C);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4426a.m.f201814J, i10, 0);
        W w10 = new W(context, typedArrayObtainStyledAttributes);
        C2507z0.O1(this, w10.h(C4426a.m.f201822K));
        this.f85736r = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201862P, 0);
        this.f85737s = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201854O, 0);
        this.f86259e = typedArrayObtainStyledAttributes.getLayoutDimension(C4426a.m.f201846N, 0);
        this.f85739u = typedArrayObtainStyledAttributes.getResourceId(C4426a.m.f201838M, C4426a.j.f201350f);
        w10.I();
    }
}
