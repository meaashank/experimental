package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.InterfaceC1730d;
import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
@V({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,222:1\n1208#2:223\n1187#2,2:224\n523#3:226\n523#3:227\n523#3:228\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n104#1:223\n104#1:224,2\n156#1:226\n158#1:227\n175#1:228\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class I<T> implements InterfaceC1730d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91545d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.collection.c<InterfaceC1730d.a<T>> f91546a = new androidx.compose.runtime.collection.c<>(new InterfaceC1730d.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f91547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC1730d.a<? extends T> f91548c;

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1730d
    public void a(int i10, int i11, @NotNull ed.l<? super InterfaceC1730d.a<? extends T>, L0> lVar) {
        c(i10);
        c(i11);
        if (i11 < i10) {
            throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
        }
        int iB = C1731e.b(this.f91546a, i10);
        int i12 = this.f91546a.f99564a[iB].f91815a;
        while (i12 <= i11) {
            InterfaceC1730d.a<T> aVar = this.f91546a.f99564a[iB];
            lVar.invoke(aVar);
            i12 += aVar.f91816b;
            iB++;
        }
    }

    public final void b(int i10, T t10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("size should be >=0, but was ", i10).toString());
        }
        if (i10 == 0) {
            return;
        }
        InterfaceC1730d.a<T> aVar = new InterfaceC1730d.a<>(this.f91547b, i10, t10);
        this.f91547b += i10;
        this.f91546a.b(aVar);
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f91547b) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, ", size ");
            sbA.append(this.f91547b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
    }

    public final boolean d(InterfaceC1730d.a<? extends T> aVar, int i10) {
        int i11 = aVar.f91815a;
        return i10 < aVar.f91816b + i11 && i11 <= i10;
    }

    public final InterfaceC1730d.a<T> e(int i10) {
        InterfaceC1730d.a<? extends T> aVar = this.f91548c;
        if (aVar != null && d(aVar, i10)) {
            return aVar;
        }
        androidx.compose.runtime.collection.c<InterfaceC1730d.a<T>> cVar = this.f91546a;
        InterfaceC1730d.a aVar2 = (InterfaceC1730d.a<? extends T>) cVar.f99564a[C1731e.b(cVar, i10)];
        this.f91548c = aVar2;
        return aVar2;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1730d
    @NotNull
    public InterfaceC1730d.a<T> get(int i10) {
        c(i10);
        return e(i10);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC1730d
    public int getSize() {
        return this.f91547b;
    }
}
