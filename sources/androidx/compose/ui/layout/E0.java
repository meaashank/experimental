package androidx.compose.ui.layout;

import androidx.compose.ui.layout.v0;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends v0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f102396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f102397d;

    public E0(int i10, @NotNull LayoutDirection layoutDirection) {
        this.f102396c = i10;
        this.f102397d = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.v0.a
    @NotNull
    public LayoutDirection f() {
        return this.f102397d;
    }

    @Override // androidx.compose.ui.layout.v0.a
    public int g() {
        return this.f102396c;
    }
}
