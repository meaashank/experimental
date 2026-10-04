package com.cookiegames.smartcookie.download;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.R0;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f141259f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f141260g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f141261h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f141262i = 4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f141263j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f141264k = Pattern.compile("(?:(http|https|file)://)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?::[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_-][a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_.-]*|\\[[0-9a-fA-F:.]+])?(?::([0-9]*))?(/?[^#]*)?.*", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f141265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f141266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f141268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f141269e;

    public k(@Nullable String str) throws IllegalArgumentException {
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("address can't be null");
        }
        this.f141265a = "";
        this.f141266b = "";
        this.f141267c = -1;
        this.f141268d = RemoteSettings.FORWARD_SLASH_STRING;
        this.f141269e = "";
        Matcher matcher = f141264k.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(android.support.v4.media.i.a("Parsing of address '", str, "' failed"));
        }
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            this.f141265a = strGroup.toLowerCase(Locale.ROOT);
        }
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            this.f141269e = strGroup2;
        }
        String strGroup3 = matcher.group(3);
        if (strGroup3 != null) {
            this.f141266b = strGroup3;
        }
        String strGroup4 = matcher.group(4);
        if (strGroup4 != null && !strGroup4.isEmpty()) {
            try {
                this.f141267c = Integer.parseInt(strGroup4);
            } catch (NumberFormatException e10) {
                throw new RuntimeException("Parsing of port number failed", e10);
            }
        }
        String strGroup5 = matcher.group(5);
        if (strGroup5 != null && !strGroup5.isEmpty()) {
            if (strGroup5.charAt(0) == '/') {
                this.f141268d = strGroup5;
            } else {
                this.f141268d = RemoteSettings.FORWARD_SLASH_STRING.concat(strGroup5);
            }
        }
        if (this.f141267c == 443 && (str2 = this.f141265a) != null && str2.isEmpty()) {
            this.f141265a = "https";
        } else if (this.f141267c == -1) {
            if ("https".equals(this.f141265a)) {
                this.f141267c = 443;
            } else {
                this.f141267c = 80;
            }
        }
        String str3 = this.f141265a;
        if (str3 == null || !str3.isEmpty()) {
            return;
        }
        this.f141265a = "http";
    }

    public String a() {
        return this.f141269e;
    }

    public String b() {
        return this.f141266b;
    }

    public String c() {
        return this.f141268d;
    }

    public int d() {
        return this.f141267c;
    }

    public String e() {
        return this.f141265a;
    }

    public void f(String str) {
        this.f141269e = str;
    }

    public void g(@NonNull String str) {
        this.f141266b = str;
    }

    public void h(String str) {
        this.f141268d = str;
    }

    public void i(int i10) {
        this.f141267c = i10;
    }

    public void j(String str) {
        this.f141265a = str;
    }

    @NonNull
    public String toString() {
        String str;
        if ((this.f141267c == 443 || !"https".equals(this.f141265a)) && (this.f141267c == 80 || !"http".equals(this.f141265a))) {
            str = "";
        } else {
            str = com.prism.gaia.server.accounts.b.f166434b0 + Integer.toString(this.f141267c);
        }
        String strA = this.f141269e.isEmpty() ? "" : R0.a(new StringBuilder(), this.f141269e, '@');
        StringBuilder sb2 = new StringBuilder();
        androidx.concurrent.futures.b.a(sb2, this.f141265a, "://", strA);
        sb2.append(this.f141266b);
        sb2.append(str);
        sb2.append(this.f141268d);
        return sb2.toString();
    }
}
