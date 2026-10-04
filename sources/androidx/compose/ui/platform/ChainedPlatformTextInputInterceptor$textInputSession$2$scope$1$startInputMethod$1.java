package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", i = {}, l = {239}, m = "startInputMethod", n = {}, s = {})
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 f103460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, kotlin.coroutines.e<? super ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1> eVar) {
        super(eVar);
        this.f103460b = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f103459a = obj;
        this.f103461c |= Integer.MIN_VALUE;
        return this.f103460b.a(null, this);
    }
}
