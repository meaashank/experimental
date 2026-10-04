package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1531f0;
import androidx.collection.U0;
import androidx.core.util.s;
import androidx.recyclerview.widget.RecyclerView;
import e.f0;

/* JADX INFO: loaded from: classes2.dex */
public class K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f116342c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @f0
    public final U0<RecyclerView.C, a> f116343a = new U0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f0
    public final C1531f0<RecyclerView.C> f116344b = new C1531f0<>();

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f116345d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f116346e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f116347f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116348g = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116349h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f116350i = 12;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f116351j = 14;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static s.a<a> f116352k = new s.b(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f116353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public RecyclerView.l.d f116354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public RecyclerView.l.d f116355c;

        public static void a() {
            while (f116352k.a() != null) {
            }
        }

        public static a b() {
            a aVarA = f116352k.a();
            return aVarA == null ? new a() : aVarA;
        }

        public static void c(a aVar) {
            aVar.f116353a = 0;
            aVar.f116354b = null;
            aVar.f116355c = null;
            f116352k.b(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.C c10, @Nullable RecyclerView.l.d dVar, RecyclerView.l.d dVar2);

        void b(RecyclerView.C c10);

        void c(RecyclerView.C c10, @NonNull RecyclerView.l.d dVar, @Nullable RecyclerView.l.d dVar2);

        void d(RecyclerView.C c10, @NonNull RecyclerView.l.d dVar, @NonNull RecyclerView.l.d dVar2);
    }

    public void a(RecyclerView.C c10, RecyclerView.l.d dVar) {
        a aVarB = this.f116343a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f116343a.put(c10, aVarB);
        }
        aVarB.f116353a |= 2;
        aVarB.f116354b = dVar;
    }

    public void b(RecyclerView.C c10) {
        a aVarB = this.f116343a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f116343a.put(c10, aVarB);
        }
        aVarB.f116353a |= 1;
    }

    public void c(long j10, RecyclerView.C c10) {
        this.f116344b.m(j10, c10);
    }

    public void d(RecyclerView.C c10, RecyclerView.l.d dVar) {
        a aVarB = this.f116343a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f116343a.put(c10, aVarB);
        }
        aVarB.f116355c = dVar;
        aVarB.f116353a |= 8;
    }

    public void e(RecyclerView.C c10, RecyclerView.l.d dVar) {
        a aVarB = this.f116343a.get(c10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f116343a.put(c10, aVarB);
        }
        aVarB.f116354b = dVar;
        aVarB.f116353a |= 4;
    }

    public void f() {
        this.f116343a.clear();
        this.f116344b.b();
    }

    public RecyclerView.C g(long j10) {
        return this.f116344b.g(j10);
    }

    public boolean h(RecyclerView.C c10) {
        a aVar = this.f116343a.get(c10);
        return (aVar == null || (aVar.f116353a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.C c10) {
        a aVar = this.f116343a.get(c10);
        return (aVar == null || (aVar.f116353a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.C c10) {
        p(c10);
    }

    public final RecyclerView.l.d l(RecyclerView.C c10, int i10) {
        a aVarO;
        RecyclerView.l.d dVar;
        int iF = this.f116343a.f(c10);
        if (iF >= 0 && (aVarO = this.f116343a.o(iF)) != null) {
            int i11 = aVarO.f116353a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarO.f116353a = i12;
                if (i10 == 4) {
                    dVar = aVarO.f116354b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    dVar = aVarO.f116355c;
                }
                if ((i12 & 12) == 0) {
                    this.f116343a.l(iF);
                    a.c(aVarO);
                }
                return dVar;
            }
        }
        return null;
    }

    @Nullable
    public RecyclerView.l.d m(RecyclerView.C c10) {
        return l(c10, 8);
    }

    @Nullable
    public RecyclerView.l.d n(RecyclerView.C c10) {
        return l(c10, 4);
    }

    public void o(b bVar) {
        for (int size = this.f116343a.size() - 1; size >= 0; size--) {
            RecyclerView.C cI = this.f116343a.i(size);
            a aVarL = this.f116343a.l(size);
            int i10 = aVarL.f116353a;
            if ((i10 & 3) == 3) {
                bVar.b(cI);
            } else if ((i10 & 1) != 0) {
                RecyclerView.l.d dVar = aVarL.f116354b;
                if (dVar == null) {
                    bVar.b(cI);
                } else {
                    bVar.c(cI, dVar, aVarL.f116355c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(cI, aVarL.f116354b, aVarL.f116355c);
            } else if ((i10 & 12) == 12) {
                bVar.d(cI, aVarL.f116354b, aVarL.f116355c);
            } else if ((i10 & 4) != 0) {
                bVar.c(cI, aVarL.f116354b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(cI, aVarL.f116354b, aVarL.f116355c);
            }
            a.c(aVarL);
        }
    }

    public void p(RecyclerView.C c10) {
        a aVar = this.f116343a.get(c10);
        if (aVar == null) {
            return;
        }
        aVar.f116353a &= -2;
    }

    public void q(RecyclerView.C c10) {
        int iW = this.f116344b.w() - 1;
        while (true) {
            if (iW < 0) {
                break;
            }
            if (c10 == this.f116344b.x(iW)) {
                this.f116344b.s(iW);
                break;
            }
            iW--;
        }
        a aVarRemove = this.f116343a.remove(c10);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
