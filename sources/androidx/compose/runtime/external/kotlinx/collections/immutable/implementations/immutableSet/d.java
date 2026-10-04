package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.r;
import fd.InterfaceC4421d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.collections.B;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class d<E> extends c<E> implements Iterator<E>, InterfaceC4421d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f99648i = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b<E> f99649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public E f99650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f99651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f99652h;

    public d(@NotNull b<E> bVar) {
        super(bVar.f99641c);
        this.f99649e = bVar;
        this.f99652h = bVar.f99642d;
    }

    private final void j() {
        if (this.f99649e.f99642d != this.f99652h) {
            throw new ConcurrentModificationException();
        }
    }

    private final void m() {
        if (!this.f99651g) {
            throw new IllegalStateException();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public E next() {
        j();
        E e10 = (E) super.next();
        this.f99650f = e10;
        this.f99651g = true;
        return e10;
    }

    public final boolean o(e<?> eVar) {
        return eVar.f99656a == 0;
    }

    public final void p(int i10, e<?> eVar, E e10, int i11) {
        if (o(eVar)) {
            int iBg = B.bg(eVar.f99657b, e10);
            f<E> fVar = this.f99645a.get(i11);
            fVar.f99660a = eVar.f99657b;
            fVar.f99661b = iBg;
            this.f99646b = i11;
            return;
        }
        int iQ = eVar.q(1 << TrieNodeKt.f(i10, i11 * 5));
        f<E> fVar2 = this.f99645a.get(i11);
        Object[] objArr = eVar.f99657b;
        fVar2.f99660a = objArr;
        fVar2.f99661b = iQ;
        Object obj = objArr[iQ];
        if (obj instanceof e) {
            p(i10, (e) obj, e10, i11 + 1);
        } else {
            this.f99646b = i11;
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.c, java.util.Iterator
    public void remove() {
        m();
        if (this.f99647c) {
            E eB = b();
            Y.a(this.f99649e).remove(this.f99650f);
            p(eB != null ? eB.hashCode() : 0, this.f99649e.f99641c, eB, 0);
        } else {
            Y.a(this.f99649e).remove(this.f99650f);
        }
        this.f99650f = null;
        this.f99651g = false;
        this.f99652h = this.f99649e.f99642d;
    }
}
