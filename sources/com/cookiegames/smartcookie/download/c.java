package com.cookiegames.smartcookie.download;

import B0.C0920d;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.appcompat.app.ActivityC1486c;
import androidx.compose.runtime.internal.r;
import com.android.launcher3.IconCache;
import com.cookiegames.smartcookie.MainActivity;
import com.cookiegames.smartcookie.dialog.LightningDialogBuilder;
import com.prism.gaia.download.DownloadProvider;
import com.prism.lib.downloader.common.DownloadError;
import com.prism.lib.pfs.PrivateFileSystem;
import hc.H;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p4.InterfaceC5390c;
import sa.InterfaceC5586c;
import xa.C5800b;
import xa.C5801c;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
@r(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f141202g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f141203h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f141204i = "DownloadHandler";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f141205j = "Cookie";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X3.k f141206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DownloadManager f141207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final H f141208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final H f141209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final H f141210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC5390c f141211f;

    public static final class a {
        public a() {
        }

        public final String a(String str) {
            char[] charArray = str.toCharArray();
            G.o(charArray, "toCharArray(...)");
            for (char c10 : charArray) {
                if (c10 == '[' || c10 == ']' || c10 == '|') {
                    StringBuilder sb2 = new StringBuilder();
                    for (char c11 : charArray) {
                        if (c11 == '[' || c11 == ']' || c11 == '|') {
                            sb2.append('%');
                            sb2.append(Integer.toHexString(c11));
                        } else {
                            sb2.append(c11);
                        }
                    }
                    String string = sb2.toString();
                    G.o(string, "toString(...)");
                    return string;
                }
            }
            return str;
        }

        @NotNull
        public final String b(@Nullable String str, @Nullable String str2, @Nullable String str3) throws UnsupportedEncodingException {
            if (str2 != null && M.p3(str2, "filename=", false, 2, null)) {
                String strDecode = URLDecoder.decode(com.cookiegames.smartcookie.download.a.f141199a.c(str2), StandardCharsets.ISO_8859_1.toString());
                G.m(strDecode);
                return strDecode;
            }
            G.m(str);
            String strSubstring = str.substring(M.Z3(str, '/', 0, false, 6, null) + 1);
            G.o(strSubstring, "substring(...)");
            String str4 = (String) M.r5((CharSequence) M.r5(strSubstring, new String[]{"\\?"}, false, 0, 6, null).get(0), new String[]{"#"}, false, 0, 6, null).get(0);
            if (str4 != null && M.p3(str4, IconCache.EMPTY_CLASS_NAME, false, 2, null)) {
                return str4;
            }
            String strGuessFileName = URLUtil.guessFileName(str, str2, str3);
            G.m(strGuessFileName);
            return strGuessFileName;
        }

        public final boolean c(Uri uri) {
            if (uri.getPath() == null) {
                return false;
            }
            File file = new File(uri.getPath());
            if (!file.isDirectory() && !file.mkdirs()) {
                return false;
            }
            try {
                if (file.createNewFile()) {
                    file.delete();
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public static final class b extends com.prism.lib.pfs.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ActivityC1486c f141212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f141213g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f141214h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f141215i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c f141216j;

        public static final class a implements InterfaceC5586c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f141217a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f141218b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ActivityC1486c f141219c;

            public a(c cVar, String str, ActivityC1486c activityC1486c) {
                this.f141217a = cVar;
                this.f141218b = str;
                this.f141219c = activityC1486c;
            }

            @Override // sa.InterfaceC5586c
            public void a(DownloadError downloadError) {
                Toast.makeText(this.f141219c, "Download Failed", 1).show();
                this.f141217a.f141211f.log("DownloadHandler", androidx.fragment.app.G.a("download[", this.f141218b, "] failed, ", downloadError != null ? downloadError.b() : null));
            }

            @Override // sa.InterfaceC5586c
            public void b(C5800b c5800b) {
                this.f141217a.f141211f.log("DownloadHandler", "download success: " + this.f141218b);
                Toast.makeText(this.f141219c, "Download Success", 1).show();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ActivityC1486c activityC1486c, String str, String str2, String str3, c cVar, PrivateFileSystem privateFileSystem) {
            super(privateFileSystem, activityC1486c);
            this.f141212f = activityC1486c;
            this.f141213g = str;
            this.f141214h = str2;
            this.f141215i = str3;
            this.f141216j = cVar;
        }

        @Override // o6.g
        public void a() {
        }

        @Override // o6.g
        public void onSuccess() {
            String strGuessFileName = URLUtil.guessFileName(this.f141213g, this.f141214h, this.f141215i);
            C5801c c5801cW = com.prism.lib.downloader.a.g().w(this.f141213g, strGuessFileName);
            c5801cW.f(c5801cW.f240575b);
            c5801cW.a().l(new a(this.f141216j, strGuessFileName, this.f141212f));
        }
    }

    /* JADX INFO: renamed from: com.cookiegames.smartcookie.download.c$c, reason: collision with other inner class name */
    public static final class C0478c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f141220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f141221b;

        public C0478c(long j10, c cVar) {
            this.f141220a = j10;
            this.f141221b = cVar;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"Range"})
        public void onReceive(Context context, Intent intent) {
            String string;
            G.p(context, "context");
            G.p(intent, "intent");
            if (intent.getLongExtra("extra_download_id", -1L) == this.f141220a) {
                context.unregisterReceiver(this);
                Cursor cursorQuery = this.f141221b.f141207b.query(new DownloadManager.Query().setFilterById(this.f141220a));
                if (cursorQuery.moveToFirst() && cursorQuery.getColumnIndex("status") >= 0 && cursorQuery.getColumnIndex(DownloadProvider.f164526u) >= 0 && cursorQuery.getInt(cursorQuery.getColumnIndex("status")) == 8 && (string = cursorQuery.getString(cursorQuery.getColumnIndex(DownloadProvider.f164526u))) != null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent2.setData(Uri.parse(string));
                    context.sendBroadcast(intent2);
                }
                cursorQuery.close();
            }
        }
    }

    @Inject
    public c(@NotNull X3.k downloadsRepository, @NotNull DownloadManager downloadManager, @NotNull H databaseScheduler, @NotNull H networkScheduler, @NotNull H mainScheduler, @NotNull InterfaceC5390c logger) {
        G.p(downloadsRepository, "downloadsRepository");
        G.p(downloadManager, "downloadManager");
        G.p(databaseScheduler, "databaseScheduler");
        G.p(networkScheduler, "networkScheduler");
        G.p(mainScheduler, "mainScheduler");
        G.p(logger, "logger");
        this.f141206a = downloadsRepository;
        this.f141207b = downloadManager;
        this.f141208c = databaseScheduler;
        this.f141209d = networkScheduler;
        this.f141210e = mainScheduler;
        this.f141211f = logger;
    }

    public final void c(@NotNull Activity activity, @NotNull u4.e manager, @NotNull String url, @NotNull String userAgent, @Nullable String str, @NotNull String mimeType, @NotNull String contentSize) {
        G.p(activity, "activity");
        G.p(manager, "manager");
        G.p(url, "url");
        G.p(userAgent, "userAgent");
        G.p(mimeType, "mimeType");
        G.p(contentSize, "contentSize");
        ActivityC1486c activityC1486c = (ActivityC1486c) activity;
        com.prism.lib.downloader.a.o().mount(activityC1486c, new b(activityC1486c, url, str, mimeType, this, com.prism.lib.downloader.a.f178669j));
    }

    public final void d(@NotNull Activity context, @NotNull u4.e manager, @NotNull String url, @NotNull String userAgent, @Nullable String str, @NotNull String mimeType, @NotNull String contentSize) {
        G.p(context, "context");
        G.p(manager, "manager");
        G.p(url, "url");
        G.p(userAgent, "userAgent");
        G.p(mimeType, "mimeType");
        G.p(contentSize, "contentSize");
        f(context, manager, url, userAgent, str, mimeType, contentSize);
    }

    public final void e(@NotNull Activity context, @NotNull u4.e manager, @NotNull String url, @NotNull String userAgent, @Nullable String str, @NotNull String mimeType, @NotNull String contentSize, @NotNull LightningDialogBuilder dialogBuilder) {
        G.p(context, "context");
        G.p(manager, "manager");
        G.p(url, "url");
        G.p(userAgent, "userAgent");
        G.p(mimeType, "mimeType");
        G.p(contentSize, "contentSize");
        G.p(dialogBuilder, "dialogBuilder");
        this.f141211f.log("DownloadHandler", "DOWNLOAD: Trying to download from URL: ".concat(url));
        this.f141211f.log("DownloadHandler", "DOWNLOAD: Content disposition: " + str);
        this.f141211f.log("DownloadHandler", "DOWNLOAD: MimeType: ".concat(mimeType));
        this.f141211f.log("DownloadHandler", "DOWNLOAD: User agent: ".concat(userAgent));
        if (str == null || !F.u2(str, 0, "attachment", 0, 10, true)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(url), mimeType);
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setComponent(null);
            intent.setSelector(null);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null && (G.g(com.cookiegames.smartcookie.k.f141365d, resolveInfoResolveActivity.activityInfo.packageName) || MainActivity.class.getName().equals(resolveInfoResolveActivity.activityInfo.name))) {
                try {
                    context.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                }
            }
        }
        dialogBuilder.M0(context, manager, url, userAgent, str, mimeType, contentSize);
    }

    public final void f(Activity activity, u4.e eVar, String str, String str2, String str3, String str4, String str5) {
        this.f141211f.log("DownloadHandler", "DOWNLOAD: Trying to download from URL: " + str);
        this.f141211f.log("DownloadHandler", "DOWNLOAD: Content disposition: " + str3);
        this.f141211f.log("DownloadHandler", "DOWNLOAD: MimeType: " + str4);
        this.f141211f.log("DownloadHandler", "DOWNLOAD: User agent: " + str2);
        if (eVar.c1()) {
            return;
        }
        String strGuessFileName = URLUtil.guessFileName(str, str3, str4);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, String.valueOf(strGuessFileName));
        request.setNotificationVisibility(1);
        request.setAllowedOverMetered(true);
        request.setAllowedOverRoaming(false);
        if (Build.VERSION.SDK_INT >= 24) {
            request.setRequiresCharging(false);
        }
        C0920d.registerReceiver(activity, new C0478c(this.f141207b.enqueue(request), this), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 4);
    }
}
