package O;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T(26)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f65119a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65120b = 0;

    @T(26)
    @InterfaceC4345t
    @Nullable
    public final AutofillId a(@NotNull ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    @T(26)
    @InterfaceC4345t
    public final boolean b(@NotNull AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    @T(26)
    @InterfaceC4345t
    public final boolean c(@NotNull AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    @T(26)
    @InterfaceC4345t
    public final boolean d(@NotNull AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    @T(26)
    @InterfaceC4345t
    public final boolean e(@NotNull AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    @T(26)
    @InterfaceC4345t
    public final void f(@NotNull ViewStructure viewStructure, @NotNull String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    @T(26)
    @InterfaceC4345t
    public final void g(@NotNull ViewStructure viewStructure, @NotNull AutofillId autofillId, int i10) {
        viewStructure.setAutofillId(autofillId, i10);
    }

    @T(26)
    @InterfaceC4345t
    public final void h(@NotNull ViewStructure viewStructure, int i10) {
        viewStructure.setAutofillType(i10);
    }

    @T(26)
    @InterfaceC4345t
    @NotNull
    public final CharSequence i(@NotNull AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
