package androidx.compose.material;

import androidx.compose.runtime.AbstractC1885a1;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.Y1;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.R0;
import ed.InterfaceC4376a;
import k0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/RippleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,465:1\n77#2:466\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/RippleKt\n*L\n266#1:466\n*E\n"})
public final class RippleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AbstractC1885a1<Boolean> f97019a = new Y1(new InterfaceC4376a<Boolean>() { // from class: androidx.compose.material.RippleKt$LocalUseFallbackRippleImplementation$1
        @NotNull
        public final Boolean g() {
            return Boolean.FALSE;
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AbstractC1885a1<p0> f97020b = CompositionLocalKt.e(null, new InterfaceC4376a<p0>() { // from class: androidx.compose.material.RippleKt$LocalRippleConfiguration$1
        @Override // ed.InterfaceC4376a
        @Nullable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final p0 invoke() {
            return new p0(0L, null, 3, null);
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final r0 f97021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final r0 f97022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.material.ripple.e f97023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.material.ripple.e f97024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.material.ripple.e f97025g;

    static {
        i.a aVar = k0.i.f214308b;
        aVar.getClass();
        float f10 = k0.i.f214311e;
        K0.a aVar2 = androidx.compose.ui.graphics.K0.f100733b;
        aVar2.getClass();
        f97021c = new r0(true, f10, (R0) null, androidx.compose.ui.graphics.K0.f100746o);
        aVar.getClass();
        aVar2.getClass();
        f97022d = new r0(false, f10, (R0) null, androidx.compose.ui.graphics.K0.f100746o);
        f97023e = new androidx.compose.material.ripple.e(0.16f, 0.24f, 0.08f, 0.24f);
        f97024f = new androidx.compose.material.ripple.e(0.08f, 0.12f, 0.04f, 0.12f);
        f97025g = new androidx.compose.material.ripple.e(0.08f, 0.12f, 0.04f, 0.1f);
    }

    @P
    @NotNull
    public static final AbstractC1885a1<p0> d() {
        return f97020b;
    }

    @P
    public static /* synthetic */ void e() {
    }

    @P
    @NotNull
    public static final AbstractC1885a1<Boolean> f() {
        return f97019a;
    }

    @P
    public static /* synthetic */ void g() {
    }

    @T1
    @NotNull
    public static final androidx.compose.foundation.a0 h(boolean z10, float f10, long j10) {
        k0.i.f214308b.getClass();
        if (k0.i.l(f10, k0.i.f214311e)) {
            androidx.compose.ui.graphics.K0.f100733b.getClass();
            if (kotlin.B0.p(j10, androidx.compose.ui.graphics.K0.f100746o)) {
                return z10 ? f97021c : f97022d;
            }
        }
        return new r0(z10, f10, (R0) null, j10);
    }

    public static androidx.compose.foundation.a0 i(boolean z10, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            k0.i.f214308b.getClass();
            f10 = k0.i.f214311e;
        }
        if ((i10 & 4) != 0) {
            androidx.compose.ui.graphics.K0.f100733b.getClass();
            j10 = androidx.compose.ui.graphics.K0.f100746o;
        }
        return h(z10, f10, j10);
    }

    @T1
    @NotNull
    public static final androidx.compose.foundation.a0 j(@NotNull R0 r02, boolean z10, float f10) {
        return new r0(z10, f10, r02);
    }

    public static androidx.compose.foundation.a0 k(R0 r02, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            k0.i.f214308b.getClass();
            f10 = k0.i.f214311e;
        }
        return new r0(z10, f10, r02);
    }

    @InterfaceC1917i
    @NotNull
    public static final androidx.compose.foundation.W l(boolean z10, float f10, long j10, @Nullable InterfaceC1946s interfaceC1946s, int i10, int i11) {
        androidx.compose.foundation.W wH;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            k0.i.f214308b.getClass();
            f10 = k0.i.f214311e;
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            androidx.compose.ui.graphics.K0.f100733b.getClass();
            j10 = androidx.compose.ui.graphics.K0.f100746o;
        }
        long j11 = j10;
        if (C1968u.c0()) {
            C1968u.p0(-58830494, i10, -1, "androidx.compose.material.rippleOrFallbackImplementation (Ripple.kt:264)");
        }
        if (((Boolean) interfaceC1946s.Q(f97019a)).booleanValue()) {
            interfaceC1946s.y(96412190);
            wH = androidx.compose.material.ripple.l.f(z11, f11, j11, interfaceC1946s, i10 & 1022, 0);
            interfaceC1946s.u();
        } else {
            interfaceC1946s.y(96503175);
            interfaceC1946s.u();
            wH = h(z11, f11, j11);
        }
        if (C1968u.c0()) {
            C1968u.o0();
        }
        return wH;
    }
}
