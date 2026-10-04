package androidx.privacysandbox.ads.adservices.topics;

import androidx.collection.C1550p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.y;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f116136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f116138c;

    public b(long j10, long j11, int i10) {
        this.f116136a = j10;
        this.f116137b = j11;
        this.f116138c = i10;
    }

    public final long a() {
        return this.f116137b;
    }

    public final long b() {
        return this.f116136a;
    }

    public final int c() {
        return this.f116138c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f116136a == bVar.f116136a && this.f116137b == bVar.f116137b && this.f116138c == bVar.f116138c;
    }

    public int hashCode() {
        return ((C1550p.a(this.f116137b) + (C1550p.a(this.f116136a) * 31)) * 31) + this.f116138c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f116136a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f116137b);
        sb2.append(", TopicCode=");
        return y.a("Topic { ", android.support.v4.media.d.a(sb2, this.f116138c, " }"));
    }
}
