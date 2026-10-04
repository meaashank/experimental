package androidx.compose.runtime.snapshots;

import fd.InterfaceC4423f;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n1#2:498\n*E\n"})
public final class D<T> implements ListIterator<T>, InterfaceC4423f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<T> f100038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f100040c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f100041d;

    public D(@NotNull SnapshotStateList<T> snapshotStateList, int i10) {
        this.f100038a = snapshotStateList;
        this.f100039b = i10 - 1;
        this.f100041d = snapshotStateList.q();
    }

    private final void d() {
        if (this.f100038a.q() != this.f100041d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        d();
        this.f100038a.add(this.f100039b + 1, t10);
        this.f100040c = -1;
        this.f100039b++;
        this.f100041d = this.f100038a.q();
    }

    @NotNull
    public final SnapshotStateList<T> b() {
        return this.f100038a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f100039b < this.f100038a.getSize() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f100039b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        d();
        int i10 = this.f100039b + 1;
        this.f100040c = i10;
        w.g(i10, this.f100038a.getSize());
        T t10 = this.f100038a.get(i10);
        this.f100039b = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f100039b + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        d();
        w.g(this.f100039b, this.f100038a.getSize());
        int i10 = this.f100039b;
        this.f100040c = i10;
        this.f100039b--;
        return this.f100038a.get(i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f100039b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        d();
        this.f100038a.w(this.f100039b);
        this.f100039b--;
        this.f100040c = -1;
        this.f100041d = this.f100038a.q();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        d();
        int i10 = this.f100040c;
        if (i10 < 0) {
            w.e();
            throw null;
        }
        this.f100038a.set(i10, t10);
        this.f100041d = this.f100038a.q();
    }
}
