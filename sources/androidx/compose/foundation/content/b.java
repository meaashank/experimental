package androidx.compose.foundation.content;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.L;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
@r(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88935c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Uri f88936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Bundle f88937b;

    public b(@Nullable Uri uri, @NotNull Bundle bundle) {
        this.f88936a = uri;
        this.f88937b = bundle;
    }

    @NotNull
    public final Bundle a() {
        return this.f88937b;
    }

    @Nullable
    public final Uri b() {
        return this.f88936a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return G.g(this.f88936a, bVar.f88936a) && G.g(this.f88937b, bVar.f88937b);
    }

    public int hashCode() {
        Uri uri = this.f88936a;
        return this.f88937b.hashCode() + ((uri != null ? uri.hashCode() : 0) * 31);
    }

    @NotNull
    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.f88936a + ", extras=" + this.f88937b + ')';
    }
}
