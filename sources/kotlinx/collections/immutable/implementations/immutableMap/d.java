package kotlinx.collections.immutable.implementations.immutableMap;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d<K, V, T> implements Iterator<T>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final t<K, V, T>[] f218564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f218566c;

    public d(@NotNull s<K, V> node, @NotNull t<K, V, T>[] path) {
        G.p(node, "node");
        G.p(path, "path");
        this.f218564a = path;
        this.f218566c = true;
        path[0].m(node.f218584d, Integer.bitCount(node.f218581a) * 2);
        this.f218565b = 0;
        e();
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void e() {
        if (this.f218564a[this.f218565b].g()) {
            return;
        }
        for (int i10 = this.f218565b; -1 < i10; i10--) {
            int i11 = i(i10);
            if (i11 == -1 && this.f218564a[i10].h()) {
                this.f218564a[i10].j();
                i11 = i(i10);
            }
            if (i11 != -1) {
                this.f218565b = i11;
                return;
            }
            if (i10 > 0) {
                this.f218564a[i10 - 1].j();
            }
            t<K, V, T> tVar = this.f218564a[i10];
            s.f218579e.getClass();
            tVar.m(s.f218580f.f218584d, 0);
        }
        this.f218566c = false;
    }

    private static /* synthetic */ void f() {
    }

    private final int i(int i10) {
        if (this.f218564a[i10].g()) {
            return i10;
        }
        if (!this.f218564a[i10].h()) {
            return -1;
        }
        s<? extends K, ? extends V> sVarD = this.f218564a[i10].d();
        if (i10 == 6) {
            t<K, V, T> tVar = this.f218564a[i10 + 1];
            Object[] objArr = sVarD.f218584d;
            tVar.m(objArr, objArr.length);
        } else {
            this.f218564a[i10 + 1].m(sVarD.f218584d, Integer.bitCount(sVarD.f218581a) * 2);
        }
        return i(i10 + 1);
    }

    public final K d() {
        b();
        return this.f218564a[this.f218565b].b();
    }

    @NotNull
    public final t<K, V, T>[] g() {
        return this.f218564a;
    }

    public final int h() {
        return this.f218565b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218566c;
    }

    public final void j(int i10) {
        this.f218565b = i10;
    }

    @Override // java.util.Iterator
    public T next() {
        b();
        T next = this.f218564a[this.f218565b].next();
        e();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
