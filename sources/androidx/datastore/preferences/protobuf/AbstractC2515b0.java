package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.V;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2515b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2515b0 f112825a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2515b0 f112826b = new c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$b */
    public static final class b extends AbstractC2515b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?> f112827c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
        }

        public static <E> List<E> f(Object obj, long j10) {
            return (List) a1.O(obj, j10);
        }

        public static <L> List<L> g(Object obj, long j10, int i10) {
            List<L> list = (List) a1.O(obj, j10);
            if (list.isEmpty()) {
                List<L> z10 = list instanceof InterfaceC2513a0 ? new Z(i10) : ((list instanceof InterfaceC2562z0) && (list instanceof V.k)) ? ((V.k) list).d2(i10) : new ArrayList<>(i10);
                a1.q0(obj, j10, z10);
                return z10;
            }
            if (f112827c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i10);
                arrayList.addAll(list);
                a1.q0(obj, j10, arrayList);
                return arrayList;
            }
            if (list instanceof Z0) {
                Z z11 = new Z(list.size() + i10);
                z11.addAll((Z0) list);
                a1.q0(obj, j10, z11);
                return z11;
            }
            if ((list instanceof InterfaceC2562z0) && (list instanceof V.k)) {
                V.k kVar = (V.k) list;
                if (!kVar.k3()) {
                    V.k kVarD2 = kVar.d2(list.size() + i10);
                    a1.q0(obj, j10, kVarD2);
                    return kVarD2;
                }
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2515b0
        public void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) a1.O(obj, j10);
            if (list instanceof InterfaceC2513a0) {
                objUnmodifiableList = ((InterfaceC2513a0) list).c2();
            } else {
                if (f112827c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC2562z0) && (list instanceof V.k)) {
                    V.k kVar = (V.k) list;
                    if (kVar.k3()) {
                        kVar.p2();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            a1.q0(obj, j10, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2515b0
        public <E> void d(Object obj, Object obj2, long j10) {
            List list = (List) a1.O(obj2, j10);
            List listG = g(obj, j10, list.size());
            int size = listG.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(list);
            }
            if (size > 0) {
                list = listG;
            }
            a1.q0(obj, j10, list);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2515b0
        public <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }

        public b(a aVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b0$c */
    public static final class c extends AbstractC2515b0 {
        public c() {
        }

        public static <E> V.k<E> f(Object obj, long j10) {
            return (V.k) a1.O(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2515b0
        public void c(Object obj, long j10) {
            ((V.k) a1.O(obj, j10)).p2();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r6v2, types: [androidx.datastore.preferences.protobuf.V$k, java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v4 */
        @Override // androidx.datastore.preferences.protobuf.AbstractC2515b0
        public <E> void d(Object obj, Object obj2, long j10) {
            V.k kVar = (V.k) a1.O(obj, j10);
            ?? r62 = (V.k) a1.f112800f.n(obj2, j10);
            int size = kVar.size();
            int size2 = r62.size();
            ?? r02 = kVar;
            r02 = kVar;
            if (size > 0 && size2 > 0) {
                boolean zK3 = kVar.k3();
                ?? D22 = kVar;
                if (!zK3) {
                    D22 = kVar.d2(size2 + size);
                }
                D22.addAll(r62);
                r02 = D22;
            }
            if (size > 0) {
                r62 = r02;
            }
            a1.q0(obj, j10, r62);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2515b0
        public <L> List<L> e(Object obj, long j10) {
            V.k kVar = (V.k) a1.O(obj, j10);
            if (kVar.k3()) {
                return kVar;
            }
            int size = kVar.size();
            V.k kVarD2 = kVar.d2(size == 0 ? 10 : size * 2);
            a1.q0(obj, j10, kVarD2);
            return kVarD2;
        }

        public c(a aVar) {
        }
    }

    public AbstractC2515b0() {
    }

    public static AbstractC2515b0 a() {
        return f112825a;
    }

    public static AbstractC2515b0 b() {
        return f112826b;
    }

    public abstract void c(Object obj, long j10);

    public abstract <L> void d(Object obj, Object obj2, long j10);

    public abstract <L> List<L> e(Object obj, long j10);

    public AbstractC2515b0(a aVar) {
    }
}
