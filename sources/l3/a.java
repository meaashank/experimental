package L3;

import dd.j;

/* JADX INFO: loaded from: classes3.dex */
@j(name = "IntUtils")
public final class a {
    public static final int a(int i10) {
        return (i10 << 16) >>> 16;
    }

    public static final int b(int i10) {
        return (i10 >>> 16) << 16;
    }
}
