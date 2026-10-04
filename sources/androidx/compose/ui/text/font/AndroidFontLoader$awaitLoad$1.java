package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {57, 58}, m = "awaitLoad", n = {"this", "font"}, s = {"L$0", "L$1"})
public final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f104431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f104432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f104433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AndroidFontLoader f104434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, kotlin.coroutines.e<? super AndroidFontLoader$awaitLoad$1> eVar) {
        super(eVar);
        this.f104434d = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104433c = obj;
        this.f104435e |= Integer.MIN_VALUE;
        return this.f104434d.b(null, this);
    }
}
