package K;

import fd.InterfaceC4421d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public class i<K, V> implements Iterator<a<V>>, InterfaceC4421d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f58307g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f58308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d<K, V> f58309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Object f58310c = M.c.f58782a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f58311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f58312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f58313f;

    public i(@Nullable Object obj, @NotNull d<K, V> dVar) {
        this.f58308a = obj;
        this.f58309b = dVar;
        this.f58312e = dVar.f58298d.getModCount$runtime_release();
    }

    private final void b() {
        if (this.f58309b.f58298d.getModCount$runtime_release() != this.f58312e) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void e() {
        if (!this.f58311d) {
            throw new IllegalStateException();
        }
    }

    @NotNull
    public final d<K, V> f() {
        return this.f58309b;
    }

    public final int g() {
        return this.f58313f;
    }

    @Nullable
    public final Object h() {
        return this.f58310c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f58313f < this.f58309b.size();
    }

    @Override // java.util.Iterator
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a<V> next() {
        b();
        d();
        Object obj = this.f58308a;
        this.f58310c = obj;
        this.f58311d = true;
        this.f58313f++;
        a<V> aVar = this.f58309b.f58298d.get(obj);
        if (aVar != null) {
            a<V> aVar2 = aVar;
            this.f58308a = aVar2.f58285c;
            return aVar2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f58308a + ") has changed after it was added to the persistent map.");
    }

    public final void j(int i10) {
        this.f58313f = i10;
    }

    public final void m(@Nullable Object obj) {
        this.f58310c = obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        e();
        Y.k(this.f58309b).remove(this.f58310c);
        this.f58310c = null;
        this.f58311d = false;
        this.f58312e = this.f58309b.f58298d.getModCount$runtime_release();
        this.f58313f--;
    }
}
