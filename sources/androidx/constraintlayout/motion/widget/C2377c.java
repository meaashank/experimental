package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.d;
import com.bumptech.glide.load.engine.GlideException;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import com.mbridge.msdk.MBridgeConstans;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"LogConditional"})
public class C2377c {
    public static void a(ViewGroup.LayoutParams param, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ") " + str + GlideException.a.f139488d;
        PrintStream printStream = System.out;
        StringBuilder sbA = androidx.activity.result.i.a(" >>>>>>>>>>>>>>>>>>. dump ", str2, GlideException.a.f139488d);
        sbA.append(param.getClass().getName());
        printStream.println(sbA.toString());
        for (Field field : param.getClass().getFields()) {
            try {
                Object obj = field.get(param);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + d.f.f108204o + name + C4.q.f17581a + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }

    public static void b(ViewGroup layout, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ") " + str + GlideException.a.f139488d;
        int childCount = layout.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = layout.getChildAt(i10);
            PrintStream printStream = System.out;
            StringBuilder sbA = android.support.v4.media.f.a(str2, "     ");
            sbA.append(k(childAt));
            printStream.println(sbA.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + d.f.f108204o + field.getName() + C4.q.f17581a + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void c(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder sbA = android.support.v4.media.f.a(str, "------------- ");
        sbA.append(cls.getName());
        sbA.append(" --------------------");
        printStream.println(sbA.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + TextProcessor.f150538k0 + field.getName() + C4.q.f17581a + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder sbA2 = android.support.v4.media.f.a(str, "------------- ");
        sbA2.append(cls.getSimpleName());
        sbA2.append(" --------------------");
        printStream2.println(sbA2.toString());
    }

    public static String d(MotionEvent event) {
        int action = event.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String e(int n10) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[n10 + 2];
        return ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ")";
    }

    public static String f() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String g() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ")";
    }

    public static String h() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTraceElement.getLineNumber() + ")";
    }

    public static String i(Context context, int id2) {
        if (id2 == -1) {
            return com.prism.lib_google_billing.q.f194113a;
        }
        try {
            return context.getResources().getResourceEntryName(id2);
        } catch (Exception unused) {
            return android.support.v4.media.c.a("?", id2);
        }
    }

    public static String j(Context context, int[] id2) {
        String resourceEntryName;
        try {
            String str = id2.length + "[";
            int i10 = 0;
            while (i10 < id2.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i10 == 0 ? "" : C4.q.f17581a);
                String string = sb2.toString();
                try {
                    resourceEntryName = context.getResources().getResourceEntryName(id2[i10]);
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = "? " + id2[i10] + C4.q.f17581a;
                }
                str = string + resourceEntryName;
                i10++;
            }
            return str + "]";
        } catch (Exception e10) {
            Log.v("DEBUG", e10.toString());
            return com.prism.lib_google_billing.q.f194113a;
        }
    }

    public static String k(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return com.prism.lib_google_billing.q.f194113a;
        }
    }

    public static String l(MotionLayout layout, int stateId) {
        return m(layout, stateId, -1);
    }

    public static String m(MotionLayout layout, int stateId, int len) {
        int length;
        if (stateId == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = layout.getContext().getResources().getResourceEntryName(stateId);
        if (len == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > len) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= len || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - len) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    public static void n(String tag, String msg, int n10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(n10, stackTrace.length - 1);
        String strA = C4.q.f17581a;
        for (int i10 = 1; i10 <= iMin; i10++) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            String str = ".(" + stackTrace[i10].getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTrace[i10].getLineNumber() + ") " + stackTrace[i10].getMethodName();
            strA = androidx.compose.runtime.changelist.j.a(strA, C4.q.f17581a);
            Log.v(tag, msg + strA + str + strA);
        }
    }

    public static void o(String msg, int n10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(n10, stackTrace.length - 1);
        String strA = C4.q.f17581a;
        for (int i10 = 1; i10 <= iMin; i10++) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            String str = ".(" + stackTrace[i10].getFileName() + com.prism.gaia.server.accounts.b.f166434b0 + stackTrace[i10].getLineNumber() + ") ";
            strA = androidx.compose.runtime.changelist.j.a(strA, C4.q.f17581a);
            System.out.println(msg + strA + str + strA);
        }
    }
}
