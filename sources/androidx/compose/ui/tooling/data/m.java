package androidx.compose.ui.tooling.data;

import java.util.List;
import k0.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@q
public interface m {
    @NotNull
    v getBounds();

    int getDepth();

    @Nullable
    o getLocation();

    @Nullable
    String getName();

    @NotNull
    List<i> getParameters();

    boolean isInline();
}
