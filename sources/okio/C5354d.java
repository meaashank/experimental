package okio;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC4982o(message = "changed in Okio 2.x")
public final class C5354d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5354d f225929a = new C5354d();

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@NotNull String string) {
        kotlin.jvm.internal.G.p(string, "string");
        return h0.l(string, 0, 0, 3, null);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@NotNull String string, int i10, int i11) {
        kotlin.jvm.internal.G.p(string, "string");
        return h0.k(string, i10, i11);
    }
}
