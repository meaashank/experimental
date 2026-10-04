package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.mbsignalcommon.mapping.b;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class h implements b, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Pattern f157638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f157639b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f157641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f157642e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f157640c = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Handler f157643f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.f157641d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f157642e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f157642e, str);
        if (aVarA != null) {
            aVarA.f157612b = this.f157642e;
            return aVarA;
        }
        Matcher matcher = this.f157638a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f157616f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f157614d = matcher.group(1);
                aVar.f157617g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f157615e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f157513k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f157615e = com.mbridge.msdk.mbsignalcommon.base.e.f157513k.get(aVar.f157615e);
                }
                aVar.f157612b = this.f157642e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.f157639b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = aVar.f157613c;
                b.C0595b c0595b = aVar.f157611a;
                if (c0595b != null && obj != null) {
                    c0595b.a(obj, aVar, TextUtils.isEmpty(aVar.f157616f) ? Ib.b.f53002g : aVar.f157616f);
                }
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    public void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f157612b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f157614d);
        if (jsObject == null) {
            return;
        }
        try {
            b.C0595b c0595bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f157641d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f157615e, Object.class, String.class);
            c0595bA.a();
            if (jsObject instanceof g) {
                aVar.f157611a = c0595bA;
                aVar.f157613c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f157643f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f157638a = pattern;
    }
}
