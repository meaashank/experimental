package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0}, l = {398}, m = "runCached", n = {"this", "key", "forever"}, s = {"L$0", "L$1", "Z$0"})
public final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f104471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f104472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f104474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AsyncTypefaceCache f104475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f104476f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.e<? super AsyncTypefaceCache$runCached$1> eVar) {
        super(eVar);
        this.f104475e = asyncTypefaceCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104474d = obj;
        this.f104476f |= Integer.MIN_VALUE;
        return this.f104475e.g(null, null, false, null, this);
    }
}
