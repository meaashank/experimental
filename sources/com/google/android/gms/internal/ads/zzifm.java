package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzifg;
import com.google.android.gms.internal.ads.zzifm;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzifm<MessageType extends zzifm<MessageType, BuilderType>, BuilderType extends zzifg<MessageType, BuilderType>> extends zzidr<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static final Map<Class<?>, zzifm<?, ?>> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected zziib zzt = zziib.zza();

    public static Method zzbA(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            int length = name.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + length + 43 + 2);
            androidx.room.F.a(sb2, "Generated message class \"", name, "\" missing method \"", str);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public static Object zzbB(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static zzifu zzbC() {
        return zzifn.zzd();
    }

    public static zzifu zzbD(zzifu zzifuVar) {
        int size = zzifuVar.size();
        return zzifuVar.zzh(size + size);
    }

    public static zzifx zzbE() {
        return zzigk.zzg();
    }

    public static zzifx zzbF(zzifx zzifxVar) {
        int size = zzifxVar.size();
        return zzifxVar.zzh(size + size);
    }

    public static zzift zzbG() {
        return zzifd.zzd();
    }

    public static zzift zzbH(zzift zziftVar) {
        int size = zziftVar.size();
        return zziftVar.zzh(size + size);
    }

    public static zzifp zzbI() {
        return zziet.zzd();
    }

    public static zzifp zzbJ(zzifp zzifpVar) {
        int size = zzifpVar.size();
        return zzifpVar.zzh(size + size);
    }

    public static zzifo zzbK() {
        return zzidy.zzd();
    }

    public static zzifo zzbL(zzifo zzifoVar) {
        int size = zzifoVar.size();
        return zzifoVar.zzh(size + size);
    }

    public static <E> zzify<E> zzbM() {
        return zzihh.zzd();
    }

    public static <E> zzify<E> zzbN(zzify<E> zzifyVar) {
        int size = zzifyVar.size();
        return zzifyVar.zzh(size + size);
    }

    public static <T extends zzifm<T, ?>> T zzbO(T t10, zziem zziemVar, zziew zziewVar) throws zzige {
        T t11 = (T) t10.zzbg();
        try {
            zziho zzihoVarZzb = zzihg.zza().zzb(t11.getClass());
            zzihoVarZzb.zzg(t11, zzien.zza(zziemVar), zziewVar);
            zzihoVarZzb.zzk(t11);
            return t11;
        } catch (zzige e10) {
            if (e10.zzb()) {
                throw new zzige(e10);
            }
            throw e10;
        } catch (zzihz e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzige) {
                throw ((zzige) e12.getCause());
            }
            throw new zzige(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzige) {
                throw ((zzige) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends zzifm<T, ?>> T zzbP(T t10, zziem zziemVar) throws zzige {
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        return (T) zzbO(t10, zziemVar, zziew.zza);
    }

    public static <T extends zzifm<T, ?>> T zzbQ(T t10, ByteBuffer byteBuffer, zziew zziewVar) throws zzige {
        zziem zziemVarZzI;
        if (byteBuffer.hasArray()) {
            zziemVarZzI = zziem.zzI(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            zziemVarZzI = zziem.zzI(bArr, 0, iRemaining, true);
        }
        T t11 = (T) zzbZ(t10, zziemVarZzI, zziewVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm<T, ?>> T zzbR(T t10, ByteBuffer byteBuffer) throws zzige {
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        return (T) zzbQ(t10, byteBuffer, zziew.zza);
    }

    public static <T extends zzifm<T, ?>> T zzbS(T t10, zziei zzieiVar) throws zzige {
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        T t11 = (T) zzbT(t10, zzieiVar, zziew.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm<T, ?>> T zzbT(T t10, zziei zzieiVar, zziew zziewVar) throws zzige {
        T t11 = (T) zzj(t10, zzieiVar, zziewVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm<T, ?>> T zzbU(T t10, byte[] bArr) throws zzige {
        int length = bArr.length;
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        T t11 = (T) zzh(t10, bArr, 0, length, zziew.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm<T, ?>> T zzbV(T t10, byte[] bArr, zziew zziewVar) throws zzige {
        T t11 = (T) zzh(t10, bArr, 0, bArr.length, zziewVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm<T, ?>> T zzbW(T t10, InputStream inputStream) throws zzige {
        zziem zziemVarZzH = zziem.zzH(inputStream, 4096);
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        T t11 = (T) zzbO(t10, zziemVarZzH, zziew.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm<T, ?>> T zzbX(T t10, InputStream inputStream, zziew zziewVar) throws zzige {
        T t11 = (T) zzbO(t10, zziem.zzH(inputStream, 4096), zziewVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm<T, ?>> T zzbY(T t10, zziem zziemVar) throws zzige {
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        return (T) zzbZ(t10, zziemVar, zziew.zza);
    }

    public static <T extends zzifm<T, ?>> T zzbZ(T t10, zziem zziemVar, zziew zziewVar) throws zzige {
        T t11 = (T) zzbO(t10, zziemVar, zziewVar);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm> T zzbt(Class<T> cls) {
        Map<Class<?>, zzifm<?, ?>> map = zzd;
        zzifm<?, ?> zzifmVar = map.get(cls);
        if (zzifmVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzifmVar = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzifmVar != null) {
            return zzifmVar;
        }
        zzifm<?, ?> zzifmVarZzbw = ((zzifm) zziih.zza(cls)).zzbw();
        if (zzifmVarZzbw == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzifmVarZzbw);
        return zzifmVarZzbw;
    }

    public static <T extends zzifm> void zzbu(Class<T> cls, T t10) {
        t10.zzaY();
        zzd.put(cls, t10);
    }

    public static Object zzbv(zzigw zzigwVar, String str, Object[] objArr) {
        return new zzihi(zzigwVar, str, objArr);
    }

    public static <ContainingType extends zzigw, Type> zzifk<ContainingType, Type> zzby(ContainingType containingtype, Type type, zzigw zzigwVar, zzifr zzifrVar, int i10, zziin zziinVar, Class cls) {
        return new zzifk<>(containingtype, type, zzigwVar, new zzifj(zzifrVar, i10, zziinVar, false, false), cls);
    }

    public static <ContainingType extends zzigw, Type> zzifk<ContainingType, Type> zzbz(ContainingType containingtype, zzigw zzigwVar, zzifr zzifrVar, int i10, zziin zziinVar, boolean z10, Class cls) {
        return new zzifk<>(containingtype, zzihh.zzd(), zzigwVar, new zzifj(zzifrVar, i10, zziinVar, true, z10), cls);
    }

    private void zzc() {
        if (this.zzt == zziib.zza()) {
            this.zzt = zziib.zzb();
        }
    }

    public static <T extends zzifm<T, ?>> T zzca(T t10, InputStream inputStream) throws zzige {
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        T t11 = (T) zzk(t10, inputStream, zziew.zza);
        zzi(t11);
        return t11;
    }

    public static <T extends zzifm<T, ?>> T zzcb(T t10, InputStream inputStream, zziew zziewVar) throws zzige {
        T t11 = (T) zzk(t10, inputStream, zziewVar);
        zzi(t11);
        return t11;
    }

    private int zzd(zziho<?> zzihoVar) {
        if (zzihoVar != null) {
            return zzihoVar.zze(this);
        }
        return zzihg.zza().zzb(getClass()).zze(this);
    }

    private static <MessageType extends zzifi<MessageType, BuilderType>, BuilderType, T> zzifk<MessageType, T> zze(zzieu<MessageType, T> zzieuVar) {
        return (zzifk) zzieuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzifm<T, ?>> boolean zzg(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.zzdd(zzifl.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzihg.zza().zzb(t10.getClass()).zzl(t10);
        if (z10) {
            t10.zzdd(zzifl.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10, null);
        }
        return zZzl;
    }

    private static <T extends zzifm<T, ?>> T zzh(T t10, byte[] bArr, int i10, int i11, zziew zziewVar) throws zzige {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.zzbg();
        try {
            zziho zzihoVarZzb = zzihg.zza().zzb(t11.getClass());
            zzihoVarZzb.zzj(t11, bArr, i10, i10 + i11, new zzidw(zziewVar));
            zzihoVarZzb.zzk(t11);
            return t11;
        } catch (zzige e10) {
            if (e10.zzb()) {
                throw new zzige(e10);
            }
            throw e10;
        } catch (zzihz e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzige) {
                throw ((zzige) e12.getCause());
            }
            throw new zzige(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static <T extends zzifm<T, ?>> T zzi(T t10) throws zzige {
        if (t10 == null || t10.zzbi()) {
            return t10;
        }
        throw t10.zzaU().zza();
    }

    private static <T extends zzifm<T, ?>> T zzj(T t10, zziei zzieiVar, zziew zziewVar) throws zzige {
        zziem zziemVarZzm = zzieiVar.zzm();
        T t11 = (T) zzbO(t10, zziemVarZzm, zziewVar);
        zziemVarZzm.zzb(0);
        return t11;
    }

    private static <T extends zzifm<T, ?>> T zzk(T t10, InputStream inputStream, zziew zziewVar) throws zzige {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            zziem zziemVarZzH = zziem.zzH(new zzidp(inputStream, zziem.zzO(i10, inputStream)), 4096);
            T t11 = (T) zzbO(t10, zziemVarZzH, zziewVar);
            zziemVarZzH.zzb(0);
            return t11;
        } catch (zzige e10) {
            if (e10.zzb()) {
                throw new zzige(e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new zzige(e11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzihg.zza().zzb(getClass()).zzb(this, (zzifm) obj);
    }

    public int hashCode() {
        if (zzaX()) {
            return zzbh();
        }
        if (zzbc()) {
            zzba(zzbh());
        }
        return zzaZ();
    }

    public String toString() {
        return zzigy.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    public final int zzaQ() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    public void zzaR(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(androidx.multidex.d.a(new StringBuilder(String.valueOf(i10).length() + 42), "serialized size must be non-negative, was ", i10));
        }
        this.zzc = i10 | (this.zzc & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    public int zzaT(zziho zzihoVar) {
        if (zzaX()) {
            int iZzd = zzd(zzihoVar);
            if (iZzd >= 0) {
                return iZzd;
            }
            throw new IllegalStateException(androidx.multidex.d.a(new StringBuilder(String.valueOf(iZzd).length() + 42), "serialized size must be non-negative, was ", iZzd));
        }
        if (zzaQ() != Integer.MAX_VALUE) {
            return zzaQ();
        }
        int iZzd2 = zzd(zzihoVar);
        zzaR(iZzd2);
        return iZzd2;
    }

    public final boolean zzaX() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    public final void zzaY() {
        this.zzc &= Integer.MAX_VALUE;
    }

    public final int zzaZ() {
        return this.zzq;
    }

    public final void zzba(int i10) {
        this.zzq = i10;
    }

    public final void zzbb() {
        this.zzq = 0;
    }

    public final boolean zzbc() {
        return zzaZ() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public final zzihe<MessageType> zzbd() {
        return (zzihe) zzdd(zzifl.GET_PARSER, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    /* JADX INFO: renamed from: zzbe, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbw() {
        return (MessageType) zzdd(zzifl.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    /* JADX INFO: renamed from: zzbf, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcY() {
        return (BuilderType) zzdd(zzifl.NEW_BUILDER, null, null);
    }

    public final MessageType zzbg() {
        return (MessageType) zzdd(zzifl.NEW_MUTABLE_INSTANCE, null, null);
    }

    public final int zzbh() {
        return zzihg.zza().zzb(getClass()).zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    public final boolean zzbi() {
        return zzg(this, true);
    }

    public final boolean zzbj(int i10, zziem zziemVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        zzc();
        return this.zzt.zzl(i10, zziemVar);
    }

    public final void zzbk(int i10, int i11) {
        zzc();
        zziib zziibVar = this.zzt;
        zziibVar.zze();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziibVar.zzk(i10 << 3, Long.valueOf(i11));
    }

    public final void zzbl(int i10, zziei zzieiVar) {
        zzc();
        zziib zziibVar = this.zzt;
        zziibVar.zze();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zziibVar.zzk((i10 << 3) | 2, zzieiVar);
    }

    public final void zzbm() {
        zzihg.zza().zzb(getClass()).zzk(this);
        zzaY();
    }

    public final <MessageType2 extends zzifm<MessageType2, BuilderType2>, BuilderType2 extends zzifg<MessageType2, BuilderType2>> BuilderType2 zzbn() {
        return (BuilderType2) zzdd(zzifl.NEW_BUILDER, null, null);
    }

    public final <MessageType2 extends zzifm<MessageType2, BuilderType2>, BuilderType2 extends zzifg<MessageType2, BuilderType2>> BuilderType2 zzbo(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) zzbn();
        buildertype2.zzbo(messagetype2);
        return buildertype2;
    }

    /* JADX INFO: renamed from: zzbp, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcc() {
        BuilderType buildertype = (BuilderType) zzdd(zzifl.NEW_BUILDER, null, null);
        buildertype.zzbo(this);
        return buildertype;
    }

    public final void zzbq() {
        zzaR(Integer.MAX_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public int zzbr() {
        return zzaT(null);
    }

    public final Object zzbs() throws Exception {
        return zzdd(zzifl.BUILD_MESSAGE_INFO, null, null);
    }

    public final void zzbx(zziib zziibVar) {
        this.zzt = zziib.zzc(this.zzt, zziibVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigw
    public void zzcX(zzier zzierVar) throws IOException {
        zzihg.zza().zzb(getClass()).zzf(this, zzies.zza(zzierVar));
    }

    public abstract Object zzdd(zzifl zziflVar, Object obj, Object obj2);
}
