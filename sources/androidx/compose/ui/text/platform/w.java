package androidx.compose.ui.text.platform;

import androidx.compose.runtime.X1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w implements X1<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104945a;

    public w(boolean z10) {
        this.f104945a = z10;
    }

    @NotNull
    public Boolean d() {
        return Boolean.valueOf(this.f104945a);
    }

    @Override // androidx.compose.runtime.X1
    public Boolean getValue() {
        return Boolean.valueOf(this.f104945a);
    }
}
