package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.C2564b;
import com.google.android.gms.ads.internal.util.e;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class ViewUtils {
    private ViewUtils() {
    }

    @Nullable
    @KeepForSdk
    public static String getXmlAttributeString(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z10, boolean z11, @NonNull String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue != null && attributeValue.startsWith("@string/") && z10) {
            String strSubstring = attributeValue.substring(8);
            String packageName = context.getPackageName();
            TypedValue typedValue = new TypedValue();
            try {
                Resources resources = context.getResources();
                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(strSubstring).length());
                sb2.append(packageName);
                sb2.append(":string/");
                sb2.append(strSubstring);
                resources.getValue(sb2.toString(), typedValue, true);
            } catch (Resources.NotFoundException unused) {
                Log.w(str3, C2564b.a(new StringBuilder(e.a(str2, 30) + attributeValue.length()), "Could not find resource for ", str2, ": ", attributeValue));
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                attributeValue = charSequence.toString();
            } else {
                String string = typedValue.toString();
                Log.w(str3, C2564b.a(new StringBuilder(e.a(str2, 28) + string.length()), "Resource ", str2, " was not a string: ", string));
            }
        }
        if (z11 && attributeValue == null) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 33);
            sb3.append("Required XML attribute \"");
            sb3.append(str2);
            sb3.append("\" missing");
            Log.w(str3, sb3.toString());
        }
        return attributeValue;
    }
}
