package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.InterfaceC5120x0;
import kotlinx.coroutines.J0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC5120x0
public interface B {

    public static final class a {
        @Nullable
        public static String a(@NotNull B b10) {
            return null;
        }
    }

    int a();

    @Nullable
    String b();

    @NotNull
    J0 c(@NotNull List<? extends B> list);
}
