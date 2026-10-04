package androidx.window.core;

import android.graphics.Rect;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f120066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f120067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f120068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f120069d;

    public b(int i10, int i11, int i12, int i13) {
        this.f120066a = i10;
        this.f120067b = i11;
        this.f120068c = i12;
        this.f120069d = i13;
    }

    public final int a() {
        return this.f120069d;
    }

    public final int b() {
        return this.f120069d - this.f120067b;
    }

    public final int c() {
        return this.f120066a;
    }

    public final int d() {
        return this.f120068c;
    }

    public final int e() {
        return this.f120067b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        b bVar = (b) obj;
        return this.f120066a == bVar.f120066a && this.f120067b == bVar.f120067b && this.f120068c == bVar.f120068c && this.f120069d == bVar.f120069d;
    }

    public final int f() {
        return this.f120068c - this.f120066a;
    }

    public final boolean g() {
        return b() == 0 || f() == 0;
    }

    public final boolean h() {
        return b() == 0 && f() == 0;
    }

    public int hashCode() {
        return (((((this.f120066a * 31) + this.f120067b) * 31) + this.f120068c) * 31) + this.f120069d;
    }

    @NotNull
    public final Rect i() {
        return new Rect(this.f120066a, this.f120067b, this.f120068c, this.f120069d);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) b.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f120066a);
        sb2.append(',');
        sb2.append(this.f120067b);
        sb2.append(',');
        sb2.append(this.f120068c);
        sb2.append(',');
        return android.support.v4.media.d.a(sb2, this.f120069d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        G.p(rect, "rect");
    }
}
