package androidx.compose.ui.platform;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class Q1 implements P1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f103627c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0<Boolean> f103629a = androidx.compose.runtime.M1.g(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f103626b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final androidx.compose.runtime.L0<androidx.compose.ui.input.pointer.N> f103628d = androidx.compose.runtime.M1.g(new androidx.compose.ui.input.pointer.N(0), null, 2, null);

    public static final class a {
        public a() {
        }

        @NotNull
        public final androidx.compose.runtime.L0<androidx.compose.ui.input.pointer.N> a() {
            return Q1.f103628d;
        }

        public a(C4969v c4969v) {
        }
    }

    public static /* synthetic */ void d() {
    }

    @Override // androidx.compose.ui.platform.P1
    @androidx.compose.ui.i
    public int a() {
        return f103628d.getValue().f102191a;
    }

    @Override // androidx.compose.ui.platform.P1
    public boolean b() {
        return this.f103629a.getValue().booleanValue();
    }

    public void e(int i10) {
        f103628d.setValue(new androidx.compose.ui.input.pointer.N(i10));
    }

    public void f(boolean z10) {
        this.f103629a.setValue(Boolean.valueOf(z10));
    }
}
