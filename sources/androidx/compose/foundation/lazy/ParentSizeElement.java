package androidx.compose.foundation.lazy;

import androidx.compose.runtime.X1;
import androidx.compose.ui.node.W;
import androidx.compose.ui.platform.C2278s0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class ParentSizeElement extends W<ParentSizeNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f91176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final X1<Integer> f91177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final X1<Integer> f91178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f91179f;

    public ParentSizeElement(float f10, @Nullable X1<Integer> x12, @Nullable X1<Integer> x13, @NotNull String str) {
        this.f91176c = f10;
        this.f91177d = x12;
        this.f91178e = x13;
        this.f91179f = str;
    }

    @Override // androidx.compose.ui.node.W
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f91176c == parentSizeElement.f91176c && G.g(this.f91177d, parentSizeElement.f91177d) && G.g(this.f91178e, parentSizeElement.f91178e);
    }

    @Override // androidx.compose.ui.node.W
    public void f(@NotNull C2278s0 c2278s0) {
        c2278s0.f103927a = this.f91179f;
        c2278s0.f103928b = Float.valueOf(this.f91176c);
    }

    @Override // androidx.compose.ui.node.W
    public int hashCode() {
        X1<Integer> x12 = this.f91177d;
        int iHashCode = (x12 != null ? x12.hashCode() : 0) * 31;
        X1<Integer> x13 = this.f91178e;
        return Float.floatToIntBits(this.f91176c) + ((iHashCode + (x13 != null ? x13.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.W
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ParentSizeNode c() {
        return new ParentSizeNode(this.f91176c, this.f91177d, this.f91178e);
    }

    public final float j() {
        return this.f91176c;
    }

    @Nullable
    public final X1<Integer> k() {
        return this.f91178e;
    }

    @NotNull
    public final String l() {
        return this.f91179f;
    }

    @Nullable
    public final X1<Integer> m() {
        return this.f91177d;
    }

    @Override // androidx.compose.ui.node.W
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(@NotNull ParentSizeNode parentSizeNode) {
        parentSizeNode.f91180o = this.f91176c;
        parentSizeNode.f91181p = this.f91177d;
        parentSizeNode.f91182q = this.f91178e;
    }

    public /* synthetic */ ParentSizeElement(float f10, X1 x12, X1 x13, String str, int i10, C4969v c4969v) {
        this(f10, (i10 & 2) != 0 ? null : x12, (i10 & 4) != 0 ? null : x13, str);
    }
}
