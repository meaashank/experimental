package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzuh extends zzcq {
    private static void zzq(int i10, ByteBuffer byteBuffer) {
        float f10 = (float) (((double) i10) * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f10) ? 0 : Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferZzk;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.zzb.zzd;
        if (i11 == 2) {
            byteBufferZzk = zzk(i10 + i10);
            while (iPosition < iLimit) {
                zzq(byteBuffer.getShort(iPosition) << 16, byteBufferZzk);
                iPosition += 2;
            }
        } else if (i11 == 3) {
            byteBufferZzk = zzk(i10 * 4);
            while (iPosition < iLimit) {
                zzq(((byteBuffer.get(iPosition) & 255) - 128) << 24, byteBufferZzk);
                iPosition++;
            }
        } else if (i11 == 21) {
            byteBufferZzk = zzk((i10 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(zzhbj.zze(byteBuffer.get(iPosition + 2), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition), (byte) 0), byteBufferZzk);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferZzk = zzk(i10);
            while (iPosition < iLimit) {
                zzq(byteBuffer.getInt(iPosition), byteBufferZzk);
                iPosition += 4;
            }
        } else if (i11 == 268435456) {
            byteBufferZzk = zzk(i10 + i10);
            while (iPosition < iLimit) {
                zzq(Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16, byteBufferZzk);
                iPosition += 2;
            }
        } else if (i11 == 1342177280) {
            byteBufferZzk = zzk((i10 / 3) * 4);
            while (iPosition < iLimit) {
                zzq(zzhbj.zze(byteBuffer.get(iPosition), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition + 2), (byte) 0), byteBufferZzk);
                iPosition += 3;
            }
        } else if (i11 == 1610612736) {
            byteBufferZzk = zzk(i10);
            while (iPosition < iLimit) {
                zzq(Integer.reverseBytes(byteBuffer.getInt(iPosition)), byteBufferZzk);
                iPosition += 4;
            }
        } else if (i11 == 1879048192) {
            byteBufferZzk = zzk(i10 / 2);
            while (iPosition < iLimit) {
                byteBufferZzk.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i11 == 1895825408) {
            byteBufferZzk = zzk(i10);
            while (iPosition < iLimit) {
                byteBufferZzk.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                iPosition += 4;
            }
        } else {
            if (i11 != 1912602624) {
                throw new IllegalStateException();
            }
            byteBufferZzk = zzk(i10 / 2);
            while (iPosition < iLimit) {
                byteBufferZzk.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        int i10 = zzclVar.zzd;
        if (zzfm.zzE(i10)) {
            return i10 != 4 ? new zzcl(zzclVar.zzb, zzclVar.zzc, 4) : zzcl.zza;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
