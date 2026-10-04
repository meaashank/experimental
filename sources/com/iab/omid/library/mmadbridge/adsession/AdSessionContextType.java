package com.iab.omid.library.mmadbridge.adsession;

import Z3.f;

/* JADX INFO: loaded from: classes5.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT(f.f79411h);

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
