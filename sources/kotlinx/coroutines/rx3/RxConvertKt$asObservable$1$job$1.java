package kotlinx.coroutines.rx3;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zc.P;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.rx3.RxConvertKt$asObservable$1$job$1", f = "RxConvert.kt", i = {0}, l = {110}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class RxConvertKt$asObservable$1$job$1 extends SuspendLambda implements ed.p<L, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.e<T> f220586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P<T> f220587d;

    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ P<T> f220588a;

        public a(P<T> p10) {
            this.f220588a = p10;
        }

        @Override // kotlinx.coroutines.flow.f
        @Nullable
        public final Object emit(@NotNull T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            this.f220588a.onNext(t10);
            return L0.f217464a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RxConvertKt$asObservable$1$job$1(kotlinx.coroutines.flow.e<? extends T> eVar, P<T> p10, kotlin.coroutines.e<? super RxConvertKt$asObservable$1$job$1> eVar2) {
        super(2, eVar2);
        this.f220586c = eVar;
        this.f220587d = p10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        RxConvertKt$asObservable$1$job$1 rxConvertKt$asObservable$1$job$1 = new RxConvertKt$asObservable$1$job$1(this.f220586c, this.f220587d, eVar);
        rxConvertKt$asObservable$1$job$1.f220585b = obj;
        return rxConvertKt$asObservable$1$job$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to kotlinx.coroutines.rx3.RxConvertKt$asObservable$1$job$1 for r6v1 'this'  kotlin.coroutines.e
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.f220584a
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r6.f220585b
            kotlinx.coroutines.L r0 = (kotlinx.coroutines.L) r0
            kotlin.C4885d0.n(r7)     // Catch: java.lang.Throwable -> L11
            goto L37
        L11:
            r7 = move-exception
            goto L41
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.C4885d0.n(r7)
            java.lang.Object r7 = r6.f220585b
            kotlinx.coroutines.L r7 = (kotlinx.coroutines.L) r7
            kotlinx.coroutines.flow.e<T> r1 = r6.f220586c     // Catch: java.lang.Throwable -> L3d
            kotlinx.coroutines.rx3.RxConvertKt$asObservable$1$job$1$a r3 = new kotlinx.coroutines.rx3.RxConvertKt$asObservable$1$job$1$a     // Catch: java.lang.Throwable -> L3d
            zc.P<T> r4 = r6.f220587d     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            r6.f220585b = r7     // Catch: java.lang.Throwable -> L3d
            r6.f220584a = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.collect(r3, r6)     // Catch: java.lang.Throwable -> L3d
            if (r1 != r0) goto L36
            return r0
        L36:
            r0 = r7
        L37:
            zc.P<T> r7 = r6.f220587d     // Catch: java.lang.Throwable -> L11
            r7.onComplete()     // Catch: java.lang.Throwable -> L11
            goto L5a
        L3d:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L41:
            boolean r1 = r7 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L55
            zc.P<T> r1 = r6.f220587d
            boolean r1 = r1.a(r7)
            if (r1 != 0) goto L5a
            kotlin.coroutines.i r0 = r0.m()
            kotlinx.coroutines.rx3.b.a(r7, r0)
            goto L5a
        L55:
            zc.P<T> r7 = r6.f220587d
            r7.onComplete()
        L5a:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx3.RxConvertKt$asObservable$1$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((RxConvertKt$asObservable$1$job$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
