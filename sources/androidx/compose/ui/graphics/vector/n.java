package androidx.compose.ui.graphics.vector;

import androidx.compose.animation.B;
import androidx.compose.foundation.layout.T;
import androidx.compose.runtime.InterfaceC1924k0;
import fd.InterfaceC4418a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class n extends p implements Iterable<p>, InterfaceC4418a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f101701l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f101703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f101704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f101705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f101706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f101707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f101708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f101709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<e> f101710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<p> f101711k;

    public static final class a implements Iterator<p>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Iterator<p> f101712a;

        public a(n nVar) {
            this.f101712a = nVar.f101711k.iterator();
        }

        @NotNull
        public final Iterator<p> b() {
            return this.f101712a;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p next() {
            return this.f101712a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f101712a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            return G.g(this.f101702b, nVar.f101702b) && this.f101703c == nVar.f101703c && this.f101704d == nVar.f101704d && this.f101705e == nVar.f101705e && this.f101706f == nVar.f101706f && this.f101707g == nVar.f101707g && this.f101708h == nVar.f101708h && this.f101709i == nVar.f101709i && G.g(this.f101710j, nVar.f101710j) && G.g(this.f101711k, nVar.f101711k);
        }
        return false;
    }

    @NotNull
    public final p g(int i10) {
        return this.f101711k.get(i10);
    }

    public final int getSize() {
        return this.f101711k.size();
    }

    @NotNull
    public final List<e> h() {
        return this.f101710j;
    }

    public int hashCode() {
        return this.f101711k.hashCode() + T.a(this.f101710j, B.a(this.f101709i, B.a(this.f101708h, B.a(this.f101707g, B.a(this.f101706f, B.a(this.f101705e, B.a(this.f101704d, B.a(this.f101703c, this.f101702b.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final String i() {
        return this.f101702b;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<p> iterator() {
        return new a(this);
    }

    public final float j() {
        return this.f101704d;
    }

    public final float o() {
        return this.f101705e;
    }

    public final float q() {
        return this.f101703c;
    }

    public final float t() {
        return this.f101706f;
    }

    public final float v() {
        return this.f101707g;
    }

    public final float w() {
        return this.f101708h;
    }

    public final float x() {
        return this.f101709i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends e> list, @NotNull List<? extends p> list2) {
        this.f101702b = str;
        this.f101703c = f10;
        this.f101704d = f11;
        this.f101705e = f12;
        this.f101706f = f13;
        this.f101707g = f14;
        this.f101708h = f15;
        this.f101709i = f16;
        this.f101710j = list;
        this.f101711k = list2;
    }

    public n(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? o.h() : list, (i10 & 512) != 0 ? EmptyList.f217510a : list2);
    }
}
