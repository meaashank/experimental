package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.PixelCopy;
import android.view.Window;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C9;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes5.dex */
public final class C9 extends H1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f151821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f151822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9(Window window, AdConfig.AdQualityConfig config) {
        super(config);
        kotlin.jvm.internal.G.p(window, "window");
        kotlin.jvm.internal.G.p(config, "config");
        this.f151821b = window;
        this.f151822c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.InterfaceC3478b0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Bitmap a() throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int width = this.f151821b.getDecorView().getWidth();
        int height = this.f151821b.getDecorView().getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.G.o(bitmapCreateBitmap, "createBitmap(...)");
        Rect rect = new Rect(0, 0, width, height);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int layerType = this.f151821b.getDecorView().getLayerType();
        this.f151821b.getDecorView().setLayerType(0, null);
        PixelCopy.request(this.f151821b, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: F5.h
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i10) {
                C9.a(booleanRef, this, i10);
            }
        }, new Handler(Looper.getMainLooper()));
        while (!this.f151822c.get()) {
            Thread.sleep(500L);
        }
        String message = "success - " + booleanRef.f217897a + " - time - " + (System.currentTimeMillis() - jCurrentTimeMillis);
        kotlin.jvm.internal.G.p(message, "message");
        Log.i("PixelCopyScreenShotProcess", message);
        this.f151821b.getDecorView().setLayerType(layerType, null);
        if (!booleanRef.f217897a) {
            return null;
        }
        Log.i("PixelCopyScreenShotProcess", "success");
        return a(bitmapCreateBitmap);
    }

    public static final void a(Ref.BooleanRef isSuccess, C9 this$0, int i10) {
        kotlin.jvm.internal.G.p(isSuccess, "$isSuccess");
        kotlin.jvm.internal.G.p(this$0, "this$0");
        if (i10 == 0) {
            isSuccess.f217897a = true;
        }
        String message = "capture result - success - " + isSuccess.f217897a;
        kotlin.jvm.internal.G.p(message, "message");
        Log.i("PixelCopyScreenShotProcess", message);
        this$0.f151822c.set(true);
    }
}
