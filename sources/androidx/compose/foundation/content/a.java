package androidx.compose.foundation.content;

import androidx.compose.foundation.L;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.settings.fragment.AdBlockSettingsFragment;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
@r(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88928c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f88934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0185a f88927b = new C0185a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f88929d = new a(AdBlockSettingsFragment.f147795A);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f88930e = new a("text/plain");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f88931f = new a("text/html");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f88932g = new a("image/*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f88933h = new a("*/*");

    /* JADX INFO: renamed from: androidx.compose.foundation.content.a$a, reason: collision with other inner class name */
    public static final class C0185a {
        public C0185a() {
        }

        @NotNull
        public final a a() {
            return a.f88933h;
        }

        @NotNull
        public final a b() {
            return a.f88931f;
        }

        @NotNull
        public final a c() {
            return a.f88932g;
        }

        @NotNull
        public final a d() {
            return a.f88930e;
        }

        @NotNull
        public final a e() {
            return a.f88929d;
        }

        public C0185a(C4969v c4969v) {
        }
    }

    public a(@NotNull String str) {
        this.f88934a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return G.g(this.f88934a, ((a) obj).f88934a);
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.f88934a;
    }

    public int hashCode() {
        return this.f88934a.hashCode();
    }

    @NotNull
    public String toString() {
        return android.support.v4.media.e.a(new StringBuilder("MediaType(representation='"), this.f88934a, "')");
    }
}
