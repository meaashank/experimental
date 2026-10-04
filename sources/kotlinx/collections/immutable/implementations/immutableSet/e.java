package kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Object[] f218618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218619b;

    public e() {
        d.f218613d.getClass();
        this.f218618a = d.f218614e.f218616b;
    }

    public static /* synthetic */ void i(e eVar, Object[] objArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        eVar.h(objArr, i10);
    }

    public final E a() {
        d();
        return (E) this.f218618a[this.f218619b];
    }

    @NotNull
    public final d<? extends E> b() {
        e();
        Object obj = this.f218618a[this.f218619b];
        G.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (d) obj;
    }

    public final boolean c() {
        return this.f218619b < this.f218618a.length;
    }

    public final boolean d() {
        return c() && !(this.f218618a[this.f218619b] instanceof d);
    }

    public final boolean e() {
        return c() && (this.f218618a[this.f218619b] instanceof d);
    }

    public final void f() {
        c();
        this.f218619b++;
    }

    public final E g() {
        d();
        Object[] objArr = this.f218618a;
        int i10 = this.f218619b;
        this.f218619b = i10 + 1;
        return (E) objArr[i10];
    }

    public final void h(@NotNull Object[] buffer, int i10) {
        G.p(buffer, "buffer");
        this.f218618a = buffer;
        this.f218619b = i10;
    }
}
