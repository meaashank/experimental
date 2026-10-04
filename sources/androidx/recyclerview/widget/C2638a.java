package androidx.recyclerview.widget;

import androidx.core.util.s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2638a implements w.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116534i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116535j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f116536k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f116537l = "AHT";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s.a<b> f116538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f116539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f116540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0321a f116541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f116542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f116543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f116544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f116545h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0321a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        RecyclerView.C d(int i10);

        void e(int i10, int i11);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11, Object obj);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f116546e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f116547f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116548g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116549h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f116550i = 30;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f116552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f116553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f116554d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f116551a = i10;
            this.f116552b = i11;
            this.f116554d = i12;
            this.f116553c = obj;
        }

        public String a() {
            int i10 = this.f116551a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f116551a;
            if (i10 != bVar.f116551a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f116554d - this.f116552b) == 1 && this.f116554d == bVar.f116552b && this.f116552b == bVar.f116554d) {
                return true;
            }
            if (this.f116554d != bVar.f116554d || this.f116552b != bVar.f116552b) {
                return false;
            }
            Object obj2 = this.f116553c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f116553c)) {
                    return false;
                }
            } else if (bVar.f116553c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f116551a * 31) + this.f116552b) * 31) + this.f116554d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f116552b + "c:" + this.f116554d + ",p:" + this.f116553c + "]";
        }
    }

    public C2638a(InterfaceC0321a interfaceC0321a) {
        this(interfaceC0321a, false);
    }

    public final int A(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f116540c.size() - 1; size >= 0; size--) {
            b bVar = this.f116540c.get(size);
            int i14 = bVar.f116551a;
            if (i14 == 8) {
                int i15 = bVar.f116552b;
                int i16 = bVar.f116554d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f116552b = i15 + 1;
                            bVar.f116554d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f116552b = i15 - 1;
                            bVar.f116554d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f116554d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f116554d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f116552b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f116552b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f116552b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f116554d;
                    } else if (i14 == 2) {
                        i10 += bVar.f116554d;
                    }
                } else if (i11 == 1) {
                    bVar.f116552b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f116552b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f116540c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f116540c.get(size2);
            if (bVar2.f116551a == 8) {
                int i18 = bVar2.f116554d;
                if (i18 == bVar2.f116552b || i18 < 0) {
                    this.f116540c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f116554d <= 0) {
                this.f116540c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.w.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVarA = this.f116538a.a();
        if (bVarA == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarA.f116551a = i10;
        bVarA.f116552b = i11;
        bVarA.f116554d = i12;
        bVarA.f116553c = obj;
        return bVarA;
    }

    @Override // androidx.recyclerview.widget.w.a
    public void b(b bVar) {
        if (this.f116543f) {
            return;
        }
        bVar.f116553c = null;
        this.f116538a.b(bVar);
    }

    public C2638a c(b... bVarArr) {
        Collections.addAll(this.f116539b, bVarArr);
        return this;
    }

    public final void d(b bVar) {
        w(bVar);
    }

    public final void e(b bVar) {
        w(bVar);
    }

    public int f(int i10) {
        int size = this.f116539b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f116539b.get(i11);
            int i12 = bVar.f116551a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f116552b;
                    if (i13 <= i10) {
                        int i14 = bVar.f116554d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f116552b;
                    if (i15 == i10) {
                        i10 = bVar.f116554d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f116554d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f116552b <= i10) {
                i10 += bVar.f116554d;
            }
        }
        return i10;
    }

    public final void g(b bVar) {
        boolean z10;
        byte b10;
        int i10 = bVar.f116552b;
        int i11 = bVar.f116554d + i10;
        byte b11 = -1;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f116541d.d(i12) != null || i(i12)) {
                if (b11 == 0) {
                    l(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 1;
            } else {
                if (b11 == 1) {
                    w(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                b10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            b11 = b10;
        }
        if (i13 != bVar.f116554d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (b11 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final void h(b bVar) {
        int i10 = bVar.f116552b;
        int i11 = bVar.f116554d + i10;
        int i12 = 0;
        byte b10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f116541d.d(i10) != null || i(i10)) {
                if (b10 == 0) {
                    l(a(4, i13, i12, bVar.f116553c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 1;
            } else {
                if (b10 == 1) {
                    w(a(4, i13, i12, bVar.f116553c));
                    i13 = i10;
                    i12 = 0;
                }
                b10 = 0;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f116554d) {
            Object obj = bVar.f116553c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (b10 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    public final boolean i(int i10) {
        int size = this.f116540c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f116540c.get(i11);
            int i12 = bVar.f116551a;
            if (i12 == 8) {
                if (o(bVar.f116554d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f116552b;
                int i14 = bVar.f116554d + i13;
                while (i13 < i14) {
                    if (o(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void j() {
        int size = this.f116540c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f116541d.c(this.f116540c.get(i10));
        }
        y(this.f116540c);
        this.f116545h = 0;
    }

    public void k() {
        j();
        int size = this.f116539b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f116539b.get(i10);
            int i11 = bVar.f116551a;
            if (i11 == 1) {
                this.f116541d.c(bVar);
                this.f116541d.e(bVar.f116552b, bVar.f116554d);
            } else if (i11 == 2) {
                this.f116541d.c(bVar);
                this.f116541d.f(bVar.f116552b, bVar.f116554d);
            } else if (i11 == 4) {
                this.f116541d.c(bVar);
                this.f116541d.h(bVar.f116552b, bVar.f116554d, bVar.f116553c);
            } else if (i11 == 8) {
                this.f116541d.c(bVar);
                this.f116541d.a(bVar.f116552b, bVar.f116554d);
            }
            Runnable runnable = this.f116542e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f116539b);
        this.f116545h = 0;
    }

    public final void l(b bVar) {
        int i10;
        int i11 = bVar.f116551a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iA = A(bVar.f116552b, i11);
        int i12 = bVar.f116552b;
        int i13 = bVar.f116551a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f116554d; i15++) {
            int iA2 = A((i10 * i15) + bVar.f116552b, bVar.f116551a);
            int i16 = bVar.f116551a;
            if (i16 == 2 ? iA2 != iA : !(i16 == 4 && iA2 == iA + 1)) {
                b bVarA = a(i16, iA, i14, bVar.f116553c);
                m(bVarA, i12);
                b(bVarA);
                if (bVar.f116551a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iA = iA2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f116553c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f116551a, iA, i14, obj);
            m(bVarA2, i12);
            b(bVarA2);
        }
    }

    public void m(b bVar, int i10) {
        this.f116541d.b(bVar);
        int i11 = bVar.f116551a;
        if (i11 == 2) {
            this.f116541d.f(i10, bVar.f116554d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f116541d.h(i10, bVar.f116554d, bVar.f116553c);
        }
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = this.f116540c.size();
        while (i11 < size) {
            b bVar = this.f116540c.get(i11);
            int i12 = bVar.f116551a;
            if (i12 == 8) {
                int i13 = bVar.f116552b;
                if (i13 == i10) {
                    i10 = bVar.f116554d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f116554d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f116552b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f116554d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f116554d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean p(int i10) {
        return (i10 & this.f116545h) != 0;
    }

    public boolean q() {
        return this.f116539b.size() > 0;
    }

    public boolean r() {
        return (this.f116540c.isEmpty() || this.f116539b.isEmpty()) ? false : true;
    }

    public boolean s(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f116539b.add(a(4, i10, i11, obj));
        this.f116545h |= 4;
        return this.f116539b.size() == 1;
    }

    public boolean t(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f116539b.add(a(1, i10, i11, null));
        this.f116545h |= 1;
        return this.f116539b.size() == 1;
    }

    public boolean u(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f116539b.add(a(8, i10, i11, null));
        this.f116545h |= 8;
        return this.f116539b.size() == 1;
    }

    public boolean v(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f116539b.add(a(2, i10, i11, null));
        this.f116545h |= 2;
        return this.f116539b.size() == 1;
    }

    public final void w(b bVar) {
        this.f116540c.add(bVar);
        int i10 = bVar.f116551a;
        if (i10 == 1) {
            this.f116541d.e(bVar.f116552b, bVar.f116554d);
            return;
        }
        if (i10 == 2) {
            this.f116541d.g(bVar.f116552b, bVar.f116554d);
            return;
        }
        if (i10 == 4) {
            this.f116541d.h(bVar.f116552b, bVar.f116554d, bVar.f116553c);
        } else if (i10 == 8) {
            this.f116541d.a(bVar.f116552b, bVar.f116554d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void x() {
        this.f116544g.b(this.f116539b);
        int size = this.f116539b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f116539b.get(i10);
            int i11 = bVar.f116551a;
            if (i11 == 1) {
                w(bVar);
            } else if (i11 == 2) {
                g(bVar);
            } else if (i11 == 4) {
                h(bVar);
            } else if (i11 == 8) {
                w(bVar);
            }
            Runnable runnable = this.f116542e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f116539b.clear();
    }

    public void y(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    public void z() {
        y(this.f116539b);
        y(this.f116540c);
        this.f116545h = 0;
    }

    public C2638a(InterfaceC0321a interfaceC0321a, boolean z10) {
        this.f116538a = new s.b(30);
        this.f116539b = new ArrayList<>();
        this.f116540c = new ArrayList<>();
        this.f116545h = 0;
        this.f116541d = interfaceC0321a;
        this.f116543f = z10;
        this.f116544g = new w(this);
    }
}
