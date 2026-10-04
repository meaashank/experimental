package K6;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.prism.fusionadsdk.LjAdLoader;
import com.prism.fusionadsdk.internal.activity.WebViewInterstitialActivity;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class g extends J6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f58419h = "custom_fill_webview";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f58420i = com.prism.fusionadsdkbase.a.f162373j.concat(g.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f58422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f58423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f58424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f58425g;

    public g(String str, String str2, String str3, String str4, String str5) {
        this.f58421c = str;
        this.f58422d = str2;
        this.f58423e = str3;
        this.f58424f = str4;
        this.f58425g = str5;
    }

    @Override // J6.c
    public void c(Context context, ViewGroup viewGroup) {
        if (context == null || TextUtils.isEmpty(this.f58421c)) {
            return;
        }
        String string = UUID.randomUUID().toString();
        L6.b.b(string, this);
        Intent intent = new Intent(context, (Class<?>) WebViewInterstitialActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(WebViewInterstitialActivity.f162272o, string);
        context.startActivity(intent);
        q(context);
        StringBuilder sb2 = new StringBuilder("show custom fill sceneId=");
        sb2.append(this.f58423e);
        sb2.append(", variantId=");
        sb2.append(this.f58424f);
        sb2.append(", packageName=");
        sb2.append(this.f58425g);
    }

    public String f() {
        return this.f58422d;
    }

    public String g() {
        return this.f58421c;
    }

    public String h() {
        return this.f58425g;
    }

    public String i() {
        return this.f58423e;
    }

    public String j() {
        return this.f58424f;
    }

    public void k(Context context) {
        l(context, null);
    }

    public void l(Context context, String str) {
        LjAdLoader ljAdLoader = this.f53199b;
        if (ljAdLoader != null) {
            ljAdLoader.x(context, f58419h);
            this.f53199b.H(context, "CLICKED", this, str);
        }
    }

    public void m(Context context) {
        LjAdLoader ljAdLoader = this.f53199b;
        if (ljAdLoader != null) {
            ljAdLoader.y(f58419h);
            this.f53199b.G(context, "CLOSED", this);
        }
    }

    public void n(Context context) {
        LjAdLoader ljAdLoader = this.f53199b;
        if (ljAdLoader != null) {
            ljAdLoader.z(context, f58419h);
            this.f53199b.G(context, "IMPRESSION", this);
        }
    }

    public void o(Context context, String str, String str2) {
        LjAdLoader ljAdLoader = this.f53199b;
        if (ljAdLoader != null) {
            ljAdLoader.A(str);
            this.f53199b.H(context, "LEFT_APPLICATION", this, str2);
        }
    }

    public void p(Context context) {
        LjAdLoader ljAdLoader = this.f53199b;
        if (ljAdLoader != null) {
            ljAdLoader.B(context, f58419h);
            this.f53199b.G(context, "OPENED", this);
        }
    }

    public void q(Context context) {
        LjAdLoader ljAdLoader = this.f53199b;
        if (ljAdLoader != null) {
            ljAdLoader.G(context, "SHOW", this);
        }
    }

    public g(String str, String str2, String str3) {
        this(str, str2, str3, "");
    }

    public g(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, "");
    }
}
