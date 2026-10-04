package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.platform.G1;
import androidx.compose.ui.platform.InterfaceC2285u1;
import androidx.compose.ui.text.input.TextFieldValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLegacyPlatformTextInputServiceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.kt\nandroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public abstract class K0 implements androidx.compose.ui.text.input.Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f93751b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f93752a;

    public interface a {
        @Nullable
        kotlinx.coroutines.A0 B0(@NotNull ed.p<? super androidx.compose.ui.platform.G0, ? super kotlin.coroutines.e<?>, ? extends Object> pVar);

        @Nullable
        InterfaceC2188x K();

        @Nullable
        InterfaceC2285u1 R();

        @NotNull
        G1 c();

        @Nullable
        TextFieldSelectionManager c1();

        @Nullable
        LegacyTextFieldState p1();
    }

    @Override // androidx.compose.ui.text.input.Q
    public /* synthetic */ void c(TextFieldValue textFieldValue, androidx.compose.ui.text.input.L l10, androidx.compose.ui.text.S s10, ed.l lVar, P.j jVar, P.j jVar2) {
    }

    @Override // androidx.compose.ui.text.input.Q
    public /* synthetic */ void e() {
    }

    @Override // androidx.compose.ui.text.input.Q
    public /* synthetic */ void f(P.j jVar) {
    }

    @Override // androidx.compose.ui.text.input.Q
    public final void g() {
        InterfaceC2285u1 interfaceC2285u1R;
        a aVar = this.f93752a;
        if (aVar == null || (interfaceC2285u1R = aVar.R()) == null) {
            return;
        }
        interfaceC2285u1R.hide();
    }

    @Override // androidx.compose.ui.text.input.Q
    public final void h() {
        InterfaceC2285u1 interfaceC2285u1R;
        a aVar = this.f93752a;
        if (aVar == null || (interfaceC2285u1R = aVar.R()) == null) {
            return;
        }
        interfaceC2285u1R.show();
    }

    @Nullable
    public final a i() {
        return this.f93752a;
    }

    public final void j(@NotNull a aVar) {
        if (this.f93752a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        this.f93752a = aVar;
    }

    public abstract void k();

    public final void l(@NotNull a aVar) {
        if (this.f93752a == aVar) {
            this.f93752a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + aVar + " but was " + this.f93752a).toString());
    }
}
