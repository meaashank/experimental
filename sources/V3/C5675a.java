package v3;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import w3.InterfaceC5744e;

/* JADX INFO: renamed from: v3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5675a extends AbstractC5679e<Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f239776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ComponentName f239777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RemoteViews f239778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f239779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f239780h;

    public C5675a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, int... iArr) {
        super(i10, i11);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        y3.m.f(context, "Context can not be null!");
        this.f239779g = context;
        y3.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f239778f = remoteViews;
        this.f239776d = iArr;
        this.f239780h = i12;
        this.f239777e = null;
    }

    @Override // v3.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void g(@NonNull Bitmap bitmap, @Nullable InterfaceC5744e<? super Bitmap> interfaceC5744e) {
        b(bitmap);
    }

    public final void b(@Nullable Bitmap bitmap) {
        this.f239778f.setImageViewBitmap(this.f239780h, bitmap);
        c();
    }

    public final void c() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f239779g);
        ComponentName componentName = this.f239777e;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f239778f);
        } else {
            appWidgetManager.updateAppWidget(this.f239776d, this.f239778f);
        }
    }

    @Override // v3.p
    public void d(@Nullable Drawable drawable) {
        b(null);
    }

    public C5675a(Context context, int i10, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, iArr);
    }

    public C5675a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, ComponentName componentName) {
        super(i10, i11);
        y3.m.f(context, "Context can not be null!");
        this.f239779g = context;
        y3.m.f(remoteViews, "RemoteViews object can not be null!");
        this.f239778f = remoteViews;
        y3.m.f(componentName, "ComponentName can not be null!");
        this.f239777e = componentName;
        this.f239780h = i12;
        this.f239776d = null;
    }

    public C5675a(Context context, int i10, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, componentName);
    }
}
