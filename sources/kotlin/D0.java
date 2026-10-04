package kotlin;

/* JADX INFO: loaded from: classes7.dex */
public final class D0 {
    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] a(int i10, ed.l<? super Integer, B0> init) {
        kotlin.jvm.internal.G.p(init, "init");
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = init.invoke(Integer.valueOf(i11)).f217440a;
        }
        return jArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @Xc.f
    public static final long[] b(long... jArr) {
        kotlin.jvm.internal.G.p(jArr, "$v$c$kotlin-ULongArray$-elements$0");
        return jArr;
    }
}
