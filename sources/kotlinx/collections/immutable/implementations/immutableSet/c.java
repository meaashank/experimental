package kotlinx.collections.immutable.implementations.immutableSet;

import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.I;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public class c<E> implements Iterator<E>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<e<E>> f218610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f218612c;

    public c(@NotNull d<E> node) {
        G.p(node, "node");
        List<e<E>> listU = I.U(new e());
        this.f218610a = listU;
        this.f218612c = true;
        e.i(listU.get(0), node.f218616b, 0, 2, null);
        this.f218611b = 0;
        d();
    }

    private final void d() {
        if (this.f218610a.get(this.f218611b).d()) {
            return;
        }
        for (int i10 = this.f218611b; -1 < i10; i10--) {
            int iH = h(i10);
            if (iH == -1 && this.f218610a.get(i10).c()) {
                this.f218610a.get(i10).f();
                iH = h(i10);
            }
            if (iH != -1) {
                this.f218611b = iH;
                return;
            }
            if (i10 > 0) {
                this.f218610a.get(i10 - 1).f();
            }
            e<E> eVar = this.f218610a.get(i10);
            d.f218613d.getClass();
            eVar.h(d.f218614e.f218616b, 0);
        }
        this.f218612c = false;
    }

    private static /* synthetic */ void e() {
    }

    private final int h(int i10) {
        if (this.f218610a.get(i10).d()) {
            return i10;
        }
        if (!this.f218610a.get(i10).e()) {
            return -1;
        }
        d<? extends E> dVarB = this.f218610a.get(i10).b();
        int i11 = i10 + 1;
        if (i11 == this.f218610a.size()) {
            this.f218610a.add(new e<>());
        }
        e.i(this.f218610a.get(i11), dVarB.f218616b, 0, 2, null);
        return h(i11);
    }

    public final E b() {
        return this.f218610a.get(this.f218611b).a();
    }

    @NotNull
    public final List<e<E>> f() {
        return this.f218610a;
    }

    public final int g() {
        return this.f218611b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218612c;
    }

    public final void i(int i10) {
        this.f218611b = i10;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.f218612c) {
            throw new NoSuchElementException();
        }
        E eG = this.f218610a.get(this.f218611b).g();
        d();
        return eG;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
