package o2;

import android.net.Uri;
import androidx.compose.animation.C1635o;
import e.T;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o2.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(33)
public final class C5303N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Uri f223197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f223198b;

    public C5303N(@NotNull Uri registrationUri, boolean z10) {
        kotlin.jvm.internal.G.p(registrationUri, "registrationUri");
        this.f223197a = registrationUri;
        this.f223198b = z10;
    }

    public final boolean a() {
        return this.f223198b;
    }

    @NotNull
    public final Uri b() {
        return this.f223197a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5303N)) {
            return false;
        }
        C5303N c5303n = (C5303N) obj;
        return kotlin.jvm.internal.G.g(this.f223197a, c5303n.f223197a) && this.f223198b == c5303n.f223198b;
    }

    public int hashCode() {
        return C1635o.a(this.f223198b) + (this.f223197a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.f223197a + ", DebugKeyAllowed=" + this.f223198b + " }";
    }
}
