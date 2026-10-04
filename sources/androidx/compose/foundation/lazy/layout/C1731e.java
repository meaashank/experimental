package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC1730d;
import kotlin.jvm.internal.V;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n48#2:223\n523#2:224\n523#2:225\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n198#1:223\n203#1:224\n212#1:225\n*E\n"})
public final class C1731e {
    @androidx.compose.foundation.L
    public static final <T> int b(androidx.compose.runtime.collection.c<InterfaceC1730d.a<T>> cVar, int i10) {
        int i11 = cVar.f99566c - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            InterfaceC1730d.a<T>[] aVarArr = cVar.f99564a;
            int i14 = aVarArr[i13].f91815a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < aVarArr[i12].f91815a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }
}
