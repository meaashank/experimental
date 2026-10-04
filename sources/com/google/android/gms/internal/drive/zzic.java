package com.google.android.gms.internal.drive;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.gms.drive.metadata.SearchableMetadataField;

/* JADX INFO: loaded from: classes4.dex */
public final class zzic extends com.google.android.gms.drive.metadata.internal.zzb implements SearchableMetadataField<Boolean> {
    public zzic(String str, int i10) {
        super(str, GmsVersion.VERSION_HALLOUMI);
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzb, com.google.android.gms.drive.metadata.zza
    /* JADX INFO: renamed from: zze */
    public final Boolean zzc(DataHolder dataHolder, int i10, int i11) {
        return Boolean.valueOf(dataHolder.getInteger(getName(), i10, i11) != 0);
    }
}
