package C4;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.cookiegames.smartcookie.p;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f17552b = Pattern.compile("(?i)((?:http|https|file)://|(?:inline|data|about|javascript):|(?:.*:.*@))(.*)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Activity f17553a;

    public f(@NonNull Activity activity) {
        this.f17553a = activity;
    }

    public final boolean a(@NonNull Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = this.f17553a.getPackageManager().queryIntentActivities(intent, 64);
        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                IntentFilter intentFilter = it.next().filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b(@Nullable String str, @Nullable String str2) {
        if (str == null || s.d(str)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        Activity activity = this.f17553a;
        activity.startActivity(Intent.createChooser(intent, activity.getString(p.s.f145539N3)));
    }

    public boolean c(@Nullable WebView webView, @NonNull String str) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            uri.setSelector(null);
            if (this.f17553a.getPackageManager().resolveActivity(uri, 0) == null) {
                String str2 = uri.getPackage();
                if (str2 == null) {
                    return false;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:".concat(str2)));
                intent.addCategory("android.intent.category.BROWSABLE");
                this.f17553a.startActivity(intent);
                return true;
            }
            if (webView != null) {
                uri.putExtra(R3.a.f67737o, webView.hashCode());
            }
            if (f17552b.matcher(str).matches() && !a(uri)) {
                return false;
            }
            try {
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return this.f17553a.startActivityIfNeeded(uri, -1);
        } catch (URISyntaxException e11) {
            StringBuilder sbA = androidx.activity.result.i.a("Bad URI ", str, ": ");
            sbA.append(e11.getMessage());
            Log.w("Browser", sbA.toString());
            return false;
        }
    }
}
