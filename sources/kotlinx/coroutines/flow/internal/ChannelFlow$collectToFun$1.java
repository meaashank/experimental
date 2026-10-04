package kotlinx.coroutines.flow.internal;

import ed.p;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelFlow$collectToFun$1<T> extends SuspendLambda implements p<q<? super T>, kotlin.coroutines.e<? super L0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f220082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChannelFlow<T> f220083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(ChannelFlow<T> channelFlow, kotlin.coroutines.e<? super ChannelFlow$collectToFun$1> eVar) {
        super(2, eVar);
        this.f220083c = channelFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.f220083c, eVar);
        channelFlow$collectToFun$1.f220082b = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f220081a;
        if (i10 == 0) {
            C4885d0.n(obj);
            q<? super T> qVar = (q) this.f220082b;
            ChannelFlow<T> channelFlow = this.f220083c;
            this.f220081a = 1;
            if (channelFlow.e(qVar, this) == coroutineSingletons) {
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

    @Override // ed.p
    @Nullable
    public final Object invoke(@NotNull q<? super T> qVar, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        return ((ChannelFlow$collectToFun$1) create(qVar, eVar)).invokeSuspend(L0.f217464a);
    }
}
