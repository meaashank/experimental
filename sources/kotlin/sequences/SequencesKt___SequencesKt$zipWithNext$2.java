package kotlin.sequences;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Iterator;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes7.dex */
@Vc.d(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0, 0}, l = {3000}, m = "invokeSuspend", n = {"$this$result", "iterator", "current", "next"}, nl = {AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
public final class SequencesKt___SequencesKt$zipWithNext$2<R> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super R>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f218148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f218150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5000m<T> f218151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ed.p<T, T, R> f218152h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$zipWithNext$2(InterfaceC5000m<? extends T> interfaceC5000m, ed.p<? super T, ? super T, ? extends R> pVar, kotlin.coroutines.e<? super SequencesKt___SequencesKt$zipWithNext$2> eVar) {
        super(2, eVar);
        this.f218151g = interfaceC5000m;
        this.f218152h = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.f218151g, this.f218152h, eVar);
        sequencesKt___SequencesKt$zipWithNext$2.f218150f = obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super R> abstractC5002o, kotlin.coroutines.e<? super L0> eVar) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Iterator it;
        AbstractC5002o abstractC5002o = (AbstractC5002o) this.f218150f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f218149e;
        if (i10 == 0) {
            C4885d0.n(obj);
            Iterator it2 = this.f218151g.iterator();
            if (!it2.hasNext()) {
                return L0.f217464a;
            }
            next = it2.next();
            it = it2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.f218148d;
            it = (Iterator) this.f218146b;
            C4885d0.n(obj);
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            R rInvoke = this.f218152h.invoke((T) next, (T) next2);
            this.f218150f = abstractC5002o;
            this.f218146b = it;
            this.f218147c = null;
            this.f218148d = next2;
            this.f218149e = 1;
            if (abstractC5002o.b(rInvoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            next = next2;
        }
        return L0.f217464a;
    }
}
