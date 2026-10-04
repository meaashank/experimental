package H2;

import I2.C1208w0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.webkit.TracingConfig;
import e.InterfaceC4330d;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4330d
public abstract class m {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f45455a = new C1208w0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public m() {
    }

    @NonNull
    public static m a() {
        return a.f45455a;
    }

    public abstract boolean b();

    public abstract void c(@NonNull TracingConfig tracingConfig);

    public abstract boolean d(@Nullable OutputStream outputStream, @NonNull Executor executor);
}
