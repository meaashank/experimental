package androidx.collection;

/* JADX INFO: renamed from: androidx.collection.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1530f {
    public static <T> T[] a(T[] tArr, int i10) {
        if (tArr.length < i10) {
            return (T[]) ((Object[]) C1522b.a(tArr, i10));
        }
        if (tArr.length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
