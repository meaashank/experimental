package androidx.compose.ui.platform;

import kotlin.sequences.C4994g;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2275r0 {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.r0$a */
    public static final class a {
        @Deprecated
        @NotNull
        public static InterfaceC5000m<B1> a(@NotNull InterfaceC2275r0 interfaceC2275r0) {
            return C4994g.f218169a;
        }

        @Deprecated
        @Nullable
        public static String b(@NotNull InterfaceC2275r0 interfaceC2275r0) {
            return null;
        }

        @Deprecated
        @Nullable
        public static Object c(@NotNull InterfaceC2275r0 interfaceC2275r0) {
            return null;
        }
    }

    @Nullable
    Object a();

    @NotNull
    InterfaceC5000m<B1> b();

    @Nullable
    String d();
}
