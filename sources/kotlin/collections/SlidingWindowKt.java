package kotlin.collections;

import androidx.collection.M0;
import androidx.collection.N0;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.C5004q;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,730:1\n19#2:731\n*E\n"})
    public static final class a<T> implements InterfaceC5000m<List<? extends T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5000m f217518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f217519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f217520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f217521d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f217522e;

        public a(InterfaceC5000m interfaceC5000m, int i10, int i11, boolean z10, boolean z11) {
            this.f217518a = interfaceC5000m;
            this.f217519b = i10;
            this.f217520c = i11;
            this.f217521d = z10;
            this.f217522e = z11;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<List<? extends T>> iterator() {
            return SlidingWindowKt.b(this.f217518a.iterator(), this.f217519b, this.f217520c, this.f217521d, this.f217522e);
        }
    }

    public static final void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException((i10 != i11 ? M0.a("Both size ", i10, " and step ", i11, " must be greater than zero.") : N0.a("size ", i10, " must be greater than zero.")).toString());
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> b(@NotNull Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.G.p(iterator, "iterator");
        return !iterator.hasNext() ? W.f217540a : C5004q.a(new SlidingWindowKt$windowedIterator$1(i10, i11, iterator, z11, z10, null));
    }

    @NotNull
    public static final <T> InterfaceC5000m<List<T>> c(@NotNull InterfaceC5000m<? extends T> interfaceC5000m, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.G.p(interfaceC5000m, "<this>");
        a(i10, i11);
        return new a(interfaceC5000m, i10, i11, z10, z11);
    }
}
