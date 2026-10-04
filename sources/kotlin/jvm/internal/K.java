package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class K extends N<long[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final long[] f217887d;

    public K(int i10) {
        super(i10);
        this.f217887d = new long[i10];
    }

    public final void h(long j10) {
        long[] jArr = this.f217887d;
        int i10 = this.f217891b;
        this.f217891b = i10 + 1;
        jArr[i10] = j10;
    }

    @Override // kotlin.jvm.internal.N
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull long[] jArr) {
        G.p(jArr, "<this>");
        return jArr.length;
    }

    @NotNull
    public final long[] j() {
        long[] jArr = this.f217887d;
        long[] jArr2 = new long[f()];
        g(jArr, jArr2);
        return jArr2;
    }
}
