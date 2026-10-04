package l;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.t;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l.AbstractC5126b;

/* JADX INFO: renamed from: l.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C5129e extends AbstractC5126b implements h.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f220820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f220821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC5126b.a f220822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference<View> f220823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f220824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f220825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.h f220826i;

    public C5129e(Context context, ActionBarContextView actionBarContextView, AbstractC5126b.a aVar, boolean z10) {
        this.f220820c = context;
        this.f220821d = actionBarContextView;
        this.f220822e = aVar;
        androidx.appcompat.view.menu.h defaultShowAsAction = new androidx.appcompat.view.menu.h(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f220826i = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f220825h = z10;
    }

    @Override // l.AbstractC5126b
    public void a() {
        if (this.f220824g) {
            return;
        }
        this.f220824g = true;
        this.f220822e.d(this);
    }

    @Override // l.AbstractC5126b
    public View b() {
        WeakReference<View> weakReference = this.f220823f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC5126b
    public Menu c() {
        return this.f220826i;
    }

    @Override // l.AbstractC5126b
    public MenuInflater d() {
        return new g(this.f220821d.getContext());
    }

    @Override // l.AbstractC5126b
    public CharSequence e() {
        return this.f220821d.t();
    }

    @Override // l.AbstractC5126b
    public CharSequence g() {
        return this.f220821d.u();
    }

    @Override // l.AbstractC5126b
    public void i() {
        this.f220822e.c(this, this.f220826i);
    }

    @Override // l.AbstractC5126b
    public boolean j() {
        return this.f220821d.x();
    }

    @Override // l.AbstractC5126b
    public boolean k() {
        return this.f220825h;
    }

    @Override // l.AbstractC5126b
    public void l(View view) {
        this.f220821d.z(view);
        this.f220823f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // l.AbstractC5126b
    public void m(int i10) {
        n(this.f220820c.getString(i10));
    }

    @Override // l.AbstractC5126b
    public void n(CharSequence charSequence) {
        this.f220821d.A(charSequence);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean onMenuItemSelected(@NonNull androidx.appcompat.view.menu.h hVar, @NonNull MenuItem menuItem) {
        return this.f220822e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void onMenuModeChange(@NonNull androidx.appcompat.view.menu.h hVar) {
        i();
        this.f220821d.r();
    }

    @Override // l.AbstractC5126b
    public void p(int i10) {
        q(this.f220820c.getString(i10));
    }

    @Override // l.AbstractC5126b
    public void q(CharSequence charSequence) {
        this.f220821d.B(charSequence);
    }

    @Override // l.AbstractC5126b
    public void r(boolean z10) {
        this.f220813b = z10;
        this.f220821d.C(z10);
    }

    public boolean u(t tVar) {
        if (!tVar.hasVisibleItems()) {
            return true;
        }
        new n(this.f220821d.getContext(), tVar).l();
        return true;
    }

    public void t(t tVar) {
    }

    public void s(androidx.appcompat.view.menu.h hVar, boolean z10) {
    }
}
