package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2643f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f116613d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f116614e = "ChildrenHelper";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f116615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f116616b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<View> f116617c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$a */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f116618c = 64;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f116619d = Long.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f116620a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f116621b;

        public void a(int i10) {
            if (i10 < 64) {
                this.f116620a &= ~(1 << i10);
                return;
            }
            a aVar = this.f116621b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public int b(int i10) {
            a aVar = this.f116621b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f116620a) : Long.bitCount(this.f116620a & ((1 << i10) - 1));
            }
            if (i10 < 64) {
                return Long.bitCount(this.f116620a & ((1 << i10) - 1));
            }
            return Long.bitCount(this.f116620a) + aVar.b(i10 - 64);
        }

        public final void c() {
            if (this.f116621b == null) {
                this.f116621b = new a();
            }
        }

        public boolean d(int i10) {
            if (i10 < 64) {
                return (this.f116620a & (1 << i10)) != 0;
            }
            c();
            return this.f116621b.d(i10 - 64);
        }

        public void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f116621b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f116620a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f116620a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f116621b != null) {
                c();
                this.f116621b.e(0, z11);
            }
        }

        public boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f116621b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f116620a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f116620a = j12;
            long j13 = j10 - 1;
            this.f116620a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f116621b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f116621b.f(0);
            }
            return z10;
        }

        public void g() {
            this.f116620a = 0L;
            a aVar = this.f116621b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i10) {
            if (i10 < 64) {
                this.f116620a |= 1 << i10;
            } else {
                c();
                this.f116621b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f116621b == null) {
                return Long.toBinaryString(this.f116620a);
            }
            return this.f116621b.toString() + "xx" + Long.toBinaryString(this.f116620a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$b */
    public interface b {
        View a(int i10);

        int b();

        void c(View view);

        RecyclerView.C d(View view);

        void e(View view, int i10);

        void f();

        void g(View view, int i10, ViewGroup.LayoutParams layoutParams);

        void h(int i10);

        int i(View view);

        void j(View view);

        void k(int i10);
    }

    public C2643f(b bVar) {
        this.f116615a = bVar;
    }

    public void a(View view, int i10, boolean z10) {
        int iB = i10 < 0 ? this.f116615a.b() : h(i10);
        this.f116616b.e(iB, z10);
        if (z10) {
            l(view);
        }
        this.f116615a.e(view, iB);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iB = i10 < 0 ? this.f116615a.b() : h(i10);
        this.f116616b.e(iB, z10);
        if (z10) {
            l(view);
        }
        this.f116615a.g(view, iB, layoutParams);
    }

    public void d(int i10) {
        int iH = h(i10);
        this.f116616b.f(iH);
        this.f116615a.h(iH);
    }

    public View e(int i10) {
        int size = this.f116617c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f116617c.get(i11);
            RecyclerView.C cD = this.f116615a.d(view);
            if (cD.getLayoutPosition() == i10 && !cD.isInvalid() && !cD.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f116615a.a(h(i10));
    }

    public int g() {
        return this.f116615a.b() - this.f116617c.size();
    }

    public final int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iB = this.f116615a.b();
        int i11 = i10;
        while (i11 < iB) {
            int iB2 = i10 - (i11 - this.f116616b.b(i11));
            if (iB2 == 0) {
                while (this.f116616b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB2;
        }
        return -1;
    }

    public View i(int i10) {
        return this.f116615a.a(i10);
    }

    public int j() {
        return this.f116615a.b();
    }

    public void k(View view) {
        int i10 = this.f116615a.i(view);
        if (i10 >= 0) {
            this.f116616b.h(i10);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f116617c.add(view);
        this.f116615a.c(view);
    }

    public int m(View view) {
        int i10 = this.f116615a.i(view);
        if (i10 == -1 || this.f116616b.d(i10)) {
            return -1;
        }
        return i10 - this.f116616b.b(i10);
    }

    public boolean n(View view) {
        return this.f116617c.contains(view);
    }

    public void o() {
        this.f116616b.g();
        for (int size = this.f116617c.size() - 1; size >= 0; size--) {
            this.f116615a.j(this.f116617c.get(size));
            this.f116617c.remove(size);
        }
        this.f116615a.f();
    }

    public void p(View view) {
        int i10 = this.f116615a.i(view);
        if (i10 < 0) {
            return;
        }
        if (this.f116616b.f(i10)) {
            t(view);
        }
        this.f116615a.k(i10);
    }

    public void q(int i10) {
        int iH = h(i10);
        View viewA = this.f116615a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f116616b.f(iH)) {
            t(viewA);
        }
        this.f116615a.k(iH);
    }

    public boolean r(View view) {
        int i10 = this.f116615a.i(view);
        if (i10 == -1) {
            t(view);
            return true;
        }
        if (!this.f116616b.d(i10)) {
            return false;
        }
        this.f116616b.f(i10);
        t(view);
        this.f116615a.k(i10);
        return true;
    }

    public void s(View view) {
        int i10 = this.f116615a.i(view);
        if (i10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f116616b.d(i10)) {
            this.f116616b.a(i10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f116617c.remove(view)) {
            return false;
        }
        this.f116615a.j(view);
        return true;
    }

    public String toString() {
        return this.f116616b.toString() + ", hidden list:" + this.f116617c.size();
    }
}
