package androidx.navigation;

import androidx.navigation.NavOptions;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavOptionsBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavOptionsBuilder.kt\nandroidx/navigation/NavOptionsBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
@K
public final class NavOptionsBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f115147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f115148c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f115150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f115151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f115152g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NavOptions.Builder f115146a = new NavOptions.Builder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.C
    public int f115149d = -1;

    @InterfaceC4982o(message = "Use the popUpToId property.")
    public static /* synthetic */ void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(NavOptionsBuilder navOptionsBuilder, int i10, ed.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new ed.l<U, L0>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$1
                public final void e(@NotNull U u10) {
                    kotlin.jvm.internal.G.p(u10, "$this$null");
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(U u10) {
                    e(u10);
                    return L0.f217464a;
                }
            };
        }
        navOptionsBuilder.i(i10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(NavOptionsBuilder navOptionsBuilder, String str, ed.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = new ed.l<U, L0>() { // from class: androidx.navigation.NavOptionsBuilder$popUpTo$2
                public final void e(@NotNull U u10) {
                    kotlin.jvm.internal.G.p(u10, "$this$null");
                }

                @Override // ed.l
                public /* bridge */ /* synthetic */ L0 invoke(U u10) {
                    e(u10);
                    return L0.f217464a;
                }
            };
        }
        navOptionsBuilder.j(str, lVar);
    }

    public final void a(@NotNull ed.l<? super C2618f, L0> animBuilder) {
        kotlin.jvm.internal.G.p(animBuilder, "animBuilder");
        C2618f c2618f = new C2618f();
        animBuilder.invoke(c2618f);
        this.f115146a.setEnterAnim(c2618f.f115202a).setExitAnim(c2618f.f115203b).setPopEnterAnim(c2618f.f115204c).setPopExitAnim(c2618f.f115205d);
    }

    @NotNull
    public final NavOptions b() {
        NavOptions.Builder builder = this.f115146a;
        builder.setLaunchSingleTop(this.f115147b);
        builder.setRestoreState(this.f115148c);
        String str = this.f115150e;
        if (str != null) {
            builder.setPopUpTo(str, this.f115151f, this.f115152g);
        } else {
            builder.setPopUpTo(this.f115149d, this.f115151f, this.f115152g);
        }
        return builder.build();
    }

    public final boolean c() {
        return this.f115147b;
    }

    public final int d() {
        return this.f115149d;
    }

    public final int f() {
        return this.f115149d;
    }

    @Nullable
    public final String g() {
        return this.f115150e;
    }

    public final boolean h() {
        return this.f115148c;
    }

    public final void i(@e.C int i10, @NotNull ed.l<? super U, L0> popUpToBuilder) {
        kotlin.jvm.internal.G.p(popUpToBuilder, "popUpToBuilder");
        o(i10);
        U u10 = new U();
        popUpToBuilder.invoke(u10);
        this.f115151f = u10.f115175a;
        this.f115152g = u10.f115176b;
    }

    public final void j(@NotNull String route, @NotNull ed.l<? super U, L0> popUpToBuilder) {
        kotlin.jvm.internal.G.p(route, "route");
        kotlin.jvm.internal.G.p(popUpToBuilder, "popUpToBuilder");
        p(route);
        o(-1);
        U u10 = new U();
        popUpToBuilder.invoke(u10);
        this.f115151f = u10.f115175a;
        this.f115152g = u10.f115176b;
    }

    public final void m(boolean z10) {
        this.f115147b = z10;
    }

    @InterfaceC4982o(message = "Use the popUpTo function and passing in the id.")
    public final void n(int i10) {
        k(this, i10, null, 2, null);
    }

    public final void o(int i10) {
        this.f115149d = i10;
        this.f115151f = false;
    }

    public final void p(String str) {
        if (str != null) {
            if (kotlin.text.M.Q3(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.f115150e = str;
            this.f115151f = false;
        }
    }

    public final void q(boolean z10) {
        this.f115148c = z10;
    }
}
