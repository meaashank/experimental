package B0;

import android.content.ContentValues;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: B0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0919c {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ContentValues a(@NotNull Pair<String, ? extends Object>... pairArr) {
        ContentValues contentValues = new ContentValues(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = pair.f217467a;
            B b10 = pair.f217468b;
            if (b10 == 0) {
                contentValues.putNull(str);
            } else if (b10 instanceof String) {
                contentValues.put(str, (String) b10);
            } else if (b10 instanceof Integer) {
                contentValues.put(str, (Integer) b10);
            } else if (b10 instanceof Long) {
                contentValues.put(str, (Long) b10);
            } else if (b10 instanceof Boolean) {
                contentValues.put(str, (Boolean) b10);
            } else if (b10 instanceof Float) {
                contentValues.put(str, (Float) b10);
            } else if (b10 instanceof Double) {
                contentValues.put(str, (Double) b10);
            } else if (b10 instanceof byte[]) {
                contentValues.put(str, (byte[]) b10);
            } else if (b10 instanceof Byte) {
                contentValues.put(str, (Byte) b10);
            } else {
                if (!(b10 instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                contentValues.put(str, (Short) b10);
            }
        }
        return contentValues;
    }
}
