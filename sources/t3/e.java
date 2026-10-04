package T3;

import androidx.compose.runtime.internal.r;
import androidx.constraintlayout.motion.widget.s;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public final class e extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f68321f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f68322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f68323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull String url, @NotNull String title) {
        super(url, title);
        G.p(url, "url");
        G.p(title, "title");
        this.f68322d = url;
        this.f68323e = title;
    }

    public static /* synthetic */ e f(e eVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eVar.f68322d;
        }
        if ((i10 & 2) != 0) {
            str2 = eVar.f68323e;
        }
        return eVar.e(str, str2);
    }

    @Override // T3.g
    @NotNull
    public String a() {
        return this.f68323e;
    }

    @Override // T3.g
    @NotNull
    public String b() {
        return this.f68322d;
    }

    @NotNull
    public final String c() {
        return this.f68322d;
    }

    @NotNull
    public final String d() {
        return this.f68323e;
    }

    @NotNull
    public final e e(@NotNull String url, @NotNull String title) {
        G.p(url, "url");
        G.p(title, "title");
        return new e(url, title);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return G.g(this.f68322d, eVar.f68322d) && G.g(this.f68323e, eVar.f68323e);
    }

    public int hashCode() {
        return this.f68323e.hashCode() + (this.f68322d.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return s.a("SearchSuggestion(url=", this.f68322d, ", title=", this.f68323e, ")");
    }
}
