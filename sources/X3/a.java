package X3;

import androidx.compose.foundation.text.modifiers.l;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76750d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f76751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f76752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f76753c;

    public a(@NotNull String url, @NotNull String title, @NotNull String contentSize) {
        G.p(url, "url");
        G.p(title, "title");
        G.p(contentSize, "contentSize");
        this.f76751a = url;
        this.f76752b = title;
        this.f76753c = contentSize;
    }

    public static /* synthetic */ a e(a aVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f76751a;
        }
        if ((i10 & 2) != 0) {
            str2 = aVar.f76752b;
        }
        if ((i10 & 4) != 0) {
            str3 = aVar.f76753c;
        }
        return aVar.d(str, str2, str3);
    }

    @NotNull
    public final String a() {
        return this.f76751a;
    }

    @NotNull
    public final String b() {
        return this.f76752b;
    }

    @NotNull
    public final String c() {
        return this.f76753c;
    }

    @NotNull
    public final a d(@NotNull String url, @NotNull String title, @NotNull String contentSize) {
        G.p(url, "url");
        G.p(title, "title");
        G.p(contentSize, "contentSize");
        return new a(url, title, contentSize);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f76751a, aVar.f76751a) && G.g(this.f76752b, aVar.f76752b) && G.g(this.f76753c, aVar.f76753c);
    }

    @NotNull
    public final String f() {
        return this.f76753c;
    }

    @NotNull
    public final String g() {
        return this.f76752b;
    }

    @NotNull
    public final String h() {
        return this.f76751a;
    }

    public int hashCode() {
        return this.f76753c.hashCode() + l.a(this.f76752b, this.f76751a.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.f76751a;
        String str2 = this.f76752b;
        return android.support.v4.media.e.a(androidx.constraintlayout.core.parser.b.a("DownloadEntry(url=", str, ", title=", str2, ", contentSize="), this.f76753c, ")");
    }
}
