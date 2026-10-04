package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f152423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152425c;

    public S1() {
    }

    public static String a(String mcc, String mnc, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.G.p(mcc, "mcc");
        kotlin.jvm.internal.G.p(mnc, "mnc");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mcc);
        sb2.append(H3.b.f45548j);
        sb2.append(mnc);
        sb2.append(H3.b.f45548j);
        sb2.append(i10);
        sb2.append(H3.b.f45548j);
        sb2.append(i11);
        sb2.append(H3.b.f45548j);
        sb2.append(i12 == -1 ? "" : Integer.valueOf(i12));
        sb2.append(H3.b.f45548j);
        sb2.append(i13 != Integer.MAX_VALUE ? Integer.valueOf(i13) : "");
        return sb2.toString();
    }

    public S1(CellInfo cellInfo, String mcc, String mnc, int i10) {
        kotlin.jvm.internal.G.p(mcc, "mcc");
        kotlin.jvm.internal.G.p(mnc, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.f152425c = i10;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f152424b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            kotlin.jvm.internal.G.o(cellIdentity, "getCellIdentity(...)");
            this.f152423a = a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (!(cellInfo instanceof CellInfoCdma)) {
            if (cellInfo instanceof CellInfoWcdma) {
                this.f152425c = i10;
                CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                this.f152424b = cellInfoWcdma.getCellSignalStrength().getDbm();
                CellIdentityWcdma cellIdentity2 = cellInfoWcdma.getCellIdentity();
                kotlin.jvm.internal.G.o(cellIdentity2, "getCellIdentity(...)");
                this.f152423a = a(mcc, mnc, cellIdentity2.getLac(), cellIdentity2.getCid(), cellIdentity2.getPsc(), Integer.MAX_VALUE);
                return;
            }
            return;
        }
        this.f152425c = i10;
        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
        this.f152424b = cellInfoCdma.getCellSignalStrength().getDbm();
        CellIdentityCdma cellIdentity3 = cellInfoCdma.getCellIdentity();
        kotlin.jvm.internal.G.o(cellIdentity3, "getCellIdentity(...)");
        this.f152423a = mcc + H3.b.f45548j + cellIdentity3.getSystemId() + H3.b.f45548j + cellIdentity3.getNetworkId() + H3.b.f45548j + cellIdentity3.getBasestationId();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f152423a);
            int i10 = this.f152424b;
            if (i10 != Integer.MAX_VALUE) {
                jSONObject.put("ss", i10);
            }
            jSONObject.put("nt", this.f152425c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
