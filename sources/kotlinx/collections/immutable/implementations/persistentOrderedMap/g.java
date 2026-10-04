package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import fd.InterfaceC4421d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class g<K, V> implements Iterator<a<V>>, InterfaceC4421d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f218646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedMapBuilder<K, V> f218647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Object f218648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f218649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f218651f;

    public g(@Nullable Object obj, @NotNull PersistentOrderedMapBuilder<K, V> builder) {
        G.p(builder, "builder");
        this.f218646a = obj;
        this.f218647b = builder;
        this.f218648c = ud.c.f239701a;
        this.f218650e = builder.f218632d.f218554e;
    }

    private final void b() {
        if (this.f218647b.f218632d.f218554e != this.f218650e) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void e() {
        if (!this.f218649d) {
            throw new IllegalStateException();
        }
    }

    @NotNull
    public final PersistentOrderedMapBuilder<K, V> f() {
        return this.f218647b;
    }

    public final int g() {
        return this.f218651f;
    }

    @Nullable
    public final Object h() {
        return this.f218648c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f218651f < this.f218647b.size();
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        b();
        d();
        Object obj = this.f218646a;
        this.f218648c = obj;
        this.f218649d = true;
        this.f218651f++;
        a<V> aVar = this.f218647b.f218632d.get(obj);
        if (aVar != null) {
            a<V> aVar2 = aVar;
            this.f218646a = aVar2.f218639c;
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f218646a + ") has changed after it was added to the persistent map.");
    }

    public final void j(int i10) {
        this.f218651f = i10;
    }

    public final void m(@Nullable Object obj) {
        this.f218648c = obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        e();
        Y.k(this.f218647b).remove(this.f218648c);
        this.f218648c = null;
        this.f218649d = false;
        this.f218650e = this.f218647b.f218632d.f218554e;
        this.f218651f--;
    }
}
