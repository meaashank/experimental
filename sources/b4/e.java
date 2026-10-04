package B4;

import android.net.http.SslError;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12470a = 0;

    @r(parameters = 0)
    public static final class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12471c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SslError f12472b;

        public a(@NotNull SslError sslError) {
            G.p(sslError, "sslError");
            this.f12472b = sslError;
        }

        @NotNull
        public final SslError a() {
            return this.f12472b;
        }
    }

    @r(parameters = 1)
    public static final class b extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f12473b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12474c = 0;
    }

    @r(parameters = 1)
    public static final class c extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f12475b = new c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f12476c = 0;
    }

    public e() {
    }

    public e(C4969v c4969v) {
    }
}
