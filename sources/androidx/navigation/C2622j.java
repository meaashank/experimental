package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.navigation.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2622j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e.C
    public final int f115278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public NavOptions f115279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Bundle f115280c;

    @dd.k
    public C2622j(@e.C int i10) {
        this(i10, null, null, 6, null);
    }

    @Nullable
    public final Bundle a() {
        return this.f115280c;
    }

    public final int b() {
        return this.f115278a;
    }

    @Nullable
    public final NavOptions c() {
        return this.f115279b;
    }

    public final void d(@Nullable Bundle bundle) {
        this.f115280c = bundle;
    }

    public final void e(@Nullable NavOptions navOptions) {
        this.f115279b = navOptions;
    }

    @dd.k
    public C2622j(@e.C int i10, @Nullable NavOptions navOptions) {
        this(i10, navOptions, null, 4, null);
    }

    @dd.k
    public C2622j(@e.C int i10, @Nullable NavOptions navOptions, @Nullable Bundle bundle) {
        this.f115278a = i10;
        this.f115279b = navOptions;
        this.f115280c = bundle;
    }

    public /* synthetic */ C2622j(int i10, NavOptions navOptions, Bundle bundle, int i11, C4969v c4969v) {
        this(i10, (i11 & 2) != 0 ? null : navOptions, (i11 & 4) != 0 ? null : bundle);
    }
}
