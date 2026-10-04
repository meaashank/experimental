package c5;

import N4.l;
import android.app.Activity;
import androidx.annotation.Nullable;
import b5.ProgressDialogC2832y0;
import g6.C4455a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0<Actor, Result> extends d6.c<Actor, Result> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ProgressDialogC2832y0 f126316f;

    @Override // d6.c
    public void g() {
        s();
        super.g();
    }

    @Override // d6.c
    public void h() {
        w();
        super.h();
    }

    @Override // d6.c
    public void i() {
        s();
        super.i();
    }

    @Override // d6.c
    public void j(Throwable th, String str) {
        s();
        super.j(th, str);
    }

    @Override // d6.c
    public void k(Result result) {
        s();
        super.k(result);
    }

    public void s() {
        if (this.f126316f == null) {
            return;
        }
        C4455a.b().b().execute(new Runnable() { // from class: c5.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f126314a.u();
            }
        });
    }

    public void t(Activity activity) {
        this.f126316f = new ProgressDialogC2832y0(activity, l.q.f63349K4);
    }

    public final /* synthetic */ void u() {
        try {
            if (this.f126316f.isShowing()) {
                this.f126316f.dismiss();
            }
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void v() {
        try {
            if (this.f126316f.isShowing()) {
                this.f126316f.dismiss();
            }
            this.f126316f.show();
        } catch (Throwable unused) {
        }
    }

    public void w() {
        if (this.f126316f == null) {
            return;
        }
        C4455a.b().b().execute(new Runnable() { // from class: c5.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f126310a.v();
            }
        });
    }
}
