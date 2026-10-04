package E9;

import U6.b;
import a7.f;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.prism.gaia.client.stub.GuestPendingActivityProxy;
import com.prism.gaia.helper.utils.ComponentUtils;
import com.prism.gaia.naked.compat.android.content.IntentFilterCompat2;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f33332a = "asdf-".concat(a.class.getSimpleName());

    public static void a(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            String strReplaceFirst = action.replaceFirst(U6.c.f68689W, "");
            if (TextUtils.isEmpty(strReplaceFirst)) {
                strReplaceFirst = null;
            }
            intent.setAction(strReplaceFirst);
        }
    }

    public static void b(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        intent.setAction(U6.c.f68689W.concat(action));
    }

    public static String c(String str, String str2) {
        return U6.c.f68691Y + ComponentUtils.h(str, str2);
    }

    public static boolean d(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        return component.getClassName().equals(GuestPendingActivityProxy.class.getCanonicalName());
    }

    public static boolean e(Intent intent) {
        String action = intent.getAction();
        return action != null && action.startsWith(U6.c.f68689W);
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith(U6.c.f68690X)) {
            if (f.f(str)) {
                return null;
            }
            if (!f.f84786h.contains(str)) {
                return U6.c.f68690X.concat(str);
            }
        }
        return str;
    }

    public static void g(IntentFilter intentFilter) {
        if (intentFilter != null) {
            List<String> actions = IntentFilterCompat2.Util.getActions(intentFilter);
            ListIterator<String> listIterator = actions.listIterator();
            while (listIterator.hasNext()) {
                String next = listIterator.next();
                String strF = f(next);
                if (strF == null) {
                    listIterator.remove();
                } else if (!strF.equals(next)) {
                    listIterator.set(strF);
                }
            }
            IntentFilterCompat2.Util.setActions(intentFilter, actions);
        }
    }

    public static boolean h(Intent intent) {
        String action = intent.getAction();
        String strF = f(action);
        if (strF == null) {
            return false;
        }
        if (strF.equals(action)) {
            return true;
        }
        intent.setAction(strF);
        return true;
    }

    public static Intent i(Intent intent, int i10) {
        Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setComponent(null);
        intentCloneFilter.setPackage(null);
        ComponentName component = intent.getComponent();
        String str = intent.getPackage();
        if (component != null) {
            intentCloneFilter.setAction(c(component.getPackageName(), component.getClassName()));
            intentCloneFilter.putExtra(b.c.f68635x, component);
            intentCloneFilter.putExtra(b.c.f68627p, component.getPackageName());
        } else {
            if (str != null) {
                intentCloneFilter.putExtra(b.c.f68627p, str);
            }
            intentCloneFilter.setAction(intent.getAction());
            if (!h(intentCloneFilter)) {
                return null;
            }
        }
        intentCloneFilter.putExtra(b.c.f68618g, i10);
        intentCloneFilter.putExtra(b.c.f68628q, new Intent(intent));
        return intentCloneFilter;
    }

    public static IntentFilter[] j(IntentFilter intentFilter) {
        if (intentFilter == null) {
            return new IntentFilter[]{null, null};
        }
        IntentFilter[] intentFilterArr = new IntentFilter[2];
        List<String> actions = IntentFilterCompat2.Util.getActions(intentFilter);
        LinkedList linkedList = new LinkedList();
        ListIterator<String> listIterator = actions.listIterator();
        boolean z10 = false;
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            if (f.g(next) || f.f84787i.contains(next)) {
                z10 = true;
            } else {
                listIterator.remove();
                linkedList.add(next);
            }
        }
        IntentFilterCompat2.Util.setActions(intentFilter, actions);
        if (z10) {
            intentFilterArr[0] = intentFilter;
        } else {
            intentFilterArr[0] = null;
        }
        if (linkedList.size() <= 0) {
            intentFilterArr[1] = null;
            return intentFilterArr;
        }
        IntentFilter intentFilter2 = new IntentFilter(intentFilter);
        intentFilterArr[1] = intentFilter2;
        IntentFilterCompat2.Util.setActions(intentFilter2, linkedList);
        return intentFilterArr;
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        return !str.startsWith(U6.c.f68690X) ? str : str.substring(42);
    }

    public static void l(Intent intent) {
        String action = intent.getAction();
        String strK = k(action);
        if (strK == null || strK.equals(action)) {
            return;
        }
        intent.setAction(strK);
    }

    public static Intent m(Intent intent) {
        Intent intent2 = new Intent();
        intent2.putExtra(b.c.f68628q, intent);
        return intent2;
    }
}
