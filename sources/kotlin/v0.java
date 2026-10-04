package kotlin;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 {
    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] a(int i10, ed.l<? super Integer, t0> init) {
        kotlin.jvm.internal.G.p(init, "init");
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = init.invoke(Integer.valueOf(i11)).f218221a;
        }
        return bArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final byte[] b(byte... bArr) {
        kotlin.jvm.internal.G.p(bArr, "$v$c$kotlin-UByteArray$-elements$0");
        return bArr;
    }
}
