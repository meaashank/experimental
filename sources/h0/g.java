package H0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class g {
    @T(26)
    @NotNull
    public static final Icon a(@NotNull Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    @T(26)
    @NotNull
    public static final Icon b(@NotNull Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    @T(26)
    @NotNull
    public static final Icon c(@NotNull Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    @T(26)
    @NotNull
    public static final Icon d(@NotNull byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}
