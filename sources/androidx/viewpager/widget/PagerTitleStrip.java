package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import e.InterfaceC4337k;
import e.InterfaceC4348w;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@ViewPager.e
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f119871o = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f119872p = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f119873q = 0.6f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f119874r = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager f119875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f119876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f119877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f119878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f119879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f119880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f119881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f119882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f119883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f119884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f119885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WeakReference<PagerAdapter> f119886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f119887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f119888n;

    public class a extends DataSetObserver implements ViewPager.i, ViewPager.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119889a;

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.i(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.j(pagerTitleStrip.f119875a.getCurrentItem(), PagerTitleStrip.this.f119875a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f10 = pagerTitleStrip2.f119880f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            pagerTitleStrip2.k(pagerTitleStrip2.f119875a.getCurrentItem(), f10, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
            this.f119889a = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
            if (f10 > 0.5f) {
                i10++;
            }
            PagerTitleStrip.this.k(i10, f10, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (this.f119889a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.j(pagerTitleStrip.f119875a.getCurrentItem(), PagerTitleStrip.this.f119875a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f10 = pagerTitleStrip2.f119880f;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                pagerTitleStrip2.k(pagerTitleStrip2.f119875a.getCurrentItem(), f10, true);
            }
        }
    }

    public static class b extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Locale f119891a;

        public b(Context context) {
            this.f119891a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f119891a);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    public static void e(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public int a() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int b() {
        return this.f119881g;
    }

    public void c(int i10) {
        this.f119882h = i10;
        requestLayout();
    }

    public void d(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        int i10 = ((int) (f10 * 255.0f)) & 255;
        this.f119887m = i10;
        int i11 = (i10 << 24) | (this.f119888n & 16777215);
        this.f119876b.setTextColor(i11);
        this.f119878d.setTextColor(i11);
    }

    public void f(@InterfaceC4337k int i10) {
        this.f119888n = i10;
        this.f119877c.setTextColor(i10);
        int i11 = (this.f119887m << 24) | (this.f119888n & 16777215);
        this.f119876b.setTextColor(i11);
        this.f119878d.setTextColor(i11);
    }

    public void g(int i10, float f10) {
        this.f119876b.setTextSize(i10, f10);
        this.f119877c.setTextSize(i10, f10);
        this.f119878d.setTextSize(i10, f10);
    }

    public void h(int i10) {
        this.f119881g = i10;
        requestLayout();
    }

    public void i(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.f119885k);
            this.f119886l = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.f119885k);
            this.f119886l = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.f119875a;
        if (viewPager != null) {
            this.f119879e = -1;
            this.f119880f = -1.0f;
            j(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    public void j(int i10, PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.f119883i = true;
        CharSequence pageTitle = null;
        this.f119876b.setText((i10 < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i10 - 1));
        this.f119877c.setText((pagerAdapter == null || i10 >= count) ? null : pagerAdapter.getPageTitle(i10));
        int i11 = i10 + 1;
        if (i11 < count && pagerAdapter != null) {
            pageTitle = pagerAdapter.getPageTitle(i11);
        }
        this.f119878d.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f119876b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f119877c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f119878d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f119879e = i10;
        if (!this.f119884j) {
            k(i10, this.f119880f, false);
        }
        this.f119883i = false;
    }

    public void k(int i10, float f10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 != this.f119879e) {
            j(i10, this.f119875a.getAdapter());
        } else if (!z10 && f10 == this.f119880f) {
            return;
        }
        this.f119884j = true;
        int measuredWidth = this.f119876b.getMeasuredWidth();
        int measuredWidth2 = this.f119877c.getMeasuredWidth();
        int measuredWidth3 = this.f119878d.getMeasuredWidth();
        int i15 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = paddingRight + i15;
        int i17 = (width - (paddingLeft + i15)) - i16;
        float f11 = 0.5f + f10;
        if (f11 > 1.0f) {
            f11 -= 1.0f;
        }
        int i18 = ((width - i16) - ((int) (i17 * f11))) - i15;
        int i19 = measuredWidth2 + i18;
        int baseline = this.f119876b.getBaseline();
        int baseline2 = this.f119877c.getBaseline();
        int baseline3 = this.f119878d.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i20 = iMax - baseline;
        int i21 = iMax - baseline2;
        int i22 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f119876b.getMeasuredHeight() + i20, this.f119877c.getMeasuredHeight() + i21), this.f119878d.getMeasuredHeight() + i22);
        int i23 = this.f119882h & 112;
        if (i23 == 16) {
            i11 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i23 != 80) {
                i12 = i20 + paddingTop;
                i13 = i21 + paddingTop;
                i14 = paddingTop + i22;
                TextView textView = this.f119877c;
                textView.layout(i18, i13, i19, textView.getMeasuredHeight() + i13);
                int iMin = Math.min(paddingLeft, (i18 - this.f119881g) - measuredWidth);
                TextView textView2 = this.f119876b;
                textView2.layout(iMin, i12, iMin + measuredWidth, textView2.getMeasuredHeight() + i12);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f119881g);
                TextView textView3 = this.f119878d;
                textView3.layout(iMax3, i14, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i14);
                this.f119880f = f10;
                this.f119884j = false;
            }
            i11 = (height - paddingBottom) - iMax2;
        }
        i12 = i20 + i11;
        i13 = i21 + i11;
        i14 = i11 + i22;
        TextView textView4 = this.f119877c;
        textView4.layout(i18, i13, i19, textView4.getMeasuredHeight() + i13);
        int iMin2 = Math.min(paddingLeft, (i18 - this.f119881g) - measuredWidth);
        TextView textView22 = this.f119876b;
        textView22.layout(iMin2, i12, iMin2 + measuredWidth, textView22.getMeasuredHeight() + i12);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f119881g);
        TextView textView32 = this.f119878d;
        textView32.layout(iMax32, i14, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i14);
        this.f119880f = f10;
        this.f119884j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.f119885k);
        viewPager.addOnAdapterChangeListener(this.f119885k);
        this.f119875a = viewPager;
        WeakReference<PagerAdapter> weakReference = this.f119886l;
        i(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f119875a;
        if (viewPager != null) {
            i(viewPager.getAdapter(), null);
            this.f119875a.setInternalPageChangeListener(null);
            this.f119875a.removeOnAdapterChangeListener(this.f119885k);
            this.f119875a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f119875a != null) {
            float f10 = this.f119880f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            k(this.f119879e, f10, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iMax;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i10);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (size * 0.2f), -2);
        this.f119876b.measure(childMeasureSpec2, childMeasureSpec);
        this.f119877c.measure(childMeasureSpec2, childMeasureSpec);
        this.f119878d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i11);
        } else {
            iMax = Math.max(a(), this.f119877c.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i11, this.f119877c.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f119883i) {
            return;
        }
        super.requestLayout();
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f119879e = -1;
        this.f119880f = -1.0f;
        this.f119885k = new a();
        TextView textView = new TextView(context);
        this.f119876b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f119877c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f119878d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f119871o);
        boolean z10 = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f119876b.setTextAppearance(resourceId);
            this.f119877c.setTextAppearance(resourceId);
            this.f119878d.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            g(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f119876b.setTextColor(color);
            this.f119877c.setTextColor(color);
            this.f119878d.setTextColor(color);
        }
        this.f119882h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f119888n = this.f119877c.getTextColors().getDefaultColor();
        d(0.6f);
        TextView textView4 = this.f119876b;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f119877c.setEllipsize(truncateAt);
        this.f119878d.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f119872p);
            z10 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z10) {
            e(this.f119876b);
            e(this.f119877c);
            e(this.f119878d);
        } else {
            this.f119876b.setSingleLine();
            this.f119877c.setSingleLine();
            this.f119878d.setSingleLine();
        }
        this.f119881g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
