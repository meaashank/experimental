package H2;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.InterfaceC4330d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4330d
public abstract class l {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface a {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public l() {
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    @NonNull
    public abstract Set<String> e();

    public abstract void f(boolean z10);

    public abstract void g(boolean z10);

    public abstract void h(boolean z10);

    public abstract void i(int i10);

    public abstract void j(@NonNull Set<String> set);
}
