package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.C1520a;
import e.InterfaceC4326A;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhk {

    @InterfaceC4326A("PhenotypeConstants.class")
    private static final C1520a<String, Uri> zza = new C1520a<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        C1520a<String, Uri> c1520a = zza;
        uri = c1520a.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c1520a.put(str, uri);
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return androidx.concurrent.futures.a.a(str, "#", context.getPackageName());
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
