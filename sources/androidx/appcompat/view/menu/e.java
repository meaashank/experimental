package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.G;
import androidx.appcompat.widget.H;
import androidx.core.view.C2507z0;
import e.InterfaceC4332f;
import e.a0;
import g.C4426a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements o, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f85561B = C4426a.j.f201356l;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f85562C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f85563D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f85564E = 200;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f85565A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f85566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f85570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f85571g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f85579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f85580p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f85582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f85583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f85584t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f85585u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f85587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o.a f85588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f85589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f85590z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<h> f85572h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<d> f85573i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f85574j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f85575k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final G f85576l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85577m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f85578n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f85586v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f85581q = u();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!e.this.a() || e.this.f85573i.size() <= 0 || e.this.f85573i.get(0).f85598a.J()) {
                return;
            }
            View view = e.this.f85580p;
            if (view == null || !view.isShown()) {
                e.this.dismiss();
                return;
            }
            Iterator<d> it = e.this.f85573i.iterator();
            while (it.hasNext()) {
                it.next().f85598a.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = e.this.f85589y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    e.this.f85589y = view.getViewTreeObserver();
                }
                e eVar = e.this;
                eVar.f85589y.removeGlobalOnLayoutListener(eVar.f85574j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements G {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f85594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenuItem f85595b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f85596c;

            public a(d dVar, MenuItem menuItem, h hVar) {
                this.f85594a = dVar;
                this.f85595b = menuItem;
                this.f85596c = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f85594a;
                if (dVar != null) {
                    e.this.f85565A = true;
                    dVar.f85599b.close(false);
                    e.this.f85565A = false;
                }
                if (this.f85595b.isEnabled() && this.f85595b.hasSubMenu()) {
                    this.f85596c.performItemAction(this.f85595b, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.G
        public void b(@NonNull h hVar, @NonNull MenuItem menuItem) {
            e.this.f85571g.removeCallbacksAndMessages(null);
            int size = e.this.f85573i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (hVar == e.this.f85573i.get(i10).f85599b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            e.this.f85571g.postAtTime(new a(i11 < e.this.f85573i.size() ? e.this.f85573i.get(i11) : null, menuItem, hVar), hVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.G
        public void h(@NonNull h hVar, @NonNull MenuItem menuItem) {
            e.this.f85571g.removeCallbacksAndMessages(hVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H f85598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f85599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f85600c;

        public d(@NonNull H h10, @NonNull h hVar, int i10) {
            this.f85598a = h10;
            this.f85599b = hVar;
            this.f85600c = i10;
        }

        public ListView a() {
            return this.f85598a.i();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.e$e, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0164e {
    }

    public e(@NonNull Context context, @NonNull View view, @InterfaceC4332f int i10, @a0 int i11, boolean z10) {
        this.f85566b = context;
        this.f85579o = view;
        this.f85568d = i10;
        this.f85569e = i11;
        this.f85570f = z10;
        Resources resources = context.getResources();
        this.f85567c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C4426a.e.f201155x));
        this.f85571g = new Handler();
    }

    @Override // androidx.appcompat.view.menu.r
    public boolean a() {
        return this.f85573i.size() > 0 && this.f85573i.get(0).f85598a.a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void b(h hVar) {
        hVar.addMenuPresenter(this, this.f85566b);
        if (a()) {
            w(hVar);
        } else {
            this.f85572h.add(hVar);
        }
    }

    @Override // androidx.appcompat.view.menu.r
    public void dismiss() {
        int size = this.f85573i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f85573i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f85598a.a()) {
                    dVar.f85598a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(@NonNull View view) {
        if (this.f85579o != view) {
            this.f85579o = view;
            this.f85578n = Gravity.getAbsoluteGravity(this.f85577m, C2507z0.c0(view));
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(boolean z10) {
        this.f85586v = z10;
    }

    @Override // androidx.appcompat.view.menu.r
    public ListView i() {
        if (this.f85573i.isEmpty()) {
            return null;
        }
        return ((d) androidx.appcompat.view.menu.d.a(this.f85573i, 1)).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(int i10) {
        if (this.f85577m != i10) {
            this.f85577m = i10;
            this.f85578n = Gravity.getAbsoluteGravity(i10, C2507z0.c0(this.f85579o));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(int i10) {
        this.f85582r = true;
        this.f85584t = i10;
    }

    @Override // androidx.appcompat.view.menu.m
    public void l(PopupWindow.OnDismissListener onDismissListener) {
        this.f85590z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.m
    public void m(boolean z10) {
        this.f85587w = z10;
    }

    @Override // androidx.appcompat.view.menu.m
    public void n(int i10) {
        this.f85583s = true;
        this.f85585u = i10;
    }

    @Override // androidx.appcompat.view.menu.o
    public void onCloseMenu(h hVar, boolean z10) {
        int iR = r(hVar);
        if (iR < 0) {
            return;
        }
        int i10 = iR + 1;
        if (i10 < this.f85573i.size()) {
            this.f85573i.get(i10).f85599b.close(false);
        }
        d dVarRemove = this.f85573i.remove(iR);
        dVarRemove.f85599b.removeMenuPresenter(this);
        if (this.f85565A) {
            dVarRemove.f85598a.o0(null);
            dVarRemove.f85598a.R(0);
        }
        dVarRemove.f85598a.dismiss();
        int size = this.f85573i.size();
        if (size > 0) {
            this.f85581q = this.f85573i.get(size - 1).f85600c;
        } else {
            this.f85581q = u();
        }
        if (size != 0) {
            if (z10) {
                this.f85573i.get(0).f85599b.close(false);
                return;
            }
            return;
        }
        dismiss();
        o.a aVar = this.f85588x;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f85589y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f85589y.removeGlobalOnLayoutListener(this.f85574j);
            }
            this.f85589y = null;
        }
        this.f85580p.removeOnAttachStateChangeListener(this.f85575k);
        this.f85590z.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f85573i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f85573i.get(i10);
            if (!dVar.f85598a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f85599b.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.o
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean onSubMenuSelected(t tVar) {
        for (d dVar : this.f85573i) {
            if (tVar == dVar.f85599b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        b(tVar);
        o.a aVar = this.f85588x;
        if (aVar != null) {
            aVar.a(tVar);
        }
        return true;
    }

    public final H q() {
        H h10 = new H(this.f85566b, null, this.f85568d, this.f85569e);
        h10.f85974T = this.f85576l;
        h10.f86052u = this;
        h10.c0(this);
        h10.f86050s = this.f85579o;
        h10.f86043l = this.f85578n;
        h10.b0(true);
        h10.Y(2);
        return h10;
    }

    public final int r(@NonNull h hVar) {
        int size = this.f85573i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (hVar == this.f85573i.get(i10).f85599b) {
                return i10;
            }
        }
        return -1;
    }

    public final MenuItem s(@NonNull h hVar, @NonNull h hVar2) {
        int size = hVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = hVar.getItem(i10);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.o
    public void setCallback(o.a aVar) {
        this.f85588x = aVar;
    }

    @Override // androidx.appcompat.view.menu.r
    public void show() {
        if (a()) {
            return;
        }
        Iterator<h> it = this.f85572h.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
        this.f85572h.clear();
        View view = this.f85579o;
        this.f85580p = view;
        if (view != null) {
            boolean z10 = this.f85589y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f85589y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f85574j);
            }
            this.f85580p.addOnAttachStateChangeListener(this.f85575k);
        }
    }

    @Nullable
    public final View t(@NonNull d dVar, @NonNull h hVar) {
        g gVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemS = s(dVar.f85599b, hVar);
        if (menuItemS == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            gVar = (g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (g) adapter;
            headersCount = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemS == gVar.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int u() {
        return C2507z0.c0(this.f85579o) == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.o
    public void updateMenuView(boolean z10) {
        Iterator<d> it = this.f85573i.iterator();
        while (it.hasNext()) {
            m.p(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v(int r7) {
        /*
            r6 = this;
            java.util.List<androidx.appcompat.view.menu.e$d> r0 = r6.f85573i
            r1 = 1
            java.lang.Object r0 = androidx.appcompat.view.menu.d.a(r0, r1)
            androidx.appcompat.view.menu.e$d r0 = (androidx.appcompat.view.menu.e.d) r0
            android.widget.ListView r0 = r0.a()
            r2 = 2
            int[] r2 = new int[r2]
            r0.getLocationOnScreen(r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.view.View r4 = r6.f85580p
            r4.getWindowVisibleDisplayFrame(r3)
            int r4 = r6.f85581q
            r5 = 0
            if (r4 != r1) goto L2f
            r2 = r2[r5]
            int r0 = r0.getWidth()
            int r0 = r0 + r2
            int r0 = r0 + r7
            int r7 = r3.right
            if (r0 <= r7) goto L34
            goto L35
        L2f:
            r0 = r2[r5]
            int r0 = r0 - r7
            if (r0 >= 0) goto L35
        L34:
            return r1
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.v(int):int");
    }

    public final void w(@NonNull h hVar) {
        d dVar;
        View viewT;
        int i10;
        int i11;
        int width;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f85566b);
        g gVar = new g(hVar, layoutInflaterFrom, this.f85570f, f85561B);
        if (!a() && this.f85586v) {
            gVar.f85617c = true;
        } else if (a()) {
            gVar.f85617c = m.o(hVar);
        }
        int iE = m.e(gVar, null, this.f85566b, this.f85567c);
        H hQ = q();
        hQ.o(gVar);
        hQ.S(iE);
        hQ.f86043l = this.f85578n;
        if (this.f85573i.size() > 0) {
            dVar = (d) androidx.appcompat.view.menu.d.a(this.f85573i, 1);
            viewT = t(dVar, hVar);
        } else {
            dVar = null;
            viewT = null;
        }
        if (viewT != null) {
            hQ.q0(false);
            hQ.n0(null);
            int iV = v(iE);
            boolean z10 = iV == 1;
            this.f85581q = iV;
            if (Build.VERSION.SDK_INT >= 26) {
                hQ.f86050s = viewT;
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f85579o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewT.getLocationOnScreen(iArr2);
                if ((this.f85578n & 7) == 5) {
                    iArr[0] = this.f85579o.getWidth() + iArr[0];
                    iArr2[0] = viewT.getWidth() + iArr2[0];
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f85578n & 5) != 5) {
                width = z10 ? i10 + viewT.getWidth() : i10 - iE;
                hQ.f86037f = width;
                hQ.f0(true);
                hQ.d(i11);
            } else if (z10) {
                width = i10 + iE;
                hQ.f86037f = width;
                hQ.f0(true);
                hQ.d(i11);
            } else {
                iE = viewT.getWidth();
                hQ.f86037f = width;
                hQ.f0(true);
                hQ.d(i11);
            }
        } else {
            if (this.f85582r) {
                hQ.f86037f = this.f85584t;
            }
            if (this.f85583s) {
                hQ.d(this.f85585u);
            }
            hQ.V(this.f85678a);
        }
        this.f85573i.add(new d(hQ, hVar, this.f85581q));
        hQ.show();
        C c10 = hQ.f86034c;
        c10.setOnKeyListener(this);
        if (dVar == null && this.f85587w && hVar.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C4426a.j.f201363s, (ViewGroup) c10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(hVar.getHeaderTitle());
            c10.addHeaderView(frameLayout, null, false);
            hQ.show();
        }
    }
}
