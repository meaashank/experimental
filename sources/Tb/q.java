package tb;

/* JADX INFO: loaded from: classes7.dex */
public class q implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f239263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f239264e;

    public q(String str, String str2, String str3, long j10) {
        this(str, str2, str3, com.tencent.qcloud.core.http.e.c(), j10);
    }

    @Override // tb.j
    public String a() {
        return this.f239261b;
    }

    @Override // tb.i
    public String b() {
        return u.h(this.f239263d) + ";" + u.h(this.f239264e);
    }

    @Override // tb.h
    public String c() {
        return this.f239260a;
    }

    @Override // tb.i
    public String d() {
        return g(this.f239261b, b());
    }

    public long e() {
        return this.f239264e;
    }

    public final String f(long j10, long j11) {
        return u.h(j10) + ";" + u.h(j11);
    }

    public final String g(String str, String str2) {
        byte[] bArrI = u.i(str2, str);
        if (bArrI != null) {
            return new String(u.d(bArrI, true));
        }
        return null;
    }

    public long h() {
        return this.f239263d;
    }

    public String i() {
        return this.f239262c;
    }

    @Override // tb.i
    public boolean isValid() {
        return com.tencent.qcloud.core.http.e.c() <= this.f239264e - 60;
    }

    public q(String str, String str2, String str3, long j10, long j11) {
        if (str == null) {
            throw new IllegalArgumentException("secretId cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("secretKey cannot be null.");
        }
        if (str3 == null) {
            throw new IllegalArgumentException("token cannot be null.");
        }
        if (j10 >= j11) {
            throw new IllegalArgumentException("beginTime must be less than expiredTime.");
        }
        this.f239260a = str;
        this.f239261b = str2;
        this.f239263d = j10;
        this.f239264e = j11;
        this.f239262c = str3;
    }

    public q(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new IllegalArgumentException("secretId cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("secretKey cannot be null.");
        }
        if (str3 == null) {
            throw new IllegalArgumentException("token cannot be null.");
        }
        if (str4 != null) {
            this.f239260a = str;
            this.f239261b = str2;
            this.f239262c = str3;
            long[] jArrJ = u.j(str4);
            this.f239263d = jArrJ[0];
            this.f239264e = jArrJ[1];
            return;
        }
        throw new IllegalArgumentException("keyTime cannot be null.");
    }
}
