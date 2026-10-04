package androidx.compose.material;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", i = {0}, l = {718}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
public final class BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f95502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 f95504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1(BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, kotlin.coroutines.e<? super BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1> eVar) {
        super(eVar);
        this.f95504c = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f95503b = obj;
        this.f95505d |= Integer.MIN_VALUE;
        return this.f95504c.s0(0L, 0L, this);
    }
}
