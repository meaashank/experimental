package kotlinx.coroutines.reactive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.reactive.PublisherCoroutine", f = "Publish.kt", i = {0, 0}, l = {128}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
public final class PublisherCoroutine$send$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f220503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PublisherCoroutine<T> f220504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f220505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PublisherCoroutine$send$1(PublisherCoroutine<? super T> publisherCoroutine, kotlin.coroutines.e<? super PublisherCoroutine$send$1> eVar) {
        super(eVar);
        this.f220504d = publisherCoroutine;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.reactive.PublisherCoroutine$send$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f220503c = r2
            int r2 = r1.f220505e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f220505e = r2
            kotlinx.coroutines.reactive.PublisherCoroutine<T> r2 = r1.f220504d
            r0 = 0
            java.lang.Object r2 = r2.I(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherCoroutine$send$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
