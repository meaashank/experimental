package kotlinx.coroutines.reactive;

import kotlin.L0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.M;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.g;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nReactiveFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveFlow.kt\nkotlinx/coroutines/reactive/PublisherAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1#2:270\n*E\n"})
public final class PublisherAsFlow<T> extends ChannelFlow<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Publisher<T> f220480d;

    public /* synthetic */ PublisherAsFlow(Publisher publisher, i iVar, int i10, BufferOverflow bufferOverflow, int i11, C4969v c4969v) {
        this(publisher, (i11 & 2) != 0 ? EmptyCoroutineContext.f217673a : iVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static /* synthetic */ void s() {
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull kotlinx.coroutines.flow.f<? super T> fVar, @NotNull kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        i context = eVar.getContext();
        i iVar = this.f220074a;
        f.b bVar = kotlin.coroutines.f.f217679y3;
        kotlin.coroutines.f fVar2 = (kotlin.coroutines.f) iVar.get(bVar);
        if (fVar2 == null || fVar2.equals(context.get(bVar))) {
            Object objP = p(context.plus(this.f220074a), fVar, eVar);
            return objP == CoroutineSingletons.COROUTINE_SUSPENDED ? objP : L0.f217464a;
        }
        Object objQ = q(fVar, eVar);
        return objQ == CoroutineSingletons.COROUTINE_SUSPENDED ? objQ : L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object e(@NotNull q<? super T> qVar, @NotNull kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        Object objP = p(qVar.m(), new m(qVar.d()), eVar);
        return objP == CoroutineSingletons.COROUTINE_SUSPENDED ? objP : L0.f217464a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow<T> f(@NotNull i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return new PublisherAsFlow(this.f220480d, iVar, i10, bufferOverflow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r0 == r3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003a, B:33:0x00b3, B:35:0x00be, B:23:0x007d, B:30:0x009b, B:20:0x0059), top: B:41:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b0 -> B:14:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(kotlin.coroutines.i r18, kotlinx.coroutines.flow.f<? super T> r19, kotlin.coroutines.e<? super kotlin.L0> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherAsFlow.p(kotlin.coroutines.i, kotlinx.coroutines.flow.f, kotlin.coroutines.e):java.lang.Object");
    }

    public final Object q(kotlinx.coroutines.flow.f<? super T> fVar, kotlin.coroutines.e<? super L0> eVar) {
        Object objG = M.g(new PublisherAsFlow$collectSlowPath$2(fVar, this, null), eVar);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : L0.f217464a;
    }

    public final long r() {
        if (this.f220076c != BufferOverflow.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i10 = this.f220075b;
        if (i10 == -2) {
            kotlinx.coroutines.channels.g.f219178B3.getClass();
            return g.b.f219192h;
        }
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j10 = i10;
        if (j10 >= 1) {
            return j10;
        }
        throw new IllegalStateException("Check failed.");
    }

    public PublisherAsFlow(@NotNull Publisher<T> publisher, @NotNull i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        super(iVar, i10, bufferOverflow);
        this.f220480d = publisher;
    }
}
