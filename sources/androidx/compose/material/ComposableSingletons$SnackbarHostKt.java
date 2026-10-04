package androidx.compose.material;

import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1926l;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableSingletons$SnackbarHostKt f95946a = new ComposableSingletons$SnackbarHostKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static ed.q<y0, InterfaceC1946s, Integer, kotlin.L0> f95947b = new ComposableLambdaImpl(996639038, false, new ed.q<y0, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @InterfaceC1917i
        @InterfaceC1926l(applier = "androidx.compose.ui.UiComposable")
        public final void e(@NotNull y0 y0Var, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? interfaceC1946s.x(y0Var) : interfaceC1946s.c0(y0Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(996639038, i11, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
            }
            SnackbarKt.d(y0Var, null, false, null, 0L, 0L, 0L, 0.0f, interfaceC1946s, i11 & 14, f3.d.f200563l);
            if (C1968u.c0()) {
                C1968u.o0();
            }
        }

        @Override // ed.q
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(y0 y0Var, InterfaceC1946s interfaceC1946s, Integer num) {
            e(y0Var, interfaceC1946s, num.intValue());
            return kotlin.L0.f217464a;
        }
    });

    @NotNull
    public final ed.q<y0, InterfaceC1946s, Integer, kotlin.L0> a() {
        return f95947b;
    }
}
