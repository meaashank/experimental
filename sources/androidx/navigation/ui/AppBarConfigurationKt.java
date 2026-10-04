package androidx.navigation.ui;

import android.view.Menu;
import androidx.navigation.NavGraph;
import androidx.navigation.ui.AppBarConfiguration;
import ed.InterfaceC4376a;
import java.util.Set;
import kotlin.A;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AppBarConfigurationKt {

    public static final class a implements AppBarConfiguration.a, B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a f115311a;

        public a(InterfaceC4376a function) {
            G.p(function, "function");
            this.f115311a = function;
        }

        @Override // androidx.navigation.ui.AppBarConfiguration.a
        public final /* synthetic */ boolean a() {
            return ((Boolean) this.f115311a.invoke()).booleanValue();
        }

        @Override // kotlin.jvm.internal.B
        @NotNull
        public final A<?> b() {
            return this.f115311a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof AppBarConfiguration.a) && (obj instanceof B)) {
                return G.g(this.f115311a, ((B) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return this.f115311a.hashCode();
        }
    }

    @NotNull
    public static final AppBarConfiguration a(@NotNull Menu topLevelMenu, @Nullable androidx.customview.widget.c cVar, @NotNull InterfaceC4376a<Boolean> fallbackOnNavigateUpListener) {
        G.p(topLevelMenu, "topLevelMenu");
        G.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(cVar).setFallbackOnNavigateUpListener(new a(fallbackOnNavigateUpListener)).build();
    }

    @NotNull
    public static final AppBarConfiguration b(@NotNull NavGraph navGraph, @Nullable androidx.customview.widget.c cVar, @NotNull InterfaceC4376a<Boolean> fallbackOnNavigateUpListener) {
        G.p(navGraph, "navGraph");
        G.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(cVar).setFallbackOnNavigateUpListener(new a(fallbackOnNavigateUpListener)).build();
    }

    @NotNull
    public static final AppBarConfiguration c(@NotNull Set<Integer> topLevelDestinationIds, @Nullable androidx.customview.widget.c cVar, @NotNull InterfaceC4376a<Boolean> fallbackOnNavigateUpListener) {
        G.p(topLevelDestinationIds, "topLevelDestinationIds");
        G.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelDestinationIds).setOpenableLayout(cVar).setFallbackOnNavigateUpListener(new a(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration d(Menu topLevelMenu, androidx.customview.widget.c cVar, InterfaceC4376a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = new InterfaceC4376a<Boolean>() { // from class: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$2
                @NotNull
                public final Boolean g() {
                    return Boolean.FALSE;
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        G.p(topLevelMenu, "topLevelMenu");
        G.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(topLevelMenu).setOpenableLayout(cVar).setFallbackOnNavigateUpListener(new a(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration e(NavGraph navGraph, androidx.customview.widget.c cVar, InterfaceC4376a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = AppBarConfigurationKt$AppBarConfiguration$1.f115308d;
        }
        G.p(navGraph, "navGraph");
        G.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder(navGraph).setOpenableLayout(cVar).setFallbackOnNavigateUpListener(new a(fallbackOnNavigateUpListener)).build();
    }

    public static /* synthetic */ AppBarConfiguration f(Set topLevelDestinationIds, androidx.customview.widget.c cVar, InterfaceC4376a fallbackOnNavigateUpListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cVar = null;
        }
        if ((i10 & 4) != 0) {
            fallbackOnNavigateUpListener = new InterfaceC4376a<Boolean>() { // from class: androidx.navigation.ui.AppBarConfigurationKt$AppBarConfiguration$3
                @NotNull
                public final Boolean g() {
                    return Boolean.FALSE;
                }

                @Override // ed.InterfaceC4376a
                public /* bridge */ /* synthetic */ Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        G.p(topLevelDestinationIds, "topLevelDestinationIds");
        G.p(fallbackOnNavigateUpListener, "fallbackOnNavigateUpListener");
        return new AppBarConfiguration.Builder((Set<Integer>) topLevelDestinationIds).setOpenableLayout(cVar).setFallbackOnNavigateUpListener(new a(fallbackOnNavigateUpListener)).build();
    }
}
