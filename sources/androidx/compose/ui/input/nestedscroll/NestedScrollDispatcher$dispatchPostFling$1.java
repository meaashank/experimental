package androidx.compose.ui.input.nestedscroll;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {DefaultImageHeaderParser.f139853j}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
public final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f102113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NestedScrollDispatcher f102114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f102115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, kotlin.coroutines.e<? super NestedScrollDispatcher$dispatchPostFling$1> eVar) {
        super(eVar);
        this.f102114b = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f102113a = obj;
        this.f102115c |= Integer.MIN_VALUE;
        return this.f102114b.a(0L, 0L, this);
    }
}
