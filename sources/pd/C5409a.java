package pd;

import dd.j;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import kotlin.text.C5020l;
import kotlin.text.InterfaceC5021m;
import kotlin.text.InterfaceC5022n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@j(name = "RegexExtensionsJDK8Kt")
public final class C5409a {
    @InterfaceC4887e0(version = "1.2")
    @Nullable
    public static final C5020l a(@NotNull InterfaceC5021m interfaceC5021m, @NotNull String name) {
        G.p(interfaceC5021m, "<this>");
        G.p(name, "name");
        InterfaceC5022n interfaceC5022n = interfaceC5021m instanceof InterfaceC5022n ? (InterfaceC5022n) interfaceC5021m : null;
        if (interfaceC5022n != null) {
            return interfaceC5022n.get(name);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
