package kotlinx.coroutines.stream;

import java.util.stream.Stream;
import kotlinx.coroutines.flow.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    @NotNull
    public static final <T> e<T> a(@NotNull Stream<T> stream) {
        return new StreamFlow(stream);
    }
}
