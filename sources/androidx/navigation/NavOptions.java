package androidx.navigation;

import e.InterfaceC4327a;
import e.InterfaceC4328b;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class NavOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f115136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e.C
    public final int f115138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f115139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f115140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f115141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f115142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f115143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f115144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f115145j;

    public static final class Builder {
        private boolean popUpToInclusive;

        @Nullable
        private String popUpToRoute;
        private boolean popUpToSaveState;
        private boolean restoreState;
        private boolean singleTop;

        @e.C
        private int popUpToId = -1;

        @InterfaceC4327a
        @InterfaceC4328b
        private int enterAnim = -1;

        @InterfaceC4327a
        @InterfaceC4328b
        private int exitAnim = -1;

        @InterfaceC4327a
        @InterfaceC4328b
        private int popEnterAnim = -1;

        @InterfaceC4327a
        @InterfaceC4328b
        private int popExitAnim = -1;

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return builder.setPopUpTo(i10, z10, z11);
        }

        @NotNull
        public final NavOptions build() {
            String str = this.popUpToRoute;
            return str != null ? new NavOptions(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim) : new NavOptions(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        @NotNull
        public final Builder setEnterAnim(@InterfaceC4327a @InterfaceC4328b int i10) {
            this.enterAnim = i10;
            return this;
        }

        @NotNull
        public final Builder setExitAnim(@InterfaceC4327a @InterfaceC4328b int i10) {
            this.exitAnim = i10;
            return this;
        }

        @NotNull
        public final Builder setLaunchSingleTop(boolean z10) {
            this.singleTop = z10;
            return this;
        }

        @NotNull
        public final Builder setPopEnterAnim(@InterfaceC4327a @InterfaceC4328b int i10) {
            this.popEnterAnim = i10;
            return this;
        }

        @NotNull
        public final Builder setPopExitAnim(@InterfaceC4327a @InterfaceC4328b int i10) {
            this.popExitAnim = i10;
            return this;
        }

        @dd.k
        @NotNull
        public final Builder setPopUpTo(@e.C int i10, boolean z10) {
            return setPopUpTo$default(this, i10, z10, false, 4, (Object) null);
        }

        @NotNull
        public final Builder setRestoreState(boolean z10) {
            this.restoreState = z10;
            return this;
        }

        public static /* synthetic */ Builder setPopUpTo$default(Builder builder, String str, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return builder.setPopUpTo(str, z10, z11);
        }

        @dd.k
        @NotNull
        public final Builder setPopUpTo(@Nullable String str, boolean z10) {
            return setPopUpTo$default(this, str, z10, false, 4, (Object) null);
        }

        @dd.k
        @NotNull
        public final Builder setPopUpTo(@e.C int i10, boolean z10, boolean z11) {
            this.popUpToId = i10;
            this.popUpToRoute = null;
            this.popUpToInclusive = z10;
            this.popUpToSaveState = z11;
            return this;
        }

        @dd.k
        @NotNull
        public final Builder setPopUpTo(@Nullable String str, boolean z10, boolean z11) {
            this.popUpToRoute = str;
            this.popUpToId = -1;
            this.popUpToInclusive = z10;
            this.popUpToSaveState = z11;
            return this;
        }
    }

    public NavOptions(boolean z10, boolean z11, @e.C int i10, boolean z12, boolean z13, @InterfaceC4327a @InterfaceC4328b int i11, @InterfaceC4327a @InterfaceC4328b int i12, @InterfaceC4327a @InterfaceC4328b int i13, @InterfaceC4327a @InterfaceC4328b int i14) {
        this.f115136a = z10;
        this.f115137b = z11;
        this.f115138c = i10;
        this.f115139d = z12;
        this.f115140e = z13;
        this.f115141f = i11;
        this.f115142g = i12;
        this.f115143h = i13;
        this.f115144i = i14;
    }

    @InterfaceC4327a
    @InterfaceC4328b
    public final int a() {
        return this.f115141f;
    }

    @InterfaceC4327a
    @InterfaceC4328b
    public final int b() {
        return this.f115142g;
    }

    @InterfaceC4327a
    @InterfaceC4328b
    public final int c() {
        return this.f115143h;
    }

    @InterfaceC4327a
    @InterfaceC4328b
    public final int d() {
        return this.f115144i;
    }

    @InterfaceC4982o(message = "Use popUpToId instead.", replaceWith = @InterfaceC4852c0(expression = "popUpToId", imports = {}))
    @e.C
    public final int e() {
        return this.f115138c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NavOptions.class.equals(obj.getClass())) {
            NavOptions navOptions = (NavOptions) obj;
            if (this.f115136a == navOptions.f115136a && this.f115137b == navOptions.f115137b && this.f115138c == navOptions.f115138c && kotlin.jvm.internal.G.g(this.f115145j, navOptions.f115145j) && this.f115139d == navOptions.f115139d && this.f115140e == navOptions.f115140e && this.f115141f == navOptions.f115141f && this.f115142g == navOptions.f115142g && this.f115143h == navOptions.f115143h && this.f115144i == navOptions.f115144i) {
                return true;
            }
        }
        return false;
    }

    @e.C
    public final int f() {
        return this.f115138c;
    }

    @Nullable
    public final String g() {
        return this.f115145j;
    }

    public final boolean h() {
        return this.f115139d;
    }

    public int hashCode() {
        int i10 = (((((this.f115136a ? 1 : 0) * 31) + (this.f115137b ? 1 : 0)) * 31) + this.f115138c) * 31;
        String str = this.f115145j;
        return ((((((((((((i10 + (str != null ? str.hashCode() : 0)) * 31) + (this.f115139d ? 1 : 0)) * 31) + (this.f115140e ? 1 : 0)) * 31) + this.f115141f) * 31) + this.f115142g) * 31) + this.f115143h) * 31) + this.f115144i;
    }

    public final boolean i() {
        return this.f115136a;
    }

    public final boolean j() {
        return this.f115140e;
    }

    public final boolean k() {
        return this.f115137b;
    }

    public NavOptions(boolean z10, boolean z11, @Nullable String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, NavDestination.f115085j.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f115145j = str;
    }
}
