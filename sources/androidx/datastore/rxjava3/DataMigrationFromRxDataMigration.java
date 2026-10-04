package androidx.datastore.rxjava3;

import kotlin.L0;
import kotlin.coroutines.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.G;
import kotlinx.coroutines.rx3.RxAwaitKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zc.AbstractC5885b;
import zc.X;

/* JADX INFO: loaded from: classes2.dex */
public final class DataMigrationFromRxDataMigration<T> implements androidx.datastore.core.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b<T> f113035a;

    public DataMigrationFromRxDataMigration(@NotNull b<T> migration) {
        G.p(migration, "migration");
        this.f113035a = migration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(T r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1 r0 = (androidx.datastore.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1) r0
            int r1 = r0.f113038c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113038c = r1
            goto L18
        L13:
            androidx.datastore.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1 r0 = new androidx.datastore.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f113036a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f113038c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.C4885d0.n(r6)
            androidx.datastore.rxjava3.b<T> r6 = r4.f113035a
            zc.X r5 = r6.a(r5)
            java.lang.String r6 = "migration.shouldMigrate(currentData)"
            kotlin.jvm.internal.G.o(r5, r6)
            r0.f113038c = r3
            java.lang.Object r6 = kotlinx.coroutines.rx3.RxAwaitKt.d(r5, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "migration.shouldMigrate(currentData).await()"
            kotlin.jvm.internal.G.o(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.rxjava3.DataMigrationFromRxDataMigration.a(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.datastore.core.c
    @Nullable
    public Object b(@NotNull e<? super L0> eVar) {
        AbstractC5885b abstractC5885bCleanUp = this.f113035a.cleanUp();
        G.o(abstractC5885bCleanUp, "migration.cleanUp()");
        Object objB = RxAwaitKt.b(abstractC5885bCleanUp, eVar);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : L0.f217464a;
    }

    @Override // androidx.datastore.core.c
    @Nullable
    public Object c(T t10, @NotNull e<? super T> eVar) {
        X<T> xB = this.f113035a.b(t10);
        G.o(xB, "migration.migrate(currentData)");
        return RxAwaitKt.d(xB, eVar);
    }
}
