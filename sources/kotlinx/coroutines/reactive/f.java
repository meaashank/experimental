package kotlinx.coroutines.reactive;

import dd.k;
import java.util.ServiceLoader;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.i;
import kotlin.jvm.internal.V;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.C5052b0;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveFlowKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,269:1\n12720#2,3:270\n37#3,2:273\n*S KotlinDebug\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/ReactiveFlowKt\n*L\n165#1:270,3\n162#1:273,2\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a[] f220518a = (a[]) SequencesKt___SequencesKt.I3(SequencesKt__SequencesKt.j(ServiceLoader.load(a.class, a.class.getClassLoader()).iterator())).toArray(new a[0]);

    @NotNull
    public static final <T> kotlinx.coroutines.flow.e<T> a(@NotNull Publisher<T> publisher) {
        return new PublisherAsFlow(publisher, null, 0, null, 14, null);
    }

    @k
    @NotNull
    public static final <T> Publisher<T> b(@NotNull kotlinx.coroutines.flow.e<? extends T> eVar) {
        return d(eVar, null, 1, null);
    }

    @k
    @NotNull
    public static final <T> Publisher<T> c(@NotNull kotlinx.coroutines.flow.e<? extends T> eVar, @NotNull i iVar) {
        return new b(eVar, C5052b0.g().plus(iVar));
    }

    public static /* synthetic */ Publisher d(kotlinx.coroutines.flow.e eVar, i iVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = EmptyCoroutineContext.f217673a;
        }
        return c(eVar, iVar);
    }

    @NotNull
    public static final <T> Publisher<T> e(@NotNull Publisher<T> publisher, @NotNull i iVar) {
        for (a aVar : f220518a) {
            publisher = aVar.a(publisher, iVar);
        }
        return publisher;
    }
}
