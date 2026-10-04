package y4;

import androidx.compose.runtime.internal.r;
import e.Z;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: y4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@r(parameters = 1)
public class C5822c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f241092d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f241093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f241094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f241095c;

    public C5822c(@NotNull String iconUrl, @NotNull String queryUrl, @Z int i10) {
        G.p(iconUrl, "iconUrl");
        G.p(queryUrl, "queryUrl");
        this.f241093a = iconUrl;
        this.f241094b = queryUrl;
        this.f241095c = i10;
    }

    @NotNull
    public final String a() {
        return this.f241093a;
    }

    @NotNull
    public final String b() {
        return this.f241094b;
    }

    public final int c() {
        return this.f241095c;
    }

    @NotNull
    public final String d() {
        return this.f241093a;
    }

    @NotNull
    public final String e() {
        return this.f241094b;
    }

    public final int f() {
        return this.f241095c;
    }
}
