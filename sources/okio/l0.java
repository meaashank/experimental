package okio;

import com.google.common.base.Ascii;
import com.mbridge.msdk.MBridgeConstans;
import okio.C5360j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5360j.a f226063a = new C5360j.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f226064b = -1234567890;

    public static final int a(byte b10, int i10) {
        return b10 & i10;
    }

    public static final long b(byte b10, long j10) {
        return j10 & ((long) b10);
    }

    public static final long c(int i10, long j10) {
        return j10 & ((long) i10);
    }

    public static final boolean d(@NotNull byte[] a10, int i10, @NotNull byte[] b10, int i11, int i12) {
        kotlin.jvm.internal.G.p(a10, "a");
        kotlin.jvm.internal.G.p(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbA = androidx.compose.runtime.snapshots.z.a("size=", j10, " offset=");
            sbA.append(j11);
            sbA.append(" byteCount=");
            sbA.append(j12);
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }
    }

    public static final int f() {
        return f226064b;
    }

    @NotNull
    public static final C5360j.a g() {
        return f226063a;
    }

    public static /* synthetic */ void h() {
    }

    public static final int i(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static final long j(int i10, long j10) {
        return Math.min(i10, j10);
    }

    public static final long k(long j10, int i10) {
        return Math.min(j10, i10);
    }

    public static final int l(@NotNull ByteString byteString, int i10) {
        kotlin.jvm.internal.G.p(byteString, "<this>");
        return i10 == f226064b ? byteString.y() : i10;
    }

    public static final int m(@NotNull byte[] bArr, int i10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return i10 == f226064b ? bArr.length : i10;
    }

    @NotNull
    public static final C5360j.a n(@NotNull C5360j.a unsafeCursor) {
        kotlin.jvm.internal.G.p(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f226063a ? new C5360j.a() : unsafeCursor;
    }

    public static final int o(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long p(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((k0.C.f214270a & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short q(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final long r(long j10, int i10) {
        return (j10 << (64 - i10)) | (j10 >>> i10);
    }

    public static final int s(byte b10, int i10) {
        return b10 << i10;
    }

    public static final int t(byte b10, int i10) {
        return b10 >> i10;
    }

    @NotNull
    public static final String u(byte b10) {
        char[] cArr = okio.internal.e.f226044a;
        return kotlin.text.F.N1(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & Ascii.SI]});
    }

    @NotNull
    public static final String v(int i10) {
        if (i10 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        char[] cArr = okio.internal.e.f226044a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        return kotlin.text.F.O1(cArr2, i11, 8);
    }

    @NotNull
    public static final String w(long j10) {
        if (j10 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        char[] cArr = okio.internal.e.f226044a;
        int i10 = 0;
        char[] cArr2 = {cArr[(int) ((j10 >> 60) & 15)], cArr[(int) ((j10 >> 56) & 15)], cArr[(int) ((j10 >> 52) & 15)], cArr[(int) ((j10 >> 48) & 15)], cArr[(int) ((j10 >> 44) & 15)], cArr[(int) ((j10 >> 40) & 15)], cArr[(int) ((j10 >> 36) & 15)], cArr[(int) ((j10 >> 32) & 15)], cArr[(int) ((j10 >> 28) & 15)], cArr[(int) ((j10 >> 24) & 15)], cArr[(int) ((j10 >> 20) & 15)], cArr[(int) ((j10 >> 16) & 15)], cArr[(int) ((j10 >> 12) & 15)], cArr[(int) ((j10 >> 8) & 15)], cArr[(int) ((j10 >> 4) & 15)], cArr[(int) (j10 & 15)]};
        while (i10 < 16 && cArr2[i10] == '0') {
            i10++;
        }
        return kotlin.text.F.O1(cArr2, i10, 16);
    }

    public static final byte x(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }
}
