package b;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2722a {
    void addOnContextAvailableListener(@NotNull c cVar);

    @Nullable
    Context peekAvailableContext();

    void removeOnContextAvailableListener(@NotNull c cVar);
}
