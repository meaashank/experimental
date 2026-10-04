package sd;

import java.util.Set;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import rd.InterfaceC5552c;

/* JADX INFO: loaded from: classes5.dex */
public final class d<E> extends C5593a<E> implements InterfaceC5552c<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Set<? extends E> impl) {
        super(impl);
        G.p(impl, "impl");
    }
}
