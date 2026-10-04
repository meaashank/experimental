package md;

import java.lang.Comparable;
import kotlin.jvm.internal.G;
import md.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class h<T extends Comparable<? super T>> implements r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f221134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final T f221135b;

    public h(@NotNull T start, @NotNull T endExclusive) {
        G.p(start, "start");
        G.p(endExclusive, "endExclusive");
        this.f221134a = start;
        this.f221135b = endExclusive;
    }

    @Override // md.r
    @NotNull
    public T b() {
        return this.f221134a;
    }

    @Override // md.r
    public /* bridge */ boolean contains(@NotNull T t10) {
        return r.a.a(this, t10);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (isEmpty() && ((h) obj).isEmpty()) {
            return true;
        }
        h hVar = (h) obj;
        return G.g(b(), hVar.b()) && G.g(i(), hVar.i());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return i().hashCode() + (b().hashCode() * 31);
    }

    @Override // md.r
    @NotNull
    public T i() {
        return this.f221135b;
    }

    @Override // md.r
    public /* bridge */ boolean isEmpty() {
        return r.a.b(this);
    }

    @NotNull
    public String toString() {
        return b() + "..<" + i();
    }
}
