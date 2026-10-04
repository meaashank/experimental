package com.cookiegames.smartcookie.browser;

import androidx.compose.animation.C1635o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f141019f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f141020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f141021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f141023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f141024e;

    public h(@NotNull String id2, int i10, int i11, boolean z10, boolean z11) {
        G.p(id2, "id");
        this.f141020a = id2;
        this.f141021b = i10;
        this.f141022c = i11;
        this.f141023d = z10;
        this.f141024e = z11;
    }

    public static /* synthetic */ h g(h hVar, String str, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = hVar.f141020a;
        }
        if ((i12 & 2) != 0) {
            i10 = hVar.f141021b;
        }
        if ((i12 & 4) != 0) {
            i11 = hVar.f141022c;
        }
        if ((i12 & 8) != 0) {
            z10 = hVar.f141023d;
        }
        if ((i12 & 16) != 0) {
            z11 = hVar.f141024e;
        }
        boolean z12 = z11;
        int i13 = i11;
        return hVar.f(str, i10, i13, z10, z12);
    }

    @NotNull
    public final String a() {
        return this.f141020a;
    }

    public final int b() {
        return this.f141021b;
    }

    public final int c() {
        return this.f141022c;
    }

    public final boolean d() {
        return this.f141023d;
    }

    public final boolean e() {
        return this.f141024e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return G.g(this.f141020a, hVar.f141020a) && this.f141021b == hVar.f141021b && this.f141022c == hVar.f141022c && this.f141023d == hVar.f141023d && this.f141024e == hVar.f141024e;
    }

    @NotNull
    public final h f(@NotNull String id2, int i10, int i11, boolean z10, boolean z11) {
        G.p(id2, "id");
        return new h(id2, i10, i11, z10, z11);
    }

    public final boolean h() {
        return this.f141024e;
    }

    public int hashCode() {
        return C1635o.a(this.f141024e) + ((C1635o.a(this.f141023d) + (((((this.f141020a.hashCode() * 31) + this.f141021b) * 31) + this.f141022c) * 31)) * 31);
    }

    public final boolean i() {
        return this.f141023d;
    }

    public final int j() {
        return this.f141022c;
    }

    @NotNull
    public final String k() {
        return this.f141020a;
    }

    public final int l() {
        return this.f141021b;
    }

    public final void m(boolean z10) {
        this.f141024e = z10;
    }

    public final void n(boolean z10) {
        this.f141023d = z10;
    }

    public final void o(int i10) {
        this.f141022c = i10;
    }

    public final void p(@NotNull String str) {
        G.p(str, "<set-?>");
        this.f141020a = str;
    }

    public final void q(int i10) {
        this.f141021b = i10;
    }

    @NotNull
    public String toString() {
        String str = this.f141020a;
        int i10 = this.f141021b;
        int i11 = this.f141022c;
        boolean z10 = this.f141023d;
        boolean z11 = this.f141024e;
        StringBuilder sbA = androidx.constraintlayout.widget.e.a("MenuItemClass(id=", str, ", name=", i10, ", icon=");
        sbA.append(i11);
        sbA.append(", enabled=");
        sbA.append(z10);
        sbA.append(", divider=");
        sbA.append(z11);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ h(String str, int i10, int i11, boolean z10, boolean z11, int i12, C4969v c4969v) {
        this(str, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }
}
