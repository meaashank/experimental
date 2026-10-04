package com.prism.commons.utils;

import android.content.pm.ComponentInfo;

/* JADX INFO: renamed from: com.prism.commons.utils.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3836a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f162073a = "/Android/data";

    /* JADX INFO: renamed from: com.prism.commons.utils.a$a, reason: collision with other inner class name */
    public static class C0661a {
        public static void a(ComponentInfo componentInfo) {
            if (C3841e.z()) {
                componentInfo.exported = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.prism.commons.utils.a$b */
    public static class b {
        public static int a(int i10) {
            return (C3841e.z() && (67108864 & i10) == 0 && (i10 & 33554432) == 0) ? i10 | 33554432 : i10;
        }
    }
}
