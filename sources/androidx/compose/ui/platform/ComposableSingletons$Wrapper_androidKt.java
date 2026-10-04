package androidx.compose.ui.platform;

import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$Wrapper_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableSingletons$Wrapper_androidKt f103472a = new ComposableSingletons$Wrapper_androidKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static ed.p<InterfaceC1946s, Integer, kotlin.L0> f103473b = new ComposableLambdaImpl(-1759434350, false, new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda-1$1
        @InterfaceC1917i
        public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(-1759434350, i10, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:120)");
            }
            if (C1968u.c0()) {
                C1968u.o0();
            }
        }

        @Override // ed.p
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(InterfaceC1946s interfaceC1946s, Integer num) {
            e(interfaceC1946s, num.intValue());
            return kotlin.L0.f217464a;
        }
    });

    @NotNull
    public final ed.p<InterfaceC1946s, Integer, kotlin.L0> a() {
        return f103473b;
    }
}
