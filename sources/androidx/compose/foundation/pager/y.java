package androidx.compose.foundation.pager;

import androidx.collection.LruCacheKt;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPagerSnapDistance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n+ 2 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceKt\n*L\n1#1,109:1\n105#2,4:110\n*S KotlinDebug\n*F\n+ 1 PagerSnapDistance.kt\nandroidx/compose/foundation/pager/PagerSnapDistanceMaxPages\n*L\n78#1:110,4\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class y implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f92541c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92542b;

    public y(int i10) {
        this.f92542b = i10;
    }

    @Override // androidx.compose.foundation.pager.w
    public int a(int i10, int i11, float f10, int i12, int i13) {
        long j10 = i10;
        int i14 = this.f92542b;
        long j11 = j10 - ((long) i14);
        if (j11 < 0) {
            j11 = 0;
        }
        int i15 = (int) j11;
        long j12 = j10 + ((long) i14);
        if (j12 > LruCacheKt.f86729a) {
            j12 = 2147483647L;
        }
        return md.u.K(i11, i15, (int) j12);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof y) && this.f92542b == ((y) obj).f92542b;
    }

    public int hashCode() {
        return this.f92542b;
    }
}
