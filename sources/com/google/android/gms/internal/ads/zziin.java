package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class zziin {
    public static final zziin zza;
    public static final zziin zzb;
    public static final zziin zzc;
    public static final zziin zzd;
    public static final zziin zze;
    public static final zziin zzf;
    public static final zziin zzg;
    public static final zziin zzh;
    public static final zziin zzi;
    public static final zziin zzj;
    public static final zziin zzk;
    public static final zziin zzl;
    public static final zziin zzm;
    public static final zziin zzn;
    public static final zziin zzo;
    public static final zziin zzp;
    public static final zziin zzq;
    public static final zziin zzr;
    private static final /* synthetic */ zziin[] zzu;
    private final zziio zzs;
    private final int zzt;

    static {
        zziin zziinVar = new zziin("DOUBLE", 0, zziio.DOUBLE, 1);
        zza = zziinVar;
        zziin zziinVar2 = new zziin("FLOAT", 1, zziio.FLOAT, 5);
        zzb = zziinVar2;
        zziio zziioVar = zziio.LONG;
        zziin zziinVar3 = new zziin("INT64", 2, zziioVar, 0);
        zzc = zziinVar3;
        zziin zziinVar4 = new zziin("UINT64", 3, zziioVar, 0);
        zzd = zziinVar4;
        zziio zziioVar2 = zziio.INT;
        zziin zziinVar5 = new zziin("INT32", 4, zziioVar2, 0);
        zze = zziinVar5;
        zziin zziinVar6 = new zziin("FIXED64", 5, zziioVar, 1);
        zzf = zziinVar6;
        zziin zziinVar7 = new zziin("FIXED32", 6, zziioVar2, 5);
        zzg = zziinVar7;
        zziin zziinVar8 = new zziin("BOOL", 7, zziio.BOOLEAN, 0);
        zzh = zziinVar8;
        zziin zziinVar9 = new zziin("STRING", 8, zziio.STRING, 2);
        zzi = zziinVar9;
        zziio zziioVar3 = zziio.MESSAGE;
        zziin zziinVar10 = new zziin("GROUP", 9, zziioVar3, 3);
        zzj = zziinVar10;
        zziin zziinVar11 = new zziin("MESSAGE", 10, zziioVar3, 2);
        zzk = zziinVar11;
        zziin zziinVar12 = new zziin("BYTES", 11, zziio.BYTE_STRING, 2);
        zzl = zziinVar12;
        zziin zziinVar13 = new zziin("UINT32", 12, zziioVar2, 0);
        zzm = zziinVar13;
        zziin zziinVar14 = new zziin("ENUM", 13, zziio.ENUM, 0);
        zzn = zziinVar14;
        zziin zziinVar15 = new zziin("SFIXED32", 14, zziioVar2, 5);
        zzo = zziinVar15;
        zziin zziinVar16 = new zziin("SFIXED64", 15, zziioVar, 1);
        zzp = zziinVar16;
        zziin zziinVar17 = new zziin("SINT32", 16, zziioVar2, 0);
        zzq = zziinVar17;
        zziin zziinVar18 = new zziin("SINT64", 17, zziioVar, 0);
        zzr = zziinVar18;
        zzu = new zziin[]{zziinVar, zziinVar2, zziinVar3, zziinVar4, zziinVar5, zziinVar6, zziinVar7, zziinVar8, zziinVar9, zziinVar10, zziinVar11, zziinVar12, zziinVar13, zziinVar14, zziinVar15, zziinVar16, zziinVar17, zziinVar18};
    }

    private zziin(String str, int i10, zziio zziioVar, int i11) {
        this.zzs = zziioVar;
        this.zzt = i11;
    }

    public static zziin[] values() {
        return (zziin[]) zzu.clone();
    }

    public final zziio zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
