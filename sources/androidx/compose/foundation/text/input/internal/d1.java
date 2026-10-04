package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.layout.InterfaceC2188x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
public final class d1 {
    public static final long a(long j10, @NotNull P.j jVar) {
        float fP = P.g.p(j10);
        float fP2 = jVar.f65511a;
        if (fP >= fP2) {
            float fP3 = P.g.p(j10);
            fP2 = jVar.f65513c;
            if (fP3 <= fP2) {
                fP2 = P.g.p(j10);
            }
        }
        float fR = P.g.r(j10);
        float fR2 = jVar.f65512b;
        if (fR >= fR2) {
            float fR3 = P.g.r(j10);
            fR2 = jVar.f65514d;
            if (fR3 <= fR2) {
                fR2 = P.g.r(j10);
            }
        }
        return P.h.a(fP2, fR2);
    }

    public static final long b(@NotNull TextLayoutState textLayoutState, long j10) {
        P.g gVar;
        InterfaceC2188x interfaceC2188xK = textLayoutState.k();
        if (interfaceC2188xK != null) {
            InterfaceC2188x interfaceC2188xE = textLayoutState.e();
            if (interfaceC2188xE != null) {
                gVar = new P.g((interfaceC2188xK.H() && interfaceC2188xE.H()) ? interfaceC2188xK.k0(interfaceC2188xE, j10) : j10);
            } else {
                gVar = null;
            }
            if (gVar != null) {
                return gVar.f65507a;
            }
        }
        return j10;
    }

    public static final long c(@NotNull TextLayoutState textLayoutState, long j10) {
        InterfaceC2188x interfaceC2188xK = textLayoutState.k();
        if (interfaceC2188xK != null) {
            P.g gVar = null;
            if (!interfaceC2188xK.H()) {
                interfaceC2188xK = null;
            }
            if (interfaceC2188xK != null) {
                InterfaceC2188x interfaceC2188xD = textLayoutState.d();
                if (interfaceC2188xD != null) {
                    if (!interfaceC2188xD.H()) {
                        interfaceC2188xD = null;
                    }
                    if (interfaceC2188xD != null) {
                        gVar = new P.g(interfaceC2188xD.k0(interfaceC2188xK, j10));
                    }
                }
                if (gVar != null) {
                    return gVar.f65507a;
                }
            }
        }
        return j10;
    }

    public static final long d(@NotNull TextLayoutState textLayoutState, long j10) {
        InterfaceC2188x interfaceC2188xE = textLayoutState.e();
        return (interfaceC2188xE == null || !interfaceC2188xE.H()) ? j10 : interfaceC2188xE.o0(j10);
    }
}
