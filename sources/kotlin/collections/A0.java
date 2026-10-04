package kotlin.collections;

import fd.InterfaceC4418a;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class A0 implements Iterator<Short>, InterfaceC4418a {
    @NotNull
    public final Short b() {
        return Short.valueOf(d());
    }

    public abstract short d();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(d());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
