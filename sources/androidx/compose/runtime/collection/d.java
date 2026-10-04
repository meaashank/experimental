package androidx.compose.runtime.collection;

import androidx.collection.M0;
import androidx.collection.N0;
import ed.l;
import java.util.List;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1220:1\n1187#1,2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1208#1:1221,2\n*E\n"})
public final class d {
    public static final <T> c<T> a(int i10) {
        G.P();
        throw null;
    }

    public static final <T> c<T> b(int i10, l<? super Integer, ? extends T> lVar) {
        G.P();
        throw null;
    }

    public static c c(int i10, int i11, Object obj) {
        G.P();
        throw null;
    }

    public static final void f(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException(M0.a("Index ", i10, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void g(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException(M0.a("Indices are out of order. fromIndex (", i10, ") is greater than toIndex (", i11, ")."));
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(N0.a("fromIndex (", i10, ") is less than 0."));
        }
        if (i11 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
    }

    public static final <T> c<T> h() {
        G.P();
        throw null;
    }

    public static final /* synthetic */ <T> c<T> i(T... tArr) {
        return new c<>(tArr, tArr.length);
    }
}
