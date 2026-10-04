package com.inmobi.media;

import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class M extends Lambda implements ed.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f152206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdQualityResult f152207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n10, AdQualityResult adQualityResult) {
        super(1);
        this.f152206a = n10;
        this.f152207b = adQualityResult;
    }

    @Override // ed.l
    public final Object invoke(Object obj) {
        C3670oa c3670oa;
        C3670oa c3670oa2;
        T8 t82 = (T8) obj;
        if (J3.f152098d.equals(t82)) {
            Log.i("AdQualityBeaconExecutor", "no network... skipping cleanup");
        } else {
            Log.i("AdQualityBeaconExecutor", "beacon hit completed... cleaning up");
            if (t82 == null) {
                WeakReference weakReference = (WeakReference) this.f152206a.f152264d.get(this.f152207b.getBeaconUrl());
                if (weakReference != null && (c3670oa2 = (C3670oa) weakReference.get()) != null) {
                    c3670oa2.f153245a.b("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                WeakReference weakReference2 = (WeakReference) this.f152206a.f152264d.get(this.f152207b.getBeaconUrl());
                if (weakReference2 != null && (c3670oa = (C3670oa) weakReference2.get()) != null) {
                    c3670oa.f153245a.b("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            N n10 = this.f152206a;
            AdQualityResult result = this.f152207b;
            n10.getClass();
            kotlin.jvm.internal.G.p(result, "result");
            try {
                ScheduledExecutorService scheduledExecutorService = P.f152360a;
                S s10 = (S) AbstractC3531eb.f152882a.getValue();
                s10.getClass();
                Log.i("AdQualityDao", "de-queueing");
                s10.a("image_location=?", new String[]{result.getImageLocation()});
                if (s10.f152421b != null) {
                    Log.i("AdQualityDao", "sending callback - dequeue");
                }
                if (result.getImageLocation().length() == 0) {
                    Log.i("AdQualityBeaconExecutor", "no image to clear. clean up done.");
                } else {
                    File file = new File(result.getImageLocation());
                    Log.i("AdQualityBeaconExecutor", "deleting file");
                    String message = "delete file result - " + file.delete();
                    kotlin.jvm.internal.G.p(message, "message");
                    Log.i("AdQualityBeaconExecutor", message);
                }
            } catch (Exception e10) {
                Log.e("AdQualityBeaconExecutor", "exception while cleanup", e10);
            }
        }
        return kotlin.L0.f217464a;
    }
}
