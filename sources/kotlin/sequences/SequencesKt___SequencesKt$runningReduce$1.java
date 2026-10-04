package kotlin.sequences;

import java.util.Iterator;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: loaded from: classes7.dex */
@Vc.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2501, 2504}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, nl = {2502, 2507}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
public final class SequencesKt___SequencesKt$runningReduce$1<S> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super S>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f218135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f218136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5000m<T> f218137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ed.p<S, T, S> f218138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningReduce$1(InterfaceC5000m<? extends T> interfaceC5000m, ed.p<? super S, ? super T, ? extends S> pVar, kotlin.coroutines.e<? super SequencesKt___SequencesKt$runningReduce$1> eVar) {
        super(2, eVar);
        this.f218137f = interfaceC5000m;
        this.f218138g = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.f218137f, this.f218138g, eVar);
        sequencesKt___SequencesKt$runningReduce$1.f218136e = obj;
        return sequencesKt___SequencesKt$runningReduce$1;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super S> abstractC5002o, kotlin.coroutines.e<? super L0> eVar) {
        return ((SequencesKt___SequencesKt$runningReduce$1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Iterator it;
        AbstractC5002o abstractC5002o = (AbstractC5002o) this.f218136e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f218135d;
        if (i10 == 0) {
            C4885d0.n(obj);
            Iterator it2 = this.f218137f.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.f218136e = abstractC5002o;
                this.f218133b = it2;
                this.f218134c = next;
                this.f218135d = 1;
                if (abstractC5002o.b(next, this) != coroutineSingletons) {
                    it = it2;
                }
                return coroutineSingletons;
            }
            return L0.f217464a;
        }
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        next = this.f218134c;
        it = (Iterator) this.f218133b;
        C4885d0.n(obj);
        while (it.hasNext()) {
            next = this.f218138g.invoke((S) next, (T) it.next());
            this.f218136e = abstractC5002o;
            this.f218133b = it;
            this.f218134c = next;
            this.f218135d = 2;
            if (abstractC5002o.b(next, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return L0.f217464a;
    }
}
