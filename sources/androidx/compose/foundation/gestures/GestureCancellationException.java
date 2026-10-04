package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class GestureCancellationException extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f89671a = 0;

    public GestureCancellationException() {
        this(null, 1, null);
    }

    public GestureCancellationException(@Nullable String str) {
        super(str);
    }

    public GestureCancellationException(String str, int i10, C4969v c4969v) {
        super((i10 & 1) != 0 ? null : str);
    }
}
