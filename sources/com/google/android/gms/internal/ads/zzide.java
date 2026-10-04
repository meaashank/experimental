package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzide extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzicx();
    zzidd zza;
    int zzb;
    int zzc;
    final zzidd zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzicz zzh;
    private zzidb zzi;

    public zzide() {
        this(zze, true);
    }

    private final void zzf(zzidd zziddVar, zzidd zziddVar2) {
        zzidd zziddVar3 = zziddVar.zza;
        zziddVar.zza = null;
        if (zziddVar2 != null) {
            zziddVar2.zza = zziddVar3;
        }
        if (zziddVar3 == null) {
            this.zza = zziddVar2;
        } else if (zziddVar3.zzb == zziddVar) {
            zziddVar3.zzb = zziddVar2;
        } else {
            zziddVar3.zzc = zziddVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0080 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzg(com.google.android.gms.internal.ads.zzidd r9, boolean r10) {
        /*
            r8 = this;
        L0:
            if (r9 == 0) goto L84
            com.google.android.gms.internal.ads.zzidd r0 = r9.zzb
            com.google.android.gms.internal.ads.zzidd r1 = r9.zzc
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.zzi
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.zzi
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            r7 = 1
            if (r5 != r6) goto L42
            com.google.android.gms.internal.ads.zzidd r0 = r1.zzb
            com.google.android.gms.internal.ads.zzidd r3 = r1.zzc
            if (r3 == 0) goto L22
            int r3 = r3.zzi
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L28
            int r0 = r0.zzi
            goto L29
        L28:
            r0 = r2
        L29:
            int r0 = r0 - r3
            r3 = -1
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L32
            if (r10 != 0) goto L33
            goto L3b
        L32:
            r7 = r10
        L33:
            r8.zzi(r1)
            r8.zzh(r9)
            goto L3f
        L3a:
            r2 = r10
        L3b:
            r8.zzh(r9)
            r7 = r2
        L3f:
            if (r7 != 0) goto L84
            goto L80
        L42:
            r1 = 2
            if (r5 != r1) goto L6d
            com.google.android.gms.internal.ads.zzidd r1 = r0.zzb
            com.google.android.gms.internal.ads.zzidd r3 = r0.zzc
            if (r3 == 0) goto L4e
            int r3 = r3.zzi
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r1 == 0) goto L54
            int r1 = r1.zzi
            goto L55
        L54:
            r1 = r2
        L55:
            int r1 = r1 - r3
            if (r1 == r7) goto L65
            if (r1 != 0) goto L5d
            if (r10 != 0) goto L5e
            goto L66
        L5d:
            r7 = r10
        L5e:
            r8.zzh(r0)
            r8.zzi(r9)
            goto L6a
        L65:
            r2 = r10
        L66:
            r8.zzi(r9)
            r7 = r2
        L6a:
            if (r7 == 0) goto L80
            goto L84
        L6d:
            if (r5 != 0) goto L76
            int r3 = r3 + 1
            r9.zzi = r3
            if (r10 == 0) goto L80
            goto L84
        L76:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r7
            r9.zzi = r0
            if (r10 != 0) goto L80
            goto L84
        L80:
            com.google.android.gms.internal.ads.zzidd r9 = r9.zza
            goto L0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzide.zzg(com.google.android.gms.internal.ads.zzidd, boolean):void");
    }

    private final void zzh(zzidd zziddVar) {
        zzidd zziddVar2 = zziddVar.zzb;
        zzidd zziddVar3 = zziddVar.zzc;
        zzidd zziddVar4 = zziddVar3.zzb;
        zzidd zziddVar5 = zziddVar3.zzc;
        zziddVar.zzc = zziddVar4;
        if (zziddVar4 != null) {
            zziddVar4.zza = zziddVar;
        }
        zzf(zziddVar, zziddVar3);
        zziddVar3.zzb = zziddVar;
        zziddVar.zza = zziddVar3;
        int iMax = Math.max(zziddVar2 != null ? zziddVar2.zzi : 0, zziddVar4 != null ? zziddVar4.zzi : 0) + 1;
        zziddVar.zzi = iMax;
        zziddVar3.zzi = Math.max(iMax, zziddVar5 != null ? zziddVar5.zzi : 0) + 1;
    }

    private final void zzi(zzidd zziddVar) {
        zzidd zziddVar2 = zziddVar.zzb;
        zzidd zziddVar3 = zziddVar.zzc;
        zzidd zziddVar4 = zziddVar2.zzb;
        zzidd zziddVar5 = zziddVar2.zzc;
        zziddVar.zzb = zziddVar5;
        if (zziddVar5 != null) {
            zziddVar5.zza = zziddVar;
        }
        zzf(zziddVar, zziddVar2);
        zziddVar2.zzc = zziddVar;
        zziddVar.zza = zziddVar2;
        int iMax = Math.max(zziddVar3 != null ? zziddVar3.zzi : 0, zziddVar5 != null ? zziddVar5.zzi : 0) + 1;
        zziddVar.zzi = iMax;
        zziddVar2.zzi = Math.max(iMax, zziddVar4 != null ? zziddVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzidd zziddVar = this.zzd;
        zziddVar.zze = zziddVar;
        zziddVar.zzd = zziddVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzicz zziczVar = this.zzh;
        if (zziczVar != null) {
            return zziczVar;
        }
        zzicz zziczVar2 = new zzicz(this);
        this.zzh = zziczVar2;
        return zziczVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzidd zziddVarZzb = zzb(obj);
        if (zziddVarZzb != null) {
            return zziddVarZzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzidb zzidbVar = this.zzi;
        if (zzidbVar != null) {
            return zzidbVar;
        }
        zzidb zzidbVar2 = new zzidb(this);
        this.zzi = zzidbVar2;
        return zzidbVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzidd zziddVarZza = zza(obj, true);
        Object obj3 = zziddVarZza.zzh;
        zziddVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzidd zziddVarZze = zze(obj);
        if (zziddVarZze != null) {
            return zziddVarZze.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    public final zzidd zza(Object obj, boolean z10) {
        int iCompareTo;
        zzidd zziddVar;
        Comparator comparator = this.zzf;
        zzidd zziddVar2 = this.zza;
        if (zziddVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zziddVar2.zzf) : comparator.compare(obj, zziddVar2.zzf);
                if (iCompareTo == 0) {
                    return zziddVar2;
                }
                zzidd zziddVar3 = iCompareTo < 0 ? zziddVar2.zzb : zziddVar2.zzc;
                if (zziddVar3 == null) {
                    break;
                }
                zziddVar2 = zziddVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        zzidd zziddVar4 = this.zzd;
        if (zziddVar2 != null) {
            zzidd zziddVar5 = zziddVar2;
            zziddVar = new zzidd(this.zzg, zziddVar5, obj, zziddVar4, zziddVar4.zze);
            if (i10 < 0) {
                zziddVar5.zzb = zziddVar;
            } else {
                zziddVar5.zzc = zziddVar;
            }
            zzg(zziddVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zziddVar = new zzidd(this.zzg, null, obj, zziddVar4, zziddVar4.zze);
            this.zza = zziddVar;
        }
        this.zzb++;
        this.zzc++;
        return zziddVar;
    }

    public final zzidd zzb(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final zzidd zzc(Map.Entry entry) {
        zzidd zziddVarZzb = zzb(entry.getKey());
        if (zziddVarZzb == null || !Objects.equals(zziddVarZzb.zzh, entry.getValue())) {
            return null;
        }
        return zziddVarZzb;
    }

    public final void zzd(zzidd zziddVar, boolean z10) {
        zzidd zziddVar2;
        zzidd zziddVar3;
        int i10;
        if (z10) {
            zzidd zziddVar4 = zziddVar.zze;
            zziddVar4.zzd = zziddVar.zzd;
            zziddVar.zzd.zze = zziddVar4;
        }
        zzidd zziddVar5 = zziddVar.zzb;
        zzidd zziddVar6 = zziddVar.zzc;
        zzidd zziddVar7 = zziddVar.zza;
        int i11 = 0;
        if (zziddVar5 == null || zziddVar6 == null) {
            if (zziddVar5 != null) {
                zzf(zziddVar, zziddVar5);
                zziddVar.zzb = null;
            } else if (zziddVar6 != null) {
                zzf(zziddVar, zziddVar6);
                zziddVar.zzc = null;
            } else {
                zzf(zziddVar, null);
            }
            zzg(zziddVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zziddVar5.zzi > zziddVar6.zzi) {
            do {
                zziddVar3 = zziddVar5;
                zziddVar5 = zziddVar5.zzc;
            } while (zziddVar5 != null);
        } else {
            do {
                zziddVar2 = zziddVar6;
                zziddVar6 = zziddVar6.zzb;
            } while (zziddVar6 != null);
            zziddVar3 = zziddVar2;
        }
        zzd(zziddVar3, false);
        zzidd zziddVar8 = zziddVar.zzb;
        if (zziddVar8 != null) {
            i10 = zziddVar8.zzi;
            zziddVar3.zzb = zziddVar8;
            zziddVar8.zza = zziddVar3;
            zziddVar.zzb = null;
        } else {
            i10 = 0;
        }
        zzidd zziddVar9 = zziddVar.zzc;
        if (zziddVar9 != null) {
            i11 = zziddVar9.zzi;
            zziddVar3.zzc = zziddVar9;
            zziddVar9.zza = zziddVar3;
            zziddVar.zzc = null;
        }
        zziddVar3.zzi = Math.max(i10, i11) + 1;
        zzf(zziddVar, zziddVar3);
    }

    public final zzidd zze(Object obj) {
        zzidd zziddVarZzb = zzb(obj);
        if (zziddVarZzb != null) {
            zzd(zziddVarZzb, true);
        }
        return zziddVarZzb;
    }

    public zzide(Comparator comparator, boolean z10) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z10;
        this.zzd = new zzidd(z10);
    }

    public zzide(boolean z10) {
        this(zze, false);
    }
}
