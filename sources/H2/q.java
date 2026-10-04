package H2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public q() {
    }

    @NonNull
    public abstract CharSequence a();

    public abstract int b();
}
