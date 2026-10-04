package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import okio.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final V f226030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f226031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f226032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f226033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f226034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f226035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f226036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Long f226037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f226038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<V> f226039j;

    public c(@NotNull V canonicalPath, boolean z10, @NotNull String comment, long j10, long j11, long j12, int i10, @Nullable Long l10, long j13) {
        G.p(canonicalPath, "canonicalPath");
        G.p(comment, "comment");
        this.f226030a = canonicalPath;
        this.f226031b = z10;
        this.f226032c = comment;
        this.f226033d = j10;
        this.f226034e = j11;
        this.f226035f = j12;
        this.f226036g = i10;
        this.f226037h = l10;
        this.f226038i = j13;
        this.f226039j = new ArrayList();
    }

    @NotNull
    public final V a() {
        return this.f226030a;
    }

    @NotNull
    public final List<V> b() {
        return this.f226039j;
    }

    @NotNull
    public final String c() {
        return this.f226032c;
    }

    public final long d() {
        return this.f226034e;
    }

    public final int e() {
        return this.f226036g;
    }

    public final long f() {
        return this.f226033d;
    }

    @Nullable
    public final Long g() {
        return this.f226037h;
    }

    public final long h() {
        return this.f226038i;
    }

    public final long i() {
        return this.f226035f;
    }

    public final boolean j() {
        return this.f226031b;
    }

    public /* synthetic */ c(V v10, boolean z10, String str, long j10, long j11, long j12, int i10, Long l10, long j13, int i11, C4969v c4969v) {
        this(v10, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? -1L : j11, (i11 & 32) != 0 ? -1L : j12, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? null : l10, (i11 & 256) != 0 ? -1L : j13);
    }
}
