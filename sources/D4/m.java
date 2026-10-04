package d4;

import java.util.Stack;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    @Nullable
    public static final <T> T a(@NotNull Stack<T> stack) {
        G.p(stack, "<this>");
        if (stack.empty()) {
            return null;
        }
        return stack.pop();
    }
}
