package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.W0;
import androidx.collection.Y0;
import androidx.navigation.NavDestination;
import b2.C2778a;
import fd.InterfaceC4418a;
import fd.InterfaceC4421d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 7 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,488:1\n232#2,3:489\n1603#3,9:492\n1855#3:501\n1856#3:503\n1612#3:504\n1#4:502\n1#4:505\n179#5,2:506\n32#6,2:508\n22#7:510\n56#7,4:511\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n59#1:489,3\n71#1:492,9\n71#1:501\n71#1:503\n71#1:504\n71#1:502\n202#1:506,2\n396#1:508,2\n398#1:510\n405#1:511,4\n*E\n"})
public class NavGraph extends NavDestination implements Iterable<NavDestination>, InterfaceC4418a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Companion f115105p = new Companion();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final W0<NavDestination> f115106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f115107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f115108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public String f115109o;

    public static final class Companion {
        public Companion() {
        }

        @dd.o
        @NotNull
        public final NavDestination a(@NotNull NavGraph navGraph) {
            kotlin.jvm.internal.G.p(navGraph, "<this>");
            return (NavDestination) SequencesKt___SequencesKt.I1(SequencesKt__SequencesKt.v(navGraph.e0(navGraph.f115107m, true), new ed.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavGraph$Companion$findStartDestination$1
                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final NavDestination invoke(@NotNull NavDestination it) {
                    kotlin.jvm.internal.G.p(it, "it");
                    if (!(it instanceof NavGraph)) {
                        return null;
                    }
                    NavGraph navGraph2 = (NavGraph) it;
                    return navGraph2.e0(navGraph2.f115107m, true);
                }
            }));
        }

        public Companion(C4969v c4969v) {
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n1#2:489\n*E\n"})
    public static final class a implements Iterator<NavDestination>, InterfaceC4421d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115111a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f115112b;

        public a() {
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f115112b = true;
            W0<NavDestination> w02 = NavGraph.this.f115106l;
            int i10 = this.f115111a + 1;
            this.f115111a = i10;
            NavDestination navDestinationZ = w02.z(i10);
            kotlin.jvm.internal.G.o(navDestinationZ, "nodes.valueAt(++index)");
            return navDestinationZ;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f115111a + 1 < NavGraph.this.f115106l.y();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f115112b) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            W0<NavDestination> w02 = NavGraph.this.f115106l;
            w02.z(this.f115111a).f115088b = null;
            w02.t(this.f115111a);
            this.f115111a--;
            this.f115112b = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(@NotNull Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        kotlin.jvm.internal.G.p(navGraphNavigator, "navGraphNavigator");
        this.f115106l = new W0<>();
    }

    @dd.o
    @NotNull
    public static final NavDestination h0(@NotNull NavGraph navGraph) {
        return f115105p.a(navGraph);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public NavDestination.b L(@NotNull NavDeepLinkRequest navDeepLinkRequest) {
        kotlin.jvm.internal.G.p(navDeepLinkRequest, "navDeepLinkRequest");
        NavDestination.b bVarL = super.L(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            NavDestination.b bVarL2 = it.next().L(navDeepLinkRequest);
            if (bVarL2 != null) {
                arrayList.add(bVarL2);
            }
        }
        return (NavDestination.b) kotlin.collections.U.U3(kotlin.collections.B.lb(new NavDestination.b[]{bVarL, (NavDestination.b) kotlin.collections.U.U3(arrayList)}));
    }

    @Override // androidx.navigation.NavDestination
    public void N(@NotNull Context context, @NotNull AttributeSet attrs) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(attrs, "attrs");
        super.N(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C2778a.b.f120786w);
        kotlin.jvm.internal.G.o(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        r0(typedArrayObtainAttributes.getResourceId(C2778a.b.f120787x, 0));
        this.f115108n = NavDestination.f115085j.b(context, this.f115107m);
        typedArrayObtainAttributes.recycle();
    }

    public final void Z(@NotNull NavGraph other) {
        kotlin.jvm.internal.G.p(other, "other");
        a aVar = other.new a();
        while (aVar.hasNext()) {
            NavDestination next = aVar.next();
            aVar.remove();
            a0(next);
        }
    }

    public final void a0(@NotNull NavDestination node) {
        kotlin.jvm.internal.G.p(node, "node");
        int i10 = node.f115094h;
        String str = node.f115095i;
        if (i10 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f115095i;
        if (str2 != null && kotlin.jvm.internal.G.g(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i10 == this.f115094h) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        NavDestination navDestinationG = this.f115106l.g(i10);
        if (navDestinationG == node) {
            return;
        }
        if (node.f115088b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestinationG != null) {
            navDestinationG.f115088b = null;
        }
        node.f115088b = this;
        this.f115106l.n(node.f115094h, node);
    }

    public final void b0(@NotNull Collection<? extends NavDestination> nodes) {
        kotlin.jvm.internal.G.p(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                a0(navDestination);
            }
        }
    }

    public final void c0(@NotNull NavDestination... nodes) {
        kotlin.jvm.internal.G.p(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            a0(navDestination);
        }
    }

    public final void clear() {
        a aVar = new a();
        while (aVar.hasNext()) {
            aVar.next();
            aVar.remove();
        }
    }

    @Nullable
    public final NavDestination d0(@e.C int i10) {
        return e0(i10, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination e0(@e.C int i10, boolean z10) {
        NavGraph navGraph;
        NavDestination navDestinationG = this.f115106l.g(i10);
        if (navDestinationG != null) {
            return navDestinationG;
        }
        if (!z10 || (navGraph = this.f115088b) == null) {
            return null;
        }
        kotlin.jvm.internal.G.m(navGraph);
        return navGraph.d0(i10);
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof NavGraph)) {
            List listJ3 = SequencesKt___SequencesKt.J3(SequencesKt__SequencesKt.j(Y0.k(this.f115106l)));
            NavGraph navGraph = (NavGraph) obj;
            Iterator itK = Y0.k(navGraph.f115106l);
            while (true) {
                Y0.b bVar = (Y0.b) itK;
                if (!bVar.hasNext()) {
                    break;
                }
                listJ3.remove((NavDestination) bVar.next());
            }
            if (super.equals(obj) && this.f115106l.y() == navGraph.f115106l.y() && this.f115107m == navGraph.f115107m && listJ3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final NavDestination f0(@Nullable String str) {
        if (str == null || kotlin.text.M.Q3(str)) {
            return null;
        }
        return g0(str, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination g0(@NotNull String route, boolean z10) {
        NavGraph navGraph;
        Object next;
        kotlin.jvm.internal.G.p(route, "route");
        NavDestination.f115085j.getClass();
        NavDestination navDestinationG = this.f115106l.g("android-app://androidx.navigation/".concat(route).hashCode());
        if (navDestinationG == null) {
            Iterator it = SequencesKt__SequencesKt.j(Y0.k(this.f115106l)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((NavDestination) next).M(route) != null) {
                    break;
                }
            }
            navDestinationG = (NavDestination) next;
        }
        if (navDestinationG != null) {
            return navDestinationG;
        }
        if (!z10 || (navGraph = this.f115088b) == null) {
            return null;
        }
        kotlin.jvm.internal.G.m(navGraph);
        return navGraph.f0(route);
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int iM = this.f115107m;
        W0<NavDestination> w02 = this.f115106l;
        int iY = w02.y();
        for (int i10 = 0; i10 < iY; i10++) {
            iM = (((iM * 31) + w02.m(i10)) * 31) + w02.z(i10).hashCode();
        }
        return iM;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final W0<NavDestination> i0() {
        return this.f115106l;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<NavDestination> iterator() {
        return new a();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final String j0() {
        if (this.f115108n == null) {
            String strValueOf = this.f115109o;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.f115107m);
            }
            this.f115108n = strValueOf;
        }
        String str = this.f115108n;
        kotlin.jvm.internal.G.m(str);
        return str;
    }

    @InterfaceC4982o(message = "Use getStartDestinationId instead.", replaceWith = @InterfaceC4852c0(expression = "startDestinationId", imports = {}))
    @e.C
    public final int k0() {
        return this.f115107m;
    }

    @e.C
    public final int l0() {
        return this.f115107m;
    }

    @Nullable
    public final String m0() {
        return this.f115109o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination.b n0(@NotNull NavDeepLinkRequest request) {
        kotlin.jvm.internal.G.p(request, "request");
        return super.L(request);
    }

    public final void o0(@NotNull NavDestination node) {
        kotlin.jvm.internal.G.p(node, "node");
        int iJ = this.f115106l.j(node.f115094h);
        if (iJ >= 0) {
            this.f115106l.z(iJ).f115088b = null;
            this.f115106l.t(iJ);
        }
    }

    public final void p0(int i10) {
        r0(i10);
    }

    public final void q0(@NotNull String startDestRoute) {
        kotlin.jvm.internal.G.p(startDestRoute, "startDestRoute");
        s0(startDestRoute);
    }

    public final void r0(int i10) {
        if (i10 != this.f115094h) {
            if (this.f115109o != null) {
                s0(null);
            }
            this.f115107m = i10;
            this.f115108n = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    public final void s0(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (str.equals(this.f115095i)) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (kotlin.text.M.Q3(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            NavDestination.f115085j.getClass();
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.f115107m = iHashCode;
        this.f115109o = str;
    }

    @Override // androidx.navigation.NavDestination
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        NavDestination navDestinationF0 = f0(this.f115109o);
        if (navDestinationF0 == null) {
            navDestinationF0 = e0(this.f115107m, true);
        }
        sb2.append(" startDestination=");
        if (navDestinationF0 == null) {
            String str = this.f115109o;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.f115108n;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f115107m));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(navDestinationF0.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "sb.toString()");
        return string;
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public String z() {
        return this.f115094h != 0 ? super.z() : "the root navigation";
    }
}
