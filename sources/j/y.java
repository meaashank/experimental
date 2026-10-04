package J;

import java.util.Arrays;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.G;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f53109a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f53110b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53111c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53112d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f53113e = 30;

    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final <K, V> Object[] g(Object[] objArr, int i10, K k10, V v10) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C4875q.K0(objArr, objArr2, 0, 0, i10, 6, null);
        C4875q.B0(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = k10;
        objArr2[i10 + 1] = v10;
        return objArr2;
    }

    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C4875q.K0(objArr, objArr2, 0, 0, i10, 6, null);
        C4875q.B0(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] i(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C4875q.K0(objArr, objArr2, 0, 0, i10, 6, null);
        C4875q.B0(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i10, int i11, u<?, ?> uVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C4875q.K0(objArr, objArr2, 0, 0, i10, 6, null);
        C4875q.B0(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i11 - 2] = uVar;
        C4875q.B0(objArr, objArr2, i11 - 1, i11, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] k(Object[] objArr, int i10, int i11, K k10, V v10) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        G.o(objArrCopyOf, "copyOf(this, newSize)");
        C4875q.B0(objArrCopyOf, objArrCopyOf, i10 + 2, i10 + 1, objArr.length);
        C4875q.B0(objArrCopyOf, objArrCopyOf, i11 + 2, i11, i10);
        objArrCopyOf[i11] = k10;
        objArrCopyOf[i11 + 1] = v10;
        return objArrCopyOf;
    }
}
