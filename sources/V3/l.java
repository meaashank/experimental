package v3;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.W;
import w3.InterfaceC5744e;

/* JADX INFO: loaded from: classes2.dex */
public class l extends AbstractC5679e<Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RemoteViews f239810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f239811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f239812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f239813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Notification f239814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f239815i;

    @SuppressLint({"InlinedApi"})
    @W("android.permission.POST_NOTIFICATIONS")
    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11) {
        this(context, i10, remoteViews, notification, i11, null);
    }

    @SuppressLint({"InlinedApi"})
    @W("android.permission.POST_NOTIFICATIONS")
    private void b(@Nullable Bitmap bitmap) {
        this.f239810d.setImageViewBitmap(this.f239815i, bitmap);
        c();
    }

    @SuppressLint({"InlinedApi"})
    @W("android.permission.POST_NOTIFICATIONS")
    private void c() {
        NotificationManager notificationManager = (NotificationManager) this.f239811e.getSystemService("notification");
        y3.m.f(notificationManager, "Argument must not be null");
        notificationManager.notify(this.f239813g, this.f239812f, this.f239814h);
    }

    @Override // v3.p
    @SuppressLint({"InlinedApi"})
    @W("android.permission.POST_NOTIFICATIONS")
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void g(@NonNull Bitmap bitmap, @Nullable InterfaceC5744e<? super Bitmap> interfaceC5744e) {
        b(bitmap);
    }

    @Override // v3.p
    @SuppressLint({"InlinedApi"})
    @W("android.permission.POST_NOTIFICATIONS")
    public void d(@Nullable Drawable drawable) {
        b(null);
    }

    @SuppressLint({"InlinedApi"})
    @W("android.permission.POST_NOTIFICATIONS")
    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, notification, i11, str);
    }

    @SuppressLint({"InlinedApi"})
    @W("android.permission.POST_NOTIFICATIONS")
    public l(Context context, int i10, int i11, int i12, RemoteViews remoteViews, Notification notification, int i13, String str) {
        super(i10, i11);
        y3.m.f(context, "Context must not be null!");
        this.f239811e = context;
        y3.m.f(notification, "Notification object can not be null!");
        this.f239814h = notification;
        y3.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f239810d = remoteViews;
        this.f239815i = i12;
        this.f239812f = i13;
        this.f239813g = str;
    }
}
