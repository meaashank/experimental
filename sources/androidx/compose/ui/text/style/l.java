package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.K0;
import androidx.compose.ui.graphics.M0;
import androidx.compose.ui.text.SpanStyleKt;
import ed.InterfaceC4376a;
import n0.C5238e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.j(name = "TextDrawStyleKt")
public final class l {
    @NotNull
    public static final m b(@NotNull m mVar, @NotNull m mVar2, float f10) {
        boolean z10 = mVar instanceof c;
        return (z10 || (mVar2 instanceof c)) ? (z10 && (mVar2 instanceof c)) ? m.f105031a.a((AbstractC2131z0) SpanStyleKt.d(((c) mVar).f104957b, ((c) mVar2).f104957b, f10), C5238e.j(((c) mVar).f104958c, ((c) mVar2).f104958c, f10)) : (m) SpanStyleKt.d(mVar, mVar2, f10) : m.f105031a.b(M0.q(mVar.a(), mVar2.a(), f10));
    }

    public static final long c(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : K0.w(j10, K0.A(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final float d(float f10, InterfaceC4376a<Float> interfaceC4376a) {
        return Float.isNaN(f10) ? interfaceC4376a.invoke().floatValue() : f10;
    }
}
