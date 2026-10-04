package androidx.compose.ui.text.font;

import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class P extends d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f104577l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f104578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f104579k;

    public P(@NotNull String str, @NotNull String str2) {
        super(true);
        this.f104578j = str;
        this.f104579k = str2;
    }

    @NotNull
    public final String t() {
        return this.f104578j;
    }

    @NotNull
    public String toString() {
        return this.f104579k;
    }
}
