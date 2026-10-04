package androidx.compose.ui.text.font;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", f = "FontFamilyResolver.kt", i = {0, 0}, l = {45}, m = "preload", n = {"this", "fontFamily"}, s = {"L$0", "L$1"})
public final class FontFamilyResolverImpl$preload$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f104492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f104493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f104494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FontFamilyResolverImpl f104495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$1(FontFamilyResolverImpl fontFamilyResolverImpl, kotlin.coroutines.e<? super FontFamilyResolverImpl$preload$1> eVar) {
        super(eVar);
        this.f104495d = fontFamilyResolverImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f104494c = obj;
        this.f104496e |= Integer.MIN_VALUE;
        return this.f104495d.a(null, this);
    }
}
