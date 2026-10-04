package com.google.android.play.core.hsdp.service;

import android.os.IBinder;
import com.google.android.play.core.hsdp.service.HsdpPrewarmRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzb extends HsdpPrewarmRequest.Builder {
    private String zza;
    private String zzb;
    private Map zzc;
    private IBinder zzd;

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder
    public final HsdpPrewarmRequest build() {
        String str;
        Map map;
        String str2 = this.zza;
        if (str2 != null && (str = this.zzb) != null && (map = this.zzc) != null) {
            return new zzd(str2, str, map, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" targetAppPackageName");
        }
        if (this.zzb == null) {
            sb2.append(" referrer");
        }
        if (this.zzc == null) {
            sb2.append(" extraQueryParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder
    public final HsdpPrewarmRequest.Builder setExtraQueryParams(Map<String, String> map) {
        if (map == null) {
            throw new NullPointerException("Null extraQueryParams");
        }
        this.zzc = map;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder
    public final HsdpPrewarmRequest.Builder setReferrer(String str) {
        if (str == null) {
            throw new NullPointerException("Null referrer");
        }
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder
    public final HsdpPrewarmRequest.Builder setTargetAppPackageName(String str) {
        if (str == null) {
            throw new NullPointerException("Null targetAppPackageName");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder
    public final HsdpPrewarmRequest.Builder setWindowToken(IBinder iBinder) {
        this.zzd = iBinder;
        return this;
    }
}
