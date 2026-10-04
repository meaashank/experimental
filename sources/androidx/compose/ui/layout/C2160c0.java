package androidx.compose.ui.layout;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.layout.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2160c0 implements Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102548b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC2158b0 f102549a;

    public C2160c0(@NotNull InterfaceC2158b0 interfaceC2158b0) {
        this.f102549a = interfaceC2158b0;
    }

    public static C2160c0 h(C2160c0 c2160c0, InterfaceC2158b0 interfaceC2158b0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2158b0 = c2160c0.f102549a;
        }
        c2160c0.getClass();
        return new C2160c0(interfaceC2158b0);
    }

    @Override // androidx.compose.ui.layout.Q
    @NotNull
    public T a(@NotNull V v10, @NotNull List<? extends O> list, long j10) {
        return this.f102549a.a(v10, androidx.compose.ui.node.U.a(v10), j10);
    }

    @Override // androidx.compose.ui.layout.Q
    public int b(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
        return this.f102549a.b(interfaceC2185u, androidx.compose.ui.node.U.a(interfaceC2185u), i10);
    }

    @Override // androidx.compose.ui.layout.Q
    public int c(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
        return this.f102549a.c(interfaceC2185u, androidx.compose.ui.node.U.a(interfaceC2185u), i10);
    }

    @Override // androidx.compose.ui.layout.Q
    public int d(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
        return this.f102549a.d(interfaceC2185u, androidx.compose.ui.node.U.a(interfaceC2185u), i10);
    }

    @Override // androidx.compose.ui.layout.Q
    public int e(@NotNull InterfaceC2185u interfaceC2185u, @NotNull List<? extends InterfaceC2183s> list, int i10) {
        return this.f102549a.e(interfaceC2185u, androidx.compose.ui.node.U.a(interfaceC2185u), i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2160c0) && kotlin.jvm.internal.G.g(this.f102549a, ((C2160c0) obj).f102549a);
    }

    @NotNull
    public final InterfaceC2158b0 f() {
        return this.f102549a;
    }

    @NotNull
    public final C2160c0 g(@NotNull InterfaceC2158b0 interfaceC2158b0) {
        return new C2160c0(interfaceC2158b0);
    }

    public int hashCode() {
        return this.f102549a.hashCode();
    }

    @NotNull
    public final InterfaceC2158b0 i() {
        return this.f102549a;
    }

    @NotNull
    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f102549a + ')';
    }
}
