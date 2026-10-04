package E0;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    @T(28)
    public static class a {
        public static CursorWindow a(String str, long j10) {
            return new CursorWindow(str, j10);
        }
    }

    @NonNull
    public static CursorWindow a(@Nullable String str, long j10) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(str, j10) : new CursorWindow(str);
    }
}
