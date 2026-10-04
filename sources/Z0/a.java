package Z0;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f79391a;

    @T(26)
    public a(@NonNull AutofillId autofillId) {
        this.f79391a = autofillId;
    }

    @NonNull
    @T(26)
    public static a b(@NonNull AutofillId autofillId) {
        return new a(autofillId);
    }

    @NonNull
    @T(26)
    public AutofillId a() {
        return Y.a.a(this.f79391a);
    }
}
