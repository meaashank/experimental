package kotlinx.coroutines.reactive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {94, 96}, m = "collectImpl", n = {"this", "collector", "subscriber", "consumed", "this", "collector", "subscriber", "consumed"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0"})
public final class PublisherAsFlow$collectImpl$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f220483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f220484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f220485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PublisherAsFlow<T> f220486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f220487g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublisherAsFlow$collectImpl$1(PublisherAsFlow<T> publisherAsFlow, kotlin.coroutines.e<? super PublisherAsFlow$collectImpl$1> eVar) {
        super(eVar);
        this.f220486f = publisherAsFlow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1 for r1v1 'this'  kotlin.coroutines.e
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
        /*
            r1 = this;
            r1.f220485e = r2
            int r2 = r1.f220487g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f220487g = r2
            kotlinx.coroutines.reactive.PublisherAsFlow<T> r2 = r1.f220486f
            r0 = 0
            java.lang.Object r2 = r2.p(r0, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
