package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4961m extends N<boolean[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final boolean[] f217950d;

    public C4961m(int i10) {
        super(i10);
        this.f217950d = new boolean[i10];
    }

    public final void h(boolean z10) {
        boolean[] zArr = this.f217950d;
        int i10 = this.f217891b;
        this.f217891b = i10 + 1;
        zArr[i10] = z10;
    }

    @Override // kotlin.jvm.internal.N
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull boolean[] zArr) {
        G.p(zArr, "<this>");
        return zArr.length;
    }

    @NotNull
    public final boolean[] j() {
        boolean[] zArr = this.f217950d;
        boolean[] zArr2 = new boolean[f()];
        g(zArr, zArr2);
        return zArr2;
    }
}
