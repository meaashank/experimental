package androidx.compose.material;

import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1926l;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$TabRowKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableSingletons$TabRowKt f95949a = new ComposableSingletons$TabRowKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static ed.p<InterfaceC1946s, Integer, kotlin.L0> f95950b = new ComposableLambdaImpl(182187156, false, new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-1$1
        @InterfaceC1917i
        @InterfaceC1926l(applier = "androidx.compose.ui.UiComposable")
        public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(182187156, i10, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-1.<anonymous> (TabRow.kt:146)");
            }
            TabRowDefaults.f97924a.a(null, 0.0f, 0L, interfaceC1946s, 3072, 7);
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

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static ed.p<InterfaceC1946s, Integer, kotlin.L0> f95951c = new ComposableLambdaImpl(-1480449365, false, new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-2$1
        @InterfaceC1917i
        @InterfaceC1926l(applier = "androidx.compose.ui.UiComposable")
        public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(-1480449365, i10, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-2.<anonymous> (TabRow.kt:241)");
            }
            TabRowDefaults.f97924a.a(null, 0.0f, 0L, interfaceC1946s, 3072, 7);
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
        return f95950b;
    }

    @NotNull
    public final ed.p<InterfaceC1946s, Integer, kotlin.L0> b() {
        return f95951c;
    }
}
