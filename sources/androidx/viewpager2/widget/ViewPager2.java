package androidx.viewpager2.widget;

import F2.a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import e.D;
import e.P;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static boolean f119908A = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f119909u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f119910v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f119911w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f119912x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f119913y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f119914z = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f119915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f119916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.viewpager2.widget.b f119917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f119919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView.i f119920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayoutManager f119921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f119922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Parcelable f119923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f119924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y f119925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.viewpager2.widget.g f119926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.viewpager2.widget.b f119927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.viewpager2.widget.d f119928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.f f119929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView.l f119930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f119931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f119932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f119933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f119934t;

    public class a extends g {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f119919e = true;
            viewPager2.f119926l.f119986l = true;
        }
    }

    public class b extends j {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                ViewPager2.this.L();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f119918d != i10) {
                viewPager2.f119918d = i10;
                viewPager2.f119934t.q();
            }
        }
    }

    public class c extends j {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void onPageSelected(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f119924j.requestFocus(2);
            }
        }
    }

    public class d implements RecyclerView.o {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void a(@NonNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void b(@NonNull View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    public abstract class e {
        public e() {
        }

        public boolean a() {
            return this instanceof l;
        }

        public boolean b(int i10) {
            return false;
        }

        public boolean c(int i10, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return this instanceof f;
        }

        public void e(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        public void f(@Nullable RecyclerView.Adapter<?> adapter) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(@NonNull androidx.viewpager2.widget.b bVar, @NonNull RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public boolean k(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean l(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void m() {
        }

        public CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        public void o(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        public void p() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }

        public /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    public class f extends e {
        public f() {
            super();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.f119932r;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (ViewPager2.this.f119932r) {
                return;
            }
            accessibilityNodeInfoCompat.V0(AccessibilityNodeInfoCompat.a.f111885s);
            accessibilityNodeInfoCompat.V0(AccessibilityNodeInfoCompat.a.f111884r);
            accessibilityNodeInfoCompat.X1(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean k(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class g extends RecyclerView.i {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        public g(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            onChanged();
        }
    }

    public class h extends LinearLayoutManager {
        public h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@NonNull RecyclerView.z zVar, @NonNull int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = viewPager2.f119933s;
            if (i10 == -1) {
                super.calculateExtraLayoutSpace(zVar, iArr);
                return;
            }
            int iM = viewPager2.m() * i10;
            iArr[0] = iM;
            iArr[1] = iM;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.u uVar, @NonNull RecyclerView.z zVar, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(uVar, zVar, accessibilityNodeInfoCompat);
            ViewPager2.this.f119934t.j(accessibilityNodeInfoCompat);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(@NonNull RecyclerView.u uVar, @NonNull RecyclerView.z zVar, int i10, @Nullable Bundle bundle) {
            return ViewPager2.this.f119934t.b(i10) ? ViewPager2.this.f119934t.k(i10) : super.performAccessibilityAction(uVar, zVar, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    @D(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    public static abstract class j {
        public void onPageScrollStateChanged(int i10) {
        }

        public void onPageScrolled(int i10, float f10, @P int i11) {
        }

        public void onPageSelected(int i10) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    public class l extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.core.view.accessibility.a f119942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.core.view.accessibility.a f119943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView.i f119944d;

        public class a implements androidx.core.view.accessibility.a {
            public a() {
            }

            @Override // androidx.core.view.accessibility.a
            public boolean perform(@NonNull View view, @Nullable a.AbstractC0286a abstractC0286a) {
                l.this.v(((ViewPager2) view).f119918d + 1);
                return true;
            }
        }

        public class b implements androidx.core.view.accessibility.a {
            public b() {
            }

            @Override // androidx.core.view.accessibility.a
            public boolean perform(@NonNull View view, @Nullable a.AbstractC0286a abstractC0286a) {
                l.this.v(((ViewPager2) view).f119918d - 1);
                return true;
            }
        }

        public class c extends g {
            public c() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                l.this.w();
            }
        }

        public l() {
            super();
            this.f119942b = new a();
            this.f119943c = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(@Nullable RecyclerView.Adapter<?> adapter) {
            w();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f119944d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(@Nullable RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f119944d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(@NonNull androidx.viewpager2.widget.b bVar, @NonNull RecyclerView recyclerView) {
            C2507z0.Y1(recyclerView, 2);
            this.f119944d = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            v(i10 == 8192 ? ViewPager2.this.f119918d - 1 : ViewPager2.this.f119918d + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void m() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void o(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            g();
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            w();
        }

        public final void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.f119924j.getAdapter() == null) {
                itemCount = 0;
                itemCount2 = 0;
            } else if (ViewPager2.this.f119921g.getOrientation() == 1) {
                itemCount = ViewPager2.this.f119924j.getAdapter().getItemCount();
                itemCount2 = 0;
            } else {
                itemCount2 = ViewPager2.this.f119924j.getAdapter().getItemCount();
                itemCount = 0;
            }
            new AccessibilityNodeInfoCompat(accessibilityNodeInfo).l1(AccessibilityNodeInfoCompat.CollectionInfoCompat.h(itemCount, itemCount2, false, 0));
        }

        public final void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.f119924j.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0) {
                return;
            }
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f119932r) {
                if (viewPager2.f119918d > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f119918d < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        public void v(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f119932r) {
                viewPager2.C(i10, true);
            }
        }

        public void w() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            C2507z0.w1(viewPager2, R.id.accessibilityActionPageLeft);
            C2507z0.x1(R.id.accessibilityActionPageRight, viewPager2);
            C2507z0.g1(viewPager2, 0);
            C2507z0.x1(R.id.accessibilityActionPageUp, viewPager2);
            C2507z0.g1(viewPager2, 0);
            C2507z0.x1(R.id.accessibilityActionPageDown, viewPager2);
            C2507z0.g1(viewPager2, 0);
            if (ViewPager2.this.f119924j.getAdapter() == null || (itemCount = ViewPager2.this.f119924j.getAdapter().getItemCount()) == 0) {
                return;
            }
            ViewPager2 viewPager22 = ViewPager2.this;
            if (viewPager22.f119932r) {
                if (viewPager22.f119921g.getOrientation() != 0) {
                    if (ViewPager2.this.f119918d < itemCount - 1) {
                        C2507z0.z1(viewPager2, new AccessibilityNodeInfoCompat.a(R.id.accessibilityActionPageDown, null), null, this.f119942b);
                    }
                    if (ViewPager2.this.f119918d > 0) {
                        C2507z0.z1(viewPager2, new AccessibilityNodeInfoCompat.a(R.id.accessibilityActionPageUp, null), null, this.f119943c);
                        return;
                    }
                    return;
                }
                boolean zR = ViewPager2.this.r();
                int i11 = zR ? 16908360 : 16908361;
                if (zR) {
                    i10 = 16908361;
                }
                if (ViewPager2.this.f119918d < itemCount - 1) {
                    C2507z0.z1(viewPager2, new AccessibilityNodeInfoCompat.a(i11, null), null, this.f119942b);
                }
                if (ViewPager2.this.f119918d > 0) {
                    C2507z0.z1(viewPager2, new AccessibilityNodeInfoCompat.a(i10, null), null, this.f119943c);
                }
            }
        }
    }

    public interface m {
        void transformPage(@NonNull View view, float f10);
    }

    public class n extends y {
        public n() {
        }

        @Override // androidx.recyclerview.widget.y, androidx.recyclerview.widget.D
        @Nullable
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.q()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    public class o extends RecyclerView {
        public o(@NonNull Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @T(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f119934t.d() ? ViewPager2.this.f119934t.n() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f119918d);
            accessibilityEvent.setToIndex(ViewPager2.this.f119918d);
            ViewPager2.this.f119934t.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f119932r && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.f119932r && super.onTouchEvent(motionEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface p {
    }

    public static class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f119951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f119952b;

        public q(int i10, RecyclerView recyclerView) {
            this.f119951a = i10;
            this.f119952b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f119952b.smoothScrollToPosition(this.f119951a);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f119915a = new Rect();
        this.f119916b = new Rect();
        this.f119917c = new androidx.viewpager2.widget.b(3);
        this.f119919e = false;
        this.f119920f = new a();
        this.f119922h = -1;
        this.f119930p = null;
        this.f119931q = false;
        this.f119932r = true;
        this.f119933s = -1;
        o(context, null);
    }

    public void A(int i10) {
        B(i10, true);
    }

    public void B(int i10, boolean z10) {
        if (q()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        C(i10, z10);
    }

    public void C(int i10, boolean z10) {
        RecyclerView.Adapter adapter = this.f119924j.getAdapter();
        if (adapter == null) {
            if (this.f119922h != -1) {
                this.f119922h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        if (iMin == this.f119918d && this.f119926l.i()) {
            return;
        }
        int i11 = this.f119918d;
        if (iMin == i11 && z10) {
            return;
        }
        double dE = i11;
        this.f119918d = iMin;
        this.f119934t.q();
        if (!this.f119926l.i()) {
            dE = this.f119926l.e();
        }
        this.f119926l.n(iMin, z10);
        if (!z10) {
            this.f119924j.scrollToPosition(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dE) <= 3.0d) {
            this.f119924j.smoothScrollToPosition(iMin);
            return;
        }
        this.f119924j.scrollToPosition(d10 > dE ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f119924j;
        recyclerView.post(new q(iMin, recyclerView));
    }

    public void D(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f119933s = i10;
        this.f119924j.requestLayout();
    }

    public void E(int i10) {
        this.f119921g.setOrientation(i10);
        this.f119934t.r();
    }

    public final void F(Context context, AttributeSet attributeSet) {
        int[] iArr = a.j.f34239d0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        }
        try {
            E(typedArrayObtainStyledAttributes.getInt(a.j.f34241e0, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void G(@Nullable m mVar) {
        if (mVar != null) {
            if (!this.f119931q) {
                this.f119930p = this.f119924j.getItemAnimator();
                this.f119931q = true;
            }
            this.f119924j.setItemAnimator(null);
        } else if (this.f119931q) {
            this.f119924j.setItemAnimator(this.f119930p);
            this.f119930p = null;
            this.f119931q = false;
        }
        androidx.viewpager2.widget.f fVar = this.f119929o;
        if (mVar == fVar.f119968b) {
            return;
        }
        fVar.f119968b = mVar;
        x();
    }

    public void H(boolean z10) {
        this.f119932r = z10;
        this.f119934t.s();
    }

    public void I() {
        View viewFindSnapView = this.f119925k.findSnapView(this.f119921g);
        if (viewFindSnapView == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = this.f119925k.calculateDistanceToFinalSnap(this.f119921g, viewFindSnapView);
        int i10 = iArrCalculateDistanceToFinalSnap[0];
        if (i10 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.f119924j.smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
    }

    public final void J(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f119920f);
        }
    }

    public void K(@NonNull j jVar) {
        this.f119917c.b(jVar);
    }

    public void L() {
        y yVar = this.f119925k;
        if (yVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = yVar.findSnapView(this.f119921g);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f119921g.getPosition(viewFindSnapView);
        if (position != this.f119918d && this.f119926l.f119980f == 0) {
            this.f119927m.onPageSelected(position);
        }
        this.f119919e = false;
    }

    public void a(@NonNull RecyclerView.n nVar) {
        this.f119924j.addItemDecoration(nVar);
    }

    public void b(@NonNull RecyclerView.n nVar, int i10) {
        this.f119924j.addItemDecoration(nVar, i10);
    }

    public boolean c() {
        return this.f119928n.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f119924j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f119924j.canScrollVertically(i10);
    }

    public boolean d() {
        return this.f119928n.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).mRecyclerViewId;
            sparseArray.put(this.f119924j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        y();
    }

    public final RecyclerView.o e() {
        return new d();
    }

    public boolean f(@P @SuppressLint({"SupportAnnotationUsage"}) float f10) {
        return this.f119928n.e(f10);
    }

    @Nullable
    public RecyclerView.Adapter g() {
        return this.f119924j.getAdapter();
    }

    @Override // android.view.ViewGroup, android.view.View
    @T(23)
    public CharSequence getAccessibilityClassName() {
        return this.f119934t.a() ? this.f119934t.g() : super.getAccessibilityClassName();
    }

    public int h() {
        return this.f119918d;
    }

    @NonNull
    public RecyclerView.n i(int i10) {
        return this.f119924j.getItemDecorationAt(i10);
    }

    public int j() {
        return this.f119924j.getItemDecorationCount();
    }

    public int k() {
        return this.f119933s;
    }

    public int l() {
        return this.f119921g.getOrientation();
    }

    public int m() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f119924j;
        if (this.f119921g.getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int n() {
        return this.f119926l.f119980f;
    }

    public final void o(Context context, AttributeSet attributeSet) {
        this.f119934t = f119908A ? new l() : new f();
        o oVar = new o(context);
        this.f119924j = oVar;
        oVar.setId(C2507z0.D());
        this.f119924j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f119921g = hVar;
        this.f119924j.setLayoutManager(hVar);
        this.f119924j.setScrollingTouchSlop(1);
        F(context, attributeSet);
        this.f119924j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f119924j.addOnChildAttachStateChangeListener(new d());
        androidx.viewpager2.widget.g gVar = new androidx.viewpager2.widget.g(this);
        this.f119926l = gVar;
        this.f119928n = new androidx.viewpager2.widget.d(this, gVar, this.f119924j);
        n nVar = new n();
        this.f119925k = nVar;
        nVar.attachToRecyclerView(this.f119924j);
        this.f119924j.addOnScrollListener(this.f119926l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f119927m = bVar;
        this.f119926l.f119975a = bVar;
        b bVar2 = new b();
        c cVar = new c();
        bVar.a(bVar2);
        this.f119927m.a(cVar);
        this.f119934t.h(this.f119927m, this.f119924j);
        this.f119927m.a(this.f119917c);
        androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(this.f119921g);
        this.f119929o = fVar;
        this.f119927m.a(fVar);
        RecyclerView recyclerView = this.f119924j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f119934t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f119924j.getMeasuredWidth();
        int measuredHeight = this.f119924j.getMeasuredHeight();
        this.f119915a.left = getPaddingLeft();
        this.f119915a.right = (i12 - i10) - getPaddingRight();
        this.f119915a.top = getPaddingTop();
        this.f119915a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f119915a, this.f119916b);
        RecyclerView recyclerView = this.f119924j;
        Rect rect = this.f119916b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f119919e) {
            L();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f119924j, i10, i11);
        int measuredWidth = this.f119924j.getMeasuredWidth();
        int measuredHeight = this.f119924j.getMeasuredHeight();
        int measuredState = this.f119924j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f119922h = savedState.mCurrentItem;
        this.f119923i = savedState.mAdapterState;
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = this.f119924j.getId();
        int i10 = this.f119922h;
        if (i10 == -1) {
            i10 = this.f119918d;
        }
        savedState.mCurrentItem = i10;
        Parcelable parcelable = this.f119923i;
        if (parcelable != null) {
            savedState.mAdapterState = parcelable;
            return savedState;
        }
        Object adapter = this.f119924j.getAdapter();
        if (adapter instanceof G2.c) {
            savedState.mAdapterState = ((G2.c) adapter).a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public void p() {
        this.f119924j.invalidateItemDecorations();
    }

    @Override // android.view.View
    @T(16)
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f119934t.c(i10, bundle) ? this.f119934t.l(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public boolean q() {
        return this.f119928n.f119959b.f119987m;
    }

    public boolean r() {
        return this.f119921g.getLayoutDirection() == 1;
    }

    public boolean s() {
        return this.f119932r;
    }

    @Override // android.view.View
    @T(17)
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f119934t.p();
    }

    public final void t(@Nullable RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f119920f);
        }
    }

    public void u(@NonNull j jVar) {
        this.f119917c.a(jVar);
    }

    public void v(@NonNull RecyclerView.n nVar) {
        this.f119924j.removeItemDecoration(nVar);
    }

    public void w(int i10) {
        this.f119924j.removeItemDecorationAt(i10);
    }

    public void x() {
        if (this.f119929o.f119968b == null) {
            return;
        }
        double dE = this.f119926l.e();
        int i10 = (int) dE;
        float f10 = (float) (dE - ((double) i10));
        this.f119929o.onPageScrolled(i10, f10, Math.round(m() * f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        RecyclerView.Adapter adapter;
        if (this.f119922h == -1 || (adapter = this.f119924j.getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f119923i;
        if (parcelable != null) {
            if (adapter instanceof G2.c) {
                ((G2.c) adapter).g(parcelable);
            }
            this.f119923i = null;
        }
        int iMax = Math.max(0, Math.min(this.f119922h, adapter.getItemCount() - 1));
        this.f119918d = iMax;
        this.f119922h = -1;
        this.f119924j.scrollToPosition(iMax);
        this.f119934t.m();
    }

    public void z(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f119924j.getAdapter();
        this.f119934t.f(adapter2);
        J(adapter2);
        this.f119924j.setAdapter(adapter);
        this.f119918d = 0;
        y();
        this.f119934t.e(adapter);
        t(adapter);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        Parcelable mAdapterState;
        int mCurrentItem;
        int mRecyclerViewId;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public SavedState c(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            public SavedState[] e(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }
        }

        @T(24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readValues(parcel, classLoader);
        }

        private void readValues(Parcel parcel, ClassLoader classLoader) {
            this.mRecyclerViewId = parcel.readInt();
            this.mCurrentItem = parcel.readInt();
            this.mAdapterState = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, i10);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            readValues(parcel, null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f119915a = new Rect();
        this.f119916b = new Rect();
        this.f119917c = new androidx.viewpager2.widget.b(3);
        this.f119919e = false;
        this.f119920f = new a();
        this.f119922h = -1;
        this.f119930p = null;
        this.f119931q = false;
        this.f119932r = true;
        this.f119933s = -1;
        o(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f119915a = new Rect();
        this.f119916b = new Rect();
        this.f119917c = new androidx.viewpager2.widget.b(3);
        this.f119919e = false;
        this.f119920f = new a();
        this.f119922h = -1;
        this.f119930p = null;
        this.f119931q = false;
        this.f119932r = true;
        this.f119933s = -1;
        o(context, attributeSet);
    }

    @T(21)
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f119915a = new Rect();
        this.f119916b = new Rect();
        this.f119917c = new androidx.viewpager2.widget.b(3);
        this.f119919e = false;
        this.f119920f = new a();
        this.f119922h = -1;
        this.f119930p = null;
        this.f119931q = false;
        this.f119932r = true;
        this.f119933s = -1;
        o(context, attributeSet);
    }
}
