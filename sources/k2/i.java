package K2;

import android.app.Activity;
import androidx.core.util.InterfaceC2427d;
import androidx.window.embedding.EmbeddingRule;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.window.core.d
public interface i {
    void a(@NotNull Set<? extends EmbeddingRule> set);

    @NotNull
    Set<EmbeddingRule> b();

    void c(@NotNull Activity activity, @NotNull Executor executor, @NotNull InterfaceC2427d<List<r>> interfaceC2427d);

    void d(@NotNull InterfaceC2427d<List<r>> interfaceC2427d);

    boolean e();

    void f(@NotNull EmbeddingRule embeddingRule);

    void g(@NotNull EmbeddingRule embeddingRule);
}
