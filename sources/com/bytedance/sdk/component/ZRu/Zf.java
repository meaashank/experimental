package com.bytedance.sdk.component.ZRu;

/* JADX INFO: loaded from: classes2.dex */
public enum Zf {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    @Override // java.lang.Enum
    public String toString() {
        return this == PRIVATE ? "private" : this == PROTECTED ? "protected" : "public";
    }
}
