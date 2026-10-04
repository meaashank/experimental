package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class f<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99659c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public Object[] f99660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f99661b;

    public f() {
        e.f99653d.getClass();
        this.f99660a = e.f99655f.f99657b;
    }

    public static void i(f fVar, Object[] objArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        fVar.f99660a = objArr;
        fVar.f99661b = i10;
    }

    public final E a() {
        d();
        return (E) this.f99660a[this.f99661b];
    }

    @NotNull
    public final e<? extends E> b() {
        e();
        Object obj = this.f99660a[this.f99661b];
        G.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (e) obj;
    }

    public final boolean c() {
        return this.f99661b < this.f99660a.length;
    }

    public final boolean d() {
        return c() && !(this.f99660a[this.f99661b] instanceof e);
    }

    public final boolean e() {
        return c() && (this.f99660a[this.f99661b] instanceof e);
    }

    public final void f() {
        c();
        this.f99661b++;
    }

    public final E g() {
        d();
        Object[] objArr = this.f99660a;
        int i10 = this.f99661b;
        this.f99661b = i10 + 1;
        return (E) objArr[i10];
    }

    public final void h(@NotNull Object[] objArr, int i10) {
        this.f99660a = objArr;
        this.f99661b = i10;
    }
}
