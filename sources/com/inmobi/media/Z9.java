package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public final class Z9 implements InterfaceC3478b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityResult f152659a;

    public Z9(AdQualityResult result) {
        kotlin.jvm.internal.G.p(result, "result");
        this.f152659a = result;
    }

    @Override // com.inmobi.media.InterfaceC3478b0
    public final Object a() {
        boolean z10;
        try {
            ScheduledExecutorService scheduledExecutorService = P.f152360a;
            ((S) AbstractC3531eb.f152882a.getValue()).a(this.f152659a);
            z10 = true;
        } catch (SQLiteException e10) {
            Log.e("QueueProcess", "failed to queue the result", e10);
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
