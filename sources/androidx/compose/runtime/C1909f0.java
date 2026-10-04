package androidx.compose.runtime;

import fd.InterfaceC4418a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1909f0 implements Iterator<androidx.compose.runtime.tooling.d>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1973v1 f99662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f99665d;

    public C1909f0(@NotNull C1973v1 c1973v1, int i10, int i11) {
        this.f99662a = c1973v1;
        this.f99663b = i11;
        this.f99664c = i10;
        this.f99665d = c1973v1.f100258g;
        if (c1973v1.f100257f) {
            throw new ConcurrentModificationException();
        }
    }

    public final int b() {
        return this.f99663b;
    }

    @NotNull
    public final C1973v1 d() {
        return this.f99662a;
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.tooling.d next() {
        f();
        int i10 = this.f99664c;
        this.f99664c = C1979x1.Y(this.f99662a.f100252a, i10) + i10;
        return new C1976w1(this.f99662a, i10, this.f99665d);
    }

    public final void f() {
        if (this.f99662a.f100258g != this.f99665d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99664c < this.f99663b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
