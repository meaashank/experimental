package androidx.compose.ui.input.pointer;

import kotlin.L0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
@androidx.compose.ui.i
public final class S implements ed.l<Boolean, L0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f102236b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public PointerInteropFilter f102237a;

    @Nullable
    public final PointerInteropFilter e() {
        return this.f102237a;
    }

    public void g(boolean z10) {
        PointerInteropFilter pointerInteropFilter = this.f102237a;
        if (pointerInteropFilter == null) {
            return;
        }
        pointerInteropFilter.f102216c = z10;
    }

    public final void h(@Nullable PointerInteropFilter pointerInteropFilter) {
        this.f102237a = pointerInteropFilter;
    }

    @Override // ed.l
    public /* bridge */ /* synthetic */ L0 invoke(Boolean bool) {
        g(bool.booleanValue());
        return L0.f217464a;
    }
}
