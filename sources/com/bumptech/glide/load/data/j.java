package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import e.f0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import w.y;
import y3.C5814c;

/* JADX INFO: loaded from: classes2.dex */
public class j implements d<InputStream> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f139412g = "HttpUrlFetcher";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f139413h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @f0
    public static final String f139414i = "Location";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @f0
    public static final b f139415j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @f0
    public static final int f139416k = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3.h f139417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f139418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f139419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f139420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f139421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f139422f;

    public static class a implements b {
        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public j(k3.h hVar, int i10) {
        this(hVar, i10, f139415j);
    }

    public static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable(f139412g, 3)) {
                return -1;
            }
            Log.d(f139412g, "Failed to get a response code", e10);
            return -1;
        }
    }

    public static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    public static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f139421e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f139420d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f139420d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public DataSource c() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f139422f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@NonNull Priority priority, @NonNull d.a<? super InputStream> aVar) {
        long jB = y3.i.b();
        try {
            try {
                aVar.e(j(this.f139417a.i(), 0, null, this.f139417a.e()));
                if (Log.isLoggable(f139412g, 2)) {
                    Log.v(f139412g, "Finished http url fetcher fetch in " + y3.i.a(jB));
                }
            } catch (IOException e10) {
                if (Log.isLoggable(f139412g, 3)) {
                    Log.d(f139412g, "Failed to load data for url", e10);
                }
                aVar.f(e10);
                if (Log.isLoggable(f139412g, 2)) {
                    Log.v(f139412g, "Finished http url fetcher fetch in " + y3.i.a(jB));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable(f139412g, 2)) {
                Log.v(f139412g, "Finished http url fetcher fetch in " + y3.i.a(jB));
            }
            throw th;
        }
    }

    public final HttpURLConnection e(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionA = this.f139419c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f139418b);
            httpURLConnectionA.setReadTimeout(this.f139418b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new HttpException("URL.openConnection threw", 0, e10);
        }
    }

    public final InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f139421e = C5814c.b(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f139412g, 3)) {
                    Log.d(f139412g, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f139421e = httpURLConnection.getInputStream();
            }
            return this.f139421e;
        } catch (IOException e10) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    public final InputStream j(URL url, int i10, URL url2, Map<String, String> map) throws HttpException {
        if (i10 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionE = e(url, map);
        this.f139420d = httpURLConnectionE;
        try {
            httpURLConnectionE.connect();
            this.f139421e = this.f139420d.getInputStream();
            if (this.f139422f) {
                return null;
            }
            int iF = f(this.f139420d);
            if (h(iF)) {
                return g(this.f139420d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new HttpException(iF);
                }
                try {
                    throw new HttpException(this.f139420d.getResponseMessage(), iF, null);
                } catch (IOException e10) {
                    throw new HttpException("Failed to get a response message", iF, e10);
                }
            }
            String headerField = this.f139420d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iF, null);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new HttpException(y.a("Bad redirect url: ", headerField), iF, e11);
            }
        } catch (IOException e12) {
            throw new HttpException("Failed to connect or obtain data", f(this.f139420d), e12);
        }
    }

    @f0
    public j(k3.h hVar, int i10, b bVar) {
        this.f139417a = hVar;
        this.f139418b = i10;
        this.f139419c = bVar;
    }
}
