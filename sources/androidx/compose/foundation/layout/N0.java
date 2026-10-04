package androidx.compose.foundation.layout;

import androidx.activity.C1477d;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.T1;
import androidx.compose.ui.unit.LayoutDirection;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
@kotlin.jvm.internal.V({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,748:1\n81#2:749\n107#2,2:750\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n367#1:749\n367#1:750,2\n*E\n"})
public final class N0 implements P0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f90562d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f90563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f90564c;

    public N0(@NotNull C1676e0 c1676e0, @NotNull String str) {
        this.f90563b = str;
        this.f90564c = M1.g(c1676e0, null, 2, null);
    }

    @Override // androidx.compose.foundation.layout.P0
    public int a(@NotNull InterfaceC4814e interfaceC4814e) {
        return f().f90907b;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int b(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return f().f90908c;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int c(@NotNull InterfaceC4814e interfaceC4814e, @NotNull LayoutDirection layoutDirection) {
        return f().f90906a;
    }

    @Override // androidx.compose.foundation.layout.P0
    public int d(@NotNull InterfaceC4814e interfaceC4814e) {
        return f().f90909d;
    }

    @NotNull
    public final String e() {
        return this.f90563b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N0) {
            return kotlin.jvm.internal.G.g(f(), ((N0) obj).f());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final C1676e0 f() {
        return (C1676e0) this.f90564c.getValue();
    }

    public final void g(@NotNull C1676e0 c1676e0) {
        this.f90564c.setValue(c1676e0);
    }

    public int hashCode() {
        return this.f90563b.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f90563b);
        sb2.append("(left=");
        sb2.append(f().f90906a);
        sb2.append(", top=");
        sb2.append(f().f90907b);
        sb2.append(", right=");
        sb2.append(f().f90908c);
        sb2.append(", bottom=");
        return C1477d.a(sb2, f().f90909d, ')');
    }
}
