package kotlin.sequences;

import java.util.Iterator;
import kotlin.B0;
import kotlin.H0;
import kotlin.InterfaceC4887e0;
import kotlin.t0;
import kotlin.x0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class U {
    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUByte")
    public static final int a(@NotNull InterfaceC5000m<t0> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        Iterator<t0> it = interfaceC5000m.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f218221a & 255;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUInt")
    public static final int b(@NotNull InterfaceC5000m<x0> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        Iterator<x0> it = interfaceC5000m.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f218498a;
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfULong")
    public static final long c(@NotNull InterfaceC5000m<B0> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        Iterator<B0> it = interfaceC5000m.iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += it.next().f217440a;
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.5")
    @dd.j(name = "sumOfUShort")
    public static final int d(@NotNull InterfaceC5000m<H0> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        Iterator<H0> it = interfaceC5000m.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f217458a & H0.f217455d;
        }
        return i10;
    }
}
