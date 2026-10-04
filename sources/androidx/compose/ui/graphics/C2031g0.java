package androidx.compose.ui.graphics;

import android.graphics.Path;
import androidx.compose.ui.graphics.Path;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2031g0 {

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.g0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101117a;

        static {
            int[] iArr = new int[Path.Direction.values().length];
            try {
                iArr[Path.Direction.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Path.Direction.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101117a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final Path a() {
        return new Z(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public static final android.graphics.Path c(@NotNull Path path) {
        if (path instanceof Z) {
            return ((Z) path).f100925b;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @NotNull
    public static final Path d(@NotNull android.graphics.Path path) {
        return new Z(path);
    }

    public static final void e(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction f(Path.Direction direction) {
        int i10 = a.f101117a[direction.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
