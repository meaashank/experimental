package androidx.compose.material;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0, 0}, l = {397}, m = "animateElevation", n = {"this", "to"}, s = {"L$0", "L$1"})
public final class FloatingActionButtonElevationAnimatable$animateElevation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f96289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f96290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f96291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButtonElevationAnimatable f96292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96293e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$animateElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, kotlin.coroutines.e<? super FloatingActionButtonElevationAnimatable$animateElevation$1> eVar) {
        super(eVar);
        this.f96292d = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f96291c = obj;
        this.f96293e |= Integer.MIN_VALUE;
        return this.f96292d.b(null, this);
    }
}
