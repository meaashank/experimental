package androidx.navigation.ui;

import android.annotation.SuppressLint;
import android.view.Menu;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import java.util.HashSet;
import java.util.Set;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nAppBarConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,307:1\n1229#2,2:308\n*S KotlinDebug\n*F\n+ 1 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfiguration\n*L\n100#1:308,2\n*E\n"})
public final class AppBarConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Set<Integer> f115305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final androidx.customview.widget.c f115306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final a f115307c;

    public interface a {
        boolean a();
    }

    public /* synthetic */ AppBarConfiguration(Set set, androidx.customview.widget.c cVar, a aVar, C4969v c4969v) {
        this(set, cVar, aVar);
    }

    @InterfaceC4982o(message = "Use {@link #getOpenableLayout()}.")
    @Nullable
    public final DrawerLayout a() {
        androidx.customview.widget.c cVar = this.f115306b;
        if (cVar instanceof DrawerLayout) {
            return (DrawerLayout) cVar;
        }
        return null;
    }

    @Nullable
    public final a b() {
        return this.f115307c;
    }

    @Nullable
    public final androidx.customview.widget.c c() {
        return this.f115306b;
    }

    @NotNull
    public final Set<Integer> d() {
        return this.f115305a;
    }

    public final boolean e(@NotNull NavDestination destination) {
        G.p(destination, "destination");
        for (NavDestination navDestination : NavDestination.f115085j.c(destination)) {
            if (this.f115305a.contains(Integer.valueOf(navDestination.f115094h)) && (!(navDestination instanceof NavGraph) || destination.f115094h == NavGraph.f115105p.a((NavGraph) navDestination).f115094h)) {
                return true;
            }
        }
        return false;
    }

    public AppBarConfiguration(Set<Integer> set, androidx.customview.widget.c cVar, a aVar) {
        this.f115305a = set;
        this.f115306b = cVar;
        this.f115307c = aVar;
    }

    public static final class Builder {

        @Nullable
        private a fallbackOnNavigateUpListener;

        @Nullable
        private androidx.customview.widget.c openableLayout;

        @NotNull
        private final Set<Integer> topLevelDestinations;

        public Builder(@NotNull NavGraph navGraph) {
            G.p(navGraph, "navGraph");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.add(Integer.valueOf(NavGraph.f115105p.a(navGraph).f115094h));
        }

        @SuppressLint({"SyntheticAccessor"})
        @NotNull
        public final AppBarConfiguration build() {
            return new AppBarConfiguration(this.topLevelDestinations, this.openableLayout, this.fallbackOnNavigateUpListener);
        }

        @InterfaceC4982o(message = "Use {@link #setOpenableLayout(Openable)}.")
        @NotNull
        public final Builder setDrawerLayout(@Nullable DrawerLayout drawerLayout) {
            this.openableLayout = drawerLayout;
            return this;
        }

        @NotNull
        public final Builder setFallbackOnNavigateUpListener(@Nullable a aVar) {
            this.fallbackOnNavigateUpListener = aVar;
            return this;
        }

        @NotNull
        public final Builder setOpenableLayout(@Nullable androidx.customview.widget.c cVar) {
            this.openableLayout = cVar;
            return this;
        }

        public Builder(@NotNull Menu topLevelMenu) {
            G.p(topLevelMenu, "topLevelMenu");
            this.topLevelDestinations = new HashSet();
            int size = topLevelMenu.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.topLevelDestinations.add(Integer.valueOf(topLevelMenu.getItem(i10).getItemId()));
            }
        }

        public Builder(@NotNull int... topLevelDestinationIds) {
            G.p(topLevelDestinationIds, "topLevelDestinationIds");
            this.topLevelDestinations = new HashSet();
            for (int i10 : topLevelDestinationIds) {
                this.topLevelDestinations.add(Integer.valueOf(i10));
            }
        }

        public Builder(@NotNull Set<Integer> topLevelDestinationIds) {
            G.p(topLevelDestinationIds, "topLevelDestinationIds");
            HashSet hashSet = new HashSet();
            this.topLevelDestinations = hashSet;
            hashSet.addAll(topLevelDestinationIds);
        }
    }
}
