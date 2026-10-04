package kotlin;

/* JADX INFO: loaded from: classes7.dex */
public final class J0 {
    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] a(int i10, ed.l<? super Integer, H0> init) {
        kotlin.jvm.internal.G.p(init, "init");
        short[] sArr = new short[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sArr[i11] = init.invoke(Integer.valueOf(i11)).f217458a;
        }
        return sArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final short[] b(short... sArr) {
        kotlin.jvm.internal.G.p(sArr, "$v$c$kotlin-UShortArray$-elements$0");
        return sArr;
    }
}
