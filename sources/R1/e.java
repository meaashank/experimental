package R1;

import R1.a;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // R1.a
    @Nullable
    public <T> T a(@NotNull a.b<T> key) {
        G.p(key, "key");
        return (T) this.f67687a.get(key);
    }

    public final <T> void c(@NotNull a.b<T> key, T t10) {
        G.p(key, "key");
        this.f67687a.put(key, t10);
    }

    public e(@NotNull a initialExtras) {
        G.p(initialExtras, "initialExtras");
        this.f67687a.putAll(initialExtras.f67687a);
    }

    public /* synthetic */ e(a aVar, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? a.C0103a.f67688b : aVar);
    }
}
