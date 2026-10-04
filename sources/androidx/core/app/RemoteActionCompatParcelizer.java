package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f110953a = (IconCompat) versionedParcel.h0(remoteActionCompat.f110953a, 1);
        remoteActionCompat.f110954b = versionedParcel.w(remoteActionCompat.f110954b, 2);
        remoteActionCompat.f110955c = versionedParcel.w(remoteActionCompat.f110955c, 3);
        remoteActionCompat.f110956d = (PendingIntent) versionedParcel.W(remoteActionCompat.f110956d, 4);
        remoteActionCompat.f110957e = versionedParcel.m(remoteActionCompat.f110957e, 5);
        remoteActionCompat.f110958f = versionedParcel.m(remoteActionCompat.f110958f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.j0(false, false);
        versionedParcel.m1(remoteActionCompat.f110953a, 1);
        versionedParcel.z0(remoteActionCompat.f110954b, 2);
        versionedParcel.z0(remoteActionCompat.f110955c, 3);
        versionedParcel.X0(remoteActionCompat.f110956d, 4);
        versionedParcel.n0(remoteActionCompat.f110957e, 5);
        versionedParcel.n0(remoteActionCompat.f110958f, 6);
    }
}
