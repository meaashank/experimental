package Kd;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.n0;
import kotlin.jvm.internal.G;
import kotlin.text.M;
import kotlin.text.U;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Bd.c
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58574b = 4000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Map<String, String> f58576d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f58573a = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArraySet<Logger> f58575c = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = OkHttpClient.class.getPackage();
        String name = r22 == null ? null : r22.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Hd.c.class.getName(), "okhttp.Http2");
        linkedHashMap.put(Ed.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f58576d = n0.D0(linkedHashMap);
    }

    public final void a(@NotNull String loggerName, int i10, @NotNull String message, @Nullable Throwable th) {
        int iMin;
        G.p(loggerName, "loggerName");
        G.p(message, "message");
        String strD = d(loggerName);
        if (Log.isLoggable(strD, i10)) {
            if (th != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(th));
            }
            String str = message;
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                int iK3 = M.K3(str, '\n', i11, false, 4, null);
                if (iK3 == -1) {
                    iK3 = length;
                }
                while (true) {
                    iMin = Math.min(iK3, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, strD, strSubstring);
                    if (iMin >= iK3) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f58576d.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f58575c.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f58577a);
        }
    }

    public final String d(String str) {
        String str2 = f58576d.get(str);
        return str2 == null ? U.D9(str, 23) : str2;
    }
}
