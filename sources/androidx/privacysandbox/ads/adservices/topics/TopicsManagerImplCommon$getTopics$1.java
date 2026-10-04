package androidx.privacysandbox.ads.adservices.topics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Vc.d(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", i = {}, l = {22}, m = "getTopics$suspendImpl", n = {}, s = {})
public final class TopicsManagerImplCommon$getTopics$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f116131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TopicsManagerImplCommon f116133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManagerImplCommon$getTopics$1(TopicsManagerImplCommon topicsManagerImplCommon, kotlin.coroutines.e<? super TopicsManagerImplCommon$getTopics$1> eVar) {
        super(eVar);
        this.f116133c = topicsManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f116132b = obj;
        this.f116134d |= Integer.MIN_VALUE;
        return TopicsManagerImplCommon.g(this.f116133c, null, this);
    }
}
