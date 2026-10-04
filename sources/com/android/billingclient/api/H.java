package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BillingResult f136405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C2990e f136406b;

    public H(@RecentlyNonNull BillingResult billingResult, @Nullable C2990e c2990e) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        this.f136405a = billingResult;
        this.f136406b = c2990e;
    }

    @RecentlyNonNull
    public static /* synthetic */ H d(@RecentlyNonNull H h10, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull C2990e c2990e, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = h10.f136405a;
        }
        if ((i10 & 2) != 0) {
            c2990e = h10.f136406b;
        }
        return h10.c(billingResult, c2990e);
    }

    @NotNull
    public final BillingResult a() {
        return this.f136405a;
    }

    @RecentlyNullable
    public final C2990e b() {
        return this.f136406b;
    }

    @NotNull
    public final H c(@RecentlyNonNull BillingResult billingResult, @Nullable C2990e c2990e) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        return new H(billingResult, c2990e);
    }

    @RecentlyNullable
    public final C2990e e() {
        return this.f136406b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return kotlin.jvm.internal.G.g(this.f136405a, h10.f136405a) && kotlin.jvm.internal.G.g(this.f136406b, h10.f136406b);
    }

    @NotNull
    public final BillingResult f() {
        return this.f136405a;
    }

    public int hashCode() {
        int iHashCode = this.f136405a.hashCode() * 31;
        C2990e c2990e = this.f136406b;
        return iHashCode + (c2990e == null ? 0 : c2990e.hashCode());
    }

    @NotNull
    public String toString() {
        return "CreateAlternativeBillingOnlyReportingDetailsResult(billingResult=" + this.f136405a + ", alternativeBillingOnlyReportingDetails=" + this.f136406b + ")";
    }
}
