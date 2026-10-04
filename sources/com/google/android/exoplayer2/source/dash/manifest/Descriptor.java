package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class Descriptor {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    public final String f150746id;

    @NonNull
    public final String schemeIdUri;

    @Nullable
    public final String value;

    public Descriptor(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.schemeIdUri = str;
        this.value = str2;
        this.f150746id = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Descriptor.class == obj.getClass()) {
            Descriptor descriptor = (Descriptor) obj;
            if (Util.areEqual(this.schemeIdUri, descriptor.schemeIdUri) && Util.areEqual(this.value, descriptor.value) && Util.areEqual(this.f150746id, descriptor.f150746id)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.schemeIdUri;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f150746id;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
