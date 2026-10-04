package androidx.compose.ui.res;

import androidx.compose.runtime.internal.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public final class ResourceResolutionException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f103967a = 0;

    public ResourceResolutionException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
    }
}
