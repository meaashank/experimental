package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.H;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.u;
import e.e0;
import e.g0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2641d<T> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f116573s = "AsyncListUtil";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f116574t = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f116575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<T> f116577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0324d f116578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I<T> f116579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H.b<T> f116580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H.a<T> f116581g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f116585k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final H.b<T> f116591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final H.a<T> f116592r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f116582h = new int[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f116583i = new int[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f116584j = new int[2];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f116586l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f116587m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f116588n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f116589o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SparseIntArray f116590p = new SparseIntArray();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a */
    public class a implements H.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.H.b
        public void a(int i10, int i11) {
            if (d(i10)) {
                C2641d c2641d = C2641d.this;
                c2641d.f116587m = i11;
                c2641d.f116578d.c();
                C2641d c2641d2 = C2641d.this;
                c2641d2.f116588n = c2641d2.f116589o;
                e();
                C2641d c2641d3 = C2641d.this;
                c2641d3.f116585k = false;
                c2641d3.g();
            }
        }

        @Override // androidx.recyclerview.widget.H.b
        public void b(int i10, int i11) {
            if (d(i10)) {
                I.a<T> aVarE = C2641d.this.f116579e.e(i11);
                if (aVarE != null) {
                    C2641d.this.f116581g.d(aVarE);
                    return;
                }
                Log.e(C2641d.f116573s, "tile not found @" + i11);
            }
        }

        @Override // androidx.recyclerview.widget.H.b
        public void c(int i10, I.a<T> aVar) {
            if (!d(i10)) {
                C2641d.this.f116581g.d(aVar);
                return;
            }
            I.a<T> aVarA = C2641d.this.f116579e.a(aVar);
            if (aVarA != null) {
                Log.e(C2641d.f116573s, "duplicate tile @" + aVarA.f116312b);
                C2641d.this.f116581g.d(aVarA);
            }
            int i11 = aVar.f116312b + aVar.f116313c;
            int i12 = 0;
            while (i12 < C2641d.this.f116590p.size()) {
                int iKeyAt = C2641d.this.f116590p.keyAt(i12);
                if (aVar.f116312b > iKeyAt || iKeyAt >= i11) {
                    i12++;
                } else {
                    C2641d.this.f116590p.removeAt(i12);
                    C2641d.this.f116578d.d(iKeyAt);
                }
            }
        }

        public final boolean d(int i10) {
            return i10 == C2641d.this.f116589o;
        }

        public final void e() {
            for (int i10 = 0; i10 < C2641d.this.f116579e.f(); i10++) {
                C2641d c2641d = C2641d.this;
                c2641d.f116581g.d(c2641d.f116579e.c(i10));
            }
            C2641d.this.f116579e.b();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$b */
    public class b implements H.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public I.a<T> f116594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseBooleanArray f116595b = new SparseBooleanArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116597d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f116598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f116599f;

        public b() {
        }

        @Override // androidx.recyclerview.widget.H.a
        public void a(int i10, int i11, int i12, int i13, int i14) {
            if (i10 > i11) {
                return;
            }
            int iH = h(i10);
            int iH2 = h(i11);
            this.f116598e = h(i12);
            int iH3 = h(i13);
            this.f116599f = iH3;
            if (i14 == 1) {
                l(this.f116598e, iH2, i14, true);
                l(iH2 + C2641d.this.f116576b, this.f116599f, i14, false);
            } else {
                l(iH, iH3, i14, false);
                l(this.f116598e, iH - C2641d.this.f116576b, i14, true);
            }
        }

        @Override // androidx.recyclerview.widget.H.a
        public void b(int i10, int i11) {
            if (this.f116595b.get(i10)) {
                return;
            }
            I.a<T> aVarE = e();
            aVarE.f116312b = i10;
            int iMin = Math.min(C2641d.this.f116576b, this.f116597d - i10);
            aVarE.f116313c = iMin;
            C2641d.this.f116577c.a(aVarE.f116311a, aVarE.f116312b, iMin);
            g(i11);
            f(aVarE);
        }

        @Override // androidx.recyclerview.widget.H.a
        public void c(int i10) {
            this.f116596c = i10;
            this.f116595b.clear();
            int iD = C2641d.this.f116577c.d();
            this.f116597d = iD;
            C2641d.this.f116580f.a(this.f116596c, iD);
        }

        @Override // androidx.recyclerview.widget.H.a
        public void d(I.a<T> aVar) {
            c<T> cVar = C2641d.this.f116577c;
            T[] tArr = aVar.f116311a;
            cVar.getClass();
            aVar.f116314d = this.f116594a;
            this.f116594a = aVar;
        }

        public final I.a<T> e() {
            I.a<T> aVar = this.f116594a;
            if (aVar != null) {
                this.f116594a = aVar.f116314d;
                return aVar;
            }
            C2641d c2641d = C2641d.this;
            return new I.a<>(c2641d.f116575a, c2641d.f116576b);
        }

        public final void f(I.a<T> aVar) {
            this.f116595b.put(aVar.f116312b, true);
            C2641d.this.f116580f.c(this.f116596c, aVar);
        }

        public final void g(int i10) {
            C2641d.this.f116577c.getClass();
            while (this.f116595b.size() >= 10) {
                int iKeyAt = this.f116595b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f116595b;
                int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i11 = this.f116598e - iKeyAt;
                int i12 = iKeyAt2 - this.f116599f;
                if (i11 > 0 && (i11 >= i12 || i10 == 2)) {
                    k(iKeyAt);
                } else {
                    if (i12 <= 0) {
                        return;
                    }
                    if (i11 >= i12 && i10 != 1) {
                        return;
                    } else {
                        k(iKeyAt2);
                    }
                }
            }
        }

        public final int h(int i10) {
            return i10 - (i10 % C2641d.this.f116576b);
        }

        public final boolean i(int i10) {
            return this.f116595b.get(i10);
        }

        public final void j(String str, Object... objArr) {
            Log.d(C2641d.f116573s, "[BKGR] ".concat(String.format(str, objArr)));
        }

        public final void k(int i10) {
            this.f116595b.delete(i10);
            C2641d.this.f116580f.b(this.f116596c, i10);
        }

        public final void l(int i10, int i11, int i12, boolean z10) {
            int i13 = i10;
            while (i13 <= i11) {
                C2641d.this.f116581g.b(z10 ? (i11 + i10) - i13 : i13, i12);
                i13 += C2641d.this.f116576b;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$c */
    public static abstract class c<T> {
        @g0
        public abstract void a(@NonNull T[] tArr, int i10, int i11);

        @g0
        public int b() {
            return 10;
        }

        @g0
        public void c(@NonNull T[] tArr, int i10) {
        }

        @g0
        public abstract int d();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC0324d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f116601a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f116602b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f116603c = 2;

        @e0
        public void a(@NonNull int[] iArr, @NonNull int[] iArr2, int i10) {
            int i11 = iArr[1];
            int i12 = iArr[0];
            int i13 = (i11 - i12) + 1;
            int i14 = i13 / 2;
            iArr2[0] = i12 - (i10 == 1 ? i13 : i14);
            if (i10 != 2) {
                i13 = i14;
            }
            iArr2[1] = i11 + i13;
        }

        @e0
        public abstract void b(@NonNull int[] iArr);

        @e0
        public abstract void c();

        @e0
        public abstract void d(int i10);
    }

    public C2641d(@NonNull Class<T> cls, int i10, @NonNull c<T> cVar, @NonNull AbstractC0324d abstractC0324d) {
        a aVar = new a();
        this.f116591q = aVar;
        b bVar = new b();
        this.f116592r = bVar;
        this.f116575a = cls;
        this.f116576b = i10;
        this.f116577c = cVar;
        this.f116578d = abstractC0324d;
        this.f116579e = new I<>(i10);
        u uVar = new u();
        this.f116580f = new u.a(aVar);
        this.f116581g = new u.b(bVar);
        f();
    }

    @Nullable
    public T a(int i10) {
        if (i10 < 0 || i10 >= this.f116587m) {
            throw new IndexOutOfBoundsException(i10 + " is not within 0 and " + this.f116587m);
        }
        T tD = this.f116579e.d(i10);
        if (tD == null && !c()) {
            this.f116590p.put(i10, 0);
        }
        return tD;
    }

    public int b() {
        return this.f116587m;
    }

    public final boolean c() {
        return this.f116589o != this.f116588n;
    }

    public void d(String str, Object... objArr) {
        Log.d(f116573s, "[MAIN] ".concat(String.format(str, objArr)));
    }

    public void e() {
        if (c()) {
            return;
        }
        g();
        this.f116585k = true;
    }

    public void f() {
        this.f116590p.clear();
        H.a<T> aVar = this.f116581g;
        int i10 = this.f116589o + 1;
        this.f116589o = i10;
        aVar.c(i10);
    }

    public void g() {
        int i10;
        this.f116578d.b(this.f116582h);
        int[] iArr = this.f116582h;
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (i11 > i12 || i11 < 0 || i12 >= this.f116587m) {
            return;
        }
        if (this.f116585k) {
            int[] iArr2 = this.f116583i;
            if (i11 > iArr2[1] || (i10 = iArr2[0]) > i12) {
                this.f116586l = 0;
            } else if (i11 < i10) {
                this.f116586l = 1;
            } else if (i11 > i10) {
                this.f116586l = 2;
            }
        } else {
            this.f116586l = 0;
        }
        int[] iArr3 = this.f116583i;
        iArr3[0] = i11;
        iArr3[1] = i12;
        this.f116578d.a(iArr, this.f116584j, this.f116586l);
        int[] iArr4 = this.f116584j;
        iArr4[0] = Math.min(this.f116582h[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f116584j;
        iArr5[1] = Math.max(this.f116582h[1], Math.min(iArr5[1], this.f116587m - 1));
        H.a<T> aVar = this.f116581g;
        int[] iArr6 = this.f116582h;
        int i13 = iArr6[0];
        int i14 = iArr6[1];
        int[] iArr7 = this.f116584j;
        aVar.a(i13, i14, iArr7[0], iArr7[1], this.f116586l);
    }
}
