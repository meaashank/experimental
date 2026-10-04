package com.google.android.gms.drive.metadata.internal;

import com.android.launcher3.IconCache;
import com.google.android.gms.ads.internal.util.e;
import com.google.android.gms.auth.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collections;
import s.C5555a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu extends zzm<UserMetadata> {
    public zzu(String str, int i10) {
        super(str, Arrays.asList(zza(str, "permissionId"), zza(str, "displayName"), zza(str, "picture"), zza(str, "isAuthenticatedUser"), zza(str, C5555a.f237756a)), Collections.EMPTY_LIST, GmsVersion.VERSION_MANCHEGO);
    }

    private static String zza(String str, String str2) {
        return b.a(e.a(str2, e.a(str, 1)), str, IconCache.EMPTY_CLASS_NAME, str2);
    }

    private final String zzh(String str) {
        return zza(getName(), str);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    public final boolean zzb(DataHolder dataHolder, int i10, int i11) {
        return dataHolder.hasColumn(zzh("permissionId")) && !dataHolder.hasNull(zzh("permissionId"), i10, i11);
    }

    @Override // com.google.android.gms.drive.metadata.zza
    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i10, int i11) {
        String string = dataHolder.getString(zzh("permissionId"), i10, i11);
        if (string != null) {
            return new UserMetadata(string, dataHolder.getString(zzh("displayName"), i10, i11), dataHolder.getString(zzh("picture"), i10, i11), dataHolder.getBoolean(zzh("isAuthenticatedUser"), i10, i11), dataHolder.getString(zzh(C5555a.f237756a), i10, i11));
        }
        return null;
    }
}
