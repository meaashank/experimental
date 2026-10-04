package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.K0;
import androidx.compose.ui.graphics.C2086n2;
import androidx.compose.ui.layout.InterfaceC2188x;
import androidx.compose.ui.text.input.C2348q;
import androidx.compose.ui.text.input.InterfaceC2340i;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLegacyPlatformTextInputServiceAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class AndroidLegacyPlatformTextInputServiceAdapter extends K0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f93613f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.A0 f93614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public LegacyTextInputMethodRequest f93615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public kotlinx.coroutines.flow.i<kotlin.L0> f93616e;

    public static final void r(K0.a aVar, float[] fArr) {
        InterfaceC2188x interfaceC2188xK = aVar.K();
        if (interfaceC2188xK != null) {
            if (!interfaceC2188xK.H()) {
                interfaceC2188xK = null;
            }
            if (interfaceC2188xK == null) {
                return;
            }
            interfaceC2188xK.u0(fArr);
        }
    }

    @Override // androidx.compose.ui.text.input.Q
    public void a() {
        kotlinx.coroutines.A0 a02 = this.f93614c;
        if (a02 != null) {
            A0.a.b(a02, null, 1, null);
        }
        this.f93614c = null;
        kotlinx.coroutines.flow.i<kotlin.L0> iVarP = p();
        if (iVarP != null) {
            iVarP.h();
        }
    }

    @Override // androidx.compose.ui.text.input.Q
    public void b(@Nullable TextFieldValue textFieldValue, @NotNull TextFieldValue textFieldValue2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f93615d;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.p(textFieldValue, textFieldValue2);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.K0, androidx.compose.ui.text.input.Q
    public void c(@NotNull TextFieldValue textFieldValue, @NotNull androidx.compose.ui.text.input.L l10, @NotNull androidx.compose.ui.text.S s10, @NotNull ed.l<? super C2086n2, kotlin.L0> lVar, @NotNull P.j jVar, @NotNull P.j jVar2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f93615d;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.q(textFieldValue, l10, s10, jVar, jVar2);
        }
    }

    @Override // androidx.compose.ui.text.input.Q
    public void d(@NotNull final TextFieldValue textFieldValue, @NotNull final androidx.compose.ui.text.input.r rVar, @NotNull final ed.l<? super List<? extends InterfaceC2340i>, kotlin.L0> lVar, @NotNull final ed.l<? super C2348q, kotlin.L0> lVar2) {
        q(new ed.l<LegacyTextInputMethodRequest, kotlin.L0>() { // from class: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void e(@NotNull LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
                legacyTextInputMethodRequest.o(textFieldValue, this.f93752a, rVar, lVar, lVar2);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
                e(legacyTextInputMethodRequest);
                return kotlin.L0.f217464a;
            }
        });
    }

    @Override // androidx.compose.foundation.text.input.internal.K0, androidx.compose.ui.text.input.Q
    public void e() {
        q(null);
    }

    @Override // androidx.compose.foundation.text.input.internal.K0, androidx.compose.ui.text.input.Q
    public void f(@NotNull P.j jVar) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f93615d;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.l(jVar);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.K0
    public void k() {
        kotlinx.coroutines.flow.i<kotlin.L0> iVarP = p();
        if (iVarP != null) {
            iVarP.i(kotlin.L0.f217464a);
        }
    }

    public final kotlinx.coroutines.flow.i<kotlin.L0> p() {
        kotlinx.coroutines.flow.i<kotlin.L0> iVar = this.f93616e;
        if (iVar != null) {
            return iVar;
        }
        if (!androidx.compose.foundation.text.handwriting.d.a()) {
            return null;
        }
        kotlinx.coroutines.flow.i<kotlin.L0> iVarB = kotlinx.coroutines.flow.o.b(1, 0, BufferOverflow.DROP_LATEST, 2, null);
        this.f93616e = iVarB;
        return iVarB;
    }

    public final void q(ed.l<? super LegacyTextInputMethodRequest, kotlin.L0> lVar) {
        K0.a aVar = this.f93752a;
        if (aVar == null) {
            return;
        }
        this.f93614c = aVar.B0(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(lVar, this, aVar, null));
    }
}
