package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC1603p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1579d<T, V extends AbstractC1603p> {

    /* JADX INFO: renamed from: androidx.compose.animation.core.d$a */
    public static final class a {
        @Deprecated
        public static <T, V extends AbstractC1603p> boolean a(@NotNull InterfaceC1579d<T, V> interfaceC1579d, long j10) {
            return C1577c.a(interfaceC1579d, j10);
        }
    }

    boolean a();

    boolean b(long j10);

    long c();

    @NotNull
    H0<T, V> d();

    T e(long j10);

    T f();

    @NotNull
    V g(long j10);
}
