package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f219399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f219400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f219401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f219402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f219403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f219404f;

    public FlowKt__ChannelsKt$emitAllImpl$1(kotlin.coroutines.e<? super FlowKt__ChannelsKt$emitAllImpl$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219403e = obj;
        this.f219404f |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.e(null, null, false, this);
    }
}
