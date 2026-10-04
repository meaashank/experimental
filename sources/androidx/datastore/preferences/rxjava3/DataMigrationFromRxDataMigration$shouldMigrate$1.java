package androidx.datastore.preferences.rxjava3;

import Vc.d;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
@d(c = "androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration", f = "RxPreferenceDataStoreBuilder.kt", i = {}, l = {Opcodes.LOOKUPSWITCH}, m = "shouldMigrate", n = {}, s = {})
public final class DataMigrationFromRxDataMigration$shouldMigrate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f113016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataMigrationFromRxDataMigration<T> f113017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f113018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationFromRxDataMigration$shouldMigrate$1(DataMigrationFromRxDataMigration<T> dataMigrationFromRxDataMigration, e<? super DataMigrationFromRxDataMigration$shouldMigrate$1> eVar) {
        super(eVar);
        this.f113017b = dataMigrationFromRxDataMigration;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.e to androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1 for r1v1 'this'  kotlin.coroutines.e
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
            r1.f113016a = r2
            int r2 = r1.f113018c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.f113018c = r2
            androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration<T> r2 = r1.f113017b
            r0 = 0
            java.lang.Object r2 = r2.a(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.rxjava3.DataMigrationFromRxDataMigration$shouldMigrate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
