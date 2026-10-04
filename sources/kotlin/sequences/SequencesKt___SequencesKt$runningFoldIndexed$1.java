package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes7.dex */
@Vc.d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1, 1}, l = {2472, 2477}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "element", FirebaseAnalytics.Param.INDEX}, nl = {2473, 2479}, s = {"L$0", "L$0", "L$1", "L$3", "I$0"}, v = 2)
public final class SequencesKt___SequencesKt$runningFoldIndexed$1<R> extends RestrictedSuspendLambda implements ed.p<AbstractC5002o<? super R>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f218126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f218128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f218129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R f218130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5000m<T> f218131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ed.q<Integer, R, T, R> f218132j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(R r10, InterfaceC5000m<? extends T> interfaceC5000m, ed.q<? super Integer, ? super R, ? super T, ? extends R> qVar, kotlin.coroutines.e<? super SequencesKt___SequencesKt$runningFoldIndexed$1> eVar) {
        super(2, eVar);
        this.f218130h = r10;
        this.f218131i = interfaceC5000m;
        this.f218132j = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e<L0> create(Object obj, kotlin.coroutines.e<?> eVar) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.f218130h, this.f218131i, this.f218132j, eVar);
        sequencesKt___SequencesKt$runningFoldIndexed$1.f218129g = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    @Override // ed.p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(AbstractC5002o<? super R> abstractC5002o, kotlin.coroutines.e<? super L0> eVar) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(abstractC5002o, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0.b(r12, r11) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:7:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f218129g
            kotlin.sequences.o r0 = (kotlin.sequences.AbstractC5002o) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r11.f218128f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L29
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            int r2 = r11.f218127e
            java.lang.Object r4 = r11.f218125c
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r11.f218124b
            kotlin.C4885d0.n(r12)
        L1b:
            r12 = r5
            goto L45
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            kotlin.C4885d0.n(r12)
            goto L39
        L29:
            kotlin.C4885d0.n(r12)
            R r12 = r11.f218130h
            r11.f218129g = r0
            r11.f218128f = r4
            java.lang.Object r12 = r0.b(r12, r11)
            if (r12 != r1) goto L39
            goto L71
        L39:
            R r12 = r11.f218130h
            kotlin.sequences.m<T> r2 = r11.f218131i
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r10 = r4
            r4 = r2
            r2 = r10
        L45:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L78
            java.lang.Object r5 = r4.next()
            ed.q<java.lang.Integer, R, T, R> r6 = r11.f218132j
            int r7 = r2 + 1
            r8 = 0
            if (r2 < 0) goto L74
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r2)
            java.lang.Object r5 = r6.invoke(r9, r12, r5)
            r11.f218129g = r0
            r11.f218124b = r5
            r11.f218125c = r4
            r11.f218126d = r8
            r11.f218127e = r7
            r11.f218128f = r3
            java.lang.Object r12 = r0.b(r5, r11)
            if (r12 != r1) goto L72
        L71:
            return r1
        L72:
            r2 = r7
            goto L1b
        L74:
            kotlin.collections.I.b0()
            throw r8
        L78:
            kotlin.L0 r12 = kotlin.L0.f217464a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
