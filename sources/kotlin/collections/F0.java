package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.H0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5045x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class F0 {
    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUByte")
    public static final int a(@NotNull Iterable<kotlin.t0> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<kotlin.t0> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f218221a & 255;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUInt")
    public static final int b(@NotNull Iterable<kotlin.x0> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<kotlin.x0> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfULong")
    public static final long c(@NotNull Iterable<kotlin.B0> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<kotlin.B0> it = iterable.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += it.next().f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUShort")
    public static final int d(@NotNull Iterable<H0> iterable) {
        kotlin.jvm.internal.G.p(iterable, "<this>");
        Iterator<H0> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f217458a & H0.f217455d;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final byte[] e(@NotNull Collection<kotlin.t0> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<kotlin.t0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().f218221a;
            i10++;
        }
        return bArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final int[] f(@NotNull Collection<kotlin.x0> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<kotlin.x0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().f218498a;
            i10++;
        }
        return iArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final long[] g(@NotNull Collection<kotlin.B0> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<kotlin.B0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().f217440a;
            i10++;
        }
        return jArr;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5045x
    @NotNull
    public static final short[] h(@NotNull Collection<H0> collection) {
        kotlin.jvm.internal.G.p(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<H0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sArr[i10] = it.next().f217458a;
            i10++;
        }
        return sArr;
    }
}
