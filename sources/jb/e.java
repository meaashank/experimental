package Jb;

import android.net.Uri;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58199d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f58200e = "fetchlocal";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f58202b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f58201a = "00:00:00:00";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f58203c = "";

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @NotNull
    public final Uri a() {
        Uri uriBuild = new Uri.Builder().scheme(f58200e).encodedAuthority(this.f58201a + com.prism.gaia.server.accounts.b.f166434b0 + this.f58202b).appendPath(this.f58203c).build();
        G.o(uriBuild, "build(...)");
        return uriBuild;
    }

    @NotNull
    public final e b(long j10) {
        this.f58203c = String.valueOf(j10);
        return this;
    }

    @NotNull
    public final e c(@NotNull String fileResourceName) {
        G.p(fileResourceName, "fileResourceName");
        this.f58203c = fileResourceName;
        return this;
    }

    @NotNull
    public final e d(@NotNull String hostAddress) {
        G.p(hostAddress, "hostAddress");
        this.f58201a = hostAddress;
        return this;
    }

    @NotNull
    public final e e(@NotNull String hostAddress, int i10) {
        G.p(hostAddress, "hostAddress");
        this.f58202b = i10;
        this.f58201a = hostAddress;
        return this;
    }

    @NotNull
    public final e f(int i10) {
        this.f58202b = i10;
        return this;
    }

    @NotNull
    public String toString() {
        String string = a().toString();
        G.o(string, "toString(...)");
        return string;
    }
}
