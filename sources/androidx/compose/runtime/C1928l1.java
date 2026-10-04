package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.runtime.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1928l1 extends Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Q1 f99952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99953b;

    public C1928l1(@NotNull Q1 q12, int i10) {
        this.f99952a = q12;
        this.f99953b = i10;
    }

    @Override // androidx.compose.runtime.Q1
    @NotNull
    public Object a(@NotNull C1973v1 c1973v1) {
        return new S1(this.f99952a.a(c1973v1), this.f99953b);
    }

    public final int b() {
        return this.f99953b;
    }

    @NotNull
    public final Q1 c() {
        return this.f99952a;
    }
}
