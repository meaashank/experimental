package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.support.v4.media.i;
import android.view.InputEvent;
import e.T;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import o2.C5302M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@T(33)
public final class WebSourceRegistrationRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<C5302M> f116122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Uri f116123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final InputEvent f116124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Uri f116125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Uri f116126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Uri f116127f;

    public static final class Builder {

        @Nullable
        private Uri appDestination;

        @Nullable
        private InputEvent inputEvent;

        @NotNull
        private final Uri topOriginUri;

        @Nullable
        private Uri verifiedDestination;

        @Nullable
        private Uri webDestination;

        @NotNull
        private final List<C5302M> webSourceParams;

        public Builder(@NotNull List<C5302M> webSourceParams, @NotNull Uri topOriginUri) {
            G.p(webSourceParams, "webSourceParams");
            G.p(topOriginUri, "topOriginUri");
            this.webSourceParams = webSourceParams;
            this.topOriginUri = topOriginUri;
        }

        @NotNull
        public final WebSourceRegistrationRequest build() {
            return new WebSourceRegistrationRequest(this.webSourceParams, this.topOriginUri, this.inputEvent, this.appDestination, this.webDestination, this.verifiedDestination);
        }

        @NotNull
        public final Builder setAppDestination(@Nullable Uri uri) {
            this.appDestination = uri;
            return this;
        }

        @NotNull
        public final Builder setInputEvent(@NotNull InputEvent inputEvent) {
            G.p(inputEvent, "inputEvent");
            this.inputEvent = inputEvent;
            return this;
        }

        @NotNull
        public final Builder setVerifiedDestination(@Nullable Uri uri) {
            this.verifiedDestination = uri;
            return this;
        }

        @NotNull
        public final Builder setWebDestination(@Nullable Uri uri) {
            this.webDestination = uri;
            return this;
        }
    }

    public WebSourceRegistrationRequest(@NotNull List<C5302M> webSourceParams, @NotNull Uri topOriginUri, @Nullable InputEvent inputEvent, @Nullable Uri uri, @Nullable Uri uri2, @Nullable Uri uri3) {
        G.p(webSourceParams, "webSourceParams");
        G.p(topOriginUri, "topOriginUri");
        this.f116122a = webSourceParams;
        this.f116123b = topOriginUri;
        this.f116124c = inputEvent;
        this.f116125d = uri;
        this.f116126e = uri2;
        this.f116127f = uri3;
    }

    @Nullable
    public final Uri a() {
        return this.f116125d;
    }

    @Nullable
    public final InputEvent b() {
        return this.f116124c;
    }

    @NotNull
    public final Uri c() {
        return this.f116123b;
    }

    @Nullable
    public final Uri d() {
        return this.f116127f;
    }

    @Nullable
    public final Uri e() {
        return this.f116126e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSourceRegistrationRequest)) {
            return false;
        }
        WebSourceRegistrationRequest webSourceRegistrationRequest = (WebSourceRegistrationRequest) obj;
        return G.g(this.f116122a, webSourceRegistrationRequest.f116122a) && G.g(this.f116126e, webSourceRegistrationRequest.f116126e) && G.g(this.f116125d, webSourceRegistrationRequest.f116125d) && G.g(this.f116123b, webSourceRegistrationRequest.f116123b) && G.g(this.f116124c, webSourceRegistrationRequest.f116124c) && G.g(this.f116127f, webSourceRegistrationRequest.f116127f);
    }

    @NotNull
    public final List<C5302M> f() {
        return this.f116122a;
    }

    public int hashCode() {
        int iHashCode = this.f116123b.hashCode() + (this.f116122a.hashCode() * 31);
        InputEvent inputEvent = this.f116124c;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.f116125d;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f116126e;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        int iHashCode2 = this.f116123b.hashCode() + (iHashCode * 31);
        InputEvent inputEvent2 = this.f116124c;
        if (inputEvent2 != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.f116127f;
        if (uri3 == null) {
            return iHashCode2;
        }
        return uri3.hashCode() + (iHashCode2 * 31);
    }

    @NotNull
    public String toString() {
        return i.a("WebSourceRegistrationRequest { ", "WebSourceParams=[" + this.f116122a + "], TopOriginUri=" + this.f116123b + ", InputEvent=" + this.f116124c + ", AppDestination=" + this.f116125d + ", WebDestination=" + this.f116126e + ", VerifiedDestination=" + this.f116127f, " }");
    }

    public /* synthetic */ WebSourceRegistrationRequest(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i10, C4969v c4969v) {
        this(list, uri, (i10 & 4) != 0 ? null : inputEvent, (i10 & 8) != 0 ? null : uri2, (i10 & 16) != 0 ? null : uri3, (i10 & 32) != 0 ? null : uri4);
    }
}
