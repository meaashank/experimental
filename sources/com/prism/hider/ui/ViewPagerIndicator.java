package com.prism.hider.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.app.hider.master.promax.R;
import e.InterfaceC4328b;
import e.InterfaceC4346u;

/* JADX INFO: loaded from: classes6.dex */
public class ViewPagerIndicator extends LinearLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f168157p = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f168158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f168159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f168161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f168162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f168163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f168164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f168165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animator f168166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Animator f168167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Animator f168168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f168169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f168170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ViewPager.i f168171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DataSetObserver f168172o;

    public class a implements ViewPager.i {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            View childAt;
            if (ViewPagerIndicator.this.f168158a.getAdapter() == null || ViewPagerIndicator.this.f168158a.getAdapter().getCount() <= 0) {
                return;
            }
            if (ViewPagerIndicator.this.f168167j.isRunning()) {
                ViewPagerIndicator.this.f168167j.end();
                ViewPagerIndicator.this.f168167j.cancel();
            }
            if (ViewPagerIndicator.this.f168166i.isRunning()) {
                ViewPagerIndicator.this.f168166i.end();
                ViewPagerIndicator.this.f168166i.cancel();
            }
            ViewPagerIndicator viewPagerIndicator = ViewPagerIndicator.this;
            int i11 = viewPagerIndicator.f168170m;
            if (i11 >= 0 && (childAt = viewPagerIndicator.getChildAt(i11)) != null) {
                childAt.setBackgroundResource(ViewPagerIndicator.this.f168165h);
                ViewPagerIndicator.this.f168167j.setTarget(childAt);
                ViewPagerIndicator.this.f168167j.start();
            }
            View childAt2 = ViewPagerIndicator.this.getChildAt(i10);
            if (childAt2 != null) {
                childAt2.setBackgroundResource(ViewPagerIndicator.this.f168164g);
                ViewPagerIndicator.this.f168166i.setTarget(childAt2);
                ViewPagerIndicator.this.f168166i.start();
            }
            ViewPagerIndicator.this.f168170m = i10;
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            int count;
            super.onChanged();
            if (ViewPagerIndicator.this.f168158a == null || (count = ViewPagerIndicator.this.f168158a.getAdapter().getCount()) == ViewPagerIndicator.this.getChildCount()) {
                return;
            }
            ViewPagerIndicator viewPagerIndicator = ViewPagerIndicator.this;
            if (viewPagerIndicator.f168170m < count) {
                viewPagerIndicator.f168170m = viewPagerIndicator.f168158a.getCurrentItem();
            } else {
                viewPagerIndicator.f168170m = -1;
            }
            ViewPagerIndicator.this.o();
        }
    }

    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return Math.abs(1.0f - f10);
        }

        public c() {
        }
    }

    public ViewPagerIndicator(Context context) {
        super(context);
        this.f168159b = -1;
        this.f168160c = -1;
        this.f168161d = -1;
        this.f168162e = R.animator.hider_scale_with_alp;
        this.f168163f = 0;
        this.f168164g = R.drawable.hider_white_radius;
        this.f168165h = R.drawable.hider_white_radius;
        this.f168170m = -1;
        this.f168171n = new a();
        this.f168172o = new b();
        s(context, null);
    }

    public final void i(int i10, @InterfaceC4346u int i11, Animator animator) {
        if (animator.isRunning()) {
            animator.end();
            animator.cancel();
        }
        View view = new View(getContext());
        view.setBackgroundResource(i11);
        addView(view, this.f168160c, this.f168161d);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (i10 == 0) {
            int i12 = this.f168159b;
            layoutParams.leftMargin = i12;
            layoutParams.rightMargin = i12;
        } else {
            int i13 = this.f168159b;
            layoutParams.topMargin = i13;
            layoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(layoutParams);
        animator.setTarget(view);
        animator.start();
    }

    public final void j(Context context) {
        int iP = this.f168160c;
        if (iP < 0) {
            iP = p(5.0f);
        }
        this.f168160c = iP;
        int iP2 = this.f168161d;
        if (iP2 < 0) {
            iP2 = p(5.0f);
        }
        this.f168161d = iP2;
        int iP3 = this.f168159b;
        if (iP3 < 0) {
            iP3 = p(5.0f);
        }
        this.f168159b = iP3;
        int i10 = this.f168162e;
        if (i10 == 0) {
            i10 = R.animator.hider_scale_with_alp;
        }
        this.f168162e = i10;
        this.f168166i = AnimatorInflater.loadAnimator(context, i10);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, this.f168162e);
        this.f168168k = animatorLoadAnimator;
        animatorLoadAnimator.setDuration(0L);
        this.f168167j = m(context);
        Animator animatorM = m(context);
        this.f168169l = animatorM;
        animatorM.setDuration(0L);
        int i11 = this.f168164g;
        if (i11 == 0) {
            i11 = R.drawable.hider_white_radius;
        }
        this.f168164g = i11;
        int i12 = this.f168165h;
        if (i12 != 0) {
            i11 = i12;
        }
        this.f168165h = i11;
    }

    public void k(int i10, int i11, int i12) {
        l(i10, i11, i12, R.animator.hider_scale_with_alp, 0, R.drawable.hider_white_radius, R.drawable.hider_white_radius);
    }

    public void l(int i10, int i11, int i12, @InterfaceC4328b int i13, @InterfaceC4328b int i14, @InterfaceC4346u int i15, @InterfaceC4346u int i16) {
        this.f168160c = i10;
        this.f168161d = i11;
        this.f168159b = i12;
        this.f168162e = i13;
        this.f168163f = i14;
        this.f168164g = i15;
        this.f168165h = i16;
        j(getContext());
    }

    public final Animator m(Context context) {
        int i10 = this.f168163f;
        if (i10 != 0) {
            return AnimatorInflater.loadAnimator(context, i10);
        }
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, this.f168162e);
        animatorLoadAnimator.setInterpolator(new c());
        return animatorLoadAnimator;
    }

    public final Animator n(Context context) {
        return AnimatorInflater.loadAnimator(context, this.f168162e);
    }

    public final void o() {
        removeAllViews();
        int count = this.f168158a.getAdapter().getCount();
        if (count <= 0) {
            return;
        }
        int currentItem = this.f168158a.getCurrentItem();
        int orientation = getOrientation();
        for (int i10 = 0; i10 < count; i10++) {
            if (currentItem == i10) {
                i(orientation, this.f168164g, this.f168168k);
            } else {
                i(orientation, this.f168165h, this.f168169l);
            }
        }
    }

    public int p(float f10) {
        return (int) ((f10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public DataSetObserver q() {
        return this.f168172o;
    }

    public final void r(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.launcher3.R.styleable.CircleIndicator);
        this.f168160c = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
        this.f168161d = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, -1);
        this.f168159b = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        this.f168162e = typedArrayObtainStyledAttributes.getResourceId(0, R.animator.hider_scale_with_alp);
        this.f168163f = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.hider_white_radius);
        this.f168164g = resourceId;
        this.f168165h = typedArrayObtainStyledAttributes.getResourceId(3, resourceId);
        setOrientation(typedArrayObtainStyledAttributes.getInt(7, -1) == 1 ? 1 : 0);
        int i10 = typedArrayObtainStyledAttributes.getInt(4, -1);
        if (i10 < 0) {
            i10 = 17;
        }
        setGravity(i10);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void s(Context context, AttributeSet attributeSet) {
        r(context, attributeSet);
        j(context);
    }

    @Deprecated
    public void t(ViewPager.i iVar) {
        ViewPager viewPager = this.f168158a;
        if (viewPager == null) {
            throw new NullPointerException("can not find Viewpager , setViewPager first");
        }
        viewPager.removeOnPageChangeListener(iVar);
        this.f168158a.addOnPageChangeListener(iVar);
    }

    public void u(ViewPager viewPager) {
        this.f168158a = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        this.f168170m = -1;
        o();
        this.f168158a.removeOnPageChangeListener(this.f168171n);
        this.f168158a.addOnPageChangeListener(this.f168171n);
        this.f168171n.onPageSelected(this.f168158a.getCurrentItem());
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f168159b = -1;
        this.f168160c = -1;
        this.f168161d = -1;
        this.f168162e = R.animator.hider_scale_with_alp;
        this.f168163f = 0;
        this.f168164g = R.drawable.hider_white_radius;
        this.f168165h = R.drawable.hider_white_radius;
        this.f168170m = -1;
        this.f168171n = new a();
        this.f168172o = new b();
        s(context, attributeSet);
    }

    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f168159b = -1;
        this.f168160c = -1;
        this.f168161d = -1;
        this.f168162e = R.animator.hider_scale_with_alp;
        this.f168163f = 0;
        this.f168164g = R.drawable.hider_white_radius;
        this.f168165h = R.drawable.hider_white_radius;
        this.f168170m = -1;
        this.f168171n = new a();
        this.f168172o = new b();
        s(context, attributeSet);
    }

    @TargetApi(21)
    public ViewPagerIndicator(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f168159b = -1;
        this.f168160c = -1;
        this.f168161d = -1;
        this.f168162e = R.animator.hider_scale_with_alp;
        this.f168163f = 0;
        this.f168164g = R.drawable.hider_white_radius;
        this.f168165h = R.drawable.hider_white_radius;
        this.f168170m = -1;
        this.f168171n = new a();
        this.f168172o = new b();
        s(context, attributeSet);
    }
}
