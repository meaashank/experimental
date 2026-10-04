package J;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class e<K, V, T> implements Iterator<T>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f53064d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final v<K, V, T>[] f53065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f53067c = true;

    public e(@NotNull u<K, V> uVar, @NotNull v<K, V, T>[] vVarArr) {
        this.f53065a = vVarArr;
        vVarArr[0].o(uVar.f53099d, Integer.bitCount(uVar.f53096a) * 2, 0);
        this.f53066b = 0;
        e();
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final K d() {
        b();
        return this.f53065a[this.f53066b].b();
    }

    public final void e() {
        if (this.f53065a[this.f53066b].g()) {
            return;
        }
        for (int i10 = this.f53066b; -1 < i10; i10--) {
            int i11 = i(i10);
            if (i11 == -1 && this.f53065a[i10].h()) {
                this.f53065a[i10].j();
                i11 = i(i10);
            }
            if (i11 != -1) {
                this.f53066b = i11;
                return;
            }
            if (i10 > 0) {
                this.f53065a[i10 - 1].j();
            }
            v<K, V, T> vVar = this.f53065a[i10];
            u.f53093e.getClass();
            vVar.o(u.f53095g.f53099d, 0, 0);
        }
        this.f53067c = false;
    }

    @NotNull
    public final v<K, V, T>[] g() {
        return this.f53065a;
    }

    public final int h() {
        return this.f53066b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53067c;
    }

    public final int i(int i10) {
        if (this.f53065a[i10].g()) {
            return i10;
        }
        if (!this.f53065a[i10].h()) {
            return -1;
        }
        u<? extends K, ? extends V> uVarD = this.f53065a[i10].d();
        if (i10 == 6) {
            v<K, V, T> vVar = this.f53065a[i10 + 1];
            Object[] objArr = uVarD.f53099d;
            vVar.o(objArr, objArr.length, 0);
        } else {
            this.f53065a[i10 + 1].o(uVarD.f53099d, Integer.bitCount(uVarD.f53096a) * 2, 0);
        }
        return i(i10 + 1);
    }

    public final void j(int i10) {
        this.f53066b = i10;
    }

    @Override // java.util.Iterator
    public T next() {
        b();
        T next = this.f53065a[this.f53066b].next();
        e();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static /* synthetic */ void f() {
    }
}
