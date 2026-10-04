package l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: l.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5126b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f220813b;

    /* JADX INFO: renamed from: l.b$a */
    public interface a {
        boolean a(AbstractC5126b abstractC5126b, MenuItem menuItem);

        boolean b(AbstractC5126b abstractC5126b, Menu menu);

        boolean c(AbstractC5126b abstractC5126b, Menu menu);

        void d(AbstractC5126b abstractC5126b);
    }

    public abstract void a();

    public abstract View b();

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.f220812a;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.f220813b;
    }

    public abstract void i();

    public boolean j() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean k() {
        return true;
    }

    public abstract void l(View view);

    public abstract void m(int i10);

    public abstract void n(CharSequence charSequence);

    public void o(Object obj) {
        this.f220812a = obj;
    }

    public abstract void p(int i10);

    public abstract void q(CharSequence charSequence);

    public void r(boolean z10) {
        this.f220813b = z10;
    }
}
