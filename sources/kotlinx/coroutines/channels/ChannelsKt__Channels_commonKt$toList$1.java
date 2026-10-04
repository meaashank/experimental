package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {112}, m = "toList", n = {"$this$toList_u24lambda_u243", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
public final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f218949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f218950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f218951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f218952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f218953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f218954f;

    public ChannelsKt__Channels_commonKt$toList$1(kotlin.coroutines.e<? super ChannelsKt__Channels_commonKt$toList$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f218953e = obj;
        this.f218954f |= Integer.MIN_VALUE;
        return ChannelsKt__Channels_commonKt.g(null, this);
    }
}
