package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbu {
    @Nullable
    public static Object zza(String str, String str2, zzgbt... zzgbtVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return Class.forName(str).getDeclaredMethod("getInstance", null).invoke(null, null);
    }
}
