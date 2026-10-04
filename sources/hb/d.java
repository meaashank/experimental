package hb;

import B0.z;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.commons.ui.ArcProgressBar;
import com.prism.commons.utils.StringUtils;
import com.prism.lib.upgrade.entity.VersionInfo;
import db.C4312b;
import u4.g;

/* JADX INFO: loaded from: classes7.dex */
public class d extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArcProgressBar f202645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f202646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f202647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f202648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f202649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f202650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DialogInterface.OnClickListener f202651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DialogInterface.OnClickListener f202652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public VersionInfo f202653i;

    public d(@NonNull Context context) {
        super(context);
        f();
    }

    public void d(final Context context, VersionInfo versionInfo) {
        this.f202653i = versionInfo;
        boolean zEquals = versionInfo.popupType.equals(g.f239555d);
        String str = context.getString(C4312b.m.f198193M2) + versionInfo.pkgVersionName + "(" + versionInfo.pkgVersionCode + ")\n" + context.getString(C4312b.m.f198185K2) + StringUtils.f(versionInfo.pkgSize) + "B\n" + context.getString(C4312b.m.f198189L2) + StringUtils.b("yyyy-MM-dd HH:mm:ss", versionInfo.upgradeTime) + "\n" + context.getString(C4312b.m.f198181J2) + "\n\t" + versionInfo.upgradeDesc.replace("\n", "\n\t");
        this.f202645a.b(new ArcProgressBar.b(getContext(), context.getApplicationInfo().icon));
        this.f202645a.c(0);
        this.f202645a.setProgress(0);
        this.f202646b.setText(zEquals ? C4312b.m.f198201O2 : C4312b.m.f198197N2);
        this.f202647c.setText(str);
        if (zEquals) {
            this.f202650f.setVisibility(8);
            this.f202649e.setVisibility(8);
        } else {
            this.f202650f.setVisibility(0);
            this.f202649e.setVisibility(0);
        }
        this.f202648d.setOnClickListener(new View.OnClickListener() { // from class: hb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202643a.g(context, view);
            }
        });
    }

    public VersionInfo e() {
        return this.f202653i;
    }

    public final void f() {
        requestWindowFeature(1);
        setContentView(getLayoutInflater().inflate(C4312b.k.f198070a0, (ViewGroup) null));
        this.f202645a = (ArcProgressBar) findViewById(C4312b.h.f197905w4);
        this.f202646b = (TextView) findViewById(C4312b.h.f197651R6);
        this.f202647c = (TextView) findViewById(C4312b.h.f197643Q6);
        this.f202648d = (TextView) findViewById(C4312b.h.f197533D0);
        this.f202649e = (TextView) findViewById(C4312b.h.f197525C0);
        this.f202650f = (ImageView) findViewById(C4312b.h.f197557G0);
        setCancelable(false);
        this.f202650f.setOnClickListener(new View.OnClickListener() { // from class: hb.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202641a.h(view);
            }
        });
        this.f202649e.setOnClickListener(new View.OnClickListener() { // from class: hb.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202642a.i(view);
            }
        });
    }

    public final /* synthetic */ void g(Context context, View view) {
        k(context, 0);
        this.f202645a.c(ArcProgressBar.f161987u);
        DialogInterface.OnClickListener onClickListener = this.f202651g;
        if (onClickListener != null) {
            onClickListener.onClick(this, -1);
        } else if (isShowing()) {
            dismiss();
        }
    }

    public final /* synthetic */ void h(View view) {
        DialogInterface.OnClickListener onClickListener = this.f202652h;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        } else if (isShowing()) {
            dismiss();
        }
    }

    public final /* synthetic */ void i(View view) {
        DialogInterface.OnClickListener onClickListener = this.f202652h;
        if (onClickListener != null) {
            onClickListener.onClick(this, -2);
        } else if (isShowing()) {
            dismiss();
        }
    }

    public void j(boolean z10) {
        this.f202648d.setEnabled(z10);
    }

    public void k(Context context, int i10) {
        this.f202645a.setProgress(i10);
        this.f202646b.setText(context.getString(C4312b.m.f198205P2, z.a(i10, "%")));
    }

    public void l(DialogInterface.OnClickListener onClickListener) {
        this.f202652h = onClickListener;
    }

    public void m(DialogInterface.OnClickListener onClickListener) {
        this.f202651g = onClickListener;
    }

    public d(@NonNull Context context, int i10) {
        super(context, i10);
        f();
    }

    public d(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        f();
    }
}
