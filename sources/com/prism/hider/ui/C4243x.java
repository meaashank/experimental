package com.prism.hider.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2573k;
import com.app.hider.master.promax.R;
import com.prism.gaia.utils.GaiaPreferenceUtils;

/* JADX INFO: renamed from: com.prism.hider.ui.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C4243x extends DialogInterfaceOnCancelListenerC2573k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f168309e = com.prism.commons.utils.l0.b(C4243x.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final RadioGroup.LayoutParams f168310f = new RadioGroup.LayoutParams(-1, -2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f168311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f168312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f168313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioGroup f168314d;

    /* JADX INFO: renamed from: com.prism.hider.ui.x$a */
    public interface a {
        void a();
    }

    /* JADX INFO: renamed from: com.prism.hider.ui.x$b */
    @SuppressLint({"AppCompatCustomView"})
    public static class b extends RadioButton {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f168315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f168316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f168317c;

        public b(Context context, int i10, String str, a aVar) {
            super(context);
            this.f168315a = i10;
            this.f168316b = str;
            this.f168317c = aVar;
        }

        public void a(RadioGroup radioGroup) {
            setId(this.f168315a);
            setText(this.f168316b);
            setTextSize(16.0f);
            setPadding(0, 16, 0, 16);
            radioGroup.addView(this, C4243x.f168310f);
        }

        public void b() {
            this.f168317c.a();
        }
    }

    public C4243x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        ((r6.k) GaiaPreferenceUtils.f167738f.a(this.f168311a)).p(1);
        dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2573k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2573k, androidx.fragment.app.Fragment
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2132083021);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    @org.jetbrains.annotations.Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup viewGroup, @Nullable @org.jetbrains.annotations.Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_data_recovery, viewGroup, false);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_resolutions);
        this.f168314d = radioGroup;
        this.f168312b.a(radioGroup);
        this.f168313c.a(this.f168314d);
        ((TextView) viewInflate.findViewById(R.id.tv_agree)).setOnClickListener(new View.OnClickListener() { // from class: com.prism.hider.ui.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168298a.v(view);
            }
        });
        return viewInflate;
    }

    public final /* synthetic */ void u() {
        ((r6.k) GaiaPreferenceUtils.f167738f.a(this.f168311a)).p(2);
        dismiss();
    }

    public final /* synthetic */ void v(View view) {
        b bVar = (b) this.f168314d.findViewById(this.f168314d.getCheckedRadioButtonId());
        if (bVar != null) {
            bVar.b();
        }
    }

    public final /* synthetic */ void w(DialogInterface dialogInterface, int i10) {
    }

    public final void x() {
    }

    public final void y() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f168311a);
        builder.setTitle("Permission required");
        builder.setMessage("Grand permission of device storage permission to use old version data");
        builder.setPositiveButton(R.string.to_grant, new DialogInterface.OnClickListener() { // from class: com.prism.hider.ui.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f168300a.getClass();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC4237u());
    }

    public C4243x(Context context) {
        this.f168311a = context;
        this.f168312b = new b(this.f168311a, 1, context.getString(R.string.recovery_data_choice_use_sdcard_root_virtual), new a() { // from class: com.prism.hider.ui.v
            @Override // com.prism.hider.ui.C4243x.a
            public final void a() {
                this.f168304a.t();
            }
        });
        this.f168313c = new b(this.f168311a, 2, context.getString(R.string.recovery_data_choice_use_sdcard_android_data_virtual), new a() { // from class: com.prism.hider.ui.w
            @Override // com.prism.hider.ui.C4243x.a
            public final void a() {
                this.f168306a.u();
            }
        });
        int iIntValue = ((Integer) ((r6.k) GaiaPreferenceUtils.f167738f.a(context)).o()).intValue();
        if (iIntValue == 1) {
            this.f168312b.setChecked(true);
            return;
        }
        if (iIntValue == 2) {
            this.f168313c.setChecked(true);
        }
        this.f168312b.setChecked(true);
    }
}
