package com.bykv.vk.openvk.preload.geckox.e;

import android.content.Context;
import android.support.v4.media.e;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f140554b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f140556d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f140553a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f140555c = new AtomicBoolean(false);

    public b(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        this.f140554b = str;
        if (file == null) {
            this.f140556d = new File(context.getFilesDir(), e.a(new StringBuilder("gecko_offline_res_x"), File.separator, str)).getAbsolutePath();
        } else {
            this.f140556d = new File(file, str).getAbsolutePath();
        }
    }

    private a d(String str) {
        a aVar;
        int iIndexOf = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f140553a) {
            try {
                aVar = this.f140553a.get(strSubstring);
                if (aVar == null) {
                    aVar = new a(this.f140556d, strSubstring);
                    this.f140553a.put(strSubstring, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final String a() {
        return this.f140556d;
    }

    public final int b(String str) throws Exception {
        if (this.f140555c.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).c(str);
    }

    public final boolean c(String str) throws Exception {
        if (this.f140555c.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).b(str);
    }

    public final InputStream a(String str) throws Exception {
        if (this.f140555c.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).a(str);
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        synchronized (this.f140553a) {
            try {
                Collection<a> collectionValues = this.f140553a.values();
                if (collectionValues == null) {
                    return map;
                }
                for (a aVar : collectionValues) {
                    map.put(aVar.b(), aVar.a());
                }
                return map;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() throws Exception {
        if (this.f140555c.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (this.f140553a) {
            try {
                Iterator<a> it = this.f140553a.values().iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                this.f140553a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
