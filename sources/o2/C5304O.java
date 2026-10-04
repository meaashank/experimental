package o2;

import android.net.Uri;
import e.T;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o2.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(33)
public final class C5304O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<C5303N> f223199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Uri f223200b;

    public C5304O(@NotNull List<C5303N> webTriggerParams, @NotNull Uri destination) {
        kotlin.jvm.internal.G.p(webTriggerParams, "webTriggerParams");
        kotlin.jvm.internal.G.p(destination, "destination");
        this.f223199a = webTriggerParams;
        this.f223200b = destination;
    }

    @NotNull
    public final Uri a() {
        return this.f223200b;
    }

    @NotNull
    public final List<C5303N> b() {
        return this.f223199a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5304O)) {
            return false;
        }
        C5304O c5304o = (C5304O) obj;
        return kotlin.jvm.internal.G.g(this.f223199a, c5304o.f223199a) && kotlin.jvm.internal.G.g(this.f223200b, c5304o.f223200b);
    }

    public int hashCode() {
        return this.f223200b.hashCode() + (this.f223199a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.f223199a + ", Destination=" + this.f223200b;
    }
}
