package com.android.launcher3.allapps;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Process;
import android.os.UserHandle;
import android.util.AttributeSet;
import android.widget.Switch;
import com.android.launcher3.compat.UserManagerCompat;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class WorkModeSwitch extends Switch {
    public WorkModeSwitch(Context context) {
        super(context);
    }

    private void setCheckedInternal(boolean z10) {
        super.setChecked(z10);
    }

    private void trySetQuietModeEnabledToAllProfilesAsync(final boolean z10) {
        new AsyncTask<Void, Void, Boolean>() { // from class: com.android.launcher3.allapps.WorkModeSwitch.1
            @Override // android.os.AsyncTask
            public void onPreExecute() {
                super.onPreExecute();
                WorkModeSwitch.this.setEnabled(false);
            }

            @Override // android.os.AsyncTask
            public Boolean doInBackground(Void... voidArr) {
                Iterator<UserHandle> it = UserManagerCompat.getInstance(WorkModeSwitch.this.getContext()).getUserProfiles().iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    if (!Process.myUserHandle().equals(it.next())) {
                        z11 |= !r5.requestQuietModeEnabled(z10, r2);
                    }
                }
                return Boolean.valueOf(z11);
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Boolean bool) {
                if (bool.booleanValue()) {
                    WorkModeSwitch.this.setEnabled(true);
                }
            }
        }.execute(new Void[0]);
    }

    public void refresh() {
        setCheckedInternal(!UserManagerCompat.getInstance(getContext()).isAnyProfileQuietModeEnabled());
        setEnabled(true);
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
    }

    @Override // android.widget.Switch, android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        trySetQuietModeEnabledToAllProfilesAsync(isChecked());
    }

    public WorkModeSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WorkModeSwitch(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
