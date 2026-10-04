package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4971x extends N<double[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final double[] f217982d;

    public C4971x(int i10) {
        super(i10);
        this.f217982d = new double[i10];
    }

    public final void h(double d10) {
        double[] dArr = this.f217982d;
        int i10 = this.f217891b;
        this.f217891b = i10 + 1;
        dArr[i10] = d10;
    }

    @Override // kotlin.jvm.internal.N
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull double[] dArr) {
        G.p(dArr, "<this>");
        return dArr.length;
    }

    @NotNull
    public final double[] j() {
        double[] dArr = this.f217982d;
        double[] dArr2 = new double[f()];
        g(dArr, dArr2);
        return dArr2;
    }
}
