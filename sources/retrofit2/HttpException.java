package retrofit2;

import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f237619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient y<?> f237621c;

    public HttpException(y<?> yVar) {
        super(e(yVar));
        Response response = yVar.f237741a;
        this.f237619a = response.f225295d;
        this.f237620b = response.f225294c;
        this.f237621c = yVar;
    }

    public static String e(y<?> yVar) {
        A.b(yVar, "response == null");
        return "HTTP " + yVar.f237741a.f225295d + C4.q.f17581a + yVar.f237741a.f225294c;
    }

    public int d() {
        return this.f237619a;
    }

    public String g() {
        return this.f237620b;
    }

    public y<?> h() {
        return this.f237621c;
    }
}
