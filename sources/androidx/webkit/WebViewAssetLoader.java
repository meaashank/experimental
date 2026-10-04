package androidx.webkit;

import I2.C1173e0;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.p;
import com.google.firebase.sessions.settings.RemoteSettings;
import e.f0;
import e.g0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewAssetLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f120033b = "WebViewAssetLoader";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f120034c = "appassets.androidplatform.net";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f120035a;

    public static final class Builder {
        private String mDomain = WebViewAssetLoader.f120034c;

        @NonNull
        private final List<p<String, c>> mHandlerList = new ArrayList();
        private boolean mHttpAllowed;

        @NonNull
        public Builder addPathHandler(@NonNull String str, @NonNull c cVar) {
            this.mHandlerList.add(new p<>(str, cVar));
            return this;
        }

        @NonNull
        public WebViewAssetLoader build() {
            ArrayList arrayList = new ArrayList();
            for (p<String, c> pVar : this.mHandlerList) {
                arrayList.add(new d(this.mDomain, pVar.f111414a, this.mHttpAllowed, pVar.f111415b));
            }
            return new WebViewAssetLoader(arrayList);
        }

        @NonNull
        public Builder setDomain(@NonNull String str) {
            this.mDomain = str;
            return this;
        }

        @NonNull
        public Builder setHttpAllowed(boolean z10) {
            this.mHttpAllowed = z10;
            return this;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f120037b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final File f120038a;

        public b(@NonNull Context context, @NonNull File file) {
            try {
                this.f120038a = new File(C1173e0.a(file));
                if (a(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        public final boolean a(@NonNull Context context) throws IOException {
            String strA = C1173e0.a(this.f120038a);
            String strA2 = C1173e0.a(context.getCacheDir());
            String strA3 = C1173e0.a(C1173e0.c(context));
            if ((!strA.startsWith(strA2) && !strA.startsWith(strA3)) || strA.equals(strA2) || strA.equals(strA3)) {
                return false;
            }
            for (String str : f120037b) {
                if (strA.startsWith(strA3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.webkit.WebViewAssetLoader.c
        @NonNull
        @g0
        public WebResourceResponse handle(@NonNull String str) {
            File fileB;
            try {
                fileB = C1173e0.b(this.f120038a, str);
            } catch (IOException e10) {
                Log.e(WebViewAssetLoader.f120033b, "Error opening the requested path: " + str, e10);
            }
            if (fileB != null) {
                return new WebResourceResponse(C1173e0.f(str), null, C1173e0.i(fileB));
            }
            Log.e(WebViewAssetLoader.f120033b, String.format("The requested file: %s is outside the mounted directory: %s", str, this.f120038a));
            return new WebResourceResponse(null, null, null);
        }
    }

    public interface c {
        @Nullable
        @g0
        WebResourceResponse handle(@NonNull String str);
    }

    @f0
    public static class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f120039e = "http";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f120040f = "https";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f120041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final String f120042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final String f120043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final c f120044d;

        public d(@NonNull String str, @NonNull String str2, boolean z10, @NonNull c cVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f120042b = str;
            this.f120043c = str2;
            this.f120041a = z10;
            this.f120044d = cVar;
        }

        @NonNull
        @g0
        public String a(@NonNull String str) {
            return str.replaceFirst(this.f120043c, "");
        }

        @Nullable
        @g0
        public c b(@NonNull Uri uri) {
            if (uri.getScheme().equals("http") && !this.f120041a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f120042b) && uri.getPath().startsWith(this.f120043c)) {
                return this.f120044d;
            }
            return null;
        }
    }

    public WebViewAssetLoader(@NonNull List<d> list) {
        this.f120035a = list;
    }

    @Nullable
    @g0
    public WebResourceResponse a(@NonNull Uri uri) {
        for (d dVar : this.f120035a) {
            c cVarB = dVar.b(uri);
            if (cVarB != null) {
                return cVarB.handle(dVar.a(uri.getPath()));
            }
        }
        return null;
    }

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1173e0 f120036a;

        public a(@NonNull Context context) {
            this.f120036a = new C1173e0(context);
        }

        @Override // androidx.webkit.WebViewAssetLoader.c
        @Nullable
        @g0
        public WebResourceResponse handle(@NonNull String str) {
            try {
                return new WebResourceResponse(C1173e0.f(str), null, this.f120036a.h(str));
            } catch (IOException e10) {
                Log.e(WebViewAssetLoader.f120033b, "Error opening asset path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            }
        }

        @f0
        public a(@NonNull C1173e0 c1173e0) {
            this.f120036a = c1173e0;
        }
    }

    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1173e0 f120045a;

        public e(@NonNull Context context) {
            this.f120045a = new C1173e0(context);
        }

        @Override // androidx.webkit.WebViewAssetLoader.c
        @Nullable
        @g0
        public WebResourceResponse handle(@NonNull String str) {
            try {
                return new WebResourceResponse(C1173e0.f(str), null, this.f120045a.j(str));
            } catch (Resources.NotFoundException e10) {
                Log.e(WebViewAssetLoader.f120033b, "Resource not found from the path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e11) {
                Log.e(WebViewAssetLoader.f120033b, "Error opening resource from the path: " + str, e11);
                return new WebResourceResponse(null, null, null);
            }
        }

        @f0
        public e(@NonNull C1173e0 c1173e0) {
            this.f120045a = c1173e0;
        }
    }
}
