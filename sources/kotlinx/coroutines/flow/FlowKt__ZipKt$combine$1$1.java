package kotlinx.coroutines.flow;

import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {29, 29}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combine$1$1<R> extends SuspendLambda implements ed.q<f<? super R>, Object[], kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.q<T1, T2, kotlin.coroutines.e<? super R>, Object> f219921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$1$1(ed.q<? super T1, ? super T2, ? super kotlin.coroutines.e<? super R>, ? extends Object> qVar, kotlin.coroutines.e<? super FlowKt__ZipKt$combine$1$1> eVar) {
        super(3, eVar);
        this.f219921d = qVar;
    }

    @Override // ed.q
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull f<? super R> fVar, @NotNull Object[] objArr, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f219921d, eVar);
        flowKt__ZipKt$combine$1$1.f219919b = fVar;
        flowKt__ZipKt$combine$1$1.f219920c = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1<R> for r6v1 'this'  java.lang.Object
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
            int r1 = r6.f219918a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.C4885d0.n(r7)
            goto L4a
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.f219919b
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
            kotlin.C4885d0.n(r7)
            goto L3e
        L20:
            kotlin.C4885d0.n(r7)
            java.lang.Object r7 = r6.f219919b
            r1 = r7
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
            java.lang.Object r7 = r6.f219920c
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            ed.q<T1, T2, kotlin.coroutines.e<? super R>, java.lang.Object> r4 = r6.f219921d
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r3]
            r6.f219919b = r1
            r6.f219918a = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L3e
            goto L49
        L3e:
            r3 = 0
            r6.f219919b = r3
            r6.f219918a = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
