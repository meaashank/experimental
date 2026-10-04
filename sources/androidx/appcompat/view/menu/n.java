package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.o;
import androidx.core.view.C2507z0;
import androidx.core.view.E;
import e.InterfaceC4332f;
import e.InterfaceC4345t;
import e.T;
import e.a0;
import g.C4426a;
import q8.C5443b;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class n implements j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f85679m = 48;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f85680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f85681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f85685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f85687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o.a f85688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f85689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f85690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f85691l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            n.this.g();
        }
    }

    @T(17)
    public static class b {
        @InterfaceC4345t
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public n(@NonNull Context context, @NonNull h hVar) {
        this(context, hVar, null, false, C4426a.b.f200976z2, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(@Nullable o.a aVar) {
        this.f85688i = aVar;
        m mVar = this.f85689j;
        if (mVar != null) {
            mVar.setCallback(aVar);
        }
    }

    @NonNull
    public final m b() {
        Display defaultDisplay = ((WindowManager) this.f85680a.getSystemService(C5443b.f226850e)).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        m eVar = Math.min(point.x, point.y) >= this.f85680a.getResources().getDimensionPixelSize(C4426a.e.f201153w) ? new e(this.f85680a, this.f85685f, this.f85683d, this.f85684e, this.f85682c) : new s(this.f85680a, this.f85681b, this.f85685f, this.f85683d, this.f85684e, this.f85682c);
        eVar.b(this.f85681b);
        eVar.l(this.f85691l);
        eVar.f(this.f85685f);
        eVar.setCallback(this.f85688i);
        eVar.h(this.f85687h);
        eVar.j(this.f85686g);
        return eVar;
    }

    public int c() {
        return this.f85686g;
    }

    public ListView d() {
        return e().i();
    }

    @Override // androidx.appcompat.view.menu.j
    public void dismiss() {
        if (f()) {
            this.f85689j.dismiss();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public m e() {
        if (this.f85689j == null) {
            this.f85689j = b();
        }
        return this.f85689j;
    }

    public boolean f() {
        m mVar = this.f85689j;
        return mVar != null && mVar.a();
    }

    public void g() {
        this.f85689j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f85690k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@NonNull View view) {
        this.f85685f = view;
    }

    public void i(boolean z10) {
        this.f85687h = z10;
        m mVar = this.f85689j;
        if (mVar != null) {
            mVar.h(z10);
        }
    }

    public void j(int i10) {
        this.f85686g = i10;
    }

    public void k(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.f85690k = onDismissListener;
    }

    public void l() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i10, int i11) {
        if (!p(i10, i11)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void n(int i10, int i11, boolean z10, boolean z11) {
        m mVarE = e();
        mVarE.m(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f85686g, C2507z0.c0(this.f85685f)) & 7) == 5) {
                i10 -= this.f85685f.getWidth();
            }
            mVarE.k(i10);
            mVarE.n(i11);
            int i12 = (int) ((this.f85680a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            mVarE.g(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        mVarE.show();
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f85685f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i10, int i11) {
        if (f()) {
            return true;
        }
        if (this.f85685f == null) {
            return false;
        }
        n(i10, i11, true, true);
        return true;
    }

    public n(@NonNull Context context, @NonNull h hVar, @NonNull View view) {
        this(context, hVar, view, false, C4426a.b.f200976z2, 0);
    }

    public n(@NonNull Context context, @NonNull h hVar, @NonNull View view, boolean z10, @InterfaceC4332f int i10) {
        this(context, hVar, view, z10, i10, 0);
    }

    public n(@NonNull Context context, @NonNull h hVar, @NonNull View view, boolean z10, @InterfaceC4332f int i10, @a0 int i11) {
        this.f85686g = E.f111493b;
        this.f85691l = new a();
        this.f85680a = context;
        this.f85681b = hVar;
        this.f85685f = view;
        this.f85682c = z10;
        this.f85683d = i10;
        this.f85684e = i11;
    }
}
