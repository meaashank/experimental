package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import g.C4426a;
import l.C5125a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class M extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f86066l = "ScrollingTabContainerView";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Interpolator f86067m = new DecelerateInterpolator();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f86068n = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f86069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f86070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayoutCompat f86071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spinner f86072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewPropertyAnimator f86078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f86079k;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f86080a;

        public a(View view) {
            this.f86080a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            M.this.smoothScrollTo(this.f86080a.getLeft() - ((M.this.getWidth() - this.f86080a.getWidth()) / 2), 0);
            M.this.f86069a = null;
        }
    }

    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return M.this.f86071c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) M.this.f86071c.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return M.this.g((ActionBar.e) getItem(i10), true);
            }
            ((d) view).a((ActionBar.e) getItem(i10));
            return view;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().g();
            int childCount = M.this.f86071c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = M.this.f86071c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class d extends LinearLayout {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f86084g = "androidx.appcompat.app.ActionBar$Tab";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f86085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ActionBar.e f86086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f86087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f86088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f86089e;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, ActionBar.e eVar, boolean z10) {
            int i10 = C4426a.b.f200877h;
            super(context, null, i10);
            int[] iArr = {R.attr.background};
            this.f86085a = iArr;
            this.f86086b = eVar;
            W wG = W.G(context, null, iArr, i10, 0);
            if (wG.f86249b.hasValue(0)) {
                setBackgroundDrawable(wG.h(0));
            }
            wG.I();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(ActionBar.e eVar) {
            this.f86086b = eVar;
            c();
        }

        public ActionBar.e b() {
            return this.f86086b;
        }

        public void c() {
            ActionBar.e eVar = this.f86086b;
            View viewB = eVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f86089e = viewB;
                TextView textView = this.f86087c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f86088d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f86088d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f86089e;
            if (view != null) {
                removeView(view);
                this.f86089e = null;
            }
            Drawable drawableC = eVar.c();
            CharSequence charSequenceF = eVar.f();
            if (drawableC != null) {
                if (this.f86088d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f86088d = appCompatImageView;
                }
                this.f86088d.setImageDrawable(drawableC);
                this.f86088d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f86088d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f86088d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceF);
            if (zIsEmpty) {
                TextView textView2 = this.f86087c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f86087c.setText((CharSequence) null);
                }
            } else {
                if (this.f86087c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C4426a.b.f200883i);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f86087c = appCompatTextView;
                }
                this.f86087c.setText(charSequenceF);
                this.f86087c.setVisibility(0);
            }
            ImageView imageView3 = this.f86088d;
            if (imageView3 != null) {
                imageView3.setContentDescription(eVar.a());
            }
            b0.a(this, zIsEmpty ? eVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f86084g);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f86084g);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (M.this.f86074f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = M.this.f86074f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f86091a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86092b;

        public e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int i10) {
            this.f86092b = i10;
            M.this.f86078j = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f86091a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f86091a) {
                return;
            }
            M m10 = M.this;
            m10.f86078j = null;
            m10.setVisibility(this.f86092b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            M.this.setVisibility(0);
            this.f86091a = false;
        }
    }

    public M(@NonNull Context context) {
        super(context);
        this.f86079k = new e();
        setHorizontalScrollBarEnabled(false);
        C5125a c5125a = new C5125a(context);
        n(c5125a.f());
        this.f86075g = c5125a.e();
        LinearLayoutCompat linearLayoutCompatF = f();
        this.f86071c = linearLayoutCompatF;
        addView(linearLayoutCompatF, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(ActionBar.e eVar, int i10, boolean z10) {
        d dVarG = g(eVar, false);
        this.f86071c.addView(dVarG, i10, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f86072d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            dVarG.setSelected(true);
        }
        if (this.f86073e) {
            requestLayout();
        }
    }

    public void b(ActionBar.e eVar, boolean z10) {
        d dVarG = g(eVar, false);
        this.f86071c.addView(dVarG, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        Spinner spinner = this.f86072d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            dVarG.setSelected(true);
        }
        if (this.f86073e) {
            requestLayout();
        }
    }

    public void c(int i10) {
        View childAt = this.f86071c.getChildAt(i10);
        Runnable runnable = this.f86069a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f86069a = aVar;
        post(aVar);
    }

    public void d(int i10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f86078j;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i10 != 0) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
            viewPropertyAnimatorAlpha.setDuration(200L);
            viewPropertyAnimatorAlpha.setInterpolator(f86067m);
            viewPropertyAnimatorAlpha.setListener(this.f86079k.a(viewPropertyAnimatorAlpha, i10));
            viewPropertyAnimatorAlpha.start();
            return;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = animate().alpha(1.0f);
        viewPropertyAnimatorAlpha2.setDuration(200L);
        viewPropertyAnimatorAlpha2.setInterpolator(f86067m);
        viewPropertyAnimatorAlpha2.setListener(this.f86079k.a(viewPropertyAnimatorAlpha2, i10));
        viewPropertyAnimatorAlpha2.start();
    }

    public final Spinner e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C4426a.b.f200907m);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public final LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C4426a.b.f200871g);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    public d g(ActionBar.e eVar, boolean z10) {
        d dVar = new d(getContext(), eVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f86076h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.f86070b == null) {
            this.f86070b = new c();
        }
        dVar.setOnClickListener(this.f86070b);
        return dVar;
    }

    public final boolean h() {
        Spinner spinner = this.f86072d;
        return spinner != null && spinner.getParent() == this;
    }

    public final void i() {
        if (h()) {
            return;
        }
        if (this.f86072d == null) {
            this.f86072d = e();
        }
        removeView(this.f86071c);
        addView(this.f86072d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f86072d.getAdapter() == null) {
            this.f86072d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f86069a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f86069a = null;
        }
        this.f86072d.setSelection(this.f86077i);
    }

    public final boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.f86072d);
        addView(this.f86071c, new ViewGroup.LayoutParams(-2, -1));
        o(this.f86072d.getSelectedItemPosition());
        return false;
    }

    public void k() {
        this.f86071c.removeAllViews();
        Spinner spinner = this.f86072d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f86073e) {
            requestLayout();
        }
    }

    public void l(int i10) {
        this.f86071c.removeViewAt(i10);
        Spinner spinner = this.f86072d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f86073e) {
            requestLayout();
        }
    }

    public void m(boolean z10) {
        this.f86073e = z10;
    }

    public void n(int i10) {
        this.f86076h = i10;
        requestLayout();
    }

    public void o(int i10) {
        this.f86077i = i10;
        int childCount = this.f86071c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f86071c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                c(i10);
            }
            i11++;
        }
        Spinner spinner = this.f86072d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f86069a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5125a c5125a = new C5125a(getContext());
        n(c5125a.f());
        this.f86075g = c5125a.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f86069a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f86071c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f86074f = -1;
        } else {
            if (childCount > 2) {
                this.f86074f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f86074f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f86074f = Math.min(this.f86074f, this.f86075g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f86076h, 1073741824);
        if (z10 || !this.f86073e) {
            j();
        } else {
            this.f86071c.measure(0, iMakeMeasureSpec);
            if (this.f86071c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                i();
            } else {
                j();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        o(this.f86077i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void p(int i10) {
        ((d) this.f86071c.getChildAt(i10)).c();
        Spinner spinner = this.f86072d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f86073e) {
            requestLayout();
        }
    }
}
