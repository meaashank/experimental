package b5;

import N4.l;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

/* JADX INFO: renamed from: b5.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ProgressDialogC2832y0 extends ProgressDialog {
    public ProgressDialogC2832y0(Context context) {
        super(context);
    }

    public final void a(Context context) {
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setContentView(l.k.f62655c1);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(getContext());
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }

    public ProgressDialogC2832y0(Context context, int i10) {
        super(context, i10);
    }
}
