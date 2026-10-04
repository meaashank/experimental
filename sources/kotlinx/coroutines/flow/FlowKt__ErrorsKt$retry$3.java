package kotlinx.coroutines.flow;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ErrorsKt$retry$3<T> extends SuspendLambda implements ed.r<f<? super T>, Throwable, Long, kotlin.coroutines.e<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f219565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f219566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ed.p<Throwable, kotlin.coroutines.e<? super Boolean>, Object> f219567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$retry$3(long j10, ed.p<? super Throwable, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.e<? super FlowKt__ErrorsKt$retry$3> eVar) {
        super(4, eVar);
        this.f219566d = j10;
        this.f219567e = pVar;
    }

    @Nullable
    public final Object e(@NotNull f<? super T> fVar, @NotNull Throwable th, long j10, @Nullable kotlin.coroutines.e<? super Boolean> eVar) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.f219566d, this.f219567e, eVar);
        flowKt__ErrorsKt$retry$3.f219564b = th;
        flowKt__ErrorsKt$retry$3.f219565c = j10;
        return flowKt__ErrorsKt$retry$3.invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f219563a;
        if (i10 == 0) {
            C4885d0.n(obj);
            Throwable th = (Throwable) this.f219564b;
            if (this.f219565c < this.f219566d) {
                ed.p<Throwable, kotlin.coroutines.e<? super Boolean>, Object> pVar = this.f219567e;
                this.f219563a = 1;
                obj = pVar.invoke(th, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        boolean z10 = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z10);
    }

    @Override // ed.r
    public /* bridge */ /* synthetic */ Object x(Object obj, Throwable th, Long l10, kotlin.coroutines.e<? super Boolean> eVar) {
        return e((f) obj, th, l10.longValue(), eVar);
    }
}
