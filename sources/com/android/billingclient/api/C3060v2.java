package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: renamed from: com.android.billingclient.api.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3060v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List f136847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingResult f136848b;

    public C3060v2(BillingResult billingResult, @Nullable List list) {
        this.f136847a = list;
        this.f136848b = billingResult;
    }

    public final BillingResult a() {
        return this.f136848b;
    }

    @Nullable
    public final List b() {
        return this.f136847a;
    }
}
