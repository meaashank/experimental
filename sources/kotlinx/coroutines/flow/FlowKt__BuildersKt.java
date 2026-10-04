package kotlinx.coroutines.flow;

import ed.InterfaceC4376a;
import java.util.Iterator;
import kotlin.InterfaceC4849b;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.V;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,350:1\n105#2:351\n105#2:352\n105#2:353\n105#2:354\n105#2:355\n105#2:356\n105#2:357\n105#2:358\n105#2:359\n105#2:360\n105#2:361\n105#2:362\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n64#1:351\n78#1:352\n85#1:353\n94#1:354\n103#1:355\n118#1:356\n127#1:357\n149#1:358\n160#1:359\n171#1:360\n180#1:361\n189#1:362\n*E\n"})
public final /* synthetic */ class FlowKt__BuildersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,111:1\n65#2,2:112\n*E\n"})
    public static final class a<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC4376a f219329a;

        public a(InterfaceC4376a interfaceC4376a) {
            this.f219329a = interfaceC4376a;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            Object objEmit = fVar.emit((Object) this.f219329a.invoke(), eVar);
            return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : L0.f217464a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @V({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,111:1\n132#2,2:112\n*E\n"})
    public static final class b<T> implements e<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f219389a;

        public b(Object obj) {
            this.f219389a = obj;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            Object objEmit = fVar.emit((Object) this.f219389a, eVar);
            return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : L0.f217464a;
        }
    }

    @NotNull
    public static final <T> e<T> a(@NotNull InterfaceC4376a<? extends T> interfaceC4376a) {
        return new a(interfaceC4376a);
    }

    @NotNull
    public static final <T> e<T> b(@NotNull ed.l<? super kotlin.coroutines.e<? super T>, ? extends Object> lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lVar);
    }

    @NotNull
    public static final <T> e<T> c(@NotNull Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    @NotNull
    public static final <T> e<T> d(@NotNull Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    @NotNull
    public static final <T> e<T> e(@NotNull InterfaceC5000m<? extends T> interfaceC5000m) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(interfaceC5000m);
    }

    @NotNull
    public static final e<Integer> f(@NotNull md.l lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(lVar);
    }

    @NotNull
    public static final e<Long> g(@NotNull md.o oVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(oVar);
    }

    @NotNull
    public static final e<Integer> h(@NotNull int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    @NotNull
    public static final e<Long> i(@NotNull long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    @NotNull
    public static final <T> e<T> j(@NotNull T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    @NotNull
    public static final <T> e<T> k(@InterfaceC4849b @NotNull ed.p<? super kotlinx.coroutines.channels.q<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        return new CallbackFlowBuilder(pVar, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> e<T> l(@InterfaceC4849b @NotNull ed.p<? super kotlinx.coroutines.channels.q<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        return new c(pVar, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> e<T> m() {
        return d.f220071a;
    }

    @NotNull
    public static final <T> e<T> n(@InterfaceC4849b @NotNull ed.p<? super f<? super T>, ? super kotlin.coroutines.e<? super L0>, ? extends Object> pVar) {
        return new m(pVar);
    }

    @NotNull
    public static final <T> e<T> o(T t10) {
        return new b(t10);
    }

    @NotNull
    public static final <T> e<T> p(@NotNull T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }
}
