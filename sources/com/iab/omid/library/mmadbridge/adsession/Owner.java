package com.iab.omid.library.mmadbridge.adsession;

import Z3.f;

/* JADX INFO: loaded from: classes5.dex */
public enum Owner {
    NATIVE("native"),
    JAVASCRIPT(f.f79411h),
    NONE("none");

    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
