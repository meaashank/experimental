package kotlin.collections;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class D implements Iterator<Boolean>, InterfaceC4418a {
    @NotNull
    public final Boolean b() {
        return Boolean.valueOf(d());
    }

    public abstract boolean d();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(d());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
