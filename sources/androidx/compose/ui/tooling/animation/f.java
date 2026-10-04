package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nToolingState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolingState.android.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n81#2:41\n107#2,2:42\n*S KotlinDebug\n*F\n+ 1 ToolingState.android.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n*L\n38#1:41\n38#1:42,2\n*E\n"})
@r(parameters = 2)
public final class f<T> implements X1<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f105332b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final L0 f105333a;

    public f(T t10) {
        this.f105333a = M1.g(t10, null, 2, null);
    }

    @Override // androidx.compose.runtime.X1
    public T getValue() {
        return this.f105333a.getValue();
    }

    public void setValue(T t10) {
        this.f105333a.setValue(t10);
    }
}
