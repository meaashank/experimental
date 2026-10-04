package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractC2588a;
import androidx.lifecycle.InterfaceC2605s;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.NavBackStackEntry;
import ed.InterfaceC4376a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavBackStackEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n1726#2,3:302\n1855#2,2:305\n*S KotlinDebug\n*F\n+ 1 NavBackStackEntry.kt\nandroidx/navigation/NavBackStackEntry\n*L\n258#1:302,3\n266#1:305,2\n*E\n"})
public final class NavBackStackEntry implements androidx.lifecycle.B, q0, InterfaceC2605s, androidx.savedstate.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f114947o = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Context f114948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public NavDestination f114949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Bundle f114950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Lifecycle.State f114951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final M f114952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f114953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Bundle f114954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public androidx.lifecycle.D f114955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final androidx.savedstate.e f114956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f114957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final kotlin.G f114958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final kotlin.G f114959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public Lifecycle.State f114960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final m0.c f114961n;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class a {
        public a() {
        }

        public static /* synthetic */ NavBackStackEntry b(a aVar, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, M m10, String str, Bundle bundle2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                bundle = null;
            }
            if ((i10 & 8) != 0) {
                state = Lifecycle.State.CREATED;
            }
            if ((i10 & 16) != 0) {
                m10 = null;
            }
            if ((i10 & 32) != 0) {
                str = UUID.randomUUID().toString();
                kotlin.jvm.internal.G.o(str, "randomUUID().toString()");
            }
            if ((i10 & 64) != 0) {
                bundle2 = null;
            }
            return aVar.a(context, navDestination, bundle, state, m10, str, bundle2);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final NavBackStackEntry a(@Nullable Context context, @NotNull NavDestination destination, @Nullable Bundle bundle, @NotNull Lifecycle.State hostLifecycleState, @Nullable M m10, @NotNull String id2, @Nullable Bundle bundle2) {
            kotlin.jvm.internal.G.p(destination, "destination");
            kotlin.jvm.internal.G.p(hostLifecycleState, "hostLifecycleState");
            kotlin.jvm.internal.G.p(id2, "id");
            return new NavBackStackEntry(context, destination, bundle, hostLifecycleState, m10, id2, bundle2);
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b extends AbstractC2588a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull androidx.savedstate.f owner) {
            super(owner, null);
            kotlin.jvm.internal.G.p(owner, "owner");
        }

        @Override // androidx.lifecycle.AbstractC2588a
        @NotNull
        public <T extends k0> T f(@NotNull String key, @NotNull Class<T> modelClass, @NotNull a0 handle) {
            kotlin.jvm.internal.G.p(key, "key");
            kotlin.jvm.internal.G.p(modelClass, "modelClass");
            kotlin.jvm.internal.G.p(handle, "handle");
            return new c(handle);
        }
    }

    public static final class c extends k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final a0 f114962b;

        public c(@NotNull a0 handle) {
            kotlin.jvm.internal.G.p(handle, "handle");
            this.f114962b = handle;
        }

        @NotNull
        public final a0 h() {
            return this.f114962b;
        }
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, M m10, String str, Bundle bundle2, C4969v c4969v) {
        this(context, navDestination, bundle, state, m10, str, bundle2);
    }

    @Nullable
    public final Bundle c() {
        if (this.f114950c == null) {
            return null;
        }
        return new Bundle(this.f114950c);
    }

    public final f0 d() {
        return (f0) this.f114958k.getValue();
    }

    @NotNull
    public final NavDestination e() {
        return this.f114949b;
    }

    public boolean equals(@Nullable Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (kotlin.jvm.internal.G.g(this.f114953f, navBackStackEntry.f114953f) && kotlin.jvm.internal.G.g(this.f114949b, navBackStackEntry.f114949b) && kotlin.jvm.internal.G.g(this.f114955h, navBackStackEntry.f114955h) && kotlin.jvm.internal.G.g(this.f114956i.f117365b, navBackStackEntry.f114956i.f117365b)) {
                if (kotlin.jvm.internal.G.g(this.f114950c, navBackStackEntry.f114950c)) {
                    return true;
                }
                Bundle bundle = this.f114950c;
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        Object obj2 = this.f114950c.get(str);
                        Bundle bundle2 = navBackStackEntry.f114950c;
                        if (!kotlin.jvm.internal.G.g(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.f114953f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Lifecycle.State g() {
        return this.f114960m;
    }

    @Override // androidx.lifecycle.InterfaceC2605s
    @NotNull
    public R1.a getDefaultViewModelCreationExtras() {
        R1.e eVar = new R1.e(null, 1, null);
        Context context = this.f114948a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            eVar.c(m0.a.f114364h, application);
        }
        eVar.c(d0.f114319c, this);
        eVar.c(d0.f114320d, this);
        Bundle bundleC = c();
        if (bundleC != null) {
            eVar.c(d0.f114321e, bundleC);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.InterfaceC2605s
    @NotNull
    public m0.c getDefaultViewModelProviderFactory() {
        return this.f114961n;
    }

    @Override // androidx.lifecycle.B
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f114955h;
    }

    @Override // androidx.savedstate.f
    @NotNull
    public androidx.savedstate.d getSavedStateRegistry() {
        return this.f114956i.f117365b;
    }

    @Override // androidx.lifecycle.q0
    @NotNull
    public p0 getViewModelStore() {
        if (!this.f114957j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f114955h.d() == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        M m10 = this.f114952e;
        if (m10 != null) {
            return m10.a(this.f114953f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    @NotNull
    public final a0 h() {
        return (a0) this.f114959l.getValue();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f114949b.hashCode() + (this.f114953f.hashCode() * 31);
        Bundle bundle = this.f114950c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = this.f114950c.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f114956i.f117365b.hashCode() + ((this.f114955h.hashCode() + (iHashCode * 31)) * 31);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void i(@NotNull Lifecycle.Event event) {
        kotlin.jvm.internal.G.p(event, "event");
        this.f114951d = event.getTargetState();
        m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void j(@NotNull Bundle outBundle) {
        kotlin.jvm.internal.G.p(outBundle, "outBundle");
        this.f114956i.e(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void k(@NotNull NavDestination navDestination) {
        kotlin.jvm.internal.G.p(navDestination, "<set-?>");
        this.f114949b = navDestination;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void l(@NotNull Lifecycle.State maxState) {
        kotlin.jvm.internal.G.p(maxState, "maxState");
        this.f114960m = maxState;
        m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void m() {
        if (!this.f114957j) {
            this.f114956i.c();
            this.f114957j = true;
            if (this.f114952e != null) {
                d0.c(this);
            }
            this.f114956i.d(this.f114954g);
        }
        if (this.f114951d.ordinal() < this.f114960m.ordinal()) {
            this.f114955h.v(this.f114951d);
        } else {
            this.f114955h.v(this.f114960m);
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(NavBackStackEntry.class.getSimpleName());
        sb2.append("(" + this.f114953f + ')');
        sb2.append(" destination=");
        sb2.append(this.f114949b);
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "sb.toString()");
        return string;
    }

    public NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, M m10, String str, Bundle bundle2) {
        this.f114948a = context;
        this.f114949b = navDestination;
        this.f114950c = bundle;
        this.f114951d = state;
        this.f114952e = m10;
        this.f114953f = str;
        this.f114954g = bundle2;
        this.f114955h = new androidx.lifecycle.D(this);
        this.f114956i = androidx.savedstate.e.f117363d.a(this);
        this.f114958k = kotlin.I.a(new InterfaceC4376a<f0>() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final f0 invoke() {
                Context context2 = this.f114963d.f114948a;
                Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                NavBackStackEntry navBackStackEntry = this.f114963d;
                return new f0(application, navBackStackEntry, navBackStackEntry.c());
            }
        });
        this.f114959l = kotlin.I.a(new InterfaceC4376a<a0>() { // from class: androidx.navigation.NavBackStackEntry$savedStateHandle$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final a0 invoke() {
                NavBackStackEntry navBackStackEntry = this.f114964d;
                if (!navBackStackEntry.f114957j) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (navBackStackEntry.f114955h.d() == Lifecycle.State.DESTROYED) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                NavBackStackEntry navBackStackEntry2 = this.f114964d;
                return ((NavBackStackEntry.c) new m0(navBackStackEntry2, new NavBackStackEntry.b(navBackStackEntry2)).c(NavBackStackEntry.c.class)).f114962b;
            }
        });
        this.f114960m = Lifecycle.State.INITIALIZED;
        this.f114961n = d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, M m10, String str, Bundle bundle2, int i10, C4969v c4969v) {
        bundle = (i10 & 4) != 0 ? null : bundle;
        state = (i10 & 8) != 0 ? Lifecycle.State.CREATED : state;
        m10 = (i10 & 16) != 0 ? null : m10;
        if ((i10 & 32) != 0) {
            str = UUID.randomUUID().toString();
            kotlin.jvm.internal.G.o(str, "randomUUID().toString()");
        }
        this(context, navDestination, bundle, state, m10, str, (i10 & 64) != 0 ? null : bundle2);
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i10, C4969v c4969v) {
        this(navBackStackEntry, (i10 & 2) != 0 ? navBackStackEntry.c() : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(@NotNull NavBackStackEntry entry, @Nullable Bundle bundle) {
        this(entry.f114948a, entry.f114949b, bundle, entry.f114951d, entry.f114952e, entry.f114953f, entry.f114954g);
        kotlin.jvm.internal.G.p(entry, "entry");
        this.f114951d = entry.f114951d;
        l(entry.f114960m);
    }
}
