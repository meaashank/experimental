package b0;

import android.os.Build;
import android.text.StaticLayout;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: b0.Y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(23)
public final class C2746Y implements m0 {
    @Override // b0.m0
    public boolean a(@NotNull StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return j0.a(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }

    @Override // b0.m0
    @InterfaceC4345t
    @NotNull
    public StaticLayout b(@NotNull o0 o0Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(o0Var.f120658a, o0Var.f120659b, o0Var.f120660c, o0Var.f120661d, o0Var.f120662e);
        builderObtain.setTextDirection(o0Var.f120663f);
        builderObtain.setAlignment(o0Var.f120664g);
        builderObtain.setMaxLines(o0Var.f120665h);
        builderObtain.setEllipsize(o0Var.f120666i);
        builderObtain.setEllipsizedWidth(o0Var.f120667j);
        builderObtain.setLineSpacing(o0Var.f120669l, o0Var.f120668k);
        builderObtain.setIncludePad(o0Var.f120671n);
        builderObtain.setBreakStrategy(o0Var.f120673p);
        builderObtain.setHyphenationFrequency(o0Var.f120676s);
        builderObtain.setIndents(o0Var.f120677t, o0Var.f120678u);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            a0.a(builderObtain, o0Var.f120670m);
        }
        if (i10 >= 28) {
            c0.a(builderObtain, o0Var.f120672o);
        }
        if (i10 >= 33) {
            j0.b(builderObtain, o0Var.f120674q, o0Var.f120675r);
        }
        return builderObtain.build();
    }
}
