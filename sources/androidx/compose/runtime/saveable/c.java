package androidx.compose.runtime.saveable;

import ed.InterfaceC4376a;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    public interface a {
        void unregister();
    }

    boolean a(@NotNull Object obj);

    @NotNull
    a b(@NotNull String str, @NotNull InterfaceC4376a<? extends Object> interfaceC4376a);

    @NotNull
    Map<String, List<Object>> c();

    @Nullable
    Object e(@NotNull String str);
}
