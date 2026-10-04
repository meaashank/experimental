package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjc {
    public static final zzjc zza = new zzjb().zzg();
    private final Map zzb;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjc) {
            return this.zzb.equals(((zzjc) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final Set zza() {
        return this.zzb.keySet();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void zzb(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.zzb.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    public final /* synthetic */ Map zzc() {
        return this.zzb;
    }
}
