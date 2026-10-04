package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.compose.foundation.text.modifiers.l;
import java.time.Instant;
import java.util.List;
import k2.C4817a;
import k2.C4818b;
import k2.C4819c;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import l2.H;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomAudience {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C4819c f116049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f116050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Uri f116051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Uri f116052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<C4817a> f116053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Instant f116054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Instant f116055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final C4818b f116056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final H f116057i;

    public static final class Builder {

        @Nullable
        private Instant activationTime;

        @NotNull
        private List<C4817a> ads;

        @NotNull
        private Uri biddingLogicUri;

        @NotNull
        private C4819c buyer;

        @NotNull
        private Uri dailyUpdateUri;

        @Nullable
        private Instant expirationTime;

        @NotNull
        private String name;

        @Nullable
        private H trustedBiddingData;

        @Nullable
        private C4818b userBiddingSignals;

        public Builder(@NotNull C4819c buyer, @NotNull String name, @NotNull Uri dailyUpdateUri, @NotNull Uri biddingLogicUri, @NotNull List<C4817a> ads) {
            G.p(buyer, "buyer");
            G.p(name, "name");
            G.p(dailyUpdateUri, "dailyUpdateUri");
            G.p(biddingLogicUri, "biddingLogicUri");
            G.p(ads, "ads");
            this.buyer = buyer;
            this.name = name;
            this.dailyUpdateUri = dailyUpdateUri;
            this.biddingLogicUri = biddingLogicUri;
            this.ads = ads;
        }

        @NotNull
        public final CustomAudience build() {
            return new CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }

        @NotNull
        public final Builder setActivationTime(@NotNull Instant activationTime) {
            G.p(activationTime, "activationTime");
            this.activationTime = activationTime;
            return this;
        }

        @NotNull
        public final Builder setAds(@NotNull List<C4817a> ads) {
            G.p(ads, "ads");
            this.ads = ads;
            return this;
        }

        @NotNull
        public final Builder setBiddingLogicUri(@NotNull Uri biddingLogicUri) {
            G.p(biddingLogicUri, "biddingLogicUri");
            this.biddingLogicUri = biddingLogicUri;
            return this;
        }

        @NotNull
        public final Builder setBuyer(@NotNull C4819c buyer) {
            G.p(buyer, "buyer");
            this.buyer = buyer;
            return this;
        }

        @NotNull
        public final Builder setDailyUpdateUri(@NotNull Uri dailyUpdateUri) {
            G.p(dailyUpdateUri, "dailyUpdateUri");
            this.dailyUpdateUri = dailyUpdateUri;
            return this;
        }

        @NotNull
        public final Builder setExpirationTime(@NotNull Instant expirationTime) {
            G.p(expirationTime, "expirationTime");
            this.expirationTime = expirationTime;
            return this;
        }

        @NotNull
        public final Builder setName(@NotNull String name) {
            G.p(name, "name");
            this.name = name;
            return this;
        }

        @NotNull
        public final Builder setTrustedBiddingData(@NotNull H trustedBiddingSignals) {
            G.p(trustedBiddingSignals, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingSignals;
            return this;
        }

        @NotNull
        public final Builder setUserBiddingSignals(@NotNull C4818b userBiddingSignals) {
            G.p(userBiddingSignals, "userBiddingSignals");
            this.userBiddingSignals = userBiddingSignals;
            return this;
        }
    }

    public CustomAudience(@NotNull C4819c buyer, @NotNull String name, @NotNull Uri dailyUpdateUri, @NotNull Uri biddingLogicUri, @NotNull List<C4817a> ads, @Nullable Instant instant, @Nullable Instant instant2, @Nullable C4818b c4818b, @Nullable H h10) {
        G.p(buyer, "buyer");
        G.p(name, "name");
        G.p(dailyUpdateUri, "dailyUpdateUri");
        G.p(biddingLogicUri, "biddingLogicUri");
        G.p(ads, "ads");
        this.f116049a = buyer;
        this.f116050b = name;
        this.f116051c = dailyUpdateUri;
        this.f116052d = biddingLogicUri;
        this.f116053e = ads;
        this.f116054f = instant;
        this.f116055g = instant2;
        this.f116056h = c4818b;
        this.f116057i = h10;
    }

    @Nullable
    public final Instant a() {
        return this.f116054f;
    }

    @NotNull
    public final List<C4817a> b() {
        return this.f116053e;
    }

    @NotNull
    public final Uri c() {
        return this.f116052d;
    }

    @NotNull
    public final C4819c d() {
        return this.f116049a;
    }

    @NotNull
    public final Uri e() {
        return this.f116051c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) obj;
        return G.g(this.f116049a, customAudience.f116049a) && G.g(this.f116050b, customAudience.f116050b) && G.g(this.f116054f, customAudience.f116054f) && G.g(this.f116055g, customAudience.f116055g) && G.g(this.f116051c, customAudience.f116051c) && G.g(this.f116056h, customAudience.f116056h) && G.g(this.f116057i, customAudience.f116057i) && G.g(this.f116053e, customAudience.f116053e);
    }

    @Nullable
    public final Instant f() {
        return this.f116055g;
    }

    @NotNull
    public final String g() {
        return this.f116050b;
    }

    @Nullable
    public final H h() {
        return this.f116057i;
    }

    public int hashCode() {
        int iA = l.a(this.f116050b, this.f116049a.f214345a.hashCode() * 31, 31);
        Instant instant = this.f116054f;
        int iHashCode = (iA + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.f116055g;
        int iHashCode2 = (this.f116051c.hashCode() + ((iHashCode + (instant2 != null ? instant2.hashCode() : 0)) * 31)) * 31;
        C4818b c4818b = this.f116056h;
        int iHashCode3 = (iHashCode2 + (c4818b != null ? c4818b.f214344a.hashCode() : 0)) * 31;
        H h10 = this.f116057i;
        int iHashCode4 = h10 != null ? h10.hashCode() : 0;
        return this.f116053e.hashCode() + ((this.f116052d.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
    }

    @Nullable
    public final C4818b i() {
        return this.f116056h;
    }

    @NotNull
    public String toString() {
        return "CustomAudience: buyer=" + this.f116052d + ", activationTime=" + this.f116054f + ", expirationTime=" + this.f116055g + ", dailyUpdateUri=" + this.f116051c + ", userBiddingSignals=" + this.f116056h + ", trustedBiddingSignals=" + this.f116057i + ", biddingLogicUri=" + this.f116052d + ", ads=" + this.f116053e;
    }

    public /* synthetic */ CustomAudience(C4819c c4819c, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, C4818b c4818b, H h10, int i10, C4969v c4969v) {
        this(c4819c, str, uri, uri2, list, (i10 & 32) != 0 ? null : instant, (i10 & 64) != 0 ? null : instant2, (i10 & 128) != 0 ? null : c4818b, (i10 & 256) != 0 ? null : h10);
    }
}
