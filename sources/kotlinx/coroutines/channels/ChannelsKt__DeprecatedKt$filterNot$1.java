package kotlinx.coroutines.channels;

import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelsKt__DeprecatedKt$filterNot$1 extends SuspendLambda implements ed.p<Object, kotlin.coroutines.e<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f219016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f219017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ed.p<Object, kotlin.coroutines.e<? super Boolean>, Object> f219018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$filterNot$1(ed.p<Object, ? super kotlin.coroutines.e<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.e<? super ChannelsKt__DeprecatedKt$filterNot$1> eVar) {
        super(2, eVar);
        this.f219018c = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final kotlin.coroutines.e<L0> create(@Nullable Object obj, @NotNull kotlin.coroutines.e<?> eVar) {
        ChannelsKt__DeprecatedKt$filterNot$1 channelsKt__DeprecatedKt$filterNot$1 = new ChannelsKt__DeprecatedKt$filterNot$1(this.f219018c, eVar);
        channelsKt__DeprecatedKt$filterNot$1.f219017b = obj;
        return channelsKt__DeprecatedKt$filterNot$1;
    }

    @Override // ed.p
    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Object obj, @Nullable kotlin.coroutines.e<? super Boolean> eVar) {
        return ((ChannelsKt__DeprecatedKt$filterNot$1) create(obj, eVar)).invokeSuspend(L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f219016a;
        if (i10 == 0) {
            C4885d0.n(obj);
            Object obj2 = this.f219017b;
            ed.p<Object, kotlin.coroutines.e<? super Boolean>, Object> pVar = this.f219018c;
            this.f219016a = 1;
            obj = pVar.invoke(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }
}
