package kotlinx.coroutines.flow;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__MigrationKt$onErrorReturn$2<T> extends SuspendLambda implements ed.q<f<? super T>, Throwable, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed.l<Throwable, Boolean> f219681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f219682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__MigrationKt$onErrorReturn$2(ed.l<? super Throwable, Boolean> lVar, T t10, kotlin.coroutines.e<? super FlowKt__MigrationKt$onErrorReturn$2> eVar) {
        super(3, eVar);
        this.f219681d = lVar;
        this.f219682e = t10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f219678a;
        if (i10 == 0) {
            C4885d0.n(obj);
            f fVar = (f) this.f219679b;
            Throwable th = (Throwable) this.f219680c;
            if (!this.f219681d.invoke(th).booleanValue()) {
                throw th;
            }
            T t10 = this.f219682e;
            this.f219679b = null;
            this.f219678a = 1;
            if (fVar.emit(t10, this) == coroutineSingletons) {
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

    @Override // ed.q
    @Nullable
    public final Object invoke(@NotNull f<? super T> fVar, @NotNull Throwable th, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.f219681d, this.f219682e, eVar);
        flowKt__MigrationKt$onErrorReturn$2.f219679b = fVar;
        flowKt__MigrationKt$onErrorReturn$2.f219680c = th;
        return flowKt__MigrationKt$onErrorReturn$2.invokeSuspend(L0.f217464a);
    }
}
