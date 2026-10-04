package com.prism.hider.ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC1486c;
import com.app.hider.master.promax.R;
import com.prism.commons.utils.C3856u;

/* JADX INFO: loaded from: classes6.dex */
public class GuideSetupPinActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167970a = "GuideSetupPinActivity";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(View view) {
        com.prism.hider.variant.b.b().a(this, false);
        finish();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.activity.k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.prism.commons.utils.H.a(this);
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.prism.commons.utils.H.a(this);
        C3856u.a(this, true);
        setContentView(R.layout.hider_activity_guide_pin);
        com.prism.commons.utils.f0.c(findViewById(R.id.guide_pin_root), true, true);
        ((TextView) findViewById(R.id.tv_to)).setText(com.prism.hider.variant.b.b().c(this).getMeta().getNameResId());
        View viewFindViewById = findViewById(R.id.tv_setup);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.prism.hider.ui.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f167862a.V0(view);
                }
            });
        }
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
