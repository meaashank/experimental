package l;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.I0;
import androidx.core.view.J0;
import androidx.core.view.K0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f220889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public J0 f220890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f220891e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f220888b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K0 f220892f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<I0> f220887a = new ArrayList<>();

    public class a extends K0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f220893a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f220894b = 0;

        public a() {
        }

        @Override // androidx.core.view.K0, androidx.core.view.J0
        public void b(View view) {
            int i10 = this.f220894b + 1;
            this.f220894b = i10;
            if (i10 == h.this.f220887a.size()) {
                J0 j02 = h.this.f220890d;
                if (j02 != null) {
                    j02.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.K0, androidx.core.view.J0
        public void c(View view) {
            if (this.f220893a) {
                return;
            }
            this.f220893a = true;
            J0 j02 = h.this.f220890d;
            if (j02 != null) {
                j02.c(null);
            }
        }

        public void d() {
            this.f220894b = 0;
            this.f220893a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f220891e) {
            ArrayList<I0> arrayList = this.f220887a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                I0 i02 = arrayList.get(i10);
                i10++;
                i02.d();
            }
            this.f220891e = false;
        }
    }

    public void b() {
        this.f220891e = false;
    }

    public h c(I0 i02) {
        if (!this.f220891e) {
            this.f220887a.add(i02);
        }
        return this;
    }

    public h d(I0 i02, I0 i03) {
        this.f220887a.add(i02);
        i03.v(i02.e());
        this.f220887a.add(i03);
        return this;
    }

    public h e(long j10) {
        if (!this.f220891e) {
            this.f220888b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f220891e) {
            this.f220889c = interpolator;
        }
        return this;
    }

    public h g(J0 j02) {
        if (!this.f220891e) {
            this.f220890d = j02;
        }
        return this;
    }

    public void h() {
        if (this.f220891e) {
            return;
        }
        ArrayList<I0> arrayList = this.f220887a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            I0 i02 = arrayList.get(i10);
            i10++;
            I0 i03 = i02;
            long j10 = this.f220888b;
            if (j10 >= 0) {
                i03.r(j10);
            }
            Interpolator interpolator = this.f220889c;
            if (interpolator != null) {
                i03.s(interpolator);
            }
            if (this.f220890d != null) {
                i03.t(this.f220892f);
            }
            i03.x();
        }
        this.f220891e = true;
    }
}
