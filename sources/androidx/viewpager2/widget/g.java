package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends RecyclerView.r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f119969n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f119970o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f119971p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f119972q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f119973r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f119974s = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewPager2.j f119975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f119976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f119977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayoutManager f119978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f119979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f119980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f119981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f119982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f119983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f119984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f119985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f119986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f119987m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f119989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f119990c;

        public void a() {
            this.f119988a = -1;
            this.f119989b = 0.0f;
            this.f119990c = 0;
        }
    }

    public g(@NonNull ViewPager2 viewPager2) {
        this.f119976b = viewPager2;
        RecyclerView recyclerView = viewPager2.f119924j;
        this.f119977c = recyclerView;
        this.f119978d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f119981g = new a();
        o();
    }

    public final void a(int i10, float f10, int i11) {
        ViewPager2.j jVar = this.f119975a;
        if (jVar != null) {
            jVar.onPageScrolled(i10, f10, i11);
        }
    }

    public final void b(int i10) {
        ViewPager2.j jVar = this.f119975a;
        if (jVar != null) {
            jVar.onPageSelected(i10);
        }
    }

    public final void c(int i10) {
        if ((this.f119979e == 3 && this.f119980f == 0) || this.f119980f == i10) {
            return;
        }
        this.f119980f = i10;
        ViewPager2.j jVar = this.f119975a;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i10);
        }
    }

    public final int d() {
        return this.f119978d.findFirstVisibleItemPosition();
    }

    public double e() {
        r();
        a aVar = this.f119981g;
        return ((double) aVar.f119988a) + ((double) aVar.f119989b);
    }

    public int f() {
        return this.f119980f;
    }

    public boolean g() {
        return this.f119980f == 1;
    }

    public boolean h() {
        return this.f119987m;
    }

    public boolean i() {
        return this.f119980f == 0;
    }

    public final boolean j() {
        int i10 = this.f119979e;
        return i10 == 1 || i10 == 4;
    }

    public void k() {
        this.f119979e = 4;
        q(true);
    }

    public void l() {
        this.f119986l = true;
    }

    public void m() {
        if (!g() || this.f119987m) {
            this.f119987m = false;
            r();
            a aVar = this.f119981g;
            if (aVar.f119990c != 0) {
                c(2);
                return;
            }
            int i10 = aVar.f119988a;
            if (i10 != this.f119982h) {
                b(i10);
            }
            c(0);
            o();
        }
    }

    public void n(int i10, boolean z10) {
        this.f119979e = z10 ? 2 : 3;
        this.f119987m = false;
        boolean z11 = this.f119983i != i10;
        this.f119983i = i10;
        c(2);
        if (z11) {
            b(i10);
        }
    }

    public final void o() {
        this.f119979e = 0;
        this.f119980f = 0;
        this.f119981g.a();
        this.f119982h = -1;
        this.f119983i = -1;
        this.f119984j = false;
        this.f119985k = false;
        this.f119987m = false;
        this.f119986l = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i10) {
        if (!(this.f119979e == 1 && this.f119980f == 1) && i10 == 1) {
            q(false);
            return;
        }
        if (j() && i10 == 2) {
            if (this.f119985k) {
                c(2);
                this.f119984j = true;
                return;
            }
            return;
        }
        if (j() && i10 == 0) {
            r();
            if (this.f119985k) {
                a aVar = this.f119981g;
                if (aVar.f119990c == 0) {
                    int i11 = this.f119982h;
                    int i12 = aVar.f119988a;
                    if (i11 != i12) {
                        b(i12);
                    }
                }
            } else {
                int i13 = this.f119981g.f119988a;
                if (i13 != -1) {
                    a(i13, 0.0f, 0);
                }
            }
            c(0);
            o();
        }
        if (this.f119979e == 2 && i10 == 0 && this.f119986l) {
            r();
            a aVar2 = this.f119981g;
            if (aVar2.f119990c == 0) {
                int i14 = this.f119983i;
                int i15 = aVar2.f119988a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    b(i15);
                }
                c(0);
                o();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f119985k = r4
            r3.r()
            boolean r0 = r3.f119984j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f119984j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f119976b
            boolean r6 = r6.r()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.g$a r5 = r3.f119981g
            int r6 = r5.f119990c
            if (r6 == 0) goto L29
            int r5 = r5.f119988a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.g$a r5 = r3.f119981g
            int r5 = r5.f119988a
        L2d:
            r3.f119983i = r5
            int r6 = r3.f119982h
            if (r6 == r5) goto L45
            r3.b(r5)
            goto L45
        L37:
            int r5 = r3.f119979e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.g$a r5 = r3.f119981g
            int r5 = r5.f119988a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.b(r5)
        L45:
            androidx.viewpager2.widget.g$a r5 = r3.f119981g
            int r6 = r5.f119988a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.f119989b
            int r5 = r5.f119990c
            r3.a(r6, r0, r5)
            androidx.viewpager2.widget.g$a r5 = r3.f119981g
            int r6 = r5.f119988a
            int r0 = r3.f119983i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f119990c
            if (r5 != 0) goto L6b
            int r5 = r3.f119980f
            if (r5 == r4) goto L6b
            r3.c(r2)
            r3.o()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.g.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public void p(ViewPager2.j jVar) {
        this.f119975a = jVar;
    }

    public final void q(boolean z10) {
        this.f119987m = z10;
        this.f119979e = z10 ? 4 : 1;
        int i10 = this.f119983i;
        if (i10 != -1) {
            this.f119982h = i10;
            this.f119983i = -1;
        } else if (this.f119982h == -1) {
            this.f119982h = this.f119978d.findFirstVisibleItemPosition();
        }
        c(1);
    }

    public final void r() {
        int top;
        a aVar = this.f119981g;
        int iFindFirstVisibleItemPosition = this.f119978d.findFirstVisibleItemPosition();
        aVar.f119988a = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View viewFindViewByPosition = this.f119978d.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.f119978d.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f119978d.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f119978d.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f119978d.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f119978d.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f119977c.getPaddingLeft();
            if (this.f119976b.r()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f119977c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f119990c = i10;
        if (i10 >= 0) {
            aVar.f119989b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f119978d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f119990c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
