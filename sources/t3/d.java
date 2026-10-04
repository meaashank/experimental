package T3;

import androidx.collection.C1550p;
import androidx.compose.foundation.text.modifiers.l;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class d extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f68317g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f68318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f68319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull String url, @NotNull String title, long j10) {
        super(url, title);
        G.p(url, "url");
        G.p(title, "title");
        this.f68318d = url;
        this.f68319e = title;
        this.f68320f = j10;
    }

    public static /* synthetic */ d g(d dVar, String str, String str2, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVar.f68318d;
        }
        if ((i10 & 2) != 0) {
            str2 = dVar.f68319e;
        }
        if ((i10 & 4) != 0) {
            j10 = dVar.f68320f;
        }
        return dVar.f(str, str2, j10);
    }

    @Override // T3.g
    @NotNull
    public String a() {
        return this.f68319e;
    }

    @Override // T3.g
    @NotNull
    public String b() {
        return this.f68318d;
    }

    @NotNull
    public final String c() {
        return this.f68318d;
    }

    @NotNull
    public final String d() {
        return this.f68319e;
    }

    public final long e() {
        return this.f68320f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return G.g(this.f68318d, dVar.f68318d) && G.g(this.f68319e, dVar.f68319e) && this.f68320f == dVar.f68320f;
    }

    @NotNull
    public final d f(@NotNull String url, @NotNull String title, long j10) {
        G.p(url, "url");
        G.p(title, "title");
        return new d(url, title, j10);
    }

    public final long h() {
        return this.f68320f;
    }

    public int hashCode() {
        return C1550p.a(this.f68320f) + l.a(this.f68319e, this.f68318d.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.f68318d;
        String str2 = this.f68319e;
        return android.support.v4.media.session.f.a(androidx.constraintlayout.core.parser.b.a("HistoryEntry(url=", str, ", title=", str2, ", lastTimeVisited="), this.f68320f, ")");
    }

    public /* synthetic */ d(String str, String str2, long j10, int i10, C4969v c4969v) {
        this(str, str2, (i10 & 4) != 0 ? System.currentTimeMillis() : j10);
    }
}
