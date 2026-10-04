package com.google.android.gms.internal.ads;

import A0.a;
import com.google.android.gms.internal.ads.zzidq;
import com.google.android.gms.internal.ads.zzidr;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzidq<MessageType extends zzidr<MessageType, BuilderType>, BuilderType extends zzidq<MessageType, BuilderType>> implements zzigv {
    private String zza(String str) {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 16 + String.valueOf(str).length() + 44);
        androidx.room.F.a(sb2, "Reading ", name, " from a ", str);
        sb2.append(" threw an IOException (should never happen).");
        return sb2.toString();
    }

    public static zzihz zzaR(zzigw zzigwVar) {
        return new zzihz(zzigwVar);
    }

    @Deprecated
    public static <T> void zzaS(Iterable<T> iterable, Collection<? super T> collection) {
        zzaT(iterable, (List) collection);
    }

    public static <T> void zzaT(Iterable<T> iterable, List<? super T> list) {
        iterable.getClass();
        if (!(iterable instanceof zzigh)) {
            if (iterable instanceof zzihf) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List listZza = ((zzigh) iterable).zza();
        zzigh zzighVar = (zzigh) list;
        int size = list.size();
        for (Object obj : listZza) {
            if (obj == null) {
                int size2 = zzighVar.size() - size;
                String strA = com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(size2).length() + 26), "Element at index ", size2, " is null.");
                int size3 = zzighVar.size();
                while (true) {
                    size3--;
                    if (size3 < size) {
                        throw new NullPointerException(strA);
                    }
                    zzighVar.remove(size3);
                }
            } else if (obj instanceof zziei) {
                zzighVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                zziei.zzt(bArr, 0, bArr.length);
                zzighVar.zzb();
            } else {
                zzighVar.add((String) obj);
            }
        }
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzihh) {
                ((zzihh) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    zzc(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            a.b bVar = (Object) list2.get(i10);
            if (bVar == null) {
                zzc(list, size2);
            }
            list.add(bVar);
        }
    }

    private static void zzc(List<?> list, int i10) {
        int size = list.size() - i10;
        String strA = com.google.android.gms.ads.internal.util.d.a(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(strA);
            }
            list.remove(size2);
        }
    }

    @Override // 
    public abstract BuilderType zzbf();

    /* JADX INFO: renamed from: zzaD, reason: merged with bridge method [inline-methods] */
    public BuilderType zzbe(zziem zziemVar) throws IOException {
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        return (BuilderType) zzbd(zziemVar, zziew.zza);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaE, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzbd(zziem zziemVar, zziew zziewVar) throws IOException;

    public BuilderType zzaF(zziei zzieiVar) throws zzige {
        try {
            zziem zziemVarZzm = zzieiVar.zzm();
            zzbe(zziemVarZzm);
            zziemVarZzm.zzb(0);
            return this;
        } catch (zzige e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    public BuilderType zzaG(zziei zzieiVar, zziew zziewVar) throws zzige {
        try {
            zziem zziemVarZzm = zzieiVar.zzm();
            zzbd(zziemVarZzm, zziewVar);
            zziemVarZzm.zzb(0);
            return this;
        } catch (zzige e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("ByteString"), e11);
        }
    }

    /* JADX INFO: renamed from: zzaH, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr) throws zzige {
        return (BuilderType) zzaZ(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i10, int i11) throws zzige {
        try {
            zziem zziemVarZzI = zziem.zzI(bArr, i10, i11, false);
            zzbe(zziemVarZzI);
            zziemVarZzI.zzb(0);
            return this;
        } catch (zzige e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    /* JADX INFO: renamed from: zzaJ, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zziew zziewVar) throws zzige {
        return (BuilderType) zzaX(bArr, 0, bArr.length, zziewVar);
    }

    @Override // 
    /* JADX INFO: renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaX(byte[] bArr, int i10, int i11, zziew zziewVar) throws zzige {
        try {
            zziem zziemVarZzI = zziem.zzI(bArr, i10, i11, false);
            zzbd(zziemVarZzI, zziewVar);
            zziemVarZzI.zzb(0);
            return this;
        } catch (zzige e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public BuilderType zzaL(InputStream inputStream) throws IOException {
        zziem zziemVarZzH = zziem.zzH(inputStream, 4096);
        zzbe(zziemVarZzH);
        zziemVarZzH.zzb(0);
        return this;
    }

    public BuilderType zzaM(InputStream inputStream, zziew zziewVar) throws IOException {
        zziem zziemVarZzH = zziem.zzH(inputStream, 4096);
        zzbd(zziemVarZzH, zziewVar);
        zziemVarZzH.zzb(0);
        return this;
    }

    public boolean zzaN(InputStream inputStream, zziew zziewVar) throws IOException {
        int i10 = inputStream.read();
        if (i10 == -1) {
            return false;
        }
        zzaM(new zzidp(inputStream, zziem.zzO(i10, inputStream)), zziewVar);
        return true;
    }

    public boolean zzaO(InputStream inputStream) throws IOException {
        int i10 = zziew.zzb;
        int i11 = zzidv.zza;
        return zzaN(inputStream, zziew.zza);
    }

    /* JADX INFO: renamed from: zzaP, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(zzigw zzigwVar) {
        if (zzbw().getClass().isInstance(zzigwVar)) {
            return (BuilderType) zzaQ((zzidr) zzigwVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public abstract BuilderType zzaQ(MessageType messagetype);

    public /* bridge */ /* synthetic */ zzigv zzaV(InputStream inputStream, zziew zziewVar) throws IOException {
        zzaM(inputStream, zziewVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzigv zzaW(InputStream inputStream) throws IOException {
        zzaL(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzigv zzbb(zziei zzieiVar, zziew zziewVar) throws zzige {
        zzaG(zzieiVar, zziewVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzigv zzbc(zziei zzieiVar) throws zzige {
        zzaF(zzieiVar);
        return this;
    }
}
