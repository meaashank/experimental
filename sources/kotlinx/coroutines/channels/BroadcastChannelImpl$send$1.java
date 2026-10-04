package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {227}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
public final class BroadcastChannelImpl$send$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f218846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f218849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BroadcastChannelImpl<E> f218850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f218851f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$send$1(BroadcastChannelImpl<E> broadcastChannelImpl, kotlin.coroutines.e<? super BroadcastChannelImpl$send$1> eVar) {
        super(eVar);
        this.f218850e = broadcastChannelImpl;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f218849d = r2
            int r2 = r1.f218851f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f218851f = r2
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> r2 = r1.f218850e
            r0 = 0
            java.lang.Object r2 = r2.I(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BroadcastChannelImpl$send$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
