package kotlin;

/* JADX INFO: renamed from: kotlin.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4884d {
    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final char a(int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Invalid Char code: ", i10));
        }
        return (char) i10;
    }

    public static final int b(char c10) {
        return c10;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.g
    @Xc.f
    public static /* synthetic */ void c(char c10) {
    }
}
