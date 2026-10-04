package qd;

import dd.j;
import java.time.Instant;
import kotlin.InterfaceC4887e0;
import kotlin.O0;
import kotlin.jvm.internal.G;
import kotlin.time.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@j(name = "InstantConversionsJDK8Kt")
public final class e {
    @InterfaceC4887e0(version = "2.3")
    @O0(markerClass = {n.class})
    @NotNull
    public static final Instant a(@NotNull kotlin.time.Instant instant) {
        G.p(instant, "<this>");
        Instant instantOfEpochSecond = Instant.ofEpochSecond(instant.f218396a, instant.f218397b);
        G.o(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    @InterfaceC4887e0(version = "2.3")
    @O0(markerClass = {n.class})
    @NotNull
    public static final kotlin.time.Instant b(@NotNull Instant instant) {
        G.p(instant, "<this>");
        return kotlin.time.Instant.f218393c.c(instant.getEpochSecond(), instant.getNano());
    }
}
