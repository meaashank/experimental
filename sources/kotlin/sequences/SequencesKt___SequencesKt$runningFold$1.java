package kotlin.sequences;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes7.dex */
@Vc.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2444, 2448}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element"}, nl = {2445, 2450}, s = {"L$0", "L$0", "L$1", "L$3"}, v = 2)
public final class SequencesKt___SequencesKt$runningFold$1<R> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super R>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f218118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f218120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R f218121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5000m<T> f218122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ed.p<R, T, R> f218123i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFold$1(R r10, InterfaceC5000m<? extends T> interfaceC5000m, ed.p<? super R, ? super T, ? extends R> pVar, kotlin.coroutines.e<? super SequencesKt___SequencesKt$runningFold$1> eVar) {
        super(2, eVar);
        this.f218121g = r10;
        this.f218122h = interfaceC5000m;
        this.f218123i = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.f218121g, this.f218122h, this.f218123i, eVar);
        sequencesKt___SequencesKt$runningFold$1.f218120f = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super R> abstractC5002o, kotlin.coroutines.e<? super L0> eVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0.b(r7, r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r0.b(r4, r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:7:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f218120f
            kotlin.sequences.o r0 = (kotlin.sequences.AbstractC5002o) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.f218119e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L27
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1b
            java.lang.Object r2 = r6.f218117c
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r6.f218116b
            kotlin.C4885d0.n(r7)
        L19:
            r7 = r4
            goto L3f
        L1b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L23:
            kotlin.C4885d0.n(r7)
            goto L37
        L27:
            kotlin.C4885d0.n(r7)
            R r7 = r6.f218121g
            r6.f218120f = r0
            r6.f218119e = r4
            java.lang.Object r7 = r0.b(r7, r6)
            if (r7 != r1) goto L37
            goto L60
        L37:
            R r7 = r6.f218121g
            kotlin.sequences.m<T> r2 = r6.f218122h
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r2.next()
            ed.p<R, T, R> r5 = r6.f218123i
            java.lang.Object r4 = r5.invoke(r7, r4)
            r6.f218120f = r0
            r6.f218116b = r4
            r6.f218117c = r2
            r7 = 0
            r6.f218118d = r7
            r6.f218119e = r3
            java.lang.Object r7 = r0.b(r4, r6)
            if (r7 != r1) goto L19
        L60:
            return r1
        L61:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFold$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
