package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class Zf {
    public static ConcurrentHashMap<Integer, Zf> ZRu = new ConcurrentHashMap<>();
    private String Ht;
    private int TFq;
    private int uR;
    private String NOt = "";
    private String mZ = "";

    private void Ht() {
        this.NOt = "";
        this.mZ = "";
        this.uR = 0;
        this.TFq = 0;
    }

    public String NOt() {
        return this.NOt;
    }

    public int TFq() {
        return this.TFq;
    }

    public String ZRu() {
        return this.Ht;
    }

    public String mZ() {
        return this.mZ;
    }

    public int uR() {
        return this.uR;
    }

    public static void mZ(int i10) {
        Zf zf;
        if (i10 == 0) {
            return;
        }
        if (ZRu == null) {
            ZRu = new ConcurrentHashMap<>();
        }
        if (!ZRu.containsKey(Integer.valueOf(i10)) || (zf = ZRu.get(Integer.valueOf(i10))) == null) {
            return;
        }
        zf.NOt(1);
    }

    public void NOt(int i10) {
        this.TFq = i10;
    }

    public void ZRu(int i10) {
        this.uR = i10;
    }

    public static void NOt(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (qFVar == null || TextUtils.isEmpty(qFVar.Wo())) {
            return;
        }
        int iGE = qFVar.GE();
        Integer numValueOf = Integer.valueOf(iGE);
        if (iGE == 0) {
            return;
        }
        if (ZRu == null) {
            ZRu = new ConcurrentHashMap<>();
        }
        Zf zf = ZRu.containsKey(numValueOf) ? ZRu.get(numValueOf) : null;
        if (zf == null) {
            zf = new Zf();
        }
        String strJYr = qFVar.jYr();
        if (TextUtils.isEmpty(strJYr) || !strJYr.equals(zf.ZRu())) {
            zf.Ht();
            zf.ZRu(qFVar);
            ZRu.put(numValueOf, zf);
        }
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (qFVar != null) {
            String strJYr = qFVar.jYr();
            if (!TextUtils.isEmpty(strJYr)) {
                this.Ht = strJYr;
            }
            String strGis = qFVar.Gis();
            if (TextUtils.isEmpty(strGis) && qFVar.wcb()) {
                strGis = qFVar.AOL().Vor();
            }
            if (!TextUtils.isEmpty(strGis)) {
                String[] strArrSplit = strGis.split(RemoteSettings.FORWARD_SLASH_STRING);
                if (strArrSplit.length >= 3) {
                    this.NOt = strArrSplit[2];
                }
            }
            if (qFVar.gaw() == null || TextUtils.isEmpty(qFVar.gaw().mZ())) {
                return;
            }
            this.mZ = qFVar.gaw().mZ();
        }
    }

    public static void mZ(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        Zf zf;
        if (qFVar == null) {
            return;
        }
        int iGE = qFVar.GE();
        Integer numValueOf = Integer.valueOf(iGE);
        if (iGE == 0) {
            return;
        }
        if (ZRu == null) {
            ZRu = new ConcurrentHashMap<>();
        }
        if (!ZRu.containsKey(numValueOf) || (zf = ZRu.get(numValueOf)) == null) {
            return;
        }
        zf.ZRu(1);
    }
}
