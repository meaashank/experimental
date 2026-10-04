package retrofit2;

import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Response f237741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f237742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final okhttp3.u f237743c;

    public y(Response response, @Nullable T t10, @Nullable okhttp3.u uVar) {
        this.f237741a = response;
        this.f237742b = t10;
        this.f237743c = uVar;
    }

    public static <T> y<T> c(int i10, okhttp3.u uVar) {
        if (i10 >= 400) {
            return d(uVar, new Response.Builder().code(i10).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException(android.support.v4.media.c.a("code < 400: ", i10));
    }

    public static <T> y<T> d(okhttp3.u uVar, Response response) {
        A.b(uVar, "body == null");
        A.b(response, "rawResponse == null");
        if (response.G1()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new y<>(response, null, uVar);
    }

    public static <T> y<T> j(int i10, @Nullable T t10) {
        if (i10 < 200 || i10 >= 300) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("code < 200 or >= 300: ", i10));
        }
        return m(t10, new Response.Builder().code(i10).message("Response.success()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> y<T> k(@Nullable T t10) {
        return m(t10, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> y<T> l(@Nullable T t10, Headers headers) {
        A.b(headers, "headers == null");
        return m(t10, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> y<T> m(@Nullable T t10, Response response) {
        A.b(response, "rawResponse == null");
        if (response.G1()) {
            return new y<>(response, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.f237742b;
    }

    public int b() {
        return this.f237741a.f225295d;
    }

    @Nullable
    public okhttp3.u e() {
        return this.f237743c;
    }

    public Headers f() {
        return this.f237741a.f225297f;
    }

    public boolean g() {
        return this.f237741a.G1();
    }

    public String h() {
        return this.f237741a.f225294c;
    }

    public Response i() {
        return this.f237741a;
    }

    public String toString() {
        return this.f237741a.toString();
    }
}
