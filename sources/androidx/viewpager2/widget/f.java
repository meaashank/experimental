package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends ViewPager2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayoutManager f119967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager2.m f119968b;

    public f(LinearLayoutManager linearLayoutManager) {
        this.f119967a = linearLayoutManager;
    }

    public ViewPager2.m a() {
        return this.f119968b;
    }

    public void b(@Nullable ViewPager2.m mVar) {
        this.f119968b = mVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrolled(int i10, float f10, int i11) {
        if (this.f119968b == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.f119967a.getChildCount(); i12++) {
            View childAt = this.f119967a.getChildAt(i12);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f119967a.getChildCount())));
            }
            this.f119968b.transformPage(childAt, (this.f119967a.getPosition(childAt) - i10) + f11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageSelected(int i10) {
    }
}
