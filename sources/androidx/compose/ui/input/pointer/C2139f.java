package androidx.compose.ui.input.pointer;

import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2139f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102282c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f102283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f102284b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2139f() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    @InterfaceC4982o(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void b() {
    }

    @InterfaceC4982o(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void d() {
    }

    public final boolean a() {
        return this.f102284b;
    }

    public final boolean c() {
        return this.f102283a;
    }

    public final void e(boolean z10) {
        this.f102284b = z10;
    }

    public final void f(boolean z10) {
        this.f102283a = z10;
    }

    public C2139f(boolean z10, boolean z11) {
        this.f102283a = z10;
        this.f102284b = z11;
    }

    public /* synthetic */ C2139f(boolean z10, boolean z11, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
