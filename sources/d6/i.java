package d6;

import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;
import c6.C2947b;
import com.prism.commons.utils.l0;
import d6.InterfaceC4300a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i<T> extends d<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f194879i = l0.b(i.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressDialog f194880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f194881g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f194882h;

    public i(final Activity activity) {
        this.f194882h = activity.getString(C2947b.m.f129505B);
        d(new InterfaceC4300a.b() { // from class: d6.e
            @Override // d6.InterfaceC4300a.b
            public final void a() {
                this.f194872a.v(activity);
            }
        });
        b(new InterfaceC4300a.InterfaceC0717a() { // from class: d6.f
            @Override // d6.InterfaceC4300a.InterfaceC0717a
            public final void a() {
                this.f194874a.x(activity);
            }
        });
    }

    public final /* synthetic */ void u(Activity activity) {
        if (this.f194880f == null) {
            ProgressDialog progressDialog = new ProgressDialog(activity);
            this.f194880f = progressDialog;
            progressDialog.setCancelable(false);
        }
        Log.d(f194879i, "onBackgroundTaskStart");
        String str = this.f194882h;
        if (str != null) {
            this.f194880f.setTitle(str);
        }
        this.f194880f.show();
    }

    public final /* synthetic */ void v(final Activity activity) {
        if (this.f194881g) {
            activity.runOnUiThread(new Runnable() { // from class: d6.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194876a.u(activity);
                }
            });
        }
    }

    public final /* synthetic */ void w() {
        ProgressDialog progressDialog = this.f194880f;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public final /* synthetic */ void x(Activity activity) {
        Log.d(f194879i, "onBackgroundTaskComplete progressDialog:" + this.f194880f + " showProgress:" + this.f194881g);
        if (this.f194881g) {
            activity.runOnUiThread(new Runnable() { // from class: d6.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194878a.w();
                }
            });
        }
    }

    public void y(String str) {
        this.f194882h = str;
    }

    public void z(boolean z10) {
        this.f194881g = z10;
    }
}
