package androidx.viewpager2.widget;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import e.P;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends ViewPager2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final List<ViewPager2.j> f119956a;

    public b(int i10) {
        this.f119956a = new ArrayList(i10);
    }

    public void a(ViewPager2.j jVar) {
        this.f119956a.add(jVar);
    }

    public void b(ViewPager2.j jVar) {
        this.f119956a.remove(jVar);
    }

    public final void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrollStateChanged(int i10) {
        try {
            Iterator<ViewPager2.j> it = this.f119956a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i10);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageScrolled(int i10, float f10, @P int i11) {
        try {
            Iterator<ViewPager2.j> it = this.f119956a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i10, f10, i11);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
            throw null;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void onPageSelected(int i10) {
        try {
            Iterator<ViewPager2.j> it = this.f119956a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i10);
            }
        } catch (ConcurrentModificationException e10) {
            c(e10);
            throw null;
        }
    }
}
