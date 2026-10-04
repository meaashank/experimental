package androidx.compose.material;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", i = {0}, l = {897}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f97670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f97671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 f97672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f97673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, kotlin.coroutines.e<? super SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1> eVar) {
        super(eVar);
        this.f97672c = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97671b = obj;
        this.f97673d |= Integer.MIN_VALUE;
        return this.f97672c.s0(0L, 0L, this);
    }
}
