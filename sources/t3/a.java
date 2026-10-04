package T3;

import androidx.compose.foundation.text.modifiers.l;
import androidx.compose.runtime.internal.r;
import androidx.constraintlayout.motion.widget.s;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public abstract class a extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f68300f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f68301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f68302e;

    /* JADX INFO: renamed from: T3.a$a, reason: collision with other inner class name */
    @r(parameters = 1)
    public static final class C0110a extends a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f68303k = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f68304g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final String f68305h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f68306i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final b f68307j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0110a(@NotNull String url, @NotNull String title, int i10, @NotNull b folder) {
            super(url, title);
            G.p(url, "url");
            G.p(title, "title");
            G.p(folder, "folder");
            this.f68304g = url;
            this.f68305h = title;
            this.f68306i = i10;
            this.f68307j = folder;
        }

        public static /* synthetic */ C0110a h(C0110a c0110a, String str, String str2, int i10, b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = c0110a.f68304g;
            }
            if ((i11 & 2) != 0) {
                str2 = c0110a.f68305h;
            }
            if ((i11 & 4) != 0) {
                i10 = c0110a.f68306i;
            }
            if ((i11 & 8) != 0) {
                bVar = c0110a.f68307j;
            }
            return c0110a.g(str, str2, i10, bVar);
        }

        @Override // T3.a, T3.g
        @NotNull
        public String a() {
            return this.f68305h;
        }

        @Override // T3.a, T3.g
        @NotNull
        public String b() {
            return this.f68304g;
        }

        @NotNull
        public final String c() {
            return this.f68304g;
        }

        @NotNull
        public final String d() {
            return this.f68305h;
        }

        public final int e() {
            return this.f68306i;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0110a)) {
                return false;
            }
            C0110a c0110a = (C0110a) obj;
            return G.g(this.f68304g, c0110a.f68304g) && G.g(this.f68305h, c0110a.f68305h) && this.f68306i == c0110a.f68306i && G.g(this.f68307j, c0110a.f68307j);
        }

        @NotNull
        public final b f() {
            return this.f68307j;
        }

        @NotNull
        public final C0110a g(@NotNull String url, @NotNull String title, int i10, @NotNull b folder) {
            G.p(url, "url");
            G.p(title, "title");
            G.p(folder, "folder");
            return new C0110a(url, title, i10, folder);
        }

        public int hashCode() {
            return this.f68307j.hashCode() + ((l.a(this.f68305h, this.f68304g.hashCode() * 31, 31) + this.f68306i) * 31);
        }

        @NotNull
        public final b i() {
            return this.f68307j;
        }

        public final int j() {
            return this.f68306i;
        }

        @NotNull
        public String toString() {
            String str = this.f68304g;
            String str2 = this.f68305h;
            int i10 = this.f68306i;
            b bVar = this.f68307j;
            StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("Entry(url=", str, ", title=", str2, ", position=");
            sbA.append(i10);
            sbA.append(", folder=");
            sbA.append(bVar);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public a(String str, String str2) {
        super(str, str2);
        this.f68301d = str;
        this.f68302e = str2;
    }

    @Override // T3.g
    @NotNull
    public String a() {
        return this.f68302e;
    }

    @Override // T3.g
    @NotNull
    public String b() {
        return this.f68301d;
    }

    @r(parameters = 1)
    public static abstract class b extends a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f68308i = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f68309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final String f68310h;

        /* JADX INFO: renamed from: T3.a$b$a, reason: collision with other inner class name */
        @r(parameters = 1)
        public static final class C0111a extends b {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f68311l = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            @NotNull
            public final String f68312j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            @NotNull
            public final String f68313k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0111a(@NotNull String url, @NotNull String title) {
                super(url, title);
                G.p(url, "url");
                G.p(title, "title");
                this.f68312j = url;
                this.f68313k = title;
            }

            public static /* synthetic */ C0111a f(C0111a c0111a, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = c0111a.f68312j;
                }
                if ((i10 & 2) != 0) {
                    str2 = c0111a.f68313k;
                }
                return c0111a.e(str, str2);
            }

            @Override // T3.a.b, T3.a, T3.g
            @NotNull
            public String a() {
                return this.f68313k;
            }

            @Override // T3.a.b, T3.a, T3.g
            @NotNull
            public String b() {
                return this.f68312j;
            }

            @NotNull
            public final String c() {
                return this.f68312j;
            }

            @NotNull
            public final String d() {
                return this.f68313k;
            }

            @NotNull
            public final C0111a e(@NotNull String url, @NotNull String title) {
                G.p(url, "url");
                G.p(title, "title");
                return new C0111a(url, title);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0111a)) {
                    return false;
                }
                C0111a c0111a = (C0111a) obj;
                return G.g(this.f68312j, c0111a.f68312j) && G.g(this.f68313k, c0111a.f68313k);
            }

            public int hashCode() {
                return this.f68313k.hashCode() + (this.f68312j.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return s.a("Entry(url=", this.f68312j, ", title=", this.f68313k, ")");
            }
        }

        /* JADX INFO: renamed from: T3.a$b$b, reason: collision with other inner class name */
        @r(parameters = 1)
        public static final class C0112b extends b {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            @NotNull
            public static final C0112b f68314j = new C0112b();

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f68315k = 0;

            public C0112b() {
                super("", "");
            }
        }

        public b(String str, String str2) {
            super(str, str2);
            this.f68309g = str;
            this.f68310h = str2;
        }

        @Override // T3.a, T3.g
        @NotNull
        public String a() {
            return this.f68310h;
        }

        @Override // T3.a, T3.g
        @NotNull
        public String b() {
            return this.f68309g;
        }

        public /* synthetic */ b(String str, String str2, C4969v c4969v) {
            this(str, str2);
        }
    }

    public /* synthetic */ a(String str, String str2, C4969v c4969v) {
        this(str, str2);
    }
}
