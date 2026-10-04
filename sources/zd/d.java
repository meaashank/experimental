package zd;

import fd.InterfaceC4418a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface d extends Iterable<c>, InterfaceC4418a {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f241362a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f241363b = "Content-Disposition";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f241364c = "Content-Range";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f241365d = "Range";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f241366e = "Content-Length";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f241367f = "Content-Type";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f241368g = "Cookie";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f241369h = "Referer";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final String f241370i = "User-Agent";
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f241371a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f241372b = "application/x-www-form-urlencoded";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f241373c = "application/json";
    }

    void F2(int i10, @NotNull c cVar);

    boolean contains(@NotNull String str);

    @NotNull
    List<String> f1(@NotNull String str);

    @Nullable
    String get(@NotNull String str);

    @NotNull
    c get(int i10);

    int getSize();
}
