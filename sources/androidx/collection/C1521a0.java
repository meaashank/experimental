package androidx.collection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.collection.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1521a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f86937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f86938b;

    public C1521a0(long j10, long j11) {
        this.f86937a = j10;
        this.f86938b = j11;
    }

    public final long a() {
        return this.f86937a;
    }

    public final long b() {
        return this.f86938b;
    }

    public final long c() {
        return this.f86937a;
    }

    public final long d() {
        return this.f86938b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1521a0)) {
            return false;
        }
        C1521a0 c1521a0 = (C1521a0) obj;
        return c1521a0.f86937a == this.f86937a && c1521a0.f86938b == this.f86938b;
    }

    public int hashCode() {
        return C1550p.a(this.f86937a) ^ C1550p.a(this.f86938b);
    }

    @NotNull
    public String toString() {
        return "(" + this.f86937a + U6.j.f68738d + this.f86938b + ')';
    }
}
