package com.prism.hider.vault.calculator;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import rb.C5548b;

/* JADX INFO: loaded from: classes6.dex */
public class CalculatorPadViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagerAdapter f168467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager.i f168468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager.j f168469c;

    public class a extends PagerAdapter {
        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            CalculatorPadViewPager.this.removeViewAt(i10);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return CalculatorPadViewPager.this.getChildCount();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public float getPageWidth(int i10) {
            return i10 == 1 ? 0.7777778f : 1.0f;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i10) {
            return CalculatorPadViewPager.this.getChildAt(i10);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public class b extends ViewPager.l {
        public b() {
        }

        public final void a(View view, boolean z10) {
            if (!(view instanceof ViewGroup)) {
                view.setEnabled(z10);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), z10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (CalculatorPadViewPager.this.getAdapter() == CalculatorPadViewPager.this.f168467a) {
                int i11 = 0;
                while (i11 < CalculatorPadViewPager.this.getChildCount()) {
                    a(CalculatorPadViewPager.this.getChildAt(i11), i11 == i10);
                    i11++;
                }
            }
        }
    }

    public class c implements ViewPager.j {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void transformPage(View view, float f10) {
            if (f10 < 0.0f) {
                view.setTranslationX(CalculatorPadViewPager.this.getWidth() * (-f10));
                view.setAlpha(Math.max(f10 + 1.0f, 0.0f));
            } else {
                view.setTranslationX(0.0f);
                view.setAlpha(1.0f);
            }
        }
    }

    public CalculatorPadViewPager(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        PagerAdapter adapter = getAdapter();
        PagerAdapter pagerAdapter = this.f168467a;
        if (adapter == pagerAdapter) {
            pagerAdapter.notifyDataSetChanged();
        }
    }

    public CalculatorPadViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.f168467a = aVar;
        b bVar = new b();
        this.f168468b = bVar;
        c cVar = new c();
        this.f168469c = cVar;
        setAdapter(aVar);
        setBackgroundColor(getResources().getColor(R.color.black));
        setOnPageChangeListener(bVar);
        setPageMargin(getResources().getDimensionPixelSize(C5548b.f.Xd));
        setPageTransformer(false, cVar);
    }
}
