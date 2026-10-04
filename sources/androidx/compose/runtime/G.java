package androidx.compose.runtime;

import kotlin.InterfaceC4850b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4850b0
@androidx.compose.runtime.internal.r(parameters = 0)
public final class G implements InterfaceC1934n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99122b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.L f99123a;

    public G(@NotNull kotlinx.coroutines.L l10) {
        this.f99123a = l10;
    }

    @NotNull
    public final kotlinx.coroutines.L a() {
        return this.f99123a;
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void b() {
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void c() {
        kotlinx.coroutines.M.d(this.f99123a, new LeftCompositionCancellationException());
    }

    @Override // androidx.compose.runtime.InterfaceC1934n1
    public void d() {
        kotlinx.coroutines.M.d(this.f99123a, new LeftCompositionCancellationException());
    }
}
