package Q3;

import androidx.recyclerview.widget.C2646i;
import java.util.List;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class d extends C2646i.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65833c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<c> f65834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<c> f65835b;

    public d(@NotNull List<c> oldList, @NotNull List<c> newList) {
        G.p(oldList, "oldList");
        G.p(newList, "newList");
        this.f65834a = oldList;
        this.f65835b = newList;
    }

    @Override // androidx.recyclerview.widget.C2646i.b
    public boolean a(int i10, int i11) {
        return G.g(this.f65834a.get(i10), this.f65835b.get(i11));
    }

    @Override // androidx.recyclerview.widget.C2646i.b
    public boolean b(int i10, int i11) {
        return this.f65834a.get(i10).f65829a == this.f65835b.get(i11).f65829a;
    }

    @Override // androidx.recyclerview.widget.C2646i.b
    public int d() {
        return this.f65835b.size();
    }

    @Override // androidx.recyclerview.widget.C2646i.b
    public int e() {
        return this.f65834a.size();
    }
}
