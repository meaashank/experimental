package com.prism.gaia.client.stub;

import U6.o;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MiuiPermissionDeclareActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f164353b = "MiuiPermissionDeclare";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f164354c = "miui.intent.action.SYSTEM_PERMISSION_DECLARE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f164355d = "miui.intent.action.SYSTEM_PERMISSION_DECLARE_NEW";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f164356e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f164357f = 666;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f164358a;

    public static boolean g(Intent intent) {
        String action = intent.getAction();
        return f164354c.equals(action) || f164355d.equals(action);
    }

    public static void k(String str, Intent intent) {
        intent.setAction(null);
        intent.setPackage(null);
        intent.setComponent(new ComponentName(str, MiuiPermissionDeclareActivity.class.getName()));
    }

    public static List<String> l(Intent intent, String str) {
        Object obj = intent.getExtras() == null ? null : intent.getExtras().get(str);
        if (obj instanceof String[]) {
            return Arrays.asList((String[]) obj);
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 != null) {
                    arrayList.add(obj2.toString());
                }
            }
        }
        return arrayList;
    }

    public final void d(int i10) {
        if (this.f164358a) {
            return;
        }
        this.f164358a = true;
        setResult(i10);
        finish();
    }

    public final void e(StringBuilder sb2, String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith(R3.a.f67726d) || str.startsWith(R3.a.f67725c)) {
            sb2.append("<br><br><a href=\"");
            sb2.append(Html.escapeHtml(str));
            sb2.append("\">");
            sb2.append(Html.escapeHtml(getString(i10)));
            sb2.append("</a>");
        }
    }

    public final String f(Intent intent) {
        StringBuilder sb2 = new StringBuilder();
        String stringExtra = intent.getStringExtra("all_purpose");
        if (!TextUtils.isEmpty(stringExtra)) {
            sb2.append(Html.escapeHtml(stringExtra));
        }
        List<String> listL = l(intent, "runtime_perm_desc");
        if (!listL.isEmpty()) {
            sb2.append("<br><br>");
            sb2.append(Html.escapeHtml(getString(o.n.f72240m0)));
            for (String str : listL) {
                sb2.append("<br>• ");
                sb2.append(Html.escapeHtml(str));
            }
        }
        e(sb2, intent.getStringExtra("user_agreement"), o.n.f72234l0);
        e(sb2, intent.getStringExtra("privacy_policy"), o.n.f72246n0);
        return sb2.toString();
    }

    public final /* synthetic */ void h(DialogInterface dialogInterface, int i10) {
        d(1);
    }

    public final /* synthetic */ void i(DialogInterface dialogInterface, int i10) {
        d(666);
    }

    public final /* synthetic */ void j(DialogInterface dialogInterface) {
        d(0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(PermissionListActivity.f164366k);
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = intent.getStringExtra(com.prism.gaia.helper.compat.a.f164963d);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, (getResources().getConfiguration().uiMode & 48) == 32 ? R.style.Theme.DeviceDefault.Dialog.Alert : R.style.Theme.DeviceDefault.Light.Dialog.Alert);
        Context context = builder.getContext();
        TextView textView = new TextView(context);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        textView.setPadding(iApplyDimension, iApplyDimension / 2, iApplyDimension, 0);
        textView.setText(Html.fromHtml(f(intent)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(textView);
        builder.setTitle(getString(o.n.f72258p0, stringExtra)).setView(scrollView).setPositiveButton(o.n.f72228k0, new DialogInterface.OnClickListener() { // from class: com.prism.gaia.client.stub.u
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f164505a.d(1);
            }
        }).setNegativeButton(o.n.f72252o0, new DialogInterface.OnClickListener() { // from class: com.prism.gaia.client.stub.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f164506a.i(dialogInterface, i10);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.prism.gaia.client.stub.w
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f164507a.d(0);
            }
        }).show();
    }
}
