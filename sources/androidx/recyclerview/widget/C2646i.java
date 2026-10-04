package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2646i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<d> f116685a = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$a */
    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f116688a - dVar2.f116688a;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$b */
    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        @Nullable
        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f116686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f116687b;

        public c(int i10) {
            int[] iArr = new int[i10];
            this.f116686a = iArr;
            this.f116687b = iArr.length / 2;
        }

        public int[] a() {
            return this.f116686a;
        }

        public void b(int i10) {
            Arrays.fill(this.f116686a, i10);
        }

        public int c(int i10) {
            return this.f116686a[i10 + this.f116687b];
        }

        public void d(int i10, int i11) {
            this.f116686a[i10 + this.f116687b] = i11;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f116688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f116689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f116690c;

        public d(int i10, int i11, int i12) {
            this.f116688a = i10;
            this.f116689b = i11;
            this.f116690c = i12;
        }

        public int a() {
            return this.f116688a + this.f116690c;
        }

        public int b() {
            return this.f116689b + this.f116690c;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$e */
    public static class e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116691h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f116692i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f116693j = 2;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f116694k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f116695l = 8;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f116696m = 12;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f116697n = 4;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f116698o = 15;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f116699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f116700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f116701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f116702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f116703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f116704f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f116705g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f116699a = list;
            this.f116700b = iArr;
            this.f116701c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f116702d = bVar;
            this.f116703e = bVar.e();
            this.f116704f = bVar.d();
            this.f116705g = z10;
            a();
            g();
        }

        @Nullable
        public static g i(Collection<g> collection, int i10, boolean z10) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f116706a == i10 && next.f116708c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z10) {
                    next2.f116707b--;
                } else {
                    next2.f116707b++;
                }
            }
            return next;
        }

        public final void a() {
            d dVar = this.f116699a.isEmpty() ? null : this.f116699a.get(0);
            if (dVar == null || dVar.f116688a != 0 || dVar.f116689b != 0) {
                this.f116699a.add(0, new d(0, 0, 0));
            }
            this.f116699a.add(new d(this.f116703e, this.f116704f, 0));
        }

        public int b(@e.D(from = 0) int i10) {
            if (i10 < 0 || i10 >= this.f116704f) {
                StringBuilder sbA = android.support.v4.media.a.a("Index out of bounds - passed position = ", i10, ", new list size = ");
                sbA.append(this.f116704f);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            int i11 = this.f116701c[i10];
            if ((i11 & 15) == 0) {
                return -1;
            }
            return i11 >> 4;
        }

        public int c(@e.D(from = 0) int i10) {
            if (i10 < 0 || i10 >= this.f116703e) {
                StringBuilder sbA = android.support.v4.media.a.a("Index out of bounds - passed position = ", i10, ", old list size = ");
                sbA.append(this.f116703e);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            int i11 = this.f116700b[i10];
            if ((i11 & 15) == 0) {
                return -1;
            }
            return i11 >> 4;
        }

        public void d(@NonNull t tVar) {
            int i10;
            C2642e c2642e = tVar instanceof C2642e ? (C2642e) tVar : new C2642e(tVar);
            int i11 = this.f116703e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f116703e;
            int i13 = this.f116704f;
            for (int size = this.f116699a.size() - 1; size >= 0; size--) {
                d dVar = this.f116699a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i12 <= iA) {
                        break;
                    }
                    i12--;
                    int i14 = this.f116700b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g gVarI = i(arrayDeque, i15, false);
                        if (gVarI != null) {
                            int i16 = (i11 - gVarI.f116707b) - 1;
                            c2642e.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                c2642e.a(i16, 1, this.f116702d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        c2642e.c(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iB) {
                    i13--;
                    int i17 = this.f116701c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g gVarI2 = i(arrayDeque, i18, true);
                        if (gVarI2 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            c2642e.d((i11 - gVarI2.f116707b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                c2642e.a(i12, 1, this.f116702d.c(i18, i13));
                            }
                        }
                    } else {
                        c2642e.b(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f116688a;
                int i20 = dVar.f116689b;
                for (i10 = 0; i10 < dVar.f116690c; i10++) {
                    if ((this.f116700b[i19] & 15) == 2) {
                        c2642e.a(i19, 1, this.f116702d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f116688a;
                i13 = dVar.f116689b;
            }
            c2642e.e();
        }

        public void e(@NonNull RecyclerView.Adapter adapter) {
            d(new C2639b(adapter));
        }

        public final void f(int i10) {
            int size = this.f116699a.size();
            int iB = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = this.f116699a.get(i11);
                while (iB < dVar.f116689b) {
                    if (this.f116701c[iB] == 0 && this.f116702d.b(i10, iB)) {
                        int i12 = this.f116702d.a(i10, iB) ? 8 : 4;
                        this.f116700b[i10] = (iB << 4) | i12;
                        this.f116701c[iB] = (i10 << 4) | i12;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        public final void g() {
            for (d dVar : this.f116699a) {
                for (int i10 = 0; i10 < dVar.f116690c; i10++) {
                    int i11 = dVar.f116688a + i10;
                    int i12 = dVar.f116689b + i10;
                    int i13 = this.f116702d.a(i11, i12) ? 1 : 2;
                    this.f116700b[i11] = (i12 << 4) | i13;
                    this.f116701c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f116705g) {
                h();
            }
        }

        public final void h() {
            int iA = 0;
            for (d dVar : this.f116699a) {
                while (iA < dVar.f116688a) {
                    if (this.f116700b[iA] == 0) {
                        f(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$f */
    public static abstract class f<T> {
        public abstract boolean a(@NonNull T t10, @NonNull T t11);

        public abstract boolean b(@NonNull T t10, @NonNull T t11);

        @Nullable
        public Object c(@NonNull T t10, @NonNull T t11) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$g */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f116708c;

        public g(int i10, int i11, boolean z10) {
            this.f116706a = i10;
            this.f116707b = i11;
            this.f116708c = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$h */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116712d;

        public h() {
        }

        public int a() {
            return this.f116712d - this.f116711c;
        }

        public int b() {
            return this.f116710b - this.f116709a;
        }

        public h(int i10, int i11, int i12, int i13) {
            this.f116709a = i10;
            this.f116710b = i11;
            this.f116711c = i12;
            this.f116712d = i13;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$i, reason: collision with other inner class name */
    public static class C0326i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f116715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f116717e;

        public int a() {
            return Math.min(this.f116715c - this.f116713a, this.f116716d - this.f116714b);
        }

        public boolean b() {
            return this.f116716d - this.f116714b != this.f116715c - this.f116713a;
        }

        public boolean c() {
            return this.f116716d - this.f116714b > this.f116715c - this.f116713a;
        }

        @NonNull
        public d d() {
            if (b()) {
                return this.f116717e ? new d(this.f116713a, this.f116714b, a()) : c() ? new d(this.f116713a, this.f116714b + 1, a()) : new d(this.f116713a + 1, this.f116714b, a());
            }
            int i10 = this.f116713a;
            return new d(i10, this.f116714b, this.f116715c - i10);
        }
    }

    @Nullable
    public static C0326i a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iC;
        int i11;
        int i12;
        boolean z10 = (hVar.b() - hVar.a()) % 2 == 0;
        int iB = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.c(i14 + 1) < cVar2.c(i14 - 1))) {
                iC = cVar2.c(i14 + 1);
                i11 = iC;
            } else {
                iC = cVar2.c(i14 - 1);
                i11 = iC - 1;
            }
            int i15 = hVar.f116712d - ((hVar.f116710b - i11) - i14);
            int i16 = (i10 == 0 || i11 != iC) ? i15 : i15 + 1;
            while (i11 > hVar.f116709a && i15 > hVar.f116711c && bVar.b(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.d(i14, i11);
            if (z10 && (i12 = iB - i14) >= i13 && i12 <= i10 && cVar.c(i12) >= i11) {
                C0326i c0326i = new C0326i();
                c0326i.f116713a = i11;
                c0326i.f116714b = i15;
                c0326i.f116715c = iC;
                c0326i.f116716d = i16;
                c0326i.f116717e = true;
                return c0326i;
            }
        }
        return null;
    }

    @NonNull
    public static e b(@NonNull b bVar) {
        return c(bVar, true);
    }

    @NonNull
    public static e c(@NonNull b bVar, boolean z10) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, iE, 0, iD));
        int i10 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            C0326i c0326iE = e(hVar, bVar, cVar, cVar2);
            if (c0326iE != null) {
                if (c0326iE.a() > 0) {
                    arrayList.add(c0326iE.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f116709a = hVar.f116709a;
                hVar2.f116711c = hVar.f116711c;
                hVar2.f116710b = c0326iE.f116713a;
                hVar2.f116712d = c0326iE.f116714b;
                arrayList2.add(hVar2);
                hVar.f116710b = hVar.f116710b;
                hVar.f116712d = hVar.f116712d;
                hVar.f116709a = c0326iE.f116715c;
                hVar.f116711c = c0326iE.f116716d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f116685a);
        return new e(bVar, arrayList, cVar.f116686a, cVar2.f116686a, z10);
    }

    @Nullable
    public static C0326i d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int iC;
        int i11;
        int i12;
        boolean z10 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int iB = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.c(i14 + 1) > cVar.c(i14 - 1))) {
                iC = cVar.c(i14 + 1);
                i11 = iC;
            } else {
                iC = cVar.c(i14 - 1);
                i11 = iC + 1;
            }
            int i15 = ((i11 - hVar.f116709a) + hVar.f116711c) - i14;
            int i16 = (i10 == 0 || i11 != iC) ? i15 : i15 - 1;
            while (i11 < hVar.f116710b && i15 < hVar.f116712d && bVar.b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.d(i14, i11);
            if (z10 && (i12 = iB - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.c(i12) <= i11) {
                C0326i c0326i = new C0326i();
                c0326i.f116713a = iC;
                c0326i.f116714b = i16;
                c0326i.f116715c = i11;
                c0326i.f116716d = i15;
                c0326i.f116717e = false;
                return c0326i;
            }
        }
        return null;
    }

    @Nullable
    public static C0326i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() < 1 || hVar.a() < 1) {
            return null;
        }
        int iA = ((hVar.a() + hVar.b()) + 1) / 2;
        cVar.d(1, hVar.f116709a);
        cVar2.d(1, hVar.f116710b);
        for (int i10 = 0; i10 < iA; i10++) {
            C0326i c0326iD = d(hVar, bVar, cVar, cVar2, i10);
            if (c0326iD != null) {
                return c0326iD;
            }
            C0326i c0326iA = a(hVar, bVar, cVar, cVar2, i10);
            if (c0326iA != null) {
                return c0326iA;
            }
        }
        return null;
    }
}
