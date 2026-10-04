package kotlinx.coroutines.channels;

import kotlin.C4987s;
import kotlin.L0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
public final class ChannelsKt__DeprecatedKt$consumesAll$1 extends Lambda implements ed.l<Throwable, L0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ReceiveChannel<?>[] f218964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$consumesAll$1(ReceiveChannel<?>[] receiveChannelArr) {
        super(1);
        this.f218964d = receiveChannelArr;
    }

    public final void e(@Nullable Throwable th) throws Throwable {
        Throwable th2 = null;
        for (ReceiveChannel<?> receiveChannel : this.f218964d) {
            try {
                ChannelsKt__Channels_commonKt.a(receiveChannel, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    C4987s.a(th2, th3);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ L0 invoke(Throwable th) throws Throwable {
        e(th);
        return L0.f217464a;
    }
}
