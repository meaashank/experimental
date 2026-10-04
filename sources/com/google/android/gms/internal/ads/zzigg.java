package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class zzigg {
    public static final zzigg zza;
    public static final zzigg zzb;
    public static final zzigg zzc;
    public static final zzigg zzd;
    public static final zzigg zze;
    public static final zzigg zzf;
    public static final zzigg zzg;
    public static final zzigg zzh;
    public static final zzigg zzi;
    public static final zzigg zzj;
    private static final /* synthetic */ zzigg[] zzl;
    private final Class zzk;

    static {
        zzigg zziggVar = new zzigg("VOID", 0, Void.class, Void.class, null);
        zza = zziggVar;
        Class cls = Integer.TYPE;
        zzigg zziggVar2 = new zzigg("INT", 1, cls, Integer.class, 0);
        zzb = zziggVar2;
        zzigg zziggVar3 = new zzigg("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zziggVar3;
        zzigg zziggVar4 = new zzigg("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zziggVar4;
        zzigg zziggVar5 = new zzigg("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zziggVar5;
        zzigg zziggVar6 = new zzigg("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zziggVar6;
        zzigg zziggVar7 = new zzigg("STRING", 6, String.class, String.class, "");
        zzg = zziggVar7;
        zzigg zziggVar8 = new zzigg("BYTE_STRING", 7, zziei.class, zziei.class, zziei.zza);
        zzh = zziggVar8;
        zzigg zziggVar9 = new zzigg("ENUM", 8, cls, Integer.class, null);
        zzi = zziggVar9;
        zzigg zziggVar10 = new zzigg("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zziggVar10;
        zzl = new zzigg[]{zziggVar, zziggVar2, zziggVar3, zziggVar4, zziggVar5, zziggVar6, zziggVar7, zziggVar8, zziggVar9, zziggVar10};
    }

    private zzigg(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzk = cls2;
    }

    public static zzigg[] values() {
        return (zzigg[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
