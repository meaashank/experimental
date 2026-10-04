package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {80, 84, 90, 92}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
public final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f219165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f219166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f219167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f219168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f219169e;

    public TickerChannelsKt$fixedPeriodTicker$1(kotlin.coroutines.e<? super TickerChannelsKt$fixedPeriodTicker$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f219168d = obj;
        this.f219169e |= Integer.MIN_VALUE;
        return TickerChannelsKt.d(0L, 0L, null, this);
    }
}
