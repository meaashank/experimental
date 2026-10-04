package com.prism.lib.downloader;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.prism.commons.exception.GaiaRuntimeException;
import com.prism.lib.downloader.DownloaderConfig;
import com.prism.lib.downloader.common.DownloadError;
import com.prism.lib.downloader.common.DownloadStatus;
import com.prism.lib.downloader.ui.DownloaderActivity;
import com.prism.lib.pfs.PrivateFileSystem;
import com.prism.lib.pfs.PrivateFileSystemConfig;
import com.prism.lib.pfs.exception.PfsIOException;
import com.prism.lib.pfs.file.PrivateFile;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import sa.InterfaceC5586c;
import ta.c;
import xa.C5800b;
import xa.C5801c;
import xa.C5802d;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f178661b = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f178662c = "prism.downloader";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f178663d = "pfs.private.residePath";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f178664e = "Downloads";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f178665f = "Downloads";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f178666g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static DownloaderConfig f178667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static a f178668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static PrivateFileSystem f178669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC5586c f178670k = new C0692a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DownloaderConfig f178671a;

    public a(DownloaderConfig downloaderConfig) {
        this.f178671a = downloaderConfig == null ? new DownloaderConfig.Builder().build() : downloaderConfig;
    }

    public static void a(long j10) {
        C5802d.f().a(j10);
    }

    public static void b(Object obj) {
        C5802d.f().c(obj);
    }

    public static void c() {
        C5802d.f().b();
    }

    public static long d(C5800b c5800b, InterfaceC5586c interfaceC5586c) {
        return c5800b.l(interfaceC5586c);
    }

    public static Context f() {
        return PrivateFileSystem.getAppContext();
    }

    public static a g() {
        if (f178666g) {
            return f178668i;
        }
        throw new GaiaRuntimeException("Downloader.initialize() not called inside Application.onCreate()");
    }

    public static DownloaderConfig h() {
        return f178667h;
    }

    public static a i(DownloaderConfig downloaderConfig) {
        if (f178666g) {
            return new a(downloaderConfig);
        }
        throw new GaiaRuntimeException("Downloader.initialize() not called inside Application.onCreate()");
    }

    public static String j() {
        return r().getString(f178663d, Oa.a.f65232a);
    }

    public static PrivateFile k(String str) throws PfsIOException {
        return PrivateFile.c.f(f178669j, "Downloads", str);
    }

    public static List<PrivateFile> l() {
        List<PrivateFile> list = m().list();
        return list == null ? new LinkedList() : list;
    }

    public static PrivateFile m() {
        try {
            return f178669j.parse("Downloads");
        } catch (PfsIOException e10) {
            throw new GaiaRuntimeException("FATAL exception: " + e10.getMessage(), e10);
        }
    }

    public static String n() {
        return "Downloads";
    }

    public static PrivateFileSystem o() {
        return f178669j;
    }

    public static PrivateFile p(String str) throws PfsIOException {
        return PrivateFile.c.e(PrivateFileSystem.getExportDefault(), str);
    }

    public static PrivateFileSystem q() {
        return PrivateFileSystem.getExportDefault();
    }

    public static SharedPreferences r() {
        return PrivateFileSystem.getAppContext().getSharedPreferences(f178662c, 0);
    }

    public static DownloadStatus s(long j10) {
        return C5802d.f().h(j10);
    }

    public static void t(Application application, DownloaderConfig downloaderConfig) {
        if (f178666g) {
            return;
        }
        f178667h = downloaderConfig;
        PrivateFileSystem.init(application);
        if (downloaderConfig.b() == null) {
            try {
                f178669j = PrivateFileSystem.getInstance(new PrivateFileSystemConfig.Builder().setResidePath("Downloads", j()).build());
            } catch (IOException e10) {
                throw new GaiaRuntimeException("FATAL exception: " + e10.getMessage(), e10);
            }
        } else {
            f178669j = downloaderConfig.b();
        }
        C5802d.f();
        c.c(application);
        f178668i = new a(f178667h);
        f178666g = true;
    }

    public static void u(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) DownloaderActivity.class));
    }

    public static void v(long j10) {
        C5802d.f().j(j10);
    }

    public static void x(long j10) {
        C5802d.f().m(j10);
    }

    public static void y(@NonNull DownloaderConfig downloaderConfig) {
        f178667h = downloaderConfig;
        f178668i.f178671a = downloaderConfig;
    }

    public long e(String str, String str2, InterfaceC5586c interfaceC5586c) {
        if (interfaceC5586c == null) {
            interfaceC5586c = f178670k;
        }
        return new C5800b(w(str, str2)).l(interfaceC5586c);
    }

    public C5801c w(String str, String str2) {
        return new C5801c(this.f178671a, str, str2);
    }

    /* JADX INFO: renamed from: com.prism.lib.downloader.a$a, reason: collision with other inner class name */
    public class C0692a implements InterfaceC5586c {
        @Override // sa.InterfaceC5586c
        public void a(DownloadError downloadError) {
        }

        @Override // sa.InterfaceC5586c
        public void b(C5800b c5800b) {
        }
    }
}
