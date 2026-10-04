package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.android.billingclient.api.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2999g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BillingResult f136701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List f136702b;

    public C2999g0(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends C2983c0> purchasesList) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        kotlin.jvm.internal.G.p(purchasesList, "purchasesList");
        this.f136701a = billingResult;
        this.f136702b = purchasesList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static /* synthetic */ C2999g0 d(@RecentlyNonNull C2999g0 c2999g0, @RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List list, int i10, @RecentlyNonNull Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = c2999g0.f136701a;
        }
        if ((i10 & 2) != 0) {
            list = c2999g0.f136702b;
        }
        return c2999g0.c(billingResult, list);
    }

    @NotNull
    public final BillingResult a() {
        return this.f136701a;
    }

    @NotNull
    public final List<C2983c0> b() {
        return this.f136702b;
    }

    @NotNull
    public final C2999g0 c(@RecentlyNonNull BillingResult billingResult, @RecentlyNonNull List<? extends C2983c0> purchasesList) {
        kotlin.jvm.internal.G.p(billingResult, "billingResult");
        kotlin.jvm.internal.G.p(purchasesList, "purchasesList");
        return new C2999g0(billingResult, purchasesList);
    }

    @NotNull
    public final BillingResult e() {
        return this.f136701a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2999g0)) {
            return false;
        }
        C2999g0 c2999g0 = (C2999g0) obj;
        return kotlin.jvm.internal.G.g(this.f136701a, c2999g0.f136701a) && kotlin.jvm.internal.G.g(this.f136702b, c2999g0.f136702b);
    }

    @NotNull
    public final List<C2983c0> f() {
        return this.f136702b;
    }

    public int hashCode() {
        return this.f136702b.hashCode() + (this.f136701a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PurchasesResult(billingResult=" + this.f136701a + ", purchasesList=" + this.f136702b + ")";
    }
}
