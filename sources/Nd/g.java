package Nd;

import androidx.collection.N0;
import com.prism.commons.utils.C3860y;
import kotlin.jvm.internal.G;
import okio.ByteString;
import okio.C5360j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f65013a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f65014b = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65015c = 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f65016d = 64;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f65017e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65018f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f65019g = 15;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f65020h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f65021i = 128;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f65022j = 127;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f65023k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f65024l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f65025m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f65026n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f65027o = 9;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f65028p = 10;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f65029q = 125;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f65030r = 123;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f65031s = 126;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f65032t = 65535;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f65033u = 127;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f65034v = 1001;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f65035w = 1005;

    @NotNull
    public final String a(@NotNull String key) {
        G.p(key, "key");
        return ByteString.f225866d.l(G.C(key, f65014b)).p(C3860y.f162169b).h();
    }

    @Nullable
    public final String b(int i10) {
        if (i10 < 1000 || i10 >= 5000) {
            return G.C("Code must be in range [1000,5000): ", Integer.valueOf(i10));
        }
        if ((1004 > i10 || i10 >= 1007) && (1015 > i10 || i10 >= 3000)) {
            return null;
        }
        return N0.a("Code ", i10, " is reserved and may not be used.");
    }

    public final void c(@NotNull C5360j.a cursor, @NotNull byte[] key) {
        G.p(cursor, "cursor");
        G.p(key, "key");
        int length = key.length;
        int i10 = 0;
        do {
            byte[] bArr = cursor.f226056e;
            int i11 = cursor.f226057f;
            int i12 = cursor.f226058g;
            if (bArr != null) {
                while (i11 < i12) {
                    int i13 = i10 % length;
                    bArr[i11] = (byte) (bArr[i11] ^ key[i13]);
                    i11++;
                    i10 = i13 + 1;
                }
            }
        } while (cursor.k() != -1);
    }

    public final void d(int i10) {
        String strB = b(i10);
        if (strB == null) {
            return;
        }
        G.m(strB);
        throw new IllegalArgumentException(strB.toString());
    }
}
