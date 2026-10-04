package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: com.android.billingclient.api.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@W2
public final class C3007i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Y> f136708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C3011j0> f136709b;

    public C3007i0(List<Y> list, List<C3011j0> list2) {
        this.f136708a = list;
        this.f136709b = list2;
    }

    @NonNull
    public static C3007i0 a(@NonNull List<Y> list, @NonNull List<C3011j0> list2) {
        return new C3007i0(list, list2);
    }

    @NonNull
    @W2
    public List<Y> b() {
        return this.f136708a;
    }

    @NonNull
    @W2
    public List<C3011j0> c() {
        return this.f136709b;
    }
}
