package kotlin.jvm.internal;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.jvm.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4956h {
    @NotNull
    public static final <T> Iterator<T> a(@NotNull T[] array) {
        G.p(array, "array");
        return new C4955g(array);
    }
}
