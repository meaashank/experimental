package kotlinx.coroutines.flow;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface n<T> extends e<T> {
    @NotNull
    List<T> a();

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<?> eVar);
}
