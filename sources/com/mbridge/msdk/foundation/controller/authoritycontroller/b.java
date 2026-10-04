package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f155962h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f155963i = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AuthorityInfoBean f155965b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f155970g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f155964a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f155966c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f155967d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f155968e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f155969f = "";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f155971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnCompletionListener f155972b;

        public a(Context context, OnCompletionListener onCompletionListener) {
            this.f155971a = context;
            this.f155972b = onCompletionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f155971a);
            this.f155972b.onCompletion();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$b, reason: collision with other inner class name */
    public class C0562b implements e.a {
        public C0562b() {
        }

        @Override // com.mbridge.msdk.foundation.controller.e.a
        public void a() {
            b.this.k();
        }
    }

    public b() {
        h();
    }

    public static void b(boolean z10) {
        f155963i = z10;
    }

    public static boolean i() {
        return f155962h;
    }

    public static boolean j() {
        return f155963i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void k() {
        boolean zC = this.f155970g.c();
        b(this.f155970g.b());
        d(zC ? 1 : 2);
        this.f155965b.authDeviceIdStatus(zC ? 1 : 0);
    }

    public abstract int a(g gVar, String str);

    public int c() {
        return this.f155967d;
    }

    public int d() {
        return this.f155968e;
    }

    public int e() {
        return this.f155966c;
    }

    public String f() {
        return this.f155969f;
    }

    public String g() {
        JSONArray jSONArray = new JSONArray();
        g gVarC = i.b().c();
        for (int i10 = 0; i10 < this.f155964a.size(); i10++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f155964a.get(i10)));
                jSONObject.put("client_status", a(this.f155964a.get(i10)));
                jSONObject.put("server_status", a(gVarC, this.f155964a.get(i10)));
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public void h() {
        AuthorityInfoBean authorityInfoBean = new AuthorityInfoBean();
        this.f155965b = authorityInfoBean;
        try {
            authorityInfoBean.authGenDataStatus(1);
            this.f155965b.authDeviceIdStatus(1);
            this.f155965b.authSerialIdStatus(1);
            this.f155965b.authOtherDataStatus(1);
            this.f155964a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f155964a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f155964a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f155964a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
        }
    }

    private void d(int i10) {
        this.f155966c = i10 != 1 ? 2 : 1;
    }

    public boolean b() {
        int i10 = this.f155966c;
        return i10 == 1 || i10 == 3;
    }

    public void c(int i10) {
        this.f155968e = i10;
    }

    public static void a(boolean z10) {
        f155962h = z10;
    }

    public void b(int i10) {
        this.f155967d = i10;
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f155969f = str;
    }

    public AuthorityInfoBean a() {
        AuthorityInfoBean authorityInfoBean = this.f155965b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public void a(int i10) {
        this.f155966c = i10 != 1 ? 2 : 1;
        if (this.f155965b != null) {
            d(i10);
        }
    }

    public void a(Context context, OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, onCompletionListener));
        } else {
            a(context);
        }
    }

    public int a(String str) {
        AuthorityInfoBean authorityInfoBean;
        try {
            if (TextUtils.isEmpty(str) || (authorityInfoBean = this.f155965b) == null) {
                return 0;
            }
            return authorityInfoBean.getStatusByKey(str);
        } catch (Exception e10) {
            q0.b("SDKAuthorityController", e10.getMessage());
            return 0;
        }
    }

    public void a(String str, int i10) {
        if (TextUtils.isEmpty(str) || this.f155965b == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "authority_serial_id":
                this.f155965b.authSerialIdStatus(i10);
                break;
            case "authority_all_info":
                this.f155965b.a(i10);
                break;
            case "authority_device_id":
                this.f155965b.authDeviceIdStatus(i10);
                break;
            case "authority_general_data":
                this.f155965b.authGenDataStatus(i10);
                break;
            case "authority_other":
                this.f155965b.authOtherDataStatus(i10);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f155970g == null) {
                e eVar = new e(context);
                this.f155970g = eVar;
                eVar.a(new C0562b());
            }
            k();
        } catch (Throwable th) {
            q0.b("SDKAuthorityController", th.getMessage());
        }
    }
}
