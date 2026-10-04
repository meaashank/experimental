package H2;

import I2.C1193o0;
import I2.H0;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.webkit.ProxyConfig;
import e.InterfaceC4330d;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4330d
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f45453a = new C1193o0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public f() {
    }

    @NonNull
    public static f b() {
        if (H0.d(u.f45491L)) {
            return a.f45453a;
        }
        throw new UnsupportedOperationException("Proxy override not supported");
    }

    public abstract void a(@NonNull Executor executor, @NonNull Runnable runnable);

    public abstract void c(@NonNull ProxyConfig proxyConfig, @NonNull Executor executor, @NonNull Runnable runnable);
}
