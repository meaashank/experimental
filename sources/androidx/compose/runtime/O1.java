package androidx.compose.runtime;

import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4179:1\n33#2,6:4180\n1#3:4186\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SourceInformationGroupDataIterator\n*L\n3709#1:4180,6\n*E\n"})
public final class O1 implements Iterable<Object>, Iterator<Object>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1973v1 f99164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f99167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C1911g f99168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f99169f;

    public O1(@NotNull C1973v1 c1973v1, int i10, @NotNull C1915h0 c1915h0) {
        this.f99164a = c1973v1;
        int iQ = C1979x1.Q(c1973v1.f100252a, i10);
        this.f99165b = iQ;
        this.f99166c = c1915h0.f99693c;
        int iQ2 = c1915h0.f99696f;
        if (iQ2 <= 0) {
            int i11 = i10 + 1;
            iQ2 = (i11 < c1973v1.f100253b ? C1979x1.Q(c1973v1.f100252a, i11) : c1973v1.f100255d) - iQ;
        }
        this.f99167d = iQ2;
        C1911g c1911g = new C1911g();
        ArrayList<Object> arrayList = c1915h0.f99694d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = arrayList.get(i12);
                if (obj instanceof C1915h0) {
                    C1915h0 c1915h02 = (C1915h0) obj;
                    c1911g.f(c1915h02.f99693c, c1915h02.f99696f);
                }
            }
        }
        this.f99168e = c1911g;
        this.f99169f = c1911g.c(this.f99166c);
    }

    @NotNull
    public final C1973v1 b() {
        return this.f99164a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99169f < this.f99167d;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        int i10 = this.f99167d;
        int i11 = this.f99169f;
        Object obj = (i11 < 0 || i11 >= i10) ? null : this.f99164a.f100254c[this.f99165b + i11];
        this.f99169f = this.f99168e.c(i11 + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
