package androidx.compose.material;

import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1926l;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$BackdropScaffoldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableSingletons$BackdropScaffoldKt f95919a = new ComposableSingletons$BackdropScaffoldKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static ed.q<SnackbarHostState, InterfaceC1946s, Integer, kotlin.L0> f95920b = new ComposableLambdaImpl(-1054097158, false, new ed.q<SnackbarHostState, InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$lambda-1$1
        @InterfaceC1917i
        @InterfaceC1926l(applier = "androidx.compose.ui.UiComposable")
        public final void e(@NotNull SnackbarHostState snackbarHostState, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC1946s.x(snackbarHostState) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(-1054097158, i10, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda-1.<anonymous> (BackdropScaffold.kt:373)");
            }
            SnackbarHostKt.b(snackbarHostState, null, null, interfaceC1946s, i10 & 14, 6);
            if (C1968u.c0()) {
                C1968u.o0();
            }
        }

        @Override // ed.q
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(SnackbarHostState snackbarHostState, InterfaceC1946s interfaceC1946s, Integer num) {
            e(snackbarHostState, interfaceC1946s, num.intValue());
            return kotlin.L0.f217464a;
        }
    });

    @NotNull
    public final ed.q<SnackbarHostState, InterfaceC1946s, Integer, kotlin.L0> a() {
        return f95920b;
    }
}
