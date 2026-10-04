package com.google.android.gms.common;

import androidx.compose.foundation.layout.C1711w0;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i10) {
        int i11 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 104 + String.valueOf(i10).length() + 194);
        C1711w0.a(sb2, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i11, " but found ", i10);
        sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i10, sb2.toString());
    }
}
