package md;

import java.lang.Comparable;
import kotlin.jvm.internal.G;
import md.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class i<T extends Comparable<? super T>> implements g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f221136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final T f221137b;

    public i(@NotNull T start, @NotNull T endInclusive) {
        G.p(start, "start");
        G.p(endInclusive, "endInclusive");
        this.f221136a = start;
        this.f221137b = endInclusive;
    }

    @Override // md.g
    @NotNull
    public T b() {
        return this.f221136a;
    }

    @Override // md.g
    public /* bridge */ boolean contains(@NotNull T t10) {
        return g.a.a(this, t10);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (isEmpty() && ((i) obj).isEmpty()) {
            return true;
        }
        i iVar = (i) obj;
        return G.g(b(), iVar.b()) && G.g(h(), iVar.h());
    }

    @Override // md.g
    @NotNull
    public T h() {
        return this.f221137b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return h().hashCode() + (b().hashCode() * 31);
    }

    @Override // md.g
    public /* bridge */ boolean isEmpty() {
        return g.a.b(this);
    }

    @NotNull
    public String toString() {
        return b() + ".." + h();
    }
}
