package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s0.x;

/* JADX INFO: loaded from: classes4.dex */
final class zzait extends zzaiv {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzait() {
        super(new zzage());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzeu zzeuVar) {
        return Double.valueOf(Double.longBitsToDouble(zzeuVar.zzD()));
    }

    private static String zzh(zzeu zzeuVar) {
        int iZzt = zzeuVar.zzt();
        int iZzg = zzeuVar.zzg();
        zzeuVar.zzk(iZzt);
        return new String(zzeuVar.zzi(), iZzg, iZzt);
    }

    private static HashMap zzi(zzeu zzeuVar) {
        int iZzH = zzeuVar.zzH();
        HashMap map = new HashMap(iZzH);
        for (int i10 = 0; i10 < iZzH; i10++) {
            String strZzh = zzh(zzeuVar);
            Object objZzj = zzj(zzeuVar, zzeuVar.zzs());
            if (objZzj != null) {
                map.put(strZzh, objZzj);
            }
        }
        return map;
    }

    @Nullable
    private static Object zzj(zzeu zzeuVar, int i10) {
        if (i10 == 0) {
            return zzg(zzeuVar);
        }
        if (i10 == 1) {
            return Boolean.valueOf(zzeuVar.zzs() == 1);
        }
        if (i10 == 2) {
            return zzh(zzeuVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return zzi(zzeuVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzeuVar).doubleValue());
                zzeuVar.zzk(2);
                return date;
            }
            int iZzH = zzeuVar.zzH();
            ArrayList arrayList = new ArrayList(iZzH);
            for (int i11 = 0; i11 < iZzH; i11++) {
                Object objZzj = zzj(zzeuVar, zzeuVar.zzs());
                if (objZzj != null) {
                    arrayList.add(objZzj);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzh = zzh(zzeuVar);
            int iZzs = zzeuVar.zzs();
            if (iZzs == 9) {
                return map;
            }
            Object objZzj2 = zzj(zzeuVar, iZzs);
            if (objZzj2 != null) {
                map.put(strZzh, objZzj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    public final boolean zza(zzeu zzeuVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    public final boolean zzb(zzeu zzeuVar, long j10) {
        if (zzeuVar.zzs() == 2 && "onMetaData".equals(zzh(zzeuVar)) && zzeuVar.zzd() != 0 && zzeuVar.zzs() == 8) {
            HashMap mapZzi = zzi(zzeuVar);
            Object obj = mapZzi.get(x.h.f238399b);
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i10] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }
}
