package M6;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import androidx.activity.result.i;
import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
import com.google.gson.Gson;
import com.prism.fusionadsdk.internal.config.AdConfigManager;
import com.prism.fusionadsdk.internal.config.AdCustomFillListItemConfig;
import com.prism.fusionadsdk.internal.config.AdCustomFillSceneConfig;
import com.prism.fusionadsdk.internal.config.AdCustomFillVariantConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58834a = "765-AdCustomFillPreload";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f58835b = "fusionadsdk/custom_fill";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f58836c = "index.json";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f58837d = 8000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58838e = 12000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f58839f = 8388608;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f58840g = 31457280;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f58841h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f58842i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f58843j = Pattern.compile("(?i)\\b(?:src|href|poster)\\s*=\\s*(['\"])(.*?)\\1");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f58844k = Pattern.compile("(?i)url\\(\\s*(['\"]?)(.*?)\\1\\s*\\)");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Gson f58845l = new Gson();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f58846m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ExecutorService f58847n = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final HashMap<String, d> f58848o = new HashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set<String> f58849p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Set<String> f58850q = new HashSet();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile boolean f58851r;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f58852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f58853b;

        public a(Context context, String str) {
            this.f58852a = context;
            this.f58853b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.o(this.f58852a, this.f58853b);
                synchronized (b.f58846m) {
                    b.f58849p.remove(this.f58853b);
                }
            } catch (Throwable th) {
                synchronized (b.f58846m) {
                    b.f58849p.remove(this.f58853b);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: M6.b$b, reason: collision with other inner class name */
    public class RunnableC0076b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f58854a;

        public RunnableC0076b(Context context) {
            this.f58854a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.R(this.f58854a);
        }
    }

    public class c implements Comparator<d> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            long j10 = dVar == null ? 0L : dVar.f58863i;
            long j11 = dVar2 != null ? dVar2.f58863i : 0L;
            if (j10 < j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f58855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f58856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f58857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f58858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f58859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f58860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f58861g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f58862h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f58863i;

        public d() {
        }

        public d(a aVar) {
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f58864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f58865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashMap<String, d> f58866c;

        public e() {
        }

        public e(a aVar) {
        }
    }

    public static boolean A(String str, String str2) {
        return F(str) || D(str) || "text/css".equalsIgnoreCase(str) || G(str) || z(str) || K(str) || C(str) || "application/json".equalsIgnoreCase(str) || "application/wasm".equalsIgnoreCase(str) || H(str2) || M(str2) || L(str2);
    }

    public static boolean B(String str) {
        return "text/css".equalsIgnoreCase(str);
    }

    public static boolean C(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("font/") || "application/font-woff".equalsIgnoreCase(str) || "application/vnd.ms-fontobject".equalsIgnoreCase(str);
    }

    public static boolean D(String str) {
        return "text/html".equalsIgnoreCase(str) || "application/xhtml+xml".equalsIgnoreCase(str);
    }

    public static boolean E(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    public static boolean F(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("image/");
    }

    public static boolean G(String str) {
        return "application/javascript".equalsIgnoreCase(str) || "text/javascript".equalsIgnoreCase(str) || "application/x-javascript".equalsIgnoreCase(str) || "application/ecmascript".equalsIgnoreCase(str) || "text/ecmascript".equalsIgnoreCase(str);
    }

    public static boolean H(String str) {
        boolean zContains;
        synchronized (f58846m) {
            zContains = f58850q.contains(str);
        }
        return zContains;
    }

    public static boolean I(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        String lowerCase = path.toLowerCase();
        return lowerCase.endsWith("/favicon.ico") || lowerCase.endsWith("/apple-touch-icon.png") || lowerCase.endsWith("/apple-touch-icon-precomposed.png");
    }

    public static boolean J(d dVar) {
        if (dVar != null && !TextUtils.isEmpty(dVar.f58856b)) {
            File file = new File(dVar.f58856b);
            if (file.exists() && file.isFile() && file.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean K(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("video/");
    }

    public static boolean L(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        String lowerCase = path.toLowerCase();
        return lowerCase.endsWith(".css") || lowerCase.endsWith(".js") || lowerCase.endsWith(".mjs") || lowerCase.endsWith(".json") || lowerCase.endsWith(".wasm") || lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION) || lowerCase.endsWith(".m4a") || lowerCase.endsWith(".ogg") || lowerCase.endsWith(".wav") || lowerCase.endsWith(".mp4") || lowerCase.endsWith(".webm") || lowerCase.endsWith(".woff") || lowerCase.endsWith(".woff2") || lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf");
    }

    public static boolean M(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        String lowerCase = path.toLowerCase();
        return lowerCase.endsWith(com.prism.gaia.download.a.f164603n) || lowerCase.endsWith(".htm");
    }

    public static void N(String str) {
        synchronized (f58846m) {
            f58850q.add(str);
        }
    }

    public static String O(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        return str.trim().toLowerCase();
    }

    public static WebResourceResponse P(Context context, String str) {
        Context contextS;
        if (!E(str) || (contextS = s(context)) == null) {
            return null;
        }
        q(contextS);
        synchronized (f58846m) {
            d dVar = f58848o.get(str);
            if (dVar != null && !TextUtils.isEmpty(dVar.f58856b)) {
                dVar.f58863i = System.currentTimeMillis();
                File file = new File(dVar.f58856b);
                if (!file.exists() || !file.isFile() || file.length() <= 0) {
                    e0(contextS, str);
                    return null;
                }
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    String strX = TextUtils.isEmpty(dVar.f58857c) ? x(str) : dVar.f58857c;
                    StringBuilder sb2 = new StringBuilder("custom fill cache hit, url=");
                    sb2.append(str);
                    sb2.append(", file=");
                    sb2.append(file.getName());
                    S(contextS);
                    return new WebResourceResponse(strX, p(strX), bufferedInputStream);
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    public static HttpURLConnection Q(String str, int i10) throws Exception {
        if (i10 > 3) {
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(f58838e);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", "FusionAdSdkCustomFill/1.0");
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
            return httpURLConnection;
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        if (TextUtils.isEmpty(headerField)) {
            return null;
        }
        return Q(new URL(new URL(str), headerField).toString(), i10 + 1);
    }

    public static void R(Context context) {
        File fileW = w(context);
        if (fileW == null) {
            return;
        }
        e eVar = new e();
        eVar.f58864a = 1;
        eVar.f58865b = System.currentTimeMillis();
        synchronized (f58846m) {
            eVar.f58866c = new HashMap<>(f58848o);
        }
        FileOutputStream fileOutputStream = null;
        try {
            File parentFile = fileW.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                return;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileW);
            try {
                fileOutputStream2.write(f58845l.toJson(eVar).getBytes("UTF-8"));
                fileOutputStream2.flush();
                j(fileOutputStream2);
                return;
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
            }
        } catch (Throwable unused2) {
        }
        j(fileOutputStream);
    }

    public static void S(Context context) {
        f58847n.execute(new RunnableC0076b(context));
    }

    public static void T(Context context) {
        V(context, AdConfigManager.instance().getCustomFillScenes(), "init");
    }

    public static void U(Context context, Iterable<String> iterable, Iterable<String> iterable2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (iterable != null) {
            Iterator<String> it = iterable.iterator();
            while (it.hasNext()) {
                f(linkedHashSet, it.next());
            }
        }
        if (iterable2 != null) {
            Iterator<String> it2 = iterable2.iterator();
            while (it2.hasNext()) {
                g(linkedHashSet, it2.next());
            }
        }
        X(context, linkedHashSet);
    }

    public static void V(Context context, AdCustomFillSceneConfig[] adCustomFillSceneConfigArr, String str) {
        Context contextS = s(context);
        if (contextS == null) {
            return;
        }
        q(contextS);
        int iH0 = h0(contextS, k(adCustomFillSceneConfigArr));
        if (iH0 > 0) {
            StringBuilder sb2 = new StringBuilder("custom fill config preload scheduled, count=");
            sb2.append(iH0);
            sb2.append(", reason=");
            sb2.append(str);
        }
    }

    public static void W(Context context, String str) {
        if (E(str)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            g(linkedHashSet, str);
            X(context, linkedHashSet);
        }
    }

    public static void X(Context context, LinkedHashSet<String> linkedHashSet) {
        Context contextS = s(context);
        if (contextS == null || linkedHashSet == null || linkedHashSet.isEmpty()) {
            return;
        }
        q(contextS);
        int iH0 = h0(contextS, linkedHashSet);
        if (iH0 > 0) {
            new StringBuilder("custom fill preload scheduled, count=").append(iH0);
        }
    }

    public static void Y(Context context, AdCustomFillSceneConfig adCustomFillSceneConfig) {
        if (adCustomFillSceneConfig == null) {
            return;
        }
        Z(context, new AdCustomFillSceneConfig[]{adCustomFillSceneConfig});
    }

    public static void Z(Context context, AdCustomFillSceneConfig[] adCustomFillSceneConfigArr) {
        if (adCustomFillSceneConfigArr == null || adCustomFillSceneConfigArr.length == 0) {
            return;
        }
        X(context, k(adCustomFillSceneConfigArr));
    }

    public static void a0(Context context, String str) {
        if (E(str)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            f(linkedHashSet, str);
            X(context, linkedHashSet);
        }
    }

    public static void b0(Context context, Iterable<String> iterable) {
        if (iterable == null) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            f(linkedHashSet, it.next());
        }
        X(context, linkedHashSet);
    }

    public static void c0(Context context, AdCustomFillVariantConfig adCustomFillVariantConfig) {
        if (adCustomFillVariantConfig == null) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(linkedHashSet, adCustomFillVariantConfig);
        X(context, linkedHashSet);
    }

    public static String d0(File file) {
        if (file == null || !file.exists() || !file.isFile() || file.length() <= 0 || file.length() > f58839f) {
            return "";
        }
        InputStreamReader inputStreamReader = null;
        try {
            InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(file), "UTF-8");
            try {
                StringBuilder sb2 = new StringBuilder((int) Math.min(file.length(), 1048576L));
                char[] cArr = new char[4096];
                while (true) {
                    int i10 = inputStreamReader2.read(cArr);
                    if (i10 == -1) {
                        String string = sb2.toString();
                        j(inputStreamReader2);
                        return string;
                    }
                    sb2.append(cArr, 0, i10);
                }
            } catch (Throwable unused) {
                inputStreamReader = inputStreamReader2;
                try {
                    file.getName();
                    return "";
                } finally {
                    j(inputStreamReader);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public static void e(LinkedHashSet<String> linkedHashSet, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strTrim = str2.trim();
        if (TextUtils.isEmpty(strTrim) || strTrim.startsWith("#") || strTrim.startsWith(zd.b.f241358c) || strTrim.startsWith("blob:") || strTrim.startsWith("javascript:") || strTrim.startsWith(P0.c.f65534b) || strTrim.startsWith("tel:")) {
            return;
        }
        try {
            String string = new URL(new URL(str), strTrim).toString();
            if (E(string) && !I(string)) {
                if (M(string)) {
                    N(string);
                }
                linkedHashSet.add(string);
            }
        } catch (Throwable unused) {
        }
    }

    public static void e0(Context context, String str) {
        synchronized (f58846m) {
            f58848o.remove(str);
        }
        S(context);
    }

    public static void f(LinkedHashSet<String> linkedHashSet, String str) {
        if (E(str)) {
            if (M(str)) {
                N(str);
            }
            linkedHashSet.add(str);
        }
    }

    public static void f0(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        new StringBuilder("delete custom fill cache file failed, file=").append(file.getAbsolutePath());
    }

    public static void g(LinkedHashSet<String> linkedHashSet, String str) {
        if (E(str)) {
            N(str);
            linkedHashSet.add(str);
        }
    }

    public static boolean g0(Context context, String str) {
        synchronized (f58846m) {
            try {
                if (J(f58848o.get(str))) {
                    return false;
                }
                Set<String> set = f58849p;
                if (set.contains(str)) {
                    return false;
                }
                set.add(str);
                f58847n.execute(new a(context, str));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h(LinkedHashSet<String> linkedHashSet, String str) {
        if (!E(str) || M(str)) {
            return;
        }
        linkedHashSet.add(str);
    }

    public static int h0(Context context, LinkedHashSet<String> linkedHashSet) {
        int i10 = 0;
        for (String str : linkedHashSet) {
            if (E(str) && g0(context, str)) {
                i10++;
            }
        }
        return i10;
    }

    public static String i(String str, String str2) {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a((D(str2) || M(str)) ? "html_" : F(str2) ? "img_" : "res_");
        sbA.append(j0(str));
        sbA.append(r(str, str2));
        return sbA.toString();
    }

    public static void i0(Context context, String str, File file, String str2) {
        if (D(str2) || "text/css".equalsIgnoreCase(str2)) {
            String strD0 = d0(file);
            if (TextUtils.isEmpty(strD0)) {
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (D(str2)) {
                l(linkedHashSet, str, strD0, f58843j);
            }
            l(linkedHashSet, str, strD0, f58844k);
            if (linkedHashSet.isEmpty()) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (g0(context, (String) it.next())) {
                    i10++;
                }
            }
            if (i10 > 0) {
                StringBuilder sb2 = new StringBuilder("custom fill linked resource preload scheduled, count=");
                sb2.append(i10);
                sb2.append(", baseUrl=");
                sb2.append(str);
            }
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof InputStream) {
                ((InputStream) obj).close();
            } else if (obj instanceof OutputStream) {
                ((OutputStream) obj).close();
            } else if (obj instanceof InputStreamReader) {
                ((InputStreamReader) obj).close();
            }
        } catch (Throwable unused) {
        }
    }

    public static String j0(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return String.valueOf(Math.abs(str.hashCode()));
        }
    }

    public static LinkedHashSet<String> k(AdCustomFillSceneConfig[] adCustomFillSceneConfigArr) {
        AdCustomFillVariantConfig[] adCustomFillVariantConfigArr;
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        if (adCustomFillSceneConfigArr != null && adCustomFillSceneConfigArr.length != 0) {
            for (AdCustomFillSceneConfig adCustomFillSceneConfig : adCustomFillSceneConfigArr) {
                if (adCustomFillSceneConfig != null && (adCustomFillVariantConfigArr = adCustomFillSceneConfig.variants) != null) {
                    for (AdCustomFillVariantConfig adCustomFillVariantConfig : adCustomFillVariantConfigArr) {
                        m(linkedHashSet, adCustomFillVariantConfig);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static boolean k0(d dVar) {
        return J(dVar);
    }

    public static void l(LinkedHashSet<String> linkedHashSet, String str, String str2, Pattern pattern) {
        Matcher matcher = pattern.matcher(str2);
        while (matcher.find() && linkedHashSet.size() < 64) {
            e(linkedHashSet, str, matcher.group(2));
        }
    }

    public static void l0(Context context) {
        ArrayList arrayList;
        synchronized (f58846m) {
            arrayList = new ArrayList(f58848o.values());
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        long jMax = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d dVar = (d) obj;
            if (dVar != null) {
                jMax += Math.max(0L, dVar.f58860f);
            }
        }
        if (jMax <= f58840g) {
            return;
        }
        Collections.sort(arrayList, new c());
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            d dVar2 = (d) obj2;
            if (dVar2 == null || jMax <= f58840g) {
                return;
            }
            File file = TextUtils.isEmpty(dVar2.f58856b) ? null : new File(dVar2.f58856b);
            if (file != null && file.exists()) {
                f0(file);
            }
            synchronized (f58846m) {
                f58848o.remove(dVar2.f58855a);
            }
            jMax -= Math.max(0L, dVar2.f58860f);
        }
    }

    public static void m(LinkedHashSet<String> linkedHashSet, AdCustomFillVariantConfig adCustomFillVariantConfig) {
        if (adCustomFillVariantConfig == null) {
            return;
        }
        f(linkedHashSet, adCustomFillVariantConfig.heroImageUrl);
        g(linkedHashSet, adCustomFillVariantConfig.heroHtmlUrl);
        h(linkedHashSet, adCustomFillVariantConfig.iconUrl);
        AdCustomFillListItemConfig[] adCustomFillListItemConfigArr = adCustomFillVariantConfig.listItems;
        if (adCustomFillListItemConfigArr == null) {
            return;
        }
        for (AdCustomFillListItemConfig adCustomFillListItemConfig : adCustomFillListItemConfigArr) {
            if (adCustomFillListItemConfig != null) {
                f(linkedHashSet, adCustomFillListItemConfig.heroImageUrl);
                g(linkedHashSet, adCustomFillListItemConfig.heroHtmlUrl);
                h(linkedHashSet, adCustomFillListItemConfig.iconUrl);
            }
        }
    }

    public static void m0(d dVar, HttpURLConnection httpURLConnection) {
        if (dVar == null || httpURLConnection == null) {
            return;
        }
        String strY = y(httpURLConnection, "ETag");
        if (!TextUtils.isEmpty(strY)) {
            dVar.f58858d = strY;
        }
        String strY2 = y(httpURLConnection, "Last-Modified");
        if (TextUtils.isEmpty(strY2)) {
            return;
        }
        dVar.f58859e = strY2;
    }

    public static long n(InputStream inputStream, File file) throws Exception {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
            try {
                byte[] bArr = new byte[8192];
                long j10 = 0;
                while (true) {
                    int i10 = bufferedInputStream2.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    j10 += (long) i10;
                    if (j10 > f58839f) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, i10);
                }
                bufferedOutputStream.flush();
                j(bufferedInputStream2);
                j(bufferedOutputStream);
                return j10;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                j(bufferedInputStream);
                j(bufferedOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean o(android.content.Context r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M6.b.o(android.content.Context, java.lang.String):boolean");
    }

    public static String p(String str) {
        if (D(str) || "text/css".equalsIgnoreCase(str) || G(str) || "application/json".equalsIgnoreCase(str)) {
            return "UTF-8";
        }
        return null;
    }

    public static void q(Context context) {
        if (f58851r) {
            return;
        }
        synchronized (f58846m) {
            try {
                if (f58851r) {
                    return;
                }
                File fileW = w(context);
                if (fileW != null && fileW.exists()) {
                    InputStreamReader inputStreamReader = null;
                    try {
                        InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(fileW), "UTF-8");
                        try {
                            e eVar = (e) f58845l.fromJson((Reader) inputStreamReader2, e.class);
                            if (eVar != null && eVar.f58866c != null) {
                                f58848o.clear();
                                for (Map.Entry<String, d> entry : eVar.f58866c.entrySet()) {
                                    if (J(entry.getValue())) {
                                        f58848o.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            }
                            j(inputStreamReader2);
                        } catch (Throwable unused) {
                            inputStreamReader = inputStreamReader2;
                            j(inputStreamReader);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                f58851r = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String r(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String path = Uri.parse(str).getPath();
        String str6 = ".woff";
        String str7 = ".woff2";
        if (TextUtils.isEmpty(path)) {
            str3 = ".jpg";
            str4 = com.prism.gaia.download.a.f164603n;
            str5 = ".webm";
        } else {
            String lowerCase = path.toLowerCase();
            boolean zEndsWith = lowerCase.endsWith(com.prism.gaia.download.a.f164603n);
            str4 = com.prism.gaia.download.a.f164603n;
            if (zEndsWith || lowerCase.endsWith(".htm")) {
                return str4;
            }
            if (lowerCase.endsWith(u.e.f239314f)) {
                return u.e.f239314f;
            }
            if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg")) {
                return ".jpg";
            }
            if (lowerCase.endsWith(".webp")) {
                return ".webp";
            }
            if (lowerCase.endsWith(".gif")) {
                return ".gif";
            }
            if (lowerCase.endsWith(".svg")) {
                return ".svg";
            }
            if (lowerCase.endsWith(".css")) {
                return ".css";
            }
            if (lowerCase.endsWith(".js") || lowerCase.endsWith(".mjs")) {
                return ".js";
            }
            if (lowerCase.endsWith(".json")) {
                return ".json";
            }
            if (lowerCase.endsWith(".wasm")) {
                return ".wasm";
            }
            if (lowerCase.endsWith(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION)) {
                return DefaultHlsExtractorFactory.MP3_FILE_EXTENSION;
            }
            if (lowerCase.endsWith(".m4a")) {
                return ".m4a";
            }
            if (lowerCase.endsWith(".ogg")) {
                return ".ogg";
            }
            if (lowerCase.endsWith(".wav")) {
                return ".wav";
            }
            if (lowerCase.endsWith(".mp4")) {
                return ".mp4";
            }
            str5 = ".webm";
            if (lowerCase.endsWith(str5)) {
                return str5;
            }
            str3 = ".jpg";
            if (lowerCase.endsWith(str7)) {
                return str7;
            }
            str7 = str7;
            if (lowerCase.endsWith(str6)) {
                return str6;
            }
            str6 = str6;
            if (lowerCase.endsWith(".ttf")) {
                return ".ttf";
            }
            if (lowerCase.endsWith(".otf")) {
                return ".otf";
            }
        }
        return D(str2) ? str4 : "text/css".equalsIgnoreCase(str2) ? ".css" : G(str2) ? ".js" : "application/json".equalsIgnoreCase(str2) ? ".json" : "application/wasm".equalsIgnoreCase(str2) ? ".wasm" : "image/png".equalsIgnoreCase(str2) ? u.e.f239314f : "image/webp".equalsIgnoreCase(str2) ? ".webp" : "image/gif".equalsIgnoreCase(str2) ? ".gif" : "image/svg+xml".equalsIgnoreCase(str2) ? ".svg" : "audio/mpeg".equalsIgnoreCase(str2) ? DefaultHlsExtractorFactory.MP3_FILE_EXTENSION : "audio/mp4".equalsIgnoreCase(str2) ? ".m4a" : "audio/ogg".equalsIgnoreCase(str2) ? ".ogg" : "audio/wav".equalsIgnoreCase(str2) ? ".wav" : "video/mp4".equalsIgnoreCase(str2) ? ".mp4" : "video/webm".equalsIgnoreCase(str2) ? str5 : "font/woff2".equalsIgnoreCase(str2) ? str7 : ("font/woff".equalsIgnoreCase(str2) || "application/font-woff".equalsIgnoreCase(str2)) ? str6 : str3;
    }

    public static Context s(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public static File t(Context context) {
        Context contextS = s(context);
        if (contextS == null || contextS.getCacheDir() == null) {
            return null;
        }
        return new File(contextS.getCacheDir(), f58835b);
    }

    public static File u(Context context, String str) {
        Context contextS;
        if (!E(str) || (contextS = s(context)) == null) {
            return null;
        }
        q(contextS);
        synchronized (f58846m) {
            d dVar = f58848o.get(str);
            if (dVar != null && !TextUtils.isEmpty(dVar.f58856b)) {
                dVar.f58863i = System.currentTimeMillis();
                File file = new File(dVar.f58856b);
                if (!file.exists() || !file.isFile() || file.length() <= 0) {
                    e0(contextS, str);
                    return null;
                }
                i.a("custom fill cache file hit, url=", str, ", file=").append(file.getName());
                S(contextS);
                return file;
            }
            return null;
        }
    }

    public static long v(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return -1L;
        }
        try {
            String strY = y(httpURLConnection, "Content-Length");
            if (!TextUtils.isEmpty(strY)) {
                return Long.parseLong(strY);
            }
        } catch (Throwable unused) {
        }
        try {
            int contentLength = httpURLConnection.getContentLength();
            if (contentLength > 0) {
                return contentLength;
            }
            return -1L;
        } catch (Throwable unused2) {
            return -1L;
        }
    }

    public static File w(Context context) {
        File fileT = t(context);
        if (fileT == null) {
            return null;
        }
        return new File(fileT, f58836c);
    }

    public static String x(String str) {
        String lowerCase = str == null ? "" : str.toLowerCase();
        return (lowerCase.contains(com.prism.gaia.download.a.f164603n) || lowerCase.contains(".htm")) ? "text/html" : lowerCase.contains(u.e.f239314f) ? "image/png" : lowerCase.contains(".webp") ? "image/webp" : lowerCase.contains(".gif") ? "image/gif" : lowerCase.contains(".svg") ? "image/svg+xml" : lowerCase.contains(".css") ? "text/css" : (lowerCase.contains(".js") || lowerCase.contains(".mjs")) ? "application/javascript" : lowerCase.contains(".json") ? "application/json" : lowerCase.contains(".wasm") ? "application/wasm" : lowerCase.contains(DefaultHlsExtractorFactory.MP3_FILE_EXTENSION) ? "audio/mpeg" : lowerCase.contains(".m4a") ? "audio/mp4" : lowerCase.contains(".ogg") ? "audio/ogg" : lowerCase.contains(".wav") ? "audio/wav" : lowerCase.contains(".mp4") ? "video/mp4" : lowerCase.contains(".webm") ? "video/webm" : lowerCase.contains(".woff2") ? "font/woff2" : lowerCase.contains(".woff") ? "font/woff" : lowerCase.contains(".ttf") ? "font/ttf" : lowerCase.contains(".otf") ? "font/otf" : "image/jpeg";
    }

    public static String y(HttpURLConnection httpURLConnection, String str) {
        try {
            String headerField = httpURLConnection.getHeaderField(str);
            return headerField == null ? "" : headerField.trim();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean z(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("audio/");
    }
}
