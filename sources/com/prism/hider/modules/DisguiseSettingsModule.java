package com.prism.hider.modules;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.app.hider.master.promax.R;
import com.prism.commons.utils.h0;
import com.prism.hider.module.commons.ResLauncherModule;
import com.prism.hider.ui.GuideSetupPinActivity;
import com.prism.hider.variant.b;
import da.DialogInterfaceOnClickListenerC4308c;

/* JADX INFO: loaded from: classes6.dex */
public class DisguiseSettingsModule extends ResLauncherModule {
    public DisguiseSettingsModule(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showProtectOnDialog$0(Activity activity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        unprotect(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showProtectOnDialog$1(Activity activity, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        onResetPinButtonClick(activity);
    }

    private void onResetPinButtonClick(Activity activity) {
        b.b().a(activity, true);
    }

    private void showProtectOnDialog(final Activity activity) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setIcon(0).setTitle(activity.getString(R.string.protect_on_dialog_head_text)).setMessage(activity.getString(R.string.protect_on_dialog_mesg_text)).setNegativeButton(activity.getString(R.string.protect_on_dialog_unprotect), new DialogInterface.OnClickListener() { // from class: da.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f194901a.lambda$showProtectOnDialog$0(activity, dialogInterface, i10);
            }
        }).setNeutralButton(activity.getString(R.string.protect_on_dialog_reset), new DialogInterface.OnClickListener() { // from class: da.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f194903a.lambda$showProtectOnDialog$1(activity, dialogInterface, i10);
            }
        }).setPositiveButton(activity.getString(R.string.protect_on_dialog_cancel), new DialogInterfaceOnClickListenerC4308c()).create();
        alertDialogCreate.show();
        h0.a(activity, alertDialogCreate);
    }

    private void unprotect(Activity activity) {
        b.b().k(activity);
    }

    @Override // com.prism.hider.module.commons.ResLauncherModule
    public int getIconResId() {
        return R.drawable.hider_ic_module_disguise_settings;
    }

    @Override // com.prism.hider.module.commons.ResLauncherModule
    public int getNameResId() {
        return R.string.module_name_disguise_settings;
    }

    @Override // ca.d
    public void onLaunch(Activity activity) {
        if (b.b().e(activity)) {
            showProtectOnDialog(activity);
        } else {
            activity.startActivity(new Intent(activity, (Class<?>) GuideSetupPinActivity.class));
        }
    }
}
