package kotlin.random;

import Xc.f;
import Xc.n;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final java.util.Random a(@NotNull Random random) {
        java.util.Random randomV;
        G.p(random, "<this>");
        a aVar = random instanceof a ? (a) random : null;
        return (aVar == null || (randomV = aVar.v()) == null) ? new KotlinRandom(random) : randomV;
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final Random b(@NotNull java.util.Random random) {
        Random random2;
        G.p(random, "<this>");
        KotlinRandom kotlinRandom = random instanceof KotlinRandom ? (KotlinRandom) random : null;
        return (kotlinRandom == null || (random2 = kotlinRandom.f218003a) == null) ? new PlatformRandom(random) : random2;
    }

    @f
    public static final Random c() {
        return n.f79086a.b();
    }

    public static final double d(int i10, int i11) {
        return ((((long) i10) << 27) + ((long) i11)) / 9.007199254740992E15d;
    }
}
