package androidx.compose.foundation.layout;

import com.android.launcher3.LauncherAnimUtils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Vc.d(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {LauncherAnimUtils.ALL_APPS_TRANSITION_MS, 346, 371}, m = "fling-huYlsQE", n = {"this", "available", "flingAmount", "this", "endVelocity", "available", "this", "available"}, s = {"L$0", "J$0", "F$0", "L$0", "L$1", "J$0", "L$0", "J$0"})
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f90770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f90771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f90772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f90773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f90774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsNestedScrollConnection f90775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f90776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, kotlin.coroutines.e<? super WindowInsetsNestedScrollConnection$fling$1> eVar) {
        super(eVar);
        this.f90775f = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f90774e = obj;
        this.f90776g |= Integer.MIN_VALUE;
        return this.f90775f.l(0L, 0.0f, false, this);
    }
}
