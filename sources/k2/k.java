package K2;

import androidx.window.embedding.EmbeddingRule;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public interface k {

    public interface a {
        void a(@NotNull List<r> list);
    }

    void a(@NotNull Set<? extends EmbeddingRule> set);

    void b(@NotNull a aVar);
}
