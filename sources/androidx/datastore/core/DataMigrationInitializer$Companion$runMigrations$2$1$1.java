package androidx.datastore.core;

import ed.l;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements l<kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c<T> f112324b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(c<T> cVar, kotlin.coroutines.e<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> eVar) {
        super(1, eVar);
        this.f112324b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@NotNull kotlin.coroutines.e<?> eVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.f112324b, eVar);
    }

    @Override // ed.l
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 for r3v1 'this'  kotlin.coroutines.e
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r3.f112323a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.C4885d0.n(r4)
            goto L23
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L15:
            kotlin.C4885d0.n(r4)
            androidx.datastore.core.c<T> r4 = r3.f112324b
            r3.f112323a = r2
            java.lang.Object r4 = r4.b(r3)
            if (r4 != r0) goto L23
            return r0
        L23:
            kotlin.L0 r4 = kotlin.L0.f217464a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
