package androidx.compose.ui.window;

import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import ed.p;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$AndroidDialog_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableSingletons$AndroidDialog_androidKt f105682a = new ComposableSingletons$AndroidDialog_androidKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static p<InterfaceC1946s, Integer, L0> f105683b = new ComposableLambdaImpl(210148896, false, new p<InterfaceC1946s, Integer, L0>() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt$lambda-1$1
        @InterfaceC1917i
        public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(210148896, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda-1.<anonymous> (AndroidDialog.android.kt:227)");
            }
            if (C1968u.c0()) {
                C1968u.o0();
            }
        }

        @Override // ed.p
        public /* bridge */ /* synthetic */ L0 invoke(InterfaceC1946s interfaceC1946s, Integer num) {
            e(interfaceC1946s, num.intValue());
            return L0.f217464a;
        }
    });

    @NotNull
    public final p<InterfaceC1946s, Integer, L0> a() {
        return f105683b;
    }
}
