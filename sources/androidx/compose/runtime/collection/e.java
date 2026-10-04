package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import ed.l;
import java.util.Iterator;
import java.util.Set;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n228#2,4:64\n198#2,7:68\n209#2,3:76\n212#2,9:80\n232#2:89\n254#2,2:92\n228#2,4:94\n198#2,7:98\n209#2,3:106\n212#2,9:110\n232#2:119\n256#2:120\n1956#3:75\n1820#3:79\n1956#3:105\n1820#3:109\n1855#4,2:90\n1747#4,3:121\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n*L\n50#1:64,4\n50#1:68,7\n50#1:76,3\n50#1:80,9\n50#1:89\n59#1:92,2\n59#1:94,4\n59#1:98,7\n59#1:106,3\n59#1:110,9\n59#1:119\n59#1:120\n50#1:75\n50#1:79\n59#1:105\n59#1:109\n53#1:90,2\n61#1:121,3\n*E\n"})
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(@org.jetbrains.annotations.NotNull java.util.Set<? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull ed.l<java.lang.Object, java.lang.Boolean> r15) {
        /*
            boolean r0 = r14 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L57
            androidx.compose.runtime.collection.ScatterSetWrapper r14 = (androidx.compose.runtime.collection.ScatterSetWrapper) r14
            androidx.collection.ScatterSet<T> r14 = r14.f99549a
            java.lang.Object[] r0 = r14.f86877b
            long[] r14 = r14.f86876a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L14:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L2e:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4b
            return r1
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2e
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L14
        L56:
            return r2
        L57:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            boolean r0 = r14 instanceof java.util.Collection
            if (r0 == 0) goto L67
            r0 = r14
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L67
            return r2
        L67:
            java.util.Iterator r14 = r14.iterator()
        L6b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r14.next()
            java.lang.Object r0 = r15.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6b
            return r1
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.e.a(java.util.Set, ed.l):boolean");
    }

    public static final <T> void b(@NotNull Set<? extends T> set, @NotNull l<? super T, L0> lVar) {
        if (!(set instanceof ScatterSetWrapper)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            return;
        }
        ScatterSet<T> scatterSet = ((ScatterSetWrapper) set).f99549a;
        Object[] objArr = scatterSet.f86877b;
        long[] jArr = scatterSet.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        lVar.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @NotNull
    public static final <T> Set<T> c(@NotNull ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
