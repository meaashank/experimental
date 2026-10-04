package nd;

import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.InterfaceC4887e0;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nd.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "StreamsKt")
public final class C5283h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: nd.h$a */
    @V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,730:1\n31#2:731\n*E\n"})
    public static final class a<T> implements InterfaceC5000m<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Stream f222995a;

        public a(Stream stream) {
            this.f222995a = stream;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<T> iterator() {
            Iterator<T> it = this.f222995a.iterator();
            G.o(it, "iterator(...)");
            return it;
        }
    }

    /* JADX INFO: renamed from: nd.h$b */
    @V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,730:1\n39#2:731\n*E\n"})
    public static final class b implements InterfaceC5000m<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IntStream f222996a;

        public b(IntStream intStream) {
            this.f222996a = intStream;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Integer> iterator() {
            PrimitiveIterator.OfInt it = this.f222996a.iterator();
            G.o(it, "iterator(...)");
            return it;
        }
    }

    /* JADX INFO: renamed from: nd.h$c */
    @V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,730:1\n47#2:731\n*E\n"})
    public static final class c implements InterfaceC5000m<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LongStream f222997a;

        public c(LongStream longStream) {
            this.f222997a = longStream;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Long> iterator() {
            PrimitiveIterator.OfLong it = this.f222997a.iterator();
            G.o(it, "iterator(...)");
            return it;
        }
    }

    /* JADX INFO: renamed from: nd.h$d */
    @V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,730:1\n55#2:731\n*E\n"})
    public static final class d implements InterfaceC5000m<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DoubleStream f222998a;

        public d(DoubleStream doubleStream) {
            this.f222998a = doubleStream;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<Double> iterator() {
            PrimitiveIterator.OfDouble it = this.f222998a.iterator();
            G.o(it, "iterator(...)");
            return it;
        }
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final InterfaceC5000m<Double> b(@NotNull DoubleStream doubleStream) {
        G.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final InterfaceC5000m<Integer> c(@NotNull IntStream intStream) {
        G.p(intStream, "<this>");
        return new b(intStream);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final InterfaceC5000m<Long> d(@NotNull LongStream longStream) {
        G.p(longStream, "<this>");
        return new c(longStream);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T> InterfaceC5000m<T> e(@NotNull Stream<T> stream) {
        G.p(stream, "<this>");
        return new a(stream);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T> Stream<T> f(@NotNull final InterfaceC5000m<? extends T> interfaceC5000m) {
        G.p(interfaceC5000m, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: nd.g
            @Override // java.util.function.Supplier
            public final Object get() {
                return C5283h.g(interfaceC5000m);
            }
        }, 16, false);
        G.o(stream, "stream(...)");
        return stream;
    }

    public static final Spliterator g(InterfaceC5000m interfaceC5000m) {
        return Spliterators.spliteratorUnknownSize(interfaceC5000m.iterator(), 16);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final List<Double> h(@NotNull DoubleStream doubleStream) {
        G.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        G.o(array, "toArray(...)");
        return C4875q.p(array);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final List<Integer> i(@NotNull IntStream intStream) {
        G.p(intStream, "<this>");
        int[] array = intStream.toArray();
        G.o(array, "toArray(...)");
        return C4875q.r(array);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final List<Long> j(@NotNull LongStream longStream) {
        G.p(longStream, "<this>");
        long[] array = longStream.toArray();
        G.o(array, "toArray(...)");
        return C4875q.s(array);
    }

    @InterfaceC4887e0(version = "1.2")
    @NotNull
    public static final <T> List<T> k(@NotNull Stream<T> stream) {
        G.p(stream, "<this>");
        Object objCollect = stream.collect(Collectors.toList());
        G.o(objCollect, "collect(...)");
        return (List) objCollect;
    }
}
