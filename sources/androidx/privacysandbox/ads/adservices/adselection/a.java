package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.compose.foundation.layout.T;
import java.util.List;
import java.util.Map;
import k2.C4818b;
import k2.C4819c;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C4819c f116027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Uri f116028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<C4819c> f116029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C4818b f116030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C4818b f116031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Map<C4819c, C4818b> f116032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Uri f116033g;

    public a(@NotNull C4819c seller, @NotNull Uri decisionLogicUri, @NotNull List<C4819c> customAudienceBuyers, @NotNull C4818b adSelectionSignals, @NotNull C4818b sellerSignals, @NotNull Map<C4819c, C4818b> perBuyerSignals, @NotNull Uri trustedScoringSignalsUri) {
        G.p(seller, "seller");
        G.p(decisionLogicUri, "decisionLogicUri");
        G.p(customAudienceBuyers, "customAudienceBuyers");
        G.p(adSelectionSignals, "adSelectionSignals");
        G.p(sellerSignals, "sellerSignals");
        G.p(perBuyerSignals, "perBuyerSignals");
        G.p(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.f116027a = seller;
        this.f116028b = decisionLogicUri;
        this.f116029c = customAudienceBuyers;
        this.f116030d = adSelectionSignals;
        this.f116031e = sellerSignals;
        this.f116032f = perBuyerSignals;
        this.f116033g = trustedScoringSignalsUri;
    }

    @NotNull
    public final C4818b a() {
        return this.f116030d;
    }

    @NotNull
    public final List<C4819c> b() {
        return this.f116029c;
    }

    @NotNull
    public final Uri c() {
        return this.f116028b;
    }

    @NotNull
    public final Map<C4819c, C4818b> d() {
        return this.f116032f;
    }

    @NotNull
    public final C4819c e() {
        return this.f116027a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return G.g(this.f116027a, aVar.f116027a) && G.g(this.f116028b, aVar.f116028b) && G.g(this.f116029c, aVar.f116029c) && G.g(this.f116030d, aVar.f116030d) && G.g(this.f116031e, aVar.f116031e) && G.g(this.f116032f, aVar.f116032f) && G.g(this.f116033g, aVar.f116033g);
    }

    @NotNull
    public final C4818b f() {
        return this.f116031e;
    }

    @NotNull
    public final Uri g() {
        return this.f116033g;
    }

    public int hashCode() {
        return this.f116033g.hashCode() + ((this.f116032f.hashCode() + androidx.compose.foundation.text.modifiers.l.a(this.f116031e.f214344a, androidx.compose.foundation.text.modifiers.l.a(this.f116030d.f214344a, T.a(this.f116029c, (this.f116028b.hashCode() + (this.f116027a.f214345a.hashCode() * 31)) * 31, 31), 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AdSelectionConfig: seller=" + this.f116027a + ", decisionLogicUri='" + this.f116028b + "', customAudienceBuyers=" + this.f116029c + ", adSelectionSignals=" + this.f116030d + ", sellerSignals=" + this.f116031e + ", perBuyerSignals=" + this.f116032f + ", trustedScoringSignalsUri=" + this.f116033g;
    }
}
