package androidx.compose.ui.text;

import androidx.compose.runtime.R0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2331i
@InterfaceC4982o(message = "Use LinkAnnotatation.Url(url) instead", replaceWith = @InterfaceC4852c0(expression = "LinkAnnotation.Url(url)", imports = {}))
@androidx.compose.runtime.internal.r(parameters = 1)
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104422b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104423a;

    public e0(@NotNull String str) {
        this.f104423a = str;
    }

    @NotNull
    public final String a() {
        return this.f104423a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && kotlin.jvm.internal.G.g(this.f104423a, ((e0) obj).f104423a);
    }

    public int hashCode() {
        return this.f104423a.hashCode();
    }

    @NotNull
    public String toString() {
        return R0.a(new StringBuilder("UrlAnnotation(url="), this.f104423a, ')');
    }
}
