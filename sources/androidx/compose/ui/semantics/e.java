package androidx.compose.ui.semantics;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104113c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Boolean> f104115b;

    public e(@NotNull String str, @NotNull InterfaceC4376a<Boolean> interfaceC4376a) {
        this.f104114a = str;
        this.f104115b = interfaceC4376a;
    }

    @NotNull
    public final InterfaceC4376a<Boolean> a() {
        return this.f104115b;
    }

    @NotNull
    public final String b() {
        return this.f104114a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return G.g(this.f104114a, eVar.f104114a) && this.f104115b == eVar.f104115b;
    }

    public int hashCode() {
        return this.f104115b.hashCode() + (this.f104114a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f104114a + ", action=" + this.f104115b + ')';
    }
}
