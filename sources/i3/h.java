package I3;

import androidx.compose.runtime.internal.r;
import java.io.File;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51074a = 0;

    @r(parameters = 1)
    public static final class a extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f51075b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51076c = 0;
    }

    @r(parameters = 0)
    public static final class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51077c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final File f51078b;

        public b(@NotNull File file) {
            G.p(file, "file");
            this.f51078b = file;
        }

        @NotNull
        public final File a() {
            return this.f51078b;
        }
    }

    @r(parameters = 0)
    public static final class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51079c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final HttpUrl f51080b;

        public c(@NotNull HttpUrl httpUrl) {
            G.p(httpUrl, "httpUrl");
            this.f51080b = httpUrl;
        }

        @NotNull
        public final HttpUrl a() {
            return this.f51080b;
        }
    }

    public h() {
    }

    public h(C4969v c4969v) {
    }
}
