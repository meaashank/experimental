package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaol implements zzanz {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzaoe zzg;
    private final zzaod zzh;
    private final zzaok zzi;
    private Bitmap zzj;

    public zzaol(List list) {
        zzeu zzeuVar = new zzeu((byte[]) list.get(0));
        int iZzt = zzeuVar.zzt();
        int iZzt2 = zzeuVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzaoe(719, 575, 0, 719, 0, 575);
        this.zzh = new zzaod(0, zzd(), zze(), zzf());
        this.zzi = new zzaok(iZzt, iZzt2);
    }

    private static zzaod zzb(zzet zzetVar, int i10) {
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i11 = 8;
        int iZzj5 = zzetVar.zzj(8);
        zzetVar.zzh(8);
        int[] iArrZzd = zzd();
        int[] iArrZze = zze();
        int[] iArrZzf = zzf();
        int i12 = i10 - 2;
        while (i12 > 0) {
            int iZzj6 = zzetVar.zzj(i11);
            int iZzj7 = zzetVar.zzj(i11);
            int[] iArr = (iZzj7 & 128) != 0 ? iArrZzd : (iZzj7 & 64) != 0 ? iArrZze : iArrZzf;
            if ((iZzj7 & 1) != 0) {
                iZzj3 = zzetVar.zzj(i11);
                iZzj4 = zzetVar.zzj(i11);
                iZzj = zzetVar.zzj(i11);
                iZzj2 = zzetVar.zzj(i11);
                i12 -= 6;
            } else {
                int iZzj8 = zzetVar.zzj(6) << 2;
                int iZzj9 = zzetVar.zzj(4) << 4;
                i12 -= 4;
                iZzj = zzetVar.zzj(4) << 4;
                iZzj2 = zzetVar.zzj(2) << 6;
                iZzj3 = iZzj8;
                iZzj4 = iZzj9;
            }
            if (iZzj3 == 0) {
                iZzj2 = 255;
            }
            if (iZzj3 == 0) {
                iZzj = 0;
            }
            if (iZzj3 == 0) {
                iZzj4 = 0;
            }
            double d10 = iZzj3;
            String str = zzfm.zza;
            double d11 = iZzj4 - 128;
            double d12 = iZzj - 128;
            iArr[iZzj6] = zzg((byte) (255 - (iZzj2 & 255)), Math.max(0, Math.min((int) ((1.402d * d11) + d10), 255)), Math.max(0, Math.min((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d12 * 1.772d) + d10), 255)));
            iZzj5 = iZzj5;
            i11 = 8;
        }
        return new zzaod(iZzj5, iArrZzd, iArrZze, iArrZzf);
    }

    private static zzaof zzc(zzet zzetVar) {
        byte[] bArr;
        int iZzj = zzetVar.zzj(16);
        zzetVar.zzh(4);
        int iZzj2 = zzetVar.zzj(2);
        boolean zZzi = zzetVar.zzi();
        zzetVar.zzh(1);
        byte[] bArr2 = zzfm.zzb;
        if (iZzj2 != 1) {
            if (iZzj2 == 0) {
                int iZzj3 = zzetVar.zzj(16);
                int iZzj4 = zzetVar.zzj(16);
                if (iZzj3 > 0) {
                    bArr2 = new byte[iZzj3];
                    zzetVar.zzn(bArr2, 0, iZzj3);
                }
                if (iZzj4 > 0) {
                    bArr = new byte[iZzj4];
                    zzetVar.zzn(bArr, 0, iZzj4);
                }
            }
            return new zzaof(iZzj, zZzi, bArr2, bArr);
        }
        zzetVar.zzh(zzetVar.zzj(8) * 16);
        bArr = bArr2;
        return new zzaof(iZzj, zZzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            int i11 = i10 & 4;
            int i12 = i10 & 2;
            int i13 = i10 & 1;
            if (i10 < 8) {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 255, i12 != 0 ? 255 : 0, i11 != 0 ? 255 : 0);
            } else {
                iArr[i10] = zzg(255, 1 != i13 ? 0 : 127, i12 != 0 ? 127 : 0, i11 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int i10;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = zzg(63, 1 != (i11 & 1) ? 0 : 255, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & Opcodes.L2I;
                int i13 = Opcodes.TABLESWITCH;
                if (i12 == 0) {
                    int i14 = i11 & 16;
                    int i15 = i11 & 32;
                    int i16 = i11 & 2;
                    int i17 = i11 & 64;
                    int i18 = i11 & 4;
                    int i19 = 1 != (i11 & 1) ? 0 : 85;
                    int i20 = i14 != 0 ? 170 : 0;
                    int i21 = i16 != 0 ? 85 : 0;
                    int i22 = i15 != 0 ? 170 : 0;
                    i10 = i18 == 0 ? 0 : 85;
                    if (i17 == 0) {
                        i13 = 0;
                    }
                    iArr[i11] = zzg(255, i19 + i20, i21 + i22, i10 + i13);
                } else if (i12 == 8) {
                    int i23 = i11 & 16;
                    int i24 = i11 & 32;
                    int i25 = i11 & 2;
                    int i26 = i11 & 64;
                    int i27 = i11 & 4;
                    int i28 = 1 != (i11 & 1) ? 0 : 85;
                    int i29 = i23 != 0 ? 170 : 0;
                    int i30 = i25 != 0 ? 85 : 0;
                    int i31 = i24 != 0 ? 170 : 0;
                    i10 = i27 == 0 ? 0 : 85;
                    if (i26 == 0) {
                        i13 = 0;
                    }
                    iArr[i11] = zzg(127, i28 + i29, i30 + i31, i10 + i13);
                } else if (i12 == 128) {
                    iArr[i11] = zzg(255, (1 != (i11 & 1) ? 0 : 43) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = zzg(255, (1 != (i11 & 1) ? 0 : 43) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzh(byte[] r22, int[] r23, int r24, int r25, int r26, @androidx.annotation.Nullable android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaol.zzh(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] zzi(int i10, int i11, zzet zzetVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) zzetVar.zzj(i11);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i10, int i11, zzany zzanyVar, zzdu zzduVar) {
        boolean z10;
        zzanr zzanrVar;
        Canvas canvas;
        char c10;
        char c11;
        char c12;
        int i12;
        zzaok zzaokVar;
        Canvas canvas2;
        int i13;
        int i14;
        int i15;
        zzaoi zzaoiVar;
        int iZzj;
        int iZzj2;
        int iZzj3;
        int iZzj4;
        int i16;
        int iZzj5;
        zzet zzetVar = new zzet(bArr, i10 + i11);
        zzetVar.zzf(i10);
        while (true) {
            z10 = true;
            if (zzetVar.zzc() >= 48 && zzetVar.zzj(8) == 15) {
                zzaok zzaokVar2 = this.zzi;
                int iZzj6 = zzetVar.zzj(8);
                int iZzj7 = zzetVar.zzj(16);
                int iZzj8 = zzetVar.zzj(16);
                int iZze = zzetVar.zze() + iZzj8;
                if (iZzj8 * 8 > zzetVar.zzc()) {
                    zzeh.zzc("DvbParser", "Data field length exceeds limit");
                    zzetVar.zzh(zzetVar.zzc());
                } else {
                    switch (iZzj6) {
                        case 16:
                            if (iZzj7 == zzaokVar2.zza) {
                                zzaog zzaogVar = zzaokVar2.zzi;
                                int iZzj9 = zzetVar.zzj(8);
                                int iZzj10 = zzetVar.zzj(4);
                                int iZzj11 = zzetVar.zzj(2);
                                zzetVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i17 = iZzj8 - 2; i17 > 0; i17 -= 6) {
                                    int iZzj12 = zzetVar.zzj(8);
                                    zzetVar.zzh(8);
                                    sparseArray.put(iZzj12, new zzaoh(zzetVar.zzj(16), zzetVar.zzj(16)));
                                }
                                zzaog zzaogVar2 = new zzaog(iZzj9, iZzj10, iZzj11, sparseArray);
                                if (zzaogVar2.zzb != 0) {
                                    zzaokVar2.zzi = zzaogVar2;
                                    zzaokVar2.zzc.clear();
                                    zzaokVar2.zzd.clear();
                                    zzaokVar2.zze.clear();
                                } else if (zzaogVar != null) {
                                    if (zzaogVar.zza != zzaogVar2.zza) {
                                        zzaokVar2.zzi = zzaogVar2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzaog zzaogVar3 = zzaokVar2.zzi;
                            if (iZzj7 == zzaokVar2.zza && zzaogVar3 != null) {
                                int iZzj13 = zzetVar.zzj(8);
                                zzetVar.zzh(4);
                                boolean zZzi = zzetVar.zzi();
                                zzetVar.zzh(3);
                                int iZzj14 = zzetVar.zzj(16);
                                int iZzj15 = zzetVar.zzj(16);
                                int iZzj16 = zzetVar.zzj(3);
                                int iZzj17 = zzetVar.zzj(3);
                                zzetVar.zzh(2);
                                int iZzj18 = zzetVar.zzj(8);
                                int iZzj19 = zzetVar.zzj(8);
                                int iZzj20 = zzetVar.zzj(4);
                                int iZzj21 = zzetVar.zzj(2);
                                zzetVar.zzh(2);
                                int i18 = iZzj8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i18 > 0) {
                                    int iZzj22 = zzetVar.zzj(16);
                                    int iZzj23 = zzetVar.zzj(2);
                                    int iZzj24 = zzetVar.zzj(2);
                                    int iZzj25 = zzetVar.zzj(12);
                                    zzetVar.zzh(4);
                                    int iZzj26 = zzetVar.zzj(12);
                                    int i19 = i18 - 6;
                                    if (iZzj23 == 1) {
                                        i18 -= 8;
                                        iZzj = zzetVar.zzj(8);
                                        iZzj2 = zzetVar.zzj(8);
                                    } else if (iZzj23 == 2) {
                                        iZzj23 = 2;
                                        i18 -= 8;
                                        iZzj = zzetVar.zzj(8);
                                        iZzj2 = zzetVar.zzj(8);
                                    } else {
                                        i18 = i19;
                                        iZzj = 0;
                                        iZzj2 = 0;
                                    }
                                    sparseArray2.put(iZzj22, new zzaoj(iZzj23, iZzj24, iZzj25, iZzj26, iZzj, iZzj2));
                                }
                                zzaoi zzaoiVar2 = new zzaoi(iZzj13, zZzi, iZzj14, iZzj15, iZzj16, iZzj17, iZzj18, iZzj19, iZzj20, iZzj21, sparseArray2);
                                if (zzaogVar3.zzb == 0 && (zzaoiVar = (zzaoi) zzaokVar2.zzc.get(zzaoiVar2.zza)) != null) {
                                    int i20 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzaoiVar.zzj;
                                        if (i20 < sparseArray3.size()) {
                                            zzaoiVar2.zzj.put(sparseArray3.keyAt(i20), (zzaoj) sparseArray3.valueAt(i20));
                                            i20++;
                                        }
                                    }
                                }
                                zzaokVar2.zzc.put(zzaoiVar2.zza, zzaoiVar2);
                            }
                            break;
                        case 18:
                            if (iZzj7 == zzaokVar2.zza) {
                                zzaod zzaodVarZzb = zzb(zzetVar, iZzj8);
                                zzaokVar2.zzd.put(zzaodVarZzb.zza, zzaodVarZzb);
                            } else if (iZzj7 == zzaokVar2.zzb) {
                                zzaod zzaodVarZzb2 = zzb(zzetVar, iZzj8);
                                zzaokVar2.zzf.put(zzaodVarZzb2.zza, zzaodVarZzb2);
                            }
                            break;
                        case 19:
                            if (iZzj7 == zzaokVar2.zza) {
                                zzaof zzaofVarZzc = zzc(zzetVar);
                                zzaokVar2.zze.put(zzaofVarZzc.zza, zzaofVarZzc);
                            } else if (iZzj7 == zzaokVar2.zzb) {
                                zzaof zzaofVarZzc2 = zzc(zzetVar);
                                zzaokVar2.zzg.put(zzaofVarZzc2.zza, zzaofVarZzc2);
                            }
                            break;
                        case 20:
                            if (iZzj7 == zzaokVar2.zza) {
                                zzetVar.zzh(4);
                                boolean zZzi2 = zzetVar.zzi();
                                zzetVar.zzh(3);
                                int iZzj27 = zzetVar.zzj(16);
                                int iZzj28 = zzetVar.zzj(16);
                                if (zZzi2) {
                                    int iZzj29 = zzetVar.zzj(16);
                                    iZzj3 = zzetVar.zzj(16);
                                    iZzj5 = zzetVar.zzj(16);
                                    iZzj4 = zzetVar.zzj(16);
                                    i16 = iZzj29;
                                } else {
                                    iZzj3 = iZzj27;
                                    iZzj4 = iZzj28;
                                    i16 = 0;
                                    iZzj5 = 0;
                                }
                                zzaokVar2.zzh = new zzaoe(iZzj27, iZzj28, i16, iZzj3, iZzj5, iZzj4);
                            }
                            break;
                    }
                    zzetVar.zzo(iZze - zzetVar.zze());
                }
            }
        }
        zzaok zzaokVar3 = this.zzi;
        zzaog zzaogVar4 = zzaokVar3.zzi;
        if (zzaogVar4 == null) {
            zzanrVar = new zzanr(zzgxm.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzaoe zzaoeVar = zzaokVar3.zzh;
            if (zzaoeVar == null) {
                zzaoeVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzaoeVar.zza + 1 != bitmap.getWidth() || zzaoeVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzaoeVar.zza + 1, zzaoeVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzaogVar4.zzc;
            int i21 = 0;
            while (i21 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzaoh zzaohVar = (zzaoh) sparseArray4.valueAt(i21);
                zzaoi zzaoiVar3 = (zzaoi) zzaokVar3.zzc.get(sparseArray4.keyAt(i21));
                int i22 = zzaohVar.zza + zzaoeVar.zzc;
                int i23 = zzaohVar.zzb + zzaoeVar.zze;
                int i24 = zzaoiVar3.zzc;
                int i25 = i22 + i24;
                boolean z11 = z10;
                int iMin = Math.min(i25, zzaoeVar.zzd);
                int i26 = zzaoiVar3.zzd;
                int i27 = i23 + i26;
                canvas3.clipRect(i22, i23, iMin, Math.min(i27, zzaoeVar.zzf));
                int i28 = zzaoiVar3.zzf;
                zzaod zzaodVar = (zzaod) zzaokVar3.zzd.get(i28);
                if (zzaodVar == null && (zzaodVar = (zzaod) zzaokVar3.zzf.get(i28)) == null) {
                    zzaodVar = this.zzh;
                }
                SparseArray sparseArray5 = zzaoiVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i29 = i21;
                int i30 = 0;
                while (i30 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i30);
                    int i31 = i30;
                    zzaoj zzaojVar = (zzaoj) sparseArray5.valueAt(i30);
                    SparseArray sparseArray7 = sparseArray5;
                    zzaof zzaofVar = (zzaof) zzaokVar3.zze.get(iKeyAt);
                    if (zzaofVar == null) {
                        zzaofVar = (zzaof) zzaokVar3.zzg.get(iKeyAt);
                    }
                    if (zzaofVar != null) {
                        Paint paint = zzaofVar.zzb ? null : this.zzd;
                        i14 = i24;
                        int i32 = zzaoiVar3.zze;
                        zzaokVar = zzaokVar3;
                        int i33 = zzaojVar.zza + i22;
                        int i34 = i23 + zzaojVar.zzb;
                        canvas2 = canvas3;
                        i13 = i22;
                        int[] iArr = i32 == 3 ? zzaodVar.zzd : i32 == 2 ? zzaodVar.zzc : zzaodVar.zzb;
                        i15 = i25;
                        zzh(zzaofVar.zzc, iArr, i32, i33, i34, paint, canvas2);
                        zzh(zzaofVar.zzd, iArr, i32, i33, i34 + 1, paint, canvas2);
                    } else {
                        zzaokVar = zzaokVar3;
                        canvas2 = canvas3;
                        i13 = i22;
                        i14 = i24;
                        i15 = i25;
                    }
                    i22 = i13;
                    i25 = i15;
                    i30 = i31 + 1;
                    i24 = i14;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzaokVar3 = zzaokVar;
                }
                zzaok zzaokVar4 = zzaokVar3;
                Canvas canvas4 = canvas3;
                int i35 = i22;
                int i36 = i24;
                int i37 = i25;
                float f10 = i23;
                float f11 = i35;
                if (zzaoiVar3.zzb) {
                    int i38 = zzaoiVar3.zze;
                    if (i38 == 3) {
                        i12 = zzaodVar.zzd[zzaoiVar3.zzg];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        i12 = i38 == 2 ? zzaodVar.zzc[zzaoiVar3.zzh] : zzaodVar.zzb[zzaoiVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i12);
                    float f12 = i37;
                    c11 = c12;
                    c10 = 3;
                    canvas = canvas4;
                    canvas.drawRect(f11, f10, f12, i27, paint2);
                } else {
                    canvas = canvas4;
                    c10 = 3;
                    c11 = 2;
                }
                zzcx zzcxVar = new zzcx();
                zzcxVar.zzc(Bitmap.createBitmap(this.zzj, i35, i23, i36, i26));
                float f13 = zzaoeVar.zza;
                zzcxVar.zzi(f11 / f13);
                zzcxVar.zzj(0);
                float f14 = zzaoeVar.zzb;
                zzcxVar.zzf(f10 / f14, 0);
                zzcxVar.zzg(0);
                zzcxVar.zzm(i36 / f13);
                zzcxVar.zzn(i26 / f14);
                arrayList.add(zzcxVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i21 = i29 + 1;
                z10 = z11;
                zzaokVar3 = zzaokVar4;
                sparseArray4 = sparseArray6;
            }
            zzanrVar = new zzanr(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzduVar.zza(zzanrVar);
    }
}
