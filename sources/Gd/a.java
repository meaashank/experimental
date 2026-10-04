package Gd;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okhttp3.Headers;
import okio.InterfaceC5362l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C0042a f45377c = new C0042a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f45378d = 262144;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5362l f45379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45380b;

    /* JADX INFO: renamed from: Gd.a$a, reason: collision with other inner class name */
    public static final class C0042a {
        public C0042a() {
        }

        public C0042a(C4969v c4969v) {
        }
    }

    public a(@NotNull InterfaceC5362l source) {
        G.p(source, "source");
        this.f45379a = source;
        this.f45380b = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    @NotNull
    public final InterfaceC5362l a() {
        return this.f45379a;
    }

    @NotNull
    public final Headers b() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String strC = c();
            if (strC.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(strC);
        }
    }

    @NotNull
    public final String c() throws IOException {
        String strA2 = this.f45379a.A2(this.f45380b);
        this.f45380b -= (long) strA2.length();
        return strA2;
    }
}
