package com.bytedance.sdk.openadsdk.Mm;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.NOt.ZRu.Ht;
import com.bytedance.sdk.component.NOt.ZRu.TFq;
import com.bytedance.sdk.component.NOt.ZRu.Vor;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.edo;
import com.bytedance.sdk.component.NOt.ZRu.mZ;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements INetWork {
    protected ZH NOt;
    protected ZH ZRu;

    public ZRu() {
        ZH.ZRu zRu = new ZH.ZRu();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.ZRu = zRu.ZRu(10L, timeUnit).NOt(10L, timeUnit).mZ(10L, timeUnit).ZRu();
        this.NOt = new ZH.ZRu().ZRu(10L, timeUnit).NOt(30L, timeUnit).mZ(30L, timeUnit).ZRu();
    }

    private Map<String, String> ZRu(Ht ht) {
        if (ht == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < ht.ZRu(); i10++) {
            map.put(ht.ZRu(i10), ht.NOt(i10));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        oK oKVarNOt = this.ZRu.ZRu(new sAl.ZRu().ZRu().NOt(str).NOt()).NOt();
        return new Response(ZRu(oKVarNOt.Mm()), oKVarNOt.mZ() == 200 ? oKVarNOt.Ht().NOt() : null, oKVarNOt.mZ(), oKVarNOt.TFq());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        TFq.ZRu zRu = new TFq.ZRu();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                zRu.ZRu((String) pair.first, (String) pair.second);
            }
        }
        oK oKVarNOt = this.ZRu.ZRu(new sAl.ZRu().NOt(str).ZRu((edo) zRu.ZRu()).NOt()).NOt();
        return new Response(ZRu(oKVarNOt.Mm()), oKVarNOt.mZ() == 200 ? oKVarNOt.Ht().NOt() : null, oKVarNOt.mZ(), oKVarNOt.TFq());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream) throws Exception {
        BufferedInputStream bufferedInputStream;
        Exception e10;
        int iMZ;
        BufferedInputStream bufferedInputStream2 = null;
        int i10 = 0;
        try {
            try {
                oK oKVarNOt = this.NOt.ZRu(new sAl.ZRu().ZRu().NOt(str).NOt()).NOt();
                iMZ = oKVarNOt.mZ();
                try {
                    bufferedInputStream = new BufferedInputStream(oKVarNOt.Ht().mZ());
                } catch (Exception e11) {
                    bufferedInputStream = null;
                    e10 = e11;
                }
            } catch (Exception e12) {
                bufferedInputStream = null;
                e10 = e12;
            }
        } catch (Throwable th) {
            th = th;
            CloseableUtils.close(bufferedInputStream2);
            throw th;
        }
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i11 = bufferedInputStream.read(bArr, 0, 2048);
                    if (i11 == -1) {
                        CloseableUtils.close(bufferedInputStream);
                        return;
                    }
                    bufferOutputStream.write(bArr, 0, i11);
                }
            } catch (Exception e13) {
                e10 = e13;
                i10 = iMZ;
                throw new RuntimeException("downloadFile failed, code: " + i10 + ", url:" + str + ", caused by:" + e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            CloseableUtils.close(bufferedInputStream2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.ZRu.ZRu(new sAl.ZRu().ZRu().NOt(str).NOt()).ZRu(new mZ() { // from class: com.bytedance.sdk.openadsdk.Mm.ZRu.1
            @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
            public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, oK oKVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
            public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        oK oKVarNOt = this.ZRu.ZRu(new sAl.ZRu().NOt(str).ZRu(edo.ZRu(Vor.ZRu("application/json; charset=utf-8"), str2)).NOt()).NOt();
        return new Response(ZRu(oKVarNOt.Mm()), oKVarNOt.mZ() == 200 ? oKVarNOt.Ht().NOt() : null, oKVarNOt.mZ(), oKVarNOt.TFq());
    }
}
