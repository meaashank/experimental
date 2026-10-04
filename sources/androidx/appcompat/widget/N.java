package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.C1498d;
import androidx.core.view.AbstractC2440b;
import g.C4426a;
import h.C4472a;

/* JADX INFO: loaded from: classes.dex */
public class N extends AbstractC2440b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f86094k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f86095l = "share_history.xml";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f86097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f86098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f86099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f86100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1498d.f f86101j;

    public interface a {
        boolean a(N n10, Intent intent);
    }

    public class b implements C1498d.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.C1498d.f
        public boolean a(C1498d c1498d, Intent intent) {
            N n10 = N.this;
            a aVar = n10.f86100i;
            if (aVar == null) {
                return false;
            }
            aVar.a(n10, intent);
            return false;
        }
    }

    public class c implements MenuItem.OnMenuItemClickListener {
        public c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            N n10 = N.this;
            Intent intentB = C1498d.d(n10.f86098g, n10.f86099h).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                N.this.r(intentB);
            }
            N.this.f86098g.startActivity(intentB);
            return true;
        }
    }

    public N(Context context) {
        super(context);
        this.f86096e = 4;
        this.f86097f = new c();
        this.f86099h = f86095l;
        this.f86098g = context;
    }

    @Override // androidx.core.view.AbstractC2440b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f86098g, null);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.a(C1498d.d(this.f86098g, this.f86099h));
        }
        TypedValue typedValue = new TypedValue();
        this.f86098g.getTheme().resolveAttribute(C4426a.b.f200705A, typedValue, true);
        activityChooserView.h(C4472a.b(this.f86098g, typedValue.resourceId));
        activityChooserView.f85840j = this;
        activityChooserView.f85848r = C4426a.k.f201398z;
        activityChooserView.g(C4426a.k.f201397y);
        return activityChooserView;
    }

    @Override // androidx.core.view.AbstractC2440b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        C1498d c1498dD = C1498d.d(this.f86098g, this.f86099h);
        PackageManager packageManager = this.f86098g.getPackageManager();
        int iF = c1498dD.f();
        int iMin = Math.min(iF, this.f86096e);
        for (int i10 = 0; i10 < iMin; i10++) {
            ResolveInfo resolveInfoE = c1498dD.e(i10);
            subMenu.add(0, i10, i10, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(this.f86097f);
        }
        if (iMin < iF) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f86098g.getString(C4426a.k.f201377e));
            for (int i11 = 0; i11 < iF; i11++) {
                ResolveInfo resolveInfoE2 = c1498dD.e(i11);
                subMenuAddSubMenu.add(0, i11, i11, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f86097f);
            }
        }
    }

    public final void n() {
        if (this.f86100i == null) {
            return;
        }
        if (this.f86101j == null) {
            this.f86101j = new b();
        }
        C1498d.d(this.f86098g, this.f86099h).u(this.f86101j);
    }

    public void o(a aVar) {
        this.f86100i = aVar;
        n();
    }

    public void p(String str) {
        this.f86099h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        C1498d.d(this.f86098g, this.f86099h).t(intent);
    }

    public void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
