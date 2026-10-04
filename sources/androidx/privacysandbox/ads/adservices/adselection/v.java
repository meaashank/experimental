package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.collection.C1550p;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f116034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Uri f116035b;

    public v(long j10, @NotNull Uri renderUri) {
        G.p(renderUri, "renderUri");
        this.f116034a = j10;
        this.f116035b = renderUri;
    }

    public final long a() {
        return this.f116034a;
    }

    @NotNull
    public final Uri b() {
        return this.f116035b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f116034a == vVar.f116034a && G.g(this.f116035b, vVar.f116035b);
    }

    public int hashCode() {
        return this.f116035b.hashCode() + (C1550p.a(this.f116034a) * 31);
    }

    @NotNull
    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.f116034a + ", renderUri=" + this.f116035b;
    }
}
