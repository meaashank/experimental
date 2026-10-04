package com.google.android.gms.internal.measurement;

import C4.q;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.U0;
import com.google.common.base.Optional;
import e.f0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhg {

    public static class zza {
        private static volatile Optional<zzhh> zza;

        private zza() {
        }

        public static Optional<zzhh> zza(Context context) {
            Optional<zzhh> optional;
            Optional<zzhh> optionalZza;
            Optional<zzhh> optional2 = zza;
            if (optional2 != null) {
                return optional2;
            }
            synchronized (zza.class) {
                try {
                    optional = zza;
                    if (optional == null) {
                        new zzhg();
                        if (zzhk.zza(Build.TYPE, Build.TAGS)) {
                            if (zzgs.zza() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            optionalZza = zzhg.zza(context);
                        } else {
                            optionalZza = Optional.absent();
                        }
                        optional = optionalZza;
                        zza = optional;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return optional;
        }
    }

    private static zzhh zza(Context context, File file) {
        BufferedReader bufferedReader;
        U0 u02;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                u02 = new U0();
                map = new HashMap();
            } finally {
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                zzgy zzgyVar = new zzgy(u02);
                bufferedReader.close();
                return zzgyVar;
            }
            String[] strArrSplit = line.split(q.f17581a, 3);
            if (strArrSplit.length != 3) {
                Log.e("HermeticFileOverrides", "Invalid: " + line);
            } else {
                String strZza = zza(strArrSplit[0]);
                String strDecode = Uri.decode(zza(strArrSplit[1]));
                String strDecode2 = (String) map.get(strArrSplit[2]);
                if (strDecode2 == null) {
                    String strZza2 = zza(strArrSplit[2]);
                    strDecode2 = Uri.decode(strZza2);
                    if (strDecode2.length() < 1024 || strDecode2 == strZza2) {
                        map.put(strZza2, strDecode2);
                    }
                }
                U0 u03 = (U0) u02.get(strZza);
                if (u03 == null) {
                    u03 = new U0();
                    u02.put(strZza, u03);
                }
                u03.put(strDecode, strDecode2);
            }
            throw new RuntimeException(e10);
        }
    }

    private static Optional<File> zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? Optional.of(file) : Optional.absent();
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return Optional.absent();
        }
    }

    @f0
    public static Optional<zzhh> zza(Context context) {
        Optional<zzhh> optionalAbsent;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            Optional<File> optionalZzb = zzb(context);
            if (optionalZzb.isPresent()) {
                optionalAbsent = Optional.of(zza(context, optionalZzb.get()));
            } else {
                optionalAbsent = Optional.absent();
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return optionalAbsent;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
