package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class o {
    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(@Nullable Object... objArr) {
        return Objects.hash(objArr);
    }

    public static int c(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @NonNull
    public static <T> T d(@Nullable T t10) {
        t10.getClass();
        return t10;
    }

    @NonNull
    public static <T> T e(@Nullable T t10, @NonNull String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    @Nullable
    public static String f(@Nullable Object obj, @Nullable String str) {
        return obj != null ? obj.toString() : str;
    }
}
