package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f140546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f140547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile File f140548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Long f140549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f140550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f140551f = new AtomicBoolean(false);

    public a(String str, String str2) {
        this.f140546a = str;
        this.f140547b = str2;
    }

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) throws Exception {
        if (this.f140550e != null) {
            return this.f140550e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f140550e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f140550e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f140550e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.f140548c != null) {
            return this.f140548c;
        }
        if (this.f140549d != null && this.f140549d.longValue() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f140546a);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        try {
            if (this.f140549d == null) {
                this.f140549d = g.a(new File(this.f140546a, str));
            }
            if (this.f140549d == null) {
                this.f140549d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f140546a, str2 + str + str2 + this.f140549d + str2 + "using.lock");
            this.f140548c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.f140548c;
            bVarA.a();
            return file2;
        } catch (Throwable th) {
            bVarA.a();
            throw th;
        }
    }

    public final InputStream a(String str) throws Exception {
        return d(this.f140547b).a(a(this.f140547b, str));
    }

    public final boolean b(String str) throws Exception {
        return d(this.f140547b).b(a(this.f140547b, str));
    }

    public final int c(String str) {
        try {
            File file = new File(e(str), "res");
            if (!file.exists() || !file.isDirectory()) {
                return 0;
            }
            int length = file.listFiles().length;
            if (length > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    public final String b() {
        return this.f140547b;
    }

    public final Long a() {
        return this.f140549d;
    }

    public final void c() throws Exception {
        if (this.f140551f.getAndSet(true)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f140546a);
        String str = File.separator;
        sb2.append(str);
        sb2.append(this.f140547b);
        sb2.append(str);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f140548c == null) {
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f140548c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f140546a + str + this.f140547b);
        } finally {
            bVarA.a();
        }
    }
}
