package androidx.compose.foundation;

import androidx.compose.animation.C1635o;
import androidx.compose.ui.platform.C2278s0;
import ed.InterfaceC4376a;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ClickableSemanticsElement extends androidx.compose.ui.node.W<ClickableSemanticsNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f88619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final androidx.compose.ui.semantics.i f88620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f88621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final InterfaceC4376a<L0> f88622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f88623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<L0> f88624h;

    public /* synthetic */ ClickableSemanticsElement(boolean z10, androidx.compose.ui.semantics.i iVar, String str, InterfaceC4376a interfaceC4376a, String str2, InterfaceC4376a interfaceC4376a2, C4969v c4969v) {
        this(z10, iVar, str, interfaceC4376a, str2, interfaceC4376a2);
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSemanticsElement)) {
            return false;
        }
        ClickableSemanticsElement clickableSemanticsElement = (ClickableSemanticsElement) obj;
        return this.f88619c == clickableSemanticsElement.f88619c && kotlin.jvm.internal.G.g(this.f88620d, clickableSemanticsElement.f88620d) && kotlin.jvm.internal.G.g(this.f88621e, clickableSemanticsElement.f88621e) && this.f88622f == clickableSemanticsElement.f88622f && kotlin.jvm.internal.G.g(this.f88623g, clickableSemanticsElement.f88623g) && this.f88624h == clickableSemanticsElement.f88624h;
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        int iA = C1635o.a(this.f88619c) * 31;
        androidx.compose.ui.semantics.i iVar = this.f88620d;
        int iHashCode = (iA + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = this.f88621e;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        InterfaceC4376a<L0> interfaceC4376a = this.f88622f;
        int iHashCode3 = (iHashCode2 + (interfaceC4376a != null ? interfaceC4376a.hashCode() : 0)) * 31;
        String str2 = this.f88623g;
        return this.f88624h.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ClickableSemanticsNode c() {
        return new ClickableSemanticsNode(this.f88619c, this.f88623g, this.f88620d, this.f88624h, this.f88621e, this.f88622f);
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull ClickableSemanticsNode clickableSemanticsNode) {
        clickableSemanticsNode.g3(this.f88619c, this.f88623g, this.f88620d, this.f88624h, this.f88621e, this.f88622f);
    }

    public ClickableSemanticsElement(boolean z10, androidx.compose.ui.semantics.i iVar, String str, InterfaceC4376a<L0> interfaceC4376a, String str2, InterfaceC4376a<L0> interfaceC4376a2) {
        this.f88619c = z10;
        this.f88620d = iVar;
        this.f88621e = str;
        this.f88622f = interfaceC4376a;
        this.f88623g = str2;
        this.f88624h = interfaceC4376a2;
    }
}
