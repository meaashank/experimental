package androidx.compose.ui.platform;

import androidx.compose.ui.p;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends p.d implements androidx.compose.ui.node.x0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public String f103945o;

    public w1(@NotNull String str) {
        this.f103945o = str;
    }

    @Override // androidx.compose.ui.node.x0
    public /* synthetic */ boolean B1() {
        return false;
    }

    @NotNull
    public final String e3() {
        return this.f103945o;
    }

    public final void f3(@NotNull String str) {
        this.f103945o = str;
    }

    @Override // androidx.compose.ui.node.x0
    public void o0(@NotNull androidx.compose.ui.semantics.u uVar) {
        SemanticsPropertiesKt.I1(uVar, this.f103945o);
    }

    @Override // androidx.compose.ui.node.x0
    public /* synthetic */ boolean q1() {
        return false;
    }
}
