package androidx.datastore.core;

import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
public final class SingleProcessDataStore$transformAndWrite$newData$1<T> extends SuspendLambda implements p<L, kotlin.coroutines.e<? super T>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f112424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<T, kotlin.coroutines.e<? super T>, Object> f112425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f112426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore$transformAndWrite$newData$1(p<? super T, ? super kotlin.coroutines.e<? super T>, ? extends Object> pVar, T t10, kotlin.coroutines.e<? super SingleProcessDataStore$transformAndWrite$newData$1> eVar) {
        super(2, eVar);
        this.f112425b = pVar;
        this.f112426c = t10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.f112425b, this.f112426c, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f112424a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
            return obj;
        }
        C4885d0.n(obj);
        p<T, kotlin.coroutines.e<? super T>, Object> pVar = this.f112425b;
        T t10 = this.f112426c;
        this.f112424a = 1;
        Object objInvoke = pVar.invoke(t10, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull L l10, @Nullable kotlin.coroutines.e<? super T> eVar) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(l10, eVar)).invokeSuspend(L0.f217464a);
    }
}
