package o2;

import android.net.Uri;
import androidx.compose.animation.C1635o;
import e.T;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o2.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(33)
public final class C5302M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Uri f223195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f223196b;

    public C5302M(@NotNull Uri registrationUri, boolean z10) {
        kotlin.jvm.internal.G.p(registrationUri, "registrationUri");
        this.f223195a = registrationUri;
        this.f223196b = z10;
    }

    public final boolean a() {
        return this.f223196b;
    }

    @NotNull
    public final Uri b() {
        return this.f223195a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5302M)) {
            return false;
        }
        C5302M c5302m = (C5302M) obj;
        return kotlin.jvm.internal.G.g(this.f223195a, c5302m.f223195a) && this.f223196b == c5302m.f223196b;
    }

    public int hashCode() {
        return C1635o.a(this.f223196b) + (this.f223195a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "WebSourceParams { RegistrationUri=" + this.f223195a + ", DebugKeyAllowed=" + this.f223196b + " }";
    }
}
