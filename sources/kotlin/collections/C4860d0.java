package kotlin.collections;

import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4860d0<T> implements Iterable<C4858c0<? extends T>>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Iterator<T>> f217611a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4860d0(@NotNull InterfaceC4376a<? extends Iterator<? extends T>> iteratorFactory) {
        kotlin.jvm.internal.G.p(iteratorFactory, "iteratorFactory");
        this.f217611a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<C4858c0<T>> iterator() {
        return new C4862e0(this.f217611a.invoke());
    }
}
