package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BillingResult f136577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final A f136578b;

    public W(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull A billingProgramAvailabilityDetails) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        kotlin.jvm.internal.G.p(billingProgramAvailabilityDetails, "billingProgramAvailabilityDetails");
        this.f136577a = billingResult;
        this.f136578b = billingProgramAvailabilityDetails;
    }

    @RecentlyNonNull
    public static /* synthetic */ W d(@RecentlyNonNull W w10, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull A a10, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = w10.f136577a;
        }
        if ((i10 & 2) != 0) {
            a10 = w10.f136578b;
        }
        return w10.c(billingResult, a10);
    }

    @NotNull
    public final BillingResult a() {
        return this.f136577a;
    }

    @NotNull
    public final A b() {
        return this.f136578b;
    }

    @NotNull
    public final W c(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull A billingProgramAvailabilityDetails) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        kotlin.jvm.internal.G.p(billingProgramAvailabilityDetails, "billingProgramAvailabilityDetails");
        return new W(billingResult, billingProgramAvailabilityDetails);
    }

    @NotNull
    public final A e() {
        return this.f136578b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return kotlin.jvm.internal.G.g(this.f136577a, w10.f136577a) && kotlin.jvm.internal.G.g(this.f136578b, w10.f136578b);
    }

    @NotNull
    public final BillingResult f() {
        return this.f136577a;
    }

    public int hashCode() {
        return this.f136578b.hashCode() + (this.f136577a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "IsBillingProgramAvailableResult(billingResult=" + this.f136577a + ", billingProgramAvailabilityDetails=" + this.f136578b + ")";
    }
}
