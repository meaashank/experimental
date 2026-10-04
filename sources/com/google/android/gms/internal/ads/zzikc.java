package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzikc extends zzifm implements zzigx {
    private static final zzikc zze;
    private static volatile zzihe zzf;
    private int zza;
    private zziei zzb;
    private zziei zzc;
    private byte zzd = 2;

    static {
        zzikc zzikcVar = new zzikc();
        zze = zzikcVar;
        zzifm.zzbu(zzikc.class, zzikcVar);
    }

    private zzikc() {
        zziei zzieiVar = zziei.zza;
        this.zzb = zzieiVar;
        this.zzc = zzieiVar;
    }

    public static zzikb zzc() {
        return (zzikb) zze.zzbn();
    }

    public final /* synthetic */ void zzd(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 1;
        this.zzb = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        byte[] bArr = null;
        switch (zziflVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzifm.zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzikc();
            case NEW_BUILDER:
                return new zzikb(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                zzihe zziheVar = zzf;
                if (zziheVar != null) {
                    return zziheVar;
                }
                synchronized (zzikc.class) {
                    try {
                        zzifhVar = zzf;
                        if (zzifhVar == null) {
                            zzifhVar = new zzifh(zze);
                            zzf = zzifhVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzifhVar;
            default:
                throw null;
        }
    }

    public final /* synthetic */ void zze(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 2;
        this.zzc = zzieiVar;
    }
}
