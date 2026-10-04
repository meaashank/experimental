package kotlinx.coroutines.reactive;

import kotlin.coroutines.i;
import kotlinx.coroutines.InterfaceC5120x0;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public interface a {
    @NotNull
    <T> Publisher<T> a(@NotNull Publisher<T> publisher, @NotNull i iVar);
}
