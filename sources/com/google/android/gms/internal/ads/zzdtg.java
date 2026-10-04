package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.util.Base64;
import androidx.compose.foundation.layout.C1711w0;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdtg {
    private final com.google.android.gms.ads.internal.util.zzbl zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdtg(com.google.android.gms.ads.internal.util.zzbl zzblVar, Clock clock, Executor executor) {
        this.zza = zzblVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzd(byte[] bArr, double d10, boolean z10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhj)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zze(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhk)).intValue())) / 2);
            }
        }
        return zze(bArr, options);
    }

    private final Bitmap zze(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.zzb;
        long jElapsedRealtime = clock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = clock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z10 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + 15 + String.valueOf(z10).length());
            C1711w0.a(sb2, "Decoded image w: ", width, " h:", height);
            sb2.append(" bytes: ");
            sb2.append(allocationByteCount);
            sb2.append(" time: ");
            sb2.append(j10);
            sb2.append(" on ui thread: ");
            sb2.append(z10);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final ListenableFuture zza(final String str, final double d10, final boolean z10) {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhl)).booleanValue() && str != null && str.startsWith(zd.b.f241358c)) ? zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzdte
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(str, d10, z10);
            }
        }, this.zzc) : zzhcy.zzk(this.zza.zza(str), new zzgub() { // from class: com.google.android.gms.internal.ads.zzdtf
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb(d10, z10, (zzato) obj);
            }
        }, this.zzc);
    }

    public final /* synthetic */ Bitmap zzb(double d10, boolean z10, zzato zzatoVar) {
        return zzd(zzatoVar.zzb, d10, z10);
    }

    public final /* synthetic */ Bitmap zzc(String str, double d10, boolean z10) {
        int iIndexOf = str.indexOf(",");
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Bad data URL: no ',' found for base64 data");
        }
        if (!str.substring(0, iIndexOf).endsWith(";base64")) {
            throw new IllegalArgumentException("Bad data URL: only base64 is supported");
        }
        int iIndexOf2 = str.indexOf(com.prism.gaia.server.accounts.b.f166434b0);
        int iIndexOf3 = str.indexOf(";");
        if (iIndexOf2 == -1 || !str.substring(iIndexOf2 + 1, iIndexOf3).startsWith("image/")) {
            throw new IllegalArgumentException("Bad data URL: only image media is supported");
        }
        return zzd(Base64.decode(str.substring(iIndexOf + 1), 0), d10, z10);
    }
}
