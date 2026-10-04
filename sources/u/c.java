package U;

import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.i;
import ed.l;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:78\n72#1:79,2\n*E\n"})
@r(parameters = 1)
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f68371c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l<a, Boolean> f68372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final L0 f68373b;

    public /* synthetic */ c(int i10, l lVar, C4969v c4969v) {
        this(i10, lVar);
    }

    @Override // U.b
    @i
    public boolean a(int i10) {
        return this.f68372a.invoke(new a(i10)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // U.b
    public int b() {
        return ((a) this.f68373b.getValue()).f68370a;
    }

    public void c(int i10) {
        this.f68373b.setValue(new a(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i10, l<? super a, Boolean> lVar) {
        this.f68372a = lVar;
        this.f68373b = M1.g(new a(i10), null, 2, null);
    }
}
