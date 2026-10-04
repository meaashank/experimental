package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class q0<E> extends AbstractC4859d<E> implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<E> f217642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f217643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f217644e;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@NotNull List<? extends E> list) {
        kotlin.jvm.internal.G.p(list, "list");
        this.f217642c = list;
    }

    @Override // kotlin.collections.AbstractC4859d, java.util.List
    public E get(int i10) {
        AbstractC4859d.f217603a.b(i10, this.f217644e);
        return this.f217642c.get(this.f217643d + i10);
    }

    @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
    public int getSize() {
        return this.f217644e;
    }

    public final void h(int i10, int i11) {
        AbstractC4859d.f217603a.d(i10, i11, this.f217642c.size());
        this.f217643d = i10;
        this.f217644e = i11 - i10;
    }
}
