package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class U extends N<short[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final short[] f217911d;

    public U(int i10) {
        super(i10);
        this.f217911d = new short[i10];
    }

    public final void h(short s10) {
        short[] sArr = this.f217911d;
        int i10 = this.f217891b;
        this.f217891b = i10 + 1;
        sArr[i10] = s10;
    }

    @Override // kotlin.jvm.internal.N
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull short[] sArr) {
        G.p(sArr, "<this>");
        return sArr.length;
    }

    @NotNull
    public final short[] j() {
        short[] sArr = this.f217911d;
        short[] sArr2 = new short[f()];
        g(sArr, sArr2);
        return sArr2;
    }
}
