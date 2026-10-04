package kotlin.sequences;

import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes7.dex */
@Vc.d(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {0, 0, 1, 1}, l = {102, 104}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "$this$sequence", "iterator"}, nl = {104, 106}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
public final class SequencesKt__SequencesKt$ifEmpty$1<T> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super T>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f218086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5000m<T> f218087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4376a<InterfaceC5000m<T>> f218088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt__SequencesKt$ifEmpty$1(InterfaceC5000m<? extends T> interfaceC5000m, InterfaceC4376a<? extends InterfaceC5000m<? extends T>> interfaceC4376a, kotlin.coroutines.e<? super SequencesKt__SequencesKt$ifEmpty$1> eVar) {
        super(2, eVar);
        this.f218087e = interfaceC5000m;
        this.f218088f = interfaceC4376a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.f218087e, this.f218088f, eVar);
        sequencesKt__SequencesKt$ifEmpty$1.f218086d = obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super T> abstractC5002o, kotlin.coroutines.e<? super L0> eVar) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0.e(r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r0.f(r7, r6) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f218086d
            kotlin.sequences.o r0 = (kotlin.sequences.AbstractC5002o) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.f218085c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L21
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            java.lang.Object r0 = r6.f218084b
            java.util.Iterator r0 = (java.util.Iterator) r0
            kotlin.C4885d0.n(r7)
            goto L53
        L21:
            kotlin.C4885d0.n(r7)
            kotlin.sequences.m<T> r7 = r6.f218087e
            java.util.Iterator r7 = r7.iterator()
            boolean r2 = r7.hasNext()
            r5 = 0
            if (r2 == 0) goto L3e
            r6.f218086d = r5
            r6.f218084b = r5
            r6.f218085c = r4
            java.lang.Object r7 = r0.e(r7, r6)
            if (r7 != r1) goto L53
            goto L52
        L3e:
            ed.a<kotlin.sequences.m<T>> r7 = r6.f218088f
            java.lang.Object r7 = r7.invoke()
            kotlin.sequences.m r7 = (kotlin.sequences.InterfaceC5000m) r7
            r6.f218086d = r5
            r6.f218084b = r5
            r6.f218085c = r3
            java.lang.Object r7 = r0.f(r7, r6)
            if (r7 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
