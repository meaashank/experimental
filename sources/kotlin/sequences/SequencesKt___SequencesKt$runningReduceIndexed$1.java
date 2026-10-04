package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: loaded from: classes7.dex */
@Vc.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2530, 2534}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", FirebaseAnalytics.Param.INDEX}, nl = {2531, 2537}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"}, v = 2)
public final class SequencesKt___SequencesKt$runningReduceIndexed$1<S> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super S>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f218141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f218143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5000m<T> f218144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ed.q<Integer, S, T, S> f218145h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningReduceIndexed$1(InterfaceC5000m<? extends T> interfaceC5000m, ed.q<? super Integer, ? super S, ? super T, ? extends S> qVar, kotlin.coroutines.e<? super SequencesKt___SequencesKt$runningReduceIndexed$1> eVar) {
        super(2, eVar);
        this.f218144g = interfaceC5000m;
        this.f218145h = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.f218144g, this.f218145h, eVar);
        sequencesKt___SequencesKt$runningReduceIndexed$1.f218143f = obj;
        return sequencesKt___SequencesKt$runningReduceIndexed$1;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super S> abstractC5002o, kotlin.coroutines.e<? super L0> eVar) {
        return ((SequencesKt___SequencesKt$runningReduceIndexed$1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        Object next;
        AbstractC5002o abstractC5002o = (AbstractC5002o) this.f218143f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f218142e;
        int i11 = 1;
        if (i10 == 0) {
            C4885d0.n(obj);
            it = this.f218144g.iterator();
            if (it.hasNext()) {
                next = it.next();
                this.f218143f = abstractC5002o;
                this.f218139b = it;
                this.f218140c = next;
                this.f218142e = 1;
                if (abstractC5002o.b(next, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return L0.f217464a;
        }
        if (i10 == 1) {
            next = this.f218140c;
            it = (Iterator) this.f218139b;
            C4885d0.n(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.f218141d;
            Object obj2 = this.f218140c;
            it = (Iterator) this.f218139b;
            C4885d0.n(obj);
            i11 = i12;
            next = obj2;
        }
        while (it.hasNext()) {
            ed.q<Integer, S, T, S> qVar = this.f218145h;
            int i13 = i11 + 1;
            if (i11 < 0) {
                kotlin.collections.I.b0();
                throw null;
            }
            S sInvoke = qVar.invoke(new Integer(i11), (S) next, (T) it.next());
            this.f218143f = abstractC5002o;
            this.f218139b = it;
            this.f218140c = sInvoke;
            this.f218141d = i13;
            this.f218142e = 2;
            if (abstractC5002o.b(sInvoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            next = sInvoke;
            i11 = i13;
        }
        return L0.f217464a;
    }
}
