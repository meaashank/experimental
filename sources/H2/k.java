package H2;

import I2.C1200s0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4330d;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4330d
public abstract class k {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f45454a = new C1200s0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public k() {
    }

    @NonNull
    public static k a() {
        return a.f45454a;
    }

    @NonNull
    public abstract l b();

    public abstract void c(@Nullable j jVar);
}
