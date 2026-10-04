package xa;

import android.webkit.URLUtil;
import androidx.annotation.Nullable;
import com.prism.commons.async.Priority;
import com.prism.lib.downloader.DownloaderConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import wa.InterfaceC5771b;

/* JADX INFO: renamed from: xa.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5801c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f240574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f240575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f240576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f240577d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Priority f240578e = Priority.MEDIUM;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f240579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f240580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f240581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f240582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC5771b f240583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashMap<String, List<String>> f240584k;

    public C5801c(DownloaderConfig downloaderConfig, String str, @Nullable String str2) {
        str2 = str2 == null ? URLUtil.guessFileName(str, "attachment", null) : str2;
        this.f240574a = str;
        this.f240575b = str2;
        this.f240580g = downloaderConfig.d();
        this.f240581h = downloaderConfig.a();
        this.f240582i = downloaderConfig.e();
        this.f240583j = downloaderConfig.c();
    }

    public C5800b a() {
        return new C5800b(this);
    }

    public C5801c b(int i10) {
        this.f240581h = i10;
        return this;
    }

    public C5801c c(String str, String str2) {
        if (this.f240584k == null) {
            this.f240584k = new HashMap<>();
        }
        List<String> arrayList = this.f240584k.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f240584k.put(str, arrayList);
        }
        if (!arrayList.contains(str2)) {
            arrayList.add(str2);
        }
        return this;
    }

    public C5801c d(Priority priority) {
        this.f240578e = priority;
        return this;
    }

    public C5801c e() {
        return f(this.f240575b);
    }

    public C5801c f(String str) {
        while (str.startsWith(File.separator)) {
            str = str.substring(1);
        }
        this.f240576c = str;
        return this;
    }

    public C5801c g(int i10) {
        this.f240580g = i10;
        return this;
    }

    public C5801c h(boolean z10) {
        this.f240577d = z10;
        return this;
    }

    public C5801c i(Object obj) {
        this.f240579f = obj;
        return this;
    }

    public C5801c j(String str) {
        this.f240582i = str;
        return this;
    }
}
