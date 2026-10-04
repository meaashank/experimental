package td;

import fd.InterfaceC4421d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.collections.B;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt;
import kotlinx.collections.immutable.implementations.immutableSet.b;
import kotlinx.collections.immutable.implementations.immutableSet.c;
import kotlinx.collections.immutable.implementations.immutableSet.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class a<E> extends c<E> implements Iterator<E>, InterfaceC4421d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b<E> f239275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public E f239276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f239277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f239278g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull b<E> builder) {
        super(builder.f218607c);
        G.p(builder, "builder");
        this.f239275d = builder;
        this.f239278g = builder.f218608d;
    }

    private final void j() {
        if (this.f239275d.f218608d != this.f239278g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void m() {
        if (!this.f239277f) {
            throw new IllegalStateException();
        }
    }

    @Override // kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public E next() {
        j();
        E e10 = (E) super.next();
        this.f239276e = e10;
        this.f239277f = true;
        return e10;
    }

    public final boolean o(d<?> dVar) {
        return dVar.f218615a == 0;
    }

    public final void p(int i10, d<?> dVar, E e10, int i11) {
        if (o(dVar)) {
            this.f218610a.get(i11).h(dVar.f218616b, B.bg(dVar.f218616b, e10));
            this.f218611b = i11;
            return;
        }
        int iR = dVar.r(1 << TrieNodeKt.f(i10, i11 * 5));
        this.f218610a.get(i11).h(dVar.f218616b, iR);
        Object obj = dVar.f218616b[iR];
        if (obj instanceof d) {
            p(i10, (d) obj, e10, i11 + 1);
        } else {
            this.f218611b = i11;
        }
    }

    @Override // kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public void remove() {
        m();
        if (this.f218612c) {
            E eB = b();
            Y.a(this.f239275d).remove(this.f239276e);
            p(eB != null ? eB.hashCode() : 0, this.f239275d.f218607c, eB, 0);
        } else {
            Y.a(this.f239275d).remove(this.f239276e);
        }
        this.f239276e = null;
        this.f239277f = false;
        this.f239278g = this.f239275d.f218608d;
    }
}
