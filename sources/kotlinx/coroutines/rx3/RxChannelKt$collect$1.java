package kotlinx.coroutines.rx3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nRxChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxChannel.kt\nkotlinx/coroutines/rx3/RxChannelKt$collect$1\n*L\n1#1,87:1\n*E\n"})
@Vc.d(c = "kotlinx.coroutines.rx3.RxChannelKt", f = "RxChannel.kt", i = {0, 0}, l = {95}, m = "collect", n = {"action", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
public final class RxChannelKt$collect$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f220564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f220565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f220566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f220567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f220568e;

    public RxChannelKt$collect$1(kotlin.coroutines.e<? super RxChannelKt$collect$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f220567d = obj;
        this.f220568e |= Integer.MIN_VALUE;
        return RxChannelKt.a(null, null, this);
    }
}
