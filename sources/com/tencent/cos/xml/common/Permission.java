package com.tencent.cos.xml.common;

import e3.b;

/* JADX INFO: loaded from: classes7.dex */
public enum Permission {
    READ(b.f200183x),
    WRITE("WRITE"),
    FULL_CONTROL("FULL_CONTROL");

    private String permission;

    Permission(String str) {
        this.permission = str;
    }

    public static Permission fromValue(String str) {
        for (Permission permission : values()) {
            if (permission.permission.equalsIgnoreCase(str)) {
                return permission;
            }
        }
        return null;
    }

    public String getPermission() {
        return this.permission;
    }
}
