package com.cookiegames.smartcookie.browser;

import androidx.collection.N0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f141017b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141018a;

    public g() {
        this(0, 1, null);
    }

    public static g c(g gVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = gVar.f141018a;
        }
        gVar.getClass();
        return new g(i10);
    }

    public final int a() {
        return this.f141018a;
    }

    @NotNull
    public final g b(int i10) {
        return new g(i10);
    }

    public final int d() {
        return this.f141018a;
    }

    public final void e(int i10) {
        this.f141018a = i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f141018a == ((g) obj).f141018a;
    }

    public int hashCode() {
        return this.f141018a;
    }

    @NotNull
    public String toString() {
        return N0.a("MenuDividerClass(color=", this.f141018a, ")");
    }

    public g(int i10) {
        this.f141018a = i10;
    }

    public /* synthetic */ g(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? -3355444 : i10);
    }
}
