package androidx.compose.ui.text.input;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.R0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class O {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104724b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f104725a;

    /* JADX WARN: Multi-variable type inference failed */
    public O() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String a() {
        return this.f104725a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O) && kotlin.jvm.internal.G.g(this.f104725a, ((O) obj).f104725a);
    }

    public int hashCode() {
        String str = this.f104725a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return R0.a(new StringBuilder("PlatformImeOptions(privateImeOptions="), this.f104725a, ')');
    }

    public O(@Nullable String str) {
        this.f104725a = str;
    }

    public /* synthetic */ O(String str, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? null : str);
    }
}
