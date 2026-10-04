package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {426}, m = "writeData$datastore_core", n = {"this", "scratchFile", "stream"}, s = {"L$0", "L$1", "L$4"})
public final class SingleProcessDataStore$writeData$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f112429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f112430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f112431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f112432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f112433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f112434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$writeData$1(SingleProcessDataStore<T> singleProcessDataStore, kotlin.coroutines.e<? super SingleProcessDataStore$writeData$1> eVar) {
        super(eVar);
        this.f112433g = singleProcessDataStore;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to androidx.datastore.core.SingleProcessDataStore$writeData$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f112432f = r2
            int r2 = r1.f112434h
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f112434h = r2
            androidx.datastore.core.SingleProcessDataStore<T> r2 = r1.f112433g
            r0 = 0
            java.lang.Object r2 = r2.A(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$writeData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
