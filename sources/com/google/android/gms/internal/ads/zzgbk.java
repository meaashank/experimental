package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbk extends zzgay {
    private zzgvc<Integer> zza;
    private zzgvc<Integer> zzb;

    @Nullable
    private zzgba zzc;

    @Nullable
    private HttpURLConnection zzd;

    public zzgbk(zzgvc<Integer> zzgvcVar, zzgvc<Integer> zzgvcVar2, @Nullable zzgba zzgbaVar) {
        this.zza = zzgvcVar;
        this.zzb = zzgvcVar2;
        this.zzc = zzgbaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(@Nullable HttpURLConnection httpURLConnection) {
        zzgaz.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(@NonNull final URL url, final int i10) throws IOException {
        this.zza = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbc
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzc = new zzgba() { // from class: com.google.android.gms.internal.ads.zzgbd
            @Override // com.google.android.gms.internal.ads.zzgba
            public final /* synthetic */ URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(@NonNull final Network network, @NonNull final URL url, final int i10, final int i11) throws IOException {
        this.zza = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbe
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzb = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbf
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.zzc = new zzgba() { // from class: com.google.android.gms.internal.ads.zzgbg
            @Override // com.google.android.gms.internal.ads.zzgba
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzgba zzgbaVar, final int i10, final int i11) throws IOException {
        this.zza = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbh
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzb = new zzgvc() { // from class: com.google.android.gms.internal.ads.zzgbi
            @Override // com.google.android.gms.internal.ads.zzgvc
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i11);
            }
        };
        this.zzc = zzgbaVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzgaz.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzgba zzgbaVar = this.zzc;
        zzgbaVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzgbaVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public zzgbk() {
        this(zzgbj.zza, zzgbb.zza, null);
    }
}
