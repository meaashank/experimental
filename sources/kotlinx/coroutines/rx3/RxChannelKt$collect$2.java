package kotlinx.coroutines.rx3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nRxChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxChannel.kt\nkotlinx/coroutines/rx3/RxChannelKt$collect$2\n*L\n1#1,87:1\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.rx3.RxChannelKt", f = "RxChannel.kt", i = {0, 0}, l = {95}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
public final class RxChannelKt$collect$2<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f220571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f220572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f220573e;

    public RxChannelKt$collect$2(kotlin.coroutines.e<? super RxChannelKt$collect$2> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220572d = obj;
        this.f220573e |= Integer.MIN_VALUE;
        return RxChannelKt.b(null, null, this);
    }
}
