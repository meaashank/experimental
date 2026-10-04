package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {61}, m = "scrollBy", n = {"consumed"}, s = {"L$0"})
public final class ScrollExtensionsKt$scrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f89698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f89699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89700c;

    public ScrollExtensionsKt$scrollBy$1(kotlin.coroutines.e<? super ScrollExtensionsKt$scrollBy$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89699b = obj;
        this.f89700c |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.c(null, 0.0f, this);
    }
}
