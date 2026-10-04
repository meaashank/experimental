package v5;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: v5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5685a {
    @SafeVarargs
    public static <T> T[] a(Class<T> cls, @NonNull T[]... tArr) {
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, length));
        int i10 = 0;
        for (T[] tArr4 : tArr) {
            for (T t10 : tArr4) {
                Array.set(tArr3, i10, t10);
                i10++;
            }
        }
        return tArr3;
    }
}
