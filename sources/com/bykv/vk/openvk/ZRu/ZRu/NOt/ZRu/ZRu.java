package com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.NOt;
import com.bykv.vk.openvk.ZRu.ZRu.NOt.ZRu.ZRu.mZ;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends MediaDataSource {
    public static final ConcurrentHashMap<String, ZRu> ZRu = new ConcurrentHashMap<>();
    private final mZ NOt;
    private final com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ TFq;
    private long mZ = -2147483648L;
    private final Context uR;

    public ZRu(Context context, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        this.uR = context;
        this.TFq = mZVar;
        this.NOt = new NOt(context, mZVar);
    }

    public com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ ZRu() {
        return this.TFq;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.TFq.sAl();
        mZ mZVar = this.NOt;
        if (mZVar != null) {
            mZVar.NOt();
        }
        ZRu.remove(this.TFq.edo());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.mZ == -2147483648L) {
            if (this.uR == null || TextUtils.isEmpty(this.TFq.sAl())) {
                return -1L;
            }
            this.mZ = this.NOt.mZ();
        }
        return this.mZ;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
        int iZRu = this.NOt.ZRu(j10, bArr, i10, i11);
        int length = bArr.length;
        Objects.toString(Thread.currentThread());
        return iZRu;
    }

    public static ZRu ZRu(Context context, com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.mZ mZVar) {
        ZRu zRu = new ZRu(context, mZVar);
        ZRu.put(mZVar.edo(), zRu);
        return zRu;
    }
}
