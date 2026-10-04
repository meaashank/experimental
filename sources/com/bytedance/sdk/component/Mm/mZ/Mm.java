package com.bytedance.sdk.component.Mm.mZ;

import com.bytedance.sdk.component.NOt.ZRu.FA;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Mm implements com.bytedance.sdk.component.NOt.ZRu.FA {
    private int ZRu;

    public void ZRu(int i10) {
        this.ZRu = i10;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.FA
    public oK ZRu(FA.ZRu zRu) throws IOException {
        oK oKVarZRu;
        Exception e10;
        sAl salZRu = zRu.ZRu();
        if (FA.ZRu().ZRu(this.ZRu).NOt() != null) {
            FA.ZRu().ZRu(this.ZRu).NOt().TFq();
        }
        String string = salZRu.NOt().toString();
        String strZRu = FA.ZRu().ZRu(this.ZRu).ZRu(string);
        if (!string.equals(strZRu)) {
            salZRu = salZRu.Vor().NOt(strZRu).NOt();
        }
        IOException iOException = null;
        try {
            oKVarZRu = zRu.ZRu(salZRu);
        } catch (Exception e11) {
            oKVarZRu = null;
            e10 = e11;
        }
        try {
            if (oKVarZRu.mZ() == -1) {
                FA.ZRu().ZRu(this.ZRu).ZRu(salZRu, new IOException());
            }
        } catch (Exception e12) {
            e10 = e12;
            IOException iOException2 = new IOException(e10.getMessage());
            FA.ZRu().ZRu(this.ZRu).ZRu(salZRu, e10);
            iOException = iOException2;
        }
        FA.ZRu().ZRu(this.ZRu).ZRu(salZRu, oKVarZRu);
        if (iOException == null) {
            return oKVarZRu == null ? zRu.ZRu(salZRu) : oKVarZRu;
        }
        throw iOException;
    }
}
