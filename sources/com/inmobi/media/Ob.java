package com.inmobi.media;

import androidx.compose.animation.core.C1618x;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f152347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f152348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f152349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f152350g;

    public Ob(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List priorityEventsList, double d10) {
        kotlin.jvm.internal.G.p(priorityEventsList, "priorityEventsList");
        this.f152344a = z10;
        this.f152345b = z11;
        this.f152346c = z12;
        this.f152347d = z13;
        this.f152348e = z14;
        this.f152349f = priorityEventsList;
        this.f152350g = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ob)) {
            return false;
        }
        Ob ob2 = (Ob) obj;
        return this.f152344a == ob2.f152344a && this.f152345b == ob2.f152345b && this.f152346c == ob2.f152346c && this.f152347d == ob2.f152347d && this.f152348e == ob2.f152348e && kotlin.jvm.internal.G.g(this.f152349f, ob2.f152349f) && Double.compare(this.f152350g, ob2.f152350g) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final int hashCode() {
        boolean z10 = this.f152344a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.f152345b;
        ?? r32 = z11;
        if (z11) {
            r32 = 1;
        }
        int i11 = (i10 + r32) * 31;
        boolean z12 = this.f152346c;
        ?? r33 = z12;
        if (z12) {
            r33 = 1;
        }
        int i12 = (i11 + r33) * 31;
        boolean z13 = this.f152347d;
        ?? r34 = z13;
        if (z13) {
            r34 = 1;
        }
        int i13 = (i12 + r34) * 31;
        boolean z14 = this.f152348e;
        return C1618x.a(this.f152350g) + androidx.compose.foundation.layout.T.a(this.f152349f, (i13 + (z14 ? 1 : z14)) * 31, 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f152344a + ", isImageEnabled=" + this.f152345b + ", isGIFEnabled=" + this.f152346c + ", isVideoEnabled=" + this.f152347d + ", isGeneralEventsDisabled=" + this.f152348e + ", priorityEventsList=" + this.f152349f + ", samplingFactor=" + this.f152350g + ')';
    }
}
