package com.prism.gaia.helper.utils;

/* JADX INFO: renamed from: com.prism.gaia.helper.utils.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C3920c {
    public static void a(Class<?>[] clsArr, Object[] objArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            Class<?> cls = clsArr[i10];
            if (cls == Integer.TYPE && objArr[i10] == null) {
                objArr[i10] = 0;
            } else if (cls == Boolean.TYPE && objArr[i10] == null) {
                objArr[i10] = Boolean.FALSE;
            }
        }
    }

    public static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
