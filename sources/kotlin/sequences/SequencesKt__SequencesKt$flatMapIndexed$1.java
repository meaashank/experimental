package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes7.dex */
@Vc.d(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0, 0, 0}, l = {383}, m = "invokeSuspend", n = {"$this$sequence", "element", R9.c.f67796d, FirebaseAnalytics.Param.INDEX}, nl = {385}, s = {"L$0", "L$2", "L$3", "I$0"}, v = 2)
public final class SequencesKt__SequencesKt$flatMapIndexed$1<R> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super R>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f218077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f218079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f218080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5000m<T> f218081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ed.p<Integer, T, C> f218082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ed.l<C, Iterator<R>> f218083j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$flatMapIndexed$1(InterfaceC5000m<? extends T> interfaceC5000m, ed.p<? super Integer, ? super T, ? extends C> pVar, ed.l<? super C, ? extends Iterator<? extends R>> lVar, kotlin.coroutines.e<? super SequencesKt__SequencesKt$flatMapIndexed$1> eVar) {
        super(2, eVar);
        this.f218081h = interfaceC5000m;
        this.f218082i = pVar;
        this.f218083j = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.f218081h, this.f218082i, this.f218083j, eVar);
        sequencesKt__SequencesKt$flatMapIndexed$1.f218080g = obj;
        return sequencesKt__SequencesKt$flatMapIndexed$1;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super R> abstractC5002o, kotlin.coroutines.e<? super L0> eVar) {
        return ((SequencesKt__SequencesKt$flatMapIndexed$1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        Iterator it;
        AbstractC5002o abstractC5002o = (AbstractC5002o) this.f218080g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f218079f;
        if (i11 == 0) {
            C4885d0.n(obj);
            i10 = 0;
            it = this.f218081h.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f218078e;
            it = (Iterator) this.f218075b;
            C4885d0.n(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            ed.p<Integer, T, C> pVar = this.f218082i;
            int i12 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.I.b0();
                throw null;
            }
            Iterator<R> itInvoke = this.f218083j.invoke((C) pVar.invoke(new Integer(i10), (T) next));
            this.f218080g = abstractC5002o;
            this.f218075b = it;
            this.f218076c = null;
            this.f218077d = null;
            this.f218078e = i12;
            this.f218079f = 1;
            if (abstractC5002o.e(itInvoke, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i10 = i12;
        }
        return L0.f217464a;
    }
}
