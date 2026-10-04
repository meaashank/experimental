package androidx.compose.foundation.layout;

import kotlin.jvm.internal.C4969v;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,562:1\n149#2:563\n149#2:564\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n*L\n542#1:563\n543#1:564\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90642e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f90645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f90646d;

    public Q(int i10, int i11, float f10, float f11, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? 0 : f10, (i12 & 8) != 0 ? 0 : f11);
    }

    public final int a() {
        return this.f90643a;
    }

    public final float b() {
        return this.f90646d;
    }

    public final float c() {
        return this.f90645c;
    }

    public final int d() {
        return this.f90644b;
    }

    public final void e(int i10) {
        this.f90643a = i10;
    }

    public final void f(float f10) {
        this.f90646d = f10;
    }

    public final void g(float f10) {
        this.f90645c = f10;
    }

    public final void h(int i10) {
        this.f90644b = i10;
    }

    public final void i(int i10, int i11, float f10, float f11) {
        this.f90643a = i10;
        this.f90644b = i11;
        this.f90645c = f10;
        this.f90646d = f11;
    }

    public /* synthetic */ Q(int i10, int i11, float f10, float f11, C4969v c4969v) {
        this(i10, i11, f10, f11);
    }

    public Q(int i10, int i11, float f10, float f11) {
        this.f90643a = i10;
        this.f90644b = i11;
        this.f90645c = f10;
        this.f90646d = f11;
    }
}
