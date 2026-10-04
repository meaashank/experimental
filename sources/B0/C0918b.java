package B0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.C2407f;

/* JADX INFO: renamed from: B0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0918b {
    @Nullable
    public static Cursor a(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable CancellationSignal cancellationSignal) throws Exception {
        try {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception e10) {
            if (e10 instanceof OperationCanceledException) {
                throw new androidx.core.os.OperationCanceledException();
            }
            throw e10;
        }
    }

    @Nullable
    @Deprecated
    public static Cursor b(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable C2407f c2407f) {
        return a(contentResolver, uri, strArr, str, strArr2, str2, c2407f != null ? (CancellationSignal) c2407f.b() : null);
    }
}
