package Y;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.T;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f79087a;

    @T(26)
    public b(@NonNull AutofillId autofillId) {
        this.f79087a = autofillId;
    }

    @NonNull
    @T(26)
    public static b b(@NonNull AutofillId autofillId) {
        return new b(autofillId);
    }

    @NonNull
    @T(26)
    public AutofillId a() {
        return a.a(this.f79087a);
    }
}
