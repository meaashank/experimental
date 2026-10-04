package h0;

import androidx.compose.runtime.InterfaceC1924k0;
import java.util.Locale;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class C4480h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f202379b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202380c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Locale f202381a;

    /* JADX INFO: renamed from: h0.h$a */
    public static final class a {
        public a() {
        }

        @NotNull
        public final C4480h a() {
            return C4483k.a().b().i(0);
        }

        public a(C4969v c4969v) {
        }
    }

    public C4480h(@NotNull Locale locale) {
        this.f202381a = locale;
    }

    @NotNull
    public final String a() {
        return this.f202381a.getLanguage();
    }

    @NotNull
    public final Locale b() {
        return this.f202381a;
    }

    @NotNull
    public final String c() {
        return this.f202381a.getCountry();
    }

    @NotNull
    public final String d() {
        return this.f202381a.getScript();
    }

    @NotNull
    public final String e() {
        return this.f202381a.toLanguageTag();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof C4480h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return G.g(this.f202381a.toLanguageTag(), ((C4480h) obj).f202381a.toLanguageTag());
    }

    public int hashCode() {
        return this.f202381a.toLanguageTag().hashCode();
    }

    @NotNull
    public String toString() {
        return this.f202381a.toLanguageTag();
    }

    public C4480h(@NotNull String str) {
        this(C4483k.a().a(str));
    }
}
