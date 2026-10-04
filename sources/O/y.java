package O;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T(26)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class y extends AutofillManager$AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y f65121a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65122b = 0;

    @InterfaceC4345t
    @androidx.compose.ui.i
    public final void a(@NotNull f fVar) {
        fVar.f65115c.registerCallback(v.a(this));
    }

    @InterfaceC4345t
    @androidx.compose.ui.i
    public final void b(@NotNull f fVar) {
        fVar.f65115c.unregisterCallback(v.a(this));
    }

    public void onAutofillEvent(@NotNull View view, int i10, int i11) {
        super.onAutofillEvent(view, i10, i11);
        Log.d("Autofill Status", i11 != 1 ? i11 != 2 ? i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
