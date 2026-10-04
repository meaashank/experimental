package tb;

import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.QCloudHttpRequest;
import java.net.URL;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f239253a = "x-cos-security-token";

    @Override // tb.m
    public void a(QCloudHttpRequest qCloudHttpRequest, h hVar) throws QCloudClientException {
        if (hVar == null) {
            throw new QCloudClientException(new QCloudAuthenticationException("Credentials is null."));
        }
        e eVar = (e) qCloudHttpRequest.C();
        if (eVar == null) {
            throw new QCloudClientException(new QCloudAuthenticationException("No sign provider for cos xml signer."));
        }
        StringBuilder sb2 = new StringBuilder("q-sign-algorithm=sha1&q-ak=");
        i iVar = (i) hVar;
        String strI = qCloudHttpRequest.i();
        if (strI == null) {
            strI = iVar.b();
        }
        eVar.setSignTime(strI);
        String strE = e(eVar.source(qCloudHttpRequest), iVar.d());
        sb2.append(hVar.c());
        sb2.append("&q-sign-time=");
        sb2.append(strI);
        sb2.append("&q-key-time=");
        sb2.append(iVar.b());
        sb2.append("&q-header-list=");
        String realHeaderList = eVar.getRealHeaderList();
        Locale locale = Locale.ROOT;
        sb2.append(realHeaderList.toLowerCase(locale));
        sb2.append("&q-url-param-list=");
        sb2.append(eVar.getRealParameterList().toLowerCase(locale));
        sb2.append("&q-signature=");
        sb2.append(strE);
        String string = sb2.toString();
        if (qCloudHttpRequest.D()) {
            c(qCloudHttpRequest, hVar, string);
        } else {
            b(qCloudHttpRequest, hVar, string);
        }
        eVar.onSignRequestSuccess(qCloudHttpRequest, hVar, string);
    }

    public final void b(QCloudHttpRequest qCloudHttpRequest, h hVar, String str) {
        qCloudHttpRequest.u("Authorization");
        qCloudHttpRequest.b("Authorization", str);
        if (hVar instanceof q) {
            qCloudHttpRequest.u("x-cos-security-token");
            qCloudHttpRequest.b("x-cos-security-token", ((q) hVar).i());
        }
    }

    public final void c(QCloudHttpRequest qCloudHttpRequest, h hVar, String str) {
        String strConcat;
        URL urlA = qCloudHttpRequest.A();
        if (hVar instanceof q) {
            str = str.concat("&token").concat("=").concat(((q) hVar).i());
        }
        String query = urlA.getQuery();
        String string = urlA.toString();
        int iIndexOf = string.indexOf(63);
        if (iIndexOf < 0) {
            strConcat = string.concat("?").concat(str);
        } else {
            int iA = com.bytedance.sdk.component.utils.a.a(query, iIndexOf, 1);
            strConcat = string.substring(0, iA).concat("&").concat(str).concat(string.substring(iA));
        }
        qCloudHttpRequest.x(strConcat);
    }

    public String d() {
        return "x-cos-security-token";
    }

    public final String e(String str, String str2) {
        byte[] bArrI = u.i(str, str2);
        return bArrI != null ? new String(u.d(bArrI, true)) : "";
    }
}
