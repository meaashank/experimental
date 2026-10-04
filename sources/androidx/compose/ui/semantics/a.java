package androidx.compose.ui.semantics;

import kotlin.A;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class a<T extends A<? extends Boolean>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104098c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f104099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f104100b;

    public a(@Nullable String str, @Nullable T t10) {
        this.f104099a = str;
        this.f104100b = t10;
    }

    @Nullable
    public final T a() {
        return this.f104100b;
    }

    @Nullable
    public final String b() {
        return this.f104099a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f104099a, aVar.f104099a) && G.g(this.f104100b, aVar.f104100b);
    }

    public int hashCode() {
        String str = this.f104099a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.f104100b;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessibilityAction(label=" + this.f104099a + ", action=" + this.f104100b + ')';
    }
}
