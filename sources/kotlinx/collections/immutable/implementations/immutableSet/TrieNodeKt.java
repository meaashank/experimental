package kotlinx.collections.immutable.implementations.immutableSet;

import ed.l;
import kotlin.collections.C4875q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class TrieNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f218596a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f218597b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f218598c = 31;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f218599d = 30;

    public static final <E> Object[] c(Object[] objArr, int i10, E e10) {
        Object[] objArr2 = new Object[objArr.length + 1];
        C4875q.K0(objArr, objArr2, 0, 0, i10, 6, null);
        C4875q.B0(objArr, objArr2, i10 + 1, i10, objArr.length);
        objArr2[i10] = e10;
        return objArr2;
    }

    public static final int d(Object[] objArr, Object[] objArr2, int i10, l<Object, Boolean> lVar) {
        int i11 = 0;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (lVar.invoke(objArr[i12]).booleanValue()) {
                objArr2[i10 + i11] = objArr[i12];
                i11++;
            }
        }
        return i11;
    }

    public static /* synthetic */ int e(Object[] objArr, Object[] objArr2, int i10, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            lVar = new l<Object, Boolean>() { // from class: kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt$filterTo$1
                @Override // ed.l
                @NotNull
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@Nullable Object obj2) {
                    d.f218613d.getClass();
                    return Boolean.valueOf(obj2 != d.f218614e);
                }
            };
        }
        int i12 = 0;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            if (((Boolean) lVar.invoke(objArr[i13])).booleanValue()) {
                objArr2[i10 + i12] = objArr[i13];
                i12++;
            }
        }
        return i12;
    }

    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final Object[] g(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C4875q.K0(objArr, objArr2, 0, 0, i10, 6, null);
        C4875q.B0(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }
}
