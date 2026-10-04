package com.tonyodev.fetch2;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.tonyodev.fetch2.DownloadNotification;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface c {
    void a(int i10);

    @NotNull
    String b(int i10, @NotNull Context context);

    void c(int i10);

    @NotNull
    String d(@NotNull Download download);

    @NotNull
    BroadcastReceiver e();

    long f();

    @NotNull
    NotificationCompat.Builder g(int i10, int i11);

    void h();

    @NotNull
    String i();

    void j(@NotNull Context context, @NotNull NotificationManager notificationManager);

    void k();

    @NotNull
    PendingIntent l(int i10, @NotNull List<? extends DownloadNotification> list, @NotNull DownloadNotification.ActionType actionType);

    @NotNull
    String m(@NotNull Context context, @NotNull DownloadNotification downloadNotification);

    @NotNull
    b n(@NotNull String str);

    boolean o(int i10, @NotNull NotificationCompat.Builder builder, @NotNull List<? extends DownloadNotification> list, @NotNull Context context);

    boolean p(@NotNull DownloadNotification downloadNotification);

    boolean q(@NotNull DownloadNotification downloadNotification);

    @NotNull
    PendingIntent r(@NotNull DownloadNotification downloadNotification, @NotNull DownloadNotification.ActionType actionType);

    boolean s(@NotNull Download download);

    void t();

    void u(@NotNull NotificationCompat.Builder builder, @NotNull DownloadNotification downloadNotification, @NotNull Context context);
}
