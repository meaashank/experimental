package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {304}, m = "loadWithTimeoutOrNull$ui_text_release", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
public final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f104455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f104457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, kotlin.coroutines.e<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> eVar) {
        super(eVar);
        this.f104457c = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104456b = obj;
        this.f104458d |= Integer.MIN_VALUE;
        return this.f104457c.j(null, this);
    }
}
