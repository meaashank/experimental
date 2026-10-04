package androidx.datastore.core;

import ed.l;
import ed.p;
import java.util.List;
import kotlin.L0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", i = {0, 0}, l = {44, 46}, m = "invokeSuspend", n = {"migration", "data"}, s = {"L$2", "L$3"})
public final class DataMigrationInitializer$Companion$runMigrations$2<T> extends SuspendLambda implements p<T, kotlin.coroutines.e<? super T>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f112317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f112318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f112319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f112320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<c<T>> f112321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<l<kotlin.coroutines.e<? super L0>, Object>> f112322g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends c<T>> list, List<l<kotlin.coroutines.e<? super L0>, Object>> list2, kotlin.coroutines.e<? super DataMigrationInitializer$Companion$runMigrations$2> eVar) {
        super(2, eVar);
        this.f112321f = list;
        this.f112322g = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.f112321f, this.f112322g, eVar);
        dataMigrationInitializer$Companion$runMigrations$2.f112320e = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(T t10, @Nullable kotlin.coroutines.e<? super T> eVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t10, eVar)).invokeSuspend(L0.f217464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.f112319d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r9.f112316a
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r9.f112320e
            java.util.List r4 = (java.util.List) r4
            kotlin.C4885d0.n(r10)
            goto L44
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f112318c
            java.lang.Object r4 = r9.f112317b
            androidx.datastore.core.c r4 = (androidx.datastore.core.c) r4
            java.lang.Object r5 = r9.f112316a
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r9.f112320e
            java.util.List r6 = (java.util.List) r6
            kotlin.C4885d0.n(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L66
        L35:
            kotlin.C4885d0.n(r10)
            java.lang.Object r10 = r9.f112320e
            java.util.List<androidx.datastore.core.c<T>> r1 = r9.f112321f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List<ed.l<kotlin.coroutines.e<? super kotlin.L0>, java.lang.Object>> r4 = r9.f112322g
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.c r5 = (androidx.datastore.core.c) r5
            r9.f112320e = r4
            r9.f112316a = r1
            r9.f112317b = r5
            r9.f112318c = r10
            r9.f112319d = r3
            java.lang.Object r6 = r5.a(r10, r9)
            if (r6 != r0) goto L61
            goto L87
        L61:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8a
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r10 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.f112320e = r4
            r9.f112316a = r5
            r9.f112317b = r7
            r9.f112318c = r7
            r9.f112319d = r2
            java.lang.Object r10 = r6.c(r1, r9)
            if (r10 != r0) goto L88
        L87:
            return r0
        L88:
            r1 = r5
            goto L44
        L8a:
            r10 = r1
            goto L88
        L8c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
