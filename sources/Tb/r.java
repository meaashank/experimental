package tb;

import com.tencent.qcloud.core.common.QCloudClientException;

/* JADX INFO: loaded from: classes7.dex */
public class r extends AbstractC5628b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f239265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f239266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f239267e;

    @Deprecated
    public r(String str, String str2, long j10) {
        this.f239267e = str;
        this.f239265c = str2;
        this.f239266d = j10;
    }

    @Override // tb.AbstractC5628b
    public i c() throws QCloudClientException {
        long jC = com.tencent.qcloud.core.http.e.c();
        String str = jC + ";" + (this.f239266d + jC);
        return new c(this.f239267e, this.f239265c, i(this.f239265c, str), str);
    }

    public long f() {
        return this.f239266d;
    }

    public String g() {
        return this.f239267e;
    }

    public String h() {
        return this.f239265c;
    }

    public final String i(String str, String str2) {
        byte[] bArrI = u.i(str2, str);
        if (bArrI != null) {
            return new String(u.d(bArrI, true));
        }
        return null;
    }
}
