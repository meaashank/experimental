package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.C1598m0;
import androidx.compose.ui.text.InterfaceC2358k;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Use PlatformTextInputModifierNode instead.")
@androidx.compose.runtime.internal.r(parameters = 0)
public class Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104777c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Q f104778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicReference<d0> f104779b = new AtomicReference<>(null);

    public Y(@NotNull Q q10) {
        this.f104778a = q10;
    }

    @Nullable
    public final d0 a() {
        return this.f104779b.get();
    }

    @InterfaceC4982o(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @InterfaceC4852c0(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void b() {
        this.f104778a.g();
    }

    @InterfaceC4982o(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @InterfaceC4852c0(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void c() {
        if (a() != null) {
            this.f104778a.h();
        }
    }

    @NotNull
    public d0 d(@NotNull TextFieldValue textFieldValue, @NotNull r rVar, @NotNull ed.l<? super List<? extends InterfaceC2340i>, L0> lVar, @NotNull ed.l<? super C2348q, L0> lVar2) {
        this.f104778a.d(textFieldValue, rVar, lVar, lVar2);
        d0 d0Var = new d0(this, this.f104778a);
        this.f104779b.set(d0Var);
        return d0Var;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InterfaceC2358k
    public final void e() {
        this.f104778a.e();
        this.f104779b.set(new d0(this, this.f104778a));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InterfaceC2358k
    public final void f() {
        this.f104778a.a();
    }

    public void g(@NotNull d0 d0Var) {
        if (C1598m0.a(this.f104779b, d0Var, null)) {
            this.f104778a.a();
        }
    }
}
