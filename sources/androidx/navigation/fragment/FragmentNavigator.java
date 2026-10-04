package androidx.navigation.fragment;

import R1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.os.C2406e;
import androidx.fragment.app.C2563a;
import androidx.fragment.app.C2575m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.M;
import androidx.lifecycle.InterfaceC2611y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Q;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.P;
import androidx.navigation.S;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.o;
import e.InterfaceC4335i;
import ed.InterfaceC4376a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.A;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.Pair;
import kotlin.collections.J;
import kotlin.collections.N;
import kotlin.collections.U;
import kotlin.collections.n0;
import kotlin.collections.z0;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.flow.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,588:1\n1549#2:589\n1620#2,3:590\n518#2,7:596\n533#2,6:603\n31#3:593\n63#3,2:594\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n72#1:589\n72#1:590,3\n83#1:596,7\n115#1:603,6\n188#1:593\n188#1:594,2\n*E\n"})
@Navigator.b("fragment")
public class FragmentNavigator extends Navigator<c> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b f115207i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f115208j = "FragmentNavigator";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f115209k = "androidx-nav-fragment:navigator:savedIds";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f115210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FragmentManager f115211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f115212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Set<String> f115213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final InterfaceC2611y f115214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ed.l<NavBackStackEntry, InterfaceC2611y> f115215h;

    public static final class Extras implements Navigator.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap<View, String> f115216a;

        public static final class Builder {

            @NotNull
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            @NotNull
            public final Builder addSharedElement(@NotNull View sharedElement, @NotNull String name) {
                G.p(sharedElement, "sharedElement");
                G.p(name, "name");
                this._sharedElements.put(sharedElement, name);
                return this;
            }

            @NotNull
            public final Builder addSharedElements(@NotNull Map<View, String> sharedElements) {
                G.p(sharedElements, "sharedElements");
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    addSharedElement(entry.getKey(), entry.getValue());
                }
                return this;
            }

            @NotNull
            public final Extras build() {
                return new Extras(this._sharedElements);
            }
        }

        public Extras(@NotNull Map<View, String> sharedElements) {
            G.p(sharedElements, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.f115216a = linkedHashMap;
            linkedHashMap.putAll(sharedElements);
        }

        @NotNull
        public final Map<View, String> a() {
            return n0.D0(this.f115216a);
        }
    }

    public static final class a extends k0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<InterfaceC4376a<L0>> f115217b;

        @Override // androidx.lifecycle.k0
        public void g() {
            InterfaceC4376a<L0> interfaceC4376a = h().get();
            if (interfaceC4376a != null) {
                interfaceC4376a.invoke();
            }
        }

        @NotNull
        public final WeakReference<InterfaceC4376a<L0>> h() {
            WeakReference<InterfaceC4376a<L0>> weakReference = this.f115217b;
            if (weakReference != null) {
                return weakReference;
            }
            G.S("completeTransition");
            throw null;
        }

        public final void i(@NotNull WeakReference<InterfaceC4376a<L0>> weakReference) {
            G.p(weakReference, "<set-?>");
            this.f115217b = weakReference;
        }
    }

    public static final class b {
        public b() {
        }

        public b(C4969v c4969v) {
        }
    }

    @V({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,588:1\n232#2,3:589\n1#3:592\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n*L\n456#1:589,3\n*E\n"})
    @NavDestination.a(Fragment.class)
    public static class c extends NavDestination {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public String f115224l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Navigator<? extends c> fragmentNavigator) {
            super(fragmentNavigator);
            G.p(fragmentNavigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        @InterfaceC4335i
        public void N(@NotNull Context context, @NotNull AttributeSet attrs) {
            G.p(context, "context");
            G.p(attrs, "attrs");
            super.N(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, o.d.f115272c);
            G.o(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(o.d.f115273d);
            if (string != null) {
                this.f115224l = string;
            }
            typedArrayObtainAttributes.recycle();
        }

        @NotNull
        public final String Z() {
            String str = this.f115224l;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            G.n(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @NotNull
        public final c a0(@NotNull String className) {
            G.p(className, "className");
            this.f115224l = className;
            return this;
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@Nullable Object obj) {
            return obj != null && (obj instanceof c) && super.equals(obj) && G.g(this.f115224l, ((c) obj).f115224l);
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f115224l;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f115224l;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String string = sb2.toString();
            G.o(string, "sb.toString()");
            return string;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull P navigatorProvider) {
            super((Navigator<? extends NavDestination>) navigatorProvider.e(FragmentNavigator.class));
            G.p(navigatorProvider, "navigatorProvider");
        }
    }

    @V({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$onAttach$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,588:1\n533#2,6:589\n533#2,6:596\n1#3:595\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$onAttach$2\n*L\n133#1:589,6\n139#1:596,6\n*E\n"})
    public static final class d implements FragmentManager.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ S f115225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FragmentNavigator f115226b;

        public d(S s10, FragmentNavigator fragmentNavigator) {
            this.f115225a = s10;
            this.f115226b = fragmentNavigator;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void a(@NotNull Fragment fragment, boolean z10) {
            NavBackStackEntry navBackStackEntryPrevious;
            G.p(fragment, "fragment");
            if (z10) {
                List<NavBackStackEntry> value = this.f115225a.f115173e.getValue();
                ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        navBackStackEntryPrevious = null;
                        break;
                    } else {
                        navBackStackEntryPrevious = listIterator.previous();
                        if (G.g(navBackStackEntryPrevious.f114953f, fragment.getTag())) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
                if (navBackStackEntry != null) {
                    this.f115225a.j(navBackStackEntry);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void b(@NotNull Fragment fragment, boolean z10) {
            Object objPrevious;
            G.p(fragment, "fragment");
            ArrayList arrayList = (ArrayList) U.I4(this.f115225a.f115173e.getValue(), this.f115225a.f115174f.getValue());
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (G.g(((NavBackStackEntry) objPrevious).f114953f, fragment.getTag())) {
                        break;
                    }
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            if (!z10 && navBackStackEntry == null) {
                throw new IllegalArgumentException(C2575m.a("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (navBackStackEntry != null) {
                this.f115226b.p(fragment, navBackStackEntry, this.f115225a);
                if (z10 && this.f115226b.v().isEmpty() && fragment.isRemoving()) {
                    this.f115225a.i(navBackStackEntry, false);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public void onBackStackChanged() {
        }
    }

    public static final class e implements Q, B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l f115227a;

        public e(ed.l function) {
            G.p(function, "function");
            this.f115227a = function;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void a(Object obj) {
            this.f115227a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.B
        @NotNull
        public final A<?> b() {
            return this.f115227a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Q) && (obj instanceof B)) {
                return G.g(this.f115227a, ((B) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return this.f115227a.hashCode();
        }
    }

    public FragmentNavigator(@NotNull Context context, @NotNull FragmentManager fragmentManager, int i10) {
        G.p(context, "context");
        G.p(fragmentManager, "fragmentManager");
        this.f115210c = context;
        this.f115211d = fragmentManager;
        this.f115212e = i10;
        this.f115213f = new LinkedHashSet();
        this.f115214g = new InterfaceC2611y() { // from class: androidx.navigation.fragment.g
            @Override // androidx.lifecycle.InterfaceC2611y
            public final void onStateChanged(androidx.lifecycle.B b10, Lifecycle.Event event) {
                FragmentNavigator.t(this.f115257a, b10, event);
            }
        };
        this.f115215h = new FragmentNavigator$fragmentViewObserver$1(this);
    }

    public static final void t(FragmentNavigator this$0, androidx.lifecycle.B source, Lifecycle.Event event) {
        G.p(this$0, "this$0");
        G.p(source, "source");
        G.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : this$0.b().f115174f.getValue()) {
                if (G.g(((NavBackStackEntry) obj2).f114953f, fragment.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry == null || this$0.b().f115173e.getValue().contains(navBackStackEntry)) {
                return;
            }
            this$0.b().e(navBackStackEntry);
        }
    }

    private final void x(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.a aVar) {
        boolean zIsEmpty = b().f115173e.getValue().isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.f115137b && this.f115213f.remove(navBackStackEntry.f114953f)) {
            this.f115211d.F1(navBackStackEntry.f114953f);
            b().l(navBackStackEntry);
            return;
        }
        androidx.fragment.app.U uS = s(navBackStackEntry, navOptions);
        if (!zIsEmpty) {
            uS.k(navBackStackEntry.f114953f);
        }
        if (aVar instanceof Extras) {
            for (Map.Entry entry : n0.D0(((Extras) aVar).f115216a).entrySet()) {
                uS.j((View) entry.getKey(), (String) entry.getValue());
            }
        }
        ((C2563a) uS).S(false);
        b().l(navBackStackEntry);
    }

    public static final void y(S state, FragmentNavigator this$0, FragmentManager fragmentManager, Fragment fragment) {
        NavBackStackEntry navBackStackEntryPrevious;
        G.p(state, "$state");
        G.p(this$0, "this$0");
        G.p(fragmentManager, "<anonymous parameter 0>");
        G.p(fragment, "fragment");
        List<NavBackStackEntry> value = state.f115173e.getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            } else {
                navBackStackEntryPrevious = listIterator.previous();
                if (G.g(navBackStackEntryPrevious.f114953f, fragment.getTag())) {
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            this$0.q(navBackStackEntry, fragment);
            this$0.p(fragment, navBackStackEntry, state);
        }
    }

    @Override // androidx.navigation.Navigator
    public void e(@NotNull List<NavBackStackEntry> entries, @Nullable NavOptions navOptions, @Nullable Navigator.a aVar) {
        G.p(entries, "entries");
        if (this.f115211d.e1()) {
            Log.i(f115208j, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            x(it.next(), navOptions, aVar);
        }
    }

    @Override // androidx.navigation.Navigator
    public void f(@NotNull final S state) {
        G.p(state, "state");
        super.f(state);
        this.f115211d.o(new M() { // from class: androidx.navigation.fragment.h
            @Override // androidx.fragment.app.M
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                FragmentNavigator.y(state, this, fragmentManager, fragment);
            }
        });
        this.f115211d.p(new d(state, this));
    }

    @Override // androidx.navigation.Navigator
    public void g(@NotNull NavBackStackEntry backStackEntry) {
        G.p(backStackEntry, "backStackEntry");
        if (this.f115211d.e1()) {
            Log.i(f115208j, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        androidx.fragment.app.U uS = s(backStackEntry, null);
        if (b().f115173e.getValue().size() > 1) {
            this.f115211d.q1(backStackEntry.f114953f, 1);
            uS.k(backStackEntry.f114953f);
        }
        ((C2563a) uS).S(false);
        b().f(backStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void h(@NotNull Bundle savedState) {
        G.p(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList(f115209k);
        if (stringArrayList != null) {
            this.f115213f.clear();
            N.s0(this.f115213f, stringArrayList);
        }
    }

    @Override // androidx.navigation.Navigator
    @Nullable
    public Bundle i() {
        if (this.f115213f.isEmpty()) {
            return null;
        }
        return C2406e.b(new Pair(f115209k, new ArrayList(this.f115213f)));
    }

    @Override // androidx.navigation.Navigator
    public void j(@NotNull NavBackStackEntry popUpTo, boolean z10) {
        G.p(popUpTo, "popUpTo");
        if (this.f115211d.e1()) {
            Log.i(f115208j, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<NavBackStackEntry> value = b().f115173e.getValue();
        List<NavBackStackEntry> listSubList = value.subList(value.indexOf(popUpTo), value.size());
        if (z10) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) U.G2(value);
            for (NavBackStackEntry navBackStackEntry2 : U.c5(listSubList)) {
                if (G.g(navBackStackEntry2, navBackStackEntry)) {
                    Log.i(f115208j, "FragmentManager cannot save the state of the initial destination " + navBackStackEntry2);
                } else {
                    this.f115211d.N1(navBackStackEntry2.f114953f);
                    this.f115213f.add(navBackStackEntry2.f114953f);
                }
            }
        } else {
            this.f115211d.q1(popUpTo.f114953f, 1);
        }
        b().i(popUpTo, z10);
    }

    public final void p(@NotNull Fragment fragment, @NotNull final NavBackStackEntry entry, @NotNull final S state) {
        G.p(fragment, "fragment");
        G.p(entry, "entry");
        G.p(state, "state");
        p0 viewModelStore = fragment.getViewModelStore();
        G.o(viewModelStore, "fragment.viewModelStore");
        R1.c cVar = new R1.c();
        cVar.a(O.d(a.class), new ed.l<R1.a, a>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$viewModel$1$1
            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final FragmentNavigator.a invoke(@NotNull R1.a initializer) {
                G.p(initializer, "$this$initializer");
                return new FragmentNavigator.a();
            }
        });
        ((a) new m0(viewModelStore, cVar.b(), a.C0103a.f67688b).c(a.class)).f115217b = new WeakReference<>(new InterfaceC4376a<L0>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ L0 invoke() {
                invoke2();
                return L0.f217464a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                S s10 = state;
                Iterator<T> it = s10.f115174f.getValue().iterator();
                while (it.hasNext()) {
                    s10.e((NavBackStackEntry) it.next());
                }
            }
        });
    }

    public final void q(final NavBackStackEntry navBackStackEntry, final Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().k(fragment, new e(new ed.l<androidx.lifecycle.B, L0>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachObservers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(androidx.lifecycle.B b10) {
                if (b10 == null || U.a2(this.f115221d.v(), fragment.getTag())) {
                    return;
                }
                Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
                if (lifecycle.d().isAtLeast(Lifecycle.State.CREATED)) {
                    lifecycle.c(this.f115221d.f115215h.invoke(navBackStackEntry));
                }
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ L0 invoke(androidx.lifecycle.B b10) {
                e(b10);
                return L0.f217464a;
            }
        }));
        fragment.getLifecycle().c(this.f115214g);
    }

    @Override // androidx.navigation.Navigator
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this);
    }

    public final androidx.fragment.app.U s(NavBackStackEntry navBackStackEntry, NavOptions navOptions) {
        NavDestination navDestination = navBackStackEntry.f114949b;
        G.n(navDestination, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleC = navBackStackEntry.c();
        String strZ = ((c) navDestination).Z();
        if (strZ.charAt(0) == '.') {
            strZ = this.f115210c.getPackageName() + strZ;
        }
        Fragment fragmentA = this.f115211d.H0().a(this.f115210c.getClassLoader(), strZ);
        G.o(fragmentA, "fragmentManager.fragment…t.classLoader, className)");
        fragmentA.setArguments(bundleC);
        androidx.fragment.app.U u10 = this.f115211d.u();
        int i10 = navOptions != null ? navOptions.f115141f : -1;
        int i11 = navOptions != null ? navOptions.f115142g : -1;
        int i12 = navOptions != null ? navOptions.f115143h : -1;
        int i13 = navOptions != null ? navOptions.f115144i : -1;
        if (i10 != -1 || i11 != -1 || i12 != -1 || i13 != -1) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i11 == -1) {
                i11 = 0;
            }
            if (i12 == -1) {
                i12 = 0;
            }
            u10.J(i10, i11, i12, i13 != -1 ? i13 : 0);
        }
        u10.z(this.f115212e, fragmentA, navBackStackEntry.f114953f);
        u10.L(fragmentA);
        u10.f113769r = true;
        return u10;
    }

    @NotNull
    public final u<List<NavBackStackEntry>> u() {
        return b().f115173e;
    }

    @NotNull
    public final Set<String> v() {
        Set setX = z0.x(b().f115174f.getValue(), U.f6(b().f115173e.getValue()));
        ArrayList arrayList = new ArrayList(J.d0(setX, 10));
        Iterator it = setX.iterator();
        while (it.hasNext()) {
            arrayList.add(((NavBackStackEntry) it.next()).f114953f);
        }
        return U.f6(arrayList);
    }

    @InterfaceC4982o(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    @NotNull
    public Fragment w(@NotNull Context context, @NotNull FragmentManager fragmentManager, @NotNull String className, @Nullable Bundle bundle) {
        G.p(context, "context");
        G.p(fragmentManager, "fragmentManager");
        G.p(className, "className");
        Fragment fragmentA = fragmentManager.H0().a(context.getClassLoader(), className);
        G.o(fragmentA, "fragmentManager.fragment…t.classLoader, className)");
        return fragmentA;
    }
}
