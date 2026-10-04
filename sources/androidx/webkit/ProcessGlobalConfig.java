package androidx.webkit;

import I2.H0;
import android.content.Context;
import android.support.v4.media.i;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.compose.animation.core.C1598m0;
import e.InterfaceC4326A;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ProcessGlobalConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f119993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f119994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f119995c;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f119991d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InterfaceC4326A("sLock")
    public static boolean f119992e = false;

    public static void a(@NonNull ProcessGlobalConfig processGlobalConfig) {
        synchronized (f119991d) {
            if (f119992e) {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
            f119992e = true;
        }
        HashMap map = new HashMap();
        if (d()) {
            throw new IllegalStateException("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
        }
        if (processGlobalConfig.f119993a != null) {
            if (H0.f50935M.e()) {
                WebView.setDataDirectorySuffix(processGlobalConfig.f119993a);
            } else {
                map.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, processGlobalConfig.f119993a);
            }
        }
        String str = processGlobalConfig.f119994b;
        if (str != null) {
            map.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str);
        }
        String str2 = processGlobalConfig.f119995c;
        if (str2 != null) {
            map.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str2);
        }
        if (!C1598m0.a(sProcessGlobalConfig, null, map)) {
            throw new RuntimeException("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
        }
    }

    public static boolean d() {
        Field declaredField;
        try {
            declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        return declaredField.get(null) != null;
    }

    @NonNull
    public ProcessGlobalConfig b(@NonNull Context context, @NonNull String str) {
        if (!H0.f50935M.d(context)) {
            throw H0.a();
        }
        if (str.equals("")) {
            throw new IllegalArgumentException("Suffix cannot be an empty string");
        }
        if (str.indexOf(File.separatorChar) >= 0) {
            throw new IllegalArgumentException(i.a("Suffix ", str, " contains a path separator"));
        }
        this.f119993a = str;
        return this;
    }

    @NonNull
    public ProcessGlobalConfig c(@NonNull Context context, @NonNull File file, @NonNull File file2) {
        if (!H0.f50936N.d(context)) {
            throw H0.a();
        }
        if (!file.isAbsolute()) {
            throw new IllegalArgumentException("dataDirectoryBasePath must be a non-empty absolute path");
        }
        if (!file2.isAbsolute()) {
            throw new IllegalArgumentException("cacheDirectoryBasePath must be a non-empty absolute path");
        }
        this.f119994b = file.getAbsolutePath();
        this.f119995c = file2.getAbsolutePath();
        return this;
    }
}
