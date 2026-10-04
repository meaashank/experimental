package M3;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface b<T extends Serializable> {
    void a(@NotNull String str);

    @Nullable
    T b(@NotNull String str);

    void c(@NotNull String str, @NotNull T t10);
}
