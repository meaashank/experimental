package androidx.compose.runtime;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/DataIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4179:1\n1#2:4180\n*E\n"})
public final class M implements Iterable<Object>, Iterator<Object>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1973v1 f99136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f99139d;

    public M(@NotNull C1973v1 c1973v1, int i10) {
        this.f99136a = c1973v1;
        int iQ = C1979x1.Q(c1973v1.f100252a, i10);
        this.f99137b = iQ;
        int i11 = i10 + 1;
        this.f99138c = i11 < c1973v1.f100253b ? C1979x1.Q(c1973v1.f100252a, i11) : c1973v1.f100255d;
        this.f99139d = iQ;
    }

    public final int b() {
        return this.f99138c;
    }

    public final int g() {
        return this.f99139d;
    }

    public final int h() {
        return this.f99137b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99139d < this.f99138c;
    }

    @NotNull
    public final C1973v1 i() {
        return this.f99136a;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this;
    }

    public final void j(int i10) {
        this.f99139d = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    @Override // java.util.Iterator
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object next() {
        /*
            r3 = this;
            int r0 = r3.f99139d
            if (r0 < 0) goto Le
            androidx.compose.runtime.v1 r1 = r3.f99136a
            java.lang.Object[] r1 = r1.f100254c
            int r2 = r1.length
            if (r0 >= r2) goto Le
            r1 = r1[r0]
            goto Lf
        Le:
            r1 = 0
        Lf:
            int r0 = r0 + 1
            r3.f99139d = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.M.next():java.lang.Object");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
