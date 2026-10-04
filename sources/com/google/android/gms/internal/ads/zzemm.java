package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemm {

    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    public zzemm(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            MeasurementManagerFutures measurementManagerFuturesA = MeasurementManagerFutures.f116086a.a(this.zzb);
            this.zza = measurementManagerFuturesA;
            return measurementManagerFuturesA == null ? zzhcy.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesA.c();
        } catch (Exception e10) {
            return zzhcy.zzc(e10);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.d(uri, inputEvent);
        } catch (Exception e10) {
            return zzhcy.zzc(e10);
        }
    }
}
