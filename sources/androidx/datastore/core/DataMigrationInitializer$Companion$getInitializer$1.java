package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import ed.p;
import java.util.List;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class DataMigrationInitializer$Companion$getInitializer$1<T> extends SuspendLambda implements p<g<T>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f112309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<c<T>> f112310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$getInitializer$1(List<? extends c<T>> list, kotlin.coroutines.e<? super DataMigrationInitializer$Companion$getInitializer$1> eVar) {
        super(2, eVar);
        this.f112310c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.f112310c, eVar);
        dataMigrationInitializer$Companion$getInitializer$1.f112309b = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@NotNull g<T> gVar, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(gVar, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f112308a;
        if (i10 == 0) {
            C4885d0.n(obj);
            g<T> gVar = (g) this.f112309b;
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.f112307a;
            List<c<T>> list = this.f112310c;
            this.f112308a = 1;
            if (companion.c(list, gVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return L0.f217464a;
    }
}
