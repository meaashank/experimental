package androidx.compose.runtime;

import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4179:1\n1#2:4180\n*E\n"})
public final class P1 implements Iterator<androidx.compose.runtime.tooling.d>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1973v1 f99170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C1915h0 f99172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Q1 f99173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f99174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f99175f;

    public P1(@NotNull C1973v1 c1973v1, int i10, @NotNull C1915h0 c1915h0, @NotNull Q1 q12) {
        this.f99170a = c1973v1;
        this.f99171b = i10;
        this.f99172c = c1915h0;
        this.f99173d = q12;
        this.f99174e = c1973v1.f100258g;
    }

    @NotNull
    public final C1915h0 b() {
        return this.f99172c;
    }

    public final int d() {
        return this.f99171b;
    }

    @NotNull
    public final Q1 e() {
        return this.f99173d;
    }

    @NotNull
    public final C1973v1 f() {
        return this.f99170a;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.tooling.d next() {
        Object obj;
        ArrayList<Object> arrayList = this.f99172c.f99694d;
        if (arrayList != null) {
            int i10 = this.f99175f;
            this.f99175f = i10 + 1;
            obj = arrayList.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C1889c) {
            return new C1976w1(this.f99170a, ((C1889c) obj).f99427a, this.f99174e);
        }
        if (obj instanceof C1915h0) {
            return new R1(this.f99170a, this.f99171b, (C1915h0) obj, new C1928l1(this.f99173d, this.f99175f - 1));
        }
        C1968u.w("Unexpected group information structure");
        throw null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayList = this.f99172c.f99694d;
        return arrayList != null && this.f99175f < arrayList.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
