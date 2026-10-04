package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1595l;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.b;
import androidx.compose.foundation.interaction.c;
import androidx.compose.foundation.interaction.i;
import androidx.compose.runtime.X1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f96282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f96283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f96284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f96285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Animatable<k0.i, C1595l> f96286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public androidx.compose.foundation.interaction.d f96287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public androidx.compose.foundation.interaction.d f96288g;

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f10, float f11, float f12, float f13, C4969v c4969v) {
        this(f10, f11, f12, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.d r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1) r0
            int r1 = r0.f96293e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96293e = r1
            goto L18
        L13:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f96291c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f96293e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f96290b
            androidx.compose.foundation.interaction.d r6 = (androidx.compose.foundation.interaction.d) r6
            java.lang.Object r0 = r0.f96289a
            androidx.compose.material.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r0
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L2f
            goto L69
        L2f:
            r7 = move-exception
            goto L6e
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.C4885d0.n(r7)
            float r7 = r5.d(r6)
            r5.f96288g = r6
            androidx.compose.animation.core.Animatable<k0.i, androidx.compose.animation.core.l> r2 = r5.f96286e     // Catch: java.lang.Throwable -> L65
            androidx.compose.runtime.L0 r2 = r2.f87578f     // Catch: java.lang.Throwable -> L65
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L65
            k0.i r2 = (k0.i) r2     // Catch: java.lang.Throwable -> L65
            float r2 = r2.f214312a     // Catch: java.lang.Throwable -> L65
            boolean r2 = k0.i.l(r2, r7)     // Catch: java.lang.Throwable -> L65
            if (r2 != 0) goto L68
            androidx.compose.animation.core.Animatable<k0.i, androidx.compose.animation.core.l> r2 = r5.f96286e     // Catch: java.lang.Throwable -> L65
            androidx.compose.foundation.interaction.d r4 = r5.f96287f     // Catch: java.lang.Throwable -> L65
            r0.f96289a = r5     // Catch: java.lang.Throwable -> L65
            r0.f96290b = r6     // Catch: java.lang.Throwable -> L65
            r0.f96293e = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r7 = androidx.compose.material.N.d(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L65
            if (r7 != r1) goto L68
            return r1
        L65:
            r7 = move-exception
            r0 = r5
            goto L6e
        L68:
            r0 = r5
        L69:
            r0.f96287f = r6
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        L6e:
            r0.f96287f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.b(androidx.compose.foundation.interaction.d, kotlin.coroutines.e):java.lang.Object");
    }

    @NotNull
    public final X1<k0.i> c() {
        return this.f96286e.f87576d;
    }

    public final float d(androidx.compose.foundation.interaction.d dVar) {
        return dVar instanceof i.b ? this.f96283b : dVar instanceof c.a ? this.f96284c : dVar instanceof b.a ? this.f96285d : this.f96282a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.e<? super kotlin.L0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.f96297d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96297d = r1
            goto L18
        L13:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f96295b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f96297d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f96294a
            androidx.compose.material.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r0
            kotlin.C4885d0.n(r6)     // Catch: java.lang.Throwable -> L2b
            goto L63
        L2b:
            r6 = move-exception
            goto L6a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.C4885d0.n(r6)
            androidx.compose.foundation.interaction.d r6 = r5.f96288g
            float r6 = r5.d(r6)
            androidx.compose.animation.core.Animatable<k0.i, androidx.compose.animation.core.l> r2 = r5.f96286e
            androidx.compose.runtime.L0 r2 = r2.f87578f
            java.lang.Object r2 = r2.getValue()
            k0.i r2 = (k0.i) r2
            float r2 = r2.f214312a
            boolean r2 = k0.i.l(r2, r6)
            if (r2 != 0) goto L6f
            androidx.compose.animation.core.Animatable<k0.i, androidx.compose.animation.core.l> r2 = r5.f96286e     // Catch: java.lang.Throwable -> L68
            k0.i r4 = new k0.i     // Catch: java.lang.Throwable -> L68
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L68
            r0.f96294a = r5     // Catch: java.lang.Throwable -> L68
            r0.f96297d = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r6 = r2.C(r4, r0)     // Catch: java.lang.Throwable -> L68
            if (r6 != r1) goto L62
            return r1
        L62:
            r0 = r5
        L63:
            androidx.compose.foundation.interaction.d r6 = r0.f96288g
            r0.f96287f = r6
            goto L6f
        L68:
            r6 = move-exception
            r0 = r5
        L6a:
            androidx.compose.foundation.interaction.d r1 = r0.f96288g
            r0.f96287f = r1
            throw r6
        L6f:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.e(kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public final Object f(float f10, float f11, float f12, float f13, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) throws Throwable {
        this.f96282a = f10;
        this.f96283b = f11;
        this.f96284c = f12;
        this.f96285d = f13;
        Object objE = e(eVar);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : kotlin.L0.f217464a;
    }

    public FloatingActionButtonElevationAnimatable(float f10, float f11, float f12, float f13) {
        this.f96282a = f10;
        this.f96283b = f11;
        this.f96284c = f12;
        this.f96285d = f13;
        this.f96286e = new Animatable<>(new k0.i(f10), VectorConvertersKt.e(k0.i.f214308b), null, null, 12, null);
    }
}
