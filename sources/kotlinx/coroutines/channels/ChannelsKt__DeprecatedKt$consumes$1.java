package kotlinx.coroutines.channels;

import kotlin.L0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class ChannelsKt__DeprecatedKt$consumes$1 extends Lambda implements ed.l<Throwable, L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReceiveChannel<?> f218963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$consumes$1(ReceiveChannel<?> receiveChannel) {
        super(1);
        this.f218963d = receiveChannel;
    }

    public final void e(@Nullable Throwable th) {
        ChannelsKt__Channels_commonKt.a(this.f218963d, th);
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ L0 invoke(Throwable th) {
        e(th);
        return L0.f217464a;
    }
}
