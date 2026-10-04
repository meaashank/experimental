package androidx.window.layout;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<m> f120086a;

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public B(@NotNull List<? extends m> displayFeatures) {
        kotlin.jvm.internal.G.p(displayFeatures, "displayFeatures");
        this.f120086a = displayFeatures;
    }

    @NotNull
    public final List<m> a() {
        return this.f120086a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !B.class.equals(obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.G.g(this.f120086a, ((B) obj).f120086a);
    }

    public int hashCode() {
        return this.f120086a.hashCode();
    }

    @NotNull
    public String toString() {
        return U.r3(this.f120086a, U6.j.f68738d, "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
