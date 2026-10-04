package gc;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import android.webkit.WebView;
import com.cookiegames.smartcookie.settings.fragment.GeneralSettingsFragment;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Iterator;
import org.apache.http.HttpHost;

/* JADX INFO: renamed from: gc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4470a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f202367a = "localhost";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f202368b = 8118;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202369c = 9050;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f202370d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f202371e = "OrbotHelpher";

    /* JADX INFO: renamed from: gc.a$a, reason: collision with other inner class name */
    public static class DialogInterfaceOnClickListenerC0741a implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f202372a;

        public DialogInterfaceOnClickListenerC0741a(Activity activity) {
            this.f202372a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            this.f202372a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:org.torproject.android")));
        }
    }

    public static Object a(Object obj, String str) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static Object b(Field field, Object obj) throws IllegalAccessException, IllegalArgumentException {
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        field.setAccessible(zIsAccessible);
        return obj2;
    }

    public static Object c(Context context) throws Exception {
        Object objG = g(Class.forName("android.webkit.Network"), "getInstance", new Object[]{context}, Context.class);
        if (objG != null) {
            return a(objG, "mRequestQueue");
        }
        return null;
    }

    public static Socket d(Context context) throws IOException {
        return e(context, "localhost", f202369c);
    }

    public static Socket e(Context context, String str, int i10) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(str, i10), 10000);
        return socket;
    }

    public static AlertDialog f(Activity activity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        Intent intent = new Intent("org.torproject.android.START_TOR");
        intent.addCategory("android.intent.category.DEFAULT");
        try {
            activity.startActivityForResult(intent, 0);
            return null;
        } catch (ActivityNotFoundException unused) {
            return w(activity, charSequence, charSequence2, charSequence3, charSequence4);
        }
    }

    public static Object g(Object obj, String str, Object[] objArr, Class... clsArr) throws Exception {
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        return clsArr != null ? cls.getMethod(str, clsArr).invoke(obj, objArr) : cls.getMethod(str, null).invoke(obj, null);
    }

    @TargetApi(19)
    public static boolean h(String str, Context context) {
        return p(str, context, null, 0);
    }

    @TargetApi(21)
    public static boolean i(String str, Context context) {
        return v(context, null, 0);
    }

    public static void j(String str, Context context) throws Exception {
        m();
        h(str, context);
    }

    public static void k(Context context) throws Exception {
        Object objC = c(context);
        if (objC != null) {
            o(objC, "mProxyHost", null);
        }
    }

    public static void l() throws Exception {
        try {
            Class<?> cls = Class.forName("android.webkit.WebViewCore");
            Class.forName("android.net.ProxyProperties");
            Method declaredMethod = cls.getDeclaredMethod("sendStaticMessage", Integer.TYPE, Object.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, 193, null);
            }
        } catch (Error e10) {
            Log.e("ProxySettings", "Exception setting WebKit proxy through android.webkit.Network: " + e10.toString());
            throw e10;
        } catch (Exception e11) {
            Log.e("ProxySettings", "Exception setting WebKit proxy through android.net.ProxyProperties: " + e11.toString());
            throw e11;
        }
    }

    public static void m() {
        System.setProperty("proxyHost", "");
        System.setProperty("proxyPort", "");
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        System.setProperty("https.proxyHost", "");
        System.setProperty("https.proxyPort", "");
        System.setProperty("socks.proxyHost", "");
        System.setProperty("socks.proxyPort", Integer.toString(f202369c));
        System.setProperty("socksProxyHost", "");
        System.setProperty("socksProxyPort", Integer.toString(f202369c));
    }

    public static boolean n(Context context, String str, int i10) {
        try {
            Constructor<?> constructor = Class.forName("android.net.ProxyProperties").getConstructor(String.class, Integer.TYPE, String.class);
            if (constructor != null) {
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(str, Integer.valueOf(i10), null);
                Intent intent = new Intent("android.intent.action.PROXY_CHANGE");
                intent.putExtra(GeneralSettingsFragment.f147946u, (Parcelable) objNewInstance);
                context.sendBroadcast(intent);
            }
        } catch (Error e10) {
            Log.e("ProxySettings", "Exception sending Intent ", e10);
        } catch (Exception e11) {
            Log.e("ProxySettings", "Exception sending Intent ", e11);
        }
        return false;
    }

    public static void o(Object obj, String str, Object obj2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    @TargetApi(19)
    public static boolean p(String str, Context context, String str2, int i10) {
        if (str2 != null) {
            System.setProperty("http.proxyHost", str2);
            System.setProperty("http.proxyPort", Integer.toString(i10));
            System.setProperty("https.proxyHost", str2);
            System.setProperty("https.proxyPort", Integer.toString(i10));
        }
        try {
            Field field = Class.forName(str).getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(context);
            Field declaredField = Class.forName("android.app.LoadedApk").getDeclaredField("mReceivers");
            declaredField.setAccessible(true);
            Iterator it = ((ArrayMap) declaredField.get(obj)).values().iterator();
            while (it.hasNext()) {
                for (Object obj2 : ((ArrayMap) it.next()).keySet()) {
                    Class<?> cls = obj2.getClass();
                    if (cls.getName().contains("ProxyChangeListener")) {
                        Method declaredMethod = cls.getDeclaredMethod("onReceive", Context.class, Intent.class);
                        Intent intent = new Intent("android.intent.action.PROXY_CHANGE");
                        if (str2 != null) {
                            Constructor<?> constructor = Class.forName("android.net.ProxyProperties").getConstructor(String.class, Integer.TYPE, String.class);
                            constructor.setAccessible(true);
                            intent.putExtra(GeneralSettingsFragment.f147946u, (Parcelable) constructor.newInstance(str2, Integer.valueOf(i10), null));
                        }
                        declaredMethod.invoke(obj2, context, intent);
                    }
                }
            }
            return true;
        } catch (ClassNotFoundException e10) {
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            Log.v(f202371e, e10.getMessage());
            Log.v(f202371e, string);
            return false;
        } catch (IllegalAccessException e11) {
            StringWriter stringWriter2 = new StringWriter();
            e11.printStackTrace(new PrintWriter(stringWriter2));
            String string2 = stringWriter2.toString();
            Log.v(f202371e, e11.getMessage());
            Log.v(f202371e, string2);
            return false;
        } catch (IllegalArgumentException e12) {
            StringWriter stringWriter3 = new StringWriter();
            e12.printStackTrace(new PrintWriter(stringWriter3));
            String string3 = stringWriter3.toString();
            Log.v(f202371e, e12.getMessage());
            Log.v(f202371e, string3);
            return false;
        } catch (InstantiationException e13) {
            StringWriter stringWriter4 = new StringWriter();
            e13.printStackTrace(new PrintWriter(stringWriter4));
            String string4 = stringWriter4.toString();
            Log.v(f202371e, e13.getMessage());
            Log.v(f202371e, string4);
            return false;
        } catch (NoSuchFieldException e14) {
            StringWriter stringWriter5 = new StringWriter();
            e14.printStackTrace(new PrintWriter(stringWriter5));
            String string5 = stringWriter5.toString();
            Log.v(f202371e, e14.getMessage());
            Log.v(f202371e, string5);
            return false;
        } catch (NoSuchMethodException e15) {
            StringWriter stringWriter6 = new StringWriter();
            e15.printStackTrace(new PrintWriter(stringWriter6));
            String string6 = stringWriter6.toString();
            Log.v(f202371e, e15.getMessage());
            Log.v(f202371e, string6);
            return false;
        } catch (InvocationTargetException e16) {
            StringWriter stringWriter7 = new StringWriter();
            e16.printStackTrace(new PrintWriter(stringWriter7));
            String string7 = stringWriter7.toString();
            Log.v(f202371e, e16.getMessage());
            Log.v(f202371e, string7);
            return false;
        }
    }

    public static boolean q(String str, Context context, WebView webView, String str2, int i10) throws Exception {
        s(str2, i10);
        return v(context, str2, i10);
    }

    public static boolean r(WebView webView, String str, int i10) {
        Log.d(f202371e, "Setting proxy with <= 3.2 API.");
        HttpHost httpHost = new HttpHost(str, i10);
        try {
            Class<?> cls = Class.forName("android.webkit.Network");
            Method method = cls.getMethod("getInstance", Context.class);
            if (method == null) {
                Log.e(f202371e, "failed to get getInstance method");
            }
            Object objInvoke = method.invoke(cls, webView.getContext());
            if (objInvoke == null) {
                Log.e(f202371e, "error getting network: network is null");
                return false;
            }
            try {
                Object objB = b(cls.getDeclaredField("mRequestQueue"), objInvoke);
                if (objB == null) {
                    Log.e(f202371e, "Request queue is null");
                    return false;
                }
                try {
                    Field declaredField = Class.forName("android.net.http.RequestQueue").getDeclaredField("mProxyHost");
                    boolean zIsAccessible = declaredField.isAccessible();
                    try {
                        try {
                            declaredField.setAccessible(true);
                            declaredField.set(objB, httpHost);
                        } catch (Exception unused) {
                            Log.e(f202371e, "error setting proxy host");
                        }
                        Log.d(f202371e, "Setting proxy with <= 3.2 API successful!");
                        return true;
                    } finally {
                        declaredField.setAccessible(zIsAccessible);
                    }
                } catch (Exception unused2) {
                    Log.e(f202371e, "error getting proxy host field");
                    return false;
                }
            } catch (Exception unused3) {
                Log.e(f202371e, "error getting field value");
                return false;
            }
        } catch (Exception e10) {
            Log.e(f202371e, "error getting network: " + e10);
            return false;
        }
    }

    public static void s(String str, int i10) {
        System.setProperty("proxyHost", str);
        System.setProperty("proxyPort", Integer.toString(i10));
        System.setProperty("http.proxyHost", str);
        System.setProperty("http.proxyPort", Integer.toString(i10));
        System.setProperty("https.proxyHost", str);
        System.setProperty("https.proxyPort", Integer.toString(i10));
        System.setProperty("socks.proxyHost", str);
        System.setProperty("socks.proxyPort", Integer.toString(f202369c));
        System.setProperty("socksProxyHost", str);
        System.setProperty("socksProxyPort", Integer.toString(f202369c));
    }

    public static boolean t(Context context, String str, int i10) throws Exception {
        Object objC = c(context);
        if (objC == null) {
            return false;
        }
        o(objC, "mProxyHost", new HttpHost(str, i10, "http"));
        return true;
    }

    public static boolean u(Context context, String str, int i10) {
        try {
            Class<?> cls = Class.forName("android.webkit.WebViewCore");
            Class<?> cls2 = Class.forName("android.net.ProxyProperties");
            Class<?> cls3 = Integer.TYPE;
            Method declaredMethod = cls.getDeclaredMethod("sendStaticMessage", cls3, Object.class);
            Constructor<?> constructor = cls2.getConstructor(String.class, cls3, String.class);
            if (declaredMethod != null && constructor != null) {
                declaredMethod.setAccessible(true);
                constructor.setAccessible(true);
                declaredMethod.invoke(null, 193, constructor.newInstance(str, Integer.valueOf(i10), null));
                return true;
            }
        } catch (Error e10) {
            Log.e("ProxySettings", "Exception setting WebKit proxy through android.webkit.Network: " + e10.toString());
        } catch (Exception e11) {
            Log.e("ProxySettings", "Exception setting WebKit proxy through android.net.ProxyProperties: " + e11.toString());
        }
        return false;
    }

    @TargetApi(21)
    public static boolean v(Context context, String str, int i10) {
        System.setProperty("http.proxyHost", str);
        System.setProperty("http.proxyPort", Integer.toString(i10));
        System.setProperty("https.proxyHost", str);
        System.setProperty("https.proxyPort", Integer.toString(i10));
        try {
            Field declaredField = Class.forName("android.app.Application").getDeclaredField("mLoadedApk");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(context);
            Field declaredField2 = Class.forName("android.app.LoadedApk").getDeclaredField("mReceivers");
            declaredField2.setAccessible(true);
            Iterator it = ((ArrayMap) declaredField2.get(obj)).values().iterator();
            while (it.hasNext()) {
                for (Object obj2 : ((ArrayMap) it.next()).keySet()) {
                    Class<?> cls = obj2.getClass();
                    if (cls.getName().contains("ProxyChangeListener")) {
                        cls.getDeclaredMethod("onReceive", Context.class, Intent.class).invoke(obj2, context, new Intent("android.intent.action.PROXY_CHANGE"));
                    }
                }
            }
            return true;
        } catch (ClassNotFoundException e10) {
            Log.d("ProxySettings", "Exception setting WebKit proxy on Lollipop through ProxyChangeListener: " + e10.toString());
            return false;
        } catch (IllegalAccessException e11) {
            Log.d("ProxySettings", "Exception setting WebKit proxy on Lollipop through ProxyChangeListener: " + e11.toString());
            return false;
        } catch (NoSuchFieldException e12) {
            Log.d("ProxySettings", "Exception setting WebKit proxy on Lollipop through ProxyChangeListener: " + e12.toString());
            return false;
        } catch (NoSuchMethodException e13) {
            Log.d("ProxySettings", "Exception setting WebKit proxy on Lollipop through ProxyChangeListener: " + e13.toString());
            return false;
        } catch (InvocationTargetException e14) {
            Log.d("ProxySettings", "Exception setting WebKit proxy on Lollipop through ProxyChangeListener: " + e14.toString());
            return false;
        }
    }

    public static AlertDialog w(Activity activity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(charSequence);
        builder.setMessage(charSequence2);
        builder.setPositiveButton(charSequence3, new DialogInterfaceOnClickListenerC0741a(activity));
        builder.setNegativeButton(charSequence4, new b());
        return builder.show();
    }

    /* JADX INFO: renamed from: gc.a$b */
    public static class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
        }
    }
}
