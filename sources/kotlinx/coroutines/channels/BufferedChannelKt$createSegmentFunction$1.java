package kotlinx.coroutines.channels;

import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1<E> extends FunctionReferenceImpl implements ed.p<Long, k<E>, k<E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BufferedChannelKt$createSegmentFunction$1 f218933a = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @NotNull
    public final k<E> e(long j10, @NotNull k<E> kVar) {
        return BufferedChannelKt.x(j10, kVar);
    }

    @Override // ed.p
    public Object invoke(Long l10, Object obj) {
        return BufferedChannelKt.x(l10.longValue(), (k) obj);
    }
}
