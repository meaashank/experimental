package kotlin.coroutines;

import androidx.activity.D;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5043v;
import kotlin.coroutines.i;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5043v
    @Nullable
    public static final <E extends i.b> E a(@NotNull i.b bVar, @NotNull i.c<E> key) {
        G.p(bVar, "<this>");
        G.p(key, "key");
        if (!(key instanceof b)) {
            if (bVar.getKey() == key) {
                return bVar;
            }
            return null;
        }
        b bVar2 = (b) key;
        if (bVar2.a(bVar.getKey())) {
            E e10 = (E) bVar2.b(bVar);
            if (D.a(e10)) {
                return e10;
            }
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC5043v
    @NotNull
    public static final i b(@NotNull i.b bVar, @NotNull i.c<?> key) {
        G.p(bVar, "<this>");
        G.p(key, "key");
        if (!(key instanceof b)) {
            return bVar.getKey() == key ? EmptyCoroutineContext.f217673a : bVar;
        }
        b bVar2 = (b) key;
        return (!bVar2.a(bVar.getKey()) || bVar2.b(bVar) == null) ? bVar : EmptyCoroutineContext.f217673a;
    }
}
