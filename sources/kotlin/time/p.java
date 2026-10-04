package kotlin.time;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final InterfaceC5038e f218443a = Xc.n.f79086a.e();

    @NotNull
    public static final Object a(@NotNull Instant instant) {
        kotlin.jvm.internal.G.p(instant, "instant");
        return new InstantSerialized(instant.f218396a, instant.f218397b);
    }

    @NotNull
    public static final Instant b() {
        return f218443a.a();
    }
}
