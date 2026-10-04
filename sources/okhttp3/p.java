package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f225811a = b.f225812a;

    public interface a {
        int a();

        @NotNull
        a b(int i10, @NotNull TimeUnit timeUnit);

        @NotNull
        Response c(@NotNull Request request) throws IOException;

        @NotNull
        d call();

        @Nullable
        h connection();

        @NotNull
        a d(int i10, @NotNull TimeUnit timeUnit);

        @NotNull
        a e(int i10, @NotNull TimeUnit timeUnit);

        int f();

        int g();

        @NotNull
        Request request();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f225812a = new b();

        public static final class a implements p {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ed.l<a, Response> f225813b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(ed.l<? super a, Response> lVar) {
                this.f225813b = lVar;
            }

            @Override // okhttp3.p
            @NotNull
            public final Response a(@NotNull a it) {
                G.p(it, "it");
                return this.f225813b.invoke(it);
            }
        }

        @NotNull
        public final p a(@NotNull ed.l<? super a, Response> block) {
            G.p(block, "block");
            return new a(block);
        }
    }

    @NotNull
    Response a(@NotNull a aVar) throws IOException;
}
