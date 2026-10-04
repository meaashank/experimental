package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.InterfaceC1798o;
import androidx.compose.runtime.X1;
import androidx.compose.ui.focus.C1987b;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.FlowKt__CollectKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SecureTextFieldController {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f93395f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X1<Character> f93396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C1829s f93397b = new C1829s(new SecureTextFieldController$passwordInputTransformation$1(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC1798o f93398c = new InterfaceC1798o() { // from class: androidx.compose.foundation.text.t
        @Override // androidx.compose.foundation.text.input.internal.InterfaceC1798o
        public final int a(int i10, int i11) {
            return SecureTextFieldController.c(this.f95047b, i10, i11);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final androidx.compose.ui.p f93399d = C1987b.a(androidx.compose.ui.p.f103112M2, new ed.l<androidx.compose.ui.focus.H, L0>() { // from class: androidx.compose.foundation.text.SecureTextFieldController$focusChangeModifier$1
        {
            super(1);
        }

        public final void e(@NotNull androidx.compose.ui.focus.H h10) {
            if (h10.isFocused()) {
                return;
            }
            this.f93401d.f93397b.d(-1);
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ L0 invoke(androidx.compose.ui.focus.H h10) {
            e(h10);
            return L0.f217464a;
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.channels.g<L0> f93400e = kotlinx.coroutines.channels.i.d(Integer.MAX_VALUE, null, null, 6, null);

    public SecureTextFieldController(@NotNull X1<Character> x12) {
        this.f93396a = x12;
    }

    public static final int c(SecureTextFieldController secureTextFieldController, int i10, int i11) {
        return i10 == secureTextFieldController.f93397b.f94627c.getIntValue() ? i11 : secureTextFieldController.f93396a.getValue().charValue();
    }

    @NotNull
    public final InterfaceC1798o d() {
        return this.f93398c;
    }

    @NotNull
    public final androidx.compose.ui.p e() {
        return this.f93399d;
    }

    @NotNull
    public final C1829s f() {
        return this.f93397b;
    }

    @Nullable
    public final Object g(@NotNull kotlin.coroutines.e<? super L0> eVar) {
        Object objF = FlowKt__CollectKt.f(FlowKt__ChannelsKt.c(this.f93400e), new SecureTextFieldController$observeHideEvents$2(this, null), eVar);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : L0.f217464a;
    }

    public final void h() {
        if (this.f93400e.t(L0.f217464a) instanceof j.c) {
            this.f93397b.d(-1);
        }
    }
}
