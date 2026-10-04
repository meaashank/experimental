package com.prism.lib_google_billing;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Y;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f189070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Y f189071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Y.f f189072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Y.b f189073d;

    public m(@NotNull String planId, @NotNull Y productDetails, @Nullable Y.f fVar, @Nullable Y.b bVar) {
        G.p(planId, "planId");
        G.p(productDetails, "productDetails");
        this.f189070a = planId;
        this.f189071b = productDetails;
        this.f189072c = fVar;
        this.f189073d = bVar;
    }

    public static /* synthetic */ m f(m mVar, String str, Y y10, Y.f fVar, Y.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mVar.f189070a;
        }
        if ((i10 & 2) != 0) {
            y10 = mVar.f189071b;
        }
        if ((i10 & 4) != 0) {
            fVar = mVar.f189072c;
        }
        if ((i10 & 8) != 0) {
            bVar = mVar.f189073d;
        }
        return mVar.e(str, y10, fVar, bVar);
    }

    @NotNull
    public final String a() {
        return this.f189070a;
    }

    @NotNull
    public final Y b() {
        return this.f189071b;
    }

    @Nullable
    public final Y.f c() {
        return this.f189072c;
    }

    @Nullable
    public final Y.b d() {
        return this.f189073d;
    }

    @NotNull
    public final m e(@NotNull String planId, @NotNull Y productDetails, @Nullable Y.f fVar, @Nullable Y.b bVar) {
        G.p(planId, "planId");
        G.p(productDetails, "productDetails");
        return new m(planId, productDetails, fVar, bVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return G.g(this.f189070a, mVar.f189070a) && G.g(this.f189071b, mVar.f189071b) && G.g(this.f189072c, mVar.f189072c) && G.g(this.f189073d, mVar.f189073d);
    }

    @NotNull
    public final String g() {
        String str = this.f189071b.f136590g;
        G.o(str, "getDescription(...)");
        return str;
    }

    @Nullable
    public final Y.b h() {
        return this.f189073d;
    }

    public int hashCode() {
        int iA = androidx.compose.foundation.text.modifiers.l.a(this.f189071b.f136584a, this.f189070a.hashCode() * 31, 31);
        Y.f fVar = this.f189072c;
        int iHashCode = (iA + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Y.b bVar = this.f189073d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public final String i() {
        if (G.g(this.f189071b.f136587d, BillingClient.f.f136320w0)) {
            String str = this.f189071b.f136589f;
            G.m(str);
            return str;
        }
        Y.f fVar = this.f189072c;
        if (fVar == null) {
            return "";
        }
        if (fVar.f136638d.a().size() < 2) {
            String str2 = this.f189072c.f136638d.a().get(0).f136628d;
            G.m(str2);
            return str2;
        }
        String str3 = this.f189072c.f136638d.a().get(1).f136628d;
        G.m(str3);
        return str3;
    }

    @NotNull
    public final String j() {
        return this.f189070a;
    }

    @NotNull
    public final String k() {
        String str;
        if (G.g(this.f189071b.f136587d, BillingClient.f.f136320w0)) {
            Y.b bVarC = this.f189073d;
            if (bVarC == null) {
                bVarC = this.f189071b.c();
            }
            return (bVarC == null || (str = bVarC.f136597a) == null) ? "" : str;
        }
        Y.f fVar = this.f189072c;
        if (fVar == null) {
            return "";
        }
        if (fVar.f136638d.a().size() < 2) {
            String str2 = this.f189072c.f136638d.a().get(0).f136625a;
            G.m(str2);
            return str2;
        }
        String str3 = this.f189072c.f136638d.a().get(1).f136625a;
        G.m(str3);
        return str3;
    }

    @NotNull
    public final Y l() {
        return this.f189071b;
    }

    @Nullable
    public final Y.f m() {
        return this.f189072c;
    }

    @Nullable
    public final String n() {
        Y.f fVar;
        if (G.g(this.f189071b.f136587d, BillingClient.f.f136320w0) || (fVar = this.f189072c) == null || fVar.f136638d.a().size() < 2) {
            return null;
        }
        Y.c cVar = this.f189072c.f136638d.a().get(0);
        String str = cVar.f136628d;
        G.o(str, "getBillingPeriod(...)");
        if (!F.J2(str, "P", true)) {
            String str2 = cVar.f136628d;
            G.o(str2, "getBillingPeriod(...)");
            return str2;
        }
        String str3 = cVar.f136628d;
        G.o(str3, "getBillingPeriod(...)");
        String strSubstring = str3.substring(1, cVar.f136628d.length() - 1);
        G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public String toString() {
        return "PurchasePlan(planId=" + this.f189070a + ", productDetails=" + this.f189071b + ", productOfferDetails=" + this.f189072c + ", oneTimeOfferDetails=" + this.f189073d + ")";
    }

    public /* synthetic */ m(String str, Y y10, Y.f fVar, Y.b bVar, int i10, C4969v c4969v) {
        this(str, y10, (i10 & 4) != 0 ? null : fVar, (i10 & 8) != 0 ? null : bVar);
    }
}
