package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$CompositionKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableSingletons$CompositionKt f99003a = new ComposableSingletons$CompositionKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static ed.p<InterfaceC1946s, Integer, kotlin.L0> f99004b = new ComposableLambdaImpl(954879418, false, new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-1$1
        @InterfaceC1917i
        public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:623)");
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

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static ed.p<InterfaceC1946s, Integer, kotlin.L0> f99005c = new ComposableLambdaImpl(1918065384, false, new ed.p<InterfaceC1946s, Integer, kotlin.L0>() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-2$1
        @InterfaceC1917i
        public final void e(@Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 3) == 2 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:757)");
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
        return f99004b;
    }

    @NotNull
    public final ed.p<InterfaceC1946s, Integer, kotlin.L0> b() {
        return f99005c;
    }
}
