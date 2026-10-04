package kotlinx.coroutines.internal;

import androidx.compose.runtime.R0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public final String f220311a;

    public Q(@NotNull String str) {
        this.f220311a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T a(@Nullable Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }

    @NotNull
    public String toString() {
        return R0.a(new StringBuilder("<"), this.f220311a, kotlin.text.X.f218304f);
    }
}
