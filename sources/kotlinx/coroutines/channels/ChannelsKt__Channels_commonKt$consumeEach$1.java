package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt$consumeEach$1\n*L\n1#1,104:1\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {82}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
public final class ChannelsKt__Channels_commonKt$consumeEach$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f218944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f218947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f218948e;

    public ChannelsKt__Channels_commonKt$consumeEach$1(kotlin.coroutines.e<? super ChannelsKt__Channels_commonKt$consumeEach$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f218947d = obj;
        this.f218948e |= Integer.MIN_VALUE;
        return ChannelsKt__Channels_commonKt.c(null, null, this);
    }
}
