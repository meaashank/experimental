package okhttp3;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f225789a = a.f225791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final j f225790b = new a.C0856a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f225791a = new a();

        /* JADX INFO: renamed from: okhttp3.j$a$a, reason: collision with other inner class name */
        public static final class C0856a implements j {
            @Override // okhttp3.j
            @NotNull
            public List<Cookie> a(@NotNull HttpUrl url) {
                G.p(url, "url");
                return EmptyList.f217510a;
            }

            @Override // okhttp3.j
            public void b(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
                G.p(url, "url");
                G.p(cookies, "cookies");
            }
        }
    }

    @NotNull
    List<Cookie> a(@NotNull HttpUrl httpUrl);

    void b(@NotNull HttpUrl httpUrl, @NotNull List<Cookie> list);
}
