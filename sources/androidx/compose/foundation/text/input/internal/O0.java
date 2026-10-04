package androidx.compose.foundation.text.input.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements InterfaceC1798o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f93787b;

    public O0(char c10) {
        this.f93787b = c10;
    }

    public static O0 d(O0 o02, char c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c10 = o02.f93787b;
        }
        o02.getClass();
        return new O0(c10);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1798o
    public int a(int i10, int i11) {
        return this.f93787b;
    }

    public final char b() {
        return this.f93787b;
    }

    @NotNull
    public final O0 c(char c10) {
        return new O0(c10);
    }

    public final char e() {
        return this.f93787b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O0) && this.f93787b == ((O0) obj).f93787b;
    }

    public int hashCode() {
        return this.f93787b;
    }

    @NotNull
    public String toString() {
        return "MaskCodepointTransformation(character=" + this.f93787b + ')';
    }
}
