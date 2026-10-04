package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {415, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
public final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f220059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SubscribedFlowCollector<T> f220060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f220061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(SubscribedFlowCollector<T> subscribedFlowCollector, kotlin.coroutines.e<? super SubscribedFlowCollector$onSubscription$1> eVar) {
        super(eVar);
        this.f220060d = subscribedFlowCollector;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f220059c = r2
            int r2 = r1.f220061e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f220061e = r2
            kotlinx.coroutines.flow.SubscribedFlowCollector<T> r2 = r1.f220060d
            java.lang.Object r2 = r2.a(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
