package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.prism.gaia.helper.compat.NativeLibraryHelperCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzf {
    public static boolean zza(zzbei zzbeiVar) {
        int iOrdinal = zzbeiVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzbei zzb(Context context, zzfyi zzfyiVar) {
        zzbei zzbeiVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzhau(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfyiVar != null) {
                    zzfyiVar.zze(5017, "No .so");
                } else {
                    zzfyiVar = null;
                }
                zzbeiVar = zzbei.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e10) {
                    zzc(null, e10.toString(), context, zzfyiVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfyiVar);
                        zzbeiVar = zzbei.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s10 = ByteBuffer.wrap(bArr2).getShort();
                        if (s10 == 3) {
                            zzbeiVar = zzbei.X86;
                        } else if (s10 == 40) {
                            zzbeiVar = zzbei.ARM7;
                        } else if (s10 == 62) {
                            zzbeiVar = zzbei.X86_64;
                        } else if (s10 == 183) {
                            zzbeiVar = zzbei.ARM64;
                        } else if (s10 != 243) {
                            zzc(bArr, null, context, zzfyiVar);
                            zzbeiVar = zzbei.UNSUPPORTED;
                        } else {
                            zzbeiVar = zzbei.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzbeiVar = zzbei.UNSUPPORTED;
                }
            }
        } else {
            if (zzfyiVar != null) {
                zzfyiVar.zze(5017, "No lib/");
            } else {
                zzfyiVar = null;
            }
            zzbeiVar = zzbei.UNKNOWN;
        }
        if (zzbeiVar == zzbei.UNKNOWN) {
            String strZzd = zzd(context, zzfyiVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfyiVar);
                zzbeiVar = zzbei.UNSUPPORTED;
            } else if (strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase(NativeLibraryHelperCompat.f164952e)) {
                zzbeiVar = zzbei.X86;
            } else if (strZzd.equalsIgnoreCase(NativeLibraryHelperCompat.f164953f)) {
                zzbeiVar = zzbei.X86_64;
            } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                zzbeiVar = zzbei.ARM64;
            } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                zzbeiVar = zzbei.ARM7;
            } else if (strZzd.equalsIgnoreCase("riscv64")) {
                zzbeiVar = zzbei.RISCV64;
            } else {
                zzc(null, strZzd, context, zzfyiVar);
                zzbeiVar = zzbei.UNSUPPORTED;
            }
        }
        if (zzfyiVar != null) {
            zzfyiVar.zze(5018, zzbeiVar.name());
        }
        return zzbeiVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfyi zzfyiVar) {
        if (zzfyiVar == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(zzgva.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            androidx.concurrent.futures.b.a(sb2, "dbg:", str, ";");
        }
        zzfyiVar.zze(4007, sb2.toString());
    }

    private static final String zzd(Context context, zzfyi zzfyiVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzgva.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e10) {
            if (zzfyiVar != null) {
                zzfyiVar.zzc(2024, 0L, e10);
            }
        } catch (NoSuchFieldException e11) {
            if (zzfyiVar != null) {
                zzfyiVar.zzc(2024, 0L, e11);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
