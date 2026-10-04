package androidx.privacysandbox.ads.adservices.measurement;

import Lc.c;
import android.net.Uri;
import androidx.constraintlayout.core.parser.b;
import e.T;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.annotation.AnnotationRetention;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@T(33)
public final class DeletionRequest {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f116111g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f116112h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116113i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116114j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f116115k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Instant f116118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Instant f116119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Uri> f116120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<Uri> f116121f;

    @T(33)
    public static final class Builder {
        private final int deletionMode;

        @NotNull
        private List<? extends Uri> domainUris;

        @NotNull
        private Instant end;
        private final int matchBehavior;

        @NotNull
        private List<? extends Uri> originUris;

        @NotNull
        private Instant start;

        public Builder(int i10, int i11) {
            this.deletionMode = i10;
            this.matchBehavior = i11;
            Instant MIN = Instant.MIN;
            G.o(MIN, "MIN");
            this.start = MIN;
            Instant MAX = Instant.MAX;
            G.o(MAX, "MAX");
            this.end = MAX;
            EmptyList emptyList = EmptyList.f217510a;
            this.domainUris = emptyList;
            this.originUris = emptyList;
        }

        @NotNull
        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        @NotNull
        public final Builder setDomainUris(@NotNull List<? extends Uri> domainUris) {
            G.p(domainUris, "domainUris");
            this.domainUris = domainUris;
            return this;
        }

        @NotNull
        public final Builder setEnd(@NotNull Instant end) {
            G.p(end, "end");
            this.end = end;
            return this;
        }

        @NotNull
        public final Builder setOriginUris(@NotNull List<? extends Uri> originUris) {
            G.p(originUris, "originUris");
            this.originUris = originUris;
            return this;
        }

        @NotNull
        public final Builder setStart(@NotNull Instant start) {
            G.p(start, "start");
            this.start = start;
            return this;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.DeletionRequest$a$a, reason: collision with other inner class name */
        @c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0317a {
        }

        @c(AnnotationRetention.SOURCE)
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i10, int i11, @NotNull Instant start, @NotNull Instant end, @NotNull List<? extends Uri> domainUris, @NotNull List<? extends Uri> originUris) {
        G.p(start, "start");
        G.p(end, "end");
        G.p(domainUris, "domainUris");
        G.p(originUris, "originUris");
        this.f116116a = i10;
        this.f116117b = i11;
        this.f116118c = start;
        this.f116119d = end;
        this.f116120e = domainUris;
        this.f116121f = originUris;
    }

    public final int a() {
        return this.f116116a;
    }

    @NotNull
    public final List<Uri> b() {
        return this.f116120e;
    }

    @NotNull
    public final Instant c() {
        return this.f116119d;
    }

    public final int d() {
        return this.f116117b;
    }

    @NotNull
    public final List<Uri> e() {
        return this.f116121f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        return this.f116116a == deletionRequest.f116116a && new HashSet(this.f116120e).equals(new HashSet(deletionRequest.f116120e)) && new HashSet(this.f116121f).equals(new HashSet(deletionRequest.f116121f)) && G.g(this.f116118c, deletionRequest.f116118c) && G.g(this.f116119d, deletionRequest.f116119d) && this.f116117b == deletionRequest.f116117b;
    }

    @NotNull
    public final Instant f() {
        return this.f116118c;
    }

    public int hashCode() {
        return ((this.f116119d.hashCode() + ((this.f116118c.hashCode() + androidx.compose.foundation.layout.T.a(this.f116121f, androidx.compose.foundation.layout.T.a(this.f116120e, this.f116116a * 31, 31), 31)) * 31)) * 31) + this.f116117b;
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = b.a("DeletionRequest { DeletionMode=", this.f116116a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA", ", MatchBehavior=", this.f116117b == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE", ", Start=");
        sbA.append(this.f116118c);
        sbA.append(", End=");
        sbA.append(this.f116119d);
        sbA.append(", DomainUris=");
        sbA.append(this.f116120e);
        sbA.append(", OriginUris=");
        sbA.append(this.f116121f);
        sbA.append(" }");
        return sbA.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeletionRequest(int i10, int i11, Instant MIN, Instant MAX, List list, List list2, int i12, C4969v c4969v) {
        if ((i12 & 4) != 0) {
            MIN = Instant.MIN;
            G.o(MIN, "MIN");
        }
        Instant instant = MIN;
        if ((i12 & 8) != 0) {
            MAX = Instant.MAX;
            G.o(MAX, "MAX");
        }
        this(i10, i11, instant, MAX, (i12 & 16) != 0 ? EmptyList.f217510a : list, (i12 & 32) != 0 ? EmptyList.f217510a : list2);
    }
}
