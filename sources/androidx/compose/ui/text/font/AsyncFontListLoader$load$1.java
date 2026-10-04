package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {272, 285}, m = "load", n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
public final class AsyncFontListLoader$load$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f104444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f104445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f104446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f104449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AsyncFontListLoader f104450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f104451h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, kotlin.coroutines.e<? super AsyncFontListLoader$load$1> eVar) {
        super(eVar);
        this.f104450g = asyncFontListLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104449f = obj;
        this.f104451h |= Integer.MIN_VALUE;
        return this.f104450g.i(this);
    }
}
