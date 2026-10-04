package kotlin.io.encoding;

import ad.C1471b;
import ad.InterfaceC1473d;
import androidx.collection.C1545m0;
import androidx.compose.foundation.text.C1758e;
import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import kotlin.C;
import kotlin.InterfaceC4887e0;
import kotlin.O0;
import kotlin.collections.AbstractC4859d;
import kotlin.enums.c;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.C5013e;
import okio.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "2.2")
@O0(markerClass = {InterfaceC1473d.class})
public class Base64 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f217715g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f217716h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f217717i = 3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f217718j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte f217719k = 61;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f217720l = 76;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f217721m = 64;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Base64 f217723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Base64 f217724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Base64 f217725q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f217726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f217728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PaddingOption f217729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f217730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f217714f = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final byte[] f217722n = {13, 10};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC4887e0(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
    public static final class PaddingOption {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ PaddingOption[] $VALUES;
        public static final PaddingOption PRESENT = new PaddingOption("PRESENT", 0);
        public static final PaddingOption ABSENT = new PaddingOption("ABSENT", 1);
        public static final PaddingOption PRESENT_OPTIONAL = new PaddingOption("PRESENT_OPTIONAL", 2);
        public static final PaddingOption ABSENT_OPTIONAL = new PaddingOption("ABSENT_OPTIONAL", 3);

        private static final /* synthetic */ PaddingOption[] $values() {
            return new PaddingOption[]{PRESENT, ABSENT, PRESENT_OPTIONAL, ABSENT_OPTIONAL};
        }

        static {
            PaddingOption[] paddingOptionArr$values = $values();
            $VALUES = paddingOptionArr$values;
            $ENTRIES = c.c(paddingOptionArr$values);
        }

        private PaddingOption(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<PaddingOption> getEntries() {
            return $ENTRIES;
        }

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) $VALUES.clone();
        }
    }

    public static final class a extends Base64 {
        public /* synthetic */ a(C4969v c4969v) {
            this();
        }

        @NotNull
        public final Base64 M() {
            return Base64.f217724p;
        }

        @NotNull
        public final byte[] N() {
            return Base64.f217722n;
        }

        @NotNull
        public final Base64 O() {
            return Base64.f217725q;
        }

        @NotNull
        public final Base64 P() {
            return Base64.f217723o;
        }

        public a() {
            super(false, false, -1, PaddingOption.PRESENT);
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        f217723o = new Base64(true, false, -1, paddingOption);
        f217724p = new Base64(false, true, 76, paddingOption);
        f217725q = new Base64(false, true, 64, paddingOption);
    }

    public /* synthetic */ Base64(boolean z10, boolean z11, int i10, PaddingOption paddingOption, C4969v c4969v) {
        this(z10, z11, i10, paddingOption);
    }

    public static /* synthetic */ Appendable A(Base64 base64, byte[] bArr, Appendable appendable, int i10, int i11, int i12, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        base64.z(bArr, appendable, i10, i11);
        return appendable;
    }

    public static /* synthetic */ byte[] C(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.B(bArr, i10, i11);
    }

    public static /* synthetic */ byte[] l(Base64 base64, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return base64.j(charSequence, i10, i11);
    }

    public static /* synthetic */ byte[] m(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.k(bArr, i10, i11);
    }

    public static /* synthetic */ int q(Base64 base64, CharSequence charSequence, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = charSequence.length();
        }
        return base64.o(charSequence, bArr, i10, i11, i12);
    }

    public static /* synthetic */ int r(Base64 base64, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return base64.p(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ String u(Base64 base64, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return base64.t(bArr, i10, i11);
    }

    public static /* synthetic */ int w(Base64 base64, byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((i13 & 4) != 0) {
            i10 = 0;
        }
        if ((i13 & 8) != 0) {
            i11 = 0;
        }
        if ((i13 & 16) != 0) {
            i12 = bArr.length;
        }
        return base64.v(bArr, bArr2, i10, i11, i12);
    }

    @NotNull
    public final byte[] B(@NotNull byte[] source, int i10, int i11) {
        G.p(source, "source");
        return D(source, i10, i11);
    }

    @NotNull
    public final byte[] D(@NotNull byte[] source, int i10, int i11) {
        G.p(source, "source");
        i(source.length, i10, i11);
        byte[] bArr = new byte[y(i11 - i10)];
        x(source, bArr, 0, i10, i11);
        return bArr;
    }

    public final int E() {
        return this.f217728c;
    }

    @NotNull
    public final PaddingOption F() {
        return this.f217729d;
    }

    public final int G(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == -8) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Redundant pad character at index ", i10));
        }
        if (i12 == -6) {
            h(i10);
            return i10 + 1;
        }
        if (i12 != -4) {
            if (i12 == -2) {
                return i10 + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        h(i10);
        int iK = K(bArr, i10 + 1, i11);
        if (iK == i11 || bArr[iK] != 61) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Missing one pad character at index ", iK));
        }
        return iK + 1;
    }

    public final boolean H() {
        return this.f217727b;
    }

    public final boolean I() {
        return this.f217726a;
    }

    public final boolean J() {
        PaddingOption paddingOption = this.f217729d;
        return paddingOption == PaddingOption.PRESENT || paddingOption == PaddingOption.PRESENT_OPTIONAL;
    }

    public final int K(byte[] bArr, int i10, int i11) {
        if (!this.f217727b) {
            return i10;
        }
        while (i10 < i11) {
            if (C1471b.f84825b[bArr[i10] & 255] != -1) {
                break;
            }
            i10++;
        }
        return i10;
    }

    @InterfaceC4887e0(version = MBridgeConstans.NATIVE_VIDEO_VERSION)
    @NotNull
    public final Base64 L(@NotNull PaddingOption option) {
        G.p(option, "option");
        return this.f217729d == option ? this : new Base64(this.f217726a, this.f217727b, this.f217728c, option);
    }

    @NotNull
    public final String e(@NotNull byte[] source) {
        G.p(source, "source");
        StringBuilder sb2 = new StringBuilder(source.length);
        for (byte b10 : source) {
            sb2.append((char) b10);
        }
        return sb2.toString();
    }

    @NotNull
    public final byte[] f(@NotNull CharSequence source, int i10, int i11) {
        G.p(source, "source");
        i(source.length(), i10, i11);
        byte[] bArr = new byte[i11 - i10];
        int i12 = 0;
        while (i10 < i11) {
            char cCharAt = source.charAt(i10);
            if (cCharAt <= 255) {
                bArr[i12] = (byte) cCharAt;
                i12++;
            } else {
                bArr[i12] = h0.f225962a;
                i12++;
            }
            i10++;
        }
        return bArr;
    }

    public final void g(int i10, int i11, int i12) {
        if (i11 < 0 || i11 > i10) {
            throw new IndexOutOfBoundsException(C1758e.a("destination offset: ", i11, ", destination size: ", i10));
        }
        int i13 = i11 + i12;
        if (i13 < 0 || i13 > i10) {
            StringBuilder sbA = C1545m0.a("The destination array does not have enough capacity, destination offset: ", i11, ", destination size: ", i10, ", capacity needed: ");
            sbA.append(i12);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
    }

    public final void h(int i10) {
        if (this.f217729d == PaddingOption.ABSENT) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("The padding option is set to ABSENT, but the input has a pad character at index ", i10));
        }
    }

    public final void i(int i10, int i11, int i12) {
        AbstractC4859d.f217603a.a(i11, i12, i10);
    }

    @NotNull
    public final byte[] j(@NotNull CharSequence source, int i10, int i11) {
        byte[] bArrF;
        G.p(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            i(str.length(), i10, i11);
            String strSubstring = str.substring(i10, i11);
            G.o(strSubstring, "substring(...)");
            bArrF = strSubstring.getBytes(C5013e.f218331g);
            G.o(bArrF, "getBytes(...)");
        } else {
            bArrF = f(source, i10, i11);
        }
        return m(this, bArrF, 0, 0, 6, null);
    }

    @NotNull
    public final byte[] k(@NotNull byte[] source, int i10, int i11) {
        G.p(source, "source");
        i(source.length, i10, i11);
        int iS = s(source, i10, i11);
        byte[] bArr = new byte[iS];
        if (n(source, bArr, 0, i10, i11) == iS) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        if (r7 == (-2)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        if (r7 == (-8)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (r4 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
    
        if (r19.f217729d == kotlin.io.encoding.Base64.PaddingOption.PRESENT) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r8 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        r3 = K(r20, r6, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        if (r3 < r24) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f7, code lost:
    
        return r9 - r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:
    
        r1 = r20[r3] & 255;
        r4 = new java.lang.StringBuilder("Symbol '");
        r4.append((char) r1);
        r4.append("'(");
        kotlin.text.C5011c.a(8);
        r1 = java.lang.Integer.toString(r1, 8);
        kotlin.jvm.internal.G.o(r1, "toString(...)");
        r4.append(r1);
        r4.append(") at index ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        throw new java.lang.IllegalArgumentException(android.support.v4.media.d.a(r4, r3 - 1, " is prohibited after the pad character"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0131, code lost:
    
        throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0139, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(byte[] r20, byte[] r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.Base64.n(byte[], byte[], int, int, int):int");
    }

    public final int o(@NotNull CharSequence source, @NotNull byte[] destination, int i10, int i11, int i12) {
        byte[] bArrF;
        G.p(source, "source");
        G.p(destination, "destination");
        if (source instanceof String) {
            String str = (String) source;
            i(str.length(), i11, i12);
            String strSubstring = str.substring(i11, i12);
            G.o(strSubstring, "substring(...)");
            bArrF = strSubstring.getBytes(C5013e.f218331g);
            G.o(bArrF, "getBytes(...)");
        } else {
            bArrF = f(source, i11, i12);
        }
        return r(this, bArrF, destination, i10, 0, 0, 24, null);
    }

    public final int p(@NotNull byte[] source, @NotNull byte[] destination, int i10, int i11, int i12) {
        G.p(source, "source");
        G.p(destination, "destination");
        i(source.length, i11, i12);
        g(destination.length, i10, s(source, i11, i12));
        return n(source, destination, i10, i11, i12);
    }

    public final int s(@NotNull byte[] source, int i10, int i11) {
        G.p(source, "source");
        int i12 = i11 - i10;
        if (i12 == 0) {
            return 0;
        }
        if (i12 == 1) {
            throw new IllegalArgumentException(C1758e.a("Input should have at least 2 symbols for Base64 decoding, startIndex: ", i10, ", endIndex: ", i11));
        }
        if (this.f217727b) {
            while (true) {
                if (i10 >= i11) {
                    break;
                }
                int i13 = C1471b.f84825b[source[i10] & 255];
                if (i13 < 0) {
                    if (i13 == -2) {
                        i12 -= i11 - i10;
                        break;
                    }
                    i12--;
                }
                i10++;
            }
        } else if (source[i11 - 1] == 61) {
            i12 = source[i11 + (-2)] == 61 ? i12 - 2 : i12 - 1;
        }
        return (int) ((((long) i12) * ((long) 6)) / ((long) 8));
    }

    @NotNull
    public final String t(@NotNull byte[] source, int i10, int i11) {
        G.p(source, "source");
        return new String(D(source, i10, i11), C5013e.f218331g);
    }

    public final int v(@NotNull byte[] source, @NotNull byte[] destination, int i10, int i11, int i12) {
        G.p(source, "source");
        G.p(destination, "destination");
        return x(source, destination, i10, i11, i12);
    }

    public final int x(@NotNull byte[] source, @NotNull byte[] destination, int i10, int i11, int i12) {
        int i13 = i11;
        G.p(source, "source");
        G.p(destination, "destination");
        i(source.length, i13, i12);
        g(destination.length, i10, y(i12 - i13));
        byte[] bArr = this.f217726a ? C1471b.f84826c : C1471b.f84824a;
        int i14 = this.f217727b ? this.f217730e : Integer.MAX_VALUE;
        int i15 = i10;
        while (i13 + 2 < i12) {
            int iMin = Math.min((i12 - i13) / 3, i14);
            for (int i16 = 0; i16 < iMin; i16++) {
                int i17 = source[i13] & 255;
                int i18 = i13 + 2;
                int i19 = source[i13 + 1] & 255;
                i13 += 3;
                int i20 = (i19 << 8) | (i17 << 16) | (source[i18] & 255);
                destination[i15] = bArr[i20 >>> 18];
                destination[i15 + 1] = bArr[(i20 >>> 12) & 63];
                int i21 = i15 + 3;
                destination[i15 + 2] = bArr[(i20 >>> 6) & 63];
                i15 += 4;
                destination[i21] = bArr[i20 & 63];
            }
            if (iMin == i14 && i13 != i12) {
                int i22 = i15 + 1;
                byte[] bArr2 = f217722n;
                destination[i15] = bArr2[0];
                i15 += 2;
                destination[i22] = bArr2[1];
            }
        }
        int i23 = i12 - i13;
        if (i23 == 1) {
            int i24 = i13 + 1;
            int i25 = (source[i13] & 255) << 4;
            destination[i15] = bArr[i25 >>> 6];
            int i26 = i15 + 2;
            destination[i15 + 1] = bArr[i25 & 63];
            if (J()) {
                int i27 = i15 + 3;
                destination[i26] = f217719k;
                i15 += 4;
                destination[i27] = f217719k;
                i13 = i24;
            } else {
                i13 = i24;
                i15 = i26;
            }
        } else if (i23 == 2) {
            int i28 = i13 + 1;
            int i29 = source[i13] & 255;
            i13 += 2;
            int i30 = ((source[i28] & 255) << 2) | (i29 << 10);
            destination[i15] = bArr[i30 >>> 12];
            destination[i15 + 1] = bArr[(i30 >>> 6) & 63];
            int i31 = i15 + 3;
            destination[i15 + 2] = bArr[i30 & 63];
            if (J()) {
                i15 += 4;
                destination[i31] = f217719k;
            } else {
                i15 = i31;
            }
        }
        if (i13 == i12) {
            return i15 - i10;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int y(int i10) {
        int i11 = i10 / 3;
        int i12 = i10 % 3;
        int i13 = i11 * 4;
        if (i12 != 0) {
            i13 += J() ? 4 : i12 + 1;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.f217727b) {
            i13 += ((i13 - 1) / this.f217728c) * 2;
        }
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @C
    @NotNull
    public final <A extends Appendable> A z(@NotNull byte[] source, @NotNull A destination, int i10, int i11) throws IOException {
        G.p(source, "source");
        G.p(destination, "destination");
        destination.append(new String(D(source, i10, i11), C5013e.f218331g));
        return destination;
    }

    public Base64(boolean z10, boolean z11, int i10, PaddingOption paddingOption) {
        this.f217726a = z10;
        this.f217727b = z11;
        this.f217728c = i10;
        this.f217729d = paddingOption;
        if (z10 && z11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f217730e = i10 / 4;
    }
}
