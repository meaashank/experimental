package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4964p extends N<byte[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final byte[] f217956d;

    public C4964p(int i10) {
        super(i10);
        this.f217956d = new byte[i10];
    }

    public final void h(byte b10) {
        byte[] bArr = this.f217956d;
        int i10 = this.f217891b;
        this.f217891b = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // kotlin.jvm.internal.N
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull byte[] bArr) {
        G.p(bArr, "<this>");
        return bArr.length;
    }

    @NotNull
    public final byte[] j() {
        byte[] bArr = this.f217956d;
        byte[] bArr2 = new byte[f()];
        g(bArr, bArr2);
        return bArr2;
    }
}
