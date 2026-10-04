package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.r;
import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.I;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public class c<E> implements Iterator<E>, InterfaceC4418a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99644d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<f<E>> f99645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f99646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f99647c;

    public c(@NotNull e<E> eVar) {
        List<f<E>> listU = I.U(new f());
        this.f99645a = listU;
        this.f99647c = true;
        f.i(listU.get(0), eVar.f99657b, 0, 2, null);
        this.f99646b = 0;
        d();
    }

    private static /* synthetic */ void e() {
    }

    private final int h(int i10) {
        if (this.f99645a.get(i10).d()) {
            return i10;
        }
        if (!this.f99645a.get(i10).e()) {
            return -1;
        }
        e<? extends E> eVarB = this.f99645a.get(i10).b();
        int i11 = i10 + 1;
        if (i11 == this.f99645a.size()) {
            this.f99645a.add(new f<>());
        }
        f.i(this.f99645a.get(i11), eVarB.f99657b, 0, 2, null);
        return h(i11);
    }

    public final E b() {
        return this.f99645a.get(this.f99646b).a();
    }

    public final void d() {
        if (this.f99645a.get(this.f99646b).d()) {
            return;
        }
        for (int i10 = this.f99646b; -1 < i10; i10--) {
            int iH = h(i10);
            if (iH == -1 && this.f99645a.get(i10).c()) {
                this.f99645a.get(i10).f();
                iH = h(i10);
            }
            if (iH != -1) {
                this.f99646b = iH;
                return;
            }
            if (i10 > 0) {
                this.f99645a.get(i10 - 1).f();
            }
            f<E> fVar = this.f99645a.get(i10);
            e.f99653d.getClass();
            fVar.f99660a = e.f99655f.f99657b;
            fVar.f99661b = 0;
        }
        this.f99647c = false;
    }

    @NotNull
    public final List<f<E>> f() {
        return this.f99645a;
    }

    public final int g() {
        return this.f99646b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f99647c;
    }

    public final void i(int i10) {
        this.f99646b = i10;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.f99647c) {
            throw new NoSuchElementException();
        }
        E eG = this.f99645a.get(this.f99646b).g();
        d();
        return eG;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
