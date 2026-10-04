package com.inmobi.media;

import android.media.MediaMetadataRetriever;

/* JADX INFO: loaded from: classes5.dex */
public final class Z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f152655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3820z7 f152658d;

    public Z7(long j10, long j11, String referencedAssetId, C3820z7 nativeDataModel) {
        kotlin.jvm.internal.G.p(referencedAssetId, "referencedAssetId");
        kotlin.jvm.internal.G.p(nativeDataModel, "nativeDataModel");
        this.f152655a = j10;
        this.f152656b = j11;
        this.f152657c = referencedAssetId;
        this.f152658d = nativeDataModel;
    }

    public final long a() {
        long j10 = this.f152655a;
        C3639m7 c3639m7M = this.f152658d.m(this.f152657c);
        try {
            if (c3639m7M instanceof C3640m8) {
                Pc pcB = ((C3640m8) c3639m7M).b();
                String strB = pcB != null ? ((Oc) pcB).b() : null;
                if (strB != null) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(strB);
                    j10 += (long) ((this.f152656b / 100.0d) * ((mediaMetadataRetriever.extractMetadata(9) != null ? Long.parseLong(r2) : 0L) / ((long) 1000)));
                    mediaMetadataRetriever.release();
                }
            }
        } catch (Exception unused) {
        }
        return Math.max(j10, 0L);
    }
}
