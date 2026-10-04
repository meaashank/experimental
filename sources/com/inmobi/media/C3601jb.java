package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3601jb extends H1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f153060b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3601jb(View adView, AdConfig.AdQualityConfig adQualityConfig) {
        super(adQualityConfig);
        kotlin.jvm.internal.G.p(adView, "adView");
        kotlin.jvm.internal.G.p(adQualityConfig, "adQualityConfig");
        this.f153060b = new WeakReference(adView);
    }

    @Override // com.inmobi.media.InterfaceC3478b0
    public final Object a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        View view = (View) this.f153060b.get();
        if (view == null) {
            Log.i("ScreenShotProcess", "view reference lost. aborting...");
            String message = "fail - time taken - " + (System.currentTimeMillis() - jCurrentTimeMillis);
            kotlin.jvm.internal.G.p(message, "message");
            Log.i("ScreenShotProcess", message);
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.G.o(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        String message2 = "success - time taken - " + (System.currentTimeMillis() - jCurrentTimeMillis);
        kotlin.jvm.internal.G.p(message2, "message");
        Log.i("ScreenShotProcess", message2);
        return a(bitmapCreateBitmap);
    }
}
