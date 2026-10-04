package butterknife;

import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.e0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewCollections {
    private ViewCollections() {
    }

    @e0
    @SafeVarargs
    public static <T extends View> void run(@NonNull List<T> list, @NonNull Action<? super T>... actionArr) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            for (Action<? super T> action : actionArr) {
                action.apply(list.get(i10), i10);
            }
        }
    }

    @e0
    public static <T extends View, V> void set(@NonNull List<T> list, @NonNull Setter<? super T, V> setter, @Nullable V v10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            setter.set(list.get(i10), v10, i10);
        }
    }

    @e0
    public static <T extends View, V> void set(@NonNull T[] tArr, @NonNull Setter<? super T, V> setter, @Nullable V v10) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            setter.set(tArr[i10], v10, i10);
        }
    }

    @e0
    @SafeVarargs
    public static <T extends View> void run(@NonNull T[] tArr, @NonNull Action<? super T>... actionArr) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            for (Action<? super T> action : actionArr) {
                action.apply(tArr[i10], i10);
            }
        }
    }

    @e0
    public static <T extends View, V> void set(@NonNull T t10, @NonNull Setter<? super T, V> setter, @Nullable V v10) {
        setter.set(t10, v10, 0);
    }

    @e0
    public static <T extends View, V> void set(@NonNull List<T> list, @NonNull Property<? super T, V> property, @Nullable V v10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            property.set(list.get(i10), v10);
        }
    }

    @e0
    public static <T extends View> void run(@NonNull List<T> list, @NonNull Action<? super T> action) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            action.apply(list.get(i10), i10);
        }
    }

    @e0
    public static <T extends View, V> void set(@NonNull T[] tArr, @NonNull Property<? super T, V> property, @Nullable V v10) {
        for (T t10 : tArr) {
            property.set(t10, v10);
        }
    }

    @e0
    public static <T extends View> void run(@NonNull T[] tArr, @NonNull Action<? super T> action) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            action.apply(tArr[i10], i10);
        }
    }

    @e0
    public static <T extends View, V> void set(@NonNull T t10, @NonNull Property<? super T, V> property, @Nullable V v10) {
        property.set(t10, v10);
    }

    @e0
    @SafeVarargs
    public static <T extends View> void run(@NonNull T t10, @NonNull Action<? super T>... actionArr) {
        for (Action<? super T> action : actionArr) {
            action.apply(t10, 0);
        }
    }

    @e0
    public static <T extends View> void run(@NonNull T t10, @NonNull Action<? super T> action) {
        action.apply(t10, 0);
    }
}
