package d4;

import android.util.Log;
import java.io.Closeable;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    @Nullable
    public static final <T extends Closeable, R> R a(@NotNull T t10, @NotNull ed.l<? super T, ? extends R> block) {
        G.p(t10, "<this>");
        G.p(block, "block");
        try {
            try {
                R rInvoke = block.invoke(t10);
                t10.close();
                return rInvoke;
            } finally {
            }
        } catch (Throwable th) {
            Log.e("Closeable", "Unable to parse results", th);
            return null;
        }
    }
}
