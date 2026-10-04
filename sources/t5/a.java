package T5;

import Q5.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.permissionx.guolindev.request.x;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f68340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f68341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f68342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f68343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f68345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public S5.a f68346g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull List<String> permissions, @NotNull String message, @NotNull String positiveText, @Nullable String str, int i10, int i11) {
        super(context, d.m.f66997f2);
        G.p(context, "context");
        G.p(permissions, "permissions");
        G.p(message, "message");
        G.p(positiveText, "positiveText");
        this.f68340a = permissions;
        this.f68341b = message;
        this.f68342c = positiveText;
        this.f68343d = str;
        this.f68344e = i10;
        this.f68345f = i11;
    }

    @Override // T5.c
    @Nullable
    public View a() {
        if (this.f68343d == null) {
            return null;
        }
        S5.a aVar = this.f68346g;
        if (aVar != null) {
            return aVar.f68123c;
        }
        G.S("binding");
        throw null;
    }

    @Override // T5.c
    @NotNull
    public List<String> b() {
        return this.f68340a;
    }

    @Override // T5.c
    @NotNull
    public View c() {
        S5.a aVar = this.f68346g;
        if (aVar == null) {
            G.S("binding");
            throw null;
        }
        Button button = aVar.f68126f;
        G.o(button, "binding.positiveBtn");
        return button;
    }

    public final void d() {
        String str;
        HashSet hashSet = new HashSet();
        int i10 = Build.VERSION.SDK_INT;
        for (String str2 : this.f68340a) {
            if (i10 < 29) {
                try {
                    str = getContext().getPackageManager().getPermissionInfo(str2, 0).group;
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.printStackTrace();
                    str = null;
                }
            } else {
                str = i10 == 29 ? b.b().get(str2) : i10 == 30 ? b.c().get(str2) : i10 == 31 ? b.d().get(str2) : i10 == 33 ? b.e().get(str2) : b.e().get(str2);
            }
            if ((b.a().contains(str2) && !hashSet.contains(str2)) || (str != null && !hashSet.contains(str))) {
                LayoutInflater layoutInflater = getLayoutInflater();
                S5.a aVar = this.f68346g;
                if (aVar == null) {
                    G.S("binding");
                    throw null;
                }
                S5.b bVarD = S5.b.d(layoutInflater, aVar.f68125e, false);
                if (G.g(str2, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    bVarD.f68130c.setText(getContext().getString(d.l.f66755B));
                    ImageView imageView = bVarD.f68129b;
                    PackageManager packageManager = getContext().getPackageManager();
                    G.m(str);
                    imageView.setImageResource(packageManager.getPermissionGroupInfo(str, 0).icon);
                } else if (G.g(str2, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    bVarD.f68130c.setText(getContext().getString(d.l.f66760G));
                    bVarD.f68129b.setImageResource(d.g.f66477W0);
                } else if (G.g(str2, "android.permission.WRITE_SETTINGS")) {
                    bVarD.f68130c.setText(getContext().getString(d.l.f66761H));
                    bVarD.f68129b.setImageResource(d.g.f66483Z0);
                } else if (G.g(str2, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    bVarD.f68130c.setText(getContext().getString(d.l.f66757D));
                    ImageView imageView2 = bVarD.f68129b;
                    PackageManager packageManager2 = getContext().getPackageManager();
                    G.m(str);
                    imageView2.setImageResource(packageManager2.getPermissionGroupInfo(str, 0).icon);
                } else if (G.g(str2, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    bVarD.f68130c.setText(getContext().getString(d.l.f66759F));
                    bVarD.f68129b.setImageResource(d.g.f66479X0);
                } else if (G.g(str2, "android.permission.POST_NOTIFICATIONS") && Build.VERSION.SDK_INT < 33) {
                    bVarD.f68130c.setText(getContext().getString(d.l.f66758E));
                    bVarD.f68129b.setImageResource(d.g.f66481Y0);
                } else if (G.g(str2, x.f161795f)) {
                    bVarD.f68130c.setText(getContext().getString(d.l.f66756C));
                    ImageView imageView3 = bVarD.f68129b;
                    PackageManager packageManager3 = getContext().getPackageManager();
                    G.m(str);
                    imageView3.setImageResource(packageManager3.getPermissionGroupInfo(str, 0).icon);
                } else {
                    TextView textView = bVarD.f68130c;
                    Context context = getContext();
                    PackageManager packageManager4 = getContext().getPackageManager();
                    G.m(str);
                    textView.setText(context.getString(packageManager4.getPermissionGroupInfo(str, 0).labelRes));
                    bVarD.f68129b.setImageResource(getContext().getPackageManager().getPermissionGroupInfo(str, 0).icon);
                }
                if (e()) {
                    int i11 = this.f68345f;
                    if (i11 != -1) {
                        bVarD.f68129b.setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                    }
                } else {
                    int i12 = this.f68344e;
                    if (i12 != -1) {
                        bVarD.f68129b.setColorFilter(i12, PorterDuff.Mode.SRC_ATOP);
                    }
                }
                S5.a aVar2 = this.f68346g;
                if (aVar2 == null) {
                    G.S("binding");
                    throw null;
                }
                aVar2.f68125e.addView(bVarD.f68128a);
                if (str != null) {
                    str2 = str;
                }
                hashSet.add(str2);
            }
        }
    }

    public final boolean e() {
        return (getContext().getResources().getConfiguration().uiMode & 48) == 32;
    }

    public final boolean f() {
        S5.a aVar = this.f68346g;
        if (aVar != null) {
            return aVar.f68125e.getChildCount() == 0;
        }
        G.S("binding");
        throw null;
    }

    public final void g() {
        S5.a aVar = this.f68346g;
        if (aVar == null) {
            G.S("binding");
            throw null;
        }
        aVar.f68122b.setText(this.f68341b);
        S5.a aVar2 = this.f68346g;
        if (aVar2 == null) {
            G.S("binding");
            throw null;
        }
        aVar2.f68126f.setText(this.f68342c);
        if (this.f68343d != null) {
            S5.a aVar3 = this.f68346g;
            if (aVar3 == null) {
                G.S("binding");
                throw null;
            }
            aVar3.f68124d.setVisibility(0);
            S5.a aVar4 = this.f68346g;
            if (aVar4 == null) {
                G.S("binding");
                throw null;
            }
            aVar4.f68123c.setText(this.f68343d);
        } else {
            S5.a aVar5 = this.f68346g;
            if (aVar5 == null) {
                G.S("binding");
                throw null;
            }
            aVar5.f68124d.setVisibility(8);
        }
        if (e()) {
            int i10 = this.f68345f;
            if (i10 != -1) {
                S5.a aVar6 = this.f68346g;
                if (aVar6 == null) {
                    G.S("binding");
                    throw null;
                }
                aVar6.f68126f.setTextColor(i10);
                S5.a aVar7 = this.f68346g;
                if (aVar7 != null) {
                    aVar7.f68123c.setTextColor(this.f68345f);
                    return;
                } else {
                    G.S("binding");
                    throw null;
                }
            }
            return;
        }
        int i11 = this.f68344e;
        if (i11 != -1) {
            S5.a aVar8 = this.f68346g;
            if (aVar8 == null) {
                G.S("binding");
                throw null;
            }
            aVar8.f68126f.setTextColor(i11);
            S5.a aVar9 = this.f68346g;
            if (aVar9 != null) {
                aVar9.f68123c.setTextColor(this.f68344e);
            } else {
                G.S("binding");
                throw null;
            }
        }
    }

    public final void h() {
        int i10 = getContext().getResources().getDisplayMetrics().widthPixels;
        if (i10 < getContext().getResources().getDisplayMetrics().heightPixels) {
            Window window = getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                window.setGravity(17);
                attributes.width = (int) (((double) i10) * 0.86d);
                window.setAttributes(attributes);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes2 = window2.getAttributes();
            window2.setGravity(17);
            attributes2.width = (int) (((double) i10) * 0.6d);
            window2.setAttributes(attributes2);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        S5.a aVarD = S5.a.d(getLayoutInflater(), null, false);
        this.f68346g = aVarD;
        setContentView(aVarD.f68121a);
        g();
        d();
        h();
    }
}
