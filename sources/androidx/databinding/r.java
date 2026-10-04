package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.core.util.s;
import androidx.databinding.i;
import androidx.databinding.v;

/* JADX INFO: loaded from: classes2.dex */
public class r extends i<v.a, v, b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f112285h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f112286i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f112287j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f112288k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f112289l = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s.c<b> f112284g = new s.c<>(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i.a<v.a, v, b> f112290m = new a();

    public class a extends i.a<v.a, v, b> {
        @Override // androidx.databinding.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(v.a aVar, v vVar, int i10, b bVar) {
            if (i10 == 1) {
                aVar.f(vVar, bVar.f112291a, bVar.f112292b);
                return;
            }
            if (i10 == 2) {
                aVar.g(vVar, bVar.f112291a, bVar.f112292b);
                return;
            }
            if (i10 == 3) {
                aVar.h(vVar, bVar.f112291a, bVar.f112293c, bVar.f112292b);
            } else if (i10 != 4) {
                aVar.a(vVar);
            } else {
                aVar.i(vVar, bVar.f112291a, bVar.f112292b);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f112292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f112293c;
    }

    public r() {
        super(f112290m);
    }

    public static b r(int i10, int i11, int i12) {
        b bVarA = f112284g.a();
        if (bVarA == null) {
            bVarA = new b();
        }
        bVarA.f112291a = i10;
        bVarA.f112293c = i11;
        bVarA.f112292b = i12;
        return bVarA;
    }

    @Override // androidx.databinding.i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public synchronized void i(@NonNull v vVar, int i10, b bVar) {
        super.i(vVar, i10, bVar);
        if (bVar != null) {
            f112284g.b(bVar);
        }
    }

    public void t(@NonNull v vVar) {
        i(vVar, 0, null);
    }

    public void u(@NonNull v vVar, int i10, int i11) {
        i(vVar, 1, r(i10, 0, i11));
    }

    public void v(@NonNull v vVar, int i10, int i11) {
        i(vVar, 2, r(i10, 0, i11));
    }

    public void w(@NonNull v vVar, int i10, int i11, int i12) {
        i(vVar, 3, r(i10, i11, i12));
    }

    public void x(@NonNull v vVar, int i10, int i11) {
        i(vVar, 4, r(i10, 0, i11));
    }
}
