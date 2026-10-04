package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzifb {
    private static final zzifb zzd = new zzifb(true);
    final zzihu zza = new zzihq();
    boolean zzb;
    boolean zzc;

    private zzifb() {
    }

    public static zzifb zza() {
        return zzd;
    }

    public static void zzf(zzier zzierVar, zziin zziinVar, int i10, Object obj) throws IOException {
        if (zziinVar == zziin.zzj) {
            zzierVar.zzb(i10, 3);
            ((zzigw) obj).zzcX(zzierVar);
            zzierVar.zzb(i10, 4);
            return;
        }
        zzierVar.zzb(i10, zziinVar.zzb());
        zziio zziioVar = zziio.INT;
        switch (zziinVar.ordinal()) {
            case 0:
                zzierVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzierVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzierVar.zzt(((Long) obj).longValue());
                break;
            case 3:
                zzierVar.zzt(((Long) obj).longValue());
                break;
            case 4:
                zzierVar.zzq(((Integer) obj).intValue());
                break;
            case 5:
                zzierVar.zzu(((Long) obj).longValue());
                break;
            case 6:
                zzierVar.zzs(((Integer) obj).intValue());
                break;
            case 7:
                zzierVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zziei)) {
                    zzierVar.zzw((String) obj);
                } else {
                    zzierVar.zzk((zziei) obj);
                }
                break;
            case 9:
                ((zzigw) obj).zzcX(zzierVar);
                break;
            case 10:
                zzierVar.zzo((zzigw) obj);
                break;
            case 11:
                if (!(obj instanceof zziei)) {
                    byte[] bArr = (byte[]) obj;
                    zzierVar.zzl(bArr, 0, bArr.length);
                } else {
                    zzierVar.zzk((zziei) obj);
                }
                break;
            case 12:
                zzierVar.zzr(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzifq)) {
                    zzierVar.zzq(((Integer) obj).intValue());
                } else {
                    zzierVar.zzq(((zzifq) obj).zza());
                }
                break;
            case 14:
                zzierVar.zzs(((Integer) obj).intValue());
                break;
            case 15:
                zzierVar.zzu(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzierVar.zzr((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzierVar.zzt((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int zzh(zziin zziinVar, int i10, Object obj) {
        int iZzF = zzier.zzF(i10 << 3);
        if (zziinVar == zziin.zzj) {
            iZzF += iZzF;
        }
        return iZzF + zzi(zziinVar, obj);
    }

    public static int zzi(zziin zziinVar, Object obj) {
        int iZzb;
        int iZzF;
        zziin zziinVar2 = zziin.zza;
        zziio zziioVar = zziio.INT;
        switch (zziinVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return zzier.zzG(((Long) obj).longValue());
            case 3:
                return zzier.zzG(((Long) obj).longValue());
            case 4:
                return zzier.zzG(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                if (!(obj instanceof zziei)) {
                    int i10 = zziim.zza;
                    iZzb = zziij.zzb((String) obj);
                    iZzF = zzier.zzF(iZzb);
                } else {
                    iZzb = ((zziei) obj).zzb();
                    iZzF = zzier.zzF(iZzb);
                }
                break;
            case 9:
                return ((zzigw) obj).zzbr();
            case 10:
                if (!(obj instanceof zzigc)) {
                    return zzier.zzH((zzigw) obj);
                }
                iZzb = ((zzigc) obj).zzb();
                iZzF = zzier.zzF(iZzb);
                break;
                break;
            case 11:
                if (!(obj instanceof zziei)) {
                    iZzb = ((byte[]) obj).length;
                    iZzF = zzier.zzF(iZzb);
                } else {
                    iZzb = ((zziei) obj).zzb();
                    iZzF = zzier.zzF(iZzb);
                }
                break;
            case 12:
                return zzier.zzF(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzifq ? zzier.zzG(((zzifq) obj).zza()) : zzier.zzG(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzier.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzier.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzF + iZzb;
    }

    public static int zzj(zzifa zzifaVar, Object obj) {
        zziin zziinVarZzb = zzifaVar.zzb();
        int iZza = zzifaVar.zza();
        if (!zzifaVar.zzd()) {
            return zzh(zziinVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzifaVar.zze()) {
            int iZzh = 0;
            while (i10 < size) {
                iZzh += zzh(zziinVarZzb, iZza, list.get(i10));
                i10++;
            }
            return iZzh;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzi = 0;
        while (i10 < size) {
            iZzi += zzi(zziinVarZzb, list.get(i10));
            i10++;
        }
        return zzier.zzF(iZzi) + zzier.zzF(iZza << 3) + iZzi;
    }

    private static boolean zzk(Map.Entry entry) {
        zzifa zzifaVar = (zzifa) entry.getKey();
        if (zzifaVar.zzc() != zziio.MESSAGE) {
            return true;
        }
        if (!zzifaVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzl(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzigx) {
            return ((zzigx) obj).zzbi();
        }
        if (obj instanceof zzigc) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i10;
        int iZzF;
        int iZzH;
        zzifa zzifaVar = (zzifa) entry.getKey();
        Object value = entry.getValue();
        if (zzifaVar.zzc() != zziio.MESSAGE || zzifaVar.zzd() || zzifaVar.zze()) {
            return zzj(zzifaVar, value);
        }
        if (value instanceof zzigc) {
            int iZza = ((zzifa) entry.getKey()).zza();
            int iZzF2 = zzier.zzF(8);
            i10 = iZzF2 + iZzF2;
            iZzF = zzier.zzF(iZza) + zzier.zzF(16);
            int iZzF3 = zzier.zzF(24);
            int iZzb = ((zzigc) value).zzb();
            iZzH = C3294f1.a(iZzb, iZzb, iZzF3);
        } else {
            int iZza2 = ((zzifa) entry.getKey()).zza();
            int iZzF4 = zzier.zzF(8);
            i10 = iZzF4 + iZzF4;
            iZzF = zzier.zzF(iZza2) + zzier.zzF(16);
            iZzH = zzier.zzH((zzigw) value) + zzier.zzF(24);
        }
        return i10 + iZzF + iZzH;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzn(com.google.android.gms.internal.ads.zzifa r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zziin r0 = r4.zzb()
            r5.getClass()
            com.google.android.gms.internal.ads.zziin r1 = com.google.android.gms.internal.ads.zziin.zza
            com.google.android.gms.internal.ads.zziio r1 = com.google.android.gms.internal.ads.zziio.INT
            com.google.android.gms.internal.ads.zziio r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzigw
            if (r0 != 0) goto L1f
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzigc
            if (r0 == 0) goto L46
        L1f:
            return
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L28
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzifq
            if (r0 == 0) goto L46
        L28:
            return
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zziei
            if (r0 != 0) goto L31
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
        L31:
            return
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.zziin r4 = r4.zzb()
            com.google.android.gms.internal.ads.zziio r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzifb.zzn(com.google.android.gms.internal.ads.zzifa, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzifb zzifbVar = new zzifb();
        zzihu zzihuVar = this.zza;
        int iZzc = zzihuVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Map.Entry entryZzd = zzihuVar.zzd(i10);
            zzifbVar.zzd(((zzihr) entryZzd).zza(), entryZzd.getValue());
        }
        for (Map.Entry entry : zzihuVar.zze()) {
            zzifbVar.zzd((zzifa) entry.getKey(), entry.getValue());
        }
        zzifbVar.zzc = this.zzc;
        return zzifbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzifb) {
            return this.zza.equals(((zzifb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzihu zzihuVar = this.zza;
        int iZzc = zzihuVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            Object value = zzihuVar.zzd(i10).getValue();
            if (value instanceof zzifm) {
                ((zzifm) value).zzbm();
            }
        }
        Iterator it = zzihuVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzifm) {
                ((zzifm) value2).zzbm();
            }
        }
        zzihuVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzihu zzihuVar = this.zza;
        return zzihuVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzigb(zzihuVar.entrySet().iterator()) : zzihuVar.entrySet().iterator();
    }

    public final void zzd(zzifa zzifaVar, Object obj) {
        if (!zzifaVar.zzd()) {
            zzn(zzifaVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzn(zzifaVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzigc) {
            this.zzc = true;
        }
        this.zza.put(zzifaVar, obj);
    }

    public final boolean zze() {
        zzihu zzihuVar = this.zza;
        int iZzc = zzihuVar.zzc();
        for (int i10 = 0; i10 < iZzc; i10++) {
            if (!zzk(zzihuVar.zzd(i10))) {
                return false;
            }
        }
        Iterator it = zzihuVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzihu zzihuVar = this.zza;
        int iZzc = zzihuVar.zzc();
        int iZzm = 0;
        for (int i10 = 0; i10 < iZzc; i10++) {
            iZzm += zzm(zzihuVar.zzd(i10));
        }
        Iterator it = zzihuVar.zze().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    private zzifb(boolean z10) {
        zzb();
        zzb();
    }
}
