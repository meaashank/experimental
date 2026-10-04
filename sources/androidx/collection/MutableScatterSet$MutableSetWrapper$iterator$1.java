package androidx.collection;

import fd.InterfaceC4421d;
import java.util.Iterator;
import kotlin.sequences.C5004q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterSet$MutableSetWrapper$iterator$1<E> implements Iterator<E>, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86787a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Iterator<E> f86788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet<E> f86789c;

    public MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet<E> mutableScatterSet) {
        this.f86789c = mutableScatterSet;
        this.f86788b = C5004q.a(new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(mutableScatterSet, this, null));
    }

    public final int b() {
        return this.f86787a;
    }

    @NotNull
    public final Iterator<E> d() {
        return this.f86788b;
    }

    public final void e(int i10) {
        this.f86787a = i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f86788b.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.f86788b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i10 = this.f86787a;
        if (i10 != -1) {
            this.f86789c.j0(i10);
            this.f86787a = -1;
        }
    }
}
