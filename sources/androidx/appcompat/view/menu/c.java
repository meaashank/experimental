package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.U0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f85558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public U0<L0.c, MenuItem> f85559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public U0<L0.d, SubMenu> f85560n;

    public c(Context context) {
        this.f85558l = context;
    }

    public final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof L0.c)) {
            return menuItem;
        }
        L0.c cVar = (L0.c) menuItem;
        if (this.f85559m == null) {
            this.f85559m = new U0<>();
        }
        MenuItem menuItem2 = this.f85559m.get(cVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l lVar = new l(this.f85558l, cVar);
        this.f85559m.put(cVar, lVar);
        return lVar;
    }

    public final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof L0.d)) {
            return subMenu;
        }
        L0.d dVar = (L0.d) subMenu;
        if (this.f85560n == null) {
            this.f85560n = new U0<>();
        }
        SubMenu subMenu2 = this.f85560n.get(dVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        u uVar = new u(this.f85558l, dVar);
        this.f85560n.put(dVar, uVar);
        return uVar;
    }

    public final void g() {
        U0<L0.c, MenuItem> u02 = this.f85559m;
        if (u02 != null) {
            u02.clear();
        }
        U0<L0.d, SubMenu> u03 = this.f85560n;
        if (u03 != null) {
            u03.clear();
        }
    }

    public final void h(int i10) {
        if (this.f85559m == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f85559m.size()) {
            if (this.f85559m.i(i11).getGroupId() == i10) {
                this.f85559m.l(i11);
                i11--;
            }
            i11++;
        }
    }

    public final void i(int i10) {
        if (this.f85559m == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f85559m.size(); i11++) {
            if (this.f85559m.i(i11).getItemId() == i10) {
                this.f85559m.l(i11);
                return;
            }
        }
    }
}
