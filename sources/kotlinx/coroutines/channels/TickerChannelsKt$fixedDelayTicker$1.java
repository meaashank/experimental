package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {102, 104, 105}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f219161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f219162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f219163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f219164d;

    public TickerChannelsKt$fixedDelayTicker$1(kotlin.coroutines.e<? super TickerChannelsKt$fixedDelayTicker$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219163c = obj;
        this.f219164d |= Integer.MIN_VALUE;
        return TickerChannelsKt.c(0L, 0L, null, this);
    }
}
