package androidx.compose.ui.tooling;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import ed.p;
import k0.C4812c;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$PreviewActivity_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableSingletons$PreviewActivity_androidKt f105091a = new ComposableSingletons$PreviewActivity_androidKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static p<InterfaceC1946s, Integer, L0> f105092b = new ComposableLambdaImpl(-426398407, false, new p<InterfaceC1946s, Integer, L0>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt$lambda-1$1
        @InterfaceC1917i
        public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(-426398407, i10, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.lambda-1.<anonymous> (PreviewActivity.android.kt:124)");
            }
            TextKt.e("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC1946s, 6, 0, C4812c.f214295k);
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
        return f105092b;
    }
}
