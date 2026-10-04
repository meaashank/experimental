package R1;

import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import ed.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@g
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<kotlin.reflect.d<?>, h<?>> f67690a = new LinkedHashMap();

    public final <T extends k0> void a(@NotNull kotlin.reflect.d<T> clazz, @NotNull l<? super a, ? extends T> initializer) {
        G.p(clazz, "clazz");
        G.p(initializer, "initializer");
        if (!this.f67690a.containsKey(clazz)) {
            this.f67690a.put(clazz, new h<>(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + clazz.k() + '.').toString());
    }

    @NotNull
    public final m0.c b() {
        return S1.i.f68117a.a(this.f67690a.values());
    }
}
