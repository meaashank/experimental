package K2;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements ActivityEmbeddingComponent {
    public void a(@NotNull Set<EmbeddingRule> splitRules) {
        G.p(splitRules, "splitRules");
    }

    public void b(@NotNull Consumer<List<SplitInfo>> consumer) {
        G.p(consumer, "consumer");
    }
}
