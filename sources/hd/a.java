package Hd;

import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0048a f50747d = new C0048a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ByteString f50748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f50749f = ":status";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f50750g = ":method";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f50751h = ":path";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f50752i = ":scheme";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f50753j = ":authority";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ByteString f50754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ByteString f50755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ByteString f50756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ByteString f50757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final ByteString f50758o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final ByteString f50759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public final ByteString f50760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    public final int f50761c;

    /* JADX INFO: renamed from: Hd.a$a, reason: collision with other inner class name */
    public static final class C0048a {
        public C0048a() {
        }

        public C0048a(C4969v c4969v) {
        }
    }

    static {
        ByteString.a aVar = ByteString.f225866d;
        f50748e = aVar.l(com.prism.gaia.server.accounts.b.f166434b0);
        f50754k = aVar.l(f50749f);
        f50755l = aVar.l(f50750g);
        f50756m = aVar.l(f50751h);
        f50757n = aVar.l(f50752i);
        f50758o = aVar.l(f50753j);
    }

    public a(@NotNull ByteString name, @NotNull ByteString value) {
        G.p(name, "name");
        G.p(value, "value");
        this.f50759a = name;
        this.f50760b = value;
        this.f50761c = value.y() + name.y() + 32;
    }

    public static /* synthetic */ a d(a aVar, ByteString byteString, ByteString byteString2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            byteString = aVar.f50759a;
        }
        if ((i10 & 2) != 0) {
            byteString2 = aVar.f50760b;
        }
        return aVar.c(byteString, byteString2);
    }

    @NotNull
    public final ByteString a() {
        return this.f50759a;
    }

    @NotNull
    public final ByteString b() {
        return this.f50760b;
    }

    @NotNull
    public final a c(@NotNull ByteString name, @NotNull ByteString value) {
        G.p(name, "name");
        G.p(value, "value");
        return new a(name, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f50759a, aVar.f50759a) && G.g(this.f50760b, aVar.f50760b);
    }

    public int hashCode() {
        return this.f50760b.hashCode() + (this.f50759a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return this.f50759a.s0() + ": " + this.f50760b.s0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(@NotNull String name, @NotNull String value) {
        G.p(name, "name");
        G.p(value, "value");
        ByteString.a aVar = ByteString.f225866d;
        this(aVar.l(name), aVar.l(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ByteString name, @NotNull String value) {
        this(name, ByteString.f225866d.l(value));
        G.p(name, "name");
        G.p(value, "value");
    }
}
