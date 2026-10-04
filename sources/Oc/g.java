package Oc;

import ed.p;
import java.util.Comparator;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, Comparable<?>> f65463a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ed.l<? super T, ? extends Comparable<?>> lVar) {
            this.f65463a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            ed.l<T, Comparable<?>> lVar = this.f65463a;
            return g.l(lVar.invoke(t10), lVar.invoke(t11));
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f65464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, K> f65465b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, ed.l<? super T, ? extends K> lVar) {
            this.f65464a = comparator;
            this.f65465b = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.f65464a;
            ed.l<T, K> lVar = this.f65465b;
            return comparator.compare((Object) lVar.invoke(t10), (Object) lVar.invoke(t11));
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, Comparable<?>> f65466a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(ed.l<? super T, ? extends Comparable<?>> lVar) {
            this.f65466a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            ed.l<T, Comparable<?>> lVar = this.f65466a;
            return g.l(lVar.invoke(t11), lVar.invoke(t10));
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f65467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, K> f65468b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, ed.l<? super T, ? extends K> lVar) {
            this.f65467a = comparator;
            this.f65468b = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.f65467a;
            ed.l<T, K> lVar = this.f65468b;
            return comparator.compare((Object) lVar.invoke(t11), (Object) lVar.invoke(t10));
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f65469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, Comparable<?>> f65470b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, ed.l<? super T, ? extends Comparable<?>> lVar) {
            this.f65469a = comparator;
            this.f65470b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f65469a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            ed.l<T, Comparable<?>> lVar = this.f65470b;
            return g.l(lVar.invoke(t10), lVar.invoke(t11));
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f65471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f65472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, K> f65473c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, ed.l<? super T, ? extends K> lVar) {
            this.f65471a = comparator;
            this.f65472b = comparator2;
            this.f65473c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f65471a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f65472b;
            ed.l<T, K> lVar = this.f65473c;
            return comparator.compare((Object) lVar.invoke(t10), (Object) lVar.invoke(t11));
        }
    }

    /* JADX INFO: renamed from: Oc.g$g, reason: collision with other inner class name */
    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C0091g<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f65474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, Comparable<?>> f65475b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0091g(Comparator<T> comparator, ed.l<? super T, ? extends Comparable<?>> lVar) {
            this.f65474a = comparator;
            this.f65475b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f65474a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            ed.l<T, Comparable<?>> lVar = this.f65475b;
            return g.l(lVar.invoke(t11), lVar.invoke(t10));
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class h<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f65476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f65477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ed.l<T, K> f65478c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, ed.l<? super T, ? extends K> lVar) {
            this.f65476a = comparator;
            this.f65477b = comparator2;
            this.f65478c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f65476a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f65477b;
            ed.l<T, K> lVar = this.f65478c;
            return comparator.compare((Object) lVar.invoke(t11), (Object) lVar.invoke(t10));
        }
    }

    @V({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    public static final class i<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f65479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<T, T, Integer> f65480b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f65479a = comparator;
            this.f65480b = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f65479a.compare(t10, t11);
            return iCompare != 0 ? iCompare : this.f65480b.invoke(t10, t11).intValue();
        }
    }

    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }

    @Xc.f
    public static final <T> Comparator<T> B(Comparator<T> comparator, ed.l<? super T, ? extends Comparable<?>> selector) {
        G.p(comparator, "<this>");
        G.p(selector, "selector");
        return new e(comparator, selector);
    }

    @Xc.f
    public static final <T, K> Comparator<T> C(Comparator<T> comparator, Comparator<? super K> comparator2, ed.l<? super T, ? extends K> selector) {
        G.p(comparator, "<this>");
        G.p(comparator2, "comparator");
        G.p(selector, "selector");
        return new f(comparator, comparator2, selector);
    }

    @Xc.f
    public static final <T> Comparator<T> D(Comparator<T> comparator, ed.l<? super T, ? extends Comparable<?>> selector) {
        G.p(comparator, "<this>");
        G.p(selector, "selector");
        return new C0091g(comparator, selector);
    }

    @Xc.f
    public static final <T, K> Comparator<T> E(Comparator<T> comparator, Comparator<? super K> comparator2, ed.l<? super T, ? extends K> selector) {
        G.p(comparator, "<this>");
        G.p(comparator2, "comparator");
        G.p(selector, "selector");
        return new h(comparator, comparator2, selector);
    }

    @Xc.f
    public static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> comparison) {
        G.p(comparator, "<this>");
        G.p(comparison, "comparison");
        return new i(comparator, comparison);
    }

    @NotNull
    public static final <T> Comparator<T> G(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        G.p(comparator, "<this>");
        G.p(comparator2, "comparator");
        return new Comparator() { // from class: Oc.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.H(comparator, comparator2, obj, obj2);
            }
        };
    }

    public static final int H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj2, obj);
    }

    public static int d(ed.l[] lVarArr, Object obj, Object obj2) {
        return p(obj, obj2, lVarArr);
    }

    @Xc.f
    public static final <T> Comparator<T> f(ed.l<? super T, ? extends Comparable<?>> selector) {
        G.p(selector, "selector");
        return new a(selector);
    }

    @Xc.f
    public static final <T, K> Comparator<T> g(Comparator<? super K> comparator, ed.l<? super T, ? extends K> selector) {
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        return new b(comparator, selector);
    }

    @NotNull
    public static <T> Comparator<T> h(@NotNull final ed.l<? super T, ? extends Comparable<?>>... selectors) {
        G.p(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: Oc.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.p(obj, obj2, selectors);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int i(ed.l[] lVarArr, Object obj, Object obj2) {
        return p(obj, obj2, lVarArr);
    }

    @Xc.f
    public static final <T> Comparator<T> j(ed.l<? super T, ? extends Comparable<?>> selector) {
        G.p(selector, "selector");
        return new c(selector);
    }

    @Xc.f
    public static final <T, K> Comparator<T> k(Comparator<? super K> comparator, ed.l<? super T, ? extends K> selector) {
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        return new d(comparator, selector);
    }

    public static <T extends Comparable<?>> int l(@Nullable T t10, @Nullable T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    @Xc.f
    public static final <T> int m(T t10, T t11, ed.l<? super T, ? extends Comparable<?>> selector) {
        G.p(selector, "selector");
        return l(selector.invoke(t10), selector.invoke(t11));
    }

    @Xc.f
    public static final <T, K> int n(T t10, T t11, Comparator<? super K> comparator, ed.l<? super T, ? extends K> selector) {
        G.p(comparator, "comparator");
        G.p(selector, "selector");
        return comparator.compare(selector.invoke(t10), selector.invoke(t11));
    }

    public static <T> int o(T t10, T t11, @NotNull ed.l<? super T, ? extends Comparable<?>>... selectors) {
        G.p(selectors, "selectors");
        if (selectors.length > 0) {
            return p(t10, t11, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final <T> int p(T t10, T t11, ed.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (ed.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int iL = l(lVar.invoke(t10), lVar.invoke(t11));
            if (iL != 0) {
                return iL;
            }
        }
        return 0;
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f65481a;
        G.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return jVar;
    }

    @Xc.f
    public static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @NotNull
    public static final <T> Comparator<T> s(@NotNull final Comparator<? super T> comparator) {
        G.p(comparator, "comparator");
        return new Comparator() { // from class: Oc.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.t(comparator, obj, obj2);
            }
        };
    }

    public static final int t(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @Xc.f
    public static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @NotNull
    public static final <T> Comparator<T> v(@NotNull final Comparator<? super T> comparator) {
        G.p(comparator, "comparator");
        return new Comparator() { // from class: Oc.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.w(comparator, obj, obj2);
            }
        };
    }

    public static final int w(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f65482a;
        G.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return kVar;
    }

    @NotNull
    public static final <T> Comparator<T> y(@NotNull Comparator<T> comparator) {
        G.p(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).f65483a;
        }
        j jVar = j.f65481a;
        if (comparator.equals(jVar)) {
            k kVar = k.f65482a;
            G.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return kVar;
        }
        if (!comparator.equals(k.f65482a)) {
            return new l(comparator);
        }
        G.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
        return jVar;
    }

    @NotNull
    public static final <T> Comparator<T> z(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        G.p(comparator, "<this>");
        G.p(comparator2, "comparator");
        return new Comparator() { // from class: Oc.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.A(comparator, comparator2, obj, obj2);
            }
        };
    }
}
