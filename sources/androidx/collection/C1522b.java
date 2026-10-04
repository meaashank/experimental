package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: androidx.collection.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1522b {
    public static Object a(Object[] objArr, int i10) {
        return Array.newInstance(objArr.getClass().getComponentType(), i10);
    }
}
