package kotlin;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 {
    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] a(int i10, ed.l<? super Integer, x0> init) {
        kotlin.jvm.internal.G.p(init, "init");
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = init.invoke(Integer.valueOf(i11)).f218498a;
        }
        return iArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final int[] b(int... iArr) {
        kotlin.jvm.internal.G.p(iArr, "$v$c$kotlin-UIntArray$-elements$0");
        return iArr;
    }
}
