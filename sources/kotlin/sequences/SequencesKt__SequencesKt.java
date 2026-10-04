package kotlin.sequences;

import ed.InterfaceC4376a;
import fd.InterfaceC4418a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.InterfaceC4887e0;
import kotlin.Pair;
import kotlin.jvm.internal.V;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class SequencesKt__SequencesKt extends r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,730:1\n*E\n"})
    public static final class a<T> implements InterfaceC5000m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a<Iterator<T>> f218070a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4376a<? extends Iterator<? extends T>> interfaceC4376a) {
            this.f218070a = interfaceC4376a;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<T> iterator() {
            return this.f218070a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,730:1\n31#2:731\n*E\n"})
    public static final class b<T> implements InterfaceC5000m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f218071a;

        public b(Iterator it) {
            this.f218071a = it;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<T> iterator() {
            return this.f218071a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,730:1\n49#2,11:731\n*E\n"})
    public static final class c<T> implements InterfaceC5000m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f218072a;

        public c(Object obj) {
            this.f218072a = obj;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<T> iterator() {
            return new d(this.f218072a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> implements Iterator<T>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f218073a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f218074b;

        public d(T t10) {
            this.f218074b = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f218073a;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f218073a) {
                throw new NoSuchElementException();
            }
            this.f218073a = false;
            return this.f218074b;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @InterfaceC4887e0(version = "2.2")
    @Xc.f
    public static final <T> InterfaceC5000m<T> A() {
        return C4994g.f218169a;
    }

    @InterfaceC4887e0(version = "2.2")
    @NotNull
    public static <T> InterfaceC5000m<T> B(T t10) {
        return new c(t10);
    }

    @NotNull
    public static <T> InterfaceC5000m<T> C(@NotNull T... elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return kotlin.collections.B.T5(elements);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T> InterfaceC5000m<T> D(@NotNull InterfaceC5000m<? extends T> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        return E(interfaceC5000m, Random.f218007a);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final <T> InterfaceC5000m<T> E(@NotNull InterfaceC5000m<? extends T> interfaceC5000m, @NotNull Random random) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        kotlin.jvm.internal.G.p(random, "random");
        return C5004q.b(new SequencesKt__SequencesKt$shuffled$1(interfaceC5000m, random, null));
    }

    @NotNull
    public static final <T, R> Pair<List<T>, List<R>> F(@NotNull InterfaceC5000m<? extends Pair<? extends T, ? extends R>> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair<? extends T, ? extends R> pair : interfaceC5000m) {
            arrayList.add(pair.f217467a);
            arrayList2.add(pair.f217468b);
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static Object e(Object obj) {
        return obj;
    }

    public static Object f(Object obj) {
        return obj;
    }

    @Xc.f
    public static final <T> InterfaceC5000m<T> i(InterfaceC4376a<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.G.p(iterator, "iterator");
        return new a(iterator);
    }

    @NotNull
    public static <T> InterfaceC5000m<T> j(@NotNull Iterator<? extends T> it) {
        kotlin.jvm.internal.G.p(it, "<this>");
        return k(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> InterfaceC5000m<T> k(@NotNull InterfaceC5000m<? extends T> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        return interfaceC5000m instanceof C4988a ? interfaceC5000m : new C4988a(interfaceC5000m);
    }

    @NotNull
    public static <T> InterfaceC5000m<T> l() {
        return C4994g.f218169a;
    }

    @NotNull
    public static final <T, C, R> InterfaceC5000m<R> m(@NotNull InterfaceC5000m<? extends T> source, @NotNull ed.p<? super Integer, ? super T, ? extends C> transform, @NotNull ed.l<? super C, ? extends Iterator<? extends R>> iterator) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(transform, "transform");
        kotlin.jvm.internal.G.p(iterator, "iterator");
        return C5004q.b(new SequencesKt__SequencesKt$flatMapIndexed$1(source, transform, iterator, null));
    }

    @NotNull
    public static final <T> InterfaceC5000m<T> n(@NotNull InterfaceC5000m<? extends InterfaceC5000m<? extends T>> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        return o(interfaceC5000m, new C5007u());
    }

    public static final <T, R> InterfaceC5000m<R> o(InterfaceC5000m<? extends T> interfaceC5000m, ed.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return interfaceC5000m instanceof S ? ((S) interfaceC5000m).e(lVar) : new C4996i(interfaceC5000m, new w(), lVar);
    }

    public static final Iterator p(InterfaceC5000m it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it.iterator();
    }

    public static final Iterator q(Iterable it) {
        kotlin.jvm.internal.G.p(it, "it");
        return it.iterator();
    }

    public static final Object r(Object obj) {
        return obj;
    }

    @dd.j(name = "flattenSequenceOfIterable")
    @NotNull
    public static final <T> InterfaceC5000m<T> s(@NotNull InterfaceC5000m<? extends Iterable<? extends T>> interfaceC5000m) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        return o(interfaceC5000m, new v());
    }

    @NotNull
    public static <T> InterfaceC5000m<T> t(@NotNull final InterfaceC4376a<? extends T> nextFunction) {
        kotlin.jvm.internal.G.p(nextFunction, "nextFunction");
        return k(new C4997j(nextFunction, new ed.l() { // from class: kotlin.sequences.t
            @Override // ed.l
            public final Object invoke(Object obj) {
                return SequencesKt__SequencesKt.w(nextFunction, obj);
            }
        }));
    }

    @NotNull
    public static <T> InterfaceC5000m<T> u(@NotNull InterfaceC4376a<? extends T> seedFunction, @NotNull ed.l<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.G.p(seedFunction, "seedFunction");
        kotlin.jvm.internal.G.p(nextFunction, "nextFunction");
        return new C4997j(seedFunction, nextFunction);
    }

    @Xc.i
    @NotNull
    public static <T> InterfaceC5000m<T> v(@Nullable final T t10, @NotNull ed.l<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.G.p(nextFunction, "nextFunction");
        return t10 == null ? C4994g.f218169a : new C4997j(new InterfaceC4376a() { // from class: kotlin.sequences.s
            @Override // ed.InterfaceC4376a
            public final Object invoke() {
                return t10;
            }
        }, nextFunction);
    }

    public static final Object w(InterfaceC4376a interfaceC4376a, Object it) {
        kotlin.jvm.internal.G.p(it, "it");
        return interfaceC4376a.invoke();
    }

    public static final Object x(Object obj) {
        return obj;
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final <T> InterfaceC5000m<T> y(@NotNull InterfaceC5000m<? extends T> interfaceC5000m, @NotNull InterfaceC4376a<? extends InterfaceC5000m<? extends T>> defaultValue) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return C5004q.b(new SequencesKt__SequencesKt$ifEmpty$1(interfaceC5000m, defaultValue, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <T> InterfaceC5000m<T> z(InterfaceC5000m<? extends T> interfaceC5000m) {
        return interfaceC5000m == 0 ? C4994g.f218169a : interfaceC5000m;
    }
}
