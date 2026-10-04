package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.o0;
import jd.C4806d;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(29)
@kotlin.jvm.internal.V({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,202:1\n198#2:203\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n163#1:203\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class p0 implements n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final p0 f92218b = new p0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f92219c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f92220d = 0;

    @e.T(29)
    @androidx.compose.runtime.internal.r(parameters = 1)
    public static final class a extends o0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f92221c = 0;

        public a(@NotNull Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.o0.a, androidx.compose.foundation.m0
        public void c(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                this.f92217a.setZoom(f10);
            }
            if (P.h.d(j11)) {
                this.f92217a.show(P.g.p(j10), P.g.r(j10), P.g.p(j11), P.g.r(j11));
            } else {
                this.f92217a.show(P.g.p(j10), P.g.r(j10));
            }
        }
    }

    @Override // androidx.compose.foundation.n0
    public boolean b() {
        return f92219c;
    }

    @Override // androidx.compose.foundation.n0
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(@NotNull View view, boolean z10, long j10, float f10, float f11, boolean z11, @NotNull InterfaceC4814e interfaceC4814e, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long jZ = interfaceC4814e.Z(j10);
        float fL2 = interfaceC4814e.l2(f10);
        float fL22 = interfaceC4814e.l2(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jZ != P.d.f65493d) {
            builder.setSize(C4806d.L0(P.n.t(jZ)), C4806d.L0(P.n.m(jZ)));
        }
        if (!Float.isNaN(fL2)) {
            builder.setCornerRadius(fL2);
        }
        if (!Float.isNaN(fL22)) {
            builder.setElevation(fL22);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
