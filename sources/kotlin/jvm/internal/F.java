package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class F extends N<int[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final int[] f217880d;

    public F(int i10) {
        super(i10);
        this.f217880d = new int[i10];
    }

    public final void h(int i10) {
        int[] iArr = this.f217880d;
        int i11 = this.f217891b;
        this.f217891b = i11 + 1;
        iArr[i11] = i10;
    }

    @Override // kotlin.jvm.internal.N
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull int[] iArr) {
        G.p(iArr, "<this>");
        return iArr.length;
    }

    @NotNull
    public final int[] j() {
        int[] iArr = this.f217880d;
        int[] iArr2 = new int[f()];
        g(iArr, iArr2);
        return iArr2;
    }
}
