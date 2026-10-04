package com.bytedance.sdk.component.Mm.NOt;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.NOt.ZRu.Ht;
import com.bytedance.sdk.component.NOt.ZRu.Mm;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.ZRu;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import com.bytedance.sdk.component.NOt.ZRu.yBV;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends mZ {
    private boolean ZH;
    private com.bytedance.sdk.component.NOt.ZRu.ZRu aT;
    private Map<String, String> lp;
    public static final com.bytedance.sdk.component.NOt.ZRu.ZRu ZRu = new ZRu.C0410ZRu().ZRu().NOt();
    public static final com.bytedance.sdk.component.NOt.ZRu.ZRu NOt = new ZRu.C0410ZRu().NOt();

    public NOt(ZH zh) {
        super(zh);
        this.aT = ZRu;
        this.ZH = false;
        this.lp = new HashMap();
    }

    public void ZRu(String str, String str2) {
        if (str == null) {
            return;
        }
        this.lp.put(str, str2);
    }

    public void ZRu(boolean z10) {
        this.ZH = z10;
    }

    public void ZRu(final com.bytedance.sdk.component.Mm.ZRu.ZRu zRu) {
        try {
            sAl.ZRu zRu2 = new sAl.ZRu();
            if (this.ZH) {
                zRu2.NOt(this.FA);
            } else {
                Mm.ZRu zRu3 = new Mm.ZRu();
                Uri uri = Uri.parse(this.FA);
                zRu3.ZRu(uri.getScheme());
                zRu3.NOt(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        encodedPath = encodedPath.substring(1);
                    }
                    zRu3.mZ(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.lp.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.lp.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        zRu3.ZRu(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                zRu2.ZRu(zRu3.NOt());
            }
            ZRu(zRu2);
            zRu2.ZRu(this.aT);
            zRu2.ZRu((Object) mZ());
            if (!TextUtils.isEmpty(this.TFq)) {
                zRu2.ZRu(this.TFq);
            }
            int i10 = this.Ht;
            if (i10 > 0) {
                zRu2.ZRu(i10);
            }
            this.mZ.ZRu(zRu2.ZRu().NOt()).ZRu(new com.bytedance.sdk.component.NOt.ZRu.mZ() { // from class: com.bytedance.sdk.component.Mm.NOt.NOt.1
                @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
                public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, IOException iOException) {
                    com.bytedance.sdk.component.Mm.ZRu.ZRu zRu4 = zRu;
                    if (zRu4 != null) {
                        zRu4.ZRu(NOt.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
                public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, oK oKVar) throws IOException {
                    String strNOt;
                    if (zRu != null) {
                        HashMap map = new HashMap();
                        if (oKVar != null) {
                            Ht htMm = oKVar.Mm();
                            if (htMm != null) {
                                for (int i11 = 0; i11 < htMm.ZRu(); i11++) {
                                    map.put(htMm.ZRu(i11), htMm.NOt(i11));
                                }
                            }
                            yBV ybvHt = oKVar.Ht();
                            if (ybvHt == null) {
                                strNOt = "";
                            } else {
                                strNOt = ybvHt.NOt();
                            }
                            zRu.ZRu(NOt.this, new com.bytedance.sdk.component.Mm.NOt(oKVar.uR(), oKVar.mZ(), oKVar.TFq(), map, strNOt, oKVar.NOt(), oKVar.ZRu()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (zRu != null) {
                zRu.ZRu(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.Mm.NOt ZRu() {
        try {
            sAl.ZRu zRu = new sAl.ZRu();
            if (this.ZH) {
                zRu.NOt(this.FA);
            } else {
                Mm.ZRu zRu2 = new Mm.ZRu();
                Uri uri = Uri.parse(this.FA);
                zRu2.ZRu(uri.getScheme());
                zRu2.NOt(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        encodedPath = encodedPath.substring(1);
                    }
                    zRu2.mZ(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.lp.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.lp.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        zRu2.ZRu(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                zRu.ZRu(zRu2.NOt());
            }
            ZRu(zRu);
            zRu.ZRu(this.aT);
            zRu.ZRu((Object) mZ());
            oK oKVarNOt = this.mZ.ZRu(zRu.ZRu().NOt()).NOt();
            if (oKVarNOt == null) {
                return null;
            }
            HashMap map = new HashMap();
            Ht htMm = oKVarNOt.Mm();
            if (htMm != null) {
                for (int i10 = 0; i10 < htMm.ZRu(); i10++) {
                    map.put(htMm.ZRu(i10), htMm.NOt(i10));
                }
            }
            yBV ybvHt = oKVarNOt.Ht();
            return new com.bytedance.sdk.component.Mm.NOt(oKVarNOt.uR(), oKVarNOt.mZ(), oKVarNOt.TFq(), map, ybvHt != null ? ybvHt.NOt() : "", oKVarNOt.NOt(), oKVarNOt.ZRu());
        } catch (Throwable unused) {
            return null;
        }
    }
}
