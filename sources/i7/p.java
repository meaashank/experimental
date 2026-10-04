package i7;

import U6.b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.prism.commons.utils.C3841e;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f202900a = "asdf-".concat(p.class.getSimpleName());

    public static void a(Intent intent, Bundle bundle, ClassLoader classLoader) {
        if (intent == null || bundle == null) {
            return;
        }
        try {
            Intent intent2 = (Intent) bundle.getParcelable(b.c.f68604F);
            int i10 = bundle.getInt(b.c.f68605G, 0);
            if (intent2 == null) {
                return;
            }
            bundle.remove(b.c.f68604F);
            bundle.remove(b.c.f68605G);
            if (classLoader != null) {
                try {
                    intent2.setExtrasClassLoader(classLoader);
                    intent.setExtrasClassLoader(classLoader);
                } catch (Throwable th) {
                    th.getMessage();
                    return;
                }
            }
            Intent intent3 = (Intent) intent2.getParcelableExtra(b.c.f68603E);
            if (intent3 != null) {
                if (classLoader != null) {
                    intent3.setExtrasClassLoader(classLoader);
                }
                intent2 = intent3;
            }
            intent.fillIn(intent2, i10);
        } catch (Throwable unused) {
        }
    }

    public static Intent b(Intent intent, Bundle bundle) {
        boolean z10;
        Intent intent2 = new Intent();
        Uri data = intent.getData();
        String type = intent.getType();
        boolean z11 = true;
        if (data == null && type == null) {
            z10 = false;
        } else {
            intent2.setDataAndType(data, type);
            z10 = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null && !categories.isEmpty()) {
            Iterator<String> it = categories.iterator();
            while (it.hasNext()) {
                intent2.addCategory(it.next());
            }
            z10 = true;
        }
        if (intent.getClipData() != null) {
            intent2.setClipData(intent.getClipData());
            z10 = true;
        }
        if (intent.getSourceBounds() != null) {
            intent2.setSourceBounds(intent.getSourceBounds());
            z10 = true;
        }
        if (bundle == null || bundle.isEmpty()) {
            z11 = z10;
        } else {
            intent2.putExtras(bundle);
        }
        if (z11) {
            return intent2;
        }
        return null;
    }

    public static Bundle c(Intent intent, int i10) {
        if (intent == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(b.c.f68604F, intent);
        bundle.putInt(b.c.f68605G, i10);
        return bundle;
    }

    public static Bundle d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.remove(b.c.f68624m);
        bundle.remove(b.c.f68628q);
        bundle.remove(b.c.f68602D);
        bundle.remove(b.c.f68618g);
        bundle.remove(b.c.f68605G);
        return bundle;
    }

    public static Intent e(Intent intent) {
        if (intent == null) {
            return null;
        }
        Intent intent2 = new Intent(intent);
        intent2.replaceExtras((Bundle) null);
        return intent2;
    }

    public static Intent f(Intent intent) {
        Bundle extras;
        if (intent == null || !g() || (extras = intent.getExtras()) == null || extras.isEmpty() || extras.containsKey(b.c.f68603E)) {
            return intent;
        }
        Intent intentE = e(intent);
        intentE.putExtra(b.c.f68603E, intent);
        extras.size();
        return intentE;
    }

    public static boolean g() {
        return !C3841e.D();
    }
}
