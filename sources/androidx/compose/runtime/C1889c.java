package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1889c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99426b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99427a;

    public C1889c(int i10) {
        this.f99427a = i10;
    }

    public final int a() {
        return this.f99427a;
    }

    public final boolean b() {
        return this.f99427a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f99427a = i10;
    }

    public final int d(@NotNull C1973v1 c1973v1) {
        return c1973v1.i(this);
    }

    public final int e(@NotNull C1982y1 c1982y1) {
        return c1982y1.G(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return android.support.v4.media.d.a(sb2, this.f99427a, " }");
    }
}
