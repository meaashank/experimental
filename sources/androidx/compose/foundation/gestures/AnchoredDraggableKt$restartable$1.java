package androidx.compose.foundation.gestures;

import com.cookiegames.smartcookie.browser.activity.BrowserActivity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {BrowserActivity.f140780s0}, m = "restartable", n = {}, s = {})
public final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f89153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89154b;

    public AnchoredDraggableKt$restartable$1(kotlin.coroutines.e<? super AnchoredDraggableKt$restartable$1> eVar) {
        super(eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f89153a = obj;
        this.f89154b |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.u(null, null, this);
    }
}
