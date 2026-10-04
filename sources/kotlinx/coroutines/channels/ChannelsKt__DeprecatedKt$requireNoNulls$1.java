package kotlinx.coroutines.channels;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelsKt__DeprecatedKt$requireNoNulls$1 extends SuspendLambda implements ed.p<Object, kotlin.coroutines.e<Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReceiveChannel<Object> f219099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$requireNoNulls$1(ReceiveChannel<Object> receiveChannel, kotlin.coroutines.e<? super ChannelsKt__DeprecatedKt$requireNoNulls$1> eVar) {
        super(2, eVar);
        this.f219099c = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        ChannelsKt__DeprecatedKt$requireNoNulls$1 channelsKt__DeprecatedKt$requireNoNulls$1 = new ChannelsKt__DeprecatedKt$requireNoNulls$1(this.f219099c, eVar);
        channelsKt__DeprecatedKt$requireNoNulls$1.f219098b = obj;
        return channelsKt__DeprecatedKt$requireNoNulls$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@Nullable Object obj, @Nullable kotlin.coroutines.e<Object> eVar) {
        return ((ChannelsKt__DeprecatedKt$requireNoNulls$1) create(obj, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.f219097a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C4885d0.n(obj);
        Object obj2 = this.f219098b;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalArgumentException("null element found in " + this.f219099c + '.');
    }
}
