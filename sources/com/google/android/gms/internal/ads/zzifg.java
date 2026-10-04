package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzifg;
import com.google.android.gms.internal.ads.zzifm;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class zzifg<MessageType extends zzifm<MessageType, BuilderType>, BuilderType extends zzifg<MessageType, BuilderType>> extends zzidq<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    public zzifg(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbg();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzihg.zza().zzb(messagetype.getClass()).zzd(messagetype, messagetype2);
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* JADX INFO: renamed from: zzaE */
    public /* bridge */ /* synthetic */ zzidq zzbd(zziem zziemVar, zziew zziewVar) throws IOException {
        zzbr(zziemVar, zziewVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* JADX INFO: renamed from: zzaI */
    public /* bridge */ /* synthetic */ zzidq zzaZ(byte[] bArr, int i10, int i11) throws zzige {
        zzbq(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* JADX INFO: renamed from: zzaK */
    public /* bridge */ /* synthetic */ zzidq zzaX(byte[] bArr, int i10, int i11, zziew zziewVar) throws zzige {
        zzbp(bArr, i10, i11, zziewVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    public /* bridge */ /* synthetic */ zzidq zzaQ(zzidr zzidrVar) {
        zzbn((zzifm) zzidrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    public /* bridge */ /* synthetic */ zzigv zzaX(byte[] bArr, int i10, int i11, zziew zziewVar) throws zzige {
        zzbp(bArr, i10, i11, zziewVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    public /* bridge */ /* synthetic */ zzigv zzaZ(byte[] bArr, int i10, int i11) throws zzige {
        zzbq(bArr, i10, i11);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    public /* bridge */ /* synthetic */ zzigv zzbd(zziem zziemVar, zziew zziewVar) throws IOException {
        zzbr(zziemVar, zziewVar);
        return this;
    }

    public final void zzbg() {
        if (this.zza.zzaX()) {
            return;
        }
        zzbh();
    }

    public void zzbh() {
        MessageType messagetype = (MessageType) zza();
        zzb(messagetype, this.zza);
        this.zza = messagetype;
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    public final boolean zzbi() {
        return zzifm.zzg(this.zza, false);
    }

    public final BuilderType zzbj() {
        if (this.zzb.zzaX()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = (MessageType) zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzidq
    /* JADX INFO: renamed from: zzbk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BuilderType zzbf() {
        BuilderType buildertype = (BuilderType) zzbw().zzcY();
        buildertype.zza = (MessageType) zzbt();
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzigv
    /* JADX INFO: renamed from: zzbl, reason: merged with bridge method [inline-methods] */
    public MessageType zzbt() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzbm();
        return this.zza;
    }

    /* JADX INFO: renamed from: zzbm, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbu() {
        MessageType messagetype = (MessageType) zzbt();
        if (messagetype.zzbi()) {
            return messagetype;
        }
        throw zzidq.zzaR(messagetype);
    }

    public BuilderType zzbn(MessageType messagetype) {
        zzbo(messagetype);
        return this;
    }

    public BuilderType zzbo(MessageType messagetype) {
        if (zzbw().equals(messagetype)) {
            return this;
        }
        zzbg();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbp(byte[] bArr, int i10, int i11, zziew zziewVar) throws zzige {
        zzbg();
        try {
            zzihg.zza().zzb(this.zza.getClass()).zzj(this.zza, bArr, i10, i10 + i11, new zzidw(zziewVar));
            return this;
        } catch (zzige e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public BuilderType zzbq(byte[] bArr, int i10, int i11) throws zzige {
        int i12 = zziew.zzb;
        int i13 = zzidv.zza;
        zzbp(bArr, i10, i11, zziew.zza);
        return this;
    }

    public BuilderType zzbr(zziem zziemVar, zziew zziewVar) throws IOException {
        zzbg();
        try {
            zzihg.zza().zzb(this.zza.getClass()).zzg(this.zza, zzien.zza(zziemVar), zziewVar);
            return this;
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof IOException) {
                throw ((IOException) e10.getCause());
            }
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    /* JADX INFO: renamed from: zzbs, reason: merged with bridge method [inline-methods] */
    public MessageType zzbw() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzigv zzbv() {
        zzbj();
        return this;
    }
}
