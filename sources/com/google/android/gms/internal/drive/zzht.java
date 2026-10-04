package com.google.android.gms.internal.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.GmsVersion;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
final class zzht extends com.google.android.gms.drive.metadata.internal.zzb {
    public zzht(String str, Collection collection, Collection collection2, int i10) {
        super(str, collection, collection2, GmsVersion.VERSION_ORLA);
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzb, com.google.android.gms.drive.metadata.zza
    /* JADX INFO: renamed from: zze */
    public final Boolean zzc(DataHolder dataHolder, int i10, int i11) {
        return Boolean.valueOf(dataHolder.getInteger("trashed", i10, i11) == 2);
    }
}
