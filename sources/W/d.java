package w;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import e.T;

/* JADX INFO: loaded from: classes.dex */
@T(23)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class d {
    @NonNull
    public static Parcelable[] a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
