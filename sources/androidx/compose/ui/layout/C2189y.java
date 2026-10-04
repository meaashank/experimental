package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.layout.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,293:1\n71#2,16:294\n71#2,16:310\n71#2,16:326\n71#2,16:342\n49#2:358\n60#2:359\n49#2:360\n60#2:361\n*S KotlinDebug\n*F\n+ 1 LayoutCoordinates.kt\nandroidx/compose/ui/layout/LayoutCoordinatesKt\n*L\n223#1:294,16\n224#1:310,16\n225#1:326,16\n226#1:342,16\n242#1:358\n243#1:359\n250#1:360\n251#1:361\n*E\n"})
public final class C2189y {
    @NotNull
    public static final P.j a(@NotNull InterfaceC2188x interfaceC2188x) {
        P.j jVarM;
        InterfaceC2188x interfaceC2188xC0 = interfaceC2188x.c0();
        return (interfaceC2188xC0 == null || (jVarM = C2187w.m(interfaceC2188xC0, interfaceC2188x, false, 2, null)) == null) ? new P.j(0.0f, 0.0f, (int) (interfaceC2188x.b() >> 32), (int) (interfaceC2188x.b() & ZipKt.f225990j)) : jVarM;
    }

    @NotNull
    public static final P.j b(@NotNull InterfaceC2188x interfaceC2188x) {
        return C2187w.m(d(interfaceC2188x), interfaceC2188x, false, 2, null);
    }

    @NotNull
    public static final P.j c(@NotNull InterfaceC2188x interfaceC2188x) {
        InterfaceC2188x interfaceC2188xD = d(interfaceC2188x);
        float fB = (int) (interfaceC2188xD.b() >> 32);
        float fB2 = (int) (interfaceC2188xD.b() & ZipKt.f225990j);
        P.j jVarM = C2187w.m(d(interfaceC2188x), interfaceC2188x, false, 2, null);
        float f10 = jVarM.f65511a;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > fB) {
            f10 = fB;
        }
        float f11 = jVarM.f65512b;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > fB2) {
            f11 = fB2;
        }
        float f12 = jVarM.f65513c;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 <= fB) {
            fB = f12;
        }
        float f13 = jVarM.f65514d;
        float f14 = f13 >= 0.0f ? f13 : 0.0f;
        if (f14 <= fB2) {
            fB2 = f14;
        }
        if (f10 == fB || f11 == fB2) {
            P.j.f65508e.getClass();
            return P.j.f65510g;
        }
        long jX = interfaceC2188xD.X(P.h.a(f10, f11));
        long jX2 = interfaceC2188xD.X(P.h.a(fB, f11));
        long jX3 = interfaceC2188xD.X(P.h.a(fB, fB2));
        long jX4 = interfaceC2188xD.X(P.h.a(f10, fB2));
        float fP = P.g.p(jX);
        float fP2 = P.g.p(jX2);
        float fP3 = P.g.p(jX4);
        float fP4 = P.g.p(jX3);
        float fMin = Math.min(fP, Math.min(fP2, Math.min(fP3, fP4)));
        float fMax = Math.max(fP, Math.max(fP2, Math.max(fP3, fP4)));
        float fR = P.g.r(jX);
        float fR2 = P.g.r(jX2);
        float fR3 = P.g.r(jX4);
        float fR4 = P.g.r(jX3);
        return new P.j(fMin, Math.min(fR, Math.min(fR2, Math.min(fR3, fR4))), fMax, Math.max(fR, Math.max(fR2, Math.max(fR3, fR4))));
    }

    @NotNull
    public static final InterfaceC2188x d(@NotNull InterfaceC2188x interfaceC2188x) {
        InterfaceC2188x interfaceC2188x2;
        InterfaceC2188x interfaceC2188xC0 = interfaceC2188x.c0();
        while (true) {
            InterfaceC2188x interfaceC2188x3 = interfaceC2188xC0;
            interfaceC2188x2 = interfaceC2188x;
            interfaceC2188x = interfaceC2188x3;
            if (interfaceC2188x == null) {
                break;
            }
            interfaceC2188xC0 = interfaceC2188x.c0();
        }
        NodeCoordinator nodeCoordinator = interfaceC2188x2 instanceof NodeCoordinator ? (NodeCoordinator) interfaceC2188x2 : null;
        if (nodeCoordinator == null) {
            return interfaceC2188x2;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f102928v;
        while (true) {
            NodeCoordinator nodeCoordinator3 = nodeCoordinator2;
            NodeCoordinator nodeCoordinator4 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                return nodeCoordinator4;
            }
            nodeCoordinator2 = nodeCoordinator.f102928v;
        }
    }

    public static final long e(@NotNull InterfaceC2188x interfaceC2188x) {
        InterfaceC2188x interfaceC2188xC0 = interfaceC2188x.c0();
        if (interfaceC2188xC0 != null) {
            P.g.f65503b.getClass();
            return interfaceC2188xC0.k0(interfaceC2188x, P.g.f65504c);
        }
        P.g.f65503b.getClass();
        return P.g.f65504c;
    }

    public static final long f(@NotNull InterfaceC2188x interfaceC2188x) {
        P.g.f65503b.getClass();
        return interfaceC2188x.d0(P.g.f65504c);
    }

    public static final long g(@NotNull InterfaceC2188x interfaceC2188x) {
        P.g.f65503b.getClass();
        return interfaceC2188x.X(P.g.f65504c);
    }

    public static final long h(@NotNull InterfaceC2188x interfaceC2188x) {
        P.g.f65503b.getClass();
        return interfaceC2188x.K(P.g.f65504c);
    }
}
