package k2;

import android.net.Uri;
import androidx.compose.runtime.R0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4817a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Uri f214342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f214343b;

    public C4817a(@NotNull Uri renderUri, @NotNull String metadata) {
        G.p(renderUri, "renderUri");
        G.p(metadata, "metadata");
        this.f214342a = renderUri;
        this.f214343b = metadata;
    }

    @NotNull
    public final String a() {
        return this.f214343b;
    }

    @NotNull
    public final Uri b() {
        return this.f214342a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4817a)) {
            return false;
        }
        C4817a c4817a = (C4817a) obj;
        return G.g(this.f214342a, c4817a.f214342a) && G.g(this.f214343b, c4817a.f214343b);
    }

    public int hashCode() {
        return this.f214343b.hashCode() + (this.f214342a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdData: renderUri=");
        sb2.append(this.f214342a);
        sb2.append(", metadata='");
        return R0.a(sb2, this.f214343b, '\'');
    }
}
