package kotlinx.coroutines.reactive;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/reactive/ChannelKt$collect$1\n*L\n1#1,107:1\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.reactive.ChannelKt", f = "Channel.kt", i = {0, 0}, l = {115}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
public final class ChannelKt$collect$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f220457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f220458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f220459e;

    public ChannelKt$collect$1(kotlin.coroutines.e<? super ChannelKt$collect$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220458d = obj;
        this.f220459e |= Integer.MIN_VALUE;
        return ChannelKt.a(null, null, this);
    }
}
