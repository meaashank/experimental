package C4;

import kotlin.jvm.internal.G;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final boolean a(@NotNull String inputStr, @NotNull String[] items) {
        G.p(inputStr, "inputStr");
        G.p(items, "items");
        for (String str : items) {
            if (M.p3(inputStr, str, false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}
