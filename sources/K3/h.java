package k3;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import g3.InterfaceC4444b;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h implements InterfaceC4444b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f214385j = "@#&=*+-_.,:!?()/~'%;$";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.model.a f214386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final URL f214387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f214388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f214389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public URL f214390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public volatile byte[] f214391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f214392i;

    public h(URL url) {
        this(url, com.bumptech.glide.load.model.a.f139807b);
    }

    @Override // g3.InterfaceC4444b
    public void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f214388e;
        if (str != null) {
            return str;
        }
        URL url = this.f214387d;
        y3.m.f(url, "Argument must not be null");
        return url.toString();
    }

    public final byte[] d() {
        if (this.f214391h == null) {
            this.f214391h = c().getBytes(InterfaceC4444b.f202232b);
        }
        return this.f214391h;
    }

    public Map<String, String> e() {
        return this.f214386c.getHeaders();
    }

    @Override // g3.InterfaceC4444b
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f214386c.equals(hVar.f214386c)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f214389f)) {
            String string = this.f214388e;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f214387d;
                y3.m.f(url, "Argument must not be null");
                string = url.toString();
            }
            this.f214389f = Uri.encode(string, f214385j);
        }
        return this.f214389f;
    }

    public final URL g() throws MalformedURLException {
        if (this.f214390g == null) {
            this.f214390g = new URL(f());
        }
        return this.f214390g;
    }

    public String h() {
        return f();
    }

    @Override // g3.InterfaceC4444b
    public int hashCode() {
        if (this.f214392i == 0) {
            int iHashCode = c().hashCode();
            this.f214392i = iHashCode;
            this.f214392i = this.f214386c.hashCode() + (iHashCode * 31);
        }
        return this.f214392i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, com.bumptech.glide.load.model.a.f139807b);
    }

    public h(URL url, com.bumptech.glide.load.model.a aVar) {
        y3.m.f(url, "Argument must not be null");
        this.f214387d = url;
        this.f214388e = null;
        y3.m.f(aVar, "Argument must not be null");
        this.f214386c = aVar;
    }

    public h(String str, com.bumptech.glide.load.model.a aVar) {
        this.f214387d = null;
        y3.m.c(str);
        this.f214388e = str;
        y3.m.f(aVar, "Argument must not be null");
        this.f214386c = aVar;
    }
}
