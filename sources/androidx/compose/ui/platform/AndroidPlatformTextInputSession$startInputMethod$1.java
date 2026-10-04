package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", i = {}, l = {73}, m = "startInputMethod", n = {}, s = {})
public final class AndroidPlatformTextInputSession$startInputMethod$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidPlatformTextInputSession f103380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$1(AndroidPlatformTextInputSession androidPlatformTextInputSession, kotlin.coroutines.e<? super AndroidPlatformTextInputSession$startInputMethod$1> eVar) {
        super(eVar);
        this.f103380b = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f103379a = obj;
        this.f103381c |= Integer.MIN_VALUE;
        return this.f103380b.a(null, this);
    }
}
