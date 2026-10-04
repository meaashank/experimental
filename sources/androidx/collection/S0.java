package androidx.collection;

import kotlin.InterfaceC4850b0;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1980:1\n1770#1:1981\n1804#1,6:1982\n1770#1:1988\n1770#1:1989\n1770#1:1990\n1847#1:1991\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1701#1:1981\n1780#1:1982,6\n1812#1:1988\n1814#1:1989\n1817#1:1990\n1853#1:1991\n*E\n"})
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f86825a = -9187201950435737472L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f86826b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f86827c = 254;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f86828d = 255;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86830f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86831g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f86832h = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86834j = -862048943;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f86835k = 72340172838076673L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f86836l = -9187201950435737472L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final long[] f86829e = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final MutableScatterMap f86833i = new MutableScatterMap(0);

    @InterfaceC4850b0
    public static final long A(@NotNull long[] data, int i10) {
        kotlin.jvm.internal.G.p(data, "data");
        return (data[i10 >> 3] >> ((i10 & 7) << 3)) & 255;
    }

    public static final int B(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return ((i10 - 1) / 7) + i10;
    }

    public static final void C(@NotNull long[] data, int i10, int i11, long j10) {
        kotlin.jvm.internal.G.p(data, "data");
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        long j11 = (j10 << i13) | (data[i12] & (~(255 << i13)));
        data[i12] = j11;
        data[(((i11 - 7) & i10) + (i10 & 7)) >> 3] = j11;
    }

    public static final void D(@NotNull long[] data, int i10, long j10) {
        kotlin.jvm.internal.G.p(data, "data");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        data[i11] = (j10 << i12) | (data[i11] & (~(255 << i12)));
    }

    public static final void a(@NotNull long[] metadata, int i10) {
        kotlin.jvm.internal.G.p(metadata, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = metadata[i12] & (-9187201950435737472L);
            metadata[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int length = metadata.length;
        int i13 = length - 1;
        int i14 = length - 2;
        metadata[i14] = (metadata[i14] & 72057594037927935L) | (-72057594037927936L);
        metadata[i13] = metadata[0];
    }

    @NotNull
    public static final <K, V> ScatterMap<K, V> b() {
        MutableScatterMap mutableScatterMap = f86833i;
        kotlin.jvm.internal.G.n(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int c(@NotNull long[] metadata, int i10, int i11) {
        kotlin.jvm.internal.G.p(metadata, "metadata");
        while (i10 < i11) {
            if (((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int d(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void e() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void f() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void g() {
    }

    public static final long h(@NotNull long[] metadata, int i10) {
        kotlin.jvm.internal.G.p(metadata, "metadata");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        return (((-i12) >> 63) & (metadata[i11 + 1] << (64 - i12))) | (metadata[i11] >>> i12);
    }

    public static final int i(int i10) {
        return i10 >>> 7;
    }

    public static final int j(int i10) {
        return i10 & 127;
    }

    public static final boolean k(long j10) {
        return j10 != 0;
    }

    public static final int l(@Nullable Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * f86834j;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean m(@NotNull long[] metadata, int i10) {
        kotlin.jvm.internal.G.p(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 254;
    }

    public static final boolean n(@NotNull long[] metadata, int i10) {
        kotlin.jvm.internal.G.p(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128;
    }

    @InterfaceC4850b0
    public static final boolean o(long j10) {
        return j10 < 128;
    }

    public static final boolean p(@NotNull long[] metadata, int i10) {
        kotlin.jvm.internal.G.p(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128;
    }

    public static final int q(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    @InterfaceC4850b0
    public static final int r(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static final long s(long j10) {
        return j10 & ((~j10) << 6) & (-9187201950435737472L);
    }

    @InterfaceC4850b0
    public static final long t(long j10) {
        return j10 & ((~j10) << 7) & (-9187201950435737472L);
    }

    @InterfaceC4850b0
    public static final long u(long j10, int i10) {
        long j11 = j10 ^ (((long) i10) * f86835k);
        return (~j11) & (j11 - f86835k) & (-9187201950435737472L);
    }

    @NotNull
    public static final <K, V> MutableScatterMap<K, V> v() {
        return new MutableScatterMap<>(0, 1, null);
    }

    @NotNull
    public static final <K, V> MutableScatterMap<K, V> w(@NotNull Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.G.p(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.k0(pairs);
        return mutableScatterMap;
    }

    public static final long x(long j10) {
        return j10 & (j10 - 1);
    }

    public static final int y(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int z(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }
}
