package androidx.compose.foundation.text;

import androidx.compose.runtime.C1968u;
import androidx.compose.runtime.InterfaceC1917i;
import androidx.compose.runtime.InterfaceC1920j;
import androidx.compose.runtime.InterfaceC1946s;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ComposableSingletons$CoreTextFieldKt f93068a = new ComposableSingletons$CoreTextFieldKt();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static ed.q<ed.p<? super InterfaceC1946s, ? super Integer, L0>, InterfaceC1946s, Integer, L0> f93069b = new ComposableLambdaImpl(671295101, false, new ed.q<ed.p<? super InterfaceC1946s, ? super Integer, ? extends L0>, InterfaceC1946s, Integer, L0>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @InterfaceC1920j(scheme = "[0[0]]")
        @InterfaceC1917i
        public final void e(@NotNull ed.p<? super InterfaceC1946s, ? super Integer, L0> pVar, @Nullable InterfaceC1946s interfaceC1946s, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC1946s.c0(pVar) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC1946s.c()) {
                interfaceC1946s.o();
                return;
            }
            if (C1968u.c0()) {
                C1968u.p0(671295101, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
            }
            pVar.invoke(interfaceC1946s, Integer.valueOf(i10 & 14));
            if (C1968u.c0()) {
                C1968u.o0();
            }
        }

        @Override // ed.q
        public /* bridge */ /* synthetic */ L0 invoke(ed.p<? super InterfaceC1946s, ? super Integer, ? extends L0> pVar, InterfaceC1946s interfaceC1946s, Integer num) {
            e(pVar, interfaceC1946s, num.intValue());
            return L0.f217464a;
        }
    });

    @NotNull
    public final ed.q<ed.p<? super InterfaceC1946s, ? super Integer, L0>, InterfaceC1946s, Integer, L0> a() {
        return f93069b;
    }
}
