package tb;

/* JADX INFO: loaded from: classes7.dex */
public class c implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f239248d;

    public c(String str, String str2, String str3, long j10, long j11) {
        if (str == null) {
            throw new IllegalArgumentException("secretId cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("secretKey cannot be null.");
        }
        if (str3 == null) {
            throw new IllegalArgumentException("signKey cannot be null.");
        }
        if (j10 >= j11) {
            throw new IllegalArgumentException("beginTime must be less than expiredTime.");
        }
        this.f239245a = str;
        this.f239247c = str2;
        this.f239246b = str3;
        this.f239248d = u.h(j10) + ";" + u.h(j11);
    }

    @Override // tb.j
    public String a() {
        return this.f239247c;
    }

    @Override // tb.i
    public String b() {
        return this.f239248d;
    }

    @Override // tb.h
    public String c() {
        return this.f239245a;
    }

    @Override // tb.i
    public String d() {
        return this.f239246b;
    }

    @Override // tb.i
    public boolean isValid() {
        long jC = com.tencent.qcloud.core.http.e.c();
        long[] jArrJ = u.j(this.f239248d);
        return jC > jArrJ[0] && jC < jArrJ[1] - 60;
    }

    public c(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new IllegalArgumentException("secretId cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("secretKey cannot be null.");
        }
        if (str3 == null) {
            throw new IllegalArgumentException("signKey cannot be null.");
        }
        if (str4 != null) {
            this.f239245a = str;
            this.f239247c = str2;
            this.f239246b = str3;
            this.f239248d = str4;
            return;
        }
        throw new IllegalArgumentException("keyTime cannot be null.");
    }
}
